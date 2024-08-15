# UserState


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | User's current state. |  [optional] |
| **version** | **Integer** | Version of this user. |  [optional] |
| **stateChangeReason** | [**StateChangeReasonEnum**](#Enum--StateChangeReasonEnum) | Reason for a change in the user's state. |  [optional] |
| **stateChangeDate** | [**Date**](Date) | Date that the state was last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 
{: class="table table-striped"}


## Enum: StateChangeReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOLUNTARY | &quot;Voluntary&quot; | 
| SEASONAL | &quot;Seasonal&quot; | 
| LEAVE | &quot;Leave&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 
| CONDUCT | &quot;Conduct&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



