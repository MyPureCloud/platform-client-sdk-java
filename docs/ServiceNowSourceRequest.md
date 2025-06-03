# ServiceNowSourceRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the integration source. |  |
| **integrationId** | **String** | The integration associated with the source. |  [optional] |
| **schedulePeriod** | **Integer** | The schedule period of the source in hours. Must be at least 6 and at most 48 hours. |  [optional] |
| **settings** | [**ServiceNowSettings**](ServiceNowSettings) | The settings of the source. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
