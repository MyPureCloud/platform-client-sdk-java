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
import com.mypurecloud.sdk.v2.model.ConversationScriptSuggestionsTopicSuggestedIntentSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationScriptSuggestionsTopicSuggestedIntent
 */

public class ConversationScriptSuggestionsTopicSuggestedIntent  implements Serializable {
  
  private String intent = null;
  private String intentId = null;
  private BigDecimal confidence = null;
  private List<ConversationScriptSuggestionsTopicSuggestedIntentSlot> detectedSlots = null;

  public ConversationScriptSuggestionsTopicSuggestedIntent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      detectedSlots = new ArrayList<ConversationScriptSuggestionsTopicSuggestedIntentSlot>();
    }
  }

  
  /**
   **/
  public ConversationScriptSuggestionsTopicSuggestedIntent intent(String intent) {
    this.intent = intent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intent")
  public String getIntent() {
    return intent;
  }
  public void setIntent(String intent) {
    this.intent = intent;
  }


  /**
   **/
  public ConversationScriptSuggestionsTopicSuggestedIntent intentId(String intentId) {
    this.intentId = intentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intentId")
  public String getIntentId() {
    return intentId;
  }
  public void setIntentId(String intentId) {
    this.intentId = intentId;
  }


  /**
   **/
  public ConversationScriptSuggestionsTopicSuggestedIntent confidence(BigDecimal confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("confidence")
  public BigDecimal getConfidence() {
    return confidence;
  }
  public void setConfidence(BigDecimal confidence) {
    this.confidence = confidence;
  }


  /**
   **/
  public ConversationScriptSuggestionsTopicSuggestedIntent detectedSlots(List<ConversationScriptSuggestionsTopicSuggestedIntentSlot> detectedSlots) {
    this.detectedSlots = detectedSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("detectedSlots")
  public List<ConversationScriptSuggestionsTopicSuggestedIntentSlot> getDetectedSlots() {
    return detectedSlots;
  }
  public void setDetectedSlots(List<ConversationScriptSuggestionsTopicSuggestedIntentSlot> detectedSlots) {
    this.detectedSlots = detectedSlots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationScriptSuggestionsTopicSuggestedIntent conversationScriptSuggestionsTopicSuggestedIntent = (ConversationScriptSuggestionsTopicSuggestedIntent) o;

    return Objects.equals(this.intent, conversationScriptSuggestionsTopicSuggestedIntent.intent) &&
            Objects.equals(this.intentId, conversationScriptSuggestionsTopicSuggestedIntent.intentId) &&
            Objects.equals(this.confidence, conversationScriptSuggestionsTopicSuggestedIntent.confidence) &&
            Objects.equals(this.detectedSlots, conversationScriptSuggestionsTopicSuggestedIntent.detectedSlots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, intentId, confidence, detectedSlots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationScriptSuggestionsTopicSuggestedIntent {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    detectedSlots: ").append(toIndentedString(detectedSlots)).append("\n");
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

