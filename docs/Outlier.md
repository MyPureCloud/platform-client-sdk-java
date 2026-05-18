# Outlier


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timestamp** | [**Date**](Date) | Timestamp of the outlier. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **anomaly** | [**AnomalyEnum**](#Enum--AnomalyEnum) | The type of the anomaly |  [optional] |
| **normalizedValue** | **Double** | Normalized value of the outlier |  [optional] |


## Enum: AnomalyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADDITIVEOUTLIER | &quot;AdditiveOutlier&quot; | 
| INNOVATIVEOUTLIER | &quot;InnovativeOutlier&quot; | 
| LEVELSHIFT | &quot;LevelShift&quot; | 
| SEASONALLEVELSHIFT | &quot;SeasonalLevelShift&quot; | 
| TEMPORARYCHANGE | &quot;TemporaryChange&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:253.2.0_
