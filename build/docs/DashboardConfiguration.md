# DashboardConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of dashboard configuration. |  |
| **rows** | **Integer** | The count of rows for the specific dashboard configuration. |  [optional] |
| **columns** | **Integer** | The count of columns for the specific dashboard. |  [optional] |
| **widgets** | [**List&lt;Widget&gt;**](Widget) | List of widgets for dashboard configuration. |  |
| **favorite** | **Boolean** | The flag indicates if the dashboard is favorited by the user |  [optional] |
| **publicDashboard** | **Boolean** | The flag to indicate if the dashboard is published by an user |  [optional] |
| **restricted** | **Boolean** | The flag to indicate if the dashboard has any restricted data for that user |  [optional] |
| **layoutType** | [**LayoutTypeEnum**](#Enum--LayoutTypeEnum) | The layout type of the dashboard |  [optional] |
| **dateCreated** | [**Date**](Date) | The created date of the dashboard. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateModified** | [**Date**](Date) | The last modified date of the dashboard. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateDeleted** | [**Date**](Date) | The deleted date of the dashboard. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **createdBy** | [**AddressableEntityRef**](AddressableEntityRef) | The id of user who created the dashboard |  [optional] |
| **shared** | **Boolean** | The flag to indicate if the dashboard is shared |  [optional] |
| **dashboardsSharedWith** | [**DashboardsSharedWith**](DashboardsSharedWith) | The list of users and teams the dashboard is shared with |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: LayoutTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GRID | &quot;Grid&quot; | 
| FLOW | &quot;Flow&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
