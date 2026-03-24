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
import com.mypurecloud.sdk.v2.model.CaseplanReference;
import com.mypurecloud.sdk.v2.model.StageplanReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WorkitemSettingsResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Stepplan
 */

public class Stepplan  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private CaseplanReference caseplan = null;
  private StageplanReference stageplan = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private UserReference modifiedBy = null;

  private static class ActivityTypeEnumDeserializer extends StdDeserializer<ActivityTypeEnum> {
    public ActivityTypeEnumDeserializer() {
      super(ActivityTypeEnumDeserializer.class);
    }

    @Override
    public ActivityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActivityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The activityType of the Stepplan.
   */
 @JsonDeserialize(using = ActivityTypeEnumDeserializer.class)
  public enum ActivityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    NONE("None"),
    WORKITEM("Workitem");

    private String value;

    ActivityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActivityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActivityTypeEnum value : ActivityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActivityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActivityTypeEnum activityType = null;
  private WorkitemSettingsResponse workitemSettings = null;
  private String selfUri = null;

  public Stepplan() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Stepplan.
   **/
  public Stepplan name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Stepplan.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the Stepplan.
   **/
  public Stepplan description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Stepplan.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The Caseplan of the Stepplan.
   **/
  public Stepplan caseplan(CaseplanReference caseplan) {
    this.caseplan = caseplan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Caseplan of the Stepplan.")
  @JsonProperty("caseplan")
  public CaseplanReference getCaseplan() {
    return caseplan;
  }
  public void setCaseplan(CaseplanReference caseplan) {
    this.caseplan = caseplan;
  }


  /**
   * The Stageplan of the Stepplan.
   **/
  public Stepplan stageplan(StageplanReference stageplan) {
    this.stageplan = stageplan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Stageplan of the Stepplan.")
  @JsonProperty("stageplan")
  public StageplanReference getStageplan() {
    return stageplan;
  }
  public void setStageplan(StageplanReference stageplan) {
    this.stageplan = stageplan;
  }


  /**
   * The Stepplan creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Stepplan dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Stepplan creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The Stepplan modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Stepplan dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Stepplan modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The ID of the User who modified the Stepplan.
   **/
  public Stepplan modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the User who modified the Stepplan.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The activityType of the Stepplan.
   **/
  public Stepplan activityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activityType of the Stepplan.")
  @JsonProperty("activityType")
  public ActivityTypeEnum getActivityType() {
    return activityType;
  }
  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }


  /**
   * The workitemSettings of the Stepplan.
   **/
  public Stepplan workitemSettings(WorkitemSettingsResponse workitemSettings) {
    this.workitemSettings = workitemSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The workitemSettings of the Stepplan.")
  @JsonProperty("workitemSettings")
  public WorkitemSettingsResponse getWorkitemSettings() {
    return workitemSettings;
  }
  public void setWorkitemSettings(WorkitemSettingsResponse workitemSettings) {
    this.workitemSettings = workitemSettings;
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
    Stepplan stepplan = (Stepplan) o;

    return Objects.equals(this.id, stepplan.id) &&
            Objects.equals(this.name, stepplan.name) &&
            Objects.equals(this.description, stepplan.description) &&
            Objects.equals(this.caseplan, stepplan.caseplan) &&
            Objects.equals(this.stageplan, stepplan.stageplan) &&
            Objects.equals(this.dateCreated, stepplan.dateCreated) &&
            Objects.equals(this.dateModified, stepplan.dateModified) &&
            Objects.equals(this.modifiedBy, stepplan.modifiedBy) &&
            Objects.equals(this.activityType, stepplan.activityType) &&
            Objects.equals(this.workitemSettings, stepplan.workitemSettings) &&
            Objects.equals(this.selfUri, stepplan.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, caseplan, stageplan, dateCreated, dateModified, modifiedBy, activityType, workitemSettings, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stepplan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    caseplan: ").append(toIndentedString(caseplan)).append("\n");
    sb.append("    stageplan: ").append(toIndentedString(stageplan)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    workitemSettings: ").append(toIndentedString(workitemSettings)).append("\n");
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

