# DecisionTable


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | The decision table description. |  [optional] |
| **dateCreated** | [**Date**](Date) | UTC date time indicating when this decision table was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | UTC date time indicating when this decision table was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **datePublished** | [**Date**](Date) | UTC date time indicating when this decision table was published. Null if never published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **published** | [**DecisionTableVersionEntity**](DecisionTableVersionEntity) | The entity reference to the most recently published decision table version. Null if never published. |  [optional] |
| **latest** | [**DecisionTableVersionEntity**](DecisionTableVersionEntity) | The entity reference to the most recently created decision table version. |  [optional] |
| **columns** | [**DecisionTableColumns**](DecisionTableColumns) | The column definitions of this decision table. |  [optional] |
| **publishedContract** | [**DecisionTableContract**](DecisionTableContract) | The published contract information for this decision table. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
