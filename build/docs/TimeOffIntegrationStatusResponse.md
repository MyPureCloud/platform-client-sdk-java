---
title: TimeOffIntegrationStatusResponse
---
## TimeOffIntegrationStatusResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffRequest** | <!----><!---->[**TimeOffRequestReference**](TimeOffRequestReference.html)<!----> | The time off request associated with this integration status |  |
| **integrationStatus** | [**IntegrationStatusEnum**](#IntegrationStatusEnum)<!----> | The value of integration status for the time off request |  |
{: class="table table-striped"}


<a name="IntegrationStatusEnum"></a>

## Enum: IntegrationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| ERROR | &quot;Error&quot; | 
| AUTOMATICALLYCOMPLETE | &quot;AutomaticallyComplete&quot; | 
| MANUALLYCOMPLETE | &quot;ManuallyComplete&quot; | 
{: class="table table-striped"}



