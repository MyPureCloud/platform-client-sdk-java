# JourneySegmentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **isActive** | **Boolean** | Whether or not the segment is active. |  [optional] |
| **displayName** | **String** | The display name of the segment. |  |
| **version** | **Integer** | The version of the segment. |  [optional] |
| **description** | **String** | A description of the segment. |  [optional] |
| **color** | **String** | The hexadecimal color value of the segment. Defaults if not provided. |  [optional] |
| **shouldDisplayToAgent** | **Boolean** | Whether or not the segment should be displayed to agent/supervisor users. |  [optional] |
| **context** | [**RequestContext**](RequestContext) | The context of the segment. Defaults if not provided. |  [optional] |
| **journey** | [**RequestJourney**](RequestJourney) | The pattern of rules defining the segment. Defaults if not provided. |  [optional] |
| **externalSegment** | [**RequestExternalSegment**](RequestExternalSegment) | Details of an entity corresponding to this segment in an external system. |  [optional] |
| **assignmentExpirationDays** | **Integer** | Time, in days, from when the segment is assigned until it is automatically unassigned. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
