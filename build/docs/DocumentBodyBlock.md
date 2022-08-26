---
title: DocumentBodyBlock
---
## DocumentBodyBlock


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the block for the body. This determines which body block object (paragraph, list, video or image) would have a value. |  |
| **paragraph** | <!----><!---->[**DocumentBodyParagraph**](DocumentBodyParagraph.html)<!----> | Paragraph. It must contain a value if the type of the block is Paragraph. |  |
| **image** | <!----><!---->[**DocumentBodyImage**](DocumentBodyImage.html)<!----> | Image. It must contain a value if the type of the block is Image. |  |
| **video** | <!----><!---->[**DocumentBodyVideo**](DocumentBodyVideo.html)<!----> | Video. It must contain a value if the type of the block is Video. |  |
| **list** | <!----><!---->[**DocumentBodyList**](DocumentBodyList.html)<!----> | List. It must contain a value if the type of the block is UnorderedList or OrderedList. |  |
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
{: class="table table-striped"}



