package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Information about a public message.
 */
@ApiModel(description = "Information about a public message.")

public class OpenSocialMediaPublicMetadata  implements Serializable {
  
  private String rootId = null;
  private String replyToId = null;
  private String source = null;
  private String url = null;
  private List<String> mentionIds = null;
  private List<String> tagIds = null;

  public OpenSocialMediaPublicMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mentionIds = new ArrayList<String>();
      tagIds = new ArrayList<String>();
    }
  }

  public OpenSocialMediaPublicMetadata(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      mentionIds = new ArrayList<String>();
      tagIds = new ArrayList<String>();
    }
  }

  
  /**
   * The id of the root public message.
   **/
  public OpenSocialMediaPublicMetadata rootId(String rootId) {
    this.rootId = rootId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the root public message.")
  @JsonProperty("rootId")
  public String getRootId() {
    return rootId;
  }
  public void setRootId(String rootId) {
    this.rootId = rootId;
  }


  /**
   * The id of the message this public message is replying to.
   **/
  public OpenSocialMediaPublicMetadata replyToId(String replyToId) {
    this.replyToId = replyToId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the message this public message is replying to.")
  @JsonProperty("replyToId")
  public String getReplyToId() {
    return replyToId;
  }
  public void setReplyToId(String replyToId) {
    this.replyToId = replyToId;
  }


  /**
   * The source of the public message. Useful when there could be more than location. Channel specific, e.g., for Facebook it's a source page.
   **/
  public OpenSocialMediaPublicMetadata source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source of the public message. Useful when there could be more than location. Channel specific, e.g., for Facebook it's a source page.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   * The URL of the social post on the native platform.
   **/
  public OpenSocialMediaPublicMetadata url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the social post on the native platform.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * IDs of accounts referenced by name within the message text or caption (for example '@brandpage' in a post body or comment). A 'mention' here uses the same convention as Meta (Facebook, Instagram) and LinkedIn, where it denotes a textual reference to an account. Distinct from tagIds, which represent explicit associations with the message. Null or absent when no accounts are referenced in the text.
   **/
  public OpenSocialMediaPublicMetadata mentionIds(List<String> mentionIds) {
    this.mentionIds = mentionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of accounts referenced by name within the message text or caption (for example '@brandpage' in a post body or comment). A 'mention' here uses the same convention as Meta (Facebook, Instagram) and LinkedIn, where it denotes a textual reference to an account. Distinct from tagIds, which represent explicit associations with the message. Null or absent when no accounts are referenced in the text.")
  @JsonProperty("mentionIds")
  public List<String> getMentionIds() {
    return mentionIds;
  }
  public void setMentionIds(List<String> mentionIds) {
    this.mentionIds = mentionIds;
  }


  /**
   * IDs of accounts attached to the message itself, independent of the text (for example a person tagged in an Instagram photo so their profile is linked from the image). A 'tag' here uses the same convention as Meta (Facebook, Instagram) and LinkedIn, where it denotes an explicit association with content rather than a textual reference. Distinct from mentionIds, which represent in-text/caption references. Null or absent when no accounts are tagged on the message.
   **/
  public OpenSocialMediaPublicMetadata tagIds(List<String> tagIds) {
    this.tagIds = tagIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of accounts attached to the message itself, independent of the text (for example a person tagged in an Instagram photo so their profile is linked from the image). A 'tag' here uses the same convention as Meta (Facebook, Instagram) and LinkedIn, where it denotes an explicit association with content rather than a textual reference. Distinct from mentionIds, which represent in-text/caption references. Null or absent when no accounts are tagged on the message.")
  @JsonProperty("tagIds")
  public List<String> getTagIds() {
    return tagIds;
  }
  public void setTagIds(List<String> tagIds) {
    this.tagIds = tagIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenSocialMediaPublicMetadata openSocialMediaPublicMetadata = (OpenSocialMediaPublicMetadata) o;

    return Objects.equals(this.rootId, openSocialMediaPublicMetadata.rootId) &&
            Objects.equals(this.replyToId, openSocialMediaPublicMetadata.replyToId) &&
            Objects.equals(this.source, openSocialMediaPublicMetadata.source) &&
            Objects.equals(this.url, openSocialMediaPublicMetadata.url) &&
            Objects.equals(this.mentionIds, openSocialMediaPublicMetadata.mentionIds) &&
            Objects.equals(this.tagIds, openSocialMediaPublicMetadata.tagIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootId, replyToId, source, url, mentionIds, tagIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenSocialMediaPublicMetadata {\n");
    
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    replyToId: ").append(toIndentedString(replyToId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mentionIds: ").append(toIndentedString(mentionIds)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

