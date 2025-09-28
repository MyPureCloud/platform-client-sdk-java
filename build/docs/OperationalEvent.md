# OperationalEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventDefinition** | [**AddressableEntityRef**](AddressableEntityRef) | The event that occurred. |  [optional] |
| **entityId** | **String** | The unique identifier for the entity |  [optional] |
| **entityToken** | **String** | A token representing the entity |  [optional] |
| **entityName** | **String** | The name for the entity |  [optional] |
| **previousValue** | **String** | The value prior to the event |  [optional] |
| **currentValue** | **String** | The changed value following the event |  [optional] |
| **errorCode** | **String** | The error code of the entity in the providing service associated to the event |  [optional] |
| **parentEntityId** | **String** | The unique identifier for the parent of the entity |  [optional] |
| **conversation** | [**AddressableEntityRef**](AddressableEntityRef) | The link to a conversation |  [optional] |
| **dateCreated** | [**Date**](Date) | The date when the event created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **entityVersion** | **String** | The version of the entity in the providing service |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
