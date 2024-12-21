# Workspace


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The current name of the workspace. |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **isCurrentUserWorkspace** | **Boolean** |  |  [optional] |
| **user** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **bucket** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **summary** | [**WorkspaceSummary**](WorkspaceSummary) |  |  [optional] |
| **acl** | **List&lt;String&gt;** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| GROUP | &quot;GROUP&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
