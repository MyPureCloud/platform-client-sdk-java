package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Time Off Request Settings
 */
@ApiModel(description = "Time Off Request Settings")

public class TimeOffRequestSettings  implements Serializable {
  
  private Boolean submissionRangeEnforced = null;
  private Integer submissionEarliestDaysFromNow = null;
  private Integer submissionLatestDaysFromNow = null;

  
  /**
   * Whether to enforce a submission range for agent time off requests
   **/
  public TimeOffRequestSettings submissionRangeEnforced(Boolean submissionRangeEnforced) {
    this.submissionRangeEnforced = submissionRangeEnforced;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to enforce a submission range for agent time off requests")
  @JsonProperty("submissionRangeEnforced")
  public Boolean getSubmissionRangeEnforced() {
    return submissionRangeEnforced;
  }
  public void setSubmissionRangeEnforced(Boolean submissionRangeEnforced) {
    this.submissionRangeEnforced = submissionRangeEnforced;
  }

  
  /**
   * The earliest number of days from now for which an agent can submit a time off request.  Use negative numbers to indicate days in the past
   **/
  public TimeOffRequestSettings submissionEarliestDaysFromNow(Integer submissionEarliestDaysFromNow) {
    this.submissionEarliestDaysFromNow = submissionEarliestDaysFromNow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The earliest number of days from now for which an agent can submit a time off request.  Use negative numbers to indicate days in the past")
  @JsonProperty("submissionEarliestDaysFromNow")
  public Integer getSubmissionEarliestDaysFromNow() {
    return submissionEarliestDaysFromNow;
  }
  public void setSubmissionEarliestDaysFromNow(Integer submissionEarliestDaysFromNow) {
    this.submissionEarliestDaysFromNow = submissionEarliestDaysFromNow;
  }

  
  /**
   * The latest number of days from now for which an agent can submit a time off request
   **/
  public TimeOffRequestSettings submissionLatestDaysFromNow(Integer submissionLatestDaysFromNow) {
    this.submissionLatestDaysFromNow = submissionLatestDaysFromNow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The latest number of days from now for which an agent can submit a time off request")
  @JsonProperty("submissionLatestDaysFromNow")
  public Integer getSubmissionLatestDaysFromNow() {
    return submissionLatestDaysFromNow;
  }
  public void setSubmissionLatestDaysFromNow(Integer submissionLatestDaysFromNow) {
    this.submissionLatestDaysFromNow = submissionLatestDaysFromNow;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRequestSettings timeOffRequestSettings = (TimeOffRequestSettings) o;
    return Objects.equals(this.submissionRangeEnforced, timeOffRequestSettings.submissionRangeEnforced) &&
        Objects.equals(this.submissionEarliestDaysFromNow, timeOffRequestSettings.submissionEarliestDaysFromNow) &&
        Objects.equals(this.submissionLatestDaysFromNow, timeOffRequestSettings.submissionLatestDaysFromNow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionRangeEnforced, submissionEarliestDaysFromNow, submissionLatestDaysFromNow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequestSettings {\n");
    
    sb.append("    submissionRangeEnforced: ").append(toIndentedString(submissionRangeEnforced)).append("\n");
    sb.append("    submissionEarliestDaysFromNow: ").append(toIndentedString(submissionEarliestDaysFromNow)).append("\n");
    sb.append("    submissionLatestDaysFromNow: ").append(toIndentedString(submissionLatestDaysFromNow)).append("\n");
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

