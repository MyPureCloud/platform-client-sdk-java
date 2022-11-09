---
title: PredictorModelRetrainingError
---
## PredictorModelRetrainingError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum)<!----> | Error code describing model training failure. |  |
| **dateOfFirstOccurrence** | <!----><!---->[**Date**](Date.html)<!----> | Date when the first retraining failure happened. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
{: class="table table-striped"}


<a name="ErrorCodeEnum"></a>

## Enum: ErrorCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOTENOUGHDATA | &quot;NotEnoughData&quot; | 
| SERVICEERROR | &quot;ServiceError&quot; | 
| UNKNOWNERROR | &quot;UnknownError&quot; | 
{: class="table table-striped"}



