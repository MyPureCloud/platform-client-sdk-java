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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * V2StaEmpathyOverallTopicAgentEmpathyScore
 */

public class V2StaEmpathyOverallTopicAgentEmpathyScore  implements Serializable {
  
  private String agentId = null;
  private BigDecimal overallEmpathyScore = null;

  public V2StaEmpathyOverallTopicAgentEmpathyScore() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2StaEmpathyOverallTopicAgentEmpathyScore agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   **/
  public V2StaEmpathyOverallTopicAgentEmpathyScore overallEmpathyScore(BigDecimal overallEmpathyScore) {
    this.overallEmpathyScore = overallEmpathyScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("overallEmpathyScore")
  public BigDecimal getOverallEmpathyScore() {
    return overallEmpathyScore;
  }
  public void setOverallEmpathyScore(BigDecimal overallEmpathyScore) {
    this.overallEmpathyScore = overallEmpathyScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaEmpathyOverallTopicAgentEmpathyScore v2StaEmpathyOverallTopicAgentEmpathyScore = (V2StaEmpathyOverallTopicAgentEmpathyScore) o;

    return Objects.equals(this.agentId, v2StaEmpathyOverallTopicAgentEmpathyScore.agentId) &&
            Objects.equals(this.overallEmpathyScore, v2StaEmpathyOverallTopicAgentEmpathyScore.overallEmpathyScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, overallEmpathyScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaEmpathyOverallTopicAgentEmpathyScore {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    overallEmpathyScore: ").append(toIndentedString(overallEmpathyScore)).append("\n");
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

