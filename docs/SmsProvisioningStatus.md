# SmsProvisioningStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | Provisioning action |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Provisioning state |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Any error associated with a Failed state |  [optional] |
| **version** | **Long** | The phone number version associated with the provisioning action |  [optional] |
{: class="table table-striped"}


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| CREATE | &quot;Create&quot; | 
| UPDATE | &quot;Update&quot; | 
| DELETE | &quot;Delete&quot; | 
{: class="table table-striped"}


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNNING | &quot;Running&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
