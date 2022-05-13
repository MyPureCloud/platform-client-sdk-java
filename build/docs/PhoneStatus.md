---
title: PhoneStatus
---
## PhoneStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **operationalStatus** | [**OperationalStatusEnum**](#OperationalStatusEnum)<!----> | The Operational Status of this phone |  [optional] |
| **edgesStatus** | [**EdgesStatusEnum**](#EdgesStatusEnum)<!----> | The status of the primary or secondary Edges assigned to the phone lines. |  [optional] |
| **eventCreationTime** | <!----><!---->**String**<!----> | Event Creation Time represents an ISO-8601 string. For example: UTC, UTC+01:00, or Europe/London |  [optional] |
| **provision** | <!----><!---->[**ProvisionInfo**](ProvisionInfo.html)<!----> | Provision information for this phone |  [optional] |
| **lineStatuses** | <!----><!---->[**List&lt;LineStatus&gt;**](LineStatus.html)<!----> | A list of LineStatus information for each of the lines of this phone |  [optional] |
| **phoneAssignmentToEdgeType** | [**PhoneAssignmentToEdgeTypeEnum**](#PhoneAssignmentToEdgeTypeEnum)<!----> | The phone status's edge assignment type. |  [optional] |
| **edge** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The URI of the edge that provided this status information. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="OperationalStatusEnum"></a>

## Enum: OperationalStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPERATIONAL | &quot;OPERATIONAL&quot; | 
| DEGRADED | &quot;DEGRADED&quot; | 
| OFFLINE | &quot;OFFLINE&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
{: class="table table-striped"}


<a name="EdgesStatusEnum"></a>

## Enum: EdgesStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN_SERVICE | &quot;IN_SERVICE&quot; | 
| MIXED_SERVICE | &quot;MIXED_SERVICE&quot; | 
| OUT_OF_SERVICE | &quot;OUT_OF_SERVICE&quot; | 
| NO_EDGES | &quot;NO_EDGES&quot; | 
{: class="table table-striped"}


<a name="PhoneAssignmentToEdgeTypeEnum"></a>

## Enum: PhoneAssignmentToEdgeTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PRIMARY | &quot;PRIMARY&quot; | 
| SECONDARY | &quot;SECONDARY&quot; | 
{: class="table table-striped"}



