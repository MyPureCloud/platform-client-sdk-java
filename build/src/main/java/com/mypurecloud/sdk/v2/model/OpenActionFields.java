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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * OpenActionFields
 */

public class OpenActionFields  implements Serializable {
  
  private DomainEntityRef openAction = null;
  private Map<String, Object> configurationFields = null;

  
  /**
   * The specific type of the open action.
   **/
  public OpenActionFields openAction(DomainEntityRef openAction) {
    this.openAction = openAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The specific type of the open action.")
  @JsonProperty("openAction")
  public DomainEntityRef getOpenAction() {
    return openAction;
  }
  public void setOpenAction(DomainEntityRef openAction) {
    this.openAction = openAction;
  }

  
  /**
   * Custom fields defined in the schema referenced by the open action type selected.
   **/
  public OpenActionFields configurationFields(Map<String, Object> configurationFields) {
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
    OpenActionFields openActionFields = (OpenActionFields) o;
    return Objects.equals(this.openAction, openActionFields.openAction) &&
        Objects.equals(this.configurationFields, openActionFields.configurationFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openAction, configurationFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenActionFields {\n");
    
    sb.append("    openAction: ").append(toIndentedString(openAction)).append("\n");
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

