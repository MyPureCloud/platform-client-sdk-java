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
import com.mypurecloud.sdk.v2.model.ActivityPlanJobException;
import com.mypurecloud.sdk.v2.model.ActivityPlanReference;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityPlanRunJobResponse
 */

public class ActivityPlanRunJobResponse  implements Serializable {
  
  private String id = null;
  private ActivityPlanReference activityPlan = null;

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
   * The status of the job
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
  private List<ActivityPlanJobException> exceptions = new ArrayList<ActivityPlanJobException>();
  private ErrorBody error = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The activity plan associated with this job
   **/
  public ActivityPlanRunJobResponse activityPlan(ActivityPlanReference activityPlan) {
    this.activityPlan = activityPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity plan associated with this job")
  @JsonProperty("activityPlan")
  public ActivityPlanReference getActivityPlan() {
    return activityPlan;
  }
  public void setActivityPlan(ActivityPlanReference activityPlan) {
    this.activityPlan = activityPlan;
  }


  /**
   * The status of the job
   **/
  public ActivityPlanRunJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The list of exceptions that occurred while running this activity plan job. These are exceptions that affect individual occurrences but didn't prevent the job from completing
   **/
  public ActivityPlanRunJobResponse exceptions(List<ActivityPlanJobException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of exceptions that occurred while running this activity plan job. These are exceptions that affect individual occurrences but didn't prevent the job from completing")
  @JsonProperty("exceptions")
  public List<ActivityPlanJobException> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<ActivityPlanJobException> exceptions) {
    this.exceptions = exceptions;
  }


  /**
   * Error details if status == 'Error'. These are errors that caused the job to fail to complete
   **/
  public ActivityPlanRunJobResponse error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error details if status == 'Error'. These are errors that caused the job to fail to complete")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
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
    ActivityPlanRunJobResponse activityPlanRunJobResponse = (ActivityPlanRunJobResponse) o;

    return Objects.equals(this.id, activityPlanRunJobResponse.id) &&
            Objects.equals(this.activityPlan, activityPlanRunJobResponse.activityPlan) &&
            Objects.equals(this.status, activityPlanRunJobResponse.status) &&
            Objects.equals(this.exceptions, activityPlanRunJobResponse.exceptions) &&
            Objects.equals(this.error, activityPlanRunJobResponse.error) &&
            Objects.equals(this.selfUri, activityPlanRunJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityPlan, status, exceptions, error, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanRunJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityPlan: ").append(toIndentedString(activityPlan)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

