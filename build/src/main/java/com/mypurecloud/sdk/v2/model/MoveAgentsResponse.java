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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.MoveAgentResponse;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MoveAgentsResponse
 */

public class MoveAgentsResponse  implements Serializable {
  
  private UserReference requestingUser = null;
  private ManagementUnitReference destinationManagementUnit = null;
  private List<MoveAgentResponse> results = null;

  public MoveAgentsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<MoveAgentResponse>();
    }
  }

  
  /**
   * The user that made the request
   **/
  public MoveAgentsResponse requestingUser(UserReference requestingUser) {
    this.requestingUser = requestingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user that made the request")
  @JsonProperty("requestingUser")
  public UserReference getRequestingUser() {
    return requestingUser;
  }
  public void setRequestingUser(UserReference requestingUser) {
    this.requestingUser = requestingUser;
  }


  /**
   * The management unit specified on the request
   **/
  public MoveAgentsResponse destinationManagementUnit(ManagementUnitReference destinationManagementUnit) {
    this.destinationManagementUnit = destinationManagementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management unit specified on the request")
  @JsonProperty("destinationManagementUnit")
  public ManagementUnitReference getDestinationManagementUnit() {
    return destinationManagementUnit;
  }
  public void setDestinationManagementUnit(ManagementUnitReference destinationManagementUnit) {
    this.destinationManagementUnit = destinationManagementUnit;
  }


  /**
   * The list containing the agent and result of the move operation
   **/
  public MoveAgentsResponse results(List<MoveAgentResponse> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list containing the agent and result of the move operation")
  @JsonProperty("results")
  public List<MoveAgentResponse> getResults() {
    return results;
  }
  public void setResults(List<MoveAgentResponse> results) {
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
    MoveAgentsResponse moveAgentsResponse = (MoveAgentsResponse) o;

    return Objects.equals(this.requestingUser, moveAgentsResponse.requestingUser) &&
            Objects.equals(this.destinationManagementUnit, moveAgentsResponse.destinationManagementUnit) &&
            Objects.equals(this.results, moveAgentsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestingUser, destinationManagementUnit, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveAgentsResponse {\n");
    
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

