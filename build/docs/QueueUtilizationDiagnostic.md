---
title: QueueUtilizationDiagnostic
---
## QueueUtilizationDiagnostic


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | Identifier of the queue |  [optional] |
| **usersInQueue** | <!----><!---->**Integer**<!----> | The number of users joined to the queue |  [optional] |
| **activeUsersInQueue** | <!----><!---->**Integer**<!----> | The number of users active on the queue |  [optional] |
| **usersOnQueue** | <!----><!---->**Integer**<!----> | The number of users with a status of on-queue |  [optional] |
| **usersNotUtilized** | <!----><!---->**Integer**<!----> | The number of users in the queue currently not engaged |  [optional] |
| **usersOnQueueWithStation** | <!----><!---->**Integer**<!----> | The number of users in the queue with a station |  [optional] |
| **usersOnACampaignCall** | <!----><!---->**Integer**<!----> | The number of users currently engaged in a campaign call |  [optional] |
| **usersOnDifferentEdgeGroup** | <!----><!---->**Integer**<!----> | The number of users whose station is homed to an edge different from the campaign |  [optional] |
| **usersOnANonCampaignCall** | <!----><!---->**Integer**<!----> | The number of users currently engaged in a communication that is not part of the campaign |  [optional] |
{: class="table table-striped"}



