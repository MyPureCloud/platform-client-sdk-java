# DocumentBodyBlockWithHighlight


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the block for the body. This determines which body block object (paragraph, list, video, image or table) would have a value. |  |
| **image** | [**DocumentBodyImage**](DocumentBodyImage) | Image. It must contain a value if the type of the block is Image. |  [optional] |
| **video** | [**DocumentBodyVideo**](DocumentBodyVideo) | Video. It must contain a value if the type of the block is Video. |  [optional] |
| **paragraph** | [**DocumentBodyParagraphWithHighlight**](DocumentBodyParagraphWithHighlight) | Paragraph. It must contain a value if the type of the block is Paragraph. |  [optional] |
| **list** | [**DocumentBodyListWithHighlight**](DocumentBodyListWithHighlight) | List. It must contain a value if the type of the block is UnorderedList or OrderedList. |  [optional] |
| **table** | [**DocumentBodyTableWithHighlight**](DocumentBodyTableWithHighlight) | Table. It must contain a value if type of the block is Table. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PARAGRAPH | &quot;Paragraph&quot; | 
| IMAGE | &quot;Image&quot; | 
| VIDEO | &quot;Video&quot; | 
| ORDEREDLIST | &quot;OrderedList&quot; | 
| UNORDEREDLIST | &quot;UnorderedList&quot; | 
| TABLE | &quot;Table&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
