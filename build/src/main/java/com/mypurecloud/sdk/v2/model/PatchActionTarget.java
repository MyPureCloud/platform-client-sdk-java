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
import com.mypurecloud.sdk.v2.model.ServiceLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PatchActionTarget
 */

public class PatchActionTarget  implements Serializable {
  
  private String id = null;
  private String name = null;
  private ServiceLevel serviceLevel = null;
  private Integer shortAbandonThreshold = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public PatchActionTarget name(String name) {
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
   * Service Level of the action target. Chat offers for the target will be throttled with the aim of achieving this service level.
   **/
  public PatchActionTarget serviceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service Level of the action target. Chat offers for the target will be throttled with the aim of achieving this service level.")
  @JsonProperty("serviceLevel")
  public ServiceLevel getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  
  /**
   * Indicates the non-default short abandon threshold
   **/
  public PatchActionTarget shortAbandonThreshold(Integer shortAbandonThreshold) {
    this.shortAbandonThreshold = shortAbandonThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the non-default short abandon threshold")
  @JsonProperty("shortAbandonThreshold")
  public Integer getShortAbandonThreshold() {
    return shortAbandonThreshold;
  }
  public void setShortAbandonThreshold(Integer shortAbandonThreshold) {
    this.shortAbandonThreshold = shortAbandonThreshold;
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
    PatchActionTarget patchActionTarget = (PatchActionTarget) o;
    return Objects.equals(this.id, patchActionTarget.id) &&
        Objects.equals(this.name, patchActionTarget.name) &&
        Objects.equals(this.serviceLevel, patchActionTarget.serviceLevel) &&
        Objects.equals(this.shortAbandonThreshold, patchActionTarget.shortAbandonThreshold) &&
        Objects.equals(this.selfUri, patchActionTarget.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, serviceLevel, shortAbandonThreshold, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchActionTarget {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    shortAbandonThreshold: ").append(toIndentedString(shortAbandonThreshold)).append("\n");
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

