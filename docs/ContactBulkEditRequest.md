# ContactBulkEditRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contactListFilterId** | **String** | Contact List Filter ID. |  [optional] |
| **criteria** | [**ContactBulkSearchCriteria**](ContactBulkSearchCriteria) | Criteria to filter the contacts by. |  [optional] |
| **contactIds** | **List&lt;String&gt;** | Contact IDs to be bulk edited. |  [optional] |
| **contact** | [**DialerContact**](DialerContact) | Contact object with details of fields used for patching. |  [optional] |
| **generateDownloadURI** | **Boolean** | Whether to do backup export as part of Bulk Operation or not. Default: true. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
