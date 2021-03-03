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
import com.mypurecloud.sdk.v2.model.ActionInput;
import com.mypurecloud.sdk.v2.model.ActionOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * This resource contains all of the schemas needed to define the inputs and outputs, of a single Action.
 */
@ApiModel(description = "This resource contains all of the schemas needed to define the inputs and outputs, of a single Action.")

public class ActionContract  implements Serializable {
  
  private ActionOutput output = null;
  private ActionInput input = null;

  
  /**
   * The output to expect when executing this action.
   **/
  public ActionContract output(ActionOutput output) {
    this.output = output;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The output to expect when executing this action.")
  @JsonProperty("output")
  public ActionOutput getOutput() {
    return output;
  }
  public void setOutput(ActionOutput output) {
    this.output = output;
  }

  
  /**
   * The input required when executing this action.
   **/
  public ActionContract input(ActionInput input) {
    this.input = input;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The input required when executing this action.")
  @JsonProperty("input")
  public ActionInput getInput() {
    return input;
  }
  public void setInput(ActionInput input) {
    this.input = input;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionContract actionContract = (ActionContract) o;
    return Objects.equals(this.output, actionContract.output) &&
        Objects.equals(this.input, actionContract.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output, input);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionContract {\n");
    
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

