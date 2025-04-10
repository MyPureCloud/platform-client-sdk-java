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
import com.mypurecloud.sdk.v2.model.AgentVideoSettings;
import com.mypurecloud.sdk.v2.model.UserVideoSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The settings to enable video chat
 */
@ApiModel(description = "The settings to enable video chat")

public class VideoSettings  implements Serializable {
  
  private Boolean enabled = null;
  private AgentVideoSettings agent = null;
  private UserVideoSettings user = null;

  public VideoSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * whether or not video is enabled
   **/
  public VideoSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "whether or not video is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Video Settings for agent
   **/
  public VideoSettings agent(AgentVideoSettings agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Video Settings for agent")
  @JsonProperty("agent")
  public AgentVideoSettings getAgent() {
    return agent;
  }
  public void setAgent(AgentVideoSettings agent) {
    this.agent = agent;
  }


  /**
   * Video Settings for user
   **/
  public VideoSettings user(UserVideoSettings user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Video Settings for user")
  @JsonProperty("user")
  public UserVideoSettings getUser() {
    return user;
  }
  public void setUser(UserVideoSettings user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoSettings videoSettings = (VideoSettings) o;

    return Objects.equals(this.enabled, videoSettings.enabled) &&
            Objects.equals(this.agent, videoSettings.agent) &&
            Objects.equals(this.user, videoSettings.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, agent, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

