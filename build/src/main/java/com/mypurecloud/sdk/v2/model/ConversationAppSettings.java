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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Conversation settings that handles chats within the messenger
 */
@ApiModel(description = "Conversation settings that handles chats within the messenger")

public class ConversationAppSettings  implements Serializable {
  
  private Boolean showAgentTypingIndicator = null;
  private Boolean showUserTypingIndicator = null;

  private static class AutoStartTypeEnumDeserializer extends StdDeserializer<AutoStartTypeEnum> {
    public AutoStartTypeEnumDeserializer() {
      super(AutoStartTypeEnumDeserializer.class);
    }

    @Override
    public AutoStartTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AutoStartTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The auto start type for the messenger conversation
   */
 @JsonDeserialize(using = AutoStartTypeEnumDeserializer.class)
  public enum AutoStartTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STANDARD("Standard"),
    AUTOMATIC("Automatic");

    private String value;

    AutoStartTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AutoStartTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AutoStartTypeEnum value : AutoStartTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AutoStartTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AutoStartTypeEnum autoStartType = null;

  
  /**
   * The toggle to enable or disable typing indicator for messenger
   **/
  public ConversationAppSettings showAgentTypingIndicator(Boolean showAgentTypingIndicator) {
    this.showAgentTypingIndicator = showAgentTypingIndicator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The toggle to enable or disable typing indicator for messenger")
  @JsonProperty("showAgentTypingIndicator")
  public Boolean getShowAgentTypingIndicator() {
    return showAgentTypingIndicator;
  }
  public void setShowAgentTypingIndicator(Boolean showAgentTypingIndicator) {
    this.showAgentTypingIndicator = showAgentTypingIndicator;
  }

  
  /**
   * The toggle to enable or disable typing indicator for messenger
   **/
  public ConversationAppSettings showUserTypingIndicator(Boolean showUserTypingIndicator) {
    this.showUserTypingIndicator = showUserTypingIndicator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The toggle to enable or disable typing indicator for messenger")
  @JsonProperty("showUserTypingIndicator")
  public Boolean getShowUserTypingIndicator() {
    return showUserTypingIndicator;
  }
  public void setShowUserTypingIndicator(Boolean showUserTypingIndicator) {
    this.showUserTypingIndicator = showUserTypingIndicator;
  }

  
  /**
   * The auto start type for the messenger conversation
   **/
  public ConversationAppSettings autoStartType(AutoStartTypeEnum autoStartType) {
    this.autoStartType = autoStartType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The auto start type for the messenger conversation")
  @JsonProperty("autoStartType")
  public AutoStartTypeEnum getAutoStartType() {
    return autoStartType;
  }
  public void setAutoStartType(AutoStartTypeEnum autoStartType) {
    this.autoStartType = autoStartType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAppSettings conversationAppSettings = (ConversationAppSettings) o;
    return Objects.equals(this.showAgentTypingIndicator, conversationAppSettings.showAgentTypingIndicator) &&
        Objects.equals(this.showUserTypingIndicator, conversationAppSettings.showUserTypingIndicator) &&
        Objects.equals(this.autoStartType, conversationAppSettings.autoStartType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showAgentTypingIndicator, showUserTypingIndicator, autoStartType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAppSettings {\n");
    
    sb.append("    showAgentTypingIndicator: ").append(toIndentedString(showAgentTypingIndicator)).append("\n");
    sb.append("    showUserTypingIndicator: ").append(toIndentedString(showUserTypingIndicator)).append("\n");
    sb.append("    autoStartType: ").append(toIndentedString(autoStartType)).append("\n");
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

