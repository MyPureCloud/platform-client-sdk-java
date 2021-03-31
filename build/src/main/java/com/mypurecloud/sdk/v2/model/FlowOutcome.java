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
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.WritableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FlowOutcome
 */

public class FlowOutcome  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WritableDivision division = null;
  private String description = null;
  private Operation currentOperation = null;
  private String selfUri = null;

  
  /**
   * The flow outcome identifier
   **/
  public FlowOutcome id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow outcome identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The flow outcome name.
   **/
  public FlowOutcome name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flow outcome name.")
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
  public FlowOutcome division(WritableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public WritableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableDivision division) {
    this.division = division;
  }

  
  /**
   **/
  public FlowOutcome description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public FlowOutcome currentOperation(Operation currentOperation) {
    this.currentOperation = currentOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentOperation")
  public Operation getCurrentOperation() {
    return currentOperation;
  }
  public void setCurrentOperation(Operation currentOperation) {
    this.currentOperation = currentOperation;
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
    FlowOutcome flowOutcome = (FlowOutcome) o;
    return Objects.equals(this.id, flowOutcome.id) &&
        Objects.equals(this.name, flowOutcome.name) &&
        Objects.equals(this.division, flowOutcome.division) &&
        Objects.equals(this.description, flowOutcome.description) &&
        Objects.equals(this.currentOperation, flowOutcome.currentOperation) &&
        Objects.equals(this.selfUri, flowOutcome.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, currentOperation, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowOutcome {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currentOperation: ").append(toIndentedString(currentOperation)).append("\n");
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

