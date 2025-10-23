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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.CampaignBusinessCategoryMetrics;
import com.mypurecloud.sdk.v2.model.CampaignLinesUtilization;
import com.mypurecloud.sdk.v2.model.CampaignPerformanceDataContactRate;
import com.mypurecloud.sdk.v2.model.CampaignPerformanceDataProgress;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * CampaignPerformanceData
 */

public class CampaignPerformanceData  implements Serializable {
  
  private DomainEntityRef campaign = null;
  private AddressableEntityRef division = null;
  private CampaignPerformanceDataContactRate contactRate = null;
  private Integer idleAgents = null;
  private BigDecimal effectiveIdleAgents = null;
  private BigDecimal adjustedCallsPerAgent = null;
  private Integer outstandingCalls = null;
  private Integer scheduledCalls = null;
  private Integer rightPartyContactsCount = null;

  private static class CampaignStatusEnumDeserializer extends StdDeserializer<CampaignStatusEnum> {
    public CampaignStatusEnumDeserializer() {
      super(CampaignStatusEnumDeserializer.class);
    }

    @Override
    public CampaignStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CampaignStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the campaign
   */
 @JsonDeserialize(using = CampaignStatusEnumDeserializer.class)
  public enum CampaignStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("on"),
    STOPPING("stopping"),
    OFF("off"),
    COMPLETE("complete"),
    INVALID("invalid"),
    FORCED_OFF("forced_off"),
    FORCED_STOPPING("forced_stopping");

    private String value;

    CampaignStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CampaignStatusEnum fromString(String key) {
      if (key == null) return null;

      for (CampaignStatusEnum value : CampaignStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CampaignStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CampaignStatusEnum campaignStatus = null;

  private static class DialingModeEnumDeserializer extends StdDeserializer<DialingModeEnum> {
    public DialingModeEnumDeserializer() {
      super(DialingModeEnumDeserializer.class);
    }

    @Override
    public DialingModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DialingModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The strategy this Campaign will use for dialing
   */
 @JsonDeserialize(using = DialingModeEnumDeserializer.class)
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLESS("agentless"),
    PREVIEW("preview"),
    POWER("power"),
    PREDICTIVE("predictive"),
    PROGRESSIVE("progressive"),
    EXTERNAL("external");

    private String value;

    DialingModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DialingModeEnum fromString(String key) {
      if (key == null) return null;

      for (DialingModeEnum value : DialingModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DialingModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DialingModeEnum dialingMode = null;
  private CampaignPerformanceDataProgress progress = null;
  private CampaignLinesUtilization linesUtilization = null;
  private CampaignBusinessCategoryMetrics businessCategoryMetrics = null;

  public CampaignPerformanceData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Identifier of the campaign
   **/
  public CampaignPerformanceData campaign(DomainEntityRef campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the campaign")
  @JsonProperty("campaign")
  public DomainEntityRef getCampaign() {
    return campaign;
  }
  public void setCampaign(DomainEntityRef campaign) {
    this.campaign = campaign;
  }


  /**
   * The division the campaign belongs to
   **/
  public CampaignPerformanceData division(AddressableEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division the campaign belongs to")
  @JsonProperty("division")
  public AddressableEntityRef getDivision() {
    return division;
  }
  public void setDivision(AddressableEntityRef division) {
    this.division = division;
  }


  /**
   * Information regarding the campaign's connect rate
   **/
  public CampaignPerformanceData contactRate(CampaignPerformanceDataContactRate contactRate) {
    this.contactRate = contactRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information regarding the campaign's connect rate")
  @JsonProperty("contactRate")
  public CampaignPerformanceDataContactRate getContactRate() {
    return contactRate;
  }
  public void setContactRate(CampaignPerformanceDataContactRate contactRate) {
    this.contactRate = contactRate;
  }


  /**
   * Number of available agents not currently being utilized
   **/
  public CampaignPerformanceData idleAgents(Integer idleAgents) {
    this.idleAgents = idleAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of available agents not currently being utilized")
  @JsonProperty("idleAgents")
  public Integer getIdleAgents() {
    return idleAgents;
  }
  public void setIdleAgents(Integer idleAgents) {
    this.idleAgents = idleAgents;
  }


  /**
   * Number of effective available agents not currently being utilized
   **/
  public CampaignPerformanceData effectiveIdleAgents(BigDecimal effectiveIdleAgents) {
    this.effectiveIdleAgents = effectiveIdleAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of effective available agents not currently being utilized")
  @JsonProperty("effectiveIdleAgents")
  public BigDecimal getEffectiveIdleAgents() {
    return effectiveIdleAgents;
  }
  public void setEffectiveIdleAgents(BigDecimal effectiveIdleAgents) {
    this.effectiveIdleAgents = effectiveIdleAgents;
  }


  /**
   * Calls per agent adjusted by pace
   **/
  public CampaignPerformanceData adjustedCallsPerAgent(BigDecimal adjustedCallsPerAgent) {
    this.adjustedCallsPerAgent = adjustedCallsPerAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Calls per agent adjusted by pace")
  @JsonProperty("adjustedCallsPerAgent")
  public BigDecimal getAdjustedCallsPerAgent() {
    return adjustedCallsPerAgent;
  }
  public void setAdjustedCallsPerAgent(BigDecimal adjustedCallsPerAgent) {
    this.adjustedCallsPerAgent = adjustedCallsPerAgent;
  }


  /**
   * Number of campaign calls currently ongoing
   **/
  public CampaignPerformanceData outstandingCalls(Integer outstandingCalls) {
    this.outstandingCalls = outstandingCalls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of campaign calls currently ongoing")
  @JsonProperty("outstandingCalls")
  public Integer getOutstandingCalls() {
    return outstandingCalls;
  }
  public void setOutstandingCalls(Integer outstandingCalls) {
    this.outstandingCalls = outstandingCalls;
  }


  /**
   * Number of campaign calls currently scheduled
   **/
  public CampaignPerformanceData scheduledCalls(Integer scheduledCalls) {
    this.scheduledCalls = scheduledCalls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of campaign calls currently scheduled")
  @JsonProperty("scheduledCalls")
  public Integer getScheduledCalls() {
    return scheduledCalls;
  }
  public void setScheduledCalls(Integer scheduledCalls) {
    this.scheduledCalls = scheduledCalls;
  }


  /**
   * Information on the campaign's number of Right Party Contacts
   **/
  public CampaignPerformanceData rightPartyContactsCount(Integer rightPartyContactsCount) {
    this.rightPartyContactsCount = rightPartyContactsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information on the campaign's number of Right Party Contacts")
  @JsonProperty("rightPartyContactsCount")
  public Integer getRightPartyContactsCount() {
    return rightPartyContactsCount;
  }
  public void setRightPartyContactsCount(Integer rightPartyContactsCount) {
    this.rightPartyContactsCount = rightPartyContactsCount;
  }


  /**
   * The status of the campaign
   **/
  public CampaignPerformanceData campaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the campaign")
  @JsonProperty("campaignStatus")
  public CampaignStatusEnum getCampaignStatus() {
    return campaignStatus;
  }
  public void setCampaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  /**
   * The strategy this Campaign will use for dialing
   **/
  public CampaignPerformanceData dialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The strategy this Campaign will use for dialing")
  @JsonProperty("dialingMode")
  public DialingModeEnum getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
  }


  /**
   * Information on the campaign's progress
   **/
  public CampaignPerformanceData progress(CampaignPerformanceDataProgress progress) {
    this.progress = progress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information on the campaign's progress")
  @JsonProperty("progress")
  public CampaignPerformanceDataProgress getProgress() {
    return progress;
  }
  public void setProgress(CampaignPerformanceDataProgress progress) {
    this.progress = progress;
  }


  /**
   * Information on the campaign's lines utilization
   **/
  public CampaignPerformanceData linesUtilization(CampaignLinesUtilization linesUtilization) {
    this.linesUtilization = linesUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information on the campaign's lines utilization")
  @JsonProperty("linesUtilization")
  public CampaignLinesUtilization getLinesUtilization() {
    return linesUtilization;
  }
  public void setLinesUtilization(CampaignLinesUtilization linesUtilization) {
    this.linesUtilization = linesUtilization;
  }


  /**
   * Information on the campaign's business category metrics
   **/
  public CampaignPerformanceData businessCategoryMetrics(CampaignBusinessCategoryMetrics businessCategoryMetrics) {
    this.businessCategoryMetrics = businessCategoryMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information on the campaign's business category metrics")
  @JsonProperty("businessCategoryMetrics")
  public CampaignBusinessCategoryMetrics getBusinessCategoryMetrics() {
    return businessCategoryMetrics;
  }
  public void setBusinessCategoryMetrics(CampaignBusinessCategoryMetrics businessCategoryMetrics) {
    this.businessCategoryMetrics = businessCategoryMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPerformanceData campaignPerformanceData = (CampaignPerformanceData) o;

    return Objects.equals(this.campaign, campaignPerformanceData.campaign) &&
            Objects.equals(this.division, campaignPerformanceData.division) &&
            Objects.equals(this.contactRate, campaignPerformanceData.contactRate) &&
            Objects.equals(this.idleAgents, campaignPerformanceData.idleAgents) &&
            Objects.equals(this.effectiveIdleAgents, campaignPerformanceData.effectiveIdleAgents) &&
            Objects.equals(this.adjustedCallsPerAgent, campaignPerformanceData.adjustedCallsPerAgent) &&
            Objects.equals(this.outstandingCalls, campaignPerformanceData.outstandingCalls) &&
            Objects.equals(this.scheduledCalls, campaignPerformanceData.scheduledCalls) &&
            Objects.equals(this.rightPartyContactsCount, campaignPerformanceData.rightPartyContactsCount) &&
            Objects.equals(this.campaignStatus, campaignPerformanceData.campaignStatus) &&
            Objects.equals(this.dialingMode, campaignPerformanceData.dialingMode) &&
            Objects.equals(this.progress, campaignPerformanceData.progress) &&
            Objects.equals(this.linesUtilization, campaignPerformanceData.linesUtilization) &&
            Objects.equals(this.businessCategoryMetrics, campaignPerformanceData.businessCategoryMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, division, contactRate, idleAgents, effectiveIdleAgents, adjustedCallsPerAgent, outstandingCalls, scheduledCalls, rightPartyContactsCount, campaignStatus, dialingMode, progress, linesUtilization, businessCategoryMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPerformanceData {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    contactRate: ").append(toIndentedString(contactRate)).append("\n");
    sb.append("    idleAgents: ").append(toIndentedString(idleAgents)).append("\n");
    sb.append("    effectiveIdleAgents: ").append(toIndentedString(effectiveIdleAgents)).append("\n");
    sb.append("    adjustedCallsPerAgent: ").append(toIndentedString(adjustedCallsPerAgent)).append("\n");
    sb.append("    outstandingCalls: ").append(toIndentedString(outstandingCalls)).append("\n");
    sb.append("    scheduledCalls: ").append(toIndentedString(scheduledCalls)).append("\n");
    sb.append("    rightPartyContactsCount: ").append(toIndentedString(rightPartyContactsCount)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    dialingMode: ").append(toIndentedString(dialingMode)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    linesUtilization: ").append(toIndentedString(linesUtilization)).append("\n");
    sb.append("    businessCategoryMetrics: ").append(toIndentedString(businessCategoryMetrics)).append("\n");
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

