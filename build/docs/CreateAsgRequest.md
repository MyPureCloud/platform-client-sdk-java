---
title: CreateAsgRequest
---
## CreateAsgRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **asgOwnerEmail** | **String** | Email address of the individual starting the ASG |  |
| **edgeGroupId** | **String** | Edge group that the user wants the asg edges to be assigned to. |  [optional] |
| **externalTrunkBaseId** | **String** | Trunk base that the user wants the asg edges to be assigned to |  [optional] |
| **asgLogicalIAMInstanceProfile** | **String** | Overrides the default logical IAM Instance Profile |  [optional] |
| **asgAmi** | **String** | Overrides the default EDGE AMI used with the ASG |  [optional] |
| **asgType** | [**AsgTypeEnum**](#AsgTypeEnum) | Overrides the type of ASG being created.  By default we always create a &#39;standard&#39; asg. |  [optional] |
| **asgInstanceCount** | **Integer** | Overrides the default number of Edge instances to start in the ASG |  [optional] |
| **asgNetworkSpace** | **String** | Overrides the network space the ASG will start in.  The default will always be mediaservices |  [optional] |
| **asgChaosExempt** | **Boolean** | Optional parameter that exempts this ASG from chaos monkey killing one of its instances. |  [optional] |
| **asgRecoveryShutdownMinutes** | **Integer** | Number of minutes a recovery ASG will stay active before it is torn down |  [optional] |
{: class="table table-striped"}


<a name="AsgTypeEnum"></a>

## Enum: AsgTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| STANDARD | &quot;standard&quot; |
| RECOVERY | &quot;recovery&quot; |
{: class="table table-striped"}


