# Annotation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Annotation id. All pause annotations on a recording will share an ID value, bookmark annotations will have unique IDs, and hold annotations will have randomly generated UUIDs (i.e. the ID will change at each request). |  [optional] |
| **name** | **String** |  |  [optional] |
| **type** | **String** |  |  [optional] |
| **location** | **Long** | Offset of annotation in milliseconds. |  [optional] |
| **durationMs** | **Long** | Duration of annotation in milliseconds. |  [optional] |
| **absoluteLocation** | **Long** | Offset of annotation (milliseconds) from start of recording (after removing the cumulative duration of all pauses). |  [optional] |
| **absoluteDurationMs** | **Long** | Duration of annotation (milliseconds). |  [optional] |
| **recordingLocation** | **Long** | Offset of annotation (milliseconds) from start of recording, adjusted for any recording cuts |  [optional] |
| **recordingDurationMs** | **Long** | Duration of annotation (milliseconds), adjusted for any recording cuts. |  [optional] |
| **user** | [**User**](User) | User that created this annotation (if any). |  [optional] |
| **description** | **String** | Text of annotation. Maximum character limit is 500. |  [optional] |
| **reason** | [**ReasonEnum**](#Enum--ReasonEnum) | Reason for a pause annotation. Valid values: Hold,SecurePause,FlowOrQueue,Pause |  [optional] |
| **annotations** | [**List&lt;Annotation&gt;**](Annotation) | List of annotations |  [optional] |
| **realtimeLocation** | **Long** | Offset of annotation (milliseconds) from start of the recording before removing the cumulative duration of all pauses before this annotation |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HOLD | &quot;Hold&quot; | 
| SECUREPAUSE | &quot;SecurePause&quot; | 
| FLOWORQUEUE | &quot;FlowOrQueue&quot; | 
| PAUSE | &quot;Pause&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
