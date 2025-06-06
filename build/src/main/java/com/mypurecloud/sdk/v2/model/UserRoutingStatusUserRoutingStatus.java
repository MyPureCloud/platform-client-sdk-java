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
import com.mypurecloud.sdk.v2.model.UserRoutingStatusErrorInfo;
import com.mypurecloud.sdk.v2.model.UserRoutingStatusRoutingStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserRoutingStatusUserRoutingStatus
 */

public class UserRoutingStatusUserRoutingStatus  implements Serializable {
  
  private String id = null;
  private UserRoutingStatusRoutingStatus routingStatus = null;
  private UserRoutingStatusErrorInfo errorInfo = null;

  public UserRoutingStatusUserRoutingStatus() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The unique identifier of the user.
   **/
  public UserRoutingStatusUserRoutingStatus id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the user.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public UserRoutingStatusUserRoutingStatus routingStatus(UserRoutingStatusRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("routingStatus")
  public UserRoutingStatusRoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(UserRoutingStatusRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
  }


  /**
   **/
  public UserRoutingStatusUserRoutingStatus errorInfo(UserRoutingStatusErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public UserRoutingStatusErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(UserRoutingStatusErrorInfo errorInfo) {
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
    UserRoutingStatusUserRoutingStatus userRoutingStatusUserRoutingStatus = (UserRoutingStatusUserRoutingStatus) o;

    return Objects.equals(this.id, userRoutingStatusUserRoutingStatus.id) &&
            Objects.equals(this.routingStatus, userRoutingStatusUserRoutingStatus.routingStatus) &&
            Objects.equals(this.errorInfo, userRoutingStatusUserRoutingStatus.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, routingStatus, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoutingStatusUserRoutingStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

