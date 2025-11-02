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
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsJobResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LearningScheduleSlotsJobResponse
 */

public class LearningScheduleSlotsJobResponse  implements Serializable {
  
  private String id = null;
  private List<String> userIds = null;
  private Integer lengthInMinutes = null;
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
  private List<LearningScheduleSlotsJobResult> results = null;
  private String selfUri = null;

  public LearningScheduleSlotsJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userIds = new ArrayList<String>();
      results = new ArrayList<LearningScheduleSlotsJobResult>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The user IDs to fetch the slots for.
   **/
  public LearningScheduleSlotsJobResponse userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user IDs to fetch the slots for.")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * The length in minutes of the slots.
   **/
  public LearningScheduleSlotsJobResponse lengthInMinutes(Integer lengthInMinutes) {
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
  public LearningScheduleSlotsJobResponse businessUnitId(String businessUnitId) {
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
  public LearningScheduleSlotsJobResponse activityCodeId(String activityCodeId) {
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
   * The type of slots fetched in the job.
   **/
  public LearningScheduleSlotsJobResponse slotsType(SlotsTypeEnum slotsType) {
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


  /**
   * The results of the job.
   **/
  public LearningScheduleSlotsJobResponse results(List<LearningScheduleSlotsJobResult> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The results of the job.")
  @JsonProperty("results")
  public List<LearningScheduleSlotsJobResult> getResults() {
    return results;
  }
  public void setResults(List<LearningScheduleSlotsJobResult> results) {
    this.results = results;
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
    LearningScheduleSlotsJobResponse learningScheduleSlotsJobResponse = (LearningScheduleSlotsJobResponse) o;

    return Objects.equals(this.id, learningScheduleSlotsJobResponse.id) &&
            Objects.equals(this.userIds, learningScheduleSlotsJobResponse.userIds) &&
            Objects.equals(this.lengthInMinutes, learningScheduleSlotsJobResponse.lengthInMinutes) &&
            Objects.equals(this.businessUnitId, learningScheduleSlotsJobResponse.businessUnitId) &&
            Objects.equals(this.activityCodeId, learningScheduleSlotsJobResponse.activityCodeId) &&
            Objects.equals(this.slotsType, learningScheduleSlotsJobResponse.slotsType) &&
            Objects.equals(this.results, learningScheduleSlotsJobResponse.results) &&
            Objects.equals(this.selfUri, learningScheduleSlotsJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userIds, lengthInMinutes, businessUnitId, activityCodeId, slotsType, results, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningScheduleSlotsJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    slotsType: ").append(toIndentedString(slotsType)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

