---
title: Check
---
## Check


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **result** | [**ResultEnum**](#ResultEnum)<!----> | The result of a check executed. This indicates if the check was successful or not. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of check executed. |  [optional] |
{: class="table table-striped"}


<a name="ResultEnum"></a>

## Enum: ResultEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PASSED | &quot;Passed&quot; | 
| FAILED | &quot;Failed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| SKIPPED | &quot;Skipped&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HANDLETIMEVALUE | &quot;HandleTimeValue&quot; | 
| TRANSFERRATEVALUE | &quot;TransferRateValue&quot; | 
| SALESCONVERSIONRATEVALUE | &quot;SalesConversionRateValue&quot; | 
| RETENTIONRATEVALUE | &quot;RetentionRateValue&quot; | 
| CHURNRATEVALUE | &quot;ChurnRateValue&quot; | 
| INTERACTIONVOLUME | &quot;InteractionVolume&quot; | 
| USERVARIANCE | &quot;UserVariance&quot; | 
| DATACOVERAGE | &quot;DataCoverage&quot; | 
| MODELQUALITY | &quot;ModelQuality&quot; | 
{: class="table table-striped"}



