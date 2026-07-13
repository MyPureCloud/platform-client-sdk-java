# Step


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Step. |  [optional] |
| **description** | **String** | The description of the Step. |  [optional] |
| **dateCreated** | [**Date**](Date) | The Step creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The Step modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | [**Date**](Date) | The Step completion date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateStarted** | [**Date**](Date) | The Step start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The ID of the User who modified the Step. |  [optional] |
| **version** | **Integer** | The version of the Step. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The Status of the Step. |  [optional] |
| **stage** | [**StageReference**](StageReference) | The parent Stage of the Step. |  [optional] |
| **workitemActivity** | [**WorkitemActivityReference**](WorkitemActivityReference) | The workitem activity linked to this step. Present only for workitem-type steps that have been activated. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **_case** | [**CaseReference**](CaseReference) | The parent Case of the Step. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| OPEN | &quot;Open&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| TERMINATED | &quot;Terminated&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
