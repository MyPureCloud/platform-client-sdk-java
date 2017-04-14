package com.mypurecloud.sdk.v2.extensions.notifications;

public interface NotificationListener<T> {
    String getTopic();
    Class<?> getEventBodyClass();
    void onEvent(NotificationEvent<?> event);
}
