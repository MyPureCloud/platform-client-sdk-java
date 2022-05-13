---
title: SmsProvisioningStatus
---
## SmsProvisioningStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#ActionEnum)<!----> | Provisioning action |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Provisioning state |  [optional] |
| **error** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Any error associated with a Failed state |  [optional] |
| **version** | <!----><!---->**Long**<!----> | The phone number version associated with the provisioning action |  [optional] |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| CREATE | &quot;Create&quot; | 
| UPDATE | &quot;Update&quot; | 
| DELETE | &quot;Delete&quot; | 
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNNING | &quot;Running&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



