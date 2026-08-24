# Caseplan


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Caseplan. |  |
| **division** | [**StarrableDivision**](StarrableDivision) | The division to which this Caseplan belongs. |  |
| **description** | **String** | The description of the Caseplan. |  [optional] |
| **referencePrefix** | **String** | The prefix used when creating the reference for Cases from the Caseplan. |  |
| **defaultDueDurationInSeconds** | **Integer** | The default due duration in seconds for Cases created from the Caseplan. |  |
| **defaultTtlSeconds** | **Integer** | The default TTL in seconds for Cases created from the Caseplan. |  |
| **defaultCaseOwner** | [**UserReference**](UserReference) | The default Case owner for Cases created from the Caseplan. |  [optional] |
| **latest** | **Integer** | The latest version of the Caseplan. |  |
| **published** | **Integer** | The published version of the Caseplan. |  [optional] |
| **dateCreated** | [**Date**](Date) | The Caseplan creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateModified** | [**Date**](Date) | The Caseplan modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **datePublished** | [**Date**](Date) | The Caseplan publication date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The ID of the User who modified the Caseplan. |  |
| **customerIntent** | [**CustomerIntentReference**](CustomerIntentReference) | The customer intent for Cases created from this Caseplan. |  |
| **versionState** | [**VersionStateEnum**](#Enum--VersionStateEnum) | The version state of the Caseplan. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: VersionStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COPYING | &quot;Copying&quot; | 
| DRAFT | &quot;Draft&quot; | 
| PUBLISHED | &quot;Published&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
