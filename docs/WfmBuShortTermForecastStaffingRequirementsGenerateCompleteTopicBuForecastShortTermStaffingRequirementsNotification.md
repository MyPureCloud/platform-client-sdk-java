# WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuForecastShortTermStaffingRequirementsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessUnitId** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **forecast** | [**WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference**](WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference) |  |  [optional] |
| **weekCount** | **Integer** |  |  [optional] |
| **intervalLengthMinutes** | **Integer** |  |  [optional] |
| **referenceStartDate** | [**Date**](Date) |  |  [optional] |
| **results** | [**List&lt;WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuForecastShortTermStaffingRequirementsResults&gt;**](WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuForecastShortTermStaffingRequirementsResults) |  |  [optional] |
{: class="table table-striped"}


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
