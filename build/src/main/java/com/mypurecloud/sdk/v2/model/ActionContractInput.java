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
import com.mypurecloud.sdk.v2.model.PostInputContract;
import com.mypurecloud.sdk.v2.model.PostOutputContract;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Contract definition.
 */
@ApiModel(description = "Contract definition.")

public class ActionContractInput  implements Serializable {
  
  private PostInputContract input = null;
  private PostOutputContract output = null;

  
  /**
   * Execution input contract
   **/
  public ActionContractInput input(PostInputContract input) {
    this.input = input;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Execution input contract")
  @JsonProperty("input")
  public PostInputContract getInput() {
    return input;
  }
  public void setInput(PostInputContract input) {
    this.input = input;
  }

  
  /**
   * Execution output contract
   **/
  public ActionContractInput output(PostOutputContract output) {
    this.output = output;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Execution output contract")
  @JsonProperty("output")
  public PostOutputContract getOutput() {
    return output;
  }
  public void setOutput(PostOutputContract output) {
    this.output = output;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionContractInput actionContractInput = (ActionContractInput) o;
    return Objects.equals(this.input, actionContractInput.input) &&
        Objects.equals(this.output, actionContractInput.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionContractInput {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

