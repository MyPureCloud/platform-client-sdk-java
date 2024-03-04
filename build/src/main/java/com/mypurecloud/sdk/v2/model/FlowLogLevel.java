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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.FlowCharacteristics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * This is a table of settings per a loglevel that define what will be logged in executionData when enabled (true)
 */
@ApiModel(description = "This is a table of settings per a loglevel that define what will be logged in executionData when enabled (true)")

public class FlowLogLevel  implements Serializable {
  

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
   * The logLevel for this characteristics set
   */
 @JsonDeserialize(using = LevelEnumDeserializer.class)
  public enum LevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    DISABLED("Disabled"),
    BASE("Base"),
    NOTES("Notes"),
    VERBOSENOTES("VerboseNotes"),
    ALL("All");

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
  private FlowCharacteristics characteristics = null;

  
  /**
   * The logLevel for this characteristics set
   **/
  public FlowLogLevel level(LevelEnum level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The logLevel for this characteristics set")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  /**
   * Shows what characteristics are enabled for this log level
   **/
  public FlowLogLevel characteristics(FlowCharacteristics characteristics) {
    this.characteristics = characteristics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Shows what characteristics are enabled for this log level")
  @JsonProperty("characteristics")
  public FlowCharacteristics getCharacteristics() {
    return characteristics;
  }
  public void setCharacteristics(FlowCharacteristics characteristics) {
    this.characteristics = characteristics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowLogLevel flowLogLevel = (FlowLogLevel) o;

    return Objects.equals(this.level, flowLogLevel.level) &&
            Objects.equals(this.characteristics, flowLogLevel.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowLogLevel {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
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

