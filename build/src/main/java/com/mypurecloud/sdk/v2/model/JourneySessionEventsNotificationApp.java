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
 * JourneySessionEventsNotificationApp
 */

public class JourneySessionEventsNotificationApp  implements Serializable {
  
  private String name = null;
  private String namespace = null;
  private String version = null;
  private String buildNumber = null;

  
  /**
   **/
  public JourneySessionEventsNotificationApp name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public JourneySessionEventsNotificationApp namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  /**
   **/
  public JourneySessionEventsNotificationApp version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   **/
  public JourneySessionEventsNotificationApp buildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    JourneySessionEventsNotificationApp journeySessionEventsNotificationApp = (JourneySessionEventsNotificationApp) o;

    return Objects.equals(this.name, journeySessionEventsNotificationApp.name) &&
            Objects.equals(this.namespace, journeySessionEventsNotificationApp.namespace) &&
            Objects.equals(this.version, journeySessionEventsNotificationApp.version) &&
            Objects.equals(this.buildNumber, journeySessionEventsNotificationApp.buildNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, version, buildNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySessionEventsNotificationApp {\n");
    
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

