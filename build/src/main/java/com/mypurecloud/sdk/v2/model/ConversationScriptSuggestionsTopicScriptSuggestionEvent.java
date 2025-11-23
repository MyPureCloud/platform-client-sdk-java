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
import com.mypurecloud.sdk.v2.model.ConversationScriptSuggestionsTopicSuggestedIntent;
import com.mypurecloud.sdk.v2.model.ConversationScriptSuggestionsTopicSuggestedScript;
import com.mypurecloud.sdk.v2.model.ConversationScriptSuggestionsTopicSuggestionContext;
import com.mypurecloud.sdk.v2.model.ConversationScriptSuggestionsTopicSuggestionFeedback;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ConversationScriptSuggestionsTopicScriptSuggestionEvent
 */

public class ConversationScriptSuggestionsTopicScriptSuggestionEvent  implements Serializable {
  
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
    RATED("Rated"),
    TRIGGERED("Triggered");

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
  private ConversationScriptSuggestionsTopicSuggestionContext context = null;
  private ConversationScriptSuggestionsTopicSuggestionFeedback feedback = null;
  private ConversationScriptSuggestionsTopicSuggestedScript script = null;
  private ConversationScriptSuggestionsTopicSuggestedIntent activeIntent = null;

  public ConversationScriptSuggestionsTopicScriptSuggestionEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent eventTime(Date eventTime) {
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
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent conversationId(String conversationId) {
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
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent suggestionId(String suggestionId) {
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
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent state(StateEnum state) {
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
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent triggerType(TriggerTypeEnum triggerType) {
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
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent engagementType(EngagementTypeEnum engagementType) {
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
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent context(ConversationScriptSuggestionsTopicSuggestionContext context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("context")
  public ConversationScriptSuggestionsTopicSuggestionContext getContext() {
    return context;
  }
  public void setContext(ConversationScriptSuggestionsTopicSuggestionContext context) {
    this.context = context;
  }


  /**
   **/
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent feedback(ConversationScriptSuggestionsTopicSuggestionFeedback feedback) {
    this.feedback = feedback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("feedback")
  public ConversationScriptSuggestionsTopicSuggestionFeedback getFeedback() {
    return feedback;
  }
  public void setFeedback(ConversationScriptSuggestionsTopicSuggestionFeedback feedback) {
    this.feedback = feedback;
  }


  /**
   **/
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent script(ConversationScriptSuggestionsTopicSuggestedScript script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public ConversationScriptSuggestionsTopicSuggestedScript getScript() {
    return script;
  }
  public void setScript(ConversationScriptSuggestionsTopicSuggestedScript script) {
    this.script = script;
  }


  /**
   **/
  public ConversationScriptSuggestionsTopicScriptSuggestionEvent activeIntent(ConversationScriptSuggestionsTopicSuggestedIntent activeIntent) {
    this.activeIntent = activeIntent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activeIntent")
  public ConversationScriptSuggestionsTopicSuggestedIntent getActiveIntent() {
    return activeIntent;
  }
  public void setActiveIntent(ConversationScriptSuggestionsTopicSuggestedIntent activeIntent) {
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
    ConversationScriptSuggestionsTopicScriptSuggestionEvent conversationScriptSuggestionsTopicScriptSuggestionEvent = (ConversationScriptSuggestionsTopicScriptSuggestionEvent) o;

    return Objects.equals(this.eventTime, conversationScriptSuggestionsTopicScriptSuggestionEvent.eventTime) &&
            Objects.equals(this.conversationId, conversationScriptSuggestionsTopicScriptSuggestionEvent.conversationId) &&
            Objects.equals(this.suggestionId, conversationScriptSuggestionsTopicScriptSuggestionEvent.suggestionId) &&
            Objects.equals(this.state, conversationScriptSuggestionsTopicScriptSuggestionEvent.state) &&
            Objects.equals(this.triggerType, conversationScriptSuggestionsTopicScriptSuggestionEvent.triggerType) &&
            Objects.equals(this.engagementType, conversationScriptSuggestionsTopicScriptSuggestionEvent.engagementType) &&
            Objects.equals(this.context, conversationScriptSuggestionsTopicScriptSuggestionEvent.context) &&
            Objects.equals(this.feedback, conversationScriptSuggestionsTopicScriptSuggestionEvent.feedback) &&
            Objects.equals(this.script, conversationScriptSuggestionsTopicScriptSuggestionEvent.script) &&
            Objects.equals(this.activeIntent, conversationScriptSuggestionsTopicScriptSuggestionEvent.activeIntent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, suggestionId, state, triggerType, engagementType, context, feedback, script, activeIntent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationScriptSuggestionsTopicScriptSuggestionEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    suggestionId: ").append(toIndentedString(suggestionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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

