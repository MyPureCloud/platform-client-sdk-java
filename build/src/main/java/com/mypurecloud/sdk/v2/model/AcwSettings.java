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
 * AcwSettings
 */

public class AcwSettings  implements Serializable {
  

  private static class WrapupPromptEnumDeserializer extends StdDeserializer<WrapupPromptEnum> {
    public WrapupPromptEnumDeserializer() {
      super(WrapupPromptEnumDeserializer.class);
    }

    @Override
    public WrapupPromptEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WrapupPromptEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * This field controls how the UI prompts the agent for a wrapup.
   */
 @JsonDeserialize(using = WrapupPromptEnumDeserializer.class)
  public enum WrapupPromptEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MANDATORY("MANDATORY"),
    OPTIONAL("OPTIONAL"),
    MANDATORY_TIMEOUT("MANDATORY_TIMEOUT"),
    MANDATORY_FORCED_TIMEOUT("MANDATORY_FORCED_TIMEOUT"),
    AGENT_REQUESTED("AGENT_REQUESTED");

    private String value;

    WrapupPromptEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WrapupPromptEnum fromString(String key) {
      if (key == null) return null;

      for (WrapupPromptEnum value : WrapupPromptEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WrapupPromptEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WrapupPromptEnum wrapupPrompt = null;
  private Integer timeoutMs = null;

  
  /**
   * This field controls how the UI prompts the agent for a wrapup.
   **/
  public AcwSettings wrapupPrompt(WrapupPromptEnum wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field controls how the UI prompts the agent for a wrapup.")
  @JsonProperty("wrapupPrompt")
  public WrapupPromptEnum getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(WrapupPromptEnum wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  
  /**
   * The amount of time the agent can stay in ACW (Min: 1 sec, Max: 1 day).  Can only be used when ACW is MANDATORY_TIMEOUT or MANDATORY_FORCED_TIMEOUT.
   **/
  public AcwSettings timeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time the agent can stay in ACW (Min: 1 sec, Max: 1 day).  Can only be used when ACW is MANDATORY_TIMEOUT or MANDATORY_FORCED_TIMEOUT.")
  @JsonProperty("timeoutMs")
  public Integer getTimeoutMs() {
    return timeoutMs;
  }
  public void setTimeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcwSettings acwSettings = (AcwSettings) o;
    return Objects.equals(this.wrapupPrompt, acwSettings.wrapupPrompt) &&
        Objects.equals(this.timeoutMs, acwSettings.timeoutMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wrapupPrompt, timeoutMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcwSettings {\n");
    
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    timeoutMs: ").append(toIndentedString(timeoutMs)).append("\n");
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

