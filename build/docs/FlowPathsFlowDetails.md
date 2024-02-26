---
title: FlowPathsFlowDetails
---
## FlowPathsFlowDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **version** | <!----><!---->**String**<!----> | The version of the flow. |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the flow. |  |
| **count** | <!----><!---->**Integer**<!----> | Count of all journeys that include this element in the given flow. |  |
| **flow** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The identifier of the flow. |  |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIGITALBOT | &quot;DigitalBot&quot; | 
| BOT | &quot;Bot&quot; | 
| INBOUNDCALL | &quot;InboundCall&quot; | 
| SECURECALL | &quot;SecureCall&quot; | 
{: class="table table-striped"}



