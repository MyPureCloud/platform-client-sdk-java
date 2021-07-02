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
import com.mypurecloud.sdk.v2.model.ConversationThreadingWindowSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationThreadingWindow
 */

public class ConversationThreadingWindow  implements Serializable {
  
  private String id = null;
  private List<ConversationThreadingWindowSetting> settings = new ArrayList<ConversationThreadingWindowSetting>();
  private Long defaultTimeoutMinutes = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The conversation threading window timeout (Minutes) for each messaging type
   **/
  public ConversationThreadingWindow settings(List<ConversationThreadingWindowSetting> settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The conversation threading window timeout (Minutes) for each messaging type")
  @JsonProperty("settings")
  public List<ConversationThreadingWindowSetting> getSettings() {
    return settings;
  }
  public void setSettings(List<ConversationThreadingWindowSetting> settings) {
    this.settings = settings;
  }

  
  @ApiModelProperty(example = "null", value = "The default conversation threading window timeout (Minutes)")
  @JsonProperty("defaultTimeoutMinutes")
  public Long getDefaultTimeoutMinutes() {
    return defaultTimeoutMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationThreadingWindow conversationThreadingWindow = (ConversationThreadingWindow) o;
    return Objects.equals(this.id, conversationThreadingWindow.id) &&
        Objects.equals(this.settings, conversationThreadingWindow.settings) &&
        Objects.equals(this.defaultTimeoutMinutes, conversationThreadingWindow.defaultTimeoutMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, settings, defaultTimeoutMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationThreadingWindow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    defaultTimeoutMinutes: ").append(toIndentedString(defaultTimeoutMinutes)).append("\n");
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

