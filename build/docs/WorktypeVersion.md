# WorktypeVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Worktype. |  [optional] |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | The description of the Worktype. |  [optional] |
| **dateCreated** | [**Date**](Date) | The creation date of the Worktype. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The modified date of the Worktype. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **defaultWorkbin** | [**WorkbinReference**](WorkbinReference) | The default Workbin for Workitems created from the Worktype. |  [optional] |
| **defaultStatus** | [**WorkitemStatusReference**](WorkitemStatusReference) | The default status for Workitems created from the Worktype. |  [optional] |
| **statuses** | [**List&lt;WorkitemStatus&gt;**](WorkitemStatus) | The list of possible statuses for Workitems created from the Worktype. |  [optional] |
| **defaultDurationSeconds** | **Integer** | The default duration in seconds for Workitems created from the Worktype. |  [optional] |
| **defaultExpirationSeconds** | **Integer** | The default expiration time in seconds for Workitems created from the Worktype. |  [optional] |
| **defaultDueDurationSeconds** | **Integer** | The default due duration in seconds for Workitems created from the Worktype. |  [optional] |
| **defaultPriority** | **Integer** | The default priority for Workitems created from the Worktype. The valid range is between -25,000,000 and 25,000,000. |  [optional] |
| **defaultLanguage** | [**LanguageReference**](LanguageReference) | The default language for Workitems created from the Worktype. |  [optional] |
| **defaultTtlSeconds** | **Integer** | The default time to time to live in seconds for Workitems created from the Worktype. |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The id of the User who modified the Worktype. |  [optional] |
| **defaultQueue** | [**WorkitemQueueReference**](WorkitemQueueReference) | The default queue for Workitems created from the Worktype. |  [optional] |
| **defaultSkills** | [**List&lt;RoutingSkillReference&gt;**](RoutingSkillReference) | The default skills for Workitems created from the Worktype. |  [optional] |
| **assignmentEnabled** | **Boolean** | When set to true, Workitems will be sent to the queue of the Worktype as they are created. Default value is false. |  [optional] |
| **schema** | [**WorkitemSchema**](WorkitemSchema) | The schema defining the custom attributes for Workitems created from the Worktype. |  [optional] |
| **serviceLevelTarget** | **Integer** | The target service level for Workitems created from the Worktype. The default value is 100. |  [optional] |
| **ruleSettings** | [**WorkitemRuleSettings**](WorkitemRuleSettings) | Settings for the worktypes rules. |  [optional] |
| **flow** | [**WorkitemFlowReference**](WorkitemFlowReference) | The flow associated with the Worktype. |  [optional] |
| **version** | **Integer** | Version |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
