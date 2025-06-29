# JourneyViewElementFilterPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dimension** | **String** | the element's attribute being filtered on |  |
| **values** | **List&lt;String&gt;** | the values of the attribute to filter on |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Optional operator, default is Matches. Valid values: Matches |  [optional] |
| **noValue** | **Boolean** | set this to true if no specific value to be considered |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;Matches&quot; | 
| NOTMATCHES | &quot;NotMatches&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
