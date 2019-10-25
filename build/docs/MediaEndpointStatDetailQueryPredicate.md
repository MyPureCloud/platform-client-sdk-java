---
title: MediaEndpointStatDetailQueryPredicate
---
## MediaEndpointStatDetailQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension predicates |  [optional] |
| **range** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | Right hand side for dimension predicates |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DIMENSION | &quot;dimension&quot; |
| PROPERTY | &quot;property&quot; |
| METRIC | &quot;metric&quot; |
{: class="table table-striped"}


<a name="DimensionEnum"></a>

## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CODEC | &quot;codec&quot; |
| DISCARDEDPACKETS | &quot;discardedPackets&quot; |
| DUPLICATEPACKETS | &quot;duplicatePackets&quot; |
| EVENTTIME | &quot;eventTime&quot; |
| INVALIDPACKETS | &quot;invalidPackets&quot; |
| MAXLATENCYMS | &quot;maxLatencyMs&quot; |
| MINMOS | &quot;minMos&quot; |
| MINRFACTOR | &quot;minRFactor&quot; |
| OVERRUNPACKETS | &quot;overrunPackets&quot; |
| RECEIVEDPACKETS | &quot;receivedPackets&quot; |
| UNDERRUNPACKETS | &quot;underrunPackets&quot; |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| MATCHES | &quot;matches&quot; |
| EXISTS | &quot;exists&quot; |
| NOTEXISTS | &quot;notExists&quot; |
{: class="table table-striped"}



