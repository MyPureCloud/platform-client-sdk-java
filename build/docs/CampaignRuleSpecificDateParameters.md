# CampaignRuleSpecificDateParameters


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **includeYear** | **Boolean** | If true, includes year in date comparison for specificDate type. When false, only month and day are compared. Default is true.  |  [optional] |
| **thresholdValue** | **String** | The operand for the \"equals\", \"after\" and \"before\" operators in yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false) format. |  [optional] |
| **interval** | [**CampaignRuleSpecificDateInterval**](CampaignRuleSpecificDateInterval) | The operand for the \"between\" operator |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:254.0.0_
