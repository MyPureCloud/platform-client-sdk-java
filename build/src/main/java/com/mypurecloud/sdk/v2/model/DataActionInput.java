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

import java.io.Serializable;
/**
 * DataActionInput
 */

public class DataActionInput  implements Serializable {
  
  private String parameterName = null;
  private String variableName = null;

  public DataActionInput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DataActionInput(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the data action input parameter to map a guide variable to.
   **/
  public DataActionInput parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the data action input parameter to map a guide variable to.")
  @JsonProperty("parameterName")
  public String getParameterName() {
    return parameterName;
  }
  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  /**
   * The guide variable whose value will be passed as the input to the paired data action parameter.
   **/
  public DataActionInput variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The guide variable whose value will be passed as the input to the paired data action parameter.")
  @JsonProperty("variableName")
  public String getVariableName() {
    return variableName;
  }
  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataActionInput dataActionInput = (DataActionInput) o;

    return Objects.equals(this.parameterName, dataActionInput.parameterName) &&
            Objects.equals(this.variableName, dataActionInput.variableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName, variableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataActionInput {\n");
    
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
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

