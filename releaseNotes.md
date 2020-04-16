Platform API version: 3884


# SDK Changes

* API-5244 `NotificationHandler` now listens for the `v2.system.socket_closing` event and will automatically reestablish the socket connection
* API-5244 `addHandlerNoSubscribe` and `addHandlersNoSubscribe` methods have been added to `NotificationHandler` to allow topic event handlers to be set without modifying the channel's subscription. This is primarily for use when an existing `Channel` is provided when building the `NotificationHandler` instance.

# Major Changes (0 changes)


# Minor Changes (0 changes)


# Point Changes (0 changes)
