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
import com.mypurecloud.sdk.v2.model.NluDetectionInput;
import com.mypurecloud.sdk.v2.model.NluDetectionOutput;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * NluDetectionResponse
 */

public class NluDetectionResponse  implements Serializable {
  
  private NluDomainVersion version = null;
  private NluDetectionOutput output = null;
  private NluDetectionInput input = null;

  
  @ApiModelProperty(example = "null", value = "The NLU domain version which performed the detection.")
  @JsonProperty("version")
  public NluDomainVersion getVersion() {
    return version;
  }

  
  /**
   **/
  public NluDetectionResponse output(NluDetectionOutput output) {
    this.output = output;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("output")
  public NluDetectionOutput getOutput() {
    return output;
  }
  public void setOutput(NluDetectionOutput output) {
    this.output = output;
  }

  
  /**
   **/
  public NluDetectionResponse input(NluDetectionInput input) {
    this.input = input;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("input")
  public NluDetectionInput getInput() {
    return input;
  }
  public void setInput(NluDetectionInput input) {
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
    NluDetectionResponse nluDetectionResponse = (NluDetectionResponse) o;
    return Objects.equals(this.version, nluDetectionResponse.version) &&
        Objects.equals(this.output, nluDetectionResponse.output) &&
        Objects.equals(this.input, nluDetectionResponse.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, output, input);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluDetectionResponse {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

