# BuAlternativeShiftJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the alternative shift job |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of job |  |
| **downloadUrl** | **String** | The URL where completed results are available, only set if status == 'Complete' |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Any error information, only set if the status == 'Error' |  [optional] |
| **viewOffersResults** | [**AlternativeShiftOffersViewResponseTemplate**](AlternativeShiftOffersViewResponseTemplate) | Schema template for deserializing data returned from the downloadUrl. Use if type == 'ListOffers' or 'SearchOffers' |  [optional] |
| **viewTradesResults** | [**AlternativeShiftTradesViewResponseTemplate**](AlternativeShiftTradesViewResponseTemplate) | Schema template for deserializing data returned from the downloadUrl. Use if type == 'ListUserTrades' or 'SearchTrades' |  [optional] |
| **bulkUpdateTradesResults** | [**AlternativeShiftBulkUpdateTradesResponseTemplate**](AlternativeShiftBulkUpdateTradesResponseTemplate) | Schema template for deserializing data returned from the downloadUrl. Use if type == 'BulkUpdateTrades' |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LISTOFFERS | &quot;ListOffers&quot; | 
| SEARCHOFFERS | &quot;SearchOffers&quot; | 
| LISTUSERTRADES | &quot;ListUserTrades&quot; | 
| SEARCHTRADES | &quot;SearchTrades&quot; | 
| BULKUPDATETRADES | &quot;BulkUpdateTrades&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
