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
import com.mypurecloud.sdk.v2.model.ConversationEnrichmentLanguage;
import com.mypurecloud.sdk.v2.model.ConversationEnrichmentSentimentV2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Metadata enrichments provided by the platform.
 */
@ApiModel(description = "Metadata enrichments provided by the platform.")

public class ConversationEnrichment  implements Serializable {
  
  private ConversationEnrichmentLanguage language = null;
  private ConversationEnrichmentSentimentV2 sentimentV2 = null;

  public ConversationEnrichment() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Detected language of this message.
   **/
  public ConversationEnrichment language(ConversationEnrichmentLanguage language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detected language of this message.")
  @JsonProperty("language")
  public ConversationEnrichmentLanguage getLanguage() {
    return language;
  }
  public void setLanguage(ConversationEnrichmentLanguage language) {
    this.language = language;
  }


  /**
   * Detected sentiment of this message.
   **/
  public ConversationEnrichment sentimentV2(ConversationEnrichmentSentimentV2 sentimentV2) {
    this.sentimentV2 = sentimentV2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detected sentiment of this message.")
  @JsonProperty("sentimentV2")
  public ConversationEnrichmentSentimentV2 getSentimentV2() {
    return sentimentV2;
  }
  public void setSentimentV2(ConversationEnrichmentSentimentV2 sentimentV2) {
    this.sentimentV2 = sentimentV2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEnrichment conversationEnrichment = (ConversationEnrichment) o;

    return Objects.equals(this.language, conversationEnrichment.language) &&
            Objects.equals(this.sentimentV2, conversationEnrichment.sentimentV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, sentimentV2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEnrichment {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    sentimentV2: ").append(toIndentedString(sentimentV2)).append("\n");
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

