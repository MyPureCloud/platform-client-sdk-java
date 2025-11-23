# CampaignRuleWarningParameters


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **actionId** | **String** | ID of action |  [optional] |
| **conditionId** | **String** | ID of condition |  [optional] |
| **actionType** | [**ActionTypeEnum**](#Enum--ActionTypeEnum) | Type of action |  [optional] |
| **conditionType** | [**ConditionTypeEnum**](#Enum--ConditionTypeEnum) | Type of condition |  [optional] |


## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TURNONCAMPAIGN | &quot;turnOnCampaign&quot; | 
| TURNOFFCAMPAIGN | &quot;turnOffCampaign&quot; | 
| TURNONSEQUENCE | &quot;turnOnSequence&quot; | 
| TURNOFFSEQUENCE | &quot;turnOffSequence&quot; | 
| SETCAMPAIGNPRIORITY | &quot;setCampaignPriority&quot; | 
| RECYCLECAMPAIGN | &quot;recycleCampaign&quot; | 
| SETCAMPAIGNDIALINGMODE | &quot;setCampaignDialingMode&quot; | 
| SETCAMPAIGNABANDONRATE | &quot;setCampaignAbandonRate&quot; | 
| SETCAMPAIGNNUMBEROFLINES | &quot;setCampaignNumberOfLines&quot; | 
| SETCAMPAIGNWEIGHT | &quot;setCampaignWeight&quot; | 
| SETCAMPAIGNMAXCALLSPERAGENT | &quot;setCampaignMaxCallsPerAgent&quot; | 
| SETCAMPAIGNMESSAGESPERMINUTE | &quot;setCampaignMessagesPerMinute&quot; | 
| CHANGECAMPAIGNQUEUE | &quot;changeCampaignQueue&quot; | 
| CHANGECAMPAIGNTEMPLATE | &quot;changeCampaignTemplate&quot; | 


## Enum: ConditionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CAMPAIGNPROGRESS | &quot;campaignProgress&quot; | 
| CAMPAIGNAGENTS | &quot;campaignAgents&quot; | 
| CAMPAIGNRECORDSATTEMPTED | &quot;campaignRecordsAttempted&quot; | 
| CAMPAIGNCONTACTSMESSAGED | &quot;campaignContactsMessaged&quot; | 
| CAMPAIGNBUSINESSSUCCESS | &quot;campaignBusinessSuccess&quot; | 
| CAMPAIGNBUSINESSFAILURE | &quot;campaignBusinessFailure&quot; | 
| CAMPAIGNBUSINESSNEUTRAL | &quot;campaignBusinessNeutral&quot; | 
| CAMPAIGNVALIDATTEMPTS | &quot;campaignValidAttempts&quot; | 
| CAMPAIGNRIGHTPARTYCONTACTS | &quot;campaignRightPartyContacts&quot; | 
| TIMEOFDAY | &quot;timeOfDay&quot; | 
| DAYOFWEEK | &quot;dayOfWeek&quot; | 
| DAYOFMONTH | &quot;dayOfMonth&quot; | 
| WEEKDAYOFMONTH | &quot;weekDayOfMonth&quot; | 
| SPECIFICDATE | &quot;specificDate&quot; | 
| CAMPAIGNRUNTIME | &quot;campaignRunTime&quot; | 
| CAMPAIGNWAITTIME | &quot;campaignWaitTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
