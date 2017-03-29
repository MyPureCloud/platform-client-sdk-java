package com.mypurecloud.sdk.v2;

public interface AsyncApiCallback<T> {
    void onCompleted(T response);
    void onFailed(Throwable exception);
}
