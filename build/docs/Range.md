# Range


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Range type (NoEnd: without an end date. EndDate: with an end date. Numbered: with a specific number of occurrences) |  |
| **end** | **String** | The end date time of the last occurrence of the range as an ISO-8601 string. Required for EndDate range type. |  [optional] |
| **numberOfOccurrences** | **Integer** | The number of times the schedule will be repeated, e.g: 2. Required to set for Numbered range type. |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOEND | &quot;NoEnd&quot; | 
| ENDDATE | &quot;EndDate&quot; | 
| NUMBERED | &quot;Numbered&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
