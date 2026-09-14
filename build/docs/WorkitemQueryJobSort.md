# WorkitemQueryJobSort


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | [**NameEnum**](#Enum--NameEnum) | Specify an attribute for sorting. Use 'customFields' to sort by a custom field, in which case the customField property is required. |  [optional] |
| **ascending** | **Boolean** | Sort Ascending |  [optional] |
| **customField** | **String** | The key of the custom field to sort by. Required when name is 'customFields' and must not be set otherwise. |  [optional] |


## Enum: NameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DATEDUE | &quot;dateDue&quot; | 
| DATECREATED | &quot;dateCreated&quot; | 
| PRIORITY | &quot;priority&quot; | 
| CUSTOMFIELDS | &quot;customFields&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:263.0.0_
