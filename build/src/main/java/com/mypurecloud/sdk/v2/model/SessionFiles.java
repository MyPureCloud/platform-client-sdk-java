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
import com.mypurecloud.sdk.v2.model.SessionMetaData;
import com.mypurecloud.sdk.v2.model.SessionMetricData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SessionFiles
 */

public class SessionFiles  implements Serializable {
  
  private SessionMetaData metaData = null;
  private SessionMetricData offered = null;
  private SessionMetricData averageHandleTime = null;

  public SessionFiles() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Metadata for the requested session
   **/
  public SessionFiles metaData(SessionMetaData metaData) {
    this.metaData = metaData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata for the requested session")
  @JsonProperty("metaData")
  public SessionMetaData getMetaData() {
    return metaData;
  }
  public void setMetaData(SessionMetaData metaData) {
    this.metaData = metaData;
  }


  /**
   * Offered data for the requested session
   **/
  public SessionFiles offered(SessionMetricData offered) {
    this.offered = offered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Offered data for the requested session")
  @JsonProperty("offered")
  public SessionMetricData getOffered() {
    return offered;
  }
  public void setOffered(SessionMetricData offered) {
    this.offered = offered;
  }


  /**
   * Average handle time data for the requested session
   **/
  public SessionFiles averageHandleTime(SessionMetricData averageHandleTime) {
    this.averageHandleTime = averageHandleTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Average handle time data for the requested session")
  @JsonProperty("averageHandleTime")
  public SessionMetricData getAverageHandleTime() {
    return averageHandleTime;
  }
  public void setAverageHandleTime(SessionMetricData averageHandleTime) {
    this.averageHandleTime = averageHandleTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionFiles sessionFiles = (SessionFiles) o;

    return Objects.equals(this.metaData, sessionFiles.metaData) &&
            Objects.equals(this.offered, sessionFiles.offered) &&
            Objects.equals(this.averageHandleTime, sessionFiles.averageHandleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, offered, averageHandleTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionFiles {\n");
    
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    offered: ").append(toIndentedString(offered)).append("\n");
    sb.append("    averageHandleTime: ").append(toIndentedString(averageHandleTime)).append("\n");
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

