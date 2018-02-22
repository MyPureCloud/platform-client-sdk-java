package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import com.mypurecloud.sdk.v2.model.WfmMoveAgentsCompleteNotificationMoveAgentResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmMoveAgentsCompleteNotification
 */

public class WfmMoveAgentsCompleteNotification  implements Serializable {
  
  private DocumentDataV2NotificationWorkspace requestingUser = null;
  private DocumentDataV2NotificationWorkspace destinationManagementUnit = null;
  private List<WfmMoveAgentsCompleteNotificationMoveAgentResults> moveAgentResults = new ArrayList<WfmMoveAgentsCompleteNotificationMoveAgentResults>();

  
  /**
   **/
  public WfmMoveAgentsCompleteNotification requestingUser(DocumentDataV2NotificationWorkspace requestingUser) {
    this.requestingUser = requestingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestingUser")
  public DocumentDataV2NotificationWorkspace getRequestingUser() {
    return requestingUser;
  }
  public void setRequestingUser(DocumentDataV2NotificationWorkspace requestingUser) {
    this.requestingUser = requestingUser;
  }

  
  /**
   **/
  public WfmMoveAgentsCompleteNotification destinationManagementUnit(DocumentDataV2NotificationWorkspace destinationManagementUnit) {
    this.destinationManagementUnit = destinationManagementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationManagementUnit")
  public DocumentDataV2NotificationWorkspace getDestinationManagementUnit() {
    return destinationManagementUnit;
  }
  public void setDestinationManagementUnit(DocumentDataV2NotificationWorkspace destinationManagementUnit) {
    this.destinationManagementUnit = destinationManagementUnit;
  }

  
  /**
   **/
  public WfmMoveAgentsCompleteNotification moveAgentResults(List<WfmMoveAgentsCompleteNotificationMoveAgentResults> moveAgentResults) {
    this.moveAgentResults = moveAgentResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("moveAgentResults")
  public List<WfmMoveAgentsCompleteNotificationMoveAgentResults> getMoveAgentResults() {
    return moveAgentResults;
  }
  public void setMoveAgentResults(List<WfmMoveAgentsCompleteNotificationMoveAgentResults> moveAgentResults) {
    this.moveAgentResults = moveAgentResults;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmMoveAgentsCompleteNotification wfmMoveAgentsCompleteNotification = (WfmMoveAgentsCompleteNotification) o;
    return Objects.equals(this.requestingUser, wfmMoveAgentsCompleteNotification.requestingUser) &&
        Objects.equals(this.destinationManagementUnit, wfmMoveAgentsCompleteNotification.destinationManagementUnit) &&
        Objects.equals(this.moveAgentResults, wfmMoveAgentsCompleteNotification.moveAgentResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestingUser, destinationManagementUnit, moveAgentResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmMoveAgentsCompleteNotification {\n");
    
    sb.append("    requestingUser: ").append(toIndentedString(requestingUser)).append("\n");
    sb.append("    destinationManagementUnit: ").append(toIndentedString(destinationManagementUnit)).append("\n");
    sb.append("    moveAgentResults: ").append(toIndentedString(moveAgentResults)).append("\n");
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

