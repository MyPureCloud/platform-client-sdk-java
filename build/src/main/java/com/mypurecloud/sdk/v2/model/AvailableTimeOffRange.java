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
import com.mypurecloud.sdk.v2.model.TimeOffLimitReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A list of available time off values in minutes and a number of time off requests currently in waitlist for each interval in requested date range, according to granularity.
 */
@ApiModel(description = "A list of available time off values in minutes and a number of time off requests currently in waitlist for each interval in requested date range, according to granularity.")

public class AvailableTimeOffRange  implements Serializable {
  
  private TimeOffLimitReference timeOffLimit = null;
  private LocalDate startDate = null;

  private static class GranularityEnumDeserializer extends StdDeserializer<GranularityEnum> {
    public GranularityEnumDeserializer() {
      super(GranularityEnumDeserializer.class);
    }

    @Override
    public GranularityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GranularityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Granularity choice for time off limit
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GranularityEnum fromString(String key) {
      if (key == null) return null;

      for (GranularityEnum value : GranularityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GranularityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GranularityEnum granularity = null;
  private List<Integer> availableMinutesPerInterval = new ArrayList<Integer>();
  private List<Integer> waitlistedRequestsPerInterval = new ArrayList<Integer>();
  private Boolean waitlistEnabled = null;

  
  /**
   * The time off limit
   **/
  public AvailableTimeOffRange timeOffLimit(TimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time off limit")
  @JsonProperty("timeOffLimit")
  public TimeOffLimitReference getTimeOffLimit() {
    return timeOffLimit;
  }
  public void setTimeOffLimit(TimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
  }

  
  /**
   * Start date of the requested date range. The end date is determined by the size of interval list. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AvailableTimeOffRange startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start date of the requested date range. The end date is determined by the size of interval list. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Granularity choice for time off limit
   **/
  public AvailableTimeOffRange granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity choice for time off limit")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  
  /**
   * The list of available time off values in minutes per granularity interval
   **/
  public AvailableTimeOffRange availableMinutesPerInterval(List<Integer> availableMinutesPerInterval) {
    this.availableMinutesPerInterval = availableMinutesPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of available time off values in minutes per granularity interval")
  @JsonProperty("availableMinutesPerInterval")
  public List<Integer> getAvailableMinutesPerInterval() {
    return availableMinutesPerInterval;
  }
  public void setAvailableMinutesPerInterval(List<Integer> availableMinutesPerInterval) {
    this.availableMinutesPerInterval = availableMinutesPerInterval;
  }

  
  /**
   * The current number of waitlisted time off requests for every interval per granularity
   **/
  public AvailableTimeOffRange waitlistedRequestsPerInterval(List<Integer> waitlistedRequestsPerInterval) {
    this.waitlistedRequestsPerInterval = waitlistedRequestsPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current number of waitlisted time off requests for every interval per granularity")
  @JsonProperty("waitlistedRequestsPerInterval")
  public List<Integer> getWaitlistedRequestsPerInterval() {
    return waitlistedRequestsPerInterval;
  }
  public void setWaitlistedRequestsPerInterval(List<Integer> waitlistedRequestsPerInterval) {
    this.waitlistedRequestsPerInterval = waitlistedRequestsPerInterval;
  }

  
  /**
   * Whether the time off request can be waitlisted
   **/
  public AvailableTimeOffRange waitlistEnabled(Boolean waitlistEnabled) {
    this.waitlistEnabled = waitlistEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the time off request can be waitlisted")
  @JsonProperty("waitlistEnabled")
  public Boolean getWaitlistEnabled() {
    return waitlistEnabled;
  }
  public void setWaitlistEnabled(Boolean waitlistEnabled) {
    this.waitlistEnabled = waitlistEnabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableTimeOffRange availableTimeOffRange = (AvailableTimeOffRange) o;
    return Objects.equals(this.timeOffLimit, availableTimeOffRange.timeOffLimit) &&
        Objects.equals(this.startDate, availableTimeOffRange.startDate) &&
        Objects.equals(this.granularity, availableTimeOffRange.granularity) &&
        Objects.equals(this.availableMinutesPerInterval, availableTimeOffRange.availableMinutesPerInterval) &&
        Objects.equals(this.waitlistedRequestsPerInterval, availableTimeOffRange.waitlistedRequestsPerInterval) &&
        Objects.equals(this.waitlistEnabled, availableTimeOffRange.waitlistEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffLimit, startDate, granularity, availableMinutesPerInterval, waitlistedRequestsPerInterval, waitlistEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTimeOffRange {\n");
    
    sb.append("    timeOffLimit: ").append(toIndentedString(timeOffLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    availableMinutesPerInterval: ").append(toIndentedString(availableMinutesPerInterval)).append("\n");
    sb.append("    waitlistedRequestsPerInterval: ").append(toIndentedString(waitlistedRequestsPerInterval)).append("\n");
    sb.append("    waitlistEnabled: ").append(toIndentedString(waitlistEnabled)).append("\n");
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

