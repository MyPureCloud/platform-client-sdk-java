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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.BackgroundImageSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The settings for Agent Video
 */
@ApiModel(description = "The settings for Agent Video")

public class AgentVideoSettings  implements Serializable {
  
  private Boolean allowCamera = null;
  private Boolean allowScreenShare = null;

  private static class BackgroundEnumDeserializer extends StdDeserializer<BackgroundEnum> {
    public BackgroundEnumDeserializer() {
      super(BackgroundEnumDeserializer.class);
    }

    @Override
    public BackgroundEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BackgroundEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * background for agent
   */
 @JsonDeserialize(using = BackgroundEnumDeserializer.class)
  public enum BackgroundEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BLUR("BLUR"),
    NONE("NONE"),
    IMAGE("IMAGE");

    private String value;

    BackgroundEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BackgroundEnum fromString(String key) {
      if (key == null) return null;

      for (BackgroundEnum value : BackgroundEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BackgroundEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BackgroundEnum background = null;
  private BackgroundImageSettings backgroundImage = null;

  public AgentVideoSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * whether or not agent camera is allowed
   **/
  public AgentVideoSettings allowCamera(Boolean allowCamera) {
    this.allowCamera = allowCamera;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "whether or not agent camera is allowed")
  @JsonProperty("allowCamera")
  public Boolean getAllowCamera() {
    return allowCamera;
  }
  public void setAllowCamera(Boolean allowCamera) {
    this.allowCamera = allowCamera;
  }


  /**
   * whether or not agent screen share is allowed
   **/
  public AgentVideoSettings allowScreenShare(Boolean allowScreenShare) {
    this.allowScreenShare = allowScreenShare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "whether or not agent screen share is allowed")
  @JsonProperty("allowScreenShare")
  public Boolean getAllowScreenShare() {
    return allowScreenShare;
  }
  public void setAllowScreenShare(Boolean allowScreenShare) {
    this.allowScreenShare = allowScreenShare;
  }


  /**
   * background for agent
   **/
  public AgentVideoSettings background(BackgroundEnum background) {
    this.background = background;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "background for agent")
  @JsonProperty("background")
  public BackgroundEnum getBackground() {
    return background;
  }
  public void setBackground(BackgroundEnum background) {
    this.background = background;
  }


  /**
   * background image settings for agent
   **/
  public AgentVideoSettings backgroundImage(BackgroundImageSettings backgroundImage) {
    this.backgroundImage = backgroundImage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "background image settings for agent")
  @JsonProperty("backgroundImage")
  public BackgroundImageSettings getBackgroundImage() {
    return backgroundImage;
  }
  public void setBackgroundImage(BackgroundImageSettings backgroundImage) {
    this.backgroundImage = backgroundImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentVideoSettings agentVideoSettings = (AgentVideoSettings) o;

    return Objects.equals(this.allowCamera, agentVideoSettings.allowCamera) &&
            Objects.equals(this.allowScreenShare, agentVideoSettings.allowScreenShare) &&
            Objects.equals(this.background, agentVideoSettings.background) &&
            Objects.equals(this.backgroundImage, agentVideoSettings.backgroundImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCamera, allowScreenShare, background, backgroundImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentVideoSettings {\n");
    
    sb.append("    allowCamera: ").append(toIndentedString(allowCamera)).append("\n");
    sb.append("    allowScreenShare: ").append(toIndentedString(allowScreenShare)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
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

