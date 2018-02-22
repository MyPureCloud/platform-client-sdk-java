package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmMoveAgentsCompleteNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmMoveAgentsCompleteNotificationWfmMoveAgentData
 */

public class WfmMoveAgentsCompleteNotificationWfmMoveAgentData  implements Serializable {
  
  private WfmMoveAgentsCompleteNotificationUser user = null;

  /**
   * Gets or Sets moveAgentResult
   */
  public enum MoveAgentResultEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MOVESUCCESSFUL("MoveSuccessful"),
    NOTHINGTODO("NothingToDo"),
    ALREADYMOVED("AlreadyMoved"),
    DESTINATIONMANAGEMENTUNITDOESNOTEXIST("DestinationManagementUnitDoesNotExist"),
    DESTINATIONMANAGEMENTUNITAGENTLIMITEXCEEDED("DestinationManagementUnitAgentLimitExceeded"),
    MOVINGTODIFFERENTMANAGEMENTUNIT("MovingToDifferentManagementUnit");

    private String value;

    MoveAgentResultEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MoveAgentResultEnum fromString(String key) {
      if (key == null) return null;

      for (MoveAgentResultEnum value : MoveAgentResultEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MoveAgentResultEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MoveAgentResultEnum moveAgentResult = null;

  
  /**
   **/
  public WfmMoveAgentsCompleteNotificationWfmMoveAgentData user(WfmMoveAgentsCompleteNotificationUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmMoveAgentsCompleteNotificationUser getUser() {
    return user;
  }
  public void setUser(WfmMoveAgentsCompleteNotificationUser user) {
    this.user = user;
  }

  
  /**
   **/
  public WfmMoveAgentsCompleteNotificationWfmMoveAgentData moveAgentResult(MoveAgentResultEnum moveAgentResult) {
    this.moveAgentResult = moveAgentResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("moveAgentResult")
  public MoveAgentResultEnum getMoveAgentResult() {
    return moveAgentResult;
  }
  public void setMoveAgentResult(MoveAgentResultEnum moveAgentResult) {
    this.moveAgentResult = moveAgentResult;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmMoveAgentsCompleteNotificationWfmMoveAgentData wfmMoveAgentsCompleteNotificationWfmMoveAgentData = (WfmMoveAgentsCompleteNotificationWfmMoveAgentData) o;
    return Objects.equals(this.user, wfmMoveAgentsCompleteNotificationWfmMoveAgentData.user) &&
        Objects.equals(this.moveAgentResult, wfmMoveAgentsCompleteNotificationWfmMoveAgentData.moveAgentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, moveAgentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmMoveAgentsCompleteNotificationWfmMoveAgentData {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    moveAgentResult: ").append(toIndentedString(moveAgentResult)).append("\n");
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

