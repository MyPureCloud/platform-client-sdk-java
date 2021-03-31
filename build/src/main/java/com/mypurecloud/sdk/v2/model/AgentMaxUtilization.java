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
import com.mypurecloud.sdk.v2.model.MediaUtilization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AgentMaxUtilization
 */

public class AgentMaxUtilization  implements Serializable {
  
  private Map<String, MediaUtilization> utilization = null;

  private static class LevelEnumDeserializer extends StdDeserializer<LevelEnum> {
    public LevelEnumDeserializer() {
      super(LevelEnumDeserializer.class);
    }

    @Override
    public LevelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LevelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets level
   */
 @JsonDeserialize(using = LevelEnumDeserializer.class)
  public enum LevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENT("Agent"),
    ORGANIZATION("Organization");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LevelEnum fromString(String key) {
      if (key == null) return null;

      for (LevelEnum value : LevelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LevelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LevelEnum level = null;

  
  /**
   * Map of media type to utilization settings.  Valid media types include call, callback, chat, email, and message.
   **/
  public AgentMaxUtilization utilization(Map<String, MediaUtilization> utilization) {
    this.utilization = utilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of media type to utilization settings.  Valid media types include call, callback, chat, email, and message.")
  @JsonProperty("utilization")
  public Map<String, MediaUtilization> getUtilization() {
    return utilization;
  }
  public void setUtilization(Map<String, MediaUtilization> utilization) {
    this.utilization = utilization;
  }

  
  /**
   **/
  public AgentMaxUtilization level(LevelEnum level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentMaxUtilization agentMaxUtilization = (AgentMaxUtilization) o;
    return Objects.equals(this.utilization, agentMaxUtilization.utilization) &&
        Objects.equals(this.level, agentMaxUtilization.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utilization, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentMaxUtilization {\n");
    
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

