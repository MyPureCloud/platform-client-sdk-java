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
import com.mypurecloud.sdk.v2.model.UnavailableTimesTimeSpan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateUnavailableTime
 */

public class UpdateUnavailableTime  implements Serializable {
  
  private String id = null;
  private UnavailableTimesTimeSpan timeSpan = null;
  private String notes = null;
  private Boolean delete = null;

  public UpdateUnavailableTime() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the unavailable time span. Should be specified to update or delete an existing unavailable time span or set to null when creating a new one
   **/
  public UpdateUnavailableTime id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the unavailable time span. Should be specified to update or delete an existing unavailable time span or set to null when creating a new one")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Exact date, time and length of the unavailability time in granularity of minutes. Must be specified when creating a new unavailable time span
   **/
  public UpdateUnavailableTime timeSpan(UnavailableTimesTimeSpan timeSpan) {
    this.timeSpan = timeSpan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exact date, time and length of the unavailability time in granularity of minutes. Must be specified when creating a new unavailable time span")
  @JsonProperty("timeSpan")
  public UnavailableTimesTimeSpan getTimeSpan() {
    return timeSpan;
  }
  public void setTimeSpan(UnavailableTimesTimeSpan timeSpan) {
    this.timeSpan = timeSpan;
  }


  /**
   * Comments explaining the unavailability time span
   **/
  public UpdateUnavailableTime notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Comments explaining the unavailability time span")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  /**
   * Whether the unavailable time should be deleted
   **/
  public UpdateUnavailableTime delete(Boolean delete) {
    this.delete = delete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the unavailable time should be deleted")
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUnavailableTime updateUnavailableTime = (UpdateUnavailableTime) o;

    return Objects.equals(this.id, updateUnavailableTime.id) &&
            Objects.equals(this.timeSpan, updateUnavailableTime.timeSpan) &&
            Objects.equals(this.notes, updateUnavailableTime.notes) &&
            Objects.equals(this.delete, updateUnavailableTime.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeSpan, notes, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUnavailableTime {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

