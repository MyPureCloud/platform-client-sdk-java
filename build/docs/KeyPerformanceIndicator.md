---
title: KeyPerformanceIndicator
---
## KeyPerformanceIndicator


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the Key Performance Indicator. |  [optional] |
| **optimizationType** | [**OptimizationTypeEnum**](#OptimizationTypeEnum)<!----> | The optimization type of the Key Performance Indicator. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | DateTime indicating when the Key Performance Indicator was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | DateTime indicating when the Key Performance Indicator was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the Key Performance Indicator. |  [optional] |
| **kpiType** | [**KpiTypeEnum**](#KpiTypeEnum)<!----> | The type of Key Performance Indicator. |  [optional] |
| **source** | [**SourceEnum**](#SourceEnum)<!----> | Source of values for Key Performance Indicator. |  [optional] |
| **wrapUpCodeConfig** | <!----><!---->[**WrapUpCodeConfig**](WrapUpCodeConfig.html)<!----> | Defines what wrap up codes are mapped to Key Performance Indicator. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the Key Performance Indicator. |  [optional] |
| **kpiGroup** | [**KpiGroupEnum**](#KpiGroupEnum)<!----> | The group the Key Performance Indicator belongs to. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="OptimizationTypeEnum"></a>

## Enum: OptimizationTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MAXIMIZATION | &quot;Maximization&quot; | 
| MINIMIZATION | &quot;Minimization&quot; | 
{: class="table table-striped"}


<a name="KpiTypeEnum"></a>

## Enum: KpiTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SALESCONVERSION | &quot;SalesConversion&quot; | 
| CHURN | &quot;Churn&quot; | 
| RETENTION | &quot;Retention&quot; | 
| HANDLETIME | &quot;HandleTime&quot; | 
| NUMBEROFTRANSFERS | &quot;NumberOfTransfers&quot; | 
{: class="table table-striped"}


<a name="SourceEnum"></a>

## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WRAPUPCODE | &quot;WrapUpCode&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENABLED | &quot;Enabled&quot; | 
| DISABLED | &quot;Disabled&quot; | 
{: class="table table-striped"}


<a name="KpiGroupEnum"></a>

## Enum: KpiGroupEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STANDARD | &quot;Standard&quot; | 
| CUSTOM | &quot;Custom&quot; | 
{: class="table table-striped"}



