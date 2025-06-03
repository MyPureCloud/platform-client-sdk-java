# Note


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **division** | [**WritableStarrableDivision**](WritableStarrableDivision) | The division to which this entity belongs. |  [optional] |
| **entityId** | **String** | The id of the contact or organization to which this note refers. This only needs to be set for input when using the Bulk APIs. |  [optional] |
| **entityType** | [**EntityTypeEnum**](#Enum--EntityTypeEnum) | This is only need to be set when using Bulk API. Using any other value than contact or organization will result in null being used. |  [optional] |
| **noteText** | **String** |  |  [optional] |
| **modifyDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**User**](User) | When creating or updating a note, only User.id is required. User object is fully populated when expanding a note. |  |
| **externalDataSources** | [**List&lt;ExternalDataSource&gt;**](ExternalDataSource) | Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONTACT | &quot;contact&quot; | 
| ORGANIZATION | &quot;organization&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
