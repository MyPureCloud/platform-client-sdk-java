---
title: IntegrationStatusInfo
---
## IntegrationStatusInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | [**CodeEnum**](#CodeEnum)<!----> | Machine-readable status as reported by the integration. |  [optional] |
| **effective** | <!----><!---->**String**<!----> | Localized, human-readable, effective status of the integration. |  [optional] |
| **detail** | <!----><!---->[**MessageInfo**](MessageInfo.html)<!----> | Localizable status details for the integration. |  [optional] |
| **lastUpdated** | <!----><!---->[**Date**](Date.html)<!----> | Date and time (in UTC) when the integration status (i.e. the code field) was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="CodeEnum"></a>

## Enum: CodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;ACTIVE&quot; | 
| ACTIVATING | &quot;ACTIVATING&quot; | 
| INACTIVE | &quot;INACTIVE&quot; | 
| DEACTIVATING | &quot;DEACTIVATING&quot; | 
| ERROR | &quot;ERROR&quot; | 
{: class="table table-striped"}



