---
title: WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification
---
## WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **entities** | <!----><!---->[**List&lt;WfmTimeOffBalanceJobTopicTimeOffBalance&gt;**](WfmTimeOffBalanceJobTopicTimeOffBalance.html)<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **error** | <!----><!---->[**WfmTimeOffBalanceJobTopicErrorBody**](WfmTimeOffBalanceJobTopicErrorBody.html)<!----> |  |  [optional] |
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



