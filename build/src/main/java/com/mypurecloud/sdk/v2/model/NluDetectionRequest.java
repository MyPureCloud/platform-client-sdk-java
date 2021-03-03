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
import com.mypurecloud.sdk.v2.model.NluDetectionContext;
import com.mypurecloud.sdk.v2.model.NluDetectionInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * NluDetectionRequest
 */

public class NluDetectionRequest  implements Serializable {
  
  private NluDetectionInput input = null;
  private NluDetectionContext context = null;

  
  /**
   * The input subject to NLU detection.
   **/
  public NluDetectionRequest input(NluDetectionInput input) {
    this.input = input;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The input subject to NLU detection.")
  @JsonProperty("input")
  public NluDetectionInput getInput() {
    return input;
  }
  public void setInput(NluDetectionInput input) {
    this.input = input;
  }

  
  /**
   * The context for the input to NLU detection.
   **/
  public NluDetectionRequest context(NluDetectionContext context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The context for the input to NLU detection.")
  @JsonProperty("context")
  public NluDetectionContext getContext() {
    return context;
  }
  public void setContext(NluDetectionContext context) {
    this.context = context;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluDetectionRequest nluDetectionRequest = (NluDetectionRequest) o;
    return Objects.equals(this.input, nluDetectionRequest.input) &&
        Objects.equals(this.context, nluDetectionRequest.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluDetectionRequest {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

