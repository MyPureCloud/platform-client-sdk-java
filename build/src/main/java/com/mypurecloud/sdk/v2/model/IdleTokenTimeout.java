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
 * IdleTokenTimeout
 */

public class IdleTokenTimeout  implements Serializable {
  
  private Integer idleTokenTimeoutSeconds = null;
  private Boolean enableIdleTokenTimeout = null;

  
  /**
   * Token timeout length in seconds. Must be at least 5 minutes and 8 hours or less (if HIPAA is disabled) or 15 minutes or less (if HIPAA is enabled).
   * minimum: 300
   **/
  public IdleTokenTimeout idleTokenTimeoutSeconds(Integer idleTokenTimeoutSeconds) {
    this.idleTokenTimeoutSeconds = idleTokenTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token timeout length in seconds. Must be at least 5 minutes and 8 hours or less (if HIPAA is disabled) or 15 minutes or less (if HIPAA is enabled).")
  @JsonProperty("idleTokenTimeoutSeconds")
  public Integer getIdleTokenTimeoutSeconds() {
    return idleTokenTimeoutSeconds;
  }
  public void setIdleTokenTimeoutSeconds(Integer idleTokenTimeoutSeconds) {
    this.idleTokenTimeoutSeconds = idleTokenTimeoutSeconds;
  }


  /**
   * Indicates whether the Token Timeout should be enabled or disabled.
   **/
  public IdleTokenTimeout enableIdleTokenTimeout(Boolean enableIdleTokenTimeout) {
    this.enableIdleTokenTimeout = enableIdleTokenTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the Token Timeout should be enabled or disabled.")
  @JsonProperty("enableIdleTokenTimeout")
  public Boolean getEnableIdleTokenTimeout() {
    return enableIdleTokenTimeout;
  }
  public void setEnableIdleTokenTimeout(Boolean enableIdleTokenTimeout) {
    this.enableIdleTokenTimeout = enableIdleTokenTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdleTokenTimeout idleTokenTimeout = (IdleTokenTimeout) o;

    return Objects.equals(this.idleTokenTimeoutSeconds, idleTokenTimeout.idleTokenTimeoutSeconds) &&
            Objects.equals(this.enableIdleTokenTimeout, idleTokenTimeout.enableIdleTokenTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idleTokenTimeoutSeconds, enableIdleTokenTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdleTokenTimeout {\n");
    
    sb.append("    idleTokenTimeoutSeconds: ").append(toIndentedString(idleTokenTimeoutSeconds)).append("\n");
    sb.append("    enableIdleTokenTimeout: ").append(toIndentedString(enableIdleTokenTimeout)).append("\n");
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

