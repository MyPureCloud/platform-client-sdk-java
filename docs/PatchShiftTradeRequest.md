# PatchShiftTradeRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **receivingUserId** | [**ValueWrapperString**](ValueWrapperString) | Update the ID of the receiving user to direct the request at a specific user, or set the wrapped id to null to open up a trade to be matched by any user. |  [optional] |
| **expiration** | [**ValueWrapperDate**](ValueWrapperDate) | Update the expiration time for this shift trade. |  [optional] |
| **acceptableIntervals** | [**ListWrapperInterval**](ListWrapperInterval) | Update the acceptable intervals the initiating user is willing to accept in trade. Setting the enclosed list to empty will make this a one sided trade request |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata |  |




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
