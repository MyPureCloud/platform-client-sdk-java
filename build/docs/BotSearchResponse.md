---
title: BotSearchResponse
---
## BotSearchResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The id of the bot |  |
| **name** | <!----><!---->**String**<!----> | The name of the bot |  |
| **botType** | [**BotTypeEnum**](#BotTypeEnum)<!----> | The provider of the bot |  |
| **description** | <!----><!---->**String**<!----> | The description of the bot |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="BotTypeEnum"></a>

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
{: class="table table-striped"}



