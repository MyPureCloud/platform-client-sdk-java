# NluDomainVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **domain** | [**NluDomain**](NluDomain) | The NLU domain of the version. |  [optional] |
| **description** | **String** | The description of the NLU domain version. |  [optional] |
| **language** | **String** | The language that the NLU domain version supports. |  |
| **published** | **Boolean** | Whether this NLU domain version has been published. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date when the NLU domain version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date when the NLU domain version was updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateTrained** | [**Date**](Date) | The date when the NLU domain version was trained. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **datePublished** | [**Date**](Date) | The date when the NLU domain version was published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **trainingStatus** | [**TrainingStatusEnum**](#Enum--TrainingStatusEnum) | The training status of the NLU domain version. |  [optional] |
| **evaluationStatus** | [**EvaluationStatusEnum**](#Enum--EvaluationStatusEnum) | The evaluation status of the NLU domain version. |  [optional] |
| **intents** | [**List&lt;IntentDefinition&gt;**](IntentDefinition) | The intents defined for this NLU domain version. |  [optional] |
| **entityTypes** | [**List&lt;NamedEntityTypeDefinition&gt;**](NamedEntityTypeDefinition) | The entity types defined for this NLU domain version. |  [optional] |
| **entities** | [**List&lt;NamedEntityDefinition&gt;**](NamedEntityDefinition) | The entities defined for this NLU domain version.This field is mutually exclusive with entityTypeBindings |  [optional] |
| **languageVersions** | **Map&lt;String, String&gt;** | Map of language code to NLU domain version UUID for multilingual domains. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TrainingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNTRAINED | &quot;Untrained&quot; | 
| TRAINING | &quot;Training&quot; | 
| TRAINED | &quot;Trained&quot; | 
| ERROR | &quot;Error&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: EvaluationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNEVALUATED | &quot;Unevaluated&quot; | 
| EVALUATING | &quot;Evaluating&quot; | 
| EVALUATED | &quot;Evaluated&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
