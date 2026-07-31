# ScheduledTrigger


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the scheduled trigger. Can be up to 162 characters in length. |  [optional] |
| **target** | [**TriggerTarget**](TriggerTarget) | The target to invoke when the scheduled trigger fires |  [optional] |
| **version** | **Long** | Version of this scheduled trigger |  [optional] |
| **enabled** | **Boolean** | Whether or not the scheduled trigger is enabled |  [optional] |
| **schedule** | [**TriggerSchedule**](TriggerSchedule) | The schedule configuration for when this trigger should fire |  [optional] |
| **description** | **String** | Description of the trigger. Can be up to 512 characters in length. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
