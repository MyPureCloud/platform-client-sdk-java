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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AuthzDivision
 */

public class AuthzDivision  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean homeDivision = null;
  private Map<String, Long> objectCounts = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public AuthzDivision name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A helpful description for the division.
   **/
  public AuthzDivision description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A helpful description for the division.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  @ApiModelProperty(example = "null", value = "A flag indicating whether this division is the \"Home\" (default) division. Cannot be modified and any supplied value will be ignored on create or update.")
  @JsonProperty("homeDivision")
  public Boolean getHomeDivision() {
    return homeDivision;
  }

  
  @ApiModelProperty(example = "null", value = "A count of objects in this division, grouped by type.")
  @JsonProperty("objectCounts")
  public Map<String, Long> getObjectCounts() {
    return objectCounts;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthzDivision authzDivision = (AuthzDivision) o;
    return Objects.equals(this.id, authzDivision.id) &&
        Objects.equals(this.name, authzDivision.name) &&
        Objects.equals(this.description, authzDivision.description) &&
        Objects.equals(this.homeDivision, authzDivision.homeDivision) &&
        Objects.equals(this.objectCounts, authzDivision.objectCounts) &&
        Objects.equals(this.selfUri, authzDivision.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, homeDivision, objectCounts, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthzDivision {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    homeDivision: ").append(toIndentedString(homeDivision)).append("\n");
    sb.append("    objectCounts: ").append(toIndentedString(objectCounts)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

