# WrapUpCodeMapping


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **defaultSet** | [**List<DefaultSetEnum>**](#Enum--DefaultSetEnum) | The default set of wrap-up flags. These will be used if there is no entry for a given wrap-up code in the mapping. |  [optional] |
| **mapping** | [**Map&lt;String, List&lt;String&gt;&gt;**](List) | A map from wrap-up code identifiers to a set of wrap-up flags. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: DefaultSetEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CONTACT_UNCALLABLE | &quot;CONTACT_UNCALLABLE&quot; |
| NUMBER_UNCALLABLE | &quot;NUMBER_UNCALLABLE&quot; |
| RIGHT_PARTY_CONTACT | &quot;RIGHT_PARTY_CONTACT&quot; |
| BUSINESS_SUCCESS | &quot;BUSINESS_SUCCESS&quot; |
| BUSINESS_FAILURE | &quot;BUSINESS_FAILURE&quot; |
| BUSINESS_NEUTRAL | &quot;BUSINESS_NEUTRAL&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
