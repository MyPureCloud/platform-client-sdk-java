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
import com.mypurecloud.sdk.v2.model.IdentityResolutionConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IdentityResolutionQueueConfig
 */

public class IdentityResolutionQueueConfig  implements Serializable {
  
  private IdentityResolutionConfig callOnBehalfOfQueue = null;

  
  /**
   **/
  public IdentityResolutionQueueConfig callOnBehalfOfQueue(IdentityResolutionConfig callOnBehalfOfQueue) {
    this.callOnBehalfOfQueue = callOnBehalfOfQueue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callOnBehalfOfQueue")
  public IdentityResolutionConfig getCallOnBehalfOfQueue() {
    return callOnBehalfOfQueue;
  }
  public void setCallOnBehalfOfQueue(IdentityResolutionConfig callOnBehalfOfQueue) {
    this.callOnBehalfOfQueue = callOnBehalfOfQueue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityResolutionQueueConfig identityResolutionQueueConfig = (IdentityResolutionQueueConfig) o;

    return Objects.equals(this.callOnBehalfOfQueue, identityResolutionQueueConfig.callOnBehalfOfQueue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callOnBehalfOfQueue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityResolutionQueueConfig {\n");
    
    sb.append("    callOnBehalfOfQueue: ").append(toIndentedString(callOnBehalfOfQueue)).append("\n");
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

