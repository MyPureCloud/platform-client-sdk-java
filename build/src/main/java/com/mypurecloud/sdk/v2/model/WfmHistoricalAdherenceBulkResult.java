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
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceBulkUserResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceBulkResult
 */

public class WfmHistoricalAdherenceBulkResult  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private String managementUnitId = null;
  private List<WfmHistoricalAdherenceBulkUserResult> userResults = null;
  private Map<String, String> lookupIdToSecondaryPresenceId = null;

  public WfmHistoricalAdherenceBulkResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userResults = new ArrayList<WfmHistoricalAdherenceBulkUserResult>();
    }
  }

  
  /**
   * Beginning of the date range for this result in ISO-8601 format
   **/
  public WfmHistoricalAdherenceBulkResult startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Beginning of the date range for this result in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * End of the date range for this result in ISO-8601 format
   **/
  public WfmHistoricalAdherenceBulkResult endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End of the date range for this result in ISO-8601 format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * The ID of the management unit for this result
   **/
  public WfmHistoricalAdherenceBulkResult managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the management unit for this result")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   * The individual results for each user
   **/
  public WfmHistoricalAdherenceBulkResult userResults(List<WfmHistoricalAdherenceBulkUserResult> userResults) {
    this.userResults = userResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The individual results for each user")
  @JsonProperty("userResults")
  public List<WfmHistoricalAdherenceBulkUserResult> getUserResults() {
    return userResults;
  }
  public void setUserResults(List<WfmHistoricalAdherenceBulkUserResult> userResults) {
    this.userResults = userResults;
  }


  /**
   * Map of secondary presence lookup ID to corresponding secondary presence ID
   **/
  public WfmHistoricalAdherenceBulkResult lookupIdToSecondaryPresenceId(Map<String, String> lookupIdToSecondaryPresenceId) {
    this.lookupIdToSecondaryPresenceId = lookupIdToSecondaryPresenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of secondary presence lookup ID to corresponding secondary presence ID")
  @JsonProperty("lookupIdToSecondaryPresenceId")
  public Map<String, String> getLookupIdToSecondaryPresenceId() {
    return lookupIdToSecondaryPresenceId;
  }
  public void setLookupIdToSecondaryPresenceId(Map<String, String> lookupIdToSecondaryPresenceId) {
    this.lookupIdToSecondaryPresenceId = lookupIdToSecondaryPresenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceBulkResult wfmHistoricalAdherenceBulkResult = (WfmHistoricalAdherenceBulkResult) o;

    return Objects.equals(this.startDate, wfmHistoricalAdherenceBulkResult.startDate) &&
            Objects.equals(this.endDate, wfmHistoricalAdherenceBulkResult.endDate) &&
            Objects.equals(this.managementUnitId, wfmHistoricalAdherenceBulkResult.managementUnitId) &&
            Objects.equals(this.userResults, wfmHistoricalAdherenceBulkResult.userResults) &&
            Objects.equals(this.lookupIdToSecondaryPresenceId, wfmHistoricalAdherenceBulkResult.lookupIdToSecondaryPresenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, managementUnitId, userResults, lookupIdToSecondaryPresenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceBulkResult {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    userResults: ").append(toIndentedString(userResults)).append("\n");
    sb.append("    lookupIdToSecondaryPresenceId: ").append(toIndentedString(lookupIdToSecondaryPresenceId)).append("\n");
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

