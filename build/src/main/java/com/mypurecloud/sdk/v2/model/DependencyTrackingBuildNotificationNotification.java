package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DependencyTrackingBuildNotificationNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DependencyTrackingBuildNotificationNotification
 */

public class DependencyTrackingBuildNotificationNotification  implements Serializable {
  
  private String status = null;
  private DependencyTrackingBuildNotificationNotificationUser user = null;
  private Date startTime = null;

  
  /**
   **/
  public DependencyTrackingBuildNotificationNotification status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public DependencyTrackingBuildNotificationNotification user(DependencyTrackingBuildNotificationNotificationUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DependencyTrackingBuildNotificationNotificationUser getUser() {
    return user;
  }
  public void setUser(DependencyTrackingBuildNotificationNotificationUser user) {
    this.user = user;
  }

  
  /**
   **/
  public DependencyTrackingBuildNotificationNotification startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyTrackingBuildNotificationNotification dependencyTrackingBuildNotificationNotification = (DependencyTrackingBuildNotificationNotification) o;
    return Objects.equals(this.status, dependencyTrackingBuildNotificationNotification.status) &&
        Objects.equals(this.user, dependencyTrackingBuildNotificationNotification.user) &&
        Objects.equals(this.startTime, dependencyTrackingBuildNotificationNotification.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, user, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyTrackingBuildNotificationNotification {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

