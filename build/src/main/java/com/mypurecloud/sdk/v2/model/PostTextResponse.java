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
import com.mypurecloud.sdk.v2.model.PostTextMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PostTextResponse
 */

public class PostTextResponse  implements Serializable {
  

  private static class BotStateEnumDeserializer extends StdDeserializer<BotStateEnum> {
    public BotStateEnumDeserializer() {
      super(BotStateEnumDeserializer.class);
    }

    @Override
    public BotStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of the bot after completion of the request
   */
 @JsonDeserialize(using = BotStateEnumDeserializer.class)
  public enum BotStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETE("Complete"),
    FAILED("Failed"),
    MOREDATA("MoreData");

    private String value;

    BotStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotStateEnum fromString(String key) {
      if (key == null) return null;

      for (BotStateEnum value : BotStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BotStateEnum botState = null;
  private List<PostTextMessage> replyMessages = new ArrayList<PostTextMessage>();
  private String intentName = null;
  private Map<String, String> slots = null;
  private String botCorrelationId = null;
  private Map<String, Object> amazonLex = null;
  private Map<String, Object> googleDialogFlow = null;
  private Map<String, Object> genesysDialogEngine = null;
  private Map<String, Object> genesysBotConnector = null;
  private Map<String, Object> nuanceMixDlg = null;

  
  /**
   * The state of the bot after completion of the request
   **/
  public PostTextResponse botState(BotStateEnum botState) {
    this.botState = botState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the bot after completion of the request")
  @JsonProperty("botState")
  public BotStateEnum getBotState() {
    return botState;
  }
  public void setBotState(BotStateEnum botState) {
    this.botState = botState;
  }

  
  /**
   * The list of messages to respond with, if any
   **/
  public PostTextResponse replyMessages(List<PostTextMessage> replyMessages) {
    this.replyMessages = replyMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of messages to respond with, if any")
  @JsonProperty("replyMessages")
  public List<PostTextMessage> getReplyMessages() {
    return replyMessages;
  }
  public void setReplyMessages(List<PostTextMessage> replyMessages) {
    this.replyMessages = replyMessages;
  }

  
  /**
   * The name of the intent the bot is either processing or has processed, this will be blank if no intent could be detected.
   **/
  public PostTextResponse intentName(String intentName) {
    this.intentName = intentName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the intent the bot is either processing or has processed, this will be blank if no intent could be detected.")
  @JsonProperty("intentName")
  public String getIntentName() {
    return intentName;
  }
  public void setIntentName(String intentName) {
    this.intentName = intentName;
  }

  
  /**
   * Data parameters detected and filled by the bot.
   **/
  public PostTextResponse slots(Map<String, String> slots) {
    this.slots = slots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data parameters detected and filled by the bot.")
  @JsonProperty("slots")
  public Map<String, String> getSlots() {
    return slots;
  }
  public void setSlots(Map<String, String> slots) {
    this.slots = slots;
  }

  
  /**
   * The optional ID specified in the request
   **/
  public PostTextResponse botCorrelationId(String botCorrelationId) {
    this.botCorrelationId = botCorrelationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optional ID specified in the request")
  @JsonProperty("botCorrelationId")
  public String getBotCorrelationId() {
    return botCorrelationId;
  }
  public void setBotCorrelationId(String botCorrelationId) {
    this.botCorrelationId = botCorrelationId;
  }

  
  /**
   * Raw data response from AWS (if called)
   **/
  public PostTextResponse amazonLex(Map<String, Object> amazonLex) {
    this.amazonLex = amazonLex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raw data response from AWS (if called)")
  @JsonProperty("amazonLex")
  public Map<String, Object> getAmazonLex() {
    return amazonLex;
  }
  public void setAmazonLex(Map<String, Object> amazonLex) {
    this.amazonLex = amazonLex;
  }

  
  /**
   * Raw data response from Google Dialogflow (if called)
   **/
  public PostTextResponse googleDialogFlow(Map<String, Object> googleDialogFlow) {
    this.googleDialogFlow = googleDialogFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raw data response from Google Dialogflow (if called)")
  @JsonProperty("googleDialogFlow")
  public Map<String, Object> getGoogleDialogFlow() {
    return googleDialogFlow;
  }
  public void setGoogleDialogFlow(Map<String, Object> googleDialogFlow) {
    this.googleDialogFlow = googleDialogFlow;
  }

  
  /**
   * Raw data response from Genesys' Dialogengine (if called)
   **/
  public PostTextResponse genesysDialogEngine(Map<String, Object> genesysDialogEngine) {
    this.genesysDialogEngine = genesysDialogEngine;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raw data response from Genesys' Dialogengine (if called)")
  @JsonProperty("genesysDialogEngine")
  public Map<String, Object> getGenesysDialogEngine() {
    return genesysDialogEngine;
  }
  public void setGenesysDialogEngine(Map<String, Object> genesysDialogEngine) {
    this.genesysDialogEngine = genesysDialogEngine;
  }

  
  /**
   * Raw data response from Genesys' BotConnector (if called)
   **/
  public PostTextResponse genesysBotConnector(Map<String, Object> genesysBotConnector) {
    this.genesysBotConnector = genesysBotConnector;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raw data response from Genesys' BotConnector (if called)")
  @JsonProperty("genesysBotConnector")
  public Map<String, Object> getGenesysBotConnector() {
    return genesysBotConnector;
  }
  public void setGenesysBotConnector(Map<String, Object> genesysBotConnector) {
    this.genesysBotConnector = genesysBotConnector;
  }

  
  /**
   * Raw data response from Nuance Mix Dlg (if called)
   **/
  public PostTextResponse nuanceMixDlg(Map<String, Object> nuanceMixDlg) {
    this.nuanceMixDlg = nuanceMixDlg;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raw data response from Nuance Mix Dlg (if called)")
  @JsonProperty("nuanceMixDlg")
  public Map<String, Object> getNuanceMixDlg() {
    return nuanceMixDlg;
  }
  public void setNuanceMixDlg(Map<String, Object> nuanceMixDlg) {
    this.nuanceMixDlg = nuanceMixDlg;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTextResponse postTextResponse = (PostTextResponse) o;
    return Objects.equals(this.botState, postTextResponse.botState) &&
        Objects.equals(this.replyMessages, postTextResponse.replyMessages) &&
        Objects.equals(this.intentName, postTextResponse.intentName) &&
        Objects.equals(this.slots, postTextResponse.slots) &&
        Objects.equals(this.botCorrelationId, postTextResponse.botCorrelationId) &&
        Objects.equals(this.amazonLex, postTextResponse.amazonLex) &&
        Objects.equals(this.googleDialogFlow, postTextResponse.googleDialogFlow) &&
        Objects.equals(this.genesysDialogEngine, postTextResponse.genesysDialogEngine) &&
        Objects.equals(this.genesysBotConnector, postTextResponse.genesysBotConnector) &&
        Objects.equals(this.nuanceMixDlg, postTextResponse.nuanceMixDlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botState, replyMessages, intentName, slots, botCorrelationId, amazonLex, googleDialogFlow, genesysDialogEngine, genesysBotConnector, nuanceMixDlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTextResponse {\n");
    
    sb.append("    botState: ").append(toIndentedString(botState)).append("\n");
    sb.append("    replyMessages: ").append(toIndentedString(replyMessages)).append("\n");
    sb.append("    intentName: ").append(toIndentedString(intentName)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    botCorrelationId: ").append(toIndentedString(botCorrelationId)).append("\n");
    sb.append("    amazonLex: ").append(toIndentedString(amazonLex)).append("\n");
    sb.append("    googleDialogFlow: ").append(toIndentedString(googleDialogFlow)).append("\n");
    sb.append("    genesysDialogEngine: ").append(toIndentedString(genesysDialogEngine)).append("\n");
    sb.append("    genesysBotConnector: ").append(toIndentedString(genesysBotConnector)).append("\n");
    sb.append("    nuanceMixDlg: ").append(toIndentedString(nuanceMixDlg)).append("\n");
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

