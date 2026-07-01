# ModelCase


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Case. |  [optional] |
| **division** | [**StarrableDivision**](StarrableDivision) | The division to which this entity belongs. |  [optional] |
| **version** | **Integer** | The version of the Case. |  [optional] |
| **reference** | **String** | The reference identifier of the Case. |  [optional] |
| **caseplan** | [**CaseplanReference**](CaseplanReference) | The Caseplan the Case was created from. |  [optional] |
| **summary** | **String** | Overview information for the Case. |  [optional] |
| **owner** | [**UserReference**](UserReference) | The owner of the Case. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the Case. |  [optional] |
| **priority** | [**PriorityEnum**](#Enum--PriorityEnum) | The priority of the Case. |  [optional] |
| **dateDue** | [**Date**](Date) | The due date of the Case. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateStarted** | [**Date**](Date) | The start time of the Case. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateClosed** | [**Date**](Date) | The completion time of the Case. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the Case was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date the Case was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The ID of the User who modified the Case. |  [optional] |
| **externalContact** | [**CaseExternalContactReference**](CaseExternalContactReference) | The External Contact associated with the Case. |  [optional] |
| **customerIntent** | [**CustomerIntentReference**](CustomerIntentReference) | The customer intent for the Case. |  [optional] |
| **creationStatus** | [**CreationStatusEnum**](#Enum--CreationStatusEnum) | The creation status of the Case. |  [optional] |
| **ttlSeconds** | **Integer** | The time-to-live in seconds for the lifetime of the Case. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| OPEN | &quot;Open&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| TERMINATING | &quot;Terminating&quot; | 
| TERMINATED | &quot;Terminated&quot; | 
| CLOSED | &quot;Closed&quot; | 
| FAILED | &quot;Failed&quot; | 


## Enum: PriorityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| URGENT | &quot;Urgent&quot; | 
| HIGH | &quot;High&quot; | 
| MEDIUM | &quot;Medium&quot; | 
| LOW | &quot;Low&quot; | 


## Enum: CreationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:257.0.0_
