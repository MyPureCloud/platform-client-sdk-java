# ContestCompleteData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateEnd** | [**LocalDate**](LocalDate) | End date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **anonymization** | [**AnonymizationEnum**](#Enum--AnonymizationEnum) | Anonymization of the contest |  [optional] |
| **metrics** | [**List&lt;ContestDataMetrics&gt;**](ContestDataMetrics) | Metrics of the contest |  [optional] |
| **prizes** | [**List&lt;ContestDataPrizes&gt;**](ContestDataPrizes) | Prizes of the contest |  [optional] |
| **winners** | [**List&lt;ContestDataWinners&gt;**](ContestDataWinners) | Winners of the contest |  [optional] |


## Enum: AnonymizationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOANONYMIZATION | &quot;NoAnonymization&quot; | 
| ALL | &quot;All&quot; | 
| ALLEXCEPTTOP | &quot;AllExceptTop&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
