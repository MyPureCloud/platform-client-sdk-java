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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * TweetUsage
 */

public class TweetUsage  implements Serializable {
  
  private Long ingestionLimit = null;
  private Long tweetCount = null;
  private Date dateStart = null;

  
  /**
   * Ingestion limit
   **/
  public TweetUsage ingestionLimit(Long ingestionLimit) {
    this.ingestionLimit = ingestionLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ingestion limit")
  @JsonProperty("ingestionLimit")
  public Long getIngestionLimit() {
    return ingestionLimit;
  }
  public void setIngestionLimit(Long ingestionLimit) {
    this.ingestionLimit = ingestionLimit;
  }


  /**
   * The number of tweets consumed
   **/
  public TweetUsage tweetCount(Long tweetCount) {
    this.tweetCount = tweetCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of tweets consumed")
  @JsonProperty("tweetCount")
  public Long getTweetCount() {
    return tweetCount;
  }
  public void setTweetCount(Long tweetCount) {
    this.tweetCount = tweetCount;
  }


  /**
   * The start of the usage period for the currently consumed tweets. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TweetUsage dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start of the usage period for the currently consumed tweets. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetUsage tweetUsage = (TweetUsage) o;

    return Objects.equals(this.ingestionLimit, tweetUsage.ingestionLimit) &&
            Objects.equals(this.tweetCount, tweetUsage.tweetCount) &&
            Objects.equals(this.dateStart, tweetUsage.dateStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestionLimit, tweetCount, dateStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetUsage {\n");
    
    sb.append("    ingestionLimit: ").append(toIndentedString(ingestionLimit)).append("\n");
    sb.append("    tweetCount: ").append(toIndentedString(tweetCount)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
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

