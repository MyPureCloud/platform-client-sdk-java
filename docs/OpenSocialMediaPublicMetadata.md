# OpenSocialMediaPublicMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **rootId** | **String** | The id of the root public message. |  |
| **replyToId** | **String** | The id of the message this public message is replying to. |  [optional] |
| **source** | **String** | The source of the public message. Useful when there could be more than location. Channel specific, e.g., for Facebook it's a source page. |  [optional] |
| **url** | **String** | The URL of the social post on the native platform. |  [optional] |
| **mentionIds** | **List&lt;String&gt;** | IDs of accounts referenced by name within the message text or caption (for example '@brandpage' in a post body or comment). A 'mention' here uses the same convention as Meta (Facebook, Instagram) and LinkedIn, where it denotes a textual reference to an account. Distinct from tagIds, which represent explicit associations with the message. Null or absent when no accounts are referenced in the text. |  [optional] |
| **tagIds** | **List&lt;String&gt;** | IDs of accounts attached to the message itself, independent of the text (for example a person tagged in an Instagram photo so their profile is linked from the image). A 'tag' here uses the same convention as Meta (Facebook, Instagram) and LinkedIn, where it denotes an explicit association with content rather than a textual reference. Distinct from mentionIds, which represent in-text/caption references. Null or absent when no accounts are tagged on the message. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
