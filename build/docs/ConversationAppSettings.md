---
title: ConversationAppSettings
---
## ConversationAppSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **showAgentTypingIndicator** | <!----><!---->**Boolean**<!----> | The toggle to enable or disable typing indicator for messenger |  [optional] |
| **showUserTypingIndicator** | <!----><!---->**Boolean**<!----> | The toggle to enable or disable typing indicator for messenger |  [optional] |
| **autoStartType** | [**AutoStartTypeEnum**](#AutoStartTypeEnum)<!----> | Deprecated. The auto start type for the messenger conversation |  [optional] |
| **autoStart** | <!----><!---->[**AutoStart**](AutoStart.html)<!----> | The auto start for the messenger conversation |  [optional] |
| **markdown** | <!----><!---->[**Markdown**](Markdown.html)<!----> | The markdown for the messenger app |  [optional] |
| **conversationDisconnect** | <!----><!---->[**ConversationDisconnectSettings**](ConversationDisconnectSettings.html)<!----> | The conversation disconnect settings for the messenger app |  [optional] |
{: class="table table-striped"}


<a name="AutoStartTypeEnum"></a>

## Enum: AutoStartTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STANDARD | &quot;Standard&quot; | 
| AUTOMATIC | &quot;Automatic&quot; | 
{: class="table table-striped"}



