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
import com.mypurecloud.sdk.v2.model.PublishTopicTestPhraseMatchedTranscript;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PublishTopicTestTopicPhraseResults
 */

public class PublishTopicTestTopicPhraseResults  implements Serializable {
  
  private Integer processedTranscriptsCount = null;
  private Integer matchedTranscriptsCount = null;
  private List<PublishTopicTestPhraseMatchedTranscript> matchedTranscripts = new ArrayList<PublishTopicTestPhraseMatchedTranscript>();

  
  /**
   **/
  public PublishTopicTestTopicPhraseResults processedTranscriptsCount(Integer processedTranscriptsCount) {
    this.processedTranscriptsCount = processedTranscriptsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processedTranscriptsCount")
  public Integer getProcessedTranscriptsCount() {
    return processedTranscriptsCount;
  }
  public void setProcessedTranscriptsCount(Integer processedTranscriptsCount) {
    this.processedTranscriptsCount = processedTranscriptsCount;
  }


  /**
   **/
  public PublishTopicTestTopicPhraseResults matchedTranscriptsCount(Integer matchedTranscriptsCount) {
    this.matchedTranscriptsCount = matchedTranscriptsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("matchedTranscriptsCount")
  public Integer getMatchedTranscriptsCount() {
    return matchedTranscriptsCount;
  }
  public void setMatchedTranscriptsCount(Integer matchedTranscriptsCount) {
    this.matchedTranscriptsCount = matchedTranscriptsCount;
  }


  /**
   **/
  public PublishTopicTestTopicPhraseResults matchedTranscripts(List<PublishTopicTestPhraseMatchedTranscript> matchedTranscripts) {
    this.matchedTranscripts = matchedTranscripts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("matchedTranscripts")
  public List<PublishTopicTestPhraseMatchedTranscript> getMatchedTranscripts() {
    return matchedTranscripts;
  }
  public void setMatchedTranscripts(List<PublishTopicTestPhraseMatchedTranscript> matchedTranscripts) {
    this.matchedTranscripts = matchedTranscripts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishTopicTestTopicPhraseResults publishTopicTestTopicPhraseResults = (PublishTopicTestTopicPhraseResults) o;

    return Objects.equals(this.processedTranscriptsCount, publishTopicTestTopicPhraseResults.processedTranscriptsCount) &&
            Objects.equals(this.matchedTranscriptsCount, publishTopicTestTopicPhraseResults.matchedTranscriptsCount) &&
            Objects.equals(this.matchedTranscripts, publishTopicTestTopicPhraseResults.matchedTranscripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processedTranscriptsCount, matchedTranscriptsCount, matchedTranscripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishTopicTestTopicPhraseResults {\n");
    
    sb.append("    processedTranscriptsCount: ").append(toIndentedString(processedTranscriptsCount)).append("\n");
    sb.append("    matchedTranscriptsCount: ").append(toIndentedString(matchedTranscriptsCount)).append("\n");
    sb.append("    matchedTranscripts: ").append(toIndentedString(matchedTranscripts)).append("\n");
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

