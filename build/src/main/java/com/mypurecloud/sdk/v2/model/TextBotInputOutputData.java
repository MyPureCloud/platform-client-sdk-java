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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Input/Output data related to a bot flow which is exiting gracefully.
 */
@ApiModel(description = "Input/Output data related to a bot flow which is exiting gracefully.")

public class TextBotInputOutputData  implements Serializable {
  
  private Map<String, Object> variables = null;

  
  /**
   * The input/output variables using the format as appropriate for the variable data type in the flow definition.
   **/
  public TextBotInputOutputData variables(Map<String, Object> variables) {
    this.variables = variables;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The input/output variables using the format as appropriate for the variable data type in the flow definition.")
  @JsonProperty("variables")
  public Map<String, Object> getVariables() {
    return variables;
  }
  public void setVariables(Map<String, Object> variables) {
    this.variables = variables;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotInputOutputData textBotInputOutputData = (TextBotInputOutputData) o;
    return Objects.equals(this.variables, textBotInputOutputData.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotInputOutputData {\n");
    
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

