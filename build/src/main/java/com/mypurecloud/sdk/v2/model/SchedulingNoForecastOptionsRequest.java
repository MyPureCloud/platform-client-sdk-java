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
 * SchedulingNoForecastOptionsRequest
 */

public class SchedulingNoForecastOptionsRequest  implements Serializable {
  

  private static class ShiftLengthEnumDeserializer extends StdDeserializer<ShiftLengthEnum> {
    public ShiftLengthEnumDeserializer() {
      super(ShiftLengthEnumDeserializer.class);
    }

    @Override
    public ShiftLengthEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ShiftLengthEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The shift length option to apply if no forecast is supplied
   */
 @JsonDeserialize(using = ShiftLengthEnumDeserializer.class)
  public enum ShiftLengthEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SHORTEST("Shortest"),
    MEDIAN("Median"),
    LONGEST("Longest"),
    RANDOM("Random");

    private String value;

    ShiftLengthEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ShiftLengthEnum fromString(String key) {
      if (key == null) return null;

      for (ShiftLengthEnum value : ShiftLengthEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ShiftLengthEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ShiftLengthEnum shiftLength = null;

  private static class ShiftStartEnumDeserializer extends StdDeserializer<ShiftStartEnum> {
    public ShiftStartEnumDeserializer() {
      super(ShiftStartEnumDeserializer.class);
    }

    @Override
    public ShiftStartEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ShiftStartEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The shift start option to apply if no forecast is supplied
   */
 @JsonDeserialize(using = ShiftStartEnumDeserializer.class)
  public enum ShiftStartEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EARLIEST("Earliest"),
    MEDIAN("Median"),
    LATEST("Latest"),
    RANDOM("Random");

    private String value;

    ShiftStartEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ShiftStartEnum fromString(String key) {
      if (key == null) return null;

      for (ShiftStartEnum value : ShiftStartEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ShiftStartEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ShiftStartEnum shiftStart = null;

  
  /**
   * The shift length option to apply if no forecast is supplied
   **/
  public SchedulingNoForecastOptionsRequest shiftLength(ShiftLengthEnum shiftLength) {
    this.shiftLength = shiftLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The shift length option to apply if no forecast is supplied")
  @JsonProperty("shiftLength")
  public ShiftLengthEnum getShiftLength() {
    return shiftLength;
  }
  public void setShiftLength(ShiftLengthEnum shiftLength) {
    this.shiftLength = shiftLength;
  }

  
  /**
   * The shift start option to apply if no forecast is supplied
   **/
  public SchedulingNoForecastOptionsRequest shiftStart(ShiftStartEnum shiftStart) {
    this.shiftStart = shiftStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The shift start option to apply if no forecast is supplied")
  @JsonProperty("shiftStart")
  public ShiftStartEnum getShiftStart() {
    return shiftStart;
  }
  public void setShiftStart(ShiftStartEnum shiftStart) {
    this.shiftStart = shiftStart;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulingNoForecastOptionsRequest schedulingNoForecastOptionsRequest = (SchedulingNoForecastOptionsRequest) o;
    return Objects.equals(this.shiftLength, schedulingNoForecastOptionsRequest.shiftLength) &&
        Objects.equals(this.shiftStart, schedulingNoForecastOptionsRequest.shiftStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shiftLength, shiftStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingNoForecastOptionsRequest {\n");
    
    sb.append("    shiftLength: ").append(toIndentedString(shiftLength)).append("\n");
    sb.append("    shiftStart: ").append(toIndentedString(shiftStart)).append("\n");
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

