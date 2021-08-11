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

import java.io.Serializable;
/**
 * WebDeploymentConfigurationVersionEntityRef
 */

public class WebDeploymentConfigurationVersionEntityRef  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String selfUri = null;
  private String version = null;

  
  /**
   * The configuration version ID
   **/
  public WebDeploymentConfigurationVersionEntityRef id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The configuration version ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The configuration version name
   **/
  public WebDeploymentConfigurationVersionEntityRef name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration version name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public WebDeploymentConfigurationVersionEntityRef selfUri(String selfUri) {
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
   * The version of the configuration
   **/
  public WebDeploymentConfigurationVersionEntityRef version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "DRAFT, 1, 2", required = true, value = "The version of the configuration")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentConfigurationVersionEntityRef webDeploymentConfigurationVersionEntityRef = (WebDeploymentConfigurationVersionEntityRef) o;
    return Objects.equals(this.id, webDeploymentConfigurationVersionEntityRef.id) &&
        Objects.equals(this.name, webDeploymentConfigurationVersionEntityRef.name) &&
        Objects.equals(this.selfUri, webDeploymentConfigurationVersionEntityRef.selfUri) &&
        Objects.equals(this.version, webDeploymentConfigurationVersionEntityRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentConfigurationVersionEntityRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

