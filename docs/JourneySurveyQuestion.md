# JourneySurveyQuestion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type of survey question. |  [optional] |
| **label** | **String** | Label of question. |  |
| **customerProperty** | [**CustomerPropertyEnum**](#Enum--CustomerPropertyEnum) | The customer property that the answer maps to. |  [optional] |
| **choices** | **List&lt;String&gt;** | Choices available to user. |  [optional] |
| **isMandatory** | **Boolean** | Whether answering this question is mandatory. |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;text&quot; | 
| HIDDEN | &quot;hidden&quot; | 
| SELECT | &quot;select&quot; | 
| CHECKBOX | &quot;checkbox&quot; | 
| TEXTAREA | &quot;textarea&quot; | 
{: class="table table-striped"}


## Enum: CustomerPropertyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GIVENNAME | &quot;givenName&quot; | 
| FAMILYNAME | &quot;familyName&quot; | 
| EMAIL | &quot;email&quot; | 
| PHONE | &quot;phone&quot; | 
| GENDER | &quot;gender&quot; | 
| COMPANYNAME | &quot;companyName&quot; | 
{: class="table table-striped"}



