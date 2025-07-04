# JourneyAsyncAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | **String** | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | **String** | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | [**JourneyAggregateQueryFilter**](JourneyAggregateQueryFilter) | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | **Boolean** | Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c') |  [optional] |
| **views** | [**List&lt;JourneyAggregationView&gt;**](JourneyAggregationView) | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#Enum--AlternateTimeDimensionEnum) | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event. |  [optional] |
| **pageSize** | **Integer** | The number of results per page |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
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
| JOURNEYDEVICECATEGORY | &quot;journeyDeviceCategory&quot; |
| JOURNEYDEVICETYPE | &quot;journeyDeviceType&quot; |
| JOURNEYFREQUENCYCAPREASON | &quot;journeyFrequencyCapReason&quot; |
| JOURNEYIPGEOLOCATIONCOUNTRY | &quot;journeyIpGeolocationCountry&quot; |
| JOURNEYOUTCOMEID | &quot;journeyOutcomeId&quot; |
| JOURNEYSEGMENTASSIGNMENTSTATE | &quot;journeySegmentAssignmentState&quot; |
| JOURNEYSEGMENTID | &quot;journeySegmentId&quot; |
| JOURNEYSESSIONID | &quot;journeySessionId&quot; |
| JOURNEYSESSIONSEGMENTID | &quot;journeySessionSegmentId&quot; |
| JOURNEYSESSIONTYPE | &quot;journeySessionType&quot; |
| NOTCONTAINSALLCONDITION | &quot;notContainsAllCondition&quot; |
| NOTCONTAINSANYCONDITION | &quot;notContainsAnyCondition&quot; |
| NOTEQUALCONDITION | &quot;notEqualCondition&quot; |
| STARTSWITHCONDITION | &quot;startsWithCondition&quot; |
| TOUCHPOINTACTIONMAPID | &quot;touchpointActionMapId&quot; |
| TOUCHPOINTAGENTID | &quot;touchpointAgentId&quot; |
| TOUCHPOINTATTRIBUTIONSCOPE | &quot;touchpointAttributionScope&quot; |
| TOUCHPOINTCHANNELMESSAGETYPE | &quot;touchpointChannelMessageType&quot; |
| TOUCHPOINTCHANNELPLATFORM | &quot;touchpointChannelPlatform&quot; |
| TOUCHPOINTCHANNELTYPE | &quot;touchpointChannelType&quot; |
| TOUCHPOINTCONVERSATIONID | &quot;touchpointConversationId&quot; |
| TOUCHPOINTINTERACTIONTYPE | &quot;touchpointInteractionType&quot; |
| TOUCHPOINTQUEUEID | &quot;touchpointQueueId&quot; |
| TOUCHPOINTREQUESTEDROUTING | &quot;touchpointRequestedRouting&quot; |
| TOUCHPOINTUSEDROUTING | &quot;touchpointUsedRouting&quot; |
| TOUCHPOINTWRAPUPCODE | &quot;touchpointWrapupCode&quot; |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
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
| OJOURNEYOUTCOMETOUCHPOINTVALUE | &quot;oJourneyOutcomeTouchpointValue&quot; |
| OJOURNEYOUTCOMEVALUE | &quot;oJourneyOutcomeValue&quot; |


## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
