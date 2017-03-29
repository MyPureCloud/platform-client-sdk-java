package com.mypurecloud.sdk.v2.extensions.notifications;

import com.neovisionaries.ws.client.WebSocketException;
import com.neovisionaries.ws.client.WebSocketState;

public interface WebSocketListener {
    void onStateChanged(WebSocketState state);
    void onConnected();
    void onDisconnected(boolean closedByServer);

    void onError(WebSocketException exception);
    void onConnectError(WebSocketException exception);
    void onCallbackError(Throwable exception);
    void onUnhandledEvent(String event);
}
