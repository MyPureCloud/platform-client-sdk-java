Platform API version: 9095


This release introduces the following updates:

The Java Platform API Client SDK can now be configured (using ApiClient.LEGACY_EMPTY_LIST) to determine if array type attributes (in models) will be initialized with an empty `ArrayList` or with `null`.

Attributes of integer type, defined in the Topics models (GET /api/v2/notifications/availabletopics), will now be considered as 64bit integers. In the Java SDK, such properties will have their type changed from Integer to Long.

# Major Changes (0 changes)


# Minor Changes (0 changes)


# Point Changes (0 changes)
