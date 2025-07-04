# EventMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | [**CodeEnum**](#Enum--CodeEnum) |  |  [optional] |
| **message** | **String** |  |  [optional] |
| **messageWithParams** | **String** |  |  [optional] |
| **messageParams** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **documentationUri** | **String** |  |  [optional] |
| **resourceURIs** | **List&lt;String&gt;** |  |  [optional] |


## Enum: CodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE_CAMPAIGNS_LIMIT_EXCEEDED | &quot;ACTIVE_CAMPAIGNS_LIMIT_EXCEEDED&quot; | 
| ALL_CAMPAIGNS_BLACKLISTED | &quot;ALL_CAMPAIGNS_BLACKLISTED&quot; | 
| ANOTHER_CAMPAIGN_STARTING | &quot;ANOTHER_CAMPAIGN_STARTING&quot; | 
| APPROACHING_CONTACT_LIMIT | &quot;APPROACHING_CONTACT_LIMIT&quot; | 
| APPROACHING_DNC_LIST_PHONE_NUMBER_LIMIT | &quot;APPROACHING_DNC_LIST_PHONE_NUMBER_LIMIT&quot; | 
| APPROACHING_DNC_ORGANIZATION_PHONE_NUMBER_LIMIT | &quot;APPROACHING_DNC_ORGANIZATION_PHONE_NUMBER_LIMIT&quot; | 
| APPROACHING_ENTITY_LIMIT | &quot;APPROACHING_ENTITY_LIMIT&quot; | 
| AUTOMATIC_TIME_ZONE_ZIP_CODE_INVALID | &quot;AUTOMATIC_TIME_ZONE_ZIP_CODE_INVALID&quot; | 
| CAMPAIGN_BLACKLISTED | &quot;CAMPAIGN_BLACKLISTED&quot; | 
| CAMPAIGN_BUILD_CONTACT_QUEUE_ERROR | &quot;CAMPAIGN_BUILD_CONTACT_QUEUE_ERROR&quot; | 
| CAMPAIGN_CONTENT_TEMPLATE_SUBSTITUTION_MISMATCH | &quot;CAMPAIGN_CONTENT_TEMPLATE_SUBSTITUTION_MISMATCH&quot; | 
| CAMPAIGN_CALLS_PER_AGENT_LOW | &quot;CAMPAIGN_CALLS_PER_AGENT_LOW&quot; | 
| CAMPAIGN_EMAIL_BODY_CHARACTER_LIMIT_EXCEEDED | &quot;CAMPAIGN_EMAIL_BODY_CHARACTER_LIMIT_EXCEEDED&quot; | 
| CAMPAIGN_EMAIL_SUBJECT_CHARACTER_LIMIT_EXCEEDED | &quot;CAMPAIGN_EMAIL_SUBJECT_CHARACTER_LIMIT_EXCEEDED&quot; | 
| CAMPAIGN_WHATSAPP_HEADER_VALUE_LIMIT_EXCEEDED | &quot;CAMPAIGN_WHATSAPP_HEADER_VALUE_LIMIT_EXCEEDED&quot; | 
| CAMPAIGN_WHATSAPP_BUTTON_URL_VALUE_LIMIT_EXCEEDED | &quot;CAMPAIGN_WHATSAPP_BUTTON_URL_VALUE_LIMIT_EXCEEDED&quot; | 
| CAMPAIGN_INVALIDATED | &quot;CAMPAIGN_INVALIDATED&quot; | 
| CAMPAIGN_FORCE_STOPPED | &quot;CAMPAIGN_FORCE_STOPPED&quot; | 
| CAMPAIGN_MESSAGE_CHARACTER_LIMIT_EXCEEDED | &quot;CAMPAIGN_MESSAGE_CHARACTER_LIMIT_EXCEEDED&quot; | 
| CAMPAIGN_START_ERROR | &quot;CAMPAIGN_START_ERROR&quot; | 
| CAMPAIGN_RULE_START_ERROR | &quot;CAMPAIGN_RULE_START_ERROR&quot; | 
| CAMPAIGN_SCRIPT_STAGE_MISSING | &quot;CAMPAIGN_SCRIPT_STAGE_MISSING&quot; | 
| CAMPAIGN_SET_DIALING_MODE_ERROR | &quot;CAMPAIGN_SET_DIALING_MODE_ERROR&quot; | 
| CAMPAIGN_STOPPED | &quot;CAMPAIGN_STOPPED&quot; | 
| CAMPAIGN_THROTTLED | &quot;CAMPAIGN_THROTTLED&quot; | 
| CAMPAIGN_QUEUE_MEMBERS_LIMIT_EXCEEDED | &quot;CAMPAIGN_QUEUE_MEMBERS_LIMIT_EXCEEDED&quot; | 
| CAMPAIGN_WEIGHT_ZERO | &quot;CAMPAIGN_WEIGHT_ZERO&quot; | 
| INVALID_CALLABLE_TIME_ZONE | &quot;INVALID_CALLABLE_TIME_ZONE&quot; | 
| CALLBACK_CREATION_INVALID_NUMBER | &quot;CALLBACK_CREATION_INVALID_NUMBER&quot; | 
| CALL_RULE_INVALID_CONTACT_COLUMN | &quot;CALL_RULE_INVALID_CONTACT_COLUMN&quot; | 
| CALL_RULE_MISSING_DATA_ACTION_INPUT | &quot;CALL_RULE_MISSING_DATA_ACTION_INPUT&quot; | 
| CALL_RULE_MISMATCH_TYPE | &quot;CALL_RULE_MISMATCH_TYPE&quot; | 
| CALL_RULE_INVALID_OPERATOR | &quot;CALL_RULE_INVALID_OPERATOR&quot; | 
| CALL_RULE_NO_DNC_LISTS_CONFIGURED | &quot;CALL_RULE_NO_DNC_LISTS_CONFIGURED&quot; | 
| CALL_RULE_UPDATED_PHONE_COLUMN | &quot;CALL_RULE_UPDATED_PHONE_COLUMN&quot; | 
| CONTACT_LIST_FILTER_EVALUATION_FAILED | &quot;CONTACT_LIST_FILTER_EVALUATION_FAILED&quot; | 
| CONTACT_LIST_FILTER_INTERNAL_ERROR | &quot;CONTACT_LIST_FILTER_INTERNAL_ERROR&quot; | 
| CONTACT_COLUMNS_LIMIT_EXCEEDED | &quot;CONTACT_COLUMNS_LIMIT_EXCEEDED&quot; | 
| CONTACT_COLUMN_LENGTH_LIMIT_EXCEEDED | &quot;CONTACT_COLUMN_LENGTH_LIMIT_EXCEEDED&quot; | 
| CONTACT_ID_LENGTH_LIMIT_EXCEEDED | &quot;CONTACT_ID_LENGTH_LIMIT_EXCEEDED&quot; | 
| CONTACT_DATUM_LENGTH_LIMIT_EXCEEDED | &quot;CONTACT_DATUM_LENGTH_LIMIT_EXCEEDED&quot; | 
| CONTACT_ZIP_CODE_COLUMN_VALUE_INVALID | &quot;CONTACT_ZIP_CODE_COLUMN_VALUE_INVALID&quot; | 
| DATA_ACTION_EXECUTION_FAILED | &quot;DATA_ACTION_EXECUTION_FAILED&quot; | 
| DATA_ACTION_AUTHENTICATION_FAILURE | &quot;DATA_ACTION_AUTHENTICATION_FAILURE&quot; | 
| DATA_ACTION_NOT_FOUND | &quot;DATA_ACTION_NOT_FOUND&quot; | 
| DATA_ACTION_TOO_MANY_REQUESTS | &quot;DATA_ACTION_TOO_MANY_REQUESTS&quot; | 
| DATA_ACTION_TOO_MANY_REQUESTS_REMOTE | &quot;DATA_ACTION_TOO_MANY_REQUESTS_REMOTE&quot; | 
| ACTION_EXECUTION_FAILED | &quot;ACTION_EXECUTION_FAILED&quot; | 
| ACTION_EXECUTION_FAILED_INVALID_PARAMETER | &quot;ACTION_EXECUTION_FAILED_INVALID_PARAMETER&quot; | 
| DIGITAL_RULE_EVALUATION_FAILED | &quot;DIGITAL_RULE_EVALUATION_FAILED&quot; | 
| DIGITAL_RULE_INTERNAL_ERROR | &quot;DIGITAL_RULE_INTERNAL_ERROR&quot; | 
| DIGITAL_RULE_NO_DNC_LISTS_CONFIGURED | &quot;DIGITAL_RULE_NO_DNC_LISTS_CONFIGURED&quot; | 
| DIGITAL_RULE_UPDATED_CONTACT_ADDRESS | &quot;DIGITAL_RULE_UPDATED_CONTACT_ADDRESS&quot; | 
| DIGITAL_RULE_SMS_PHONE_NUMBER_TYPE_MISMATCH | &quot;DIGITAL_RULE_SMS_PHONE_NUMBER_TYPE_MISMATCH&quot; | 
| DIGITAL_RULE_ERROR_SKIPPED | &quot;DIGITAL_RULE_ERROR_SKIPPED&quot; | 
| DNC_AUTHENTICATION_FAILURE | &quot;DNC_AUTHENTICATION_FAILURE&quot; | 
| EXCEEDED_CONTACT_LIMIT | &quot;EXCEEDED_CONTACT_LIMIT&quot; | 
| EXCEEDED_DNC_RECORD_LIMIT | &quot;EXCEEDED_DNC_RECORD_LIMIT&quot; | 
| EXCEEDED_DNC_PHONE_NUMBER_LENGTH | &quot;EXCEEDED_DNC_PHONE_NUMBER_LENGTH&quot; | 
| INACTIVE_EDGES_FAILED_PLACE_CALLS | &quot;INACTIVE_EDGES_FAILED_PLACE_CALLS&quot; | 
| INACTIVE_EDGES_TURNED_CAMPAIGN_OFF | &quot;INACTIVE_EDGES_TURNED_CAMPAIGN_OFF&quot; | 
| INVALID_AGENT | &quot;INVALID_AGENT&quot; | 
| INVALID_EMAIL_ADDRESS | &quot;INVALID_EMAIL_ADDRESS&quot; | 
| INVALID_PHONE_NUMBER | &quot;INVALID_PHONE_NUMBER&quot; | 
| IMPORT_FAILED_TO_READ_HEADERS | &quot;IMPORT_FAILED_TO_READ_HEADERS&quot; | 
| IMPORT_COULD_NOT_PARSE_AN_ENTRY | &quot;IMPORT_COULD_NOT_PARSE_AN_ENTRY&quot; | 
| IMPORT_CONTACT_DOES_NOT_MATCH_LIST_FORMAT | &quot;IMPORT_CONTACT_DOES_NOT_MATCH_LIST_FORMAT&quot; | 
| IMPORT_ENTRY_DOES_NOT_ALIGN_WITH_HEADERS | &quot;IMPORT_ENTRY_DOES_NOT_ALIGN_WITH_HEADERS&quot; | 
| IMPORT_INVALID_CUSTOM_ID | &quot;IMPORT_INVALID_CUSTOM_ID&quot; | 
| IMPORT_INVALID_DATA | &quot;IMPORT_INVALID_DATA&quot; | 
| IMPORT_INVALID_EMAIL_ADDRESSES | &quot;IMPORT_INVALID_EMAIL_ADDRESSES&quot; | 
| IMPORT_INVALID_PHONE_NUMBERS | &quot;IMPORT_INVALID_PHONE_NUMBERS&quot; | 
| IMPORT_INVALID_EXPIRATION_DATE | &quot;IMPORT_INVALID_EXPIRATION_DATE&quot; | 
| IMPORT_EXPIRATION_DATE_EXCEEDS_MAX_DAYS | &quot;IMPORT_EXPIRATION_DATE_EXCEEDS_MAX_DAYS&quot; | 
| IMPORT_COLUMN_EXCEEDS_LENGTH_LIMIT | &quot;IMPORT_COLUMN_EXCEEDS_LENGTH_LIMIT&quot; | 
| IMPORT_DATUM_EXCEEDS_LENGTH_LIMIT | &quot;IMPORT_DATUM_EXCEEDS_LENGTH_LIMIT&quot; | 
| IMPORT_MISSING_CUSTOM_ID | &quot;IMPORT_MISSING_CUSTOM_ID&quot; | 
| IMPORT_NO_COLUMNS_DEFINED | &quot;IMPORT_NO_COLUMNS_DEFINED&quot; | 
| IMPORT_COLUMNS_DO_NOT_EXIST_ON_LIST | &quot;IMPORT_COLUMNS_DO_NOT_EXIST_ON_LIST&quot; | 
| IMPORT_LIST_NO_LONGER_EXISTS | &quot;IMPORT_LIST_NO_LONGER_EXISTS&quot; | 
| IMPORT_NO_LISTS_CREATED_NO_CONTACTS_MATCH_FILTER | &quot;IMPORT_NO_LISTS_CREATED_NO_CONTACTS_MATCH_FILTER&quot; | 
| IMPORT_TARGET_CONTACT_LIST_NAME_EXISTS | &quot;IMPORT_TARGET_CONTACT_LIST_NAME_EXISTS&quot; | 
| IMPORT_FAILED_CONTACT_ZIP_CODE_COLUMN_VALUE_INVALID | &quot;IMPORT_FAILED_CONTACT_ZIP_CODE_COLUMN_VALUE_INVALID&quot; | 
| IMPORT_FAILED_CONTACT_DATA_GREATER_THAN_MAX_LENGTH | &quot;IMPORT_FAILED_CONTACT_DATA_GREATER_THAN_MAX_LENGTH&quot; | 
| IMPORT_FAILED_CONTACT_DATA_NOT_WITHIN_MIN_MAX_RANGE | &quot;IMPORT_FAILED_CONTACT_DATA_NOT_WITHIN_MIN_MAX_RANGE&quot; | 
| IMPORT_FAILED_CONTACT_DATA_INVALID_DATATYPE | &quot;IMPORT_FAILED_CONTACT_DATA_INVALID_DATATYPE&quot; | 
| IMPORT_TOO_MANY_COLUMNS | &quot;IMPORT_TOO_MANY_COLUMNS&quot; | 
| IMPORT_TOO_MANY_EXTRA_COLUMNS | &quot;IMPORT_TOO_MANY_EXTRA_COLUMNS&quot; | 
| IMPORT_CONTACT_LIST_NAME_LENGTH_EXCEEDED | &quot;IMPORT_CONTACT_LIST_NAME_LENGTH_EXCEEDED&quot; | 
| ORGANIZATION_HAS_NO_DOMAIN_SET | &quot;ORGANIZATION_HAS_NO_DOMAIN_SET&quot; | 
| QUEUE_NOT_FOUND | &quot;QUEUE_NOT_FOUND&quot; | 
| RECYCLE_CAMPAIGN | &quot;RECYCLE_CAMPAIGN&quot; | 
| SCHEDULED_CAMPAIGN_INVALID | &quot;SCHEDULED_CAMPAIGN_INVALID&quot; | 
| SCHEDULE_UNKNOWN_ERROR | &quot;SCHEDULE_UNKNOWN_ERROR&quot; | 
| SMS_CONTENT_TEMPLATE_NOT_FOUND | &quot;SMS_CONTENT_TEMPLATE_NOT_FOUND&quot; | 
| RECURRING_SCHEDULE_NEXT_OCCURRENCE_FAILURE | &quot;RECURRING_SCHEDULE_NEXT_OCCURRENCE_FAILURE&quot; | 
| RECURRING_SCHEDULE_ENDED | &quot;RECURRING_SCHEDULE_ENDED&quot; | 
| RECURRING_SCHEDULE_MISSED_OCCURRENCES | &quot;RECURRING_SCHEDULE_MISSED_OCCURRENCES&quot; | 
| VERSION_CONFLICT | &quot;VERSION_CONFLICT&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
