---
title: CreateAlternativeShiftTradeRequest
---
## CreateAlternativeShiftTradeRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **jobId** | <!----><!---->**String**<!----> | The ID of this alternative shift job |  |
| **dropShiftReferenceKeys** | <!----><!---->**List&lt;String&gt;**<!----> | A list of offered shift reference keys an agent wants to drop |  [optional] |
| **pickupShiftReferenceKeys** | <!----><!---->**List&lt;String&gt;**<!----> | A list of offered shift reference keys an agent wants to pick up |  [optional] |
| **alternativeShiftTradeGranularity** | [**AlternativeShiftTradeGranularityEnum**](#AlternativeShiftTradeGranularityEnum)<!----> | The granularity of alternative shifts to be traded |  |
| **expirationDate** | <!----><!---->[**Date**](Date.html)<!----> | The date when the trade will expire in ISO-8601 format. The trade cannot be approved after expiration |  [optional] |
{: class="table table-striped"}


<a name="AlternativeShiftTradeGranularityEnum"></a>

## Enum: AlternativeShiftTradeGranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
{: class="table table-striped"}



