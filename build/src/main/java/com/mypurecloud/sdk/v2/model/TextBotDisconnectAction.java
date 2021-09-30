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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Settings for a next-action of disconnecting, including the reason code for the disconnect.
 */
@ApiModel(description = "Settings for a next-action of disconnecting, including the reason code for the disconnect.")

public class TextBotDisconnectAction  implements Serializable {
  

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
   * The reason for the disconnect.
   */
 @JsonDeserialize(using = ReasonEnumDeserializer.class)
  public enum ReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TRIGGEREDBYUSER("TriggeredByUser"),
    TRIGGEREDBYFLOW("TriggeredByFlow"),
    SESSIONEXPIRED("SessionExpired"),
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
  private TextBotFlowLocation flowLocation = null;
  private List<TextBotFlowOutcome> flowOutcomes = new ArrayList<TextBotFlowOutcome>();

  
  /**
   * The reason for the disconnect.
   **/
  public TextBotDisconnectAction reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reason for the disconnect.")
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
  public TextBotDisconnectAction reasonExtendedInfo(String reasonExtendedInfo) {
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
   * Describes where in the Bot Flow the user was when the disconnect occurred.
   **/
  public TextBotDisconnectAction flowLocation(TextBotFlowLocation flowLocation) {
    this.flowLocation = flowLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes where in the Bot Flow the user was when the disconnect occurred.")
  @JsonProperty("flowLocation")
  public TextBotFlowLocation getFlowLocation() {
    return flowLocation;
  }
  public void setFlowLocation(TextBotFlowLocation flowLocation) {
    this.flowLocation = flowLocation;
  }

  
  /**
   * The list of Flow Outcomes for the bot flow and their details.
   **/
  public TextBotDisconnectAction flowOutcomes(List<TextBotFlowOutcome> flowOutcomes) {
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
    TextBotDisconnectAction textBotDisconnectAction = (TextBotDisconnectAction) o;
    return Objects.equals(this.reason, textBotDisconnectAction.reason) &&
        Objects.equals(this.reasonExtendedInfo, textBotDisconnectAction.reasonExtendedInfo) &&
        Objects.equals(this.flowLocation, textBotDisconnectAction.flowLocation) &&
        Objects.equals(this.flowOutcomes, textBotDisconnectAction.flowOutcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, reasonExtendedInfo, flowLocation, flowOutcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotDisconnectAction {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reasonExtendedInfo: ").append(toIndentedString(reasonExtendedInfo)).append("\n");
    sb.append("    flowLocation: ").append(toIndentedString(flowLocation)).append("\n");
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

