# BotSearchResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the bot |  |
| **name** | **String** | The name of the bot |  |
| **botType** | [**BotTypeEnum**](#Enum--BotTypeEnum) | The provider of the bot |  |
| **description** | **String** | The description of the bot |  [optional] |
| **virtualAgentEnabled** | **Boolean** | Whether the bot is a virtual agent or not |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: BotTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GENESYSBOTCONNECTOR | &quot;GenesysBotConnector&quot; | 
| GENESYSDIALOGENGINE | &quot;GenesysDialogEngine&quot; | 
| AMAZONLEX | &quot;AmazonLex&quot; | 
| GOOGLEDIALOGFLOWES | &quot;GoogleDialogFlowES&quot; | 
| GOOGLEDIALOGFLOWCX | &quot;GoogleDialogFlowCX&quot; | 
| NUANCEDLG | &quot;NuanceDlg&quot; | 
| GENESYSBOTFLOW | &quot;GenesysBotFlow&quot; | 
| GENESYSDIGITALBOTFLOW | &quot;GenesysDigitalBotFlow&quot; | 
| GENESYSVOICESURVEYFLOW | &quot;GenesysVoiceSurveyFlow&quot; | 
| GENESYSDIGITALBOTCONNECTOR | &quot;GenesysDigitalBotConnector&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
