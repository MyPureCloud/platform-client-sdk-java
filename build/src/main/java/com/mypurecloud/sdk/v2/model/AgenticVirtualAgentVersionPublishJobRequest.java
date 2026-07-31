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
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentVersionPublish;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgenticVirtualAgentVersionPublishJobRequest
 */

public class AgenticVirtualAgentVersionPublishJobRequest  implements Serializable {
  
  private AgenticVirtualAgentVersionPublish virtualAgentVersion = null;

  public AgenticVirtualAgentVersionPublishJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgenticVirtualAgentVersionPublishJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The attributes of the virtual agent version to update as part of this publish job.
   **/
  public AgenticVirtualAgentVersionPublishJobRequest virtualAgentVersion(AgenticVirtualAgentVersionPublish virtualAgentVersion) {
    this.virtualAgentVersion = virtualAgentVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The attributes of the virtual agent version to update as part of this publish job.")
  @JsonProperty("virtualAgentVersion")
  public AgenticVirtualAgentVersionPublish getVirtualAgentVersion() {
    return virtualAgentVersion;
  }
  public void setVirtualAgentVersion(AgenticVirtualAgentVersionPublish virtualAgentVersion) {
    this.virtualAgentVersion = virtualAgentVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentVersionPublishJobRequest agenticVirtualAgentVersionPublishJobRequest = (AgenticVirtualAgentVersionPublishJobRequest) o;

    return Objects.equals(this.virtualAgentVersion, agenticVirtualAgentVersionPublishJobRequest.virtualAgentVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualAgentVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentVersionPublishJobRequest {\n");
    
    sb.append("    virtualAgentVersion: ").append(toIndentedString(virtualAgentVersion)).append("\n");
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

