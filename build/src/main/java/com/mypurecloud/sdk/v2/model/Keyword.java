package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Keyword
 */

public class Keyword  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String phrase = null;
  private Integer confidence = null;
  private Integer agentScoreModifier = null;
  private Integer customerScoreModifier = null;
  private List<String> alternateSpellings = new ArrayList<String>();
  private List<String> pronunciations = new ArrayList<String>();
  private List<String> antiWords = new ArrayList<String>();
  private List<String> antiPronunciations = new ArrayList<String>();
  private Double spotabilityIndex = null;
  private Double marginOfError = null;
  private String pronunciation = null;

  
  /**
   **/
  public Keyword id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public Keyword name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The word or phrase which is being looked for with speech recognition.
   **/
  public Keyword phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The word or phrase which is being looked for with speech recognition.")
  @JsonProperty("phrase")
  public String getPhrase() {
    return phrase;
  }
  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  
  /**
   * A sensitivity threshold that can be increased to lower false positives or decreased to reduce false negatives.
   **/
  public Keyword confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A sensitivity threshold that can be increased to lower false positives or decreased to reduce false negatives.")
  @JsonProperty("confidence")
  public Integer getConfidence() {
    return confidence;
  }
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  
  /**
   * A modifier to the evaluation score when the phrase is spotted in the agent channel
   **/
  public Keyword agentScoreModifier(Integer agentScoreModifier) {
    this.agentScoreModifier = agentScoreModifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A modifier to the evaluation score when the phrase is spotted in the agent channel")
  @JsonProperty("agentScoreModifier")
  public Integer getAgentScoreModifier() {
    return agentScoreModifier;
  }
  public void setAgentScoreModifier(Integer agentScoreModifier) {
    this.agentScoreModifier = agentScoreModifier;
  }

  
  /**
   * A modifier to the evaluation score when the phrase is spotted in the customer channel
   **/
  public Keyword customerScoreModifier(Integer customerScoreModifier) {
    this.customerScoreModifier = customerScoreModifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A modifier to the evaluation score when the phrase is spotted in the customer channel")
  @JsonProperty("customerScoreModifier")
  public Integer getCustomerScoreModifier() {
    return customerScoreModifier;
  }
  public void setCustomerScoreModifier(Integer customerScoreModifier) {
    this.customerScoreModifier = customerScoreModifier;
  }

  
  /**
   * Other spellings of the phrase that can be added to reduce missed spots (false negatives).
   **/
  public Keyword alternateSpellings(List<String> alternateSpellings) {
    this.alternateSpellings = alternateSpellings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Other spellings of the phrase that can be added to reduce missed spots (false negatives).")
  @JsonProperty("alternateSpellings")
  public List<String> getAlternateSpellings() {
    return alternateSpellings;
  }
  public void setAlternateSpellings(List<String> alternateSpellings) {
    this.alternateSpellings = alternateSpellings;
  }

  
  /**
   * The phonetic spellings for the phrase and alternate spellings.
   **/
  public Keyword pronunciations(List<String> pronunciations) {
    this.pronunciations = pronunciations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phonetic spellings for the phrase and alternate spellings.")
  @JsonProperty("pronunciations")
  public List<String> getPronunciations() {
    return pronunciations;
  }
  public void setPronunciations(List<String> pronunciations) {
    this.pronunciations = pronunciations;
  }

  
  /**
   * Words that are similar to the phrase but not desired. Added to reduce incorrect spots (false positives).
   **/
  public Keyword antiWords(List<String> antiWords) {
    this.antiWords = antiWords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Words that are similar to the phrase but not desired. Added to reduce incorrect spots (false positives).")
  @JsonProperty("antiWords")
  public List<String> getAntiWords() {
    return antiWords;
  }
  public void setAntiWords(List<String> antiWords) {
    this.antiWords = antiWords;
  }

  
  /**
   * The phonetic spellings for the antiWords.
   **/
  public Keyword antiPronunciations(List<String> antiPronunciations) {
    this.antiPronunciations = antiPronunciations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phonetic spellings for the antiWords.")
  @JsonProperty("antiPronunciations")
  public List<String> getAntiPronunciations() {
    return antiPronunciations;
  }
  public void setAntiPronunciations(List<String> antiPronunciations) {
    this.antiPronunciations = antiPronunciations;
  }

  
  /**
   * A prediction of how easy it is to unambiguously spot the keyword within its language based on spelling.
   **/
  public Keyword spotabilityIndex(Double spotabilityIndex) {
    this.spotabilityIndex = spotabilityIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A prediction of how easy it is to unambiguously spot the keyword within its language based on spelling.")
  @JsonProperty("spotabilityIndex")
  public Double getSpotabilityIndex() {
    return spotabilityIndex;
  }
  public void setSpotabilityIndex(Double spotabilityIndex) {
    this.spotabilityIndex = spotabilityIndex;
  }

  
  /**
   **/
  public Keyword marginOfError(Double marginOfError) {
    this.marginOfError = marginOfError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("marginOfError")
  public Double getMarginOfError() {
    return marginOfError;
  }
  public void setMarginOfError(Double marginOfError) {
    this.marginOfError = marginOfError;
  }

  
  /**
   **/
  public Keyword pronunciation(String pronunciation) {
    this.pronunciation = pronunciation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pronunciation")
  public String getPronunciation() {
    return pronunciation;
  }
  public void setPronunciation(String pronunciation) {
    this.pronunciation = pronunciation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Keyword keyword = (Keyword) o;
    return Objects.equals(this.id, keyword.id) &&
        Objects.equals(this.name, keyword.name) &&
        Objects.equals(this.phrase, keyword.phrase) &&
        Objects.equals(this.confidence, keyword.confidence) &&
        Objects.equals(this.agentScoreModifier, keyword.agentScoreModifier) &&
        Objects.equals(this.customerScoreModifier, keyword.customerScoreModifier) &&
        Objects.equals(this.alternateSpellings, keyword.alternateSpellings) &&
        Objects.equals(this.pronunciations, keyword.pronunciations) &&
        Objects.equals(this.antiWords, keyword.antiWords) &&
        Objects.equals(this.antiPronunciations, keyword.antiPronunciations) &&
        Objects.equals(this.spotabilityIndex, keyword.spotabilityIndex) &&
        Objects.equals(this.marginOfError, keyword.marginOfError) &&
        Objects.equals(this.pronunciation, keyword.pronunciation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phrase, confidence, agentScoreModifier, customerScoreModifier, alternateSpellings, pronunciations, antiWords, antiPronunciations, spotabilityIndex, marginOfError, pronunciation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Keyword {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    agentScoreModifier: ").append(toIndentedString(agentScoreModifier)).append("\n");
    sb.append("    customerScoreModifier: ").append(toIndentedString(customerScoreModifier)).append("\n");
    sb.append("    alternateSpellings: ").append(toIndentedString(alternateSpellings)).append("\n");
    sb.append("    pronunciations: ").append(toIndentedString(pronunciations)).append("\n");
    sb.append("    antiWords: ").append(toIndentedString(antiWords)).append("\n");
    sb.append("    antiPronunciations: ").append(toIndentedString(antiPronunciations)).append("\n");
    sb.append("    spotabilityIndex: ").append(toIndentedString(spotabilityIndex)).append("\n");
    sb.append("    marginOfError: ").append(toIndentedString(marginOfError)).append("\n");
    sb.append("    pronunciation: ").append(toIndentedString(pronunciation)).append("\n");
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

