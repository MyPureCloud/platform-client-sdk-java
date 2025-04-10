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
import com.mypurecloud.sdk.v2.model.ReportingTurnAction;
import com.mypurecloud.sdk.v2.model.ReportingTurnIntent;
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledge;
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledgeEvents;
import com.mypurecloud.sdk.v2.model.SessionEndDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ReportingTurn
 */

public class ReportingTurn  implements Serializable {
  
  private String userInput = null;
  private List<String> botPrompts = null;
  private String sessionId = null;
  private ReportingTurnAction askAction = null;
  private ReportingTurnIntent intent = null;
  private ReportingTurnKnowledge knowledge = null;
  private ReportingTurnKnowledgeEvents knowledgeBaseEvents = null;
  private Date dateCreated = null;
  private Date dateCompleted = null;

  private static class AskActionResultEnumDeserializer extends StdDeserializer<AskActionResultEnum> {
    public AskActionResultEnumDeserializer() {
      super(AskActionResultEnumDeserializer.class);
    }

    @Override
    public AskActionResultEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AskActionResultEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Result of the bot flow 'ask' action.
   */
 @JsonDeserialize(using = AskActionResultEnumDeserializer.class)
  public enum AskActionResultEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUCCESSCOLLECTION("SuccessCollection"),
    SUCCESSCONFIRMATIONYES("SuccessConfirmationYes"),
    SUCCESSCONFIRMATIONNO("SuccessConfirmationNo"),
    SKIPPEDCOLLECTION("SkippedCollection"),
    PARTIALCOLLECTION("PartialCollection"),
    NOMATCHCOLLECTION("NoMatchCollection"),
    NOMATCHCONFIRMATION("NoMatchConfirmation"),
    AGENTREQUESTEDBYUSER("AgentRequestedByUser"),
    CONFIRMATIONREQUIRED("ConfirmationRequired"),
    ERROR("Error"),
    EXPRESSIONERROR("ExpressionError"),
    NOINPUTCOLLECTION("NoInputCollection"),
    NOINPUTCONFIRMATION("NoInputConfirmation"),
    DISAMBIGUATIONREQUIRED("DisambiguationRequired"),
    SUCCESSDISAMBIGUATION("SuccessDisambiguation"),
    SUCCESSDISAMBIGUATIONNONE("SuccessDisambiguationNone"),
    NOMATCHDISAMBIGUATION("NoMatchDisambiguation"),
    NOINPUTDISAMBIGUATION("NoInputDisambiguation");

    private String value;

    AskActionResultEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AskActionResultEnum fromString(String key) {
      if (key == null) return null;

      for (AskActionResultEnum value : AskActionResultEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AskActionResultEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AskActionResultEnum askActionResult = null;
  private SessionEndDetails sessionEndDetails = null;
  private AddressableEntityRef conversation = null;

  public ReportingTurn() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      botPrompts = new ArrayList<String>();
    }
  }

  
  /**
   * The chosen user input associated with this reporting turn.
   **/
  public ReportingTurn userInput(String userInput) {
    this.userInput = userInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The chosen user input associated with this reporting turn.")
  @JsonProperty("userInput")
  public String getUserInput() {
    return userInput;
  }
  public void setUserInput(String userInput) {
    this.userInput = userInput;
  }


  /**
   * The bot prompts associated with this reporting turn.
   **/
  public ReportingTurn botPrompts(List<String> botPrompts) {
    this.botPrompts = botPrompts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bot prompts associated with this reporting turn.")
  @JsonProperty("botPrompts")
  public List<String> getBotPrompts() {
    return botPrompts;
  }
  public void setBotPrompts(List<String> botPrompts) {
    this.botPrompts = botPrompts;
  }


  /**
   * The bot session ID that this reporting turn is grouped under.
   **/
  public ReportingTurn sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bot session ID that this reporting turn is grouped under.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * The bot flow 'ask' action associated with this reporting turn (e.g. AskForIntent).
   **/
  public ReportingTurn askAction(ReportingTurnAction askAction) {
    this.askAction = askAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bot flow 'ask' action associated with this reporting turn (e.g. AskForIntent).")
  @JsonProperty("askAction")
  public ReportingTurnAction getAskAction() {
    return askAction;
  }
  public void setAskAction(ReportingTurnAction askAction) {
    this.askAction = askAction;
  }


  /**
   * The intent and associated slots detected during this reporting turn.
   **/
  public ReportingTurn intent(ReportingTurnIntent intent) {
    this.intent = intent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intent and associated slots detected during this reporting turn.")
  @JsonProperty("intent")
  public ReportingTurnIntent getIntent() {
    return intent;
  }
  public void setIntent(ReportingTurnIntent intent) {
    this.intent = intent;
  }


  /**
   * The knowledge data captured during this reporting turn.
   **/
  public ReportingTurn knowledge(ReportingTurnKnowledge knowledge) {
    this.knowledge = knowledge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge data captured during this reporting turn.")
  @JsonProperty("knowledge")
  public ReportingTurnKnowledge getKnowledge() {
    return knowledge;
  }
  public void setKnowledge(ReportingTurnKnowledge knowledge) {
    this.knowledge = knowledge;
  }


  /**
   * The knowledge data captured during this reporting turn.
   **/
  public ReportingTurn knowledgeBaseEvents(ReportingTurnKnowledgeEvents knowledgeBaseEvents) {
    this.knowledgeBaseEvents = knowledgeBaseEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge data captured during this reporting turn.")
  @JsonProperty("knowledgeBaseEvents")
  public ReportingTurnKnowledgeEvents getKnowledgeBaseEvents() {
    return knowledgeBaseEvents;
  }
  public void setKnowledgeBaseEvents(ReportingTurnKnowledgeEvents knowledgeBaseEvents) {
    this.knowledgeBaseEvents = knowledgeBaseEvents;
  }


  /**
   * Timestamp indicating when the original turn was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReportingTurn dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the original turn was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Timestamp indicating when the original turn was completed. Note: The 'interval' query param uses this timestamp to filter the output. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReportingTurn dateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the original turn was completed. Note: The 'interval' query param uses this timestamp to filter the output. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }
  public void setDateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
  }


  /**
   * Result of the bot flow 'ask' action.
   **/
  public ReportingTurn askActionResult(AskActionResultEnum askActionResult) {
    this.askActionResult = askActionResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Result of the bot flow 'ask' action.")
  @JsonProperty("askActionResult")
  public AskActionResultEnum getAskActionResult() {
    return askActionResult;
  }
  public void setAskActionResult(AskActionResultEnum askActionResult) {
    this.askActionResult = askActionResult;
  }


  /**
   * The details related to end of bot flow session.
   **/
  public ReportingTurn sessionEndDetails(SessionEndDetails sessionEndDetails) {
    this.sessionEndDetails = sessionEndDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The details related to end of bot flow session.")
  @JsonProperty("sessionEndDetails")
  public SessionEndDetails getSessionEndDetails() {
    return sessionEndDetails;
  }
  public void setSessionEndDetails(SessionEndDetails sessionEndDetails) {
    this.sessionEndDetails = sessionEndDetails;
  }


  @ApiModelProperty(example = "null", value = "The conversation details, across potentially multiple Bot Flow sessions.")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurn reportingTurn = (ReportingTurn) o;

    return Objects.equals(this.userInput, reportingTurn.userInput) &&
            Objects.equals(this.botPrompts, reportingTurn.botPrompts) &&
            Objects.equals(this.sessionId, reportingTurn.sessionId) &&
            Objects.equals(this.askAction, reportingTurn.askAction) &&
            Objects.equals(this.intent, reportingTurn.intent) &&
            Objects.equals(this.knowledge, reportingTurn.knowledge) &&
            Objects.equals(this.knowledgeBaseEvents, reportingTurn.knowledgeBaseEvents) &&
            Objects.equals(this.dateCreated, reportingTurn.dateCreated) &&
            Objects.equals(this.dateCompleted, reportingTurn.dateCompleted) &&
            Objects.equals(this.askActionResult, reportingTurn.askActionResult) &&
            Objects.equals(this.sessionEndDetails, reportingTurn.sessionEndDetails) &&
            Objects.equals(this.conversation, reportingTurn.conversation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userInput, botPrompts, sessionId, askAction, intent, knowledge, knowledgeBaseEvents, dateCreated, dateCompleted, askActionResult, sessionEndDetails, conversation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurn {\n");
    
    sb.append("    userInput: ").append(toIndentedString(userInput)).append("\n");
    sb.append("    botPrompts: ").append(toIndentedString(botPrompts)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    askAction: ").append(toIndentedString(askAction)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    knowledge: ").append(toIndentedString(knowledge)).append("\n");
    sb.append("    knowledgeBaseEvents: ").append(toIndentedString(knowledgeBaseEvents)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    askActionResult: ").append(toIndentedString(askActionResult)).append("\n");
    sb.append("    sessionEndDetails: ").append(toIndentedString(sessionEndDetails)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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

