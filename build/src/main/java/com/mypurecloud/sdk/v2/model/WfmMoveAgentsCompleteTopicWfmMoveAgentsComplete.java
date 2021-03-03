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
import com.mypurecloud.sdk.v2.model.WfmMoveAgentsCompleteTopicManagementUnit;
import com.mypurecloud.sdk.v2.model.WfmMoveAgentsCompleteTopicUserReference;
import com.mypurecloud.sdk.v2.model.WfmMoveAgentsCompleteTopicWfmMoveAgentData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmMoveAgentsCompleteTopicWfmMoveAgentsComplete
 */

public class WfmMoveAgentsCompleteTopicWfmMoveAgentsComplete  implements Serializable {
  
  private WfmMoveAgentsCompleteTopicUserReference requestingUser = null;
  private WfmMoveAgentsCompleteTopicManagementUnit destinationManagementUnit = null;
  private List<WfmMoveAgentsCompleteTopicWfmMoveAgentData> results = new ArrayList<WfmMoveAgentsCompleteTopicWfmMoveAgentData>();

  
  /**
   **/
  public WfmMoveAgentsCompleteTopicWfmMoveAgentsComplete requestingUser(WfmMoveAgentsCompleteTopicUserReference requestingUser) {
    this.requestingUser = requestingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestingUser")
  public WfmMoveAgentsCompleteTopicUserReference getRequestingUser() {
    return requestingUser;
  }
  public void setRequestingUser(WfmMoveAgentsCompleteTopicUserReference requestingUser) {
    this.requestingUser = requestingUser;
  }

  
  /**
   **/
  public WfmMoveAgentsCompleteTopicWfmMoveAgentsComplete destinationManagementUnit(WfmMoveAgentsCompleteTopicManagementUnit destinationManagementUnit) {
    this.destinationManagementUnit = destinationManagementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationManagementUnit")
  public WfmMoveAgentsCompleteTopicManagementUnit getDestinationManagementUnit() {
    return destinationManagementUnit;
  }
  public void setDestinationManagementUnit(WfmMoveAgentsCompleteTopicManagementUnit destinationManagementUnit) {
    this.destinationManagementUnit = destinationManagementUnit;
  }

  
  /**
   **/
  public WfmMoveAgentsCompleteTopicWfmMoveAgentsComplete results(List<WfmMoveAgentsCompleteTopicWfmMoveAgentData> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("results")
  public List<WfmMoveAgentsCompleteTopicWfmMoveAgentData> getResults() {
    return results;
  }
  public void setResults(List<WfmMoveAgentsCompleteTopicWfmMoveAgentData> results) {
    this.results = results;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmMoveAgentsCompleteTopicWfmMoveAgentsComplete wfmMoveAgentsCompleteTopicWfmMoveAgentsComplete = (WfmMoveAgentsCompleteTopicWfmMoveAgentsComplete) o;
    return Objects.equals(this.requestingUser, wfmMoveAgentsCompleteTopicWfmMoveAgentsComplete.requestingUser) &&
        Objects.equals(this.destinationManagementUnit, wfmMoveAgentsCompleteTopicWfmMoveAgentsComplete.destinationManagementUnit) &&
        Objects.equals(this.results, wfmMoveAgentsCompleteTopicWfmMoveAgentsComplete.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestingUser, destinationManagementUnit, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmMoveAgentsCompleteTopicWfmMoveAgentsComplete {\n");
    
    sb.append("    requestingUser: ").append(toIndentedString(requestingUser)).append("\n");
    sb.append("    destinationManagementUnit: ").append(toIndentedString(destinationManagementUnit)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

