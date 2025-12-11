# BulkResponseResultRelationshipEntityBulkEntityErrorEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id associated with this operation. For Bulk Enrich, this id is specified in the request; for all other Bulk endpoints, this id is the id of the affected entity. |  [optional] |
| **success** | **Boolean** | Whether the requested operation completed successfully. |  [optional] |
| **entity** | [**Relationship**](Relationship) | The entity which was affected by this Bulk operation. Only returned on success. |  [optional] |
| **error** | [**BulkEntityErrorEntity**](BulkEntityErrorEntity) | An error describing why this Bulk operation failed. Only returned on failure. |  [optional] |
| **status** | **Integer** | Status Code for the requested operation. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
