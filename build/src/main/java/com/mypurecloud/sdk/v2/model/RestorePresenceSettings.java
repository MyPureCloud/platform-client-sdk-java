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
 * RestorePresenceSettings
 */

public class RestorePresenceSettings  implements Serializable {
  
  private Boolean enabled = null;
  private Long restoreTimeMilliseconds = null;
  private Boolean restoreOnQueueEnabled = null;

  
  /**
   * Whether the restore presence feature is enabled
   **/
  public RestorePresenceSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the restore presence feature is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * How many milliseconds the presence will be restored within
   **/
  public RestorePresenceSettings restoreTimeMilliseconds(Long restoreTimeMilliseconds) {
    this.restoreTimeMilliseconds = restoreTimeMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "How many milliseconds the presence will be restored within")
  @JsonProperty("restoreTimeMilliseconds")
  public Long getRestoreTimeMilliseconds() {
    return restoreTimeMilliseconds;
  }
  public void setRestoreTimeMilliseconds(Long restoreTimeMilliseconds) {
    this.restoreTimeMilliseconds = restoreTimeMilliseconds;
  }


  /**
   * Whether the ON_QUEUE presence will be restored
   **/
  public RestorePresenceSettings restoreOnQueueEnabled(Boolean restoreOnQueueEnabled) {
    this.restoreOnQueueEnabled = restoreOnQueueEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the ON_QUEUE presence will be restored")
  @JsonProperty("restoreOnQueueEnabled")
  public Boolean getRestoreOnQueueEnabled() {
    return restoreOnQueueEnabled;
  }
  public void setRestoreOnQueueEnabled(Boolean restoreOnQueueEnabled) {
    this.restoreOnQueueEnabled = restoreOnQueueEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestorePresenceSettings restorePresenceSettings = (RestorePresenceSettings) o;

    return Objects.equals(this.enabled, restorePresenceSettings.enabled) &&
            Objects.equals(this.restoreTimeMilliseconds, restorePresenceSettings.restoreTimeMilliseconds) &&
            Objects.equals(this.restoreOnQueueEnabled, restorePresenceSettings.restoreOnQueueEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, restoreTimeMilliseconds, restoreOnQueueEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestorePresenceSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    restoreTimeMilliseconds: ").append(toIndentedString(restoreTimeMilliseconds)).append("\n");
    sb.append("    restoreOnQueueEnabled: ").append(toIndentedString(restoreOnQueueEnabled)).append("\n");
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

