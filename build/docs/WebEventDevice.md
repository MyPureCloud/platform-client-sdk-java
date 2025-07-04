# WebEventDevice


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) | Device category. |  |
| **type** | **String** | Device type (e.g. iPad, iPhone, Other). |  |
| **isMobile** | **Boolean** | Flag that is true for mobile devices. |  [optional] |
| **screenHeight** | **Integer** | Device's screen height. |  [optional] |
| **screenWidth** | **Integer** | Device's screen width. |  [optional] |
| **screenDensity** | **Integer** | Device's screen density, measured as a scale factor where a value of 1 represents a baseline 1:1 ratio of pixels to logical (device-independent) pixels. |  [optional] |
| **osFamily** | **String** | Operating system family. |  |
| **osVersion** | **String** | Operating system version. |  |
| **manufacturer** | **String** | Manufacturer of the device. |  [optional] |


## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DESKTOP | &quot;desktop&quot; | 
| MOBILE | &quot;mobile&quot; | 
| TABLET | &quot;tablet&quot; | 
| OTHER | &quot;other&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
