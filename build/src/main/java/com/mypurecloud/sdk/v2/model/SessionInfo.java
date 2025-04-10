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
import java.util.Date;

import java.io.Serializable;
/**
 * SessionInfo
 */

public class SessionInfo  implements Serializable {
  
  private Integer version = null;
  private String sessionId = null;
  private String businessUnitId = null;
  private Integer planningGroupsVersion = null;
  private Date dateOfSession = null;

  public SessionInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Version of the continuous forecast session
   **/
  public SessionInfo version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version of the continuous forecast session")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * Session ID of the continuous forecast session
   **/
  public SessionInfo sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session ID of the continuous forecast session")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Business unit ID of the continuous forecast session
   **/
  public SessionInfo businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business unit ID of the continuous forecast session")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }


  /**
   * Version of the planning groups
   **/
  public SessionInfo planningGroupsVersion(Integer planningGroupsVersion) {
    this.planningGroupsVersion = planningGroupsVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version of the planning groups")
  @JsonProperty("planningGroupsVersion")
  public Integer getPlanningGroupsVersion() {
    return planningGroupsVersion;
  }
  public void setPlanningGroupsVersion(Integer planningGroupsVersion) {
    this.planningGroupsVersion = planningGroupsVersion;
  }


  /**
   * Date and Time of the Session. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SessionInfo dateOfSession(Date dateOfSession) {
    this.dateOfSession = dateOfSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and Time of the Session. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateOfSession")
  public Date getDateOfSession() {
    return dateOfSession;
  }
  public void setDateOfSession(Date dateOfSession) {
    this.dateOfSession = dateOfSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionInfo sessionInfo = (SessionInfo) o;

    return Objects.equals(this.version, sessionInfo.version) &&
            Objects.equals(this.sessionId, sessionInfo.sessionId) &&
            Objects.equals(this.businessUnitId, sessionInfo.businessUnitId) &&
            Objects.equals(this.planningGroupsVersion, sessionInfo.planningGroupsVersion) &&
            Objects.equals(this.dateOfSession, sessionInfo.dateOfSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, sessionId, businessUnitId, planningGroupsVersion, dateOfSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionInfo {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    planningGroupsVersion: ").append(toIndentedString(planningGroupsVersion)).append("\n");
    sb.append("    dateOfSession: ").append(toIndentedString(dateOfSession)).append("\n");
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

