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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WebDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Details about the active configuration on a deployment
 */
@ApiModel(description = "Details about the active configuration on a deployment")

public class WebDeploymentActiveConfigurationOnDeployment  implements Serializable {
  
  private WebDeploymentConfigurationVersion configurationVersion = null;
  private WebDeployment deployment = null;

  
  /**
   * The active configuration on a deployment
   **/
  public WebDeploymentActiveConfigurationOnDeployment configurationVersion(WebDeploymentConfigurationVersion configurationVersion) {
    this.configurationVersion = configurationVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The active configuration on a deployment")
  @JsonProperty("configurationVersion")
  public WebDeploymentConfigurationVersion getConfigurationVersion() {
    return configurationVersion;
  }
  public void setConfigurationVersion(WebDeploymentConfigurationVersion configurationVersion) {
    this.configurationVersion = configurationVersion;
  }


  /**
   * The web deployment associated with the active configuration
   **/
  public WebDeploymentActiveConfigurationOnDeployment deployment(WebDeployment deployment) {
    this.deployment = deployment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The web deployment associated with the active configuration")
  @JsonProperty("deployment")
  public WebDeployment getDeployment() {
    return deployment;
  }
  public void setDeployment(WebDeployment deployment) {
    this.deployment = deployment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentActiveConfigurationOnDeployment webDeploymentActiveConfigurationOnDeployment = (WebDeploymentActiveConfigurationOnDeployment) o;

    return Objects.equals(this.configurationVersion, webDeploymentActiveConfigurationOnDeployment.configurationVersion) &&
            Objects.equals(this.deployment, webDeploymentActiveConfigurationOnDeployment.deployment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationVersion, deployment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentActiveConfigurationOnDeployment {\n");
    
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
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

