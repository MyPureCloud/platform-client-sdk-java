# Stepplan


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Stepplan. |  [optional] |
| **description** | **String** | The description of the Stepplan. |  [optional] |
| **caseplan** | [**CaseplanReference**](CaseplanReference) | The Caseplan of the Stepplan. |  [optional] |
| **stageplan** | [**StageplanReference**](StageplanReference) | The Stageplan of the Stepplan. |  [optional] |
| **dateCreated** | [**Date**](Date) | The Stepplan creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The Stepplan modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The ID of the User who modified the Stepplan. |  [optional] |
| **activityType** | [**ActivityTypeEnum**](#Enum--ActivityTypeEnum) | The activityType of the Stepplan. |  [optional] |
| **workitemSettings** | [**WorkitemSettingsResponse**](WorkitemSettingsResponse) | The workitemSettings of the Stepplan. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ActivityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| NONE | &quot;None&quot; | 
| WORKITEM | &quot;Workitem&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:250.1.0_
