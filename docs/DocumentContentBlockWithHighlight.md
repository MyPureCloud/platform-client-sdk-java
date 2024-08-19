# DocumentContentBlockWithHighlight


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the paragraph block. |  |
| **text** | [**DocumentText**](DocumentText) | Text. It must contain a value if the type of the block is Text. |  [optional] |
| **image** | [**DocumentBodyImage**](DocumentBodyImage) | Image. It must contain a value if the type of the block is Image. |  [optional] |
| **video** | [**DocumentBodyVideo**](DocumentBodyVideo) | Video. It must contain a value if the type of the block is Video. |  [optional] |
| **answerHighlight** | [**DocumentContentHighlightIndex**](DocumentContentHighlightIndex) | The block highlight data. |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| IMAGE | &quot;Image&quot; | 
| VIDEO | &quot;Video&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
