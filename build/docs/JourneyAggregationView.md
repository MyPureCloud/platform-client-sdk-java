# JourneyAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#Enum--TargetEnum) | Target metric name |  |
| **name** | **String** | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#Enum--FunctionEnum) | Type of view you wish to create |  |
| **range** | [**AggregationRange**](AggregationRange) | Range of numbers for slicing up data |  [optional] |
{: class="table table-striped"}


## Enum: TargetEnum

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
{: class="table table-striped"}


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
