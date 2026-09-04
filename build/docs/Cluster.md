# Cluster


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique ID of this cluster within its associated scan |  [optional] |
| **division** | [**StarrableDivision**](StarrableDivision) | The division all contacts in this cluster are associated to |  [optional] |
| **clusterScan** | [**ClusterScan**](ClusterScan) | The scan that this cluster belongs to |  [optional] |
| **mergeInfo** | [**MergeInfo**](MergeInfo) | Information related to merge operations taken on this cluster |  [optional] |
| **graph** | [**Graph**](Graph) | The graph of contacts and identifiers that make up this cluster |  [optional] |
| **dateCreated** | [**Date**](Date) | The date this cluster was discovered. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
