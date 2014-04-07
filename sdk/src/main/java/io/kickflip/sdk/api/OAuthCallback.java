package io.kickflip.sdk.api;

import com.google.api.client.http.HttpRequestFactory;

/**
 * Created by davidbrodsky on 1/14/14.
 */
public interface OAuthCallback {
    public void onSuccess(HttpRequestFactory oauthRequestFactory);
    public void onFailure(Exception e);
}
