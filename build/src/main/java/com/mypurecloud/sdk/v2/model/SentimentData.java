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
import com.mypurecloud.sdk.v2.model.SentimentInsights;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SentimentData
 */

public class SentimentData  implements Serializable {
  
  private SentimentInsights insights = null;

  public SentimentData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The sentiment insights extracted from the conversation
   **/
  public SentimentData insights(SentimentInsights insights) {
    this.insights = insights;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sentiment insights extracted from the conversation")
  @JsonProperty("insights")
  public SentimentInsights getInsights() {
    return insights;
  }
  public void setInsights(SentimentInsights insights) {
    this.insights = insights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentimentData sentimentData = (SentimentData) o;

    return Objects.equals(this.insights, sentimentData.insights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentimentData {\n");
    
    sb.append("    insights: ").append(toIndentedString(insights)).append("\n");
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

