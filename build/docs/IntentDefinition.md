# IntentDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the intent. |  [optional] |
| **name** | **String** | The name of the intent. |  |
| **description** | **String** | The description of the intent. |  [optional] |
| **entityTypeBindings** | [**List&lt;NamedEntityTypeBinding&gt;**](NamedEntityTypeBinding) | The bindings for the named entity types used in this intent.This field is mutually exclusive with entityNameReferences and entities |  [optional] |
| **entityNameReferences** | **List&lt;String&gt;** | The references for the named entity used in this intent.This field is mutually exclusive with entityTypeBindings |  [optional] |
| **utterances** | [**List&lt;NluUtterance&gt;**](NluUtterance) | The utterances that act as training phrases for the intent. |  |
| **additionalLanguages** | [**Map&lt;String, AdditionalLanguagesIntent&gt;**](AdditionalLanguagesIntent) | Additional languages for intents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
