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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WrapupInput
 */

public class WrapupInput  implements Serializable {
  
  private String code = null;
  private String name = null;
  private String notes = null;
  private List<String> tags = null;
  private Integer durationSeconds = null;
  private Date endTime = null;
  private Boolean provisional = null;
  private Boolean disableEndTimeUpdates = null;

  public WrapupInput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      tags = new ArrayList<String>();
    }
  }

  
  /**
   * The user configured wrap up code id.
   **/
  public WrapupInput code(String code) {
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
   * The user configured wrap up code name.
   **/
  public WrapupInput name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user configured wrap up code name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Text entered by the agent to describe the call or disposition.
   **/
  public WrapupInput notes(String notes) {
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
  public WrapupInput tags(List<String> tags) {
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
   * The length of time in seconds that the agent spent doing after call work.
   **/
  public WrapupInput durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length of time in seconds that the agent spent doing after call work.")
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  /**
   * The timestamp when the wrapup was finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WrapupInput endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when the wrapup was finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  /**
   * Indicates if this is a pending save and should not require a code to be specified.  This allows someone to save some temporary wrapup that will be used later.
   **/
  public WrapupInput provisional(Boolean provisional) {
    this.provisional = provisional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if this is a pending save and should not require a code to be specified.  This allows someone to save some temporary wrapup that will be used later.")
  @JsonProperty("provisional")
  public Boolean getProvisional() {
    return provisional;
  }
  public void setProvisional(Boolean provisional) {
    this.provisional = provisional;
  }


  /**
   * Prevent updates to wrapup end time when set to true.
   **/
  public WrapupInput disableEndTimeUpdates(Boolean disableEndTimeUpdates) {
    this.disableEndTimeUpdates = disableEndTimeUpdates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Prevent updates to wrapup end time when set to true.")
  @JsonProperty("disableEndTimeUpdates")
  public Boolean getDisableEndTimeUpdates() {
    return disableEndTimeUpdates;
  }
  public void setDisableEndTimeUpdates(Boolean disableEndTimeUpdates) {
    this.disableEndTimeUpdates = disableEndTimeUpdates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WrapupInput wrapupInput = (WrapupInput) o;

    return Objects.equals(this.code, wrapupInput.code) &&
            Objects.equals(this.name, wrapupInput.name) &&
            Objects.equals(this.notes, wrapupInput.notes) &&
            Objects.equals(this.tags, wrapupInput.tags) &&
            Objects.equals(this.durationSeconds, wrapupInput.durationSeconds) &&
            Objects.equals(this.endTime, wrapupInput.endTime) &&
            Objects.equals(this.provisional, wrapupInput.provisional) &&
            Objects.equals(this.disableEndTimeUpdates, wrapupInput.disableEndTimeUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, notes, tags, durationSeconds, endTime, provisional, disableEndTimeUpdates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapupInput {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    provisional: ").append(toIndentedString(provisional)).append("\n");
    sb.append("    disableEndTimeUpdates: ").append(toIndentedString(disableEndTimeUpdates)).append("\n");
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

