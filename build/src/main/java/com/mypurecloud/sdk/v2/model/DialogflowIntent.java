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
import com.mypurecloud.sdk.v2.model.DialogflowParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialogflowIntent
 */

public class DialogflowIntent  implements Serializable {
  
  private String name = null;
  private Map<String, DialogflowParameter> parameters = null;

  
  /**
   * The intent name
   **/
  public DialogflowIntent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The intent name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * An object mapping parameter names to Parameter objects
   **/
  public DialogflowIntent parameters(Map<String, DialogflowParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An object mapping parameter names to Parameter objects")
  @JsonProperty("parameters")
  public Map<String, DialogflowParameter> getParameters() {
    return parameters;
  }
  public void setParameters(Map<String, DialogflowParameter> parameters) {
    this.parameters = parameters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialogflowIntent dialogflowIntent = (DialogflowIntent) o;
    return Objects.equals(this.name, dialogflowIntent.name) &&
        Objects.equals(this.parameters, dialogflowIntent.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogflowIntent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

