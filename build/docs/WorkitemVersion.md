---
title: WorkitemVersion
---
## WorkitemVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the Workitem. |  [optional] |
| **division** | <!----><!---->[**Division**](Division.html)<!----> | The division to which this entity belongs. |  [optional] |
| **type** | <!----><!---->[**WorktypeReference**](WorktypeReference.html)<!----> | The Worktype of the Workitem. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the Workitem. |  [optional] |
| **language** | <!----><!---->[**LanguageReference**](LanguageReference.html)<!----> | The language of the Workitem. |  [optional] |
| **utilizationLabel** | <!----><!---->[**WorkitemUtilizationLabelReference**](WorkitemUtilizationLabelReference.html)<!----> | The utilization label of the Workitem. |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of the Workitem. The valid range is between -25,000,000 and 25,000,000. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The creation date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The modified date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateDue** | <!----><!---->[**Date**](Date.html)<!----> | The due date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateExpires** | <!----><!---->[**Date**](Date.html)<!----> | The expiry date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **durationSeconds** | <!----><!---->**Integer**<!----> | The estimated duration in seconds to complete the workitem. |  [optional] |
| **ttl** | <!----><!---->**Integer**<!----> | The time to live of the Workitem in seconds. |  [optional] |
| **status** | <!----><!---->[**WorkitemStatusReference**](WorkitemStatusReference.html)<!----> | The current Status of the Workitem. |  [optional] |
| **statusCategory** | [**StatusCategoryEnum**](#StatusCategoryEnum)<!----> | The Category of the current Status of the Workitem. |  [optional] |
| **dateStatusChanged** | <!----><!---->[**Date**](Date.html)<!----> | The State change date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateClosed** | <!----><!---->[**Date**](Date.html)<!----> | The date the Workitem was closed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **workbin** | <!----><!---->[**WorkbinReference**](WorkbinReference.html)<!----> | The Workbin that contains the Workitem. |  [optional] |
| **reporter** | <!----><!---->[**UserReferenceWithName**](UserReferenceWithName.html)<!----> | The reporter of the Workitem. |  [optional] |
| **assignee** | <!----><!---->[**UserReferenceWithName**](UserReferenceWithName.html)<!----> | The assignee of the Workitem. |  [optional] |
| **externalContact** | <!----><!---->[**ExternalContactReference**](ExternalContactReference.html)<!----> | The external contact of the Workitem. |  [optional] |
| **externalTag** | <!----><!---->**String**<!----> | The external tag of the Workitem. |  [optional] |
| **modifiedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The User who modified the Workitem. |  [optional] |
| **queue** | <!----><!---->[**WorkitemQueueReference**](WorkitemQueueReference.html)<!----> | The Workitems queue. |  [optional] |
| **assignmentState** | [**AssignmentStateEnum**](#AssignmentStateEnum)<!----> | The assignment state of the workitem. |  [optional] |
| **dateAssignmentStateChanged** | <!----><!---->[**Date**](Date.html)<!----> | The assignment state change date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **alertTimeoutSeconds** | <!----><!---->**Integer**<!----> | The duration in seconds before an alert will timeout. |  [optional] |
| **skills** | <!----><!---->[**List&lt;RoutingSkillReference&gt;**](RoutingSkillReference.html)<!----> | The skills of the Workitem. |  [optional] |
| **preferredAgents** | <!----><!---->[**List&lt;UserReference&gt;**](UserReference.html)<!----> | The preferred agents of the Workitem. |  [optional] |
| **autoStatusTransition** | <!----><!---->**Boolean**<!----> | Set it to false to disable auto status transition. By default, it is enabled. |  [optional] |
| **schema** | <!----><!---->[**WorkitemSchema**](WorkitemSchema.html)<!----> | The schema defining the custom fields of the Workitem. The schema is inherited from the Workitems Worktype at creation time. |  [optional] |
| **customFields** | <!----><!---->**Map&lt;String, Object&gt;**<!----> | Custom fields defined in the schema referenced by the Workitem. |  [optional] |
| **autoStatusTransitionDetail** | <!----><!---->[**AutoStatusTransitionDetail**](AutoStatusTransitionDetail.html)<!----> | Auto status transition details of Workitem. |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;WorkitemScoredAgent&gt;**](WorkitemScoredAgent.html)<!----> | A list of scored agents for the Workitem. |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Version |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusCategoryEnum"></a>

## Enum: StatusCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPEN | &quot;Open&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| WAITING | &quot;Waiting&quot; | 
| CLOSED | &quot;Closed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


<a name="AssignmentStateEnum"></a>

## Enum: AssignmentStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ACDSTARTED | &quot;AcdStarted&quot; | 
| ALERTING | &quot;Alerting&quot; | 
| ALERTTIMEOUT | &quot;AlertTimeout&quot; | 
| ACDCANCELLED | &quot;AcdCancelled&quot; | 
| TERMINATED | &quot;Terminated&quot; | 
| IDLE | &quot;Idle&quot; | 
| DECLINED | &quot;Declined&quot; | 
| CONNECTED | &quot;Connected&quot; | 
| DISCONNECTED | &quot;Disconnected&quot; | 
| PARKED | &quot;Parked&quot; | 
| HELD | &quot;Held&quot; | 
| ACDEXPIRED | &quot;AcdExpired&quot; | 
{: class="table table-striped"}



