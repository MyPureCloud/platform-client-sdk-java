# DecisionTableExportJobError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **errorCode** | **String** | The error code for this job failure. |  [optional] |
| **errorMessage** | **String** | A human-readable error message. |  [optional] |
| **messageWithParams** | **String** | Parameterized message template for the aggregate failure (when applicable) |  [optional] |
| **messageParams** | **Map&lt;String, String&gt;** | Parameters for messageWithParams |  [optional] |
| **validationErrors** | [**List&lt;DecisionTableJobValidationError&gt;**](DecisionTableJobValidationError) | Validation failures for the export job |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
