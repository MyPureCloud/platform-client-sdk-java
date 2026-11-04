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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CapacityPlanForecastDistribution
 */

public class CapacityPlanForecastDistribution  implements Serializable {
  

  private static class DayOfWeekEnumDeserializer extends StdDeserializer<DayOfWeekEnum> {
    public DayOfWeekEnumDeserializer() {
      super(DayOfWeekEnumDeserializer.class);
    }

    @Override
    public DayOfWeekEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DayOfWeekEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The day of the week to which this distribution applies
   */
 @JsonDeserialize(using = DayOfWeekEnumDeserializer.class)
  public enum DayOfWeekEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    DayOfWeekEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DayOfWeekEnum fromString(String key) {
      if (key == null) return null;

      for (DayOfWeekEnum value : DayOfWeekEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DayOfWeekEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DayOfWeekEnum dayOfWeek = null;
  private List<Double> distributionPerInterval = null;

  public CapacityPlanForecastDistribution() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      distributionPerInterval = new ArrayList<Double>();
    }
  }

  public CapacityPlanForecastDistribution(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      distributionPerInterval = new ArrayList<Double>();
    }
  }

  
  /**
   * The day of the week to which this distribution applies
   **/
  public CapacityPlanForecastDistribution dayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The day of the week to which this distribution applies")
  @JsonProperty("dayOfWeek")
  public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }
  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  /**
   * Hourly distribution values for the day, ordered from hour 0 to hour 23
   **/
  public CapacityPlanForecastDistribution distributionPerInterval(List<Double> distributionPerInterval) {
    this.distributionPerInterval = distributionPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Hourly distribution values for the day, ordered from hour 0 to hour 23")
  @JsonProperty("distributionPerInterval")
  public List<Double> getDistributionPerInterval() {
    return distributionPerInterval;
  }
  public void setDistributionPerInterval(List<Double> distributionPerInterval) {
    this.distributionPerInterval = distributionPerInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanForecastDistribution capacityPlanForecastDistribution = (CapacityPlanForecastDistribution) o;

    return Objects.equals(this.dayOfWeek, capacityPlanForecastDistribution.dayOfWeek) &&
            Objects.equals(this.distributionPerInterval, capacityPlanForecastDistribution.distributionPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, distributionPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanForecastDistribution {\n");
    
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    distributionPerInterval: ").append(toIndentedString(distributionPerInterval)).append("\n");
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

