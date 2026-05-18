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
import com.mypurecloud.sdk.v2.model.CampaignDiagnosticCampaignHealthState;
import com.mypurecloud.sdk.v2.model.CampaignDiagnosticCampaignState;
import com.mypurecloud.sdk.v2.model.CampaignDiagnosticConfigChange;
import com.mypurecloud.sdk.v2.model.CampaignDiagnosticWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignDiagnosticSummary
 */

public class CampaignDiagnosticSummary  implements Serializable {
  
  private String campaignId = null;
  private Date dateStart = null;
  private Date dateEnd = null;
  private List<CampaignDiagnosticCampaignState> campaignStates = null;
  private List<CampaignDiagnosticWindow> campaignInfo = null;
  private List<CampaignDiagnosticCampaignHealthState> campaignHealthStates = null;
  private List<CampaignDiagnosticConfigChange> configChanges = null;

  public CampaignDiagnosticSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      campaignStates = new ArrayList<CampaignDiagnosticCampaignState>();
      campaignInfo = new ArrayList<CampaignDiagnosticWindow>();
      campaignHealthStates = new ArrayList<CampaignDiagnosticCampaignHealthState>();
      configChanges = new ArrayList<CampaignDiagnosticConfigChange>();
    }
  }

  public CampaignDiagnosticSummary(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      campaignStates = new ArrayList<CampaignDiagnosticCampaignState>();
      campaignInfo = new ArrayList<CampaignDiagnosticWindow>();
      campaignHealthStates = new ArrayList<CampaignDiagnosticCampaignHealthState>();
      configChanges = new ArrayList<CampaignDiagnosticConfigChange>();
    }
  }

  
  /**
   * Campaign ID
   **/
  public CampaignDiagnosticSummary campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Campaign ID")
  @JsonProperty("campaignId")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  /**
   * Start of the interval. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignDiagnosticSummary dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start of the interval. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * End of the interval. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignDiagnosticSummary dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End of the interval. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * Array of campaign states
   **/
  public CampaignDiagnosticSummary campaignStates(List<CampaignDiagnosticCampaignState> campaignStates) {
    this.campaignStates = campaignStates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of campaign states")
  @JsonProperty("campaignStates")
  public List<CampaignDiagnosticCampaignState> getCampaignStates() {
    return campaignStates;
  }
  public void setCampaignStates(List<CampaignDiagnosticCampaignState> campaignStates) {
    this.campaignStates = campaignStates;
  }


  /**
   * Array of diagnostic windows
   **/
  public CampaignDiagnosticSummary campaignInfo(List<CampaignDiagnosticWindow> campaignInfo) {
    this.campaignInfo = campaignInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of diagnostic windows")
  @JsonProperty("campaignInfo")
  public List<CampaignDiagnosticWindow> getCampaignInfo() {
    return campaignInfo;
  }
  public void setCampaignInfo(List<CampaignDiagnosticWindow> campaignInfo) {
    this.campaignInfo = campaignInfo;
  }


  /**
   * Array of campaign health states
   **/
  public CampaignDiagnosticSummary campaignHealthStates(List<CampaignDiagnosticCampaignHealthState> campaignHealthStates) {
    this.campaignHealthStates = campaignHealthStates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of campaign health states")
  @JsonProperty("campaignHealthStates")
  public List<CampaignDiagnosticCampaignHealthState> getCampaignHealthStates() {
    return campaignHealthStates;
  }
  public void setCampaignHealthStates(List<CampaignDiagnosticCampaignHealthState> campaignHealthStates) {
    this.campaignHealthStates = campaignHealthStates;
  }


  /**
   * Configuration changes occurring within the time window
   **/
  public CampaignDiagnosticSummary configChanges(List<CampaignDiagnosticConfigChange> configChanges) {
    this.configChanges = configChanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration changes occurring within the time window")
  @JsonProperty("configChanges")
  public List<CampaignDiagnosticConfigChange> getConfigChanges() {
    return configChanges;
  }
  public void setConfigChanges(List<CampaignDiagnosticConfigChange> configChanges) {
    this.configChanges = configChanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDiagnosticSummary campaignDiagnosticSummary = (CampaignDiagnosticSummary) o;

    return Objects.equals(this.campaignId, campaignDiagnosticSummary.campaignId) &&
            Objects.equals(this.dateStart, campaignDiagnosticSummary.dateStart) &&
            Objects.equals(this.dateEnd, campaignDiagnosticSummary.dateEnd) &&
            Objects.equals(this.campaignStates, campaignDiagnosticSummary.campaignStates) &&
            Objects.equals(this.campaignInfo, campaignDiagnosticSummary.campaignInfo) &&
            Objects.equals(this.campaignHealthStates, campaignDiagnosticSummary.campaignHealthStates) &&
            Objects.equals(this.configChanges, campaignDiagnosticSummary.configChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, dateStart, dateEnd, campaignStates, campaignInfo, campaignHealthStates, configChanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDiagnosticSummary {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    campaignStates: ").append(toIndentedString(campaignStates)).append("\n");
    sb.append("    campaignInfo: ").append(toIndentedString(campaignInfo)).append("\n");
    sb.append("    campaignHealthStates: ").append(toIndentedString(campaignHealthStates)).append("\n");
    sb.append("    configChanges: ").append(toIndentedString(configChanges)).append("\n");
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

