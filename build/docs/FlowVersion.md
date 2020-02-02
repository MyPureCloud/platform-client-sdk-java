---
title: FlowVersion
---
## FlowVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The flow version identifier |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **commitVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **configurationVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **secure** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **debug** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **createdBy** | <!----><!---->[**User**](User.html)<!----> |  |  [optional] |
| **createdByClient** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **configurationUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->**Long**<!----> |  |  [optional] |
| **generationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **publishResultUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **inputSchema** | <!----><!---->[**JsonSchemaDocument**](JsonSchemaDocument.html)<!----> |  |  [optional] |
| **outputSchema** | <!----><!---->[**JsonSchemaDocument**](JsonSchemaDocument.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PUBLISH | &quot;PUBLISH&quot; |
| CHECKIN | &quot;CHECKIN&quot; |
| SAVE | &quot;SAVE&quot; |
{: class="table table-striped"}



