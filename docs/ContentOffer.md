# ContentOffer


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **imageUrl** | **String** | URL for image displayed to the customer when displaying content offer. |  [optional] |
| **displayMode** | [**DisplayModeEnum**](#Enum--DisplayModeEnum) | The display mode of Genesys Widgets when displaying content offer. |  |
| **layoutMode** | [**LayoutModeEnum**](#Enum--LayoutModeEnum) | The layout mode of the text shown to the user when displaying content offer. |  |
| **title** | **String** | Title used in the header of the content offer. |  [optional] |
| **headline** | **String** | Headline displayed above the body text of the content offer. |  [optional] |
| **body** | **String** | Body text of the content offer. |  [optional] |
| **callToAction** | [**CallToAction**](CallToAction) | Properties customizing the call to action button on the content offer. |  [optional] |
| **style** | [**ContentOfferStylingConfiguration**](ContentOfferStylingConfiguration) | Properties customizing the styling of the content offer. |  [optional] |


## Enum: DisplayModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MODAL | &quot;Modal&quot; | 
| OVERLAY | &quot;Overlay&quot; | 
| TOAST | &quot;Toast&quot; | 


## Enum: LayoutModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXTONLY | &quot;TextOnly&quot; | 
| IMAGEONLY | &quot;ImageOnly&quot; | 
| LEFTTEXT | &quot;LeftText&quot; | 
| RIGHTTEXT | &quot;RightText&quot; | 
| TOPTEXT | &quot;TopText&quot; | 
| BOTTOMTEXT | &quot;BottomText&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
