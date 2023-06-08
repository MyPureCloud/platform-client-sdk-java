---
title: NuanceBot
---
## NuanceBot


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Nuance bot Id |  |
| **name** | <!----><!---->**String**<!----> | Nuance bot name |  |
| **integrationId** | <!----><!---->**String**<!----> | The Integration Id for this bot |  |
| **nuanceOrganization** | <!----><!---->[**NuanceOrganization**](NuanceOrganization.html)<!----> | The Nuance Organization for this bot |  |
| **application** | <!----><!---->[**NuanceApplication**](NuanceApplication.html)<!----> | The Application for this bot |  |
| **nuanceEnvironment** | <!----><!---->[**NuanceEnvironment**](NuanceEnvironment.html)<!----> | The environment of the Nuance bot |  |
| **geography** | <!----><!---->[**NuanceGeography**](NuanceGeography.html)<!----> | The Geography of the Nuance bot |  |
| **credentials** | <!----><!---->[**List&lt;NuanceBotCredentials&gt;**](NuanceBotCredentials.html)<!----> | client ID/Secret objects for the credentials that execute this Nuance bot |  [optional] |
| **variables** | <!----><!---->[**List&lt;NuanceBotVariable&gt;**](NuanceBotVariable.html)<!----> | List of available variables in this Nuance bot.  When querying, use the 'expand=variables' query param to populate this value |  [optional] |
| **transferNodes** | <!----><!---->[**List&lt;NuanceBotTransferNode&gt;**](NuanceBotTransferNode.html)<!----> | List of transferNodes in this Nuance bot.  When querying, use the 'expand=transferNodes' query param to populate this value |  [optional] |
| **locales** | <!----><!---->**List&lt;String&gt;**<!----> | List of locales associated with this Nuance bot.  Generally in the ISO format such as 'en-US' |  [optional] |
| **channels** | <!----><!---->[**List&lt;NuanceChannel&gt;**](NuanceChannel.html)<!----> | List of channels associated with this Nuance bot. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



