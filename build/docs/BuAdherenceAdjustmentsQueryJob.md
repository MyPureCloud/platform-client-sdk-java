# BuAdherenceAdjustmentsQueryJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the adherence adjustments query job |  [optional] |
| **downloadUrl** | **String** | A URL to fetch results of the job. Only set if status == 'Complete' |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Error details if status == 'Error' |  [optional] |
| **result** | [**AdherenceAdjustmentsListing**](AdherenceAdjustmentsListing) | Schema template for deserializing data returned from the downloadUrl. Will always be null on the response |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:264.1.0_
