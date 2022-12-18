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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyApp
 */

public class JourneyApp  implements Serializable {
  
  private String name = null;
  private String namespace = null;
  private String version = null;
  private String buildNumber = null;

  
  /**
   * Name of the application (e.g. mybankingapp).
   **/
  public JourneyApp name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the application (e.g. mybankingapp).")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Namespace of the application (e.g. com.genesys.bancodinero).
   **/
  public JourneyApp namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Namespace of the application (e.g. com.genesys.bancodinero).")
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  /**
   * Version of the application (e.g. 5.9.27).
   **/
  public JourneyApp version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version of the application (e.g. 5.9.27).")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Build number of the application (e.g. 701).
   **/
  public JourneyApp buildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Build number of the application (e.g. 701).")
  @JsonProperty("buildNumber")
  public String getBuildNumber() {
    return buildNumber;
  }
  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyApp journeyApp = (JourneyApp) o;

    return Objects.equals(this.name, journeyApp.name) &&
            Objects.equals(this.namespace, journeyApp.namespace) &&
            Objects.equals(this.version, journeyApp.version) &&
            Objects.equals(this.buildNumber, journeyApp.buildNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, version, buildNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyApp {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
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

