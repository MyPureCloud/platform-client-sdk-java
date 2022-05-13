---
title: ModelingProcessingError
---
## ModelingProcessingError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **internalErrorCode** | [**InternalErrorCodeEnum**](#InternalErrorCodeEnum)<!----> | An internal code representing the type of error. ModelInputMissing for 'Model Builder inputs not found.' ModelInputInvalid for 'Model Builder inputs are invalid. Ensure the input data format is correct.' ModelFailed for 'An error occured while building the model with the given input.' |  [optional] |
| **description** | <!----><!---->**String**<!----> | A text description of the error |  [optional] |
{: class="table table-striped"}


<a name="InternalErrorCodeEnum"></a>

## Enum: InternalErrorCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MODELINPUTMISSING | &quot;ModelInputMissing&quot; | 
| MODELINPUTINVALID | &quot;ModelInputInvalid&quot; | 
| MODELFAILED | &quot;ModelFailed&quot; | 
{: class="table table-striped"}



