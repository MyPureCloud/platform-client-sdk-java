# FlowLogLevelCharacteristicsDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **minimumLevel** | [**MinimumLevelEnum**](#Enum--MinimumLevelEnum) | The minimum level required for this characteristic to be enabled. |  [optional] |
| **dependsOn** | [**FlowCharacteristics**](FlowCharacteristics) | If set, this is the id of the characteristic that this one depends on and it must be enabled for this to be enabled. |  [optional] |
{: class="table table-striped"}


## Enum: MinimumLevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| DISABLED | &quot;Disabled&quot; | 
| BASE | &quot;Base&quot; | 
| NOTES | &quot;Notes&quot; | 
| VERBOSENOTES | &quot;VerboseNotes&quot; | 
| ALL | &quot;All&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
