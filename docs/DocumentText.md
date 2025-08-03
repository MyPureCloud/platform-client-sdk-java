# DocumentText


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | **String** | Text. |  |
| **marks** | [**List<MarksEnum>**](#Enum--MarksEnum) | The unique list of marks (whether it is bold and/or underlined etc.) for the text. |  [optional] |
| **hyperlink** | **String** | The URL of the page OR an email OR the reference to the knowledge article that the hyperlink goes to. Possible URL value types are https://<url link> | mailto:<email> | grn:knowledge:::documentVariation/<knowledgeBaseId>/<documentId>/<variationId> | grn:knowledge:::document/<knowledgeBaseId>/<documentId> | grn:knowledge:::category/<knowledgeBaseId>/<categoryId> | grn:knowledge:::label/<knowledgeBaseId>/<labelId> |  [optional] |
| **properties** | [**DocumentTextProperties**](DocumentTextProperties) | The properties for the text. |  [optional] |


## Enum: MarksEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BOLD | &quot;Bold&quot; |
| ITALIC | &quot;Italic&quot; |
| UNDERLINE | &quot;Underline&quot; |
| STRIKETHROUGH | &quot;Strikethrough&quot; |
| SUBSCRIPT | &quot;Subscript&quot; |
| SUPERSCRIPT | &quot;Superscript&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
