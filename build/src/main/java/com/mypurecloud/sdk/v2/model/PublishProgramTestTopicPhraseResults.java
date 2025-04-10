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
import com.mypurecloud.sdk.v2.model.PublishProgramTestPhraseMatchedTranscript;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PublishProgramTestTopicPhraseResults
 */

public class PublishProgramTestTopicPhraseResults  implements Serializable {
  
  private Long processedTranscriptsCount = null;
  private Long matchedTranscriptsCount = null;
  private List<PublishProgramTestPhraseMatchedTranscript> matchedTranscripts = null;

  public PublishProgramTestTopicPhraseResults() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      matchedTranscripts = new ArrayList<PublishProgramTestPhraseMatchedTranscript>();
    }
  }

  
  /**
   **/
  public PublishProgramTestTopicPhraseResults processedTranscriptsCount(Long processedTranscriptsCount) {
    this.processedTranscriptsCount = processedTranscriptsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processedTranscriptsCount")
  public Long getProcessedTranscriptsCount() {
    return processedTranscriptsCount;
  }
  public void setProcessedTranscriptsCount(Long processedTranscriptsCount) {
    this.processedTranscriptsCount = processedTranscriptsCount;
  }


  /**
   **/
  public PublishProgramTestTopicPhraseResults matchedTranscriptsCount(Long matchedTranscriptsCount) {
    this.matchedTranscriptsCount = matchedTranscriptsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("matchedTranscriptsCount")
  public Long getMatchedTranscriptsCount() {
    return matchedTranscriptsCount;
  }
  public void setMatchedTranscriptsCount(Long matchedTranscriptsCount) {
    this.matchedTranscriptsCount = matchedTranscriptsCount;
  }


  /**
   **/
  public PublishProgramTestTopicPhraseResults matchedTranscripts(List<PublishProgramTestPhraseMatchedTranscript> matchedTranscripts) {
    this.matchedTranscripts = matchedTranscripts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("matchedTranscripts")
  public List<PublishProgramTestPhraseMatchedTranscript> getMatchedTranscripts() {
    return matchedTranscripts;
  }
  public void setMatchedTranscripts(List<PublishProgramTestPhraseMatchedTranscript> matchedTranscripts) {
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
    PublishProgramTestTopicPhraseResults publishProgramTestTopicPhraseResults = (PublishProgramTestTopicPhraseResults) o;

    return Objects.equals(this.processedTranscriptsCount, publishProgramTestTopicPhraseResults.processedTranscriptsCount) &&
            Objects.equals(this.matchedTranscriptsCount, publishProgramTestTopicPhraseResults.matchedTranscriptsCount) &&
            Objects.equals(this.matchedTranscripts, publishProgramTestTopicPhraseResults.matchedTranscripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processedTranscriptsCount, matchedTranscriptsCount, matchedTranscripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishProgramTestTopicPhraseResults {\n");
    
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

