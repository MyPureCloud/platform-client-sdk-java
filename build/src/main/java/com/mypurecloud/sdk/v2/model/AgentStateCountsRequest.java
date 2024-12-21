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
import com.mypurecloud.sdk.v2.model.AgentStateSessionFilter;
import com.mypurecloud.sdk.v2.model.AgentStateUserFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentStateCountsRequest
 */

public class AgentStateCountsRequest  implements Serializable {
  
  private AgentStateUserFilter userFilter = null;
  private AgentStateSessionFilter sessionFilter = null;

  
  /**
   * Filters that target user-level data
   **/
  public AgentStateCountsRequest userFilter(AgentStateUserFilter userFilter) {
    this.userFilter = userFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target user-level data")
  @JsonProperty("userFilter")
  public AgentStateUserFilter getUserFilter() {
    return userFilter;
  }
  public void setUserFilter(AgentStateUserFilter userFilter) {
    this.userFilter = userFilter;
  }


  /**
   * Filters that target session-level data
   **/
  public AgentStateCountsRequest sessionFilter(AgentStateSessionFilter sessionFilter) {
    this.sessionFilter = sessionFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target session-level data")
  @JsonProperty("sessionFilter")
  public AgentStateSessionFilter getSessionFilter() {
    return sessionFilter;
  }
  public void setSessionFilter(AgentStateSessionFilter sessionFilter) {
    this.sessionFilter = sessionFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStateCountsRequest agentStateCountsRequest = (AgentStateCountsRequest) o;

    return Objects.equals(this.userFilter, agentStateCountsRequest.userFilter) &&
            Objects.equals(this.sessionFilter, agentStateCountsRequest.sessionFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFilter, sessionFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStateCountsRequest {\n");
    
    sb.append("    userFilter: ").append(toIndentedString(userFilter)).append("\n");
    sb.append("    sessionFilter: ").append(toIndentedString(sessionFilter)).append("\n");
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

