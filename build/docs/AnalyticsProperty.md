# AnalyticsProperty


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **property** | **String** | User-defined rather than intrinsic system-observed values. These are tagged onto segments by other components within PureCloud or by API users directly.  This is the name of the user-defined property. |  [optional] |
| **propertyType** | [**PropertyTypeEnum**](#Enum--PropertyTypeEnum) | Indicates what the data type is (e.g. integer vs string) and therefore how to evaluate what would constitute a match |  [optional] |
| **value** | **String** | What property value to match against |  [optional] |


## Enum: PropertyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BOOL | &quot;bool&quot; | 
| INTEGER | &quot;integer&quot; | 
| REAL | &quot;real&quot; | 
| DATE | &quot;date&quot; | 
| STRING | &quot;string&quot; | 
| UUID | &quot;uuid&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
