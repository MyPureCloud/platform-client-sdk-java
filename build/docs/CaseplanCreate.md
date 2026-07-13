# CaseplanCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Caseplan. Valid length between 3 and 256 characters. |  |
| **defaultDueDurationInSeconds** | **Integer** | The default due duration in seconds for Cases created from the Caseplan. Valid range is between 1 and 31536000 seconds. |  [optional] |
| **defaultTtlSeconds** | **Integer** | The default TTL in seconds for Cases created from the Caseplan. Valid range is between 86400 and 31536000 seconds. |  [optional] |
| **referencePrefix** | **String** | The prefix of the Caseplan reference. Valid length between 2 and 8 alphanumeric characters. |  |
| **customerIntentId** | **String** | The ID of the customer intent associated with this Caseplan. |  |
| **description** | **String** | The description of the Caseplan. Maximum length of 512 characters. |  [optional] |
| **defaultCaseOwnerId** | **String** | The ID of the default owner of a Case created from the Caseplan. |  [optional] |
| **divisionId** | **String** | The ID of the division the Caseplan belongs to. Use '*' for divisionless Caseplans. |  |
| **dataSchemas** | [**List&lt;CaseplanDataSchema&gt;**](CaseplanDataSchema) | The schemas that define all data for Cases from this Caseplan. The schema must be defined in the TaskManagement namespace. Omit or leave null to create a draft Caseplan without a schema; assign a schema before publish. |  [optional] |
| **intakeSettings** | [**List&lt;IntakeSetting&gt;**](IntakeSetting) | The intake format when collecting data for a Case from this Caseplan. There can be a maximum of 10 IntakeSettings defined for a Caseplan. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
