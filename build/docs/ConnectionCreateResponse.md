# ConnectionCreateResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the connection. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type of the connection. |  [optional] |
| **integration** | [**KnowledgeIntegrationReference**](KnowledgeIntegrationReference) | The reference to the integration associated with the connection. |  [optional] |
| **authenticationProperties** | [**AuthenticationProperties**](AuthenticationProperties) | Authentication properties which can be used to initiate authentication of a user. |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | Reference of the creator. |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | Reference of the user whom modified the connection. |  [optional] |
| **dateCreated** | [**Date**](Date) | Date of the creation of connection. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date of the last modification made to the connection. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Current status of the connection. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SHAREPOINT | &quot;Sharepoint&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| CONNECTED | &quot;Connected&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:256.0.0_
