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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * ConversationIntentSuggestionsTopicSuggestedIntentSlot
 */

public class ConversationIntentSuggestionsTopicSuggestedIntentSlot  implements Serializable {
  
  private String slotName = null;
  private String entityType = null;
  private String slotValue = null;
  private BigDecimal probability = null;

  public ConversationIntentSuggestionsTopicSuggestedIntentSlot() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationIntentSuggestionsTopicSuggestedIntentSlot slotName(String slotName) {
    this.slotName = slotName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("slotName")
  public String getSlotName() {
    return slotName;
  }
  public void setSlotName(String slotName) {
    this.slotName = slotName;
  }


  /**
   **/
  public ConversationIntentSuggestionsTopicSuggestedIntentSlot entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  /**
   **/
  public ConversationIntentSuggestionsTopicSuggestedIntentSlot slotValue(String slotValue) {
    this.slotValue = slotValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("slotValue")
  public String getSlotValue() {
    return slotValue;
  }
  public void setSlotValue(String slotValue) {
    this.slotValue = slotValue;
  }


  /**
   **/
  public ConversationIntentSuggestionsTopicSuggestedIntentSlot probability(BigDecimal probability) {
    this.probability = probability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("probability")
  public BigDecimal getProbability() {
    return probability;
  }
  public void setProbability(BigDecimal probability) {
    this.probability = probability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationIntentSuggestionsTopicSuggestedIntentSlot conversationIntentSuggestionsTopicSuggestedIntentSlot = (ConversationIntentSuggestionsTopicSuggestedIntentSlot) o;

    return Objects.equals(this.slotName, conversationIntentSuggestionsTopicSuggestedIntentSlot.slotName) &&
            Objects.equals(this.entityType, conversationIntentSuggestionsTopicSuggestedIntentSlot.entityType) &&
            Objects.equals(this.slotValue, conversationIntentSuggestionsTopicSuggestedIntentSlot.slotValue) &&
            Objects.equals(this.probability, conversationIntentSuggestionsTopicSuggestedIntentSlot.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slotName, entityType, slotValue, probability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationIntentSuggestionsTopicSuggestedIntentSlot {\n");
    
    sb.append("    slotName: ").append(toIndentedString(slotName)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    slotValue: ").append(toIndentedString(slotValue)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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

