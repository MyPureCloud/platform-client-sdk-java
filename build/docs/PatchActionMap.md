---
title: PatchActionMap
---
## PatchActionMap


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | The version of the action map. |  [optional] |
| **isActive** | <!----><!---->**Boolean**<!----> | Whether the action map is active. |  [optional] |
| **displayName** | <!----><!---->**String**<!----> | Display name of the action map. |  |
| **triggerWithSegments** | <!----><!---->**List&lt;String&gt;**<!----> | Trigger action map if any segment in the list is assigned to a given customer. |  |
| **triggerWithEventConditions** | <!----><!---->[**List&lt;EventCondition&gt;**](EventCondition.html)<!----> | List of event conditions that must be satisfied to trigger the action map. |  [optional] |
| **triggerWithOutcomeProbabilityConditions** | <!----><!---->[**List&lt;OutcomeProbabilityCondition&gt;**](OutcomeProbabilityCondition.html)<!----> | Probability conditions for outcomes that must be satisfied to trigger the action map. |  [optional] |
| **pageUrlConditions** | <!----><!---->[**List&lt;UrlCondition&gt;**](UrlCondition.html)<!----> | URL conditions that a page must match for web actions to be displayable. |  |
| **activation** | <!----><!---->[**Activation**](Activation.html)<!----> | Type of activation. |  [optional] |
| **weight** | <!----><!---->**Integer**<!----> | Weight of the action map with higher number denoting higher weight. |  [optional] |
| **action** | <!----><!---->[**PatchAction**](PatchAction.html)<!----> | The action that will be executed if this action map is triggered. |  [optional] |
| **actionMapScheduleGroups** | <!----><!---->[**PatchActionMapScheduleGroups**](PatchActionMapScheduleGroups.html)<!----> | The action map's associated schedule groups. |  [optional] |
| **ignoreFrequencyCap** | <!----><!---->**Boolean**<!----> | Override organization-level frequency cap and always offer web engagements from this action map. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp indicating when the action map was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedDate** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp indicating when the action map was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp at which the action map is scheduled to start firing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp at which the action map is scheduled to stop firing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}



