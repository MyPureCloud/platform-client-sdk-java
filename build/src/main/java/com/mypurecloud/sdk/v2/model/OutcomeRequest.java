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
import com.mypurecloud.sdk.v2.model.AssociatedValueField;
import com.mypurecloud.sdk.v2.model.RequestContext;
import com.mypurecloud.sdk.v2.model.RequestJourney;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutcomeRequest
 */

public class OutcomeRequest  implements Serializable {
  
  private Boolean isActive = null;
  private String displayName = null;
  private Integer version = null;
  private String description = null;
  private Boolean isPositive = null;
  private RequestContext context = null;
  private RequestJourney journey = null;
  private AssociatedValueField associatedValueField = null;

  
  /**
   * Whether or not the outcome is active.
   **/
  public OutcomeRequest isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the outcome is active.")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  /**
   * The display name of the outcome.
   **/
  public OutcomeRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The display name of the outcome.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * The version of the outcome.
   **/
  public OutcomeRequest version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the outcome.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * A description of the outcome.
   **/
  public OutcomeRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the outcome.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Whether or not the outcome is positive.
   **/
  public OutcomeRequest isPositive(Boolean isPositive) {
    this.isPositive = isPositive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the outcome is positive.")
  @JsonProperty("isPositive")
  public Boolean getIsPositive() {
    return isPositive;
  }
  public void setIsPositive(Boolean isPositive) {
    this.isPositive = isPositive;
  }


  /**
   * The context of the outcome.
   **/
  public OutcomeRequest context(RequestContext context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The context of the outcome.")
  @JsonProperty("context")
  public RequestContext getContext() {
    return context;
  }
  public void setContext(RequestContext context) {
    this.context = context;
  }


  /**
   * The pattern of rules defining the filter of the outcome.
   **/
  public OutcomeRequest journey(RequestJourney journey) {
    this.journey = journey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pattern of rules defining the filter of the outcome.")
  @JsonProperty("journey")
  public RequestJourney getJourney() {
    return journey;
  }
  public void setJourney(RequestJourney journey) {
    this.journey = journey;
  }


  /**
   * The field from the event indicating the associated value.
   **/
  public OutcomeRequest associatedValueField(AssociatedValueField associatedValueField) {
    this.associatedValueField = associatedValueField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field from the event indicating the associated value.")
  @JsonProperty("associatedValueField")
  public AssociatedValueField getAssociatedValueField() {
    return associatedValueField;
  }
  public void setAssociatedValueField(AssociatedValueField associatedValueField) {
    this.associatedValueField = associatedValueField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeRequest outcomeRequest = (OutcomeRequest) o;

    return Objects.equals(this.isActive, outcomeRequest.isActive) &&
            Objects.equals(this.displayName, outcomeRequest.displayName) &&
            Objects.equals(this.version, outcomeRequest.version) &&
            Objects.equals(this.description, outcomeRequest.description) &&
            Objects.equals(this.isPositive, outcomeRequest.isPositive) &&
            Objects.equals(this.context, outcomeRequest.context) &&
            Objects.equals(this.journey, outcomeRequest.journey) &&
            Objects.equals(this.associatedValueField, outcomeRequest.associatedValueField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, displayName, version, description, isPositive, context, journey, associatedValueField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeRequest {\n");
    
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isPositive: ").append(toIndentedString(isPositive)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    journey: ").append(toIndentedString(journey)).append("\n");
    sb.append("    associatedValueField: ").append(toIndentedString(associatedValueField)).append("\n");
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

