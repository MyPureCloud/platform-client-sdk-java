---
title: TaskManagementAggregationQuery
---
## TaskManagementAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | <!----><!---->**String**<!----> | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | <!----><!---->[**TaskManagementAggregateQueryFilter**](TaskManagementAggregateQueryFilter.html)<!----> | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | <!----><!---->**Boolean**<!----> | Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c') |  [optional] |
| **views** | <!----><!---->[**List&lt;TaskManagementAggregationView&gt;**](TaskManagementAggregationView.html)<!----> | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#AlternateTimeDimensionEnum)<!----> | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event. |  [optional] |
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| ASSIGNEEID | &quot;assigneeId&quot; |
| DIVISIONID | &quot;divisionId&quot; |
| EXTERNALTAG | &quot;externalTag&quot; |
| QUEUEID | &quot;queueId&quot; |
| REPORTERID | &quot;reporterId&quot; |
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; |
| REQUESTEDROUTING | &quot;requestedRouting&quot; |
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; |
| STATUSCATEGORY | &quot;statusCategory&quot; |
| STATUSID | &quot;statusId&quot; |
| TYPEID | &quot;typeId&quot; |
| USEDROUTING | &quot;usedRouting&quot; |
| USERID | &quot;userId&quot; |
| WORKBINID | &quot;workbinId&quot; |
| WORKITEMID | &quot;workitemId&quot; |
| WRAPUPCODE | &quot;wrapUpCode&quot; |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| NWORKITEMSACDCANCELLED | &quot;nWorkitemsAcdCancelled&quot; |
| NWORKITEMSACDEXPIRED | &quot;nWorkitemsAcdExpired&quot; |
| NWORKITEMSACDSTARTED | &quot;nWorkitemsAcdStarted&quot; |
| NWORKITEMSAGENTTRANSFERRED | &quot;nWorkitemsAgentTransferred&quot; |
| NWORKITEMSCREATED | &quot;nWorkitemsCreated&quot; |
| NWORKITEMSDECLINED | &quot;nWorkitemsDeclined&quot; |
| NWORKITEMSDELETED | &quot;nWorkitemsDeleted&quot; |
| NWORKITEMSDISCONNECTED | &quot;nWorkitemsDisconnected&quot; |
| NWORKITEMSOVERSLA | &quot;nWorkitemsOverSla&quot; |
| NWORKITEMSPURGED | &quot;nWorkitemsPurged&quot; |
| NWORKITEMSQUEUETRANSFERRED | &quot;nWorkitemsQueueTransferred&quot; |
| NWORKITEMSSTATUSCHANGED | &quot;nWorkitemsStatusChanged&quot; |
| NWORKITEMSTERMINATED | &quot;nWorkitemsTerminated&quot; |
| NWORKITEMSTIMEDOUT | &quot;nWorkitemsTimedout&quot; |
| NWORKITEMSTRANSFERRED | &quot;nWorkitemsTransferred&quot; |
| NWORKITEMSWRAPUPADDED | &quot;nWorkitemsWrapupAdded&quot; |
| NWORKITEMSWRAPUPREMOVED | &quot;nWorkitemsWrapupRemoved&quot; |
| OWORKITEMSSERVICELEVEL | &quot;oWorkitemsServiceLevel&quot; |
| TWORKITEMSALERT | &quot;tWorkitemsAlert&quot; |
| TWORKITEMSANSWERED | &quot;tWorkitemsAnswered&quot; |
| TWORKITEMSDIRECTANSWERED | &quot;tWorkitemsDirectAnswered&quot; |
| TWORKITEMSFOCUS | &quot;tWorkitemsFocus&quot; |
| TWORKITEMSFOCUSCOMPLETE | &quot;tWorkitemsFocusComplete&quot; |
| TWORKITEMSHANDLED | &quot;tWorkitemsHandled&quot; |
| TWORKITEMSHELD | &quot;tWorkitemsHeld&quot; |
| TWORKITEMSHELDCOMPLETE | &quot;tWorkitemsHeldComplete&quot; |
| TWORKITEMSNOTRESPONDING | &quot;tWorkitemsNotResponding&quot; |
| TWORKITEMSPARKED | &quot;tWorkitemsParked&quot; |
| TWORKITEMSQUEUEANSWERED | &quot;tWorkitemsQueueAnswered&quot; |
| TWORKITEMSSTATUS | &quot;tWorkitemsStatus&quot; |
{: class="table table-striped"}


<a name="AlternateTimeDimensionEnum"></a>

## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 
{: class="table table-striped"}



