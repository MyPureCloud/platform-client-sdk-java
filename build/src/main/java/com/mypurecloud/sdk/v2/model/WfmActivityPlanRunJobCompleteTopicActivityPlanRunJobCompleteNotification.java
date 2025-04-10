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
import com.mypurecloud.sdk.v2.model.WfmActivityPlanRunJobCompleteTopicActivityPlanJobException;
import com.mypurecloud.sdk.v2.model.WfmActivityPlanRunJobCompleteTopicActivityPlanReference;
import com.mypurecloud.sdk.v2.model.WfmActivityPlanRunJobCompleteTopicErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification
 */

public class WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification  implements Serializable {
  
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
  private WfmActivityPlanRunJobCompleteTopicActivityPlanReference activityPlan = null;

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
  private List<WfmActivityPlanRunJobCompleteTopicActivityPlanJobException> exceptions = null;
  private WfmActivityPlanRunJobCompleteTopicErrorBody error = null;

  public WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      exceptions = new ArrayList<WfmActivityPlanRunJobCompleteTopicActivityPlanJobException>();
    }
  }

  
  /**
   **/
  public WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification id(String id) {
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
  public WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification type(TypeEnum type) {
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
  public WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification activityPlan(WfmActivityPlanRunJobCompleteTopicActivityPlanReference activityPlan) {
    this.activityPlan = activityPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityPlan")
  public WfmActivityPlanRunJobCompleteTopicActivityPlanReference getActivityPlan() {
    return activityPlan;
  }
  public void setActivityPlan(WfmActivityPlanRunJobCompleteTopicActivityPlanReference activityPlan) {
    this.activityPlan = activityPlan;
  }


  /**
   **/
  public WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification status(StatusEnum status) {
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
  public WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification exceptions(List<WfmActivityPlanRunJobCompleteTopicActivityPlanJobException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exceptions")
  public List<WfmActivityPlanRunJobCompleteTopicActivityPlanJobException> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<WfmActivityPlanRunJobCompleteTopicActivityPlanJobException> exceptions) {
    this.exceptions = exceptions;
  }


  /**
   **/
  public WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification error(WfmActivityPlanRunJobCompleteTopicErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public WfmActivityPlanRunJobCompleteTopicErrorBody getError() {
    return error;
  }
  public void setError(WfmActivityPlanRunJobCompleteTopicErrorBody error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification wfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification = (WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification) o;

    return Objects.equals(this.id, wfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification.id) &&
            Objects.equals(this.type, wfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification.type) &&
            Objects.equals(this.activityPlan, wfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification.activityPlan) &&
            Objects.equals(this.status, wfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification.status) &&
            Objects.equals(this.exceptions, wfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification.exceptions) &&
            Objects.equals(this.error, wfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, activityPlan, status, exceptions, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    activityPlan: ").append(toIndentedString(activityPlan)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

