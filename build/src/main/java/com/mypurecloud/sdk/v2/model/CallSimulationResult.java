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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CallSimulationResult
 */

public class CallSimulationResult  implements Serializable {
  
  private Boolean allowed = null;

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
   * The simulation level
   */
 @JsonDeserialize(using = LevelEnumDeserializer.class)
  public enum LevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NGN("NGN"),
    BLOCKPREFIXSUPPORT("BlockPrefixSupport"),
    ALLOWPREFIX("AllowPrefix"),
    BLOCKPREFIX("BlockPrefix"),
    HIGHCOST("HighCost");

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
  private String matchedPrefix = null;

  public CallSimulationResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CallSimulationResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether the call is allowed
   **/
  public CallSimulationResult allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the call is allowed")
  @JsonProperty("allowed")
  public Boolean getAllowed() {
    return allowed;
  }
  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  /**
   * The simulation level
   **/
  public CallSimulationResult level(LevelEnum level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The simulation level")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  /**
   * The matched prefix
   **/
  public CallSimulationResult matchedPrefix(String matchedPrefix) {
    this.matchedPrefix = matchedPrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The matched prefix")
  @JsonProperty("matchedPrefix")
  public String getMatchedPrefix() {
    return matchedPrefix;
  }
  public void setMatchedPrefix(String matchedPrefix) {
    this.matchedPrefix = matchedPrefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallSimulationResult callSimulationResult = (CallSimulationResult) o;

    return Objects.equals(this.allowed, callSimulationResult.allowed) &&
            Objects.equals(this.level, callSimulationResult.level) &&
            Objects.equals(this.matchedPrefix, callSimulationResult.matchedPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, level, matchedPrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallSimulationResult {\n");
    
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    matchedPrefix: ").append(toIndentedString(matchedPrefix)).append("\n");
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

