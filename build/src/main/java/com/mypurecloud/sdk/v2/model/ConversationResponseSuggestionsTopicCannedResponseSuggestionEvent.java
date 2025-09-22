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
import com.mypurecloud.sdk.v2.model.ConversationResponseSuggestionsTopicSuggestedCannedResponse;
import com.mypurecloud.sdk.v2.model.ConversationResponseSuggestionsTopicSuggestedIntent;
import com.mypurecloud.sdk.v2.model.ConversationResponseSuggestionsTopicSuggestionContext;
import com.mypurecloud.sdk.v2.model.ConversationResponseSuggestionsTopicSuggestionFeedback;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent
 */

public class ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent  implements Serializable {
  
  private Date eventTime = null;
  private String conversationId = null;
  private String suggestionId = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    SUGGESTED("Suggested"),
    ACCEPTED("Accepted"),
    DISMISSED("Dismissed"),
    FAILED("Failed"),
    RATED("Rated");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  private static class TriggerTypeEnumDeserializer extends StdDeserializer<TriggerTypeEnum> {
    public TriggerTypeEnumDeserializer() {
      super(TriggerTypeEnumDeserializer.class);
    }

    @Override
    public TriggerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TriggerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets triggerType
   */
 @JsonDeserialize(using = TriggerTypeEnumDeserializer.class)
  public enum TriggerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    FALLBACK("Fallback"),
    CONVERSATIONSTART("ConversationStart"),
    CONVERSATIONTRANSFER("ConversationTransfer"),
    CONVERSATIONEND("ConversationEnd"),
    INTENT("Intent");

    private String value;

    TriggerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TriggerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TriggerTypeEnum value : TriggerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TriggerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TriggerTypeEnum triggerType = null;

  private static class EngagementTypeEnumDeserializer extends StdDeserializer<EngagementTypeEnum> {
    public EngagementTypeEnumDeserializer() {
      super(EngagementTypeEnumDeserializer.class);
    }

    @Override
    public EngagementTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EngagementTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets engagementType
   */
 @JsonDeserialize(using = EngagementTypeEnumDeserializer.class)
  public enum EngagementTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    DISMISSED("Dismissed"),
    COPIED("Copied"),
    OPENED("Opened"),
    FEEDBACK("Feedback");

    private String value;

    EngagementTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EngagementTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EngagementTypeEnum value : EngagementTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EngagementTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EngagementTypeEnum engagementType = null;
  private ConversationResponseSuggestionsTopicSuggestionContext context = null;
  private ConversationResponseSuggestionsTopicSuggestionFeedback feedback = null;
  private ConversationResponseSuggestionsTopicSuggestedCannedResponse cannedResponse = null;
  private ConversationResponseSuggestionsTopicSuggestedIntent activeIntent = null;

  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent suggestionId(String suggestionId) {
    this.suggestionId = suggestionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("suggestionId")
  public String getSuggestionId() {
    return suggestionId;
  }
  public void setSuggestionId(String suggestionId) {
    this.suggestionId = suggestionId;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent triggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggerType")
  public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }
  public void setTriggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent engagementType(EngagementTypeEnum engagementType) {
    this.engagementType = engagementType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("engagementType")
  public EngagementTypeEnum getEngagementType() {
    return engagementType;
  }
  public void setEngagementType(EngagementTypeEnum engagementType) {
    this.engagementType = engagementType;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent context(ConversationResponseSuggestionsTopicSuggestionContext context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("context")
  public ConversationResponseSuggestionsTopicSuggestionContext getContext() {
    return context;
  }
  public void setContext(ConversationResponseSuggestionsTopicSuggestionContext context) {
    this.context = context;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent feedback(ConversationResponseSuggestionsTopicSuggestionFeedback feedback) {
    this.feedback = feedback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("feedback")
  public ConversationResponseSuggestionsTopicSuggestionFeedback getFeedback() {
    return feedback;
  }
  public void setFeedback(ConversationResponseSuggestionsTopicSuggestionFeedback feedback) {
    this.feedback = feedback;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent cannedResponse(ConversationResponseSuggestionsTopicSuggestedCannedResponse cannedResponse) {
    this.cannedResponse = cannedResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cannedResponse")
  public ConversationResponseSuggestionsTopicSuggestedCannedResponse getCannedResponse() {
    return cannedResponse;
  }
  public void setCannedResponse(ConversationResponseSuggestionsTopicSuggestedCannedResponse cannedResponse) {
    this.cannedResponse = cannedResponse;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent activeIntent(ConversationResponseSuggestionsTopicSuggestedIntent activeIntent) {
    this.activeIntent = activeIntent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activeIntent")
  public ConversationResponseSuggestionsTopicSuggestedIntent getActiveIntent() {
    return activeIntent;
  }
  public void setActiveIntent(ConversationResponseSuggestionsTopicSuggestedIntent activeIntent) {
    this.activeIntent = activeIntent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent conversationResponseSuggestionsTopicCannedResponseSuggestionEvent = (ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent) o;

    return Objects.equals(this.eventTime, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.eventTime) &&
            Objects.equals(this.conversationId, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.conversationId) &&
            Objects.equals(this.suggestionId, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.suggestionId) &&
            Objects.equals(this.state, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.state) &&
            Objects.equals(this.triggerType, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.triggerType) &&
            Objects.equals(this.engagementType, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.engagementType) &&
            Objects.equals(this.context, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.context) &&
            Objects.equals(this.feedback, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.feedback) &&
            Objects.equals(this.cannedResponse, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.cannedResponse) &&
            Objects.equals(this.activeIntent, conversationResponseSuggestionsTopicCannedResponseSuggestionEvent.activeIntent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, suggestionId, state, triggerType, engagementType, context, feedback, cannedResponse, activeIntent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationResponseSuggestionsTopicCannedResponseSuggestionEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    suggestionId: ").append(toIndentedString(suggestionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    cannedResponse: ").append(toIndentedString(cannedResponse)).append("\n");
    sb.append("    activeIntent: ").append(toIndentedString(activeIntent)).append("\n");
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

