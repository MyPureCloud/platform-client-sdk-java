# JourneyViewLink


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The identifier of the element downstream |  |
| **constraintWithin** | [**JourneyViewLinkTimeConstraint**](JourneyViewLinkTimeConstraint) | A time constraint on this link, which requires a customer to complete the downstream element within this amount of time to be counted. |  [optional] |
| **constraintAfter** | [**JourneyViewLinkTimeConstraint**](JourneyViewLinkTimeConstraint) | A time constraint on this link, which requires a customer must complete the downstream element after this amount of time to be counted. |  [optional] |
| **eventCountType** | [**EventCountTypeEnum**](#Enum--EventCountTypeEnum) | The type of events that will be counted. Note: Concurrent will override any JourneyViewLinkTimeConstraint. Default is Sequential. |  [optional] |
| **joinAttributes** | **List&lt;String&gt;** | Other (secondary) attributes on which this link should join the customers being counted |  [optional] |


## Enum: EventCountTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL | &quot;All&quot; | 
| CONCURRENT | &quot;Concurrent&quot; | 
| SEQUENTIAL | &quot;Sequential&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
