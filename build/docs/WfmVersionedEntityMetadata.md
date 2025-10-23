# WfmVersionedEntityMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **version** | **Integer** | The version of the associated entity.  Used to prevent conflicts on concurrent edits |  |
| **modifiedBy** | [**UserReference**](UserReference) | The user who last modified the associated entity. The id may be 'System' if it was an automated process |  [optional] |
| **dateModified** | [**Date**](Date) | The date the associated entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the associated entity, if available. The id may be 'System' if it was an automated process |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the associated entity was created, if available. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
