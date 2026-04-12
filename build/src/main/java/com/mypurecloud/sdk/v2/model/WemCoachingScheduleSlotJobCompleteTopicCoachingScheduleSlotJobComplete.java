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
import com.mypurecloud.sdk.v2.model.WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete
 */

public class WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete  implements Serializable {
  
  private String id = null;
  private List<String> attendeeIds = null;
  private List<String> facilitatorIds = null;
  private Long lengthInMinutes = null;
  private String businessUnitId = null;
  private String activityCodeId = null;

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
   * Gets or Sets slotsType
   */
 @JsonDeserialize(using = SlotsTypeEnumDeserializer.class)
  public enum SlotsTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
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
  private List<WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults> results = null;

  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      attendeeIds = new ArrayList<String>();
      facilitatorIds = new ArrayList<String>();
      results = new ArrayList<WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults>();
    }
  }

  
  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete attendeeIds(List<String> attendeeIds) {
    this.attendeeIds = attendeeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attendeeIds")
  public List<String> getAttendeeIds() {
    return attendeeIds;
  }
  public void setAttendeeIds(List<String> attendeeIds) {
    this.attendeeIds = attendeeIds;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete facilitatorIds(List<String> facilitatorIds) {
    this.facilitatorIds = facilitatorIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("facilitatorIds")
  public List<String> getFacilitatorIds() {
    return facilitatorIds;
  }
  public void setFacilitatorIds(List<String> facilitatorIds) {
    this.facilitatorIds = facilitatorIds;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete lengthInMinutes(Long lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lengthInMinutes")
  public Long getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Long lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete slotsType(SlotsTypeEnum slotsType) {
    this.slotsType = slotsType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("slotsType")
  public SlotsTypeEnum getSlotsType() {
    return slotsType;
  }
  public void setSlotsType(SlotsTypeEnum slotsType) {
    this.slotsType = slotsType;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete results(List<WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("results")
  public List<WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults> getResults() {
    return results;
  }
  public void setResults(List<WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResults> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete = (WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete) o;

    return Objects.equals(this.id, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete.id) &&
            Objects.equals(this.attendeeIds, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete.attendeeIds) &&
            Objects.equals(this.facilitatorIds, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete.facilitatorIds) &&
            Objects.equals(this.lengthInMinutes, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete.lengthInMinutes) &&
            Objects.equals(this.businessUnitId, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete.businessUnitId) &&
            Objects.equals(this.activityCodeId, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete.activityCodeId) &&
            Objects.equals(this.slotsType, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete.slotsType) &&
            Objects.equals(this.results, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attendeeIds, facilitatorIds, lengthInMinutes, businessUnitId, activityCodeId, slotsType, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobComplete {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attendeeIds: ").append(toIndentedString(attendeeIds)).append("\n");
    sb.append("    facilitatorIds: ").append(toIndentedString(facilitatorIds)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    slotsType: ").append(toIndentedString(slotsType)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

