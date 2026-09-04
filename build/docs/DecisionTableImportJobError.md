# DecisionTableImportJobError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **errorCode** | **String** | The error code for this job failure. |  [optional] |
| **errorMessage** | **String** | A human-readable error message. |  [optional] |
| **messageWithParams** | **String** | Parameterized message template for the aggregate failure (when applicable) |  [optional] |
| **messageParams** | **Map&lt;String, String&gt;** | Parameters for messageWithParams |  [optional] |
| **validationErrors** | [**List&lt;DecisionTableJobValidationError&gt;**](DecisionTableJobValidationError) | Validation failures for individual rows or the file structure |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
