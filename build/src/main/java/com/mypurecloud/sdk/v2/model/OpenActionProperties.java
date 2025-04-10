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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * OpenActionProperties
 */

public class OpenActionProperties  implements Serializable {
  
  private String openActionName = null;
  private Map<String, Object> configurationFields = null;

  public OpenActionProperties() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The specific type of the open action.
   **/
  public OpenActionProperties openActionName(String openActionName) {
    this.openActionName = openActionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The specific type of the open action.")
  @JsonProperty("openActionName")
  public String getOpenActionName() {
    return openActionName;
  }
  public void setOpenActionName(String openActionName) {
    this.openActionName = openActionName;
  }


  /**
   * Custom fields defined in the schema referenced by the open action type selected.
   **/
  public OpenActionProperties configurationFields(Map<String, Object> configurationFields) {
    this.configurationFields = configurationFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom fields defined in the schema referenced by the open action type selected.")
  @JsonProperty("configurationFields")
  public Map<String, Object> getConfigurationFields() {
    return configurationFields;
  }
  public void setConfigurationFields(Map<String, Object> configurationFields) {
    this.configurationFields = configurationFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenActionProperties openActionProperties = (OpenActionProperties) o;

    return Objects.equals(this.openActionName, openActionProperties.openActionName) &&
            Objects.equals(this.configurationFields, openActionProperties.configurationFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openActionName, configurationFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenActionProperties {\n");
    
    sb.append("    openActionName: ").append(toIndentedString(openActionName)).append("\n");
    sb.append("    configurationFields: ").append(toIndentedString(configurationFields)).append("\n");
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

