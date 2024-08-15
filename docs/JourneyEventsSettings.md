# JourneyEventsSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether or not journey event collection is enabled. |  [optional] |
| **excludedQueryParameters** | **List&lt;String&gt;** | List of parameters to be excluded from the query string. |  [optional] |
| **shouldKeepUrlFragment** | **Boolean** | Whether or not to keep the URL fragment. |  [optional] |
| **searchQueryParameters** | **List&lt;String&gt;** | List of query parameters used for search (e.g. 'q'). |  [optional] |
| **pageviewConfig** | [**PageviewConfigEnum**](#Enum--PageviewConfigEnum) | Controls how the pageview events are tracked. |  [optional] |
| **clickEvents** | [**List&lt;SelectorEventTrigger&gt;**](SelectorEventTrigger) | Tracks when and where a visitor clicks on a webpage. |  [optional] |
| **formsTrackEvents** | [**List&lt;FormsTrackTrigger&gt;**](FormsTrackTrigger) | Controls how the form submitted and form abandoned events are tracked after a visitor interacts with a form element. |  [optional] |
| **idleEvents** | [**List&lt;IdleEventTrigger&gt;**](IdleEventTrigger) | Tracks when and where a visitor becomes inactive on a webpage. |  [optional] |
| **inViewportEvents** | [**List&lt;SelectorEventTrigger&gt;**](SelectorEventTrigger) | Tracks when elements become visible or hidden on screen. |  [optional] |
| **scrollDepthEvents** | [**List&lt;ScrollPercentageEventTrigger&gt;**](ScrollPercentageEventTrigger) | Tracks when a visitor scrolls to a specific percentage of a webpage. |  [optional] |
{: class="table table-striped"}


## Enum: PageviewConfigEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTO | &quot;Auto&quot; | 
| ONCE | &quot;Once&quot; | 
| OFF | &quot;Off&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
