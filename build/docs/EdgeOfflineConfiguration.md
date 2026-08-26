# EdgeOfflineConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pairingId** | **String** | The pairingId for your hardware Edge in the format: 00000-00000-00000-00000-00000. |  |
| **network** | [**EdgeOfflineConfigurationNetwork**](EdgeOfflineConfigurationNetwork) | Network settings for your hardware Edge. |  |
| **useVerificationCode** | **Boolean** | Boolean to know if the verification code will be used to provision the Edge. Only used if the Edge is being provisioned. |  [optional] |
| **certType** | [**CertTypeEnum**](#Enum--CertTypeEnum) | The type of Certificate Authority this Edge will use. Defaults to NotRequested if the Edge is already provisioned. PureCloud signed CA is recommended. Public CA signed by a trusted third party. China CA must be used if the Site's Location is in China. |  [optional] |
| **site** | [**DomainEntityRef**](DomainEntityRef) | The Site that will be associated to the Edge. Required if the Edge is being provisioned. |  [optional] |
| **proxy** | **String** | Edge HTTP proxy configuration for the WAN port. The field can be a hostname, FQDN, IPv4 or IPv6 address. If port is not included, port 80 is assumed. |  [optional] |


## Enum: CertTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PURECLOUD | &quot;PureCloud&quot; | 
| PUBLIC | &quot;Public&quot; | 
| CHINA | &quot;China&quot; | 
| NOTREQUESTED | &quot;NotRequested&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
