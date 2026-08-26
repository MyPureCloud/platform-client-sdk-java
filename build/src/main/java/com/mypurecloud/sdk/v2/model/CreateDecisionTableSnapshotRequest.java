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

import java.io.Serializable;
/**
 * CreateDecisionTableSnapshotRequest
 */

public class CreateDecisionTableSnapshotRequest  implements Serializable {
  
  private String snapshotName = null;
  private String notes = null;

  public CreateDecisionTableSnapshotRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CreateDecisionTableSnapshotRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Display name for the snapshot
   **/
  public CreateDecisionTableSnapshotRequest snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Display name for the snapshot")
  @JsonProperty("snapshotName")
  public String getSnapshotName() {
    return snapshotName;
  }
  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }


  /**
   * Optional notes for the snapshot
   **/
  public CreateDecisionTableSnapshotRequest notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional notes for the snapshot")
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
    CreateDecisionTableSnapshotRequest createDecisionTableSnapshotRequest = (CreateDecisionTableSnapshotRequest) o;

    return Objects.equals(this.snapshotName, createDecisionTableSnapshotRequest.snapshotName) &&
            Objects.equals(this.notes, createDecisionTableSnapshotRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotName, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDecisionTableSnapshotRequest {\n");
    
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
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

