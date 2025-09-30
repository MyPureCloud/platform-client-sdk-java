# LongTermRequirementsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the long term forecast |  |
| **errorCode** | [**ErrorCodeEnum**](#Enum--ErrorCodeEnum) | Error code when status is Failed |  [optional] |
| **longTermRequirements** | [**LongTermRequirements**](LongTermRequirements) | For schema documentation only, always null, schema for staffing forecast result at downloadUrl |  [optional] |
| **downloadUrl** | **String** | Download URL for the staffing forecast result |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 


## Enum: ErrorCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TIMEDOUT | &quot;TimedOut&quot; | 
| NODATA | &quot;NoData&quot; | 
| CLIENTDATAINVALID | &quot;ClientDataInvalid&quot; | 
| CONFIGURATIONINVALID | &quot;ConfigurationInvalid&quot; | 
| REQUIREMENTSFAILED | &quot;RequirementsFailed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
