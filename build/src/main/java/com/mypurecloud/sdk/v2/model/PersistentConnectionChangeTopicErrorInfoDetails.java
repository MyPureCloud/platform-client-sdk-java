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
import com.mypurecloud.sdk.v2.model.PersistentConnectionChangeTopicErrorLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PersistentConnectionChangeTopicErrorInfoDetails
 */

public class PersistentConnectionChangeTopicErrorInfoDetails  implements Serializable {
  
  private String code = null;
  private String userMessage = null;
  private Map<String, String> userParams = null;
  private String hostname = null;
  private PersistentConnectionChangeTopicErrorLocation location = null;

  
  /**
   **/
  public PersistentConnectionChangeTopicErrorInfoDetails code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorInfoDetails userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userMessage")
  public String getUserMessage() {
    return userMessage;
  }
  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorInfoDetails userParams(Map<String, String> userParams) {
    this.userParams = userParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userParams")
  public Map<String, String> getUserParams() {
    return userParams;
  }
  public void setUserParams(Map<String, String> userParams) {
    this.userParams = userParams;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorInfoDetails hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorInfoDetails location(PersistentConnectionChangeTopicErrorLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("location")
  public PersistentConnectionChangeTopicErrorLocation getLocation() {
    return location;
  }
  public void setLocation(PersistentConnectionChangeTopicErrorLocation location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistentConnectionChangeTopicErrorInfoDetails persistentConnectionChangeTopicErrorInfoDetails = (PersistentConnectionChangeTopicErrorInfoDetails) o;

    return Objects.equals(this.code, persistentConnectionChangeTopicErrorInfoDetails.code) &&
            Objects.equals(this.userMessage, persistentConnectionChangeTopicErrorInfoDetails.userMessage) &&
            Objects.equals(this.userParams, persistentConnectionChangeTopicErrorInfoDetails.userParams) &&
            Objects.equals(this.hostname, persistentConnectionChangeTopicErrorInfoDetails.hostname) &&
            Objects.equals(this.location, persistentConnectionChangeTopicErrorInfoDetails.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, userMessage, userParams, hostname, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistentConnectionChangeTopicErrorInfoDetails {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    userParams: ").append(toIndentedString(userParams)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

