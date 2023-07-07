---
title: Annotation
---
## Annotation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | <!----><!---->**String**<!----> |  |  [optional] |
| **location** | <!----><!---->**Long**<!----> | Offset of annotation in milliseconds. |  [optional] |
| **durationMs** | <!----><!---->**Long**<!----> | Duration of annotation in milliseconds. |  [optional] |
| **absoluteLocation** | <!----><!---->**Long**<!----> | Offset of annotation (milliseconds) from start of recording (after removing the cumulative duration of all pauses). |  [optional] |
| **absoluteDurationMs** | <!----><!---->**Long**<!----> | Duration of annotation (milliseconds). |  [optional] |
| **recordingLocation** | <!----><!---->**Long**<!----> | Offset of annotation (milliseconds) from start of recording, adjusted for any recording cuts |  [optional] |
| **recordingDurationMs** | <!----><!---->**Long**<!----> | Duration of annotation (milliseconds), adjusted for any recording cuts. |  [optional] |
| **user** | <!----><!---->[**User**](User.html)<!----> | User that created this annotation (if any). |  [optional] |
| **description** | <!----><!---->**String**<!----> | Text of annotation. Maximum character limit is 500. |  [optional] |
| **reason** | [**ReasonEnum**](#ReasonEnum)<!----> | Reason for a pause annotation. Valid values: Hold,SecurePause,FlowOrQueue |  [optional] |
| **annotations** | <!----><!---->[**List&lt;Annotation&gt;**](Annotation.html)<!----> | List of annotations |  [optional] |
| **realtimeLocation** | <!----><!---->**Long**<!----> | Offset of annotation (milliseconds) from start of the recording before removing the cumulative duration of all pauses before this annotation |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ReasonEnum"></a>

## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HOLD | &quot;Hold&quot; | 
| SECUREPAUSE | &quot;SecurePause&quot; | 
| FLOWORQUEUE | &quot;FlowOrQueue&quot; | 
{: class="table table-striped"}



