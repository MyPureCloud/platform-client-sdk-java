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
import com.mypurecloud.sdk.v2.model.ConversationThirdPartyActionSuggestionsTopicSuggestedIntentSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationThirdPartyActionSuggestionsTopicSuggestedIntent
 */

public class ConversationThirdPartyActionSuggestionsTopicSuggestedIntent  implements Serializable {
  
  private String intent = null;
  private String intentId = null;
  private BigDecimal confidence = null;
  private List<ConversationThirdPartyActionSuggestionsTopicSuggestedIntentSlot> detectedSlots = null;

  public ConversationThirdPartyActionSuggestionsTopicSuggestedIntent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      detectedSlots = new ArrayList<ConversationThirdPartyActionSuggestionsTopicSuggestedIntentSlot>();
    }
  }

  
  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicSuggestedIntent intent(String intent) {
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
  public ConversationThirdPartyActionSuggestionsTopicSuggestedIntent intentId(String intentId) {
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
  public ConversationThirdPartyActionSuggestionsTopicSuggestedIntent confidence(BigDecimal confidence) {
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
  public ConversationThirdPartyActionSuggestionsTopicSuggestedIntent detectedSlots(List<ConversationThirdPartyActionSuggestionsTopicSuggestedIntentSlot> detectedSlots) {
    this.detectedSlots = detectedSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("detectedSlots")
  public List<ConversationThirdPartyActionSuggestionsTopicSuggestedIntentSlot> getDetectedSlots() {
    return detectedSlots;
  }
  public void setDetectedSlots(List<ConversationThirdPartyActionSuggestionsTopicSuggestedIntentSlot> detectedSlots) {
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
    ConversationThirdPartyActionSuggestionsTopicSuggestedIntent conversationThirdPartyActionSuggestionsTopicSuggestedIntent = (ConversationThirdPartyActionSuggestionsTopicSuggestedIntent) o;

    return Objects.equals(this.intent, conversationThirdPartyActionSuggestionsTopicSuggestedIntent.intent) &&
            Objects.equals(this.intentId, conversationThirdPartyActionSuggestionsTopicSuggestedIntent.intentId) &&
            Objects.equals(this.confidence, conversationThirdPartyActionSuggestionsTopicSuggestedIntent.confidence) &&
            Objects.equals(this.detectedSlots, conversationThirdPartyActionSuggestionsTopicSuggestedIntent.detectedSlots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, intentId, confidence, detectedSlots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationThirdPartyActionSuggestionsTopicSuggestedIntent {\n");
    
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

