# AdherenceExplanationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **agent** | [**UserReference**](UserReference) | The agent to whom this adherence explanation applies |  |
| **managementUnit** | [**ManagementUnitReference**](ManagementUnitReference) | The management unit to which the agent belonged at the time the adherence explanation was submitted |  |
| **businessUnit** | [**BusinessUnitReference**](BusinessUnitReference) | The business unit to which the agent belonged at the time the adherence explanation was submitted |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the adherence explanation |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the adherence explanation |  |
| **startDate** | [**Date**](Date) | The start timestamp of the adherence explanation in ISO-8601 format |  |
| **lengthMinutes** | **Integer** | The length of the adherence explanation in minutes |  |
| **notes** | **String** | Notes about the adherence explanation |  [optional] |
| **reviewedBy** | [**UserReference**](UserReference) | The user who reviewed the adherence explanation, if applicable. The id may be 'System' if it was an automated process |  [optional] |
| **reviewedDate** | [**Date**](Date) | The timestamp for when the adherence explanation was reviewed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LATE | &quot;Late&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
