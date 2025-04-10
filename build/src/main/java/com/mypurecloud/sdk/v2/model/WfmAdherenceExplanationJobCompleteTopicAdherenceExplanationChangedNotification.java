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
import com.mypurecloud.sdk.v2.model.WfmAdherenceExplanationJobCompleteTopicBusinessUnit;
import com.mypurecloud.sdk.v2.model.WfmAdherenceExplanationJobCompleteTopicManagementUnit;
import com.mypurecloud.sdk.v2.model.WfmAdherenceExplanationJobCompleteTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification
 */

public class WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification  implements Serializable {
  
  private String id = null;
  private WfmAdherenceExplanationJobCompleteTopicUserReference agent = null;
  private WfmAdherenceExplanationJobCompleteTopicManagementUnit managementUnit = null;
  private WfmAdherenceExplanationJobCompleteTopicBusinessUnit businessUnit = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LATE("Late");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    APPROVED("Approved"),
    DENIED("Denied");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private Date startDate = null;
  private Long lengthMinutes = null;
  private String notes = null;
  private WfmAdherenceExplanationJobCompleteTopicUserReference reviewedBy = null;
  private Date reviewedDate = null;

  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification id(String id) {
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
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification agent(WfmAdherenceExplanationJobCompleteTopicUserReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public WfmAdherenceExplanationJobCompleteTopicUserReference getAgent() {
    return agent;
  }
  public void setAgent(WfmAdherenceExplanationJobCompleteTopicUserReference agent) {
    this.agent = agent;
  }


  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification managementUnit(WfmAdherenceExplanationJobCompleteTopicManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managementUnit")
  public WfmAdherenceExplanationJobCompleteTopicManagementUnit getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(WfmAdherenceExplanationJobCompleteTopicManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification businessUnit(WfmAdherenceExplanationJobCompleteTopicBusinessUnit businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessUnit")
  public WfmAdherenceExplanationJobCompleteTopicBusinessUnit getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(WfmAdherenceExplanationJobCompleteTopicBusinessUnit businessUnit) {
    this.businessUnit = businessUnit;
  }


  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification lengthMinutes(Long lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lengthMinutes")
  public Long getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Long lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification reviewedBy(WfmAdherenceExplanationJobCompleteTopicUserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedBy")
  public WfmAdherenceExplanationJobCompleteTopicUserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(WfmAdherenceExplanationJobCompleteTopicUserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  /**
   **/
  public WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification reviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedDate")
  public Date getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification = (WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification) o;

    return Objects.equals(this.id, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.id) &&
            Objects.equals(this.agent, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.agent) &&
            Objects.equals(this.managementUnit, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.managementUnit) &&
            Objects.equals(this.businessUnit, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.businessUnit) &&
            Objects.equals(this.type, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.type) &&
            Objects.equals(this.status, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.status) &&
            Objects.equals(this.startDate, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.startDate) &&
            Objects.equals(this.lengthMinutes, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.lengthMinutes) &&
            Objects.equals(this.notes, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.notes) &&
            Objects.equals(this.reviewedBy, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.reviewedBy) &&
            Objects.equals(this.reviewedDate, wfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.reviewedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, agent, managementUnit, businessUnit, type, status, startDate, lengthMinutes, notes, reviewedBy, reviewedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
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

