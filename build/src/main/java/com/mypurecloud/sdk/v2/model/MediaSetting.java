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
import com.mypurecloud.sdk.v2.model.ServiceLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MediaSetting
 */

public class MediaSetting  implements Serializable {
  
  private Integer alertingTimeoutSeconds = null;
  private ServiceLevel serviceLevel = null;

  
  /**
   **/
  public MediaSetting alertingTimeoutSeconds(Integer alertingTimeoutSeconds) {
    this.alertingTimeoutSeconds = alertingTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertingTimeoutSeconds")
  public Integer getAlertingTimeoutSeconds() {
    return alertingTimeoutSeconds;
  }
  public void setAlertingTimeoutSeconds(Integer alertingTimeoutSeconds) {
    this.alertingTimeoutSeconds = alertingTimeoutSeconds;
  }

  
  /**
   **/
  public MediaSetting serviceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceLevel")
  public ServiceLevel getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaSetting mediaSetting = (MediaSetting) o;
    return Objects.equals(this.alertingTimeoutSeconds, mediaSetting.alertingTimeoutSeconds) &&
        Objects.equals(this.serviceLevel, mediaSetting.serviceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertingTimeoutSeconds, serviceLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaSetting {\n");
    
    sb.append("    alertingTimeoutSeconds: ").append(toIndentedString(alertingTimeoutSeconds)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
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

