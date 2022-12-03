---
title: PredictorModelBrief
---
## PredictorModelBrief


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The media type of the model. |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The date the model was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **retrainingErrors** | <!----><!---->[**List&lt;PredictorModelRetrainingError&gt;**](PredictorModelRetrainingError.html)<!----> | The model's retraining errors. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the model |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;voice&quot; | 
| EMAIL | &quot;email&quot; | 
| MESSAGE | &quot;message&quot; | 
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRAINED | &quot;Trained&quot; | 
| ERROR | &quot;Error&quot; | 
| INVALIDDATASET | &quot;InvalidDataset&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
{: class="table table-striped"}



