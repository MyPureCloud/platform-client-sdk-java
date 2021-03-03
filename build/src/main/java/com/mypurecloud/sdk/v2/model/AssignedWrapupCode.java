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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AssignedWrapupCode
 */

public class AssignedWrapupCode  implements Serializable {
  
  private String code = null;
  private String notes = null;
  private List<String> tags = new ArrayList<String>();
  private Integer durationSeconds = null;
  private Date endTime = null;

  
  /**
   * The user configured wrap up code id.
   **/
  public AssignedWrapupCode code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user configured wrap up code id.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * Text entered by the agent to describe the call or disposition.
   **/
  public AssignedWrapupCode notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text entered by the agent to describe the call or disposition.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * List of tags selected by the agent to describe the call or disposition.
   **/
  public AssignedWrapupCode tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of tags selected by the agent to describe the call or disposition.")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  /**
   * The duration in seconds of the wrap-up segment.
   **/
  public AssignedWrapupCode durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The duration in seconds of the wrap-up segment.")
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  
  /**
   * The timestamp when the wrap-up segment ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AssignedWrapupCode endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when the wrap-up segment ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignedWrapupCode assignedWrapupCode = (AssignedWrapupCode) o;
    return Objects.equals(this.code, assignedWrapupCode.code) &&
        Objects.equals(this.notes, assignedWrapupCode.notes) &&
        Objects.equals(this.tags, assignedWrapupCode.tags) &&
        Objects.equals(this.durationSeconds, assignedWrapupCode.durationSeconds) &&
        Objects.equals(this.endTime, assignedWrapupCode.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, notes, tags, durationSeconds, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignedWrapupCode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

