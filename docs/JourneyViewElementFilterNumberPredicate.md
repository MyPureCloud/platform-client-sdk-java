# JourneyViewElementFilterNumberPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dimension** | **String** | the element's attribute being filtered on |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Optional operator, default is Matches. Valid values: Matches |  [optional] |
| **noValue** | **Boolean** | set this to true if no specific value to be considered |  [optional] |
| **range** | [**JourneyViewElementFilterRange**](JourneyViewElementFilterRange) | the range of comparators to filter on |  |
{: class="table table-striped"}


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;Matches&quot; | 
| NOTMATCHES | &quot;NotMatches&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
