package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.TextBotFlowLocation;
import com.mypurecloud.sdk.v2.model.TextBotFlowOutcome;
import com.mypurecloud.sdk.v2.model.TextBotInputOutputData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Settings for a next-action of exiting the bot flow. Any output variables are available in the details.
 */
@ApiModel(description = "Settings for a next-action of exiting the bot flow. Any output variables are available in the details.")

public class TextBotExitAction  implements Serializable {
  

  private static class ReasonEnumDeserializer extends StdDeserializer<ReasonEnum> {
    public ReasonEnumDeserializer() {
      super(ReasonEnumDeserializer.class);
    }

    @Override
    public ReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason for the exit.
   */
 @JsonDeserialize(using = ReasonEnumDeserializer.class)
  public enum ReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TRIGGEREDBYUSER("TriggeredByUser"),
    AGENTREQUESTEDBYUSER("AgentRequestedByUser"),
    TRIGGEREDBYFLOW("TriggeredByFlow"),
    ERROR("Error"),
    RECOGNITIONFAILURE("RecognitionFailure");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReasonEnum fromString(String key) {
      if (key == null) return null;

      for (ReasonEnum value : ReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReasonEnum reason = null;
  private String reasonExtendedInfo = null;
  private String activeIntent = null;
  private TextBotFlowLocation flowLocation = null;
  private TextBotInputOutputData outputData = null;
  private List<TextBotFlowOutcome> flowOutcomes = new ArrayList<TextBotFlowOutcome>();

  
  /**
   * The reason for the exit.
   **/
  public TextBotExitAction reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reason for the exit.")
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  
  /**
   * Extended information related to the reason, if available.
   **/
  public TextBotExitAction reasonExtendedInfo(String reasonExtendedInfo) {
    this.reasonExtendedInfo = reasonExtendedInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Extended information related to the reason, if available.")
  @JsonProperty("reasonExtendedInfo")
  public String getReasonExtendedInfo() {
    return reasonExtendedInfo;
  }
  public void setReasonExtendedInfo(String reasonExtendedInfo) {
    this.reasonExtendedInfo = reasonExtendedInfo;
  }

  
  /**
   * The active intent at the time of the exit.
   **/
  public TextBotExitAction activeIntent(String activeIntent) {
    this.activeIntent = activeIntent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The active intent at the time of the exit.")
  @JsonProperty("activeIntent")
  public String getActiveIntent() {
    return activeIntent;
  }
  public void setActiveIntent(String activeIntent) {
    this.activeIntent = activeIntent;
  }

  
  /**
   * Describes where in the Bot Flow the user was when the exit occurred.
   **/
  public TextBotExitAction flowLocation(TextBotFlowLocation flowLocation) {
    this.flowLocation = flowLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes where in the Bot Flow the user was when the exit occurred.")
  @JsonProperty("flowLocation")
  public TextBotFlowLocation getFlowLocation() {
    return flowLocation;
  }
  public void setFlowLocation(TextBotFlowLocation flowLocation) {
    this.flowLocation = flowLocation;
  }

  
  /**
   * The output data for the bot flow.
   **/
  public TextBotExitAction outputData(TextBotInputOutputData outputData) {
    this.outputData = outputData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The output data for the bot flow.")
  @JsonProperty("outputData")
  public TextBotInputOutputData getOutputData() {
    return outputData;
  }
  public void setOutputData(TextBotInputOutputData outputData) {
    this.outputData = outputData;
  }

  
  /**
   * The list of Flow Outcomes for the bot flow and their details.
   **/
  public TextBotExitAction flowOutcomes(List<TextBotFlowOutcome> flowOutcomes) {
    this.flowOutcomes = flowOutcomes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Flow Outcomes for the bot flow and their details.")
  @JsonProperty("flowOutcomes")
  public List<TextBotFlowOutcome> getFlowOutcomes() {
    return flowOutcomes;
  }
  public void setFlowOutcomes(List<TextBotFlowOutcome> flowOutcomes) {
    this.flowOutcomes = flowOutcomes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotExitAction textBotExitAction = (TextBotExitAction) o;
    return Objects.equals(this.reason, textBotExitAction.reason) &&
        Objects.equals(this.reasonExtendedInfo, textBotExitAction.reasonExtendedInfo) &&
        Objects.equals(this.activeIntent, textBotExitAction.activeIntent) &&
        Objects.equals(this.flowLocation, textBotExitAction.flowLocation) &&
        Objects.equals(this.outputData, textBotExitAction.outputData) &&
        Objects.equals(this.flowOutcomes, textBotExitAction.flowOutcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, reasonExtendedInfo, activeIntent, flowLocation, outputData, flowOutcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotExitAction {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reasonExtendedInfo: ").append(toIndentedString(reasonExtendedInfo)).append("\n");
    sb.append("    activeIntent: ").append(toIndentedString(activeIntent)).append("\n");
    sb.append("    flowLocation: ").append(toIndentedString(flowLocation)).append("\n");
    sb.append("    outputData: ").append(toIndentedString(outputData)).append("\n");
    sb.append("    flowOutcomes: ").append(toIndentedString(flowOutcomes)).append("\n");
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

