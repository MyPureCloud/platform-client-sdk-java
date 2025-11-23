# DecisionTableColumnDefaultRowValue


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **value** | **String** | A default string value for this column, will be cast to appropriate type according to the relevant contract schema property. |  [optional] |
| **values** | **List&lt;String&gt;** | A default list of values for this column, items will be cast to appropriate type according to the relevant contract schema property |  [optional] |
| **special** | [**SpecialEnum**](#Enum--SpecialEnum) | A default special value enum for this column. |  [optional] |


## Enum: SpecialEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WILDCARD | &quot;Wildcard&quot; | 
| NULL | &quot;Null&quot; | 
| EMPTY | &quot;Empty&quot; | 
| CURRENTTIME | &quot;CurrentTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
