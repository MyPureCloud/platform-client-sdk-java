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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PersistentConnectionChangeTopicErrorLocation
 */

public class PersistentConnectionChangeTopicErrorLocation  implements Serializable {
  
  private String function = null;
  private String fileID = null;
  private Long line = null;

  public PersistentConnectionChangeTopicErrorLocation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public PersistentConnectionChangeTopicErrorLocation function(String function) {
    this.function = function;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("function")
  public String getFunction() {
    return function;
  }
  public void setFunction(String function) {
    this.function = function;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorLocation fileID(String fileID) {
    this.fileID = fileID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileID")
  public String getFileID() {
    return fileID;
  }
  public void setFileID(String fileID) {
    this.fileID = fileID;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorLocation line(Long line) {
    this.line = line;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line")
  public Long getLine() {
    return line;
  }
  public void setLine(Long line) {
    this.line = line;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistentConnectionChangeTopicErrorLocation persistentConnectionChangeTopicErrorLocation = (PersistentConnectionChangeTopicErrorLocation) o;

    return Objects.equals(this.function, persistentConnectionChangeTopicErrorLocation.function) &&
            Objects.equals(this.fileID, persistentConnectionChangeTopicErrorLocation.fileID) &&
            Objects.equals(this.line, persistentConnectionChangeTopicErrorLocation.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, fileID, line);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistentConnectionChangeTopicErrorLocation {\n");
    
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    fileID: ").append(toIndentedString(fileID)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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

