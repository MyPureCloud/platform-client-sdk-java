# ActionCertificate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **signingAuthority** | [**SigningAuthorityEnum**](#Enum--SigningAuthorityEnum) | The Signing Authority for the certificate |  [optional] |
| **certificate** | **String** | The certificate string |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The certificate status |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The certificate type |  [optional] |
{: class="table table-striped"}


## Enum: SigningAuthorityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIGICERT | &quot;DigiCert&quot; | 
| GENESYS | &quot;Genesys&quot; | 
{: class="table table-striped"}


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CURRENT | &quot;Current&quot; | 
| UPCOMING | &quot;Upcoming&quot; | 
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLIENT | &quot;Client&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
