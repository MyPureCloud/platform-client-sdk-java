---
title: DialerAction
---
## DialerAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum) | Type of the action |  |
| **actionTypeName** | [**ActionTypeNameEnum**](#ActionTypeNameEnum) | Identifier of the action |  |
| **updateOption** | [**UpdateOptionEnum**](#UpdateOptionEnum) | Indicator of the type of update action (applicable only to certain types of actions) |  [optional] |
| **properties** | **Map&lt;String, String&gt;** | Map of key-value pairs pertinent to the action (different actions require different properties) |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTION | &quot;Action&quot; |
| MODIFYCONTACTATTRIBUTE | &quot;modifyContactAttribute&quot; |


<a name="ActionTypeNameEnum"></a>

## Enum: ActionTypeNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DO_NOT_DIAL | &quot;DO_NOT_DIAL&quot; |
| MODIFY_CONTACT_ATTRIBUTE | &quot;MODIFY_CONTACT_ATTRIBUTE&quot; |
| SWITCH_TO_PREVIEW | &quot;SWITCH_TO_PREVIEW&quot; |
| APPEND_NUMBER_TO_DNC_LIST | &quot;APPEND_NUMBER_TO_DNC_LIST&quot; |
| SCHEDULE_CALLBACK | &quot;SCHEDULE_CALLBACK&quot; |
| CONTACT_UNCALLABLE | &quot;CONTACT_UNCALLABLE&quot; |
| NUMBER_UNCALLABLE | &quot;NUMBER_UNCALLABLE&quot; |
| SET_CALLER_ID | &quot;SET_CALLER_ID&quot; |
| SET_SKILLS | &quot;SET_SKILLS&quot; |


<a name="UpdateOptionEnum"></a>

## Enum: UpdateOptionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SET | &quot;SET&quot; |
| INCREMENT | &quot;INCREMENT&quot; |
| DECREMENT | &quot;DECREMENT&quot; |
| CURRENT_TIME | &quot;CURRENT_TIME&quot; |
{: class="table table-striped"}


