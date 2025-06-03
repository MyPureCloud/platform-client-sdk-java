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
 * AdditionalSocialMediaMessage
 */

public class AdditionalSocialMediaMessage  implements Serializable {
  
  private String textBody = null;
  private List<String> mediaIds = null;
  private String inReplyToMessageId = null;

  public AdditionalSocialMediaMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mediaIds = new ArrayList<String>();
    }
  }

  
  /**
   * The body of the text message.  Maximum character count is 2000 characters.
   **/
  public AdditionalSocialMediaMessage textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The body of the text message.  Maximum character count is 2000 characters.")
  @JsonProperty("textBody")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }


  /**
   * The media ids associated with the text message. See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   **/
  public AdditionalSocialMediaMessage mediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media ids associated with the text message. See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.")
  @JsonProperty("mediaIds")
  public List<String> getMediaIds() {
    return mediaIds;
  }
  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }


  /**
   * The ID of the message to which this request is replying.
   **/
  public AdditionalSocialMediaMessage inReplyToMessageId(String inReplyToMessageId) {
    this.inReplyToMessageId = inReplyToMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the message to which this request is replying.")
  @JsonProperty("inReplyToMessageId")
  public String getInReplyToMessageId() {
    return inReplyToMessageId;
  }
  public void setInReplyToMessageId(String inReplyToMessageId) {
    this.inReplyToMessageId = inReplyToMessageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalSocialMediaMessage additionalSocialMediaMessage = (AdditionalSocialMediaMessage) o;

    return Objects.equals(this.textBody, additionalSocialMediaMessage.textBody) &&
            Objects.equals(this.mediaIds, additionalSocialMediaMessage.mediaIds) &&
            Objects.equals(this.inReplyToMessageId, additionalSocialMediaMessage.inReplyToMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textBody, mediaIds, inReplyToMessageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalSocialMediaMessage {\n");
    
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    inReplyToMessageId: ").append(toIndentedString(inReplyToMessageId)).append("\n");
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

