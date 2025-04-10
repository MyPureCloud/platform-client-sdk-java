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

import java.io.Serializable;
/**
 * SnapshotInfo
 */

public class SnapshotInfo  implements Serializable {
  
  private Integer version = null;
  private String snapshotId = null;
  private String sessionId = null;
  private String businessUnitId = null;
  private Integer planningGroupsVersion = null;

  public SnapshotInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Version of the snapshot
   **/
  public SnapshotInfo version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version of the snapshot")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * Snapshot Id of the continuous forecast session
   **/
  public SnapshotInfo snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Snapshot Id of the continuous forecast session")
  @JsonProperty("snapshotId")
  public String getSnapshotId() {
    return snapshotId;
  }
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }


  /**
   * Session Id of the continuous forecast session
   **/
  public SnapshotInfo sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session Id of the continuous forecast session")
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
  public SnapshotInfo businessUnitId(String businessUnitId) {
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
  public SnapshotInfo planningGroupsVersion(Integer planningGroupsVersion) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotInfo snapshotInfo = (SnapshotInfo) o;

    return Objects.equals(this.version, snapshotInfo.version) &&
            Objects.equals(this.snapshotId, snapshotInfo.snapshotId) &&
            Objects.equals(this.sessionId, snapshotInfo.sessionId) &&
            Objects.equals(this.businessUnitId, snapshotInfo.businessUnitId) &&
            Objects.equals(this.planningGroupsVersion, snapshotInfo.planningGroupsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, snapshotId, sessionId, businessUnitId, planningGroupsVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotInfo {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    planningGroupsVersion: ").append(toIndentedString(planningGroupsVersion)).append("\n");
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

