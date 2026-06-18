# ExternalEventsConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique identifier for the external event configuration. |  |
| **name** | **String** |  |  [optional] |
| **description** | **String** | A description of the external event configuration. |  |
| **divisionId** | **String** | The division ID (UUID) associated with this configuration. |  |
| **divisionIdActive** | **Boolean** | Indicates whether the divisionId field is valid. |  |
| **schemaId** | **String** | The dynamic schema ID (UUID) that defines the structure of external events. |  |
| **schemaActive** | **Boolean** | Indicates whether the schema is active or inactive. |  |
| **source** | **String** | The source of the external events e.g. Adobe, Salesforce. |  |
| **dateLastModified** | [**Date**](Date) | The timestamp when the configuration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:256.1.0_
