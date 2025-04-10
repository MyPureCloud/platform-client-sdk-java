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
import com.mypurecloud.sdk.v2.model.AvailabilityRange;
import com.mypurecloud.sdk.v2.model.RequiredLocalDateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FixedAvailability
 */

public class FixedAvailability  implements Serializable {
  
  private AvailabilityRange availabilityRange = null;
  private RequiredLocalDateRange dateRange = null;

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

  public FixedAvailability() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      daysOfWeek = new ArrayList<DaysOfWeekEnum>();
    }
  }

  
  /**
   * The range of time of day the activity can be scheduled
   **/
  public FixedAvailability availabilityRange(AvailabilityRange availabilityRange) {
    this.availabilityRange = availabilityRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The range of time of day the activity can be scheduled")
  @JsonProperty("availabilityRange")
  public AvailabilityRange getAvailabilityRange() {
    return availabilityRange;
  }
  public void setAvailabilityRange(AvailabilityRange availabilityRange) {
    this.availabilityRange = availabilityRange;
  }


  /**
   * The range of date for which the activity plan could be scheduled
   **/
  public FixedAvailability dateRange(RequiredLocalDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The range of date for which the activity plan could be scheduled")
  @JsonProperty("dateRange")
  public RequiredLocalDateRange getDateRange() {
    return dateRange;
  }
  public void setDateRange(RequiredLocalDateRange dateRange) {
    this.dateRange = dateRange;
  }


  /**
   * The days of week available for scheduling. Empty list or null means daysOfWeek is not considered
   **/
  public FixedAvailability daysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The days of week available for scheduling. Empty list or null means daysOfWeek is not considered")
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
    FixedAvailability fixedAvailability = (FixedAvailability) o;

    return Objects.equals(this.availabilityRange, fixedAvailability.availabilityRange) &&
            Objects.equals(this.dateRange, fixedAvailability.dateRange) &&
            Objects.equals(this.daysOfWeek, fixedAvailability.daysOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityRange, dateRange, daysOfWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedAvailability {\n");
    
    sb.append("    availabilityRange: ").append(toIndentedString(availabilityRange)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
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

