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
import com.mypurecloud.sdk.v2.model.ArchitectFlowReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ValidateDetails
 */

public class ValidateDetails  implements Serializable {
  
  private ArchitectFlowReference flow = null;

  public ValidateDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ValidateDetails(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The flow to validate. If you do not provide the flow ID, you must provide both the name and type.
   **/
  public ValidateDetails flow(ArchitectFlowReference flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flow to validate. If you do not provide the flow ID, you must provide both the name and type.")
  @JsonProperty("flow")
  public ArchitectFlowReference getFlow() {
    return flow;
  }
  public void setFlow(ArchitectFlowReference flow) {
    this.flow = flow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateDetails validateDetails = (ValidateDetails) o;

    return Objects.equals(this.flow, validateDetails.flow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateDetails {\n");
    
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
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

