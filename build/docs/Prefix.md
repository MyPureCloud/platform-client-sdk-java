# Prefix


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **countryCode** | **String** | The ITU-T E.164 country code (numeric, max 4 digits, required) |  |
| **number** | **String** | The DID (Direct Inward Dialing) number (numeric, max 20 digits) |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Prefix type: allow or block |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The action to perform: ADD or DELETE |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;Allow&quot; | 
| BLOCK | &quot;Block&quot; | 


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADD | &quot;Add&quot; | 
| DELETE | &quot;Delete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
