---
title: DocumentListContentBlock
---
## DocumentListContentBlock


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the list block. |  |
| **text** | <!----><!---->[**DocumentText**](DocumentText.html)<!----> | Text. It must contain a value if the type of the block is Text. |  |
| **image** | <!----><!---->[**DocumentBodyImage**](DocumentBodyImage.html)<!----> | Image. It must contain a value if the type of the block is Image. |  |
| **list** | <!----><!---->[**DocumentBodyList**](DocumentBodyList.html)<!----> | List. It must contain a value if the type of the block is UnorderedList or OrderedList. |  |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| IMAGE | &quot;Image&quot; | 
| ORDEREDLIST | &quot;OrderedList&quot; | 
| UNORDEREDLIST | &quot;UnorderedList&quot; | 
{: class="table table-striped"}



