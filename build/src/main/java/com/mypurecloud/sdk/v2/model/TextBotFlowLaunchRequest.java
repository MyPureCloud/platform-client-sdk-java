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
import com.mypurecloud.sdk.v2.model.TextBotChannel;
import com.mypurecloud.sdk.v2.model.TextBotFlow;
import com.mypurecloud.sdk.v2.model.TextBotInputOutputData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings for launching an instance of a bot flow.
 */
@ApiModel(description = "Settings for launching an instance of a bot flow.")

public class TextBotFlowLaunchRequest  implements Serializable {
  
  private TextBotFlow flow = null;
  private String externalSessionId = null;
  private String conversationId = null;
  private TextBotInputOutputData inputData = null;
  private TextBotChannel channel = null;

  
  /**
   * Specifies which Bot Flow to launch.
   **/
  public TextBotFlowLaunchRequest flow(TextBotFlow flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies which Bot Flow to launch.")
  @JsonProperty("flow")
  public TextBotFlow getFlow() {
    return flow;
  }
  public void setFlow(TextBotFlow flow) {
    this.flow = flow;
  }

  
  /**
   * The ID of the external session that is associated with the bot flow.
   **/
  public TextBotFlowLaunchRequest externalSessionId(String externalSessionId) {
    this.externalSessionId = externalSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the external session that is associated with the bot flow.")
  @JsonProperty("externalSessionId")
  public String getExternalSessionId() {
    return externalSessionId;
  }
  public void setExternalSessionId(String externalSessionId) {
    this.externalSessionId = externalSessionId;
  }

  
  /**
   * A conversation ID to associate with the bot flow, if available.
   **/
  public TextBotFlowLaunchRequest conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A conversation ID to associate with the bot flow, if available.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * Input values to the flow. Valid values are defined by the flow's input JSON schema.
   **/
  public TextBotFlowLaunchRequest inputData(TextBotInputOutputData inputData) {
    this.inputData = inputData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Input values to the flow. Valid values are defined by the flow's input JSON schema.")
  @JsonProperty("inputData")
  public TextBotInputOutputData getInputData() {
    return inputData;
  }
  public void setInputData(TextBotInputOutputData inputData) {
    this.inputData = inputData;
  }

  
  /**
   * Channel information relevant to the bot flow.
   **/
  public TextBotFlowLaunchRequest channel(TextBotChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Channel information relevant to the bot flow.")
  @JsonProperty("channel")
  public TextBotChannel getChannel() {
    return channel;
  }
  public void setChannel(TextBotChannel channel) {
    this.channel = channel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotFlowLaunchRequest textBotFlowLaunchRequest = (TextBotFlowLaunchRequest) o;
    return Objects.equals(this.flow, textBotFlowLaunchRequest.flow) &&
        Objects.equals(this.externalSessionId, textBotFlowLaunchRequest.externalSessionId) &&
        Objects.equals(this.conversationId, textBotFlowLaunchRequest.conversationId) &&
        Objects.equals(this.inputData, textBotFlowLaunchRequest.inputData) &&
        Objects.equals(this.channel, textBotFlowLaunchRequest.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, externalSessionId, conversationId, inputData, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotFlowLaunchRequest {\n");
    
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    externalSessionId: ").append(toIndentedString(externalSessionId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    inputData: ").append(toIndentedString(inputData)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

