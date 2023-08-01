---
title: DocumentText
---
## DocumentText


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | <!----><!---->**String**<!----> | Text. |  |
| **marks** | <!---->[**List&lt;MarksEnum&gt;**](#MarksEnum)<!----> | The unique list of marks (whether it is bold and/or underlined etc.) for the text. |  [optional] |
| **hyperlink** | <!----><!---->**String**<!----> | The URL of the page OR an email OR the reference to the knowledge article that the hyperlink goes to. Possible URL value types are https://<url link> | mailto:<email> | grn:knowledge:::documentVariation/<knowledgeBaseId>/<documentId>/<variationId> | grn:knowledge:::document/<knowledgeBaseId>/<documentId> | grn:knowledge:::category/<knowledgeBaseId>/<categoryId> | grn:knowledge:::label/<knowledgeBaseId>/<labelId> |  [optional] |
| **properties** | <!----><!---->[**DocumentTextProperties**](DocumentTextProperties.html)<!----> | The properties for the text. |  [optional] |
{: class="table table-striped"}


<a name="MarksEnum"></a>

## Enum: MarksEnum

| Name | Value |
| ---- | ----- |
| BOLD | &quot;Bold&quot; |
| ITALIC | &quot;Italic&quot; |
| UNDERLINE | &quot;Underline&quot; |
| STRIKETHROUGH | &quot;Strikethrough&quot; |
| SUBSCRIPT | &quot;Subscript&quot; |
| SUPERSCRIPT | &quot;Superscript&quot; |
{: class="table table-striped"}



