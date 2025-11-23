# DocumentBodyTableCaptionItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the caption item. |  |
| **text** | [**DocumentText**](DocumentText) | Text. It must contain a value if the type of the block is Text. |  [optional] |
| **paragraph** | [**DocumentBodyParagraph**](DocumentBodyParagraph) | Paragraph. It must contain a value if the type of the block is Paragraph. |  [optional] |
| **image** | [**DocumentBodyImage**](DocumentBodyImage) | Image. It must contain a value if the type of the block is Image. |  [optional] |
| **video** | [**DocumentBodyVideo**](DocumentBodyVideo) | Video. It must contain a value if the type of the block is Video. |  [optional] |
| **list** | [**DocumentBodyList**](DocumentBodyList) | List. It must contain a value if the type of the block is UnorderedList or OrderedList. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| PARAGRAPH | &quot;Paragraph&quot; | 
| IMAGE | &quot;Image&quot; | 
| VIDEO | &quot;Video&quot; | 
| ORDEREDLIST | &quot;OrderedList&quot; | 
| UNORDEREDLIST | &quot;UnorderedList&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
