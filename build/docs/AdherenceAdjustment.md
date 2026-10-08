# AdherenceAdjustment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **agent** | [**UserReference**](UserReference) | The agent to whom this adherence adjustment applies |  |
| **managementUnit** | [**ManagementUnitReference**](ManagementUnitReference) | The management unit to which the agent belonged when the adherence adjustment was submitted |  |
| **businessUnit** | [**BusinessUnitReference**](BusinessUnitReference) | The business unit to which the agent belonged when the adherence adjustment was submitted |  |
| **startDate** | [**Date**](Date) | The start timestamp of the adherence adjustment in ISO-8601 format |  |
| **lengthMinutes** | **Integer** | The length of the adherence adjustment in minutes |  |
| **reasonCode** | [**AdherenceAdjustmentsReasonCodeReference**](AdherenceAdjustmentsReasonCodeReference) | The reason code for this adherence adjustment |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the adherence adjustment |  |
| **expired** | **Boolean** | Indicates if the adherence adjustment is expired |  |
| **submitterNotes** | **String** | Notes provided by the submitter for this adherence adjustment |  [optional] |
| **reviewerNotes** | **String** | Notes provided by the reviewer for this adherence adjustment |  [optional] |
| **reviewedBy** | [**UserReference**](UserReference) | The user who reviewed the adherence adjustment, if applicable. The id may be 'System' if it was an automated process |  [optional] |
| **reviewedDate** | [**Date**](Date) | The date the adherence adjustment was reviewed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the adherence adjustment |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| PENDING | &quot;Pending&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:265.0.0_
