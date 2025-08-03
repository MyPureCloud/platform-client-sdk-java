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
import com.mypurecloud.sdk.v2.model.SentimentInsightEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SentimentInsights
 */

public class SentimentInsights  implements Serializable {
  
  private List<SentimentInsightEntry> positiveSentimentReasons = null;
  private List<SentimentInsightEntry> negativeSentimentReasons = null;

  public SentimentInsights() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      positiveSentimentReasons = new ArrayList<SentimentInsightEntry>();
      negativeSentimentReasons = new ArrayList<SentimentInsightEntry>();
    }
  }

  
  /**
   * The reasons for positive sentiment found in the conversation
   **/
  public SentimentInsights positiveSentimentReasons(List<SentimentInsightEntry> positiveSentimentReasons) {
    this.positiveSentimentReasons = positiveSentimentReasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reasons for positive sentiment found in the conversation")
  @JsonProperty("positiveSentimentReasons")
  public List<SentimentInsightEntry> getPositiveSentimentReasons() {
    return positiveSentimentReasons;
  }
  public void setPositiveSentimentReasons(List<SentimentInsightEntry> positiveSentimentReasons) {
    this.positiveSentimentReasons = positiveSentimentReasons;
  }


  /**
   * The reasons for negative sentiment found in the conversation
   **/
  public SentimentInsights negativeSentimentReasons(List<SentimentInsightEntry> negativeSentimentReasons) {
    this.negativeSentimentReasons = negativeSentimentReasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reasons for negative sentiment found in the conversation")
  @JsonProperty("negativeSentimentReasons")
  public List<SentimentInsightEntry> getNegativeSentimentReasons() {
    return negativeSentimentReasons;
  }
  public void setNegativeSentimentReasons(List<SentimentInsightEntry> negativeSentimentReasons) {
    this.negativeSentimentReasons = negativeSentimentReasons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentimentInsights sentimentInsights = (SentimentInsights) o;

    return Objects.equals(this.positiveSentimentReasons, sentimentInsights.positiveSentimentReasons) &&
            Objects.equals(this.negativeSentimentReasons, sentimentInsights.negativeSentimentReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positiveSentimentReasons, negativeSentimentReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentimentInsights {\n");
    
    sb.append("    positiveSentimentReasons: ").append(toIndentedString(positiveSentimentReasons)).append("\n");
    sb.append("    negativeSentimentReasons: ").append(toIndentedString(negativeSentimentReasons)).append("\n");
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

