# ContentList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A unique ID assigned to this rich message content. |  [optional] |
| **listType** | [**ListTypeEnum**](#Enum--ListTypeEnum) | The type of list this instance represents. |  [optional] |
| **title** | **String** | Text to show in the title. |  [optional] |
| **description** | **String** | Text to show in the description. |  [optional] |
| **submitLabel** | **String** | Label for Submit button. |  [optional] |
| **actions** | [**ContentActions**](ContentActions) | The list actions (Deprecated). |  [optional] |
| **components** | [**List&lt;ListItemComponent&gt;**](ListItemComponent) | An array of component objects. |  [optional] |


## Enum: ListTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SELECTION | &quot;Selection&quot; | 
| VERTICAL | &quot;Vertical&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:225.0.0_
