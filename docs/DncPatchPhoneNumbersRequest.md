# DncPatchPhoneNumbersRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The action to perform |  [optional] |
| **phoneNumbers** | **List&lt;String&gt;** | The list of phone numbers to Add to / Remove from the DNC list  |  [optional] |
| **expirationDateTime** | **String** | Expiration date for DNC phone numbers in yyyy-MM-ddTHH:mmZ format |  [optional] |
{: class="table table-striped"}


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADD | &quot;Add&quot; | 
| REMOVE | &quot;Remove&quot; | 
{: class="table table-striped"}



