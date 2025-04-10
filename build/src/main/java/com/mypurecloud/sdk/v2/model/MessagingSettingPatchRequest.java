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
import com.mypurecloud.sdk.v2.model.ContentSetting;
import com.mypurecloud.sdk.v2.model.EventSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Messaging setting for messaging platform integrations
 */
@ApiModel(description = "Messaging setting for messaging platform integrations")

public class MessagingSettingPatchRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private ContentSetting content = null;
  private EventSetting event = null;
  private String selfUri = null;

  public MessagingSettingPatchRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The messaging Setting profile name
   **/
  public MessagingSettingPatchRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messaging Setting profile name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Settings relating to message contents
   **/
  public MessagingSettingPatchRequest content(ContentSetting content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings relating to message contents")
  @JsonProperty("content")
  public ContentSetting getContent() {
    return content;
  }
  public void setContent(ContentSetting content) {
    this.content = content;
  }


  /**
   * Settings relating to events which may occur
   **/
  public MessagingSettingPatchRequest event(EventSetting event) {
    this.event = event;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings relating to events which may occur")
  @JsonProperty("event")
  public EventSetting getEvent() {
    return event;
  }
  public void setEvent(EventSetting event) {
    this.event = event;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingSettingPatchRequest messagingSettingPatchRequest = (MessagingSettingPatchRequest) o;

    return Objects.equals(this.id, messagingSettingPatchRequest.id) &&
            Objects.equals(this.name, messagingSettingPatchRequest.name) &&
            Objects.equals(this.content, messagingSettingPatchRequest.content) &&
            Objects.equals(this.event, messagingSettingPatchRequest.event) &&
            Objects.equals(this.selfUri, messagingSettingPatchRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, content, event, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingSettingPatchRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

