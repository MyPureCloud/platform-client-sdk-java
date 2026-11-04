# SelfScheduleOffersJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the job |  |
| **downloadUrl** | **String** | URL from which to fetch results for requests. Populated if status == ‘Complete'. The downloaded data will conform to the schema defined in downloadResultTemplate |  [optional] |
| **downloadResultTemplate** | [**SelfScheduleOffersResultTemplate**](SelfScheduleOffersResultTemplate) | Schema template for deserializing lookup offers results returned from the downloadUrl |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Any error information, only set if the status == 'Error' |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
