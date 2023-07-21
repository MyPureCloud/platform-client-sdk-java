---
title: DocumentContentBlock
---
## DocumentContentBlock


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the paragraph block. |  |
| **text** | <!----><!---->[**DocumentText**](DocumentText.html)<!----> | Text. It must contain a value if the type of the block is Text. |  [optional] |
| **image** | <!----><!---->[**DocumentBodyImage**](DocumentBodyImage.html)<!----> | Image. It must contain a value if the type of the block is Image. |  [optional] |
| **video** | <!----><!---->[**DocumentBodyVideo**](DocumentBodyVideo.html)<!----> | Video. It must contain a value if the type of the block is Video. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| IMAGE | &quot;Image&quot; | 
| VIDEO | &quot;Video&quot; | 
{: class="table table-striped"}



