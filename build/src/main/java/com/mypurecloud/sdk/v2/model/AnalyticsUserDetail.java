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
import com.mypurecloud.sdk.v2.model.AnalyticsRoutingStatusRecord;
import com.mypurecloud.sdk.v2.model.AnalyticsUserPresenceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsUserDetail
 */

public class AnalyticsUserDetail  implements Serializable {
  
  private String userId = null;
  private List<AnalyticsUserPresenceRecord> primaryPresence = new ArrayList<AnalyticsUserPresenceRecord>();
  private List<AnalyticsRoutingStatusRecord> routingStatus = new ArrayList<AnalyticsRoutingStatusRecord>();

  
  /**
   * The identifier for the user
   **/
  public AnalyticsUserDetail userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier for the user")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The presence records for the user
   **/
  public AnalyticsUserDetail primaryPresence(List<AnalyticsUserPresenceRecord> primaryPresence) {
    this.primaryPresence = primaryPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The presence records for the user")
  @JsonProperty("primaryPresence")
  public List<AnalyticsUserPresenceRecord> getPrimaryPresence() {
    return primaryPresence;
  }
  public void setPrimaryPresence(List<AnalyticsUserPresenceRecord> primaryPresence) {
    this.primaryPresence = primaryPresence;
  }

  
  /**
   * The ACD routing status records for the user
   **/
  public AnalyticsUserDetail routingStatus(List<AnalyticsRoutingStatusRecord> routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ACD routing status records for the user")
  @JsonProperty("routingStatus")
  public List<AnalyticsRoutingStatusRecord> getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(List<AnalyticsRoutingStatusRecord> routingStatus) {
    this.routingStatus = routingStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsUserDetail analyticsUserDetail = (AnalyticsUserDetail) o;
    return Objects.equals(this.userId, analyticsUserDetail.userId) &&
        Objects.equals(this.primaryPresence, analyticsUserDetail.primaryPresence) &&
        Objects.equals(this.routingStatus, analyticsUserDetail.routingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, primaryPresence, routingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsUserDetail {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    primaryPresence: ").append(toIndentedString(primaryPresence)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
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

