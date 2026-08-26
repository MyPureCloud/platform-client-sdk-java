# OutboundFaxStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **initiatingUser** | [**AddressableEntityRef**](AddressableEntityRef) | The user who sent the fax. |  [optional] |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **auditTransactionId** | **String** |  |  [optional] |
| **expirationTime** | **Long** |  |  [optional] |
| **statusCode** | **String** | Lifecycle status of the outbound fax send (e.g. UPLOADING, TRANSMITTING, COMPLETE, TERMINATED). |  [optional] |
| **result** | **String** | Transmission result of the fax. Does NOT indicate successful arrival to a workspace's inbox. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
