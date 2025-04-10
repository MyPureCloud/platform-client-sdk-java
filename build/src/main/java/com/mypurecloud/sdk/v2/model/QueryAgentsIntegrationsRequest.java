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
import java.util.List;

import java.io.Serializable;
/**
 * Query integrations for agents request
 */
@ApiModel(description = "Query integrations for agents request")

public class QueryAgentsIntegrationsRequest  implements Serializable {
  
  private List<String> agentIds = null;

  public QueryAgentsIntegrationsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of the agents to query associated integrations
   **/
  public QueryAgentsIntegrationsRequest agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the agents to query associated integrations")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAgentsIntegrationsRequest queryAgentsIntegrationsRequest = (QueryAgentsIntegrationsRequest) o;

    return Objects.equals(this.agentIds, queryAgentsIntegrationsRequest.agentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAgentsIntegrationsRequest {\n");
    
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
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

