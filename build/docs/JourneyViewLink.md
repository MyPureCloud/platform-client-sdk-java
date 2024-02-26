---
title: JourneyViewLink
---
## JourneyViewLink


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The identifier of the element downstream |  |
| **constraintWithin** | <!----><!---->[**JourneyViewLinkTimeConstraint**](JourneyViewLinkTimeConstraint.html)<!----> | A time constraint on this link, which requires a customer to complete the downstream element within this amount of time to be counted. |  [optional] |
| **constraintAfter** | <!----><!---->[**JourneyViewLinkTimeConstraint**](JourneyViewLinkTimeConstraint.html)<!----> | A time constraint on this link, which requires a customer must complete the downstream element after this amount of time to be counted. |  [optional] |
| **eventCountType** | [**EventCountTypeEnum**](#EventCountTypeEnum)<!----> | The type of events that will be counted. Note: Concurrent will override any JourneyViewLinkTimeConstraint. Default is Sequential. |  [optional] |
| **joinAttributes** | <!----><!---->**List&lt;String&gt;**<!----> | Other (secondary) attributes on which this link should join the customers being counted |  [optional] |
{: class="table table-striped"}


<a name="EventCountTypeEnum"></a>

## Enum: EventCountTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL | &quot;All&quot; | 
| CONCURRENT | &quot;Concurrent&quot; | 
| SEQUENTIAL | &quot;Sequential&quot; | 
{: class="table table-striped"}



