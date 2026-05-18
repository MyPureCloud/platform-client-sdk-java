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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * DayOfWeekMinimums
 */

public class DayOfWeekMinimums  implements Serializable {
  
  private Double minimumValue = null;

  private static class DaysOfWeekEnumDeserializer extends StdDeserializer<DaysOfWeekEnum> {
    public DaysOfWeekEnumDeserializer() {
      super(DaysOfWeekEnumDeserializer.class);
    }

    @Override
    public DaysOfWeekEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DaysOfWeekEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets daysOfWeek
   */
 @JsonDeserialize(using = DaysOfWeekEnumDeserializer.class)
  public enum DaysOfWeekEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    DaysOfWeekEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DaysOfWeekEnum fromString(String key) {
      if (key == null) return null;

      for (DaysOfWeekEnum value : DaysOfWeekEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DaysOfWeekEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DaysOfWeekEnum> daysOfWeek = null;

  public DayOfWeekMinimums() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      daysOfWeek = new ArrayList<DaysOfWeekEnum>();
    }
  }

  public DayOfWeekMinimums(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      daysOfWeek = new ArrayList<DaysOfWeekEnum>();
    }
  }

  
  /**
   * The minimum staff value to be applied to this planning group
   **/
  public DayOfWeekMinimums minimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum staff value to be applied to this planning group")
  @JsonProperty("minimumValue")
  public Double getMinimumValue() {
    return minimumValue;
  }
  public void setMinimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
  }


  /**
   * Days of week this minimum staff value applies to
   **/
  public DayOfWeekMinimums daysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Days of week this minimum staff value applies to")
  @JsonProperty("daysOfWeek")
  public List<DaysOfWeekEnum> getDaysOfWeek() {
    return daysOfWeek;
  }
  public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayOfWeekMinimums dayOfWeekMinimums = (DayOfWeekMinimums) o;

    return Objects.equals(this.minimumValue, dayOfWeekMinimums.minimumValue) &&
            Objects.equals(this.daysOfWeek, dayOfWeekMinimums.daysOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumValue, daysOfWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayOfWeekMinimums {\n");
    
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
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

