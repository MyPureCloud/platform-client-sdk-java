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
import com.mypurecloud.sdk.v2.model.TweetUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TwitterDataHistoricalTweetResponse
 */

public class TwitterDataHistoricalTweetResponse  implements Serializable {
  
  private Long matchingTweets = null;
  private Integer previousNumberOfDays = null;
  private TweetUsage usageStatistics = null;

  public TwitterDataHistoricalTweetResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The count of matching tweets using the searchTerms.
   **/
  public TwitterDataHistoricalTweetResponse matchingTweets(Long matchingTweets) {
    this.matchingTweets = matchingTweets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of matching tweets using the searchTerms.")
  @JsonProperty("matchingTweets")
  public Long getMatchingTweets() {
    return matchingTweets;
  }
  public void setMatchingTweets(Long matchingTweets) {
    this.matchingTweets = matchingTweets;
  }


  /**
   * The number of days used for the query
   **/
  public TwitterDataHistoricalTweetResponse previousNumberOfDays(Integer previousNumberOfDays) {
    this.previousNumberOfDays = previousNumberOfDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of days used for the query")
  @JsonProperty("previousNumberOfDays")
  public Integer getPreviousNumberOfDays() {
    return previousNumberOfDays;
  }
  public void setPreviousNumberOfDays(Integer previousNumberOfDays) {
    this.previousNumberOfDays = previousNumberOfDays;
  }


  /**
   * The tweet usage of the org
   **/
  public TwitterDataHistoricalTweetResponse usageStatistics(TweetUsage usageStatistics) {
    this.usageStatistics = usageStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tweet usage of the org")
  @JsonProperty("usageStatistics")
  public TweetUsage getUsageStatistics() {
    return usageStatistics;
  }
  public void setUsageStatistics(TweetUsage usageStatistics) {
    this.usageStatistics = usageStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwitterDataHistoricalTweetResponse twitterDataHistoricalTweetResponse = (TwitterDataHistoricalTweetResponse) o;

    return Objects.equals(this.matchingTweets, twitterDataHistoricalTweetResponse.matchingTweets) &&
            Objects.equals(this.previousNumberOfDays, twitterDataHistoricalTweetResponse.previousNumberOfDays) &&
            Objects.equals(this.usageStatistics, twitterDataHistoricalTweetResponse.usageStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchingTweets, previousNumberOfDays, usageStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterDataHistoricalTweetResponse {\n");
    
    sb.append("    matchingTweets: ").append(toIndentedString(matchingTweets)).append("\n");
    sb.append("    previousNumberOfDays: ").append(toIndentedString(previousNumberOfDays)).append("\n");
    sb.append("    usageStatistics: ").append(toIndentedString(usageStatistics)).append("\n");
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

