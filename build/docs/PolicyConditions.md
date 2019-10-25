---
title: PolicyConditions
---
## PolicyConditions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **forUsers** | <!----><!---->[**List&lt;User&gt;**](User.html)<!----> |  |  [optional] |
| **directions** | <!---->[**List&lt;DirectionsEnum&gt;**](#DirectionsEnum)<!----> |  |  [optional] |
| **dateRanges** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **mediaTypes** | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!----> |  |  [optional] |
| **forQueues** | <!----><!---->[**List&lt;Queue&gt;**](Queue.html)<!----> |  |  [optional] |
| **duration** | <!----><!---->[**DurationCondition**](DurationCondition.html)<!----> |  |  [optional] |
| **wrapupCodes** | <!----><!---->[**List&lt;WrapupCode&gt;**](WrapupCode.html)<!----> |  |  [optional] |
| **timeAllowed** | <!----><!---->[**TimeAllowed**](TimeAllowed.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="DirectionsEnum"></a>

## Enum: DirectionsEnum

| Name | Value |
| ---- | ----- |
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |
{: class="table table-striped"}


<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| CALL | &quot;CALL&quot; |
| CHAT | &quot;CHAT&quot; |
{: class="table table-striped"}



