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
import com.mypurecloud.sdk.v2.model.MediaUtilization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Utilization
 */

public class Utilization  implements Serializable {
  
  private Map<String, MediaUtilization> utilization = null;

  
  /**
   * Map of media type to utilization settings.  Valid media types include call, callback, chat, email, and message.
   **/
  public Utilization utilization(Map<String, MediaUtilization> utilization) {
    this.utilization = utilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of media type to utilization settings.  Valid media types include call, callback, chat, email, and message.")
  @JsonProperty("utilization")
  public Map<String, MediaUtilization> getUtilization() {
    return utilization;
  }
  public void setUtilization(Map<String, MediaUtilization> utilization) {
    this.utilization = utilization;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Utilization utilization = (Utilization) o;
    return Objects.equals(this.utilization, utilization.utilization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utilization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Utilization {\n");
    
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
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

