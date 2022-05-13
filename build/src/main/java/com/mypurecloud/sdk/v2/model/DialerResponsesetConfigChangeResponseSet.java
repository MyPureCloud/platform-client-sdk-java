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
import com.mypurecloud.sdk.v2.model.DialerResponsesetConfigChangeReaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerResponsesetConfigChangeResponseSet
 */

public class DialerResponsesetConfigChangeResponseSet  implements Serializable {
  
  private Map<String, DialerResponsesetConfigChangeReaction> responses = null;
  private Boolean beepDetectionEnabled = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;

  
  /**
   * Map of disposition identifiers to reactions. For example: {\"disposition.classification.callable.person\": {\"reactionType\": \"transfer\"}}
   **/
  public DialerResponsesetConfigChangeResponseSet responses(Map<String, DialerResponsesetConfigChangeReaction> responses) {
    this.responses = responses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of disposition identifiers to reactions. For example: {\"disposition.classification.callable.person\": {\"reactionType\": \"transfer\"}}")
  @JsonProperty("responses")
  public Map<String, DialerResponsesetConfigChangeReaction> getResponses() {
    return responses;
  }
  public void setResponses(Map<String, DialerResponsesetConfigChangeReaction> responses) {
    this.responses = responses;
  }


  /**
   * When beep detection is enabled, answering machine detection will wait for the beep before transferring the call
   **/
  public DialerResponsesetConfigChangeResponseSet beepDetectionEnabled(Boolean beepDetectionEnabled) {
    this.beepDetectionEnabled = beepDetectionEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When beep detection is enabled, answering machine detection will wait for the beep before transferring the call")
  @JsonProperty("beepDetectionEnabled")
  public Boolean getBeepDetectionEnabled() {
    return beepDetectionEnabled;
  }
  public void setBeepDetectionEnabled(Boolean beepDetectionEnabled) {
    this.beepDetectionEnabled = beepDetectionEnabled;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public DialerResponsesetConfigChangeResponseSet id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The UI-visible name of the object
   **/
  public DialerResponsesetConfigChangeResponseSet name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UI-visible name of the object")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Creation time of the entity
   **/
  public DialerResponsesetConfigChangeResponseSet dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation time of the entity")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Last modified time of the entity
   **/
  public DialerResponsesetConfigChangeResponseSet dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DialerResponsesetConfigChangeResponseSet version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerResponsesetConfigChangeResponseSet dialerResponsesetConfigChangeResponseSet = (DialerResponsesetConfigChangeResponseSet) o;

    return Objects.equals(this.responses, dialerResponsesetConfigChangeResponseSet.responses) &&
            Objects.equals(this.beepDetectionEnabled, dialerResponsesetConfigChangeResponseSet.beepDetectionEnabled) &&
            Objects.equals(this.id, dialerResponsesetConfigChangeResponseSet.id) &&
            Objects.equals(this.name, dialerResponsesetConfigChangeResponseSet.name) &&
            Objects.equals(this.dateCreated, dialerResponsesetConfigChangeResponseSet.dateCreated) &&
            Objects.equals(this.dateModified, dialerResponsesetConfigChangeResponseSet.dateModified) &&
            Objects.equals(this.version, dialerResponsesetConfigChangeResponseSet.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses, beepDetectionEnabled, id, name, dateCreated, dateModified, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerResponsesetConfigChangeResponseSet {\n");
    
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    beepDetectionEnabled: ").append(toIndentedString(beepDetectionEnabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

