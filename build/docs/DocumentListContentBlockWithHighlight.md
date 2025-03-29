# DocumentListContentBlockWithHighlight


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the list block. |  |
| **text** | [**DocumentText**](DocumentText) | Text. It must contain a value if the type of the block is Text. |  [optional] |
| **image** | [**DocumentBodyImage**](DocumentBodyImage) | Image. It must contain a value if the type of the block is Image. |  [optional] |
| **video** | [**DocumentBodyVideo**](DocumentBodyVideo) | Video. It must contain a value if the type of the block is Video. |  [optional] |
| **list** | [**DocumentBodyListWithHighlight**](DocumentBodyListWithHighlight) | List. It must contain a value if the type of the block is UnorderedList or OrderedList. |  [optional] |
| **answerHighlight** | [**DocumentContentHighlightIndex**](DocumentContentHighlightIndex) | The block highlight data. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| IMAGE | &quot;Image&quot; | 
| ORDEREDLIST | &quot;OrderedList&quot; | 
| UNORDEREDLIST | &quot;UnorderedList&quot; | 
| VIDEO | &quot;Video&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
