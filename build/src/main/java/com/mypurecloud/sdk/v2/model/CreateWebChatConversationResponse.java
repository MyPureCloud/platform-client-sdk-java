package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateWebChatConversationResponse
 */

public class CreateWebChatConversationResponse  implements Serializable {
  
  private String id = null;
  private String jwt = null;
  private String eventStreamUri = null;
  private WebChatMemberInfo member = null;

  
  /**
   * Chat Conversation identifier
   **/
  public CreateWebChatConversationResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Chat Conversation identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The JWT that you can use to identify subsequent calls on this conversation
   **/
  public CreateWebChatConversationResponse jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The JWT that you can use to identify subsequent calls on this conversation")
  @JsonProperty("jwt")
  public String getJwt() {
    return jwt;
  }
  public void setJwt(String jwt) {
    this.jwt = jwt;
  }

  
  /**
   * The URI which provides the conversation event stream.
   **/
  public CreateWebChatConversationResponse eventStreamUri(String eventStreamUri) {
    this.eventStreamUri = eventStreamUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI which provides the conversation event stream.")
  @JsonProperty("eventStreamUri")
  public String getEventStreamUri() {
    return eventStreamUri;
  }
  public void setEventStreamUri(String eventStreamUri) {
    this.eventStreamUri = eventStreamUri;
  }

  
  /**
   * Chat Member
   **/
  public CreateWebChatConversationResponse member(WebChatMemberInfo member) {
    this.member = member;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Chat Member")
  @JsonProperty("member")
  public WebChatMemberInfo getMember() {
    return member;
  }
  public void setMember(WebChatMemberInfo member) {
    this.member = member;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebChatConversationResponse createWebChatConversationResponse = (CreateWebChatConversationResponse) o;
    return Objects.equals(this.id, createWebChatConversationResponse.id) &&
        Objects.equals(this.jwt, createWebChatConversationResponse.jwt) &&
        Objects.equals(this.eventStreamUri, createWebChatConversationResponse.eventStreamUri) &&
        Objects.equals(this.member, createWebChatConversationResponse.member);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jwt, eventStreamUri, member);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebChatConversationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    eventStreamUri: ").append(toIndentedString(eventStreamUri)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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

