---
title: WfmAlternativeShiftJobCompleteEventV3AlternativeShiftJobCompleteNotification
---
## WfmAlternativeShiftJobCompleteEventV3AlternativeShiftJobCompleteNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **downloadUrl** | <!----><!---->**String**<!----> |  |  [optional] |
| **error** | <!----><!---->[**WfmAlternativeShiftJobCompleteEventV3ErrorBody**](WfmAlternativeShiftJobCompleteEventV3ErrorBody.html)<!----> |  |  [optional] |
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


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



