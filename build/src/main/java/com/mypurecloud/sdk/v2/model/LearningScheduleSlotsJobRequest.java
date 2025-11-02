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
 * LearningScheduleSlotsJobRequest
 */

public class LearningScheduleSlotsJobRequest  implements Serializable {
  
  private List<String> userIds = null;
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

  public LearningScheduleSlotsJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userIds = new ArrayList<String>();
      intervals = new ArrayList<String>();
    }
  }

  
  /**
   * The user IDs to fetch the slots for.
   **/
  public LearningScheduleSlotsJobRequest userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user IDs to fetch the slots for.")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * The length in minutes of the slots, in 15 minutes granularity.
   **/
  public LearningScheduleSlotsJobRequest lengthInMinutes(Integer lengthInMinutes) {
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
  public LearningScheduleSlotsJobRequest activityCodeId(String activityCodeId) {
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
  public LearningScheduleSlotsJobRequest intervals(List<String> intervals) {
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
  public LearningScheduleSlotsJobRequest slotsType(SlotsTypeEnum slotsType) {
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
    LearningScheduleSlotsJobRequest learningScheduleSlotsJobRequest = (LearningScheduleSlotsJobRequest) o;

    return Objects.equals(this.userIds, learningScheduleSlotsJobRequest.userIds) &&
            Objects.equals(this.lengthInMinutes, learningScheduleSlotsJobRequest.lengthInMinutes) &&
            Objects.equals(this.activityCodeId, learningScheduleSlotsJobRequest.activityCodeId) &&
            Objects.equals(this.intervals, learningScheduleSlotsJobRequest.intervals) &&
            Objects.equals(this.slotsType, learningScheduleSlotsJobRequest.slotsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, lengthInMinutes, activityCodeId, intervals, slotsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningScheduleSlotsJobRequest {\n");
    
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

