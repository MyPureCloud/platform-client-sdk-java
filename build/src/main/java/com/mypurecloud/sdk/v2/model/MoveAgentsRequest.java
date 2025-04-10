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
 * MoveAgentsRequest
 */

public class MoveAgentsRequest  implements Serializable {
  
  private List<String> userIds = null;
  private String destinationManagementUnitId = null;

  public MoveAgentsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userIds = new ArrayList<String>();
    }
  }

  
  /**
   * The list of user ids to move
   **/
  public MoveAgentsRequest userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of user ids to move")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * The id of the management unit for which the move will be performed. To remove users from their management unit this should be set to null.
   **/
  public MoveAgentsRequest destinationManagementUnitId(String destinationManagementUnitId) {
    this.destinationManagementUnitId = destinationManagementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the management unit for which the move will be performed. To remove users from their management unit this should be set to null.")
  @JsonProperty("destinationManagementUnitId")
  public String getDestinationManagementUnitId() {
    return destinationManagementUnitId;
  }
  public void setDestinationManagementUnitId(String destinationManagementUnitId) {
    this.destinationManagementUnitId = destinationManagementUnitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveAgentsRequest moveAgentsRequest = (MoveAgentsRequest) o;

    return Objects.equals(this.userIds, moveAgentsRequest.userIds) &&
            Objects.equals(this.destinationManagementUnitId, moveAgentsRequest.destinationManagementUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, destinationManagementUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveAgentsRequest {\n");
    
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    destinationManagementUnitId: ").append(toIndentedString(destinationManagementUnitId)).append("\n");
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

