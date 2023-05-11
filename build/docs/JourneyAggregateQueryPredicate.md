---
title: JourneyAggregateQueryPredicate
---
## JourneyAggregateQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension predicates |  [optional] |
| **range** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | Right hand side for dimension predicates |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIMENSION | &quot;dimension&quot; | 
| PROPERTY | &quot;property&quot; | 
| METRIC | &quot;metric&quot; | 
{: class="table table-striped"}


<a name="DimensionEnum"></a>

## Enum: DimensionEnum

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
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 
{: class="table table-striped"}



