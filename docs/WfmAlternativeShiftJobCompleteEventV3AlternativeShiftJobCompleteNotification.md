# WfmAlternativeShiftJobCompleteEventV3AlternativeShiftJobCompleteNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **downloadUrl** | **String** |  |  [optional] |
| **error** | [**WfmAlternativeShiftJobCompleteEventV3ErrorBody**](WfmAlternativeShiftJobCompleteEventV3ErrorBody) |  |  [optional] |
{: class="table table-striped"}


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


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
