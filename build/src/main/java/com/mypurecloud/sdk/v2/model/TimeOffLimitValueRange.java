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
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * The date range with lists of time off limit, allocated and waitlisted minutes.
 */
@ApiModel(description = "The date range with lists of time off limit, allocated and waitlisted minutes.")

public class TimeOffLimitValueRange  implements Serializable {
  
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
  private List<Integer> limitMinutesPerInterval = new ArrayList<Integer>();
  private List<Integer> allocatedMinutesPerInterval = new ArrayList<Integer>();
  private List<Integer> waitlistedMinutesPerInterval = new ArrayList<Integer>();
  private List<Integer> waitlistedRequestsPerInterval = new ArrayList<Integer>();
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The ID of the time off limit
   **/
  public TimeOffLimitValueRange timeOffLimit(TimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the time off limit")
  @JsonProperty("timeOffLimit")
  public TimeOffLimitReference getTimeOffLimit() {
    return timeOffLimit;
  }
  public void setTimeOffLimit(TimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
  }

  
  /**
   * Start date of the requested date range, in ISO-8601 format. The end date is determined by the size of interval lists
   **/
  public TimeOffLimitValueRange startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date of the requested date range, in ISO-8601 format. The end date is determined by the size of interval lists")
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
  public TimeOffLimitValueRange granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Granularity choice for time off limit")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  
  /**
   * A list of time off limit values in minutes per granularity interval
   **/
  public TimeOffLimitValueRange limitMinutesPerInterval(List<Integer> limitMinutesPerInterval) {
    this.limitMinutesPerInterval = limitMinutesPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of time off limit values in minutes per granularity interval")
  @JsonProperty("limitMinutesPerInterval")
  public List<Integer> getLimitMinutesPerInterval() {
    return limitMinutesPerInterval;
  }
  public void setLimitMinutesPerInterval(List<Integer> limitMinutesPerInterval) {
    this.limitMinutesPerInterval = limitMinutesPerInterval;
  }

  
  /**
   * A list of allocated time off minutes per granularity interval
   **/
  public TimeOffLimitValueRange allocatedMinutesPerInterval(List<Integer> allocatedMinutesPerInterval) {
    this.allocatedMinutesPerInterval = allocatedMinutesPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of allocated time off minutes per granularity interval")
  @JsonProperty("allocatedMinutesPerInterval")
  public List<Integer> getAllocatedMinutesPerInterval() {
    return allocatedMinutesPerInterval;
  }
  public void setAllocatedMinutesPerInterval(List<Integer> allocatedMinutesPerInterval) {
    this.allocatedMinutesPerInterval = allocatedMinutesPerInterval;
  }

  
  /**
   * A list of waitlisted time off minutes per granularity interval
   **/
  public TimeOffLimitValueRange waitlistedMinutesPerInterval(List<Integer> waitlistedMinutesPerInterval) {
    this.waitlistedMinutesPerInterval = waitlistedMinutesPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of waitlisted time off minutes per granularity interval")
  @JsonProperty("waitlistedMinutesPerInterval")
  public List<Integer> getWaitlistedMinutesPerInterval() {
    return waitlistedMinutesPerInterval;
  }
  public void setWaitlistedMinutesPerInterval(List<Integer> waitlistedMinutesPerInterval) {
    this.waitlistedMinutesPerInterval = waitlistedMinutesPerInterval;
  }

  
  /**
   * The current number of waitlisted time off requests for every interval per granularity
   **/
  public TimeOffLimitValueRange waitlistedRequestsPerInterval(List<Integer> waitlistedRequestsPerInterval) {
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
   * Version metadata for the time off limit
   **/
  public TimeOffLimitValueRange metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for the time off limit")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffLimitValueRange timeOffLimitValueRange = (TimeOffLimitValueRange) o;
    return Objects.equals(this.timeOffLimit, timeOffLimitValueRange.timeOffLimit) &&
        Objects.equals(this.startDate, timeOffLimitValueRange.startDate) &&
        Objects.equals(this.granularity, timeOffLimitValueRange.granularity) &&
        Objects.equals(this.limitMinutesPerInterval, timeOffLimitValueRange.limitMinutesPerInterval) &&
        Objects.equals(this.allocatedMinutesPerInterval, timeOffLimitValueRange.allocatedMinutesPerInterval) &&
        Objects.equals(this.waitlistedMinutesPerInterval, timeOffLimitValueRange.waitlistedMinutesPerInterval) &&
        Objects.equals(this.waitlistedRequestsPerInterval, timeOffLimitValueRange.waitlistedRequestsPerInterval) &&
        Objects.equals(this.metadata, timeOffLimitValueRange.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffLimit, startDate, granularity, limitMinutesPerInterval, allocatedMinutesPerInterval, waitlistedMinutesPerInterval, waitlistedRequestsPerInterval, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffLimitValueRange {\n");
    
    sb.append("    timeOffLimit: ").append(toIndentedString(timeOffLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    limitMinutesPerInterval: ").append(toIndentedString(limitMinutesPerInterval)).append("\n");
    sb.append("    allocatedMinutesPerInterval: ").append(toIndentedString(allocatedMinutesPerInterval)).append("\n");
    sb.append("    waitlistedMinutesPerInterval: ").append(toIndentedString(waitlistedMinutesPerInterval)).append("\n");
    sb.append("    waitlistedRequestsPerInterval: ").append(toIndentedString(waitlistedRequestsPerInterval)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

