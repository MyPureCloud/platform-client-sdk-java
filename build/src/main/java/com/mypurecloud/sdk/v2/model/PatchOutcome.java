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
import com.mypurecloud.sdk.v2.model.AssociatedValueField;
import com.mypurecloud.sdk.v2.model.Context;
import com.mypurecloud.sdk.v2.model.Journey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * PatchOutcome
 */

public class PatchOutcome  implements Serializable {
  
  private String id = null;
  private Boolean isActive = null;
  private String displayName = null;
  private Integer version = null;
  private String description = null;
  private Boolean isPositive = null;
  private Context context = null;
  private Journey journey = null;
  private AssociatedValueField associatedValueField = null;
  private String selfUri = null;
  private Date createdDate = null;
  private Date modifiedDate = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Whether or not the outcome is active.
   **/
  public PatchOutcome isActive(Boolean isActive) {
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
  public PatchOutcome displayName(String displayName) {
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
  public PatchOutcome version(Integer version) {
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
  public PatchOutcome description(String description) {
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
  public PatchOutcome isPositive(Boolean isPositive) {
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
  public PatchOutcome context(Context context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The context of the outcome.")
  @JsonProperty("context")
  public Context getContext() {
    return context;
  }
  public void setContext(Context context) {
    this.context = context;
  }

  
  /**
   * The pattern of rules defining the filter of the outcome.
   **/
  public PatchOutcome journey(Journey journey) {
    this.journey = journey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pattern of rules defining the filter of the outcome.")
  @JsonProperty("journey")
  public Journey getJourney() {
    return journey;
  }
  public void setJourney(Journey journey) {
    this.journey = journey;
  }

  
  /**
   * The field from the event indicating the associated value.
   **/
  public PatchOutcome associatedValueField(AssociatedValueField associatedValueField) {
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

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * Timestamp indicating when the outcome was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PatchOutcome createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the outcome was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * Timestamp indicating when the outcome was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PatchOutcome modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the outcome was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchOutcome patchOutcome = (PatchOutcome) o;
    return Objects.equals(this.id, patchOutcome.id) &&
        Objects.equals(this.isActive, patchOutcome.isActive) &&
        Objects.equals(this.displayName, patchOutcome.displayName) &&
        Objects.equals(this.version, patchOutcome.version) &&
        Objects.equals(this.description, patchOutcome.description) &&
        Objects.equals(this.isPositive, patchOutcome.isPositive) &&
        Objects.equals(this.context, patchOutcome.context) &&
        Objects.equals(this.journey, patchOutcome.journey) &&
        Objects.equals(this.associatedValueField, patchOutcome.associatedValueField) &&
        Objects.equals(this.selfUri, patchOutcome.selfUri) &&
        Objects.equals(this.createdDate, patchOutcome.createdDate) &&
        Objects.equals(this.modifiedDate, patchOutcome.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isActive, displayName, version, description, isPositive, context, journey, associatedValueField, selfUri, createdDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchOutcome {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isPositive: ").append(toIndentedString(isPositive)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    journey: ").append(toIndentedString(journey)).append("\n");
    sb.append("    associatedValueField: ").append(toIndentedString(associatedValueField)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

