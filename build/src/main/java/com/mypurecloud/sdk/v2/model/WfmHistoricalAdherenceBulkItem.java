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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceBulkItem
 */

public class WfmHistoricalAdherenceBulkItem  implements Serializable {
  
  private String managementUnitId = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<String> userIds = new ArrayList<String>();
  private Boolean includeExceptions = null;
  private Boolean includeActuals = null;

  
  /**
   * The ID of the management unit to query
   **/
  public WfmHistoricalAdherenceBulkItem managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the management unit to query")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   * Beginning of the date range to query in ISO-8601 format
   **/
  public WfmHistoricalAdherenceBulkItem startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Beginning of the date range to query in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * End of the date range to query in ISO-8601 format
   **/
  public WfmHistoricalAdherenceBulkItem endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End of the date range to query in ISO-8601 format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * The IDs of the users to query. If not included, will query every user in the management unit
   **/
  public WfmHistoricalAdherenceBulkItem userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the users to query. If not included, will query every user in the management unit")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * Whether user exceptions should be returned as part of the results. Defaults to false if not specified.
   **/
  public WfmHistoricalAdherenceBulkItem includeExceptions(Boolean includeExceptions) {
    this.includeExceptions = includeExceptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether user exceptions should be returned as part of the results. Defaults to false if not specified.")
  @JsonProperty("includeExceptions")
  public Boolean getIncludeExceptions() {
    return includeExceptions;
  }
  public void setIncludeExceptions(Boolean includeExceptions) {
    this.includeExceptions = includeExceptions;
  }


  /**
   * Whether user actual activities should be returned as part of the results. Defaults to false if not specified.
   **/
  public WfmHistoricalAdherenceBulkItem includeActuals(Boolean includeActuals) {
    this.includeActuals = includeActuals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether user actual activities should be returned as part of the results. Defaults to false if not specified.")
  @JsonProperty("includeActuals")
  public Boolean getIncludeActuals() {
    return includeActuals;
  }
  public void setIncludeActuals(Boolean includeActuals) {
    this.includeActuals = includeActuals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceBulkItem wfmHistoricalAdherenceBulkItem = (WfmHistoricalAdherenceBulkItem) o;

    return Objects.equals(this.managementUnitId, wfmHistoricalAdherenceBulkItem.managementUnitId) &&
            Objects.equals(this.startDate, wfmHistoricalAdherenceBulkItem.startDate) &&
            Objects.equals(this.endDate, wfmHistoricalAdherenceBulkItem.endDate) &&
            Objects.equals(this.userIds, wfmHistoricalAdherenceBulkItem.userIds) &&
            Objects.equals(this.includeExceptions, wfmHistoricalAdherenceBulkItem.includeExceptions) &&
            Objects.equals(this.includeActuals, wfmHistoricalAdherenceBulkItem.includeActuals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitId, startDate, endDate, userIds, includeExceptions, includeActuals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceBulkItem {\n");
    
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    includeExceptions: ").append(toIndentedString(includeExceptions)).append("\n");
    sb.append("    includeActuals: ").append(toIndentedString(includeActuals)).append("\n");
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

