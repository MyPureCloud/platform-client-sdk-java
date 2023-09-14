---
title: LocaleInfo
---
## LocaleInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of health computation for this flow version. |  [optional] |
| **errorInfo** | <!----><!---->[**FlowHealthErrorInfo**](FlowHealthErrorInfo.html)<!----> | Error details for the flow version, if any. |  [optional] |
| **flowVersionInfo** | <!----><!---->[**LocaleFlowVersionInfo**](LocaleFlowVersionInfo.html)<!----> | Info about given flow version. |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



