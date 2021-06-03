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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ProgramMappingsRequest
 */

public class ProgramMappingsRequest  implements Serializable {
  
  private List<String> queueIds = new ArrayList<String>();
  private List<String> flowIds = new ArrayList<String>();

  
  /**
   * The program queues
   **/
  public ProgramMappingsRequest queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The program queues")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }

  
  /**
   * The program flows
   **/
  public ProgramMappingsRequest flowIds(List<String> flowIds) {
    this.flowIds = flowIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The program flows")
  @JsonProperty("flowIds")
  public List<String> getFlowIds() {
    return flowIds;
  }
  public void setFlowIds(List<String> flowIds) {
    this.flowIds = flowIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramMappingsRequest programMappingsRequest = (ProgramMappingsRequest) o;
    return Objects.equals(this.queueIds, programMappingsRequest.queueIds) &&
        Objects.equals(this.flowIds, programMappingsRequest.flowIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueIds, flowIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramMappingsRequest {\n");
    
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    flowIds: ").append(toIndentedString(flowIds)).append("\n");
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

