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
 * Warning
 */

public class Warning  implements Serializable {
  
  private Integer value = null;

  private static class RangeTypeEnumDeserializer extends StdDeserializer<RangeTypeEnum> {
    public RangeTypeEnumDeserializer() {
      super(RangeTypeEnumDeserializer.class);
    }

    @Override
    public RangeTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RangeTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The range type for the warning configuration.
   */
 @JsonDeserialize(using = RangeTypeEnumDeserializer.class)
  public enum RangeTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OVER("OVER"),
    UNDER("UNDER"),
    BETWEEN("BETWEEN");

    private String value;

    RangeTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RangeTypeEnum fromString(String key) {
      if (key == null) return null;

      for (RangeTypeEnum value : RangeTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RangeTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RangeTypeEnum rangeType = null;
  private String color = null;

  public Warning() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The value for the warning configuration.
   **/
  public Warning value(Integer value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for the warning configuration.")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }


  /**
   * The range type for the warning configuration.
   **/
  public Warning rangeType(RangeTypeEnum rangeType) {
    this.rangeType = rangeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The range type for the warning configuration.")
  @JsonProperty("rangeType")
  public RangeTypeEnum getRangeType() {
    return rangeType;
  }
  public void setRangeType(RangeTypeEnum rangeType) {
    this.rangeType = rangeType;
  }


  /**
   * The color for the warning configuration in RGB hexadecimal format (for example \"#FF0000\" represents red).
   **/
  public Warning color(String color) {
    this.color = color;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The color for the warning configuration in RGB hexadecimal format (for example \"#FF0000\" represents red).")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warning warning = (Warning) o;

    return Objects.equals(this.value, warning.value) &&
            Objects.equals(this.rangeType, warning.rangeType) &&
            Objects.equals(this.color, warning.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, rangeType, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    rangeType: ").append(toIndentedString(rangeType)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

