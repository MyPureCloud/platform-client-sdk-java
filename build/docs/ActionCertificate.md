---
title: ActionCertificate
---
## ActionCertificate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **signingAuthority** | [**SigningAuthorityEnum**](#SigningAuthorityEnum)<!----> | The Signing Authority for the certificate |  [optional] |
| **certificate** | <!----><!---->**String**<!----> | The certificate string |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The certificate status |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The certificate type |  [optional] |
{: class="table table-striped"}


<a name="SigningAuthorityEnum"></a>

## Enum: SigningAuthorityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIGICERT | &quot;DigiCert&quot; | 
| GENESYS | &quot;Genesys&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CURRENT | &quot;Current&quot; | 
| UPCOMING | &quot;Upcoming&quot; | 
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLIENT | &quot;Client&quot; | 
{: class="table table-striped"}



