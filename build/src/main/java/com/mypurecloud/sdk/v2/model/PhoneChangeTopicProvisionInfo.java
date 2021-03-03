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
import java.util.Date;

import java.io.Serializable;
/**
 * PhoneChangeTopicProvisionInfo
 */

public class PhoneChangeTopicProvisionInfo  implements Serializable {
  
  private Date time = null;
  private String source = null;
  private String errorInfo = null;

  
  /**
   **/
  public PhoneChangeTopicProvisionInfo time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  
  /**
   **/
  public PhoneChangeTopicProvisionInfo source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   **/
  public PhoneChangeTopicProvisionInfo errorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public String getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChangeTopicProvisionInfo phoneChangeTopicProvisionInfo = (PhoneChangeTopicProvisionInfo) o;
    return Objects.equals(this.time, phoneChangeTopicProvisionInfo.time) &&
        Objects.equals(this.source, phoneChangeTopicProvisionInfo.source) &&
        Objects.equals(this.errorInfo, phoneChangeTopicProvisionInfo.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, source, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChangeTopicProvisionInfo {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

