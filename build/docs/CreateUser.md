---
title: CreateUser
---
## CreateUser


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | User's full name |  |
| **department** | <!----><!---->**String**<!----> |  |  [optional] |
| **email** | <!----><!---->**String**<!----> | User's email and username |  |
| **addresses** | <!----><!---->[**List&lt;Contact&gt;**](Contact.html)<!----> | Email addresses and phone numbers for this user |  [optional] |
| **title** | <!----><!---->**String**<!----> |  |  [optional] |
| **password** | <!----><!---->**String**<!----> | User's password |  [optional] |
| **divisionId** | <!----><!---->**String**<!----> | The division to which this user will belong |  |
| **state** | [**StateEnum**](#StateEnum)<!----> | Optional initialized state of the user. If not specified, state will be Active if invites are sent, otherwise Inactive. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 
{: class="table table-striped"}



