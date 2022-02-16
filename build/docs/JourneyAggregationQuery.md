---
title: JourneyAggregationQuery
---
## JourneyAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | <!----><!---->**String**<!----> | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | <!----><!---->[**JourneyAggregateQueryFilter**](JourneyAggregateQueryFilter.html)<!----> | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | <!----><!---->**Boolean**<!----> | Flattens any multivalued dimensions used in response groups (e.g. [&#39;a&#39;,&#39;b&#39;,&#39;c&#39;]-&gt;&#39;a,b,c&#39;) |  [optional] |
| **views** | <!----><!---->[**List&lt;JourneyAggregationView&gt;**](JourneyAggregationView.html)<!----> | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#AlternateTimeDimensionEnum)<!----> | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \&quot;eventTime\&quot; uses the actual time of the data event. |  [optional] |
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| CONTAINSALLCONDITION | &quot;containsAllCondition&quot; |
| CONTAINSANYCONDITION | &quot;containsAnyCondition&quot; |
| ENDSWITHCONDITION | &quot;endsWithCondition&quot; |
| EQUALCONDITION | &quot;equalCondition&quot; |
| JOURNEYACTIONID | &quot;journeyActionId&quot; |
| JOURNEYACTIONMAPID | &quot;journeyActionMapId&quot; |
| JOURNEYACTIONMAPVERSION | &quot;journeyActionMapVersion&quot; |
| JOURNEYACTIONMEDIATYPE | &quot;journeyActionMediaType&quot; |
| JOURNEYACTIONTARGETID | &quot;journeyActionTargetId&quot; |
| JOURNEYACTIONTEMPLATEID | &quot;journeyActionTemplateId&quot; |
| JOURNEYBLOCKINGACTIONMAPID | &quot;journeyBlockingActionMapId&quot; |
| JOURNEYBLOCKINGEMERGENCYSCHEDULEGROUPID | &quot;journeyBlockingEmergencyScheduleGroupId&quot; |
| JOURNEYBLOCKINGREASON | &quot;journeyBlockingReason&quot; |
| JOURNEYBLOCKINGSCHEDULEGROUPID | &quot;journeyBlockingScheduleGroupId&quot; |
| JOURNEYCUSTOMERID | &quot;journeyCustomerId&quot; |
| JOURNEYCUSTOMERIDTYPE | &quot;journeyCustomerIdType&quot; |
| JOURNEYDEVICECATEGORY | &quot;journeyDeviceCategory&quot; |
| JOURNEYDEVICETYPE | &quot;journeyDeviceType&quot; |
| JOURNEYFREQUENCYCAPREASON | &quot;journeyFrequencyCapReason&quot; |
| JOURNEYOUTCOMEID | &quot;journeyOutcomeId&quot; |
| JOURNEYSEGMENTID | &quot;journeySegmentId&quot; |
| JOURNEYSEGMENTSCOPE | &quot;journeySegmentScope&quot; |
| JOURNEYSESSIONID | &quot;journeySessionId&quot; |
| JOURNEYSESSIONSEGMENTID | &quot;journeySessionSegmentId&quot; |
| JOURNEYSESSIONTYPE | &quot;journeySessionType&quot; |
| NOTCONTAINSALLCONDITION | &quot;notContainsAllCondition&quot; |
| NOTCONTAINSANYCONDITION | &quot;notContainsAnyCondition&quot; |
| NOTEQUALCONDITION | &quot;notEqualCondition&quot; |
| STARTSWITHCONDITION | &quot;startsWithCondition&quot; |
| TOUCHPOINTACTIONMAPID | &quot;touchpointActionMapId&quot; |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| NDISTINCTJOURNEYACTIONS | &quot;nDistinctJourneyActions&quot; |
| NDISTINCTJOURNEYSESSIONS | &quot;nDistinctJourneySessions&quot; |
| NJOURNEYACTIONSBLOCKED | &quot;nJourneyActionsBlocked&quot; |
| NJOURNEYOUTCOMESACHIEVED | &quot;nJourneyOutcomesAchieved&quot; |
| NJOURNEYOUTCOMESATTRIBUTED | &quot;nJourneyOutcomesAttributed&quot; |
| NJOURNEYSEGMENTSASSIGNED | &quot;nJourneySegmentsAssigned&quot; |
| NJOURNEYSESSIONS | &quot;nJourneySessions&quot; |
| NWEBACTIONSABANDONED | &quot;nWebActionsAbandoned&quot; |
| NWEBACTIONSACCEPTED | &quot;nWebActionsAccepted&quot; |
| NWEBACTIONSENGAGED | &quot;nWebActionsEngaged&quot; |
| NWEBACTIONSERRORED | &quot;nWebActionsErrored&quot; |
| NWEBACTIONSFREQUENCYCAPREACHED | &quot;nWebActionsFrequencyCapReached&quot; |
| NWEBACTIONSIGNORED | &quot;nWebActionsIgnored&quot; |
| NWEBACTIONSOFFERED | &quot;nWebActionsOffered&quot; |
| NWEBACTIONSOFFEREDOUTSIDESCHEDULE | &quot;nWebActionsOfferedOutsideSchedule&quot; |
| NWEBACTIONSQUALIFIED | &quot;nWebActionsQualified&quot; |
| NWEBACTIONSQUALIFIEDOUTSIDESCHEDULE | &quot;nWebActionsQualifiedOutsideSchedule&quot; |
| NWEBACTIONSREJECTED | &quot;nWebActionsRejected&quot; |
| NWEBACTIONSSTARTED | &quot;nWebActionsStarted&quot; |
| NWEBACTIONSTIMEDOUT | &quot;nWebActionsTimedout&quot; |
| OJOURNEYOUTCOMEVALUE | &quot;oJourneyOutcomeValue&quot; |
{: class="table table-striped"}


<a name="AlternateTimeDimensionEnum"></a>

## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EVENTTIME | &quot;eventTime&quot; |
{: class="table table-striped"}



