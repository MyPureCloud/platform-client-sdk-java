---
title: NotificationTemplateHeader
---
## NotificationTemplateHeader


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Template header type. |  |
| **text** | <!----><!---->**String**<!----> | Header text. For WhatsApp, ignored. |  [optional] |
| **media** | <!----><!---->[**ContentAttachment**](ContentAttachment.html)<!----> | Media template header image. |  [optional] |
| **parameters** | <!----><!---->[**List&lt;NotificationTemplateParameter&gt;**](NotificationTemplateParameter.html)<!----> | Template parameters for placeholders in template. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| MEDIA | &quot;Media&quot; | 
{: class="table table-striped"}



