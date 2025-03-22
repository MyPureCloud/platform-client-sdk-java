# OneLogin


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **disabled** | **Boolean** |  |  [optional] |
| **issuerURI** | **String** |  |  [optional] |
| **ssoTargetURI** | **String** |  |  [optional] |
| **sloURI** | **String** |  |  [optional] |
| **sloBinding** | **String** |  |  [optional] |
| **relyingPartyIdentifier** | **String** |  |  [optional] |
| **certificate** | **String** |  |  [optional] |
| **certificates** | **List&lt;String&gt;** |  |  [optional] |
| **logoImageData** | **String** |  |  [optional] |
| **nameIdentifierFormat** | [**NameIdentifierFormatEnum**](#Enum--NameIdentifierFormatEnum) |  |  [optional] |
| **ssoBinding** | [**SsoBindingEnum**](#Enum--SsoBindingEnum) |  |  [optional] |
| **signAuthnRequests** | **Boolean** |  |  [optional] |
| **providerName** | **String** |  |  [optional] |
| **displayOnLogin** | **Boolean** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: NameIdentifierFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| URN_OASIS_NAMES_TC_SAML_1_1_NAMEID_FORMAT_UNSPECIFIED | &quot;urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified&quot; | 
| URN_OASIS_NAMES_TC_SAML_1_1_NAMEID_FORMAT_EMAILADDRESS | &quot;urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress&quot; | 
| URN_OASIS_NAMES_TC_SAML_1_1_NAMEID_FORMAT_X509SUBJECTNAME | &quot;urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName&quot; | 
| URN_OASIS_NAMES_TC_SAML_1_1_NAMEID_FORMAT_WINDOWSDOMAINQUALIFIEDNAME | &quot;urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName&quot; | 
| URN_OASIS_NAMES_TC_SAML_2_0_NAMEID_FORMAT_KERBEROS | &quot;urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos&quot; | 
| URN_OASIS_NAMES_TC_SAML_2_0_NAMEID_FORMAT_ENTITY | &quot;urn:oasis:names:tc:SAML:2.0:nameid-format:entity&quot; | 
| URN_OASIS_NAMES_TC_SAML_2_0_NAMEID_FORMAT_PERSISTENT | &quot;urn:oasis:names:tc:SAML:2.0:nameid-format:persistent&quot; | 
| URN_OASIS_NAMES_TC_SAML_2_0_NAMEID_FORMAT_TRANSIENT | &quot;urn:oasis:names:tc:SAML:2.0:nameid-format:transient&quot; | 


## Enum: SsoBindingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| URN_OASIS_NAMES_TC_SAML_2_0_BINDINGS_HTTP_POST | &quot;urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST&quot; | 
| URN_OASIS_NAMES_TC_SAML_2_0_BINDINGS_HTTP_REDIRECT | &quot;urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
