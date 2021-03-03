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

import java.io.Serializable;
/**
 * Response object from launching a flow.
 */
@ApiModel(description = "Response object from launching a flow.")

public class FlowExecutionLaunchResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private DomainEntityRef flowVersion = null;
  private String selfUri = null;

  
  /**
   * The flow execution ID
   **/
  public FlowExecutionLaunchResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow execution ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The flow execution name.
   **/
  public FlowExecutionLaunchResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow execution name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The version of the flow that launched
   **/
  public FlowExecutionLaunchResponse flowVersion(DomainEntityRef flowVersion) {
    this.flowVersion = flowVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the flow that launched")
  @JsonProperty("flowVersion")
  public DomainEntityRef getFlowVersion() {
    return flowVersion;
  }
  public void setFlowVersion(DomainEntityRef flowVersion) {
    this.flowVersion = flowVersion;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowExecutionLaunchResponse flowExecutionLaunchResponse = (FlowExecutionLaunchResponse) o;
    return Objects.equals(this.id, flowExecutionLaunchResponse.id) &&
        Objects.equals(this.name, flowExecutionLaunchResponse.name) &&
        Objects.equals(this.flowVersion, flowExecutionLaunchResponse.flowVersion) &&
        Objects.equals(this.selfUri, flowExecutionLaunchResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, flowVersion, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowExecutionLaunchResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

