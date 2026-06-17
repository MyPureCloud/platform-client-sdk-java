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
import com.mypurecloud.sdk.v2.model.AgentAssignedScheduleSetList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * AgentEffectiveBid
 */

public class AgentEffectiveBid  implements Serializable {
  
  private String id = null;
  private String name = null;
  private LocalDate effectiveDate = null;
  private LocalDate endDate = null;
  private String downloadUrl = null;
  private AgentAssignedScheduleSetList downloadTemplate = null;
  private String selfUri = null;

  public AgentEffectiveBid() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentEffectiveBid(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the schedule bid
   **/
  public AgentEffectiveBid id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the schedule bid")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public AgentEffectiveBid name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The effective date of the bid relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AgentEffectiveBid effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The effective date of the bid relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("effectiveDate")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  /**
   * The end date of the bid, relative to the business unit time zone in yyyy-MM-dd format. Null denotes an active schedule bid. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AgentEffectiveBid endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date of the bid, relative to the business unit time zone in yyyy-MM-dd format. Null denotes an active schedule bid. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  /**
   * The download URL to fetch the list of schedule sets and the agents assigned to them
   **/
  public AgentEffectiveBid downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The download URL to fetch the list of schedule sets and the agents assigned to them")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * This field will always be null. Effective schedule sets are returned through the download URL. The schema is included here for documentation purposes
   **/
  public AgentEffectiveBid downloadTemplate(AgentAssignedScheduleSetList downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field will always be null. Effective schedule sets are returned through the download URL. The schema is included here for documentation purposes")
  @JsonProperty("downloadTemplate")
  public AgentAssignedScheduleSetList getDownloadTemplate() {
    return downloadTemplate;
  }
  public void setDownloadTemplate(AgentAssignedScheduleSetList downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentEffectiveBid agentEffectiveBid = (AgentEffectiveBid) o;

    return Objects.equals(this.id, agentEffectiveBid.id) &&
            Objects.equals(this.name, agentEffectiveBid.name) &&
            Objects.equals(this.effectiveDate, agentEffectiveBid.effectiveDate) &&
            Objects.equals(this.endDate, agentEffectiveBid.endDate) &&
            Objects.equals(this.downloadUrl, agentEffectiveBid.downloadUrl) &&
            Objects.equals(this.downloadTemplate, agentEffectiveBid.downloadTemplate) &&
            Objects.equals(this.selfUri, agentEffectiveBid.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, effectiveDate, endDate, downloadUrl, downloadTemplate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentEffectiveBid {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadTemplate: ").append(toIndentedString(downloadTemplate)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

