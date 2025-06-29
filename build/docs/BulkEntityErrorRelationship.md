# BulkEntityErrorRelationship


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | **String** | An error code for the specific error condition. |  [optional] |
| **message** | **String** | A short error message. |  [optional] |
| **status** | **Integer** | The HTTP Status Code for the error. |  [optional] |
| **retryable** | **Boolean** | Whether this particular error should be retried. |  [optional] |
| **details** | [**List&lt;BulkErrorDetail&gt;**](BulkErrorDetail) | Additional error details for specific fields. |  [optional] |
| **entity** | [**Relationship**](Relationship) | The entity body specified in the Bulk request operation that caused this error. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
