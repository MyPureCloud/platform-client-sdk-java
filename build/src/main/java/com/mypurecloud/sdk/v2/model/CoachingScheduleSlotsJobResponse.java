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
import com.mypurecloud.sdk.v2.model.CoachingScheduleSlotsJobResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CoachingScheduleSlotsJobResponse
 */

public class CoachingScheduleSlotsJobResponse  implements Serializable {
  
  private String id = null;
  private List<String> attendeeIds = null;
  private List<String> facilitatorIds = null;
  private Integer lengthInMinutes = null;
  private String businessUnitId = null;
  private String activityCodeId = null;
  private List<CoachingScheduleSlotsJobResult> results = null;

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
   * The type of slots fetched in the job.
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
  private String selfUri = null;

  public CoachingScheduleSlotsJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      attendeeIds = new ArrayList<String>();
      facilitatorIds = new ArrayList<String>();
      results = new ArrayList<CoachingScheduleSlotsJobResult>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The attendee IDs to fetch the slots for.
   **/
  public CoachingScheduleSlotsJobResponse attendeeIds(List<String> attendeeIds) {
    this.attendeeIds = attendeeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The attendee IDs to fetch the slots for.")
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
  public CoachingScheduleSlotsJobResponse facilitatorIds(List<String> facilitatorIds) {
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
   * The length in minutes of the slots.
   **/
  public CoachingScheduleSlotsJobResponse lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length in minutes of the slots.")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   * The Business Unit Id of the users.
   **/
  public CoachingScheduleSlotsJobResponse businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Business Unit Id of the users.")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }


  /**
   * The Activity Code Id of the slots.
   **/
  public CoachingScheduleSlotsJobResponse activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Activity Code Id of the slots.")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * The results of the job.
   **/
  public CoachingScheduleSlotsJobResponse results(List<CoachingScheduleSlotsJobResult> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The results of the job.")
  @JsonProperty("results")
  public List<CoachingScheduleSlotsJobResult> getResults() {
    return results;
  }
  public void setResults(List<CoachingScheduleSlotsJobResult> results) {
    this.results = results;
  }


  /**
   * The type of slots fetched in the job.
   **/
  public CoachingScheduleSlotsJobResponse slotsType(SlotsTypeEnum slotsType) {
    this.slotsType = slotsType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of slots fetched in the job.")
  @JsonProperty("slotsType")
  public SlotsTypeEnum getSlotsType() {
    return slotsType;
  }
  public void setSlotsType(SlotsTypeEnum slotsType) {
    this.slotsType = slotsType;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachingScheduleSlotsJobResponse coachingScheduleSlotsJobResponse = (CoachingScheduleSlotsJobResponse) o;

    return Objects.equals(this.id, coachingScheduleSlotsJobResponse.id) &&
            Objects.equals(this.attendeeIds, coachingScheduleSlotsJobResponse.attendeeIds) &&
            Objects.equals(this.facilitatorIds, coachingScheduleSlotsJobResponse.facilitatorIds) &&
            Objects.equals(this.lengthInMinutes, coachingScheduleSlotsJobResponse.lengthInMinutes) &&
            Objects.equals(this.businessUnitId, coachingScheduleSlotsJobResponse.businessUnitId) &&
            Objects.equals(this.activityCodeId, coachingScheduleSlotsJobResponse.activityCodeId) &&
            Objects.equals(this.results, coachingScheduleSlotsJobResponse.results) &&
            Objects.equals(this.slotsType, coachingScheduleSlotsJobResponse.slotsType) &&
            Objects.equals(this.selfUri, coachingScheduleSlotsJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attendeeIds, facilitatorIds, lengthInMinutes, businessUnitId, activityCodeId, results, slotsType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingScheduleSlotsJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attendeeIds: ").append(toIndentedString(attendeeIds)).append("\n");
    sb.append("    facilitatorIds: ").append(toIndentedString(facilitatorIds)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    slotsType: ").append(toIndentedString(slotsType)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

