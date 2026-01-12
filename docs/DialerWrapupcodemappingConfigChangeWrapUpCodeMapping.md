# DialerWrapupcodemappingConfigChangeWrapUpCodeMapping


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Long** | Required for updates, must match the version number of the most recent update |  [optional] |
| **defaultSet** | [**List<DefaultSetEnum>**](#Enum--DefaultSetEnum) |  |  [optional] |
| **mapping** | [**Map&lt;String, List&lt;String&gt;&gt;**](List) |  |  [optional] |


## Enum: DefaultSetEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CONTACT_UNCALLABLE | &quot;CONTACT_UNCALLABLE&quot; |
| NUMBER_UNCALLABLE | &quot;NUMBER_UNCALLABLE&quot; |
| RIGHT_PARTY_CONTACT | &quot;RIGHT_PARTY_CONTACT&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
