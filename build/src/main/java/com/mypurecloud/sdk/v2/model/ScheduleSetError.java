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
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import com.mypurecloud.sdk.v2.model.WorkPlanRotationReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ScheduleSetError
 */

public class ScheduleSetError  implements Serializable {
  

  private static class ErrorCodeEnumDeserializer extends StdDeserializer<ErrorCodeEnum> {
    public ErrorCodeEnumDeserializer() {
      super(ErrorCodeEnumDeserializer.class);
    }

    @Override
    public ErrorCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ErrorCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Error code that indicates why schedule set optimization failed. At least one of workPlans or workPlanRotations is set if there is an error during optimization
   */
 @JsonDeserialize(using = ErrorCodeEnumDeserializer.class)
  public enum ErrorCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INVALIDWORKPLANS("InvalidWorkPlans"),
    INVALIDWORKPLANROTATIONS("InvalidWorkPlanRotations");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ErrorCodeEnum fromString(String key) {
      if (key == null) return null;

      for (ErrorCodeEnum value : ErrorCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ErrorCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ErrorCodeEnum errorCode = null;
  private List<WorkPlanReference> workPlans = null;
  private List<WorkPlanRotationReference> workPlanRotations = null;

  public ScheduleSetError() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      workPlans = new ArrayList<WorkPlanReference>();
      workPlanRotations = new ArrayList<WorkPlanRotationReference>();
    }
  }

  public ScheduleSetError(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      workPlans = new ArrayList<WorkPlanReference>();
      workPlanRotations = new ArrayList<WorkPlanRotationReference>();
    }
  }

  
  /**
   * Error code that indicates why schedule set optimization failed. At least one of workPlans or workPlanRotations is set if there is an error during optimization
   **/
  public ScheduleSetError errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Error code that indicates why schedule set optimization failed. At least one of workPlans or workPlanRotations is set if there is an error during optimization")
  @JsonProperty("errorCode")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * Work plans involved in the optimization failure
   **/
  public ScheduleSetError workPlans(List<WorkPlanReference> workPlans) {
    this.workPlans = workPlans;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Work plans involved in the optimization failure")
  @JsonProperty("workPlans")
  public List<WorkPlanReference> getWorkPlans() {
    return workPlans;
  }
  public void setWorkPlans(List<WorkPlanReference> workPlans) {
    this.workPlans = workPlans;
  }


  /**
   * Work plan rotations involved in the optimization failure
   **/
  public ScheduleSetError workPlanRotations(List<WorkPlanRotationReference> workPlanRotations) {
    this.workPlanRotations = workPlanRotations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Work plan rotations involved in the optimization failure")
  @JsonProperty("workPlanRotations")
  public List<WorkPlanRotationReference> getWorkPlanRotations() {
    return workPlanRotations;
  }
  public void setWorkPlanRotations(List<WorkPlanRotationReference> workPlanRotations) {
    this.workPlanRotations = workPlanRotations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleSetError scheduleSetError = (ScheduleSetError) o;

    return Objects.equals(this.errorCode, scheduleSetError.errorCode) &&
            Objects.equals(this.workPlans, scheduleSetError.workPlans) &&
            Objects.equals(this.workPlanRotations, scheduleSetError.workPlanRotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, workPlans, workPlanRotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleSetError {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    workPlans: ").append(toIndentedString(workPlans)).append("\n");
    sb.append("    workPlanRotations: ").append(toIndentedString(workPlanRotations)).append("\n");
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

