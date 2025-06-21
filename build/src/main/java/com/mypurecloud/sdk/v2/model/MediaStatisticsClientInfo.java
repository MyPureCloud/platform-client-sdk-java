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
 * MediaStatisticsClientInfo
 */

public class MediaStatisticsClientInfo  implements Serializable {
  
  private String originAppName = null;
  private String originAppId = null;
  private String originAppVersion = null;

  public MediaStatisticsClientInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the application that created the media session.
   **/
  public MediaStatisticsClientInfo originAppName(String originAppName) {
    this.originAppName = originAppName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the application that created the media session.")
  @JsonProperty("originAppName")
  public String getOriginAppName() {
    return originAppName;
  }
  public void setOriginAppName(String originAppName) {
    this.originAppName = originAppName;
  }


  /**
   * The ID of the application that created the media session.
   **/
  public MediaStatisticsClientInfo originAppId(String originAppId) {
    this.originAppId = originAppId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the application that created the media session.")
  @JsonProperty("originAppId")
  public String getOriginAppId() {
    return originAppId;
  }
  public void setOriginAppId(String originAppId) {
    this.originAppId = originAppId;
  }


  /**
   * The version of the application that created the media session.
   **/
  public MediaStatisticsClientInfo originAppVersion(String originAppVersion) {
    this.originAppVersion = originAppVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the application that created the media session.")
  @JsonProperty("originAppVersion")
  public String getOriginAppVersion() {
    return originAppVersion;
  }
  public void setOriginAppVersion(String originAppVersion) {
    this.originAppVersion = originAppVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaStatisticsClientInfo mediaStatisticsClientInfo = (MediaStatisticsClientInfo) o;

    return Objects.equals(this.originAppName, mediaStatisticsClientInfo.originAppName) &&
            Objects.equals(this.originAppId, mediaStatisticsClientInfo.originAppId) &&
            Objects.equals(this.originAppVersion, mediaStatisticsClientInfo.originAppVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originAppName, originAppId, originAppVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaStatisticsClientInfo {\n");
    
    sb.append("    originAppName: ").append(toIndentedString(originAppName)).append("\n");
    sb.append("    originAppId: ").append(toIndentedString(originAppId)).append("\n");
    sb.append("    originAppVersion: ").append(toIndentedString(originAppVersion)).append("\n");
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

