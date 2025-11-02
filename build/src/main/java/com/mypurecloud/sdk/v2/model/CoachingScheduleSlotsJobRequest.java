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
 * CoachingScheduleSlotsJobRequest
 */

public class CoachingScheduleSlotsJobRequest  implements Serializable {
  
  private List<String> attendeeIds = null;
  private List<String> facilitatorIds = null;
  private Integer lengthInMinutes = null;
  private String activityCodeId = null;
  private List<String> intervals = null;

  private static class SlotsTypeEnumDeserializer extends StdDeserializer<SlotsTypeEnum> {
    public SlotsTypeEnumDeserializer() {
      super(SlotsTypeEnumDeserializer.class);
    }

    @Override
    public SlotsTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SlotsTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of slots to fetch in the job.
   */
 @JsonDeserialize(using = SlotsTypeEnumDeserializer.class)
  public enum SlotsTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BESTTIME("BestTime");

    private String value;

    SlotsTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SlotsTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SlotsTypeEnum value : SlotsTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SlotsTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SlotsTypeEnum slotsType = null;

  public CoachingScheduleSlotsJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      attendeeIds = new ArrayList<String>();
      facilitatorIds = new ArrayList<String>();
      intervals = new ArrayList<String>();
    }
  }

  
  /**
   * The attendee IDs to fetch the slots for.
   **/
  public CoachingScheduleSlotsJobRequest attendeeIds(List<String> attendeeIds) {
    this.attendeeIds = attendeeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The attendee IDs to fetch the slots for.")
  @JsonProperty("attendeeIds")
  public List<String> getAttendeeIds() {
    return attendeeIds;
  }
  public void setAttendeeIds(List<String> attendeeIds) {
    this.attendeeIds = attendeeIds;
  }


  /**
   * The facilitator IDs to fetch the slots for.
   **/
  public CoachingScheduleSlotsJobRequest facilitatorIds(List<String> facilitatorIds) {
    this.facilitatorIds = facilitatorIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The facilitator IDs to fetch the slots for.")
  @JsonProperty("facilitatorIds")
  public List<String> getFacilitatorIds() {
    return facilitatorIds;
  }
  public void setFacilitatorIds(List<String> facilitatorIds) {
    this.facilitatorIds = facilitatorIds;
  }


  /**
   * The length in minutes of the slots, in 15 minutes granularity.
   **/
  public CoachingScheduleSlotsJobRequest lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length in minutes of the slots, in 15 minutes granularity.")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   * The Activity Code Id of the slots.
   **/
  public CoachingScheduleSlotsJobRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Activity Code Id of the slots.")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * The intervals to fetch the slots for. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public CoachingScheduleSlotsJobRequest intervals(List<String> intervals) {
    this.intervals = intervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The intervals to fetch the slots for. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("intervals")
  public List<String> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<String> intervals) {
    this.intervals = intervals;
  }


  /**
   * The type of slots to fetch in the job.
   **/
  public CoachingScheduleSlotsJobRequest slotsType(SlotsTypeEnum slotsType) {
    this.slotsType = slotsType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of slots to fetch in the job.")
  @JsonProperty("slotsType")
  public SlotsTypeEnum getSlotsType() {
    return slotsType;
  }
  public void setSlotsType(SlotsTypeEnum slotsType) {
    this.slotsType = slotsType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachingScheduleSlotsJobRequest coachingScheduleSlotsJobRequest = (CoachingScheduleSlotsJobRequest) o;

    return Objects.equals(this.attendeeIds, coachingScheduleSlotsJobRequest.attendeeIds) &&
            Objects.equals(this.facilitatorIds, coachingScheduleSlotsJobRequest.facilitatorIds) &&
            Objects.equals(this.lengthInMinutes, coachingScheduleSlotsJobRequest.lengthInMinutes) &&
            Objects.equals(this.activityCodeId, coachingScheduleSlotsJobRequest.activityCodeId) &&
            Objects.equals(this.intervals, coachingScheduleSlotsJobRequest.intervals) &&
            Objects.equals(this.slotsType, coachingScheduleSlotsJobRequest.slotsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attendeeIds, facilitatorIds, lengthInMinutes, activityCodeId, intervals, slotsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingScheduleSlotsJobRequest {\n");
    
    sb.append("    attendeeIds: ").append(toIndentedString(attendeeIds)).append("\n");
    sb.append("    facilitatorIds: ").append(toIndentedString(facilitatorIds)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    slotsType: ").append(toIndentedString(slotsType)).append("\n");
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

