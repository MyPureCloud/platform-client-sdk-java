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
import com.mypurecloud.sdk.v2.model.Division;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecisionTableVersionEntity
 */

public class DecisionTableVersionEntity  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private Integer version = null;
  private String selfUri = null;

  public DecisionTableVersionEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public DecisionTableVersionEntity name(String name) {
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
   * The division to which this entity belongs.
   **/
  public DecisionTableVersionEntity division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }


  /**
   * The decision table version.
   **/
  public DecisionTableVersionEntity version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The decision table version.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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
    DecisionTableVersionEntity decisionTableVersionEntity = (DecisionTableVersionEntity) o;

    return Objects.equals(this.id, decisionTableVersionEntity.id) &&
            Objects.equals(this.name, decisionTableVersionEntity.name) &&
            Objects.equals(this.division, decisionTableVersionEntity.division) &&
            Objects.equals(this.version, decisionTableVersionEntity.version) &&
            Objects.equals(this.selfUri, decisionTableVersionEntity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableVersionEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

