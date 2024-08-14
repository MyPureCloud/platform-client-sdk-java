---
title: ActivityPlanJobException
---
## ActivityPlanJobException


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **exceptionType** | [**ExceptionTypeEnum**](#ExceptionTypeEnum)<!----> | The type of error |  |
| **occurrences** | <!----><!---->[**List&lt;ActivityPlanOccurrenceReference&gt;**](ActivityPlanOccurrenceReference.html)<!----> | The occurrences in which this error occurred |  |
{: class="table table-striped"}


<a name="ExceptionTypeEnum"></a>

## Enum: ExceptionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNSCHEDULEDATTENDEES | &quot;UnscheduledAttendees&quot; | 
| SESSIONSNOTDELETED | &quot;SessionsNotDeleted&quot; | 
{: class="table table-striped"}



