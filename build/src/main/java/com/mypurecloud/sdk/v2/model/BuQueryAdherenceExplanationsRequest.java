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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuQueryAdherenceExplanationsRequest
 */

public class BuQueryAdherenceExplanationsRequest  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private List<String> managementUnitIds = null;
  private List<String> agentIds = null;

  public BuQueryAdherenceExplanationsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      managementUnitIds = new ArrayList<String>();
      agentIds = new ArrayList<String>();
    }
  }

  
  /**
   * The start date of the range to query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuQueryAdherenceExplanationsRequest startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date of the range to query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The end date of the range to query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuQueryAdherenceExplanationsRequest endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end date of the range to query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * A filter for which management units to query. Leave empty or omit entirely for all management units in the business unit
   **/
  public BuQueryAdherenceExplanationsRequest managementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A filter for which management units to query. Leave empty or omit entirely for all management units in the business unit")
  @JsonProperty("managementUnitIds")
  public List<String> getManagementUnitIds() {
    return managementUnitIds;
  }
  public void setManagementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
  }


  /**
   * A filter for which agents within the business unit to query. Leave empty or omit entirely for all agents in the business unit (or management units if specified)
   **/
  public BuQueryAdherenceExplanationsRequest agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A filter for which agents within the business unit to query. Leave empty or omit entirely for all agents in the business unit (or management units if specified)")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuQueryAdherenceExplanationsRequest buQueryAdherenceExplanationsRequest = (BuQueryAdherenceExplanationsRequest) o;

    return Objects.equals(this.startDate, buQueryAdherenceExplanationsRequest.startDate) &&
            Objects.equals(this.endDate, buQueryAdherenceExplanationsRequest.endDate) &&
            Objects.equals(this.managementUnitIds, buQueryAdherenceExplanationsRequest.managementUnitIds) &&
            Objects.equals(this.agentIds, buQueryAdherenceExplanationsRequest.agentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, managementUnitIds, agentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuQueryAdherenceExplanationsRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    managementUnitIds: ").append(toIndentedString(managementUnitIds)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
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

