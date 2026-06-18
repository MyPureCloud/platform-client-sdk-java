# GoogleBusinessProfileDataIngestionRuleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the data ingestion rule. |  |
| **description** | **String** | A description of the data ingestion rule. |  [optional] |
| **integrationId** | **String** | The Integration Id from which to ingest public social posts. This entity is created using the /conversations/messaging/integrations/open/extensions/googlebusinessprofile resource |  |
| **externalSource** | [**DomainEntityRef**](DomainEntityRef) | The external source associated with this data ingestion rule, which will be used when performing identity resolution |  |




_com.mypurecloud.sdk.v2:platform-client-v2:256.1.0_
