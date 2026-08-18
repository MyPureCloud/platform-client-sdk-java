package com.mypurecloud.sdk.v2;

import com.mypurecloud.sdk.v2.extensions.notifications.WebSocketListener;
import com.neovisionaries.ws.client.WebSocketException;
import com.neovisionaries.ws.client.WebSocketState;
import java.time.LocalDateTime;

public class TestWebSocketListener implements WebSocketListener {
    // Connector name
    private String connector = "";

    public TestWebSocketListener() {
        this.connector = "";
    }

    public TestWebSocketListener(
        String connector
    ) {
        super();
        this.setConnector(connector);
    }

    public String getConnector() {
        return this.connector;
    }

    public void setConnector(String connector) {
        // Accepts empty string - Ignores if null
        if (connector != null) {
            this.connector = connector;
        }
    }

    @Override
    public void onStateChanged(WebSocketState state) {
        // Log onStateChanged
        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("DEBUG TestWebSocketListener(" +
            this.connector +"): [" +
            currentDT + "]: onStateChanged with state=" +
            state.toString());
    }

    @Override
    public void onConnected() {
        // Log onConnected
        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("DEBUG TestWebSocketListener(" +
            this.connector +"): [" +
            currentDT + "]: onConnected");
    }

    @Override
    public void onConnectError(WebSocketException exception) {
        // Log onConnectError
        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("DEBUG TestWebSocketListener(" +
            this.connector +"): [" +
            currentDT + "]: onConnectError with exception=" +
            exception.toString());
    }

    @Override
    public void onDisconnected(boolean closedByServer) {
        // Log onDisconnected
        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("DEBUG TestWebSocketListener(" +
            this.connector +"): [" +
            currentDT + "]: onDisconnected with closedByServer=" +
            closedByServer);
    }

    @Override
    public void onError(WebSocketException exception) {
        // Log onError
        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("DEBUG TestWebSocketListener(" +
            this.connector +"): [" +
            currentDT + "]: onError with exception=" +
            exception.toString());
    }

    @Override
    public void onCallbackError(Throwable exception) {
        // Log onCallbackError
        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("DEBUG TestWebSocketListener(" +
            this.connector +"): [" +
            currentDT + "]: onCallbackError with exception=" +
            exception.toString());
    }

    @Override
    public void onUnhandledEvent(String event) {
        // Log onUnhandledEvent
        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("DEBUG TestWebSocketListener(" +
            this.connector +"): [" +
            currentDT + "]: onUnhandledEvent with event=" +
            event);
    }

}
