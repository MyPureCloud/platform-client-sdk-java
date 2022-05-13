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
import com.mypurecloud.sdk.v2.model.WfmUserNotificationTopicBusinessUnit;
import com.mypurecloud.sdk.v2.model.WfmUserNotificationTopicManagementUnit;
import com.mypurecloud.sdk.v2.model.WfmUserNotificationTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WfmUserNotificationTopicAdherenceExplanationNotification
 */

public class WfmUserNotificationTopicAdherenceExplanationNotification  implements Serializable {
  
  private String id = null;
  private WfmUserNotificationTopicUserReference agent = null;
  private WfmUserNotificationTopicManagementUnit managementUnit = null;
  private WfmUserNotificationTopicBusinessUnit businessUnit = null;
  private Date startDate = null;
  private Integer lengthMinutes = null;

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
  private String notes = null;

  
  /**
   **/
  public WfmUserNotificationTopicAdherenceExplanationNotification id(String id) {
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
  public WfmUserNotificationTopicAdherenceExplanationNotification agent(WfmUserNotificationTopicUserReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public WfmUserNotificationTopicUserReference getAgent() {
    return agent;
  }
  public void setAgent(WfmUserNotificationTopicUserReference agent) {
    this.agent = agent;
  }


  /**
   **/
  public WfmUserNotificationTopicAdherenceExplanationNotification managementUnit(WfmUserNotificationTopicManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managementUnit")
  public WfmUserNotificationTopicManagementUnit getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(WfmUserNotificationTopicManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   **/
  public WfmUserNotificationTopicAdherenceExplanationNotification businessUnit(WfmUserNotificationTopicBusinessUnit businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessUnit")
  public WfmUserNotificationTopicBusinessUnit getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(WfmUserNotificationTopicBusinessUnit businessUnit) {
    this.businessUnit = businessUnit;
  }


  /**
   **/
  public WfmUserNotificationTopicAdherenceExplanationNotification startDate(Date startDate) {
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
  public WfmUserNotificationTopicAdherenceExplanationNotification lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   **/
  public WfmUserNotificationTopicAdherenceExplanationNotification status(StatusEnum status) {
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
  public WfmUserNotificationTopicAdherenceExplanationNotification type(TypeEnum type) {
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
  public WfmUserNotificationTopicAdherenceExplanationNotification notes(String notes) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmUserNotificationTopicAdherenceExplanationNotification wfmUserNotificationTopicAdherenceExplanationNotification = (WfmUserNotificationTopicAdherenceExplanationNotification) o;

    return Objects.equals(this.id, wfmUserNotificationTopicAdherenceExplanationNotification.id) &&
            Objects.equals(this.agent, wfmUserNotificationTopicAdherenceExplanationNotification.agent) &&
            Objects.equals(this.managementUnit, wfmUserNotificationTopicAdherenceExplanationNotification.managementUnit) &&
            Objects.equals(this.businessUnit, wfmUserNotificationTopicAdherenceExplanationNotification.businessUnit) &&
            Objects.equals(this.startDate, wfmUserNotificationTopicAdherenceExplanationNotification.startDate) &&
            Objects.equals(this.lengthMinutes, wfmUserNotificationTopicAdherenceExplanationNotification.lengthMinutes) &&
            Objects.equals(this.status, wfmUserNotificationTopicAdherenceExplanationNotification.status) &&
            Objects.equals(this.type, wfmUserNotificationTopicAdherenceExplanationNotification.type) &&
            Objects.equals(this.notes, wfmUserNotificationTopicAdherenceExplanationNotification.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, agent, managementUnit, businessUnit, startDate, lengthMinutes, status, type, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserNotificationTopicAdherenceExplanationNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

