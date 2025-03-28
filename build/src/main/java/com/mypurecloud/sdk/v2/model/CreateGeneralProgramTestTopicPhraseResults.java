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
import com.mypurecloud.sdk.v2.model.CreateGeneralProgramTestPhraseMatchedTranscript;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateGeneralProgramTestTopicPhraseResults
 */

public class CreateGeneralProgramTestTopicPhraseResults  implements Serializable {
  
  private Integer processedTranscriptsCount = null;
  private Integer matchedTranscriptsCount = null;
  private List<CreateGeneralProgramTestPhraseMatchedTranscript> matchedTranscripts = new ArrayList<CreateGeneralProgramTestPhraseMatchedTranscript>();

  
  /**
   **/
  public CreateGeneralProgramTestTopicPhraseResults processedTranscriptsCount(Integer processedTranscriptsCount) {
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
  public CreateGeneralProgramTestTopicPhraseResults matchedTranscriptsCount(Integer matchedTranscriptsCount) {
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
  public CreateGeneralProgramTestTopicPhraseResults matchedTranscripts(List<CreateGeneralProgramTestPhraseMatchedTranscript> matchedTranscripts) {
    this.matchedTranscripts = matchedTranscripts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("matchedTranscripts")
  public List<CreateGeneralProgramTestPhraseMatchedTranscript> getMatchedTranscripts() {
    return matchedTranscripts;
  }
  public void setMatchedTranscripts(List<CreateGeneralProgramTestPhraseMatchedTranscript> matchedTranscripts) {
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
    CreateGeneralProgramTestTopicPhraseResults createGeneralProgramTestTopicPhraseResults = (CreateGeneralProgramTestTopicPhraseResults) o;

    return Objects.equals(this.processedTranscriptsCount, createGeneralProgramTestTopicPhraseResults.processedTranscriptsCount) &&
            Objects.equals(this.matchedTranscriptsCount, createGeneralProgramTestTopicPhraseResults.matchedTranscriptsCount) &&
            Objects.equals(this.matchedTranscripts, createGeneralProgramTestTopicPhraseResults.matchedTranscripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processedTranscriptsCount, matchedTranscriptsCount, matchedTranscripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGeneralProgramTestTopicPhraseResults {\n");
    
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

