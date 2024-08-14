---
title: LearningScormResponse
---
## LearningScormResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the SCORM package |  [optional] |
| **errorCode** | <!----><!---->**String**<!----> | The error code of the SCORM package (on failure) |  [optional] |
| **errorMessage** | <!----><!---->**String**<!----> | The error message associated with the error code |  [optional] |
| **percentageUnpacked** | <!----><!---->**Float**<!----> | The percentage of the SCORM package that has been unpacked |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPLOADPENDING | &quot;UploadPending&quot; | 
| UNPACKING | &quot;Unpacking&quot; | 
| ERROR | &quot;Error&quot; | 
| READY | &quot;Ready&quot; | 
{: class="table table-striped"}



