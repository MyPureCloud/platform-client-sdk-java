# ResponseDivisionView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **responseType** | [**ResponseTypeEnum**](#Enum--ResponseTypeEnum) | The response type represented by the response. |  [optional] |
| **libraries** | [**List&lt;LibraryDivisionView&gt;**](LibraryDivisionView) | One or more libraries response is associated with. |  [optional] |
| **substitutions** | [**List&lt;ResponseSubstitution&gt;**](ResponseSubstitution) | Details about any text substitutions used in the texts for this response. |  [optional] |
| **substitutionsSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) | Metadata about the text substitutions in json schema format. |  [optional] |
| **messagingTemplate** | [**MessagingTemplate**](MessagingTemplate) | An optional messaging template definition for responseType.MessagingTemplate. |  [optional] |
| **form** | [**Form**](Form) | Form template definition for responseType.Form. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ResponseTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MESSAGINGTEMPLATE | &quot;MessagingTemplate&quot; | 
| CAMPAIGNSMSTEMPLATE | &quot;CampaignSmsTemplate&quot; | 
| CAMPAIGNEMAILTEMPLATE | &quot;CampaignEmailTemplate&quot; | 
| FOOTER | &quot;Footer&quot; | 
| FORM | &quot;Form&quot; | 
| APPLEINVITATION | &quot;AppleInvitation&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
