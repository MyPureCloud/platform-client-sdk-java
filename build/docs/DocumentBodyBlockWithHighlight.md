---
title: DocumentBodyBlockWithHighlight
---
## DocumentBodyBlockWithHighlight


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the block for the body. This determines which body block object (paragraph, list, video, image or table) would have a value. |  |
| **image** | <!----><!---->[**DocumentBodyImage**](DocumentBodyImage.html)<!----> | Image. It must contain a value if the type of the block is Image. |  [optional] |
| **video** | <!----><!---->[**DocumentBodyVideo**](DocumentBodyVideo.html)<!----> | Video. It must contain a value if the type of the block is Video. |  [optional] |
| **list** | <!----><!---->[**DocumentBodyList**](DocumentBodyList.html)<!----> | List. It must contain a value if the type of the block is UnorderedList or OrderedList. |  [optional] |
| **table** | <!----><!---->[**DocumentBodyTable**](DocumentBodyTable.html)<!----> | Table. It must contain a value if type of the block is Table. |  [optional] |
| **paragraph** | <!----><!---->[**DocumentBodyParagraphWithHighlight**](DocumentBodyParagraphWithHighlight.html)<!----> | Paragraph. It must contain a value if the type of the block is Paragraph. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

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
{: class="table table-striped"}



