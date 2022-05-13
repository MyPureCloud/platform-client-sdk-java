---
title: DialerResponsesetConfigChangeResponseSet
---
## DialerResponsesetConfigChangeResponseSet


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **responses** | <!----><!---->[**Map&lt;String, DialerResponsesetConfigChangeReaction&gt;**](DialerResponsesetConfigChangeReaction.html)<!----> | Map of disposition identifiers to reactions. For example: {\"disposition.classification.callable.person\": {\"reactionType\": \"transfer\"}} |  [optional] |
| **beepDetectionEnabled** | <!----><!---->**Boolean**<!----> | When beep detection is enabled, answering machine detection will wait for the beep before transferring the call |  [optional] |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The UI-visible name of the object |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
{: class="table table-striped"}



