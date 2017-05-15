---
title: UserMe
---
## UserMe


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **chat** | [**Chat**](Chat.html) |  |  [optional] |
| **department** | **String** |  |  [optional] |
| **email** | **String** |  |  [optional] |
| **primaryContactInfo** | [**List&lt;Contact&gt;**](Contact.html) | Auto populated from addresses. |  [optional] |
| **addresses** | [**List&lt;Contact&gt;**](Contact.html) | Email addresses and phone numbers for this user |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | The current state for this user. |  [optional] |
| **title** | **String** |  |  [optional] |
| **username** | **String** |  |  [optional] |
| **manager** | [**User**](User.html) |  |  [optional] |
| **images** | [**List&lt;UserImage&gt;**](UserImage.html) |  |  [optional] |
| **version** | **Integer** | Required when updating a user, this value should be the current version of the user.  The current version can be obtained with a GET on the user before doing a PATCH. |  |
| **routingStatus** | [**RoutingStatus**](RoutingStatus.html) | ACD routing status |  [optional] |
| **presence** | [**UserPresence**](UserPresence.html) | Active presence |  [optional] |
| **conversationSummary** | [**UserConversationSummary**](UserConversationSummary.html) | Summary of conversion statistics for conversation types. |  [optional] |
| **outOfOffice** | [**OutOfOffice**](OutOfOffice.html) | Determine if out of office is enabled |  [optional] |
| **geolocation** | [**Geolocation**](Geolocation.html) | Current geolocation position |  [optional] |
| **station** | [**UserStations**](UserStations.html) | Effective, default, and last station information |  [optional] |
| **authorization** | [**UserAuthorization**](UserAuthorization.html) | Roles and permissions assigned to the user |  [optional] |
| **profileSkills** | **List&lt;String&gt;** | Skills possessed by the user |  [optional] |
| **locations** | [**List&lt;Location&gt;**](Location.html) | The user placement at each site location. |  [optional] |
| **groups** | [**List&lt;Group&gt;**](Group.html) | The groups the user is a member of |  [optional] |
| **date** | [**ServerDate**](ServerDate.html) | The PureCloud system date time. |  [optional] |
| **geolocationSettings** | [**GeolocationSettings**](GeolocationSettings.html) | Geolocation settings for user&#39;s organization. |  [optional] |
| **organization** | [**Organization**](Organization.html) | Organization details for this user. |  [optional] |
| **presenceDefinitions** | [**List&lt;OrganizationPresence&gt;**](OrganizationPresence.html) | The first 100 presence definitions for user&#39;s organization. |  [optional] |
| **locationDefinitions** | [**List&lt;LocationDefinition&gt;**](LocationDefinition.html) | The first 100 site locations for user&#39;s organization |  [optional] |
| **orgAuthorization** | [**List&lt;DomainOrganizationRole&gt;**](DomainOrganizationRole.html) | The first 100 organization roles, with applicable permission policies, for user&#39;s organization. |  [optional] |
| **favorites** | [**List&lt;User&gt;**](User.html) | The first 50 favorited users. |  [optional] |
| **superiors** | [**List&lt;User&gt;**](User.html) | The first 50 superiors of this user. |  [optional] |
| **directReports** | [**List&lt;User&gt;**](User.html) | The first 50 direct reports to this user. |  [optional] |
| **adjacents** | [**Adjacents**](Adjacents.html) | The first 50 superiors, direct reports, and siblings of this user. Mutually exclusive with superiors and direct reports expands. |  [optional] |
| **routingSkills** | [**List&lt;RoutingSkill&gt;**](RoutingSkill.html) | The first 50 routing skills for user&#39;s organizations |  [optional] |
| **fieldConfigs** | [**FieldConfigs**](FieldConfigs.html) | The field config for all entities types of user&#39;s organization |  [optional] |
| **token** | [**TokenInfo**](TokenInfo.html) | Information about the current token |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
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


