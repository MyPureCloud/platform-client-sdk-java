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
import com.mypurecloud.sdk.v2.model.RequestContext;
import com.mypurecloud.sdk.v2.model.RequestExternalSegment;
import com.mypurecloud.sdk.v2.model.RequestJourney;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneySegmentRequest
 */

public class JourneySegmentRequest  implements Serializable {
  
  private Boolean isActive = null;
  private String displayName = null;
  private Integer version = null;
  private String description = null;
  private String color = null;
  private Boolean shouldDisplayToAgent = null;
  private RequestContext context = null;
  private RequestJourney journey = null;
  private RequestExternalSegment externalSegment = null;
  private Integer assignmentExpirationDays = null;

  public JourneySegmentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether or not the segment is active.
   **/
  public JourneySegmentRequest isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the segment is active.")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  /**
   * The display name of the segment.
   **/
  public JourneySegmentRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The display name of the segment.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * The version of the segment.
   **/
  public JourneySegmentRequest version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the segment.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * A description of the segment.
   **/
  public JourneySegmentRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the segment.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The hexadecimal color value of the segment.
   **/
  public JourneySegmentRequest color(String color) {
    this.color = color;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The hexadecimal color value of the segment.")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }


  /**
   * Whether or not the segment should be displayed to agent/supervisor users.
   **/
  public JourneySegmentRequest shouldDisplayToAgent(Boolean shouldDisplayToAgent) {
    this.shouldDisplayToAgent = shouldDisplayToAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the segment should be displayed to agent/supervisor users.")
  @JsonProperty("shouldDisplayToAgent")
  public Boolean getShouldDisplayToAgent() {
    return shouldDisplayToAgent;
  }
  public void setShouldDisplayToAgent(Boolean shouldDisplayToAgent) {
    this.shouldDisplayToAgent = shouldDisplayToAgent;
  }


  /**
   * The context of the segment.
   **/
  public JourneySegmentRequest context(RequestContext context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The context of the segment.")
  @JsonProperty("context")
  public RequestContext getContext() {
    return context;
  }
  public void setContext(RequestContext context) {
    this.context = context;
  }


  /**
   * The pattern of rules defining the segment.
   **/
  public JourneySegmentRequest journey(RequestJourney journey) {
    this.journey = journey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The pattern of rules defining the segment.")
  @JsonProperty("journey")
  public RequestJourney getJourney() {
    return journey;
  }
  public void setJourney(RequestJourney journey) {
    this.journey = journey;
  }


  /**
   * Details of an entity corresponding to this segment in an external system.
   **/
  public JourneySegmentRequest externalSegment(RequestExternalSegment externalSegment) {
    this.externalSegment = externalSegment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of an entity corresponding to this segment in an external system.")
  @JsonProperty("externalSegment")
  public RequestExternalSegment getExternalSegment() {
    return externalSegment;
  }
  public void setExternalSegment(RequestExternalSegment externalSegment) {
    this.externalSegment = externalSegment;
  }


  /**
   * Time, in days, from when the segment is assigned until it is automatically unassigned.
   **/
  public JourneySegmentRequest assignmentExpirationDays(Integer assignmentExpirationDays) {
    this.assignmentExpirationDays = assignmentExpirationDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time, in days, from when the segment is assigned until it is automatically unassigned.")
  @JsonProperty("assignmentExpirationDays")
  public Integer getAssignmentExpirationDays() {
    return assignmentExpirationDays;
  }
  public void setAssignmentExpirationDays(Integer assignmentExpirationDays) {
    this.assignmentExpirationDays = assignmentExpirationDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneySegmentRequest journeySegmentRequest = (JourneySegmentRequest) o;

    return Objects.equals(this.isActive, journeySegmentRequest.isActive) &&
            Objects.equals(this.displayName, journeySegmentRequest.displayName) &&
            Objects.equals(this.version, journeySegmentRequest.version) &&
            Objects.equals(this.description, journeySegmentRequest.description) &&
            Objects.equals(this.color, journeySegmentRequest.color) &&
            Objects.equals(this.shouldDisplayToAgent, journeySegmentRequest.shouldDisplayToAgent) &&
            Objects.equals(this.context, journeySegmentRequest.context) &&
            Objects.equals(this.journey, journeySegmentRequest.journey) &&
            Objects.equals(this.externalSegment, journeySegmentRequest.externalSegment) &&
            Objects.equals(this.assignmentExpirationDays, journeySegmentRequest.assignmentExpirationDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, displayName, version, description, color, shouldDisplayToAgent, context, journey, externalSegment, assignmentExpirationDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySegmentRequest {\n");
    
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    shouldDisplayToAgent: ").append(toIndentedString(shouldDisplayToAgent)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    journey: ").append(toIndentedString(journey)).append("\n");
    sb.append("    externalSegment: ").append(toIndentedString(externalSegment)).append("\n");
    sb.append("    assignmentExpirationDays: ").append(toIndentedString(assignmentExpirationDays)).append("\n");
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

