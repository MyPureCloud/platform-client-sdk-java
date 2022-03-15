---
title: DialerAction
---
## DialerAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of this DialerAction. |  |
| **actionTypeName** | [**ActionTypeNameEnum**](#ActionTypeNameEnum)<!----> | Additional type specification for this DialerAction. |  |
| **updateOption** | [**UpdateOptionEnum**](#UpdateOptionEnum)<!----> | Specifies how a contact attribute should be updated. Required for MODIFY_CONTACT_ATTRIBUTE. |  [optional] |
| **properties** | <!----><!---->**Map&lt;String, String&gt;**<!----> | A map of key-value pairs pertinent to the DialerAction. Different types of DialerActions require different properties. MODIFY_CONTACT_ATTRIBUTE with an updateOption of SET takes a contact column as the key and accepts any value. SCHEDULE_CALLBACK takes a key &#39;callbackOffset&#39; that specifies how far in the future the callback should be scheduled, in minutes. SET_CALLER_ID takes two keys: &#39;callerAddress&#39;, which should be the caller id phone number, and &#39;callerName&#39;. For either key, you can also specify a column on the contact to get the value from. To do this, specify &#39;contact.Column&#39;, where &#39;Column&#39; is the name of the contact column from which to get the value. SET_SKILLS takes a key &#39;skills&#39; with an array of skill ids wrapped into a string (Example: {&#39;skills&#39;: &#39;[&#39;skillIdHere&#39;]&#39;} ). |  [optional] |
| **dataAction** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The Data Action to use for this action. Required for a dataActionBehavior. |  [optional] |
| **contactColumnToDataActionFieldMappings** | <!----><!---->[**List&lt;ContactColumnToDataActionFieldMapping&gt;**](ContactColumnToDataActionFieldMapping.html)<!----> | A list of mappings defining which contact data fields will be passed to which data action input fields for this condition. Valid for a dataActionBehavior. |  [optional] |
| **contactIdField** | <!----><!---->**String**<!----> | The input field from the data action that the contactId will be passed to for this condition. Valid for a dataActionBehavior. |  [optional] |
| **callAnalysisResultField** | <!----><!---->**String**<!----> | The input field from the data action that the callAnalysisResult will be passed to for this condition. Valid for a wrapup dataActionBehavior. |  [optional] |
| **agentWrapupField** | <!----><!---->**String**<!----> | The input field from the data action that the agentWrapup will be passed to for this condition. Valid for a wrapup dataActionBehavior. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTION | &quot;Action&quot; |
| MODIFYCONTACTATTRIBUTE | &quot;modifyContactAttribute&quot; |
| DATAACTIONBEHAVIOR | &quot;dataActionBehavior&quot; |
{: class="table table-striped"}


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
| DATA_ACTION | &quot;DATA_ACTION&quot; |
{: class="table table-striped"}


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



