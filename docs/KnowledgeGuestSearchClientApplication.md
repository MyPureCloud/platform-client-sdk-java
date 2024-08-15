# KnowledgeGuestSearchClientApplication


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Application type. |  |
| **deployment** | [**EntityReference**](EntityReference) | Application details when type is MessengerKnowledgeApp or SupportCenter. |  [optional] |
| **botFlow** | [**EntityReference**](EntityReference) | Application details when type is BotFlow. |  [optional] |
| **assistant** | [**EntityReference**](EntityReference) | Application details when type is Assistant. |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASSISTANT | &quot;Assistant&quot; | 
| BOTFLOW | &quot;BotFlow&quot; | 
| MESSENGERKNOWLEDGEAPP | &quot;MessengerKnowledgeApp&quot; | 
| SMARTADVISOR | &quot;SmartAdvisor&quot; | 
| SUPPORTCENTER | &quot;SupportCenter&quot; | 
{: class="table table-striped"}



