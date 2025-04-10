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
 * JourneyViewLinkTimeConstraint
 */

public class JourneyViewLinkTimeConstraint  implements Serializable {
  

  private static class UnitEnumDeserializer extends StdDeserializer<UnitEnum> {
    public UnitEnumDeserializer() {
      super(UnitEnumDeserializer.class);
    }

    @Override
    public UnitEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnitEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The unit for the link's time constraint
   */
 @JsonDeserialize(using = UnitEnumDeserializer.class)
  public enum UnitEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnitEnum fromString(String key) {
      if (key == null) return null;

      for (UnitEnum value : UnitEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnitEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UnitEnum unit = null;
  private Integer value = null;

  public JourneyViewLinkTimeConstraint() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The unit for the link's time constraint
   **/
  public JourneyViewLinkTimeConstraint unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unit for the link's time constraint")
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  /**
   * The value for the link's time constraint
   **/
  public JourneyViewLinkTimeConstraint value(Integer value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for the link's time constraint")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewLinkTimeConstraint journeyViewLinkTimeConstraint = (JourneyViewLinkTimeConstraint) o;

    return Objects.equals(this.unit, journeyViewLinkTimeConstraint.unit) &&
            Objects.equals(this.value, journeyViewLinkTimeConstraint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewLinkTimeConstraint {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

