---
title: CommonRulePredicate
---
## CommonRulePredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metricType** | [**MetricTypeEnum**](#MetricTypeEnum)<!----> | The type of metric being evaluated. |  |
| **metricValueType** | [**MetricValueTypeEnum**](#MetricValueTypeEnum)<!----> | The type of metric value being evaluated. |  |
| **comparisonOperator** | [**ComparisonOperatorEnum**](#ComparisonOperatorEnum)<!----> | The comparison operator being performed on the metric. |  |
| **value** | <!----><!---->**Double**<!----> | The value the metric will be compared to. |  |
| **status** | <!----><!---->**String**<!----> | The status of the entity corresponding to the metric. |  [optional] |
| **entity** | <!----><!---->[**CommonRulePredicateEntity**](CommonRulePredicateEntity.html)<!----> | The entity whose metric is being represented. |  |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The media type of the conversation the metric describes. |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | The metric being evaluated. |  |
{: class="table table-striped"}


<a name="MetricTypeEnum"></a>

## Enum: MetricTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTERVAL | &quot;Interval&quot; | 
| INSTANCE | &quot;Instance&quot; | 
{: class="table table-striped"}


<a name="MetricValueTypeEnum"></a>

## Enum: MetricValueTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COUNT | &quot;Count&quot; | 
| MIN | &quot;Min&quot; | 
| TIMER | &quot;Timer&quot; | 
| MAX | &quot;Max&quot; | 
| PERCENTAGE | &quot;Percentage&quot; | 
| AVERAGE | &quot;Average&quot; | 
| OBSERVATION | &quot;Observation&quot; | 
{: class="table table-striped"}


<a name="ComparisonOperatorEnum"></a>

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
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| CHAT | &quot;Chat&quot; | 
| EMAIL | &quot;Email&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| MESSAGE | &quot;Message&quot; | 
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NABANDON | &quot;nAbandon&quot; | 
| NCONNECTED | &quot;nConnected&quot; | 
| NINTERACTIONS | &quot;nInteractions&quot; | 
| NOFFERED | &quot;nOffered&quot; | 
| NOUTBOUND | &quot;nOutbound&quot; | 
| NTRANSFERRED | &quot;nTransferred&quot; | 
| SERVICELEVEL | &quot;serviceLevel&quot; | 
| OSERVICELEVEL | &quot;oServiceLevel&quot; | 
| OWAITING | &quot;oWaiting&quot; | 
| TABANDON | &quot;tAbandon&quot; | 
| TACW | &quot;tAcw&quot; | 
| TALERT | &quot;tAlert&quot; | 
| TANSWERED | &quot;tAnswered&quot; | 
| THANDLE | &quot;tHandle&quot; | 
| THELDCOMPLETE | &quot;tHeldComplete&quot; | 
| TTALKCOMPLETE | &quot;tTalkComplete&quot; | 
| TWAIT | &quot;tWait&quot; | 
| TTALK | &quot;tTalk&quot; | 
| THELD | &quot;tHeld&quot; | 
| TORGANIZATIONPRESENCE | &quot;tOrganizationPresence&quot; | 
| TSYSTEMPRESENCE | &quot;tSystemPresence&quot; | 
| TAGENTROUTINGSTATUS | &quot;tAgentRoutingStatus&quot; | 
| OUSERROUTINGSTATUSES | &quot;oUserRoutingStatuses&quot; | 
| OUSERPRESENCES | &quot;oUserPresences&quot; | 
| OINTERACTING | &quot;oInteracting&quot; | 
| TFLOWOUT | &quot;tFlowOut&quot; | 
| TADHERENCESTATUS | &quot;tAdherenceStatus&quot; | 
{: class="table table-striped"}



