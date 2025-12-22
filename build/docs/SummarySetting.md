# SummarySetting


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the summary setting. |  |
| **language** | **String** | Language of the generated summary, e.g. en-US, it-IT. |  |
| **summaryType** | [**SummaryTypeEnum**](#Enum--SummaryTypeEnum) | Level of detail of the generated summary. |  [optional] |
| **format** | [**FormatEnum**](#Enum--FormatEnum) | Format of the generated summary. |  [optional] |
| **maskPII** | [**SummarySettingPII**](SummarySettingPII) | Displaying PII in the generated summary. |  [optional] |
| **participantLabels** | [**SummarySettingParticipantLabels**](SummarySettingParticipantLabels) | How to refer to interaction participants in the generated summary. |  [optional] |
| **predefinedInsights** | [**List<PredefinedInsightsEnum>**](#Enum--PredefinedInsightsEnum) | Set which insights to include in the generated summary by default. |  [optional] |
| **customEntities** | [**List&lt;SummarySettingCustomEntity&gt;**](SummarySettingCustomEntity) | Custom entity definition. |  [optional] |
| **settingType** | [**SettingTypeEnum**](#Enum--SettingTypeEnum) | Type of the summary setting. |  [optional] |
| **prompt** | **String** | Custom prompt of summary setting. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date and time the setting was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date and time the setting was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SummaryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONCISE | &quot;Concise&quot; | 
| DETAILED | &quot;Detailed&quot; | 


## Enum: FormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXTBLOCK | &quot;TextBlock&quot; | 
| BULLETPOINTS | &quot;BulletPoints&quot; | 
| GROUPEDTEXTBLOCKS | &quot;GroupedTextBlocks&quot; | 
| GROUPEDBULLETPOINTS | &quot;GroupedBulletPoints&quot; | 


## Enum: PredefinedInsightsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| REASONFORCALL | &quot;ReasonForCall&quot; |
| RESOLUTION | &quot;Resolution&quot; |
| ACTIONITEMS | &quot;ActionItems&quot; |


## Enum: SettingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BASIC | &quot;Basic&quot; | 
| PROMPT | &quot;Prompt&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
