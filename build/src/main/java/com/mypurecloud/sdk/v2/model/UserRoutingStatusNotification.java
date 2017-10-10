package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AgentActivityNotificationRoutingStatus;
import com.mypurecloud.sdk.v2.model.UserRoutingStatusNotificationErrorInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserRoutingStatusNotification
 */

public class UserRoutingStatusNotification  implements Serializable {
  
  private AgentActivityNotificationRoutingStatus routingStatus = null;
  private UserRoutingStatusNotificationErrorInfo errorInfo = null;

  
  /**
   **/
  public UserRoutingStatusNotification routingStatus(AgentActivityNotificationRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("routingStatus")
  public AgentActivityNotificationRoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(AgentActivityNotificationRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
  }

  
  /**
   **/
  public UserRoutingStatusNotification errorInfo(UserRoutingStatusNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public UserRoutingStatusNotificationErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(UserRoutingStatusNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRoutingStatusNotification userRoutingStatusNotification = (UserRoutingStatusNotification) o;
    return Objects.equals(this.routingStatus, userRoutingStatusNotification.routingStatus) &&
        Objects.equals(this.errorInfo, userRoutingStatusNotification.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingStatus, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoutingStatusNotification {\n");
    
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

