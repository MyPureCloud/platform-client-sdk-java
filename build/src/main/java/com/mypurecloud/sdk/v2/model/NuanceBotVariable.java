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
import com.mypurecloud.sdk.v2.model.ComplexVariableInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Model for a Nuance bot variable
 */
@ApiModel(description = "Model for a Nuance bot variable")

public class NuanceBotVariable  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean reserved = null;
  private String simpleVariableInfo = null;
  private ComplexVariableInfo complexGenericVariableInfo = null;

  public NuanceBotVariable() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The variable ID
   **/
  public NuanceBotVariable id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The variable display name
   **/
  public NuanceBotVariable name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable display name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The variable description
   **/
  public NuanceBotVariable description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The variable description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * True if the variable is a reserved variable
   **/
  public NuanceBotVariable reserved(Boolean reserved) {
    this.reserved = reserved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the variable is a reserved variable")
  @JsonProperty("reserved")
  public Boolean getReserved() {
    return reserved;
  }
  public void setReserved(Boolean reserved) {
    this.reserved = reserved;
  }


  /**
   * The type information for this variable
   **/
  public NuanceBotVariable simpleVariableInfo(String simpleVariableInfo) {
    this.simpleVariableInfo = simpleVariableInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type information for this variable")
  @JsonProperty("simpleVariableInfo")
  public String getSimpleVariableInfo() {
    return simpleVariableInfo;
  }
  public void setSimpleVariableInfo(String simpleVariableInfo) {
    this.simpleVariableInfo = simpleVariableInfo;
  }


  /**
   * The type information for this variable
   **/
  public NuanceBotVariable complexGenericVariableInfo(ComplexVariableInfo complexGenericVariableInfo) {
    this.complexGenericVariableInfo = complexGenericVariableInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type information for this variable")
  @JsonProperty("complexGenericVariableInfo")
  public ComplexVariableInfo getComplexGenericVariableInfo() {
    return complexGenericVariableInfo;
  }
  public void setComplexGenericVariableInfo(ComplexVariableInfo complexGenericVariableInfo) {
    this.complexGenericVariableInfo = complexGenericVariableInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NuanceBotVariable nuanceBotVariable = (NuanceBotVariable) o;

    return Objects.equals(this.id, nuanceBotVariable.id) &&
            Objects.equals(this.name, nuanceBotVariable.name) &&
            Objects.equals(this.description, nuanceBotVariable.description) &&
            Objects.equals(this.reserved, nuanceBotVariable.reserved) &&
            Objects.equals(this.simpleVariableInfo, nuanceBotVariable.simpleVariableInfo) &&
            Objects.equals(this.complexGenericVariableInfo, nuanceBotVariable.complexGenericVariableInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, reserved, simpleVariableInfo, complexGenericVariableInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NuanceBotVariable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    simpleVariableInfo: ").append(toIndentedString(simpleVariableInfo)).append("\n");
    sb.append("    complexGenericVariableInfo: ").append(toIndentedString(complexGenericVariableInfo)).append("\n");
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

