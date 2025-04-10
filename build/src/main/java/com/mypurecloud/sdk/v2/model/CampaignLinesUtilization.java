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
 * CampaignLinesUtilization
 */

public class CampaignLinesUtilization  implements Serializable {
  
  private Integer assignedOutboundLines = null;
  private Integer totalAvailableOutboundLines = null;

  public CampaignLinesUtilization() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Number of outbound lines assigned to the campaign
   **/
  public CampaignLinesUtilization assignedOutboundLines(Integer assignedOutboundLines) {
    this.assignedOutboundLines = assignedOutboundLines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of outbound lines assigned to the campaign")
  @JsonProperty("assignedOutboundLines")
  public Integer getAssignedOutboundLines() {
    return assignedOutboundLines;
  }
  public void setAssignedOutboundLines(Integer assignedOutboundLines) {
    this.assignedOutboundLines = assignedOutboundLines;
  }


  /**
   * Total number of available outbound lines in Campaign's Edge Group or Site
   **/
  public CampaignLinesUtilization totalAvailableOutboundLines(Integer totalAvailableOutboundLines) {
    this.totalAvailableOutboundLines = totalAvailableOutboundLines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of available outbound lines in Campaign's Edge Group or Site")
  @JsonProperty("totalAvailableOutboundLines")
  public Integer getTotalAvailableOutboundLines() {
    return totalAvailableOutboundLines;
  }
  public void setTotalAvailableOutboundLines(Integer totalAvailableOutboundLines) {
    this.totalAvailableOutboundLines = totalAvailableOutboundLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignLinesUtilization campaignLinesUtilization = (CampaignLinesUtilization) o;

    return Objects.equals(this.assignedOutboundLines, campaignLinesUtilization.assignedOutboundLines) &&
            Objects.equals(this.totalAvailableOutboundLines, campaignLinesUtilization.totalAvailableOutboundLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedOutboundLines, totalAvailableOutboundLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignLinesUtilization {\n");
    
    sb.append("    assignedOutboundLines: ").append(toIndentedString(assignedOutboundLines)).append("\n");
    sb.append("    totalAvailableOutboundLines: ").append(toIndentedString(totalAvailableOutboundLines)).append("\n");
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

