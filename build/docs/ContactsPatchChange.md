# ContactsPatchChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **field** | **String** | A JSONPath string, whose syntax is a strict subset of the JSONPath RFC 9535.  The root of the field string must be \"$.\" indicating a path from the root of the entity. You may only use dot-notation to access named fields. Examples: To select the `firstName` field of a Contact, use: \"$.firstName\".To access object fields, use the top level object field name: \"$.address\". To access nested field names, use the nested field name: \"$.address.city\". Note: trying to patch both nested fields and their parent field is not allowed and will result in a 409 error response. |  |
| **value** | **Object** | The value which is applied to the selected field for the patch. Acceptable types are String, Integer, Boolean, Array, Map. |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The action of the operation.UpdateIfEmpty: Update if and only if the current value is emptyUpdate: Update the field unconditionally.UpdateIfExists: Update the field if and only if the existing field is not empty.AppendToCollection: Add new items to a collection, preserving existing data.Remove: Remove the current value unconditionally.RemoveFromCollection: Remove specified value from a collection. |  |


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPDATEIFEMPTY | &quot;UpdateIfEmpty&quot; | 
| UPDATEIFEXISTS | &quot;UpdateIfExists&quot; | 
| UPDATE | &quot;Update&quot; | 
| APPENDTOCOLLECTION | &quot;AppendToCollection&quot; | 
| REMOVE | &quot;Remove&quot; | 
| REMOVEFROMCOLLECTION | &quot;RemoveFromCollection&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:250.0.0_
