# UpdateScheduledTriggerRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **version** | **Long** | Version of this scheduled trigger |  |
| **enabled** | **Boolean** | Boolean indicating if scheduled trigger is enabled |  |
| **target** | [**TriggerTarget**](TriggerTarget) | The target to invoke when the scheduled trigger fires |  |
| **name** | **String** | The name of the scheduled trigger. Can be up to 162 characters in length. |  |
| **schedule** | [**TriggerSchedule**](TriggerSchedule) | The schedule configuration for when this trigger should fire |  |
| **description** | **String** | Description of the trigger. Can be up to 512 characters in length. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
