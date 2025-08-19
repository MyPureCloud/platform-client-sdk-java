# JourneyViewElement


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique identifier of the element within the elements list |  |
| **name** | **String** | The unique name of the element within the view |  |
| **attributes** | [**JourneyViewElementAttributes**](JourneyViewElementAttributes) | Required attributes of the element |  |
| **displayAttributes** | [**JourneyViewElementDisplayAttributes**](JourneyViewElementDisplayAttributes) | Attributes that defines the visualization of the element in the journey view |  [optional] |
| **filter** | [**JourneyViewElementFilter**](JourneyViewElementFilter) | Any filters applied to this element |  [optional] |
| **followedBy** | [**List&lt;JourneyViewLink&gt;**](JourneyViewLink) | A list of JourneyViewLink objects, listing the elements downstream of this element |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
