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
import com.mypurecloud.sdk.v2.model.ManagementUnitSettingsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateManagementUnitRequest
 */

public class UpdateManagementUnitRequest  implements Serializable {
  
  private String name = null;
  private String divisionId = null;
  private ManagementUnitSettingsRequest settings = null;

  
  /**
   * The new name of the management unit
   **/
  public UpdateManagementUnitRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new name of the management unit")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The new division id for the management unit
   **/
  public UpdateManagementUnitRequest divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new division id for the management unit")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  
  /**
   * Updated settings for the management unit
   **/
  public UpdateManagementUnitRequest settings(ManagementUnitSettingsRequest settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Updated settings for the management unit")
  @JsonProperty("settings")
  public ManagementUnitSettingsRequest getSettings() {
    return settings;
  }
  public void setSettings(ManagementUnitSettingsRequest settings) {
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
    UpdateManagementUnitRequest updateManagementUnitRequest = (UpdateManagementUnitRequest) o;
    return Objects.equals(this.name, updateManagementUnitRequest.name) &&
        Objects.equals(this.divisionId, updateManagementUnitRequest.divisionId) &&
        Objects.equals(this.settings, updateManagementUnitRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, divisionId, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateManagementUnitRequest {\n");
    
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

