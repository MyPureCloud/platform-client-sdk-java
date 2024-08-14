---
title: AlternativeShiftTradeResponse
---
## AlternativeShiftTradeResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **shiftOfferJobId** | <!----><!---->**String**<!----> | The job ID of the alternative shift offer listing, from which the trade was chosen |  |
| **existingShifts** | <!----><!---->[**List&lt;AlternativeShiftAgentScheduledShift&gt;**](AlternativeShiftAgentScheduledShift.html)<!----> | The existing shifts from the offer, may be empty |  |
| **offeredShifts** | <!----><!---->[**List&lt;AlternativeShiftAgentScheduledShift&gt;**](AlternativeShiftAgentScheduledShift.html)<!----> | The offered shifts from the offer, may be empty |  |
| **schedule** | <!----><!---->[**AlternativeShiftScheduleLookup**](AlternativeShiftScheduleLookup.html)<!----> | The existing schedule information associated with the trade |  |
| **managementUnit** | <!----><!---->[**ManagementUnitReference**](ManagementUnitReference.html)<!----> | The management unit of this alternative shift trade request |  |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who submitted the trade request |  |
| **weekDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The start week date of the associated schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **expirationDate** | <!----><!---->[**Date**](Date.html)<!----> | The date when the trade will expire in ISO-8601 format. The trade cannot be approved after expiration |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of this alternative shift trade |  |
| **processingStatus** | [**ProcessingStatusEnum**](#ProcessingStatusEnum)<!----> | The processing status of this alternative shift trade |  [optional] |
| **systemDateReviewed** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the trade request was reviewed by the system in ISO-8601 format |  [optional] |
| **adminDateReviewed** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the trade request was reviewed by an admin in ISO-8601 format |  [optional] |
| **adminReviewedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The admin who reviewed this alternative shift trade after system denial |  [optional] |
| **violations** | <!---->[**List&lt;ViolationsEnum&gt;**](#ViolationsEnum)<!----> | A list of trade match violations |  |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for this alternative shift trade |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| SUBMITTED | &quot;Submitted&quot; | 
| APPROVED | &quot;Approved&quot; | 
{: class="table table-striped"}


<a name="ProcessingStatusEnum"></a>

## Enum: ProcessingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ERROR | &quot;Error&quot; | 
| WAITINGFORSCHEDULEUPDATE | &quot;WaitingForScheduleUpdate&quot; | 
| SCHEDULEUPDATING | &quot;ScheduleUpdating&quot; | 
| SCHEDULEUPDATED | &quot;ScheduleUpdated&quot; | 
| WAITINGFORREVIEW | &quot;WaitingForReview&quot; | 
| REVIEWING | &quot;Reviewing&quot; | 
{: class="table table-striped"}


<a name="ViolationsEnum"></a>

## Enum: ViolationsEnum

| Name | Value |
| ---- | ----- |
| SERVICEGOALSNOTMET | &quot;ServiceGoalsNotMet&quot; |
{: class="table table-striped"}



