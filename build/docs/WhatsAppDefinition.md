# WhatsAppDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The messaging template name. |  |
| **namespace** | **String** | The messaging template namespace. |  [optional] |
| **language** | **String** | The messaging template language configured for this template. This is a WhatsApp specific value. For example, 'en_US' |  |
| **buttons** | [**List&lt;Button&gt;**](Button) | List of buttons to be included in the standard WhatsApp messages channel |  [optional] |
| **messageFooter** | [**MessageFooter**](MessageFooter) | Footer for the message in the standard WhatsApp messages channel |  [optional] |
| **header** | [**MessageHeader**](MessageHeader) | Header for the message in the standard WhatsApp messages channel |  [optional] |
| **integrationId** | **String** | WhatsApp integration ID for whatsApp carousels |  [optional] |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) | Category of whatsApp carousels template. |  [optional] |
| **templateStatus** | **String** | Template status of whatsApp carousels template. |  [optional] |
| **statusInfo** | [**StatusInfo**](StatusInfo) | Status information about the template |  [optional] |
| **carousel** | [**Carousel**](Carousel) | Definition for whatsApp carousels template. |  [optional] |


## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MARKETING | &quot;marketing&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:257.0.0_
