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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DailyPossibleShift
 */

public class DailyPossibleShift  implements Serializable {
  

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
   * Day of the shift
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
  private Integer earliestShiftStartMinutesFromMidnight = null;
  private Boolean required = null;
  private Integer minimumPaidTimeMinutes = null;
  private Integer maximumPaidTimeMinutes = null;
  private List<Integer> intervalScheduleProbabilities = new ArrayList<Integer>();

  
  /**
   * Day of the shift
   **/
  public DailyPossibleShift dayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Day of the shift")
  @JsonProperty("dayOfWeek")
  public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }
  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  /**
   * Minutes of the earliest shift start from midnight. Note that midnight is 12:00 am in the time zone specified in the timeZone field (in the top level of the response)
   **/
  public DailyPossibleShift earliestShiftStartMinutesFromMidnight(Integer earliestShiftStartMinutesFromMidnight) {
    this.earliestShiftStartMinutesFromMidnight = earliestShiftStartMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minutes of the earliest shift start from midnight. Note that midnight is 12:00 am in the time zone specified in the timeZone field (in the top level of the response)")
  @JsonProperty("earliestShiftStartMinutesFromMidnight")
  public Integer getEarliestShiftStartMinutesFromMidnight() {
    return earliestShiftStartMinutesFromMidnight;
  }
  public void setEarliestShiftStartMinutesFromMidnight(Integer earliestShiftStartMinutesFromMidnight) {
    this.earliestShiftStartMinutesFromMidnight = earliestShiftStartMinutesFromMidnight;
  }


  /**
   * Whether this is a required shift
   **/
  public DailyPossibleShift required(Boolean required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this is a required shift")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }


  /**
   * Minimum paid time in minutes of this daily shift
   **/
  public DailyPossibleShift minimumPaidTimeMinutes(Integer minimumPaidTimeMinutes) {
    this.minimumPaidTimeMinutes = minimumPaidTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum paid time in minutes of this daily shift")
  @JsonProperty("minimumPaidTimeMinutes")
  public Integer getMinimumPaidTimeMinutes() {
    return minimumPaidTimeMinutes;
  }
  public void setMinimumPaidTimeMinutes(Integer minimumPaidTimeMinutes) {
    this.minimumPaidTimeMinutes = minimumPaidTimeMinutes;
  }


  /**
   * Maximum paid time in minutes of this daily shift
   **/
  public DailyPossibleShift maximumPaidTimeMinutes(Integer maximumPaidTimeMinutes) {
    this.maximumPaidTimeMinutes = maximumPaidTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum paid time in minutes of this daily shift")
  @JsonProperty("maximumPaidTimeMinutes")
  public Integer getMaximumPaidTimeMinutes() {
    return maximumPaidTimeMinutes;
  }
  public void setMaximumPaidTimeMinutes(Integer maximumPaidTimeMinutes) {
    this.maximumPaidTimeMinutes = maximumPaidTimeMinutes;
  }


  /**
   * The percentage of being scheduled in each interval between the earliest shift start and latest shift end. Range of the values: [0, 100].
   **/
  public DailyPossibleShift intervalScheduleProbabilities(List<Integer> intervalScheduleProbabilities) {
    this.intervalScheduleProbabilities = intervalScheduleProbabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The percentage of being scheduled in each interval between the earliest shift start and latest shift end. Range of the values: [0, 100].")
  @JsonProperty("intervalScheduleProbabilities")
  public List<Integer> getIntervalScheduleProbabilities() {
    return intervalScheduleProbabilities;
  }
  public void setIntervalScheduleProbabilities(List<Integer> intervalScheduleProbabilities) {
    this.intervalScheduleProbabilities = intervalScheduleProbabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyPossibleShift dailyPossibleShift = (DailyPossibleShift) o;

    return Objects.equals(this.dayOfWeek, dailyPossibleShift.dayOfWeek) &&
            Objects.equals(this.earliestShiftStartMinutesFromMidnight, dailyPossibleShift.earliestShiftStartMinutesFromMidnight) &&
            Objects.equals(this.required, dailyPossibleShift.required) &&
            Objects.equals(this.minimumPaidTimeMinutes, dailyPossibleShift.minimumPaidTimeMinutes) &&
            Objects.equals(this.maximumPaidTimeMinutes, dailyPossibleShift.maximumPaidTimeMinutes) &&
            Objects.equals(this.intervalScheduleProbabilities, dailyPossibleShift.intervalScheduleProbabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, earliestShiftStartMinutesFromMidnight, required, minimumPaidTimeMinutes, maximumPaidTimeMinutes, intervalScheduleProbabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyPossibleShift {\n");
    
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    earliestShiftStartMinutesFromMidnight: ").append(toIndentedString(earliestShiftStartMinutesFromMidnight)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    minimumPaidTimeMinutes: ").append(toIndentedString(minimumPaidTimeMinutes)).append("\n");
    sb.append("    maximumPaidTimeMinutes: ").append(toIndentedString(maximumPaidTimeMinutes)).append("\n");
    sb.append("    intervalScheduleProbabilities: ").append(toIndentedString(intervalScheduleProbabilities)).append("\n");
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

