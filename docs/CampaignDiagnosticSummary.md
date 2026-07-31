# CampaignDiagnosticSummary


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaignId** | **String** | Campaign ID |  [optional] |
| **dateStart** | [**Date**](Date) | Start of the interval. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnd** | [**Date**](Date) | End of the interval. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **campaignStates** | [**List&lt;CampaignDiagnosticCampaignState&gt;**](CampaignDiagnosticCampaignState) | Array of campaign states |  [optional] |
| **campaignInfo** | [**List&lt;CampaignDiagnosticWindow&gt;**](CampaignDiagnosticWindow) | Array of diagnostic windows |  [optional] |
| **campaignHealthStates** | [**List&lt;CampaignDiagnosticCampaignHealthState&gt;**](CampaignDiagnosticCampaignHealthState) | Array of campaign health states |  [optional] |
| **configChanges** | [**List&lt;CampaignDiagnosticConfigChange&gt;**](CampaignDiagnosticConfigChange) | Configuration changes occurring within the time window |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
