# MessengerSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether or not messenger is enabled |  [optional] |
| **styles** | [**MessengerStyles**](MessengerStyles) | The style settings for messenger |  [optional] |
| **launcherButton** | [**LauncherButtonSettings**](LauncherButtonSettings) | The launcher button settings for messenger |  [optional] |
| **fileUpload** | [**FileUploadSettings**](FileUploadSettings) | The file upload settings for messenger |  [optional] |
| **apps** | [**MessengerApps**](MessengerApps) | The apps embedded in the messenger |  [optional] |
| **homeScreen** | [**MessengerHomeScreen**](MessengerHomeScreen) | The homescreen settings for messenger |  [optional] |
| **sessionPersistenceType** | [**SessionPersistenceTypeEnum**](#Enum--SessionPersistenceTypeEnum) | The session persistence type for messenger |  [optional] |
{: class="table table-striped"}


## Enum: SessionPersistenceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACROSSSUBDOMAINS | &quot;AcrossSubdomains&quot; | 
| DOMAINORSUBDOMAINONLY | &quot;DomainOrSubdomainOnly&quot; | 
{: class="table table-striped"}



