package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AnalyticsFlowOutcome;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsFlow
 */

public class AnalyticsFlow  implements Serializable {
  
  private String flowId = null;
  private String flowName = null;
  private String flowVersion = null;

  /**
   * The type of this flow
   */
  public enum FlowTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOT("BOT"),
    COMMONMODULE("COMMONMODULE"),
    INBOUNDCALL("INBOUNDCALL"),
    INBOUNDCHAT("INBOUNDCHAT"),
    INBOUNDEMAIL("INBOUNDEMAIL"),
    INBOUNDSHORTMESSAGE("INBOUNDSHORTMESSAGE"),
    INQUEUECALL("INQUEUECALL"),
    OUTBOUNDCALL("OUTBOUNDCALL"),
    SECURECALL("SECURECALL"),
    SPEECH("SPEECH"),
    SURVEYINVITE("SURVEYINVITE"),
    WORKFLOW("WORKFLOW");

    private String value;

    FlowTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FlowTypeEnum value : FlowTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlowTypeEnum flowType = null;
  private String exitReason = null;
  private String entryReason = null;

  /**
   * The entry type for this flow
   */
  public enum EntryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DNIS("dnis"),
    DIRECT("direct"),
    FLOW("flow"),
    AGENT("agent"),
    OUTBOUND("outbound");

    private String value;

    EntryTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EntryTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EntryTypeEnum value : EntryTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EntryTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EntryTypeEnum entryType = null;
  private String transferType = null;
  private String transferTargetName = null;
  private String transferTargetAddress = null;
  private Boolean issuedCallback = null;
  private String startingLanguage = null;
  private String endingLanguage = null;
  private List<AnalyticsFlowOutcome> outcomes = new ArrayList<AnalyticsFlowOutcome>();

  
  /**
   * The unique identifier of this flow
   **/
  public AnalyticsFlow flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of this flow")
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  
  /**
   * The name of this flow
   **/
  public AnalyticsFlow flowName(String flowName) {
    this.flowName = flowName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of this flow")
  @JsonProperty("flowName")
  public String getFlowName() {
    return flowName;
  }
  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }

  
  /**
   * The version of this flow
   **/
  public AnalyticsFlow flowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of this flow")
  @JsonProperty("flowVersion")
  public String getFlowVersion() {
    return flowVersion;
  }
  public void setFlowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
  }

  
  /**
   * The type of this flow
   **/
  public AnalyticsFlow flowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of this flow")
  @JsonProperty("flowType")
  public FlowTypeEnum getFlowType() {
    return flowType;
  }
  public void setFlowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
  }

  
  /**
   * The exit reason for this flow, e.g. DISCONNECT
   **/
  public AnalyticsFlow exitReason(String exitReason) {
    this.exitReason = exitReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The exit reason for this flow, e.g. DISCONNECT")
  @JsonProperty("exitReason")
  public String getExitReason() {
    return exitReason;
  }
  public void setExitReason(String exitReason) {
    this.exitReason = exitReason;
  }

  
  /**
   * The particular entry reason for this flow, e.g. an address, userId, or flowId
   **/
  public AnalyticsFlow entryReason(String entryReason) {
    this.entryReason = entryReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The particular entry reason for this flow, e.g. an address, userId, or flowId")
  @JsonProperty("entryReason")
  public String getEntryReason() {
    return entryReason;
  }
  public void setEntryReason(String entryReason) {
    this.entryReason = entryReason;
  }

  
  /**
   * The entry type for this flow
   **/
  public AnalyticsFlow entryType(EntryTypeEnum entryType) {
    this.entryType = entryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entry type for this flow")
  @JsonProperty("entryType")
  public EntryTypeEnum getEntryType() {
    return entryType;
  }
  public void setEntryType(EntryTypeEnum entryType) {
    this.entryType = entryType;
  }

  
  /**
   * The type of transfer for flows that ended with a transfer
   **/
  public AnalyticsFlow transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of transfer for flows that ended with a transfer")
  @JsonProperty("transferType")
  public String getTransferType() {
    return transferType;
  }
  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  
  /**
   * The name of a transfer target
   **/
  public AnalyticsFlow transferTargetName(String transferTargetName) {
    this.transferTargetName = transferTargetName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of a transfer target")
  @JsonProperty("transferTargetName")
  public String getTransferTargetName() {
    return transferTargetName;
  }
  public void setTransferTargetName(String transferTargetName) {
    this.transferTargetName = transferTargetName;
  }

  
  /**
   * The address of a transfer target
   **/
  public AnalyticsFlow transferTargetAddress(String transferTargetAddress) {
    this.transferTargetAddress = transferTargetAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address of a transfer target")
  @JsonProperty("transferTargetAddress")
  public String getTransferTargetAddress() {
    return transferTargetAddress;
  }
  public void setTransferTargetAddress(String transferTargetAddress) {
    this.transferTargetAddress = transferTargetAddress;
  }

  
  /**
   * Flag indicating whether the flow issued a callback
   **/
  public AnalyticsFlow issuedCallback(Boolean issuedCallback) {
    this.issuedCallback = issuedCallback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag indicating whether the flow issued a callback")
  @JsonProperty("issuedCallback")
  public Boolean getIssuedCallback() {
    return issuedCallback;
  }
  public void setIssuedCallback(Boolean issuedCallback) {
    this.issuedCallback = issuedCallback;
  }

  
  /**
   * Flow starting language, e.g. en-us
   **/
  public AnalyticsFlow startingLanguage(String startingLanguage) {
    this.startingLanguage = startingLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow starting language, e.g. en-us")
  @JsonProperty("startingLanguage")
  public String getStartingLanguage() {
    return startingLanguage;
  }
  public void setStartingLanguage(String startingLanguage) {
    this.startingLanguage = startingLanguage;
  }

  
  /**
   * Flow ending language, e.g. en-us
   **/
  public AnalyticsFlow endingLanguage(String endingLanguage) {
    this.endingLanguage = endingLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow ending language, e.g. en-us")
  @JsonProperty("endingLanguage")
  public String getEndingLanguage() {
    return endingLanguage;
  }
  public void setEndingLanguage(String endingLanguage) {
    this.endingLanguage = endingLanguage;
  }

  
  /**
   * Flow outcomes
   **/
  public AnalyticsFlow outcomes(List<AnalyticsFlowOutcome> outcomes) {
    this.outcomes = outcomes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow outcomes")
  @JsonProperty("outcomes")
  public List<AnalyticsFlowOutcome> getOutcomes() {
    return outcomes;
  }
  public void setOutcomes(List<AnalyticsFlowOutcome> outcomes) {
    this.outcomes = outcomes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsFlow analyticsFlow = (AnalyticsFlow) o;
    return Objects.equals(this.flowId, analyticsFlow.flowId) &&
        Objects.equals(this.flowName, analyticsFlow.flowName) &&
        Objects.equals(this.flowVersion, analyticsFlow.flowVersion) &&
        Objects.equals(this.flowType, analyticsFlow.flowType) &&
        Objects.equals(this.exitReason, analyticsFlow.exitReason) &&
        Objects.equals(this.entryReason, analyticsFlow.entryReason) &&
        Objects.equals(this.entryType, analyticsFlow.entryType) &&
        Objects.equals(this.transferType, analyticsFlow.transferType) &&
        Objects.equals(this.transferTargetName, analyticsFlow.transferTargetName) &&
        Objects.equals(this.transferTargetAddress, analyticsFlow.transferTargetAddress) &&
        Objects.equals(this.issuedCallback, analyticsFlow.issuedCallback) &&
        Objects.equals(this.startingLanguage, analyticsFlow.startingLanguage) &&
        Objects.equals(this.endingLanguage, analyticsFlow.endingLanguage) &&
        Objects.equals(this.outcomes, analyticsFlow.outcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowId, flowName, flowVersion, flowType, exitReason, entryReason, entryType, transferType, transferTargetName, transferTargetAddress, issuedCallback, startingLanguage, endingLanguage, outcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsFlow {\n");
    
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
    sb.append("    exitReason: ").append(toIndentedString(exitReason)).append("\n");
    sb.append("    entryReason: ").append(toIndentedString(entryReason)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    transferTargetName: ").append(toIndentedString(transferTargetName)).append("\n");
    sb.append("    transferTargetAddress: ").append(toIndentedString(transferTargetAddress)).append("\n");
    sb.append("    issuedCallback: ").append(toIndentedString(issuedCallback)).append("\n");
    sb.append("    startingLanguage: ").append(toIndentedString(startingLanguage)).append("\n");
    sb.append("    endingLanguage: ").append(toIndentedString(endingLanguage)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
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

