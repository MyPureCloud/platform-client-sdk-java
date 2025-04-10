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
import com.mypurecloud.sdk.v2.model.AnalyticsAgentStateAgentSessionResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsAgentStateAgentResponse
 */

public class AnalyticsAgentStateAgentResponse  implements Serializable {
  
  private String userId = null;
  private String divisionId = null;
  private String userName = null;
  private String managerId = null;
  private Integer sessionCount = null;
  private List<AnalyticsAgentStateAgentSessionResult> sessions = null;

  public AnalyticsAgentStateAgentResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sessions = new ArrayList<AnalyticsAgentStateAgentSessionResult>();
    }
  }

  
  /**
   * User Id - only returned if division is covered by agentStateNames permission
   **/
  public AnalyticsAgentStateAgentResponse userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Id - only returned if division is covered by agentStateNames permission")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Division Id
   **/
  public AnalyticsAgentStateAgentResponse divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Division Id")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * User name - only returned if division is covered by agentStateNames permission
   **/
  public AnalyticsAgentStateAgentResponse userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User name - only returned if division is covered by agentStateNames permission")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   * The user that this user reports to
   **/
  public AnalyticsAgentStateAgentResponse managerId(String managerId) {
    this.managerId = managerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user that this user reports to")
  @JsonProperty("managerId")
  public String getManagerId() {
    return managerId;
  }
  public void setManagerId(String managerId) {
    this.managerId = managerId;
  }


  /**
   * The count of sessions
   **/
  public AnalyticsAgentStateAgentResponse sessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of sessions")
  @JsonProperty("sessionCount")
  public Integer getSessionCount() {
    return sessionCount;
  }
  public void setSessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
  }


  /**
   * List of sessions
   **/
  public AnalyticsAgentStateAgentResponse sessions(List<AnalyticsAgentStateAgentSessionResult> sessions) {
    this.sessions = sessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of sessions")
  @JsonProperty("sessions")
  public List<AnalyticsAgentStateAgentSessionResult> getSessions() {
    return sessions;
  }
  public void setSessions(List<AnalyticsAgentStateAgentSessionResult> sessions) {
    this.sessions = sessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAgentStateAgentResponse analyticsAgentStateAgentResponse = (AnalyticsAgentStateAgentResponse) o;

    return Objects.equals(this.userId, analyticsAgentStateAgentResponse.userId) &&
            Objects.equals(this.divisionId, analyticsAgentStateAgentResponse.divisionId) &&
            Objects.equals(this.userName, analyticsAgentStateAgentResponse.userName) &&
            Objects.equals(this.managerId, analyticsAgentStateAgentResponse.managerId) &&
            Objects.equals(this.sessionCount, analyticsAgentStateAgentResponse.sessionCount) &&
            Objects.equals(this.sessions, analyticsAgentStateAgentResponse.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, divisionId, userName, managerId, sessionCount, sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAgentStateAgentResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

