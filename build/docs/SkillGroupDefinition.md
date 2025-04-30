# SkillGroupDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The group name. |  |
| **division** | [**WritableDivision**](WritableDivision) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | Group description |  [optional] |
| **memberCount** | **Long** | Estimated number of members in this group. It can take some time for the count to be updated after expressions are changed. |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified date/time of the skill group. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCreated** | [**Date**](Date) | Created date/time of the skill group. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
