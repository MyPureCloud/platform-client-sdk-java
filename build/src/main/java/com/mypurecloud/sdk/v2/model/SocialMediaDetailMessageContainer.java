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
import com.mypurecloud.sdk.v2.model.ContentModeration;
import com.mypurecloud.sdk.v2.model.ConversationNormalizedMessage;
import com.mypurecloud.sdk.v2.model.SocialMediaMessageEscalationInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SocialMediaDetailMessageContainer
 */

public class SocialMediaDetailMessageContainer  implements Serializable {
  
  private String id = null;
  private ConversationNormalizedMessage normalizedMessage = null;
  private SocialMediaMessageEscalationInfo escalationInfo = null;
  private ContentModeration contentModeration = null;

  public SocialMediaDetailMessageContainer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public SocialMediaDetailMessageContainer id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public SocialMediaDetailMessageContainer normalizedMessage(ConversationNormalizedMessage normalizedMessage) {
    this.normalizedMessage = normalizedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("normalizedMessage")
  public ConversationNormalizedMessage getNormalizedMessage() {
    return normalizedMessage;
  }
  public void setNormalizedMessage(ConversationNormalizedMessage normalizedMessage) {
    this.normalizedMessage = normalizedMessage;
  }


  /**
   **/
  public SocialMediaDetailMessageContainer escalationInfo(SocialMediaMessageEscalationInfo escalationInfo) {
    this.escalationInfo = escalationInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("escalationInfo")
  public SocialMediaMessageEscalationInfo getEscalationInfo() {
    return escalationInfo;
  }
  public void setEscalationInfo(SocialMediaMessageEscalationInfo escalationInfo) {
    this.escalationInfo = escalationInfo;
  }


  /**
   **/
  public SocialMediaDetailMessageContainer contentModeration(ContentModeration contentModeration) {
    this.contentModeration = contentModeration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentModeration")
  public ContentModeration getContentModeration() {
    return contentModeration;
  }
  public void setContentModeration(ContentModeration contentModeration) {
    this.contentModeration = contentModeration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialMediaDetailMessageContainer socialMediaDetailMessageContainer = (SocialMediaDetailMessageContainer) o;

    return Objects.equals(this.id, socialMediaDetailMessageContainer.id) &&
            Objects.equals(this.normalizedMessage, socialMediaDetailMessageContainer.normalizedMessage) &&
            Objects.equals(this.escalationInfo, socialMediaDetailMessageContainer.escalationInfo) &&
            Objects.equals(this.contentModeration, socialMediaDetailMessageContainer.contentModeration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, normalizedMessage, escalationInfo, contentModeration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialMediaDetailMessageContainer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    normalizedMessage: ").append(toIndentedString(normalizedMessage)).append("\n");
    sb.append("    escalationInfo: ").append(toIndentedString(escalationInfo)).append("\n");
    sb.append("    contentModeration: ").append(toIndentedString(contentModeration)).append("\n");
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

