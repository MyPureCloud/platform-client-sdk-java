# BulkRelationshipsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **results** | [**List&lt;BulkResponseResultRelationshipRelationshipBulkEntityErrorRelationship&gt;**](BulkResponseResultRelationshipRelationshipBulkEntityErrorRelationship) | A list of results for all of the Bulk operations specified in the request. Includes both successes and failures. Ordering is NOT guaranteed - may be in a different order from the request. |  [optional] |
| **errorCount** | **Integer** | The number of failed operations in the results. |  [optional] |
| **errorIndexes** | **List&lt;Integer&gt;** | The indexes of all failed operations in the results field. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
