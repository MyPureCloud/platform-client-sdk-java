# WorkPlanOverrideRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The action to perform on work plan override, defaults to add |  [optional] |
| **startDate** | [**LocalDate**](LocalDate) | The start date in yyyy-MM-dd format for the updated work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **weekCount** | **Integer** | The week count of the updated work plan, required if action is Add or Update |  [optional] |
| **workPlanId** | **String** | The updated work plan id |  [optional] |


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADD | &quot;Add&quot; | 
| UPDATE | &quot;Update&quot; | 
| DELETE | &quot;Delete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
