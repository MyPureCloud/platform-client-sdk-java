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
import com.mypurecloud.sdk.v2.model.CreateBusinessUnitSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateBusinessUnitRequest
 */

public class CreateBusinessUnitRequest  implements Serializable {
  
  private String name = null;
  private String divisionId = null;
  private CreateBusinessUnitSettings settings = null;

  
  /**
   * The name of the business unit
   **/
  public CreateBusinessUnitRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the business unit")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The ID of the division to which the business unit should be added
   **/
  public CreateBusinessUnitRequest divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the division to which the business unit should be added")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  
  /**
   * Configuration for the business unit
   **/
  public CreateBusinessUnitRequest settings(CreateBusinessUnitSettings settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configuration for the business unit")
  @JsonProperty("settings")
  public CreateBusinessUnitSettings getSettings() {
    return settings;
  }
  public void setSettings(CreateBusinessUnitSettings settings) {
    this.settings = settings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBusinessUnitRequest createBusinessUnitRequest = (CreateBusinessUnitRequest) o;
    return Objects.equals(this.name, createBusinessUnitRequest.name) &&
        Objects.equals(this.divisionId, createBusinessUnitRequest.divisionId) &&
        Objects.equals(this.settings, createBusinessUnitRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, divisionId, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBusinessUnitRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

