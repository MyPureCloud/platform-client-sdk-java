---
title: VipRouting
---
## VipRouting


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **vipCallMediaSettings** | <!----><!---->[**VipCallMediaSettings**](VipCallMediaSettings.html)<!----> | VIP Settings specific to Call media. |  [optional] |
| **vipEmailMediaSettings** | <!----><!---->[**VipMediaSettings**](VipMediaSettings.html)<!----> | VIP Settings specific to Email media. |  [optional] |
| **vipMessageMediaSettings** | <!----><!---->[**VipMediaSettings**](VipMediaSettings.html)<!----> | VIP Settings specific to Message media. |  [optional] |
| **vipMaxOwnershipTimeSeconds** | <!----><!---->**Integer**<!----> | The max amount of time a VIP interaction will wait for the VIP user before going to the selected backup option (in seconds). Allowable range 10 seconds - 864000 seconds (ten days). |  [optional] |
| **vipBackup** | <!----><!---->[**VipBackup**](VipBackup.html)<!----> | VIP queue default VIP Backup settings for unanswered VIP interactions to fallback to. VIP Backup set for a specific VIP user has preference before queue default. |  [optional] |
{: class="table table-striped"}



