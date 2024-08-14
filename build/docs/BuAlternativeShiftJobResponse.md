---
title: BuAlternativeShiftJobResponse
---
## BuAlternativeShiftJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the alternative shift job |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of job |  |
| **downloadUrl** | <!----><!---->**String**<!----> | The URL where completed results are available, only set if status == 'Complete' |  [optional] |
| **error** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Any error information, only set if the status == 'Error' |  [optional] |
| **viewOffersResults** | <!----><!---->[**AlternativeShiftOffersViewResponseTemplate**](AlternativeShiftOffersViewResponseTemplate.html)<!----> | Schema template for deserializing data returned from the downloadUrl. Use if type == 'ListOffers' or 'SearchOffers' |  [optional] |
| **viewTradesResults** | <!----><!---->[**AlternativeShiftTradesViewResponseTemplate**](AlternativeShiftTradesViewResponseTemplate.html)<!----> | Schema template for deserializing data returned from the downloadUrl. Use if type == 'ListUserTrades' or 'SearchTrades' |  [optional] |
| **bulkUpdateTradesResults** | <!----><!---->[**AlternativeShiftBulkUpdateTradesResponseTemplate**](AlternativeShiftBulkUpdateTradesResponseTemplate.html)<!----> | Schema template for deserializing data returned from the downloadUrl. Use if type == 'BulkUpdateTrades' |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LISTOFFERS | &quot;ListOffers&quot; | 
| SEARCHOFFERS | &quot;SearchOffers&quot; | 
| LISTUSERTRADES | &quot;ListUserTrades&quot; | 
| SEARCHTRADES | &quot;SearchTrades&quot; | 
| BULKUPDATETRADES | &quot;BulkUpdateTrades&quot; | 
{: class="table table-striped"}



