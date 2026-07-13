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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DecisionTableSnapshot
 */

public class DecisionTableSnapshot  implements Serializable {
  
  private String name = null;
  private String notes = null;
  private Date dateCreated = null;
  private AddressableEntityRef createdBy = null;

  public DecisionTableSnapshot() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DecisionTableSnapshot(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Snapshot name
   **/
  public DecisionTableSnapshot name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Snapshot name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Optional snapshot notes
   **/
  public DecisionTableSnapshot notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional snapshot notes")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  @ApiModelProperty(example = "null", value = "UTC date time when the snapshot was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The user who created the snapshot.")
  @JsonProperty("createdBy")
  public AddressableEntityRef getCreatedBy() {
    return createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableSnapshot decisionTableSnapshot = (DecisionTableSnapshot) o;

    return Objects.equals(this.name, decisionTableSnapshot.name) &&
            Objects.equals(this.notes, decisionTableSnapshot.notes) &&
            Objects.equals(this.dateCreated, decisionTableSnapshot.dateCreated) &&
            Objects.equals(this.createdBy, decisionTableSnapshot.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, notes, dateCreated, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableSnapshot {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

