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
import com.mypurecloud.sdk.v2.model.WfmActivityPlanJobCompleteTopicActivityPlanJobException;
import com.mypurecloud.sdk.v2.model.WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference;
import com.mypurecloud.sdk.v2.model.WfmActivityPlanJobCompleteTopicActivityPlanReference;
import com.mypurecloud.sdk.v2.model.WfmActivityPlanJobCompleteTopicErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification
 */

public class WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification  implements Serializable {
  
  private String id = null;

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
    RUNPLAN("RunPlan"),
    DELETEOCCURRENCE("DeleteOccurrence");

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
  private WfmActivityPlanJobCompleteTopicActivityPlanReference activityPlan = null;

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
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    ERROR("Error");

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
  private List<WfmActivityPlanJobCompleteTopicActivityPlanJobException> exceptions = null;
  private WfmActivityPlanJobCompleteTopicErrorBody error = null;
  private WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference occurrence = null;

  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      exceptions = new ArrayList<WfmActivityPlanJobCompleteTopicActivityPlanJobException>();
    }
  }

  
  /**
   **/
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification id(String id) {
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
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification type(TypeEnum type) {
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
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification activityPlan(WfmActivityPlanJobCompleteTopicActivityPlanReference activityPlan) {
    this.activityPlan = activityPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityPlan")
  public WfmActivityPlanJobCompleteTopicActivityPlanReference getActivityPlan() {
    return activityPlan;
  }
  public void setActivityPlan(WfmActivityPlanJobCompleteTopicActivityPlanReference activityPlan) {
    this.activityPlan = activityPlan;
  }


  /**
   **/
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification status(StatusEnum status) {
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
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification exceptions(List<WfmActivityPlanJobCompleteTopicActivityPlanJobException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exceptions")
  public List<WfmActivityPlanJobCompleteTopicActivityPlanJobException> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<WfmActivityPlanJobCompleteTopicActivityPlanJobException> exceptions) {
    this.exceptions = exceptions;
  }


  /**
   **/
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification error(WfmActivityPlanJobCompleteTopicErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public WfmActivityPlanJobCompleteTopicErrorBody getError() {
    return error;
  }
  public void setError(WfmActivityPlanJobCompleteTopicErrorBody error) {
    this.error = error;
  }


  /**
   **/
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification occurrence(WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference occurrence) {
    this.occurrence = occurrence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("occurrence")
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference getOccurrence() {
    return occurrence;
  }
  public void setOccurrence(WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference occurrence) {
    this.occurrence = occurrence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification = (WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification) o;

    return Objects.equals(this.id, wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification.id) &&
            Objects.equals(this.type, wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification.type) &&
            Objects.equals(this.activityPlan, wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification.activityPlan) &&
            Objects.equals(this.status, wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification.status) &&
            Objects.equals(this.exceptions, wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification.exceptions) &&
            Objects.equals(this.error, wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification.error) &&
            Objects.equals(this.occurrence, wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification.occurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, activityPlan, status, exceptions, error, occurrence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    activityPlan: ").append(toIndentedString(activityPlan)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    occurrence: ").append(toIndentedString(occurrence)).append("\n");
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

