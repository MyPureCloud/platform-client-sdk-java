# GraphApiSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **integration** | [**DomainEntityRef**](DomainEntityRef) | The Graph API server integration to use for emails. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Graph API Server Status |  [optional] |
| **errorInfo** | [**EmailErrorInfo**](EmailErrorInfo) | Additional Graph API Server error information |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| ERROR | &quot;Error&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| INTEGRATIONDELETED | &quot;IntegrationDeleted&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
