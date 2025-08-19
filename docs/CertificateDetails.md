# CertificateDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **issuer** | **String** | Information about the issuer of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500. |  [optional] |
| **subject** | **String** | Information about the subject of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500. |  [optional] |
| **expirationDate** | [**Date**](Date) | The expiration date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **issueDate** | [**Date**](Date) | The issue date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **expired** | **Boolean** | True if the certificate is expired, false otherwise. |  [optional] |
| **valid** | **Boolean** |  |  [optional] |
| **signatureValid** | **Boolean** |  |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
