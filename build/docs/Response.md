# Response


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **version** | **Integer** | Version number required for updates. |  [optional] |
| **libraries** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | One or more libraries response is associated with. |  |
| **texts** | [**List&lt;ResponseText&gt;**](ResponseText) | One or more texts associated with the response. |  |
| **createdBy** | [**User**](User) | User that created the response |  [optional] |
| **dateCreated** | [**Date**](Date) | The date and time the response was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **interactionType** | [**InteractionTypeEnum**](#Enum--InteractionTypeEnum) | The interaction type for this response. |  [optional] |
| **substitutions** | [**List&lt;ResponseSubstitution&gt;**](ResponseSubstitution) | Details about any text substitutions used in the texts for this response. |  [optional] |
| **substitutionsSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) | Metadata about the text substitutions in json schema format. |  [optional] |
| **responseType** | [**ResponseTypeEnum**](#Enum--ResponseTypeEnum) | The response type represented by the response. |  [optional] |
| **messagingTemplate** | [**MessagingTemplate**](MessagingTemplate) | An optional messaging template definition for responseType.MessagingTemplate. |  [optional] |
| **assets** | [**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef) | Assets used in the response |  [optional] |
| **footer** | [**FooterTemplate**](FooterTemplate) | Footer template definition for responseType.Footer. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: InteractionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CHAT | &quot;chat&quot; | 
| EMAIL | &quot;email&quot; | 
| TWITTER | &quot;twitter&quot; | 


## Enum: ResponseTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MESSAGINGTEMPLATE | &quot;MessagingTemplate&quot; | 
| CAMPAIGNSMSTEMPLATE | &quot;CampaignSmsTemplate&quot; | 
| CAMPAIGNEMAILTEMPLATE | &quot;CampaignEmailTemplate&quot; | 
| FOOTER | &quot;Footer&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
