# JourneyView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** | A description of the journey view |  [optional] |
| **version** | **Integer** | The version of the journey view |  [optional] |
| **createdBy** | [**JourneyViewUser**](JourneyViewUser) | User that has created the view. |  [optional] |
| **modifiedBy** | [**JourneyViewUser**](JourneyViewUser) | User that has modified the view. |  [optional] |
| **interval** | **String** | An absolute timeframe for the journey view, expressed as an ISO 8601 interval. Only one of interval or duration must be specified. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **duration** | **String** | A relative timeframe for the journey view, expressed as an ISO 8601 duration. Only one of interval or duration must be specified. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **elements** | [**List&lt;JourneyViewElement&gt;**](JourneyViewElement) | The elements within the journey view |  |
| **charts** | [**List&lt;JourneyViewChart&gt;**](JourneyViewChart) | A list of charts to measure within context of the elements of the the journey view |  [optional] |
| **dateCreated** | [**Date**](Date) | The date when the journey view was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date when this version of the journey view was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
