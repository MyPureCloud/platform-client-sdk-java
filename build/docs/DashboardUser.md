---
title: DashboardUser
---
## DashboardUser


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dashboardCount** | <!----><!---->**Integer**<!----> | The count of dashboards for the user |  [optional] |
| **publicDashboardCount** | <!----><!---->**Integer**<!----> | The count of public dashboards for the user |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the user |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
{: class="table table-striped"}



