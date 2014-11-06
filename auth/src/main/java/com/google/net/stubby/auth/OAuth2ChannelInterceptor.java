package com.google.net.stubby.auth;

import com.google.api.client.auth.oauth2.Credential;
import com.google.net.stubby.Call;
import com.google.net.stubby.Channel;
import com.google.net.stubby.ClientInterceptor;
import com.google.net.stubby.ClientInterceptors.ForwardingCall;
import com.google.net.stubby.Metadata;
import com.google.net.stubby.MethodDescriptor;

import java.util.concurrent.Executor;

import javax.inject.Provider;

/** Client interceptor that authenticates all calls with OAuth2. */
public class OAuth2ChannelInterceptor implements ClientInterceptor {
  private static final Metadata.Key<String> AUTHORIZATION =
      Metadata.Key.of("Authorization", Metadata.STRING_MARSHALLER);

  private final OAuth2AccessTokenProvider accessTokenProvider;
  private final Provider<String> authorizationHeaderProvider
      = new Provider<String>() {
        @Override
        public String get() {
          return "Bearer " + accessTokenProvider.get();
        }
      };

  public OAuth2ChannelInterceptor(Credential credential, Executor executor) {
    this.accessTokenProvider = new OAuth2AccessTokenProvider(credential, executor);
  }

  @Override
  public <ReqT, RespT> Call<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
      Channel next) {
    // TODO(user): If the call fails for Auth reasons, this does not properly propagate info that
    // would be in WWW-Authenticate, because it does not yet have access to the header.
    return new ForwardingCall<ReqT, RespT>(next.newCall(method)) {
      @Override
      public void start(Listener<RespT> responseListener, Metadata.Headers headers) {
        headers.put(AUTHORIZATION, authorizationHeaderProvider.get());
        super.start(responseListener, headers);
      }
    };
  }
}
