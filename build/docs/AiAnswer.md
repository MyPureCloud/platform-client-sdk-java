# AiAnswer


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **answerId** | **String** | The unique identifier of the suggested AI answer. |  [optional] |
| **explanation** | **String** | An explanation providing the reasoning behind the suggested answer. |  [optional] |
| **failureType** | [**FailureTypeEnum**](#Enum--FailureTypeEnum) | Describes the type of error associated with the AI answer. |  [optional] |
{: class="table table-striped"}


## Enum: FailureTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOWCONFIDENCEERROR | &quot;LowConfidenceError&quot; | 
| PARSINGERROR | &quot;ParsingError&quot; | 
| SERVICEERROR | &quot;ServiceError&quot; | 
| LOWHISTORICALACCURACYERROR | &quot;LowHistoricalAccuracyError&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
