# LocaleInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of health computation for this flow version. |  [optional] |
| **errorInfo** | [**FlowHealthErrorInfo**](FlowHealthErrorInfo) | Error details for the flow version, if any. |  [optional] |
| **flowVersionInfo** | [**LocaleFlowVersionInfo**](LocaleFlowVersionInfo) | Info about given flow version. |  [optional] |
{: class="table table-striped"}


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



