# CapacityPlanForecastPlanningGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **planningGroupId** | **String** | The ID of the planning group to which the forecast applies |  |
| **actual** | [**CapacityPlanForecastActualValues**](CapacityPlanForecastActualValues) | Absolute forecast values for offered counts and average handle time for this planning group. Exactly one of actual or distribution must be provided |  [optional] |
| **distribution** | [**CapacityPlanForecastDistributionValues**](CapacityPlanForecastDistributionValues) | Hourly forecast distribution values for offered volume and average handle time for this planning group. Exactly one of actual or distribution must be provided |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
