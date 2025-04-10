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
import com.mypurecloud.sdk.v2.model.FlowVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebDeploymentFlowEntityRef
 */

public class WebDeploymentFlowEntityRef  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String selfUri = null;
  private String flowDescription = null;
  private FlowVersion publishVersion = null;

  public WebDeploymentFlowEntityRef() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Flow ID
   **/
  public WebDeploymentFlowEntityRef id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Flow ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The Flow name
   **/
  public WebDeploymentFlowEntityRef name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Flow name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public WebDeploymentFlowEntityRef selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   * The flow description for the webdeployment
   **/
  public WebDeploymentFlowEntityRef flowDescription(String flowDescription) {
    this.flowDescription = flowDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow description for the webdeployment")
  @JsonProperty("flowDescription")
  public String getFlowDescription() {
    return flowDescription;
  }
  public void setFlowDescription(String flowDescription) {
    this.flowDescription = flowDescription;
  }


  /**
   * The published config version for the associated deployment
   **/
  public WebDeploymentFlowEntityRef publishVersion(FlowVersion publishVersion) {
    this.publishVersion = publishVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The published config version for the associated deployment")
  @JsonProperty("publishVersion")
  public FlowVersion getPublishVersion() {
    return publishVersion;
  }
  public void setPublishVersion(FlowVersion publishVersion) {
    this.publishVersion = publishVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentFlowEntityRef webDeploymentFlowEntityRef = (WebDeploymentFlowEntityRef) o;

    return Objects.equals(this.id, webDeploymentFlowEntityRef.id) &&
            Objects.equals(this.name, webDeploymentFlowEntityRef.name) &&
            Objects.equals(this.selfUri, webDeploymentFlowEntityRef.selfUri) &&
            Objects.equals(this.flowDescription, webDeploymentFlowEntityRef.flowDescription) &&
            Objects.equals(this.publishVersion, webDeploymentFlowEntityRef.publishVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, flowDescription, publishVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentFlowEntityRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    flowDescription: ").append(toIndentedString(flowDescription)).append("\n");
    sb.append("    publishVersion: ").append(toIndentedString(publishVersion)).append("\n");
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

