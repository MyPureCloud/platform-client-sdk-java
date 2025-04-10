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
import com.mypurecloud.sdk.v2.model.BusinessUnitSettingsResponse;
import com.mypurecloud.sdk.v2.model.DivisionReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BusinessUnitResponse
 */

public class BusinessUnitResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private BusinessUnitSettingsResponse settings = null;
  private DivisionReference division = null;
  private String selfUri = null;

  public BusinessUnitResponse() {
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
  public BusinessUnitResponse name(String name) {
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
   * Settings for this business unit
   **/
  public BusinessUnitResponse settings(BusinessUnitSettingsResponse settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this business unit")
  @JsonProperty("settings")
  public BusinessUnitSettingsResponse getSettings() {
    return settings;
  }
  public void setSettings(BusinessUnitSettingsResponse settings) {
    this.settings = settings;
  }


  /**
   * The division to which this entity belongs.
   **/
  public BusinessUnitResponse division(DivisionReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public DivisionReference getDivision() {
    return division;
  }
  public void setDivision(DivisionReference division) {
    this.division = division;
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
    BusinessUnitResponse businessUnitResponse = (BusinessUnitResponse) o;

    return Objects.equals(this.id, businessUnitResponse.id) &&
            Objects.equals(this.name, businessUnitResponse.name) &&
            Objects.equals(this.settings, businessUnitResponse.settings) &&
            Objects.equals(this.division, businessUnitResponse.division) &&
            Objects.equals(this.selfUri, businessUnitResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, settings, division, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessUnitResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
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

