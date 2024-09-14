# JourneyWebActionEventsNotificationBlockedWebActionOfferMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**JourneyWebActionEventsNotificationEventAction**](JourneyWebActionEventsNotificationEventAction) |  |  [optional] |
| **actionMap** | [**JourneyWebActionEventsNotificationActionMap**](JourneyWebActionEventsNotificationActionMap) |  |  [optional] |
| **actionTarget** | [**JourneyWebActionEventsNotificationActionTarget**](JourneyWebActionEventsNotificationActionTarget) |  |  [optional] |
| **blockingReason** | [**BlockingReasonEnum**](#Enum--BlockingReasonEnum) |  |  [optional] |
| **blockingActionMap** | [**JourneyWebActionEventsNotificationActionMap**](JourneyWebActionEventsNotificationActionMap) |  |  [optional] |
| **blockingAction** | [**JourneyWebActionEventsNotificationEventAction**](JourneyWebActionEventsNotificationEventAction) |  |  [optional] |
| **blockingFrequencyCapBehaviour** | [**BlockingFrequencyCapBehaviourEnum**](#Enum--BlockingFrequencyCapBehaviourEnum) |  |  [optional] |
| **blockingPageUrlConditions** | [**List&lt;JourneyWebActionEventsNotificationActionMapPageUrlCondition&gt;**](JourneyWebActionEventsNotificationActionMapPageUrlCondition) |  |  [optional] |
| **blockingScheduleGroup** | [**JourneyWebActionEventsNotificationScheduleGroup**](JourneyWebActionEventsNotificationScheduleGroup) |  |  [optional] |
| **blockingEmergencyScheduleGroup** | [**JourneyWebActionEventsNotificationEmergencyGroup**](JourneyWebActionEventsNotificationEmergencyGroup) |  |  [optional] |


## Enum: BlockingReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| PAGEURLCONDITIONSNOTMATCHING | &quot;PageUrlConditionsNotMatching&quot; | 
| SERVICELEVELTHROTTLING | &quot;ServiceLevelThrottling&quot; | 
| ALREADYEXISTINGOFFER | &quot;AlreadyExistingOffer&quot; | 
| TRIGGERDATEINFUTURE | &quot;TriggerDateInFuture&quot; | 
| MULTIPLESIMULTANEOUSOFFERS | &quot;MultipleSimultaneousOffers&quot; | 
| NOAVAILABLEAGENTS | &quot;NoAvailableAgents&quot; | 
| FREQUENCYCAPPING | &quot;FrequencyCapping&quot; | 
| OFFEREDOUTSIDESCHEDULE | &quot;OfferedOutsideSchedule&quot; | 


## Enum: BlockingFrequencyCapBehaviourEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| CAPONCEFINALIZED | &quot;CapOnceFinalized&quot; | 
| CAPONCEREJECTED | &quot;CapOnceRejected&quot; | 
| CAPFORPERIOD | &quot;CapForPeriod&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
