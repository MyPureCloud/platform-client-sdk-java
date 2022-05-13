---
title: JourneyEventsSettings
---
## JourneyEventsSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether or not journey event collection is enabled. |  [optional] |
| **excludedQueryParameters** | <!----><!---->**List&lt;String&gt;**<!----> | List of parameters to be excluded from the query string. |  [optional] |
| **shouldKeepUrlFragment** | <!----><!---->**Boolean**<!----> | Whether or not to keep the URL fragment. |  [optional] |
| **searchQueryParameters** | <!----><!---->**List&lt;String&gt;**<!----> | List of query parameters used for search (e.g. 'q'). |  [optional] |
| **pageviewConfig** | [**PageviewConfigEnum**](#PageviewConfigEnum)<!----> | Controls how the pageview events are tracked. |  [optional] |
| **clickEvents** | <!----><!---->[**List&lt;SelectorEventTrigger&gt;**](SelectorEventTrigger.html)<!----> | Tracks when and where a visitor clicks on a webpage. |  [optional] |
| **formsTrackEvents** | <!----><!---->[**List&lt;FormsTrackTrigger&gt;**](FormsTrackTrigger.html)<!----> | Controls how the form submitted and form abandoned events are tracked after a visitor interacts with a form element. |  [optional] |
| **idleEvents** | <!----><!---->[**List&lt;IdleEventTrigger&gt;**](IdleEventTrigger.html)<!----> | Tracks when and where a visitor becomes inactive on a webpage. |  [optional] |
| **inViewportEvents** | <!----><!---->[**List&lt;SelectorEventTrigger&gt;**](SelectorEventTrigger.html)<!----> | Tracks when elements become visible or hidden on screen. |  [optional] |
| **scrollDepthEvents** | <!----><!---->[**List&lt;ScrollPercentageEventTrigger&gt;**](ScrollPercentageEventTrigger.html)<!----> | Tracks when a visitor scrolls to a specific percentage of a webpage. |  [optional] |
{: class="table table-striped"}


<a name="PageviewConfigEnum"></a>

## Enum: PageviewConfigEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTO | &quot;Auto&quot; | 
| ONCE | &quot;Once&quot; | 
| OFF | &quot;Off&quot; | 
{: class="table table-striped"}



