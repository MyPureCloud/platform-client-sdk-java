# V2MobiusAlertsTopicConditionRulePredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **entity** | [**V2MobiusAlertsTopicEntityProperties**](V2MobiusAlertsTopicEntityProperties) |  |  [optional] |
| **metric** | **String** |  |  [optional] |
| **metricType** | [**MetricTypeEnum**](#Enum--MetricTypeEnum) |  |  [optional] |
| **metricValueType** | [**MetricValueTypeEnum**](#Enum--MetricValueTypeEnum) |  |  [optional] |
| **value** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **status** | **String** |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **comparisonOperator** | [**ComparisonOperatorEnum**](#Enum--ComparisonOperatorEnum) |  |  [optional] |
{: class="table table-striped"}


## Enum: MetricTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTERVAL | &quot;Interval&quot; | 
| INSTANCE | &quot;Instance&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


## Enum: MetricValueTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COUNT | &quot;Count&quot; | 
| PERCENTAGE | &quot;Percentage&quot; | 
| AVERAGE | &quot;Average&quot; | 
| TIMER | &quot;Timer&quot; | 
| OBSERVATION | &quot;Observation&quot; | 
| MIN | &quot;Min&quot; | 
| MAX | &quot;Max&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| CHAT | &quot;Chat&quot; | 
| EMAIL | &quot;Email&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| MESSAGE | &quot;Message&quot; | 
| SCREENSHARE | &quot;Screenshare&quot; | 
| COBROWSE | &quot;Cobrowse&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


## Enum: ComparisonOperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GT | &quot;Gt&quot; | 
| GTE | &quot;Gte&quot; | 
| LT | &quot;Lt&quot; | 
| LTE | &quot;Lte&quot; | 
| EQ | &quot;Eq&quot; | 
| NE | &quot;Ne&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
