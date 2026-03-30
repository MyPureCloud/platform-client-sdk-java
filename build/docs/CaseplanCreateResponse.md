# CaseplanCreateResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Caseplan. |  [optional] |
| **division** | [**StarrableDivision**](StarrableDivision) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | The description of the Caseplan. |  [optional] |
| **referencePrefix** | **String** | The prefix used when creating the reference for Cases from the Caseplan. |  [optional] |
| **defaultDueDurationInSeconds** | **Integer** | The default due duration in seconds for Cases created from the Caseplan. |  [optional] |
| **defaultTtlSeconds** | **Integer** | The default TTL in seconds for Cases created from the Caseplan. |  [optional] |
| **defaultCaseOwner** | [**UserReference**](UserReference) | The default case owner for Cases created from the Caseplan. |  [optional] |
| **latest** | **Integer** | The latest version of the Caseplan. |  [optional] |
| **published** | **Integer** | The published version of the Caseplan. |  [optional] |
| **dateCreated** | [**Date**](Date) | The Caseplan creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The Caseplan modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **datePublished** | [**Date**](Date) | The Caseplan publication date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The id of the User who modified the Caseplan. |  [optional] |
| **customerIntent** | [**CustomerIntentReference**](CustomerIntentReference) | The customer intent for the Cases created from the caseplan. |  [optional] |
| **versionState** | [**VersionStateEnum**](#Enum--VersionStateEnum) | The version state of the Caseplan. |  [optional] |
| **dataSchemas** | [**List&lt;CaseplanDataSchema&gt;**](CaseplanDataSchema) | The schemas that define all data for cases from this Caseplan. |  [optional] |
| **intakeSettings** | [**List&lt;IntakeSetting&gt;**](IntakeSetting) | The intake format when collecting data for a case from this caseplan. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: VersionStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COPYING | &quot;Copying&quot; | 
| DRAFT | &quot;Draft&quot; | 
| PUBLISHED | &quot;Published&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:250.1.0_
