package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Annotation
 */

public class Annotation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String type = null;
  private Long location = null;
  private Long durationMs = null;
  private User user = null;
  private String description = null;
  private String keywordName = null;
  private Float confidence = null;
  private String keywordSetId = null;
  private String keywordSetName = null;
  private String utterance = null;
  private String timeBegin = null;
  private String timeEnd = null;
  private String keywordConfidenceThreshold = null;
  private String agentScoreModifier = null;
  private String customerScoreModifier = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Annotation name(String name) {
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
   **/
  public Annotation type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Offset of annotation in milliseconds.
   **/
  public Annotation location(Long location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Offset of annotation in milliseconds.")
  @JsonProperty("location")
  public Long getLocation() {
    return location;
  }
  public void setLocation(Long location) {
    this.location = location;
  }

  
  /**
   * Duration of annotation in milliseconds.
   **/
  public Annotation durationMs(Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Duration of annotation in milliseconds.")
  @JsonProperty("durationMs")
  public Long getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }

  
  /**
   * User that created this annotation (if any).
   **/
  public Annotation user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that created this annotation (if any).")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   * Text of annotation.
   **/
  public Annotation description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text of annotation.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The word or phrase which is being looked for with speech recognition.
   **/
  public Annotation keywordName(String keywordName) {
    this.keywordName = keywordName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The word or phrase which is being looked for with speech recognition.")
  @JsonProperty("keywordName")
  public String getKeywordName() {
    return keywordName;
  }
  public void setKeywordName(String keywordName) {
    this.keywordName = keywordName;
  }

  
  /**
   * Actual confidence that this is an accurate match.
   **/
  public Annotation confidence(Float confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actual confidence that this is an accurate match.")
  @JsonProperty("confidence")
  public Float getConfidence() {
    return confidence;
  }
  public void setConfidence(Float confidence) {
    this.confidence = confidence;
  }

  
  /**
   * A unique identifier for the keyword set to which this spotted keyword belongs.
   **/
  public Annotation keywordSetId(String keywordSetId) {
    this.keywordSetId = keywordSetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for the keyword set to which this spotted keyword belongs.")
  @JsonProperty("keywordSetId")
  public String getKeywordSetId() {
    return keywordSetId;
  }
  public void setKeywordSetId(String keywordSetId) {
    this.keywordSetId = keywordSetId;
  }

  
  /**
   * The keyword set to which this spotted keyword belongs.
   **/
  public Annotation keywordSetName(String keywordSetName) {
    this.keywordSetName = keywordSetName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The keyword set to which this spotted keyword belongs.")
  @JsonProperty("keywordSetName")
  public String getKeywordSetName() {
    return keywordSetName;
  }
  public void setKeywordSetName(String keywordSetName) {
    this.keywordSetName = keywordSetName;
  }

  
  /**
   * The phonetic spellings for the phrase and alternate spellings.
   **/
  public Annotation utterance(String utterance) {
    this.utterance = utterance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phonetic spellings for the phrase and alternate spellings.")
  @JsonProperty("utterance")
  public String getUtterance() {
    return utterance;
  }
  public void setUtterance(String utterance) {
    this.utterance = utterance;
  }

  
  /**
   * Beginning time offset of the keyword spot match.
   **/
  public Annotation timeBegin(String timeBegin) {
    this.timeBegin = timeBegin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Beginning time offset of the keyword spot match.")
  @JsonProperty("timeBegin")
  public String getTimeBegin() {
    return timeBegin;
  }
  public void setTimeBegin(String timeBegin) {
    this.timeBegin = timeBegin;
  }

  
  /**
   * Ending time offset of the keyword spot match.
   **/
  public Annotation timeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ending time offset of the keyword spot match.")
  @JsonProperty("timeEnd")
  public String getTimeEnd() {
    return timeEnd;
  }
  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  
  /**
   * Configured sensitivity threshold that can be increased to lower false positives or decreased to reduce false negatives.
   **/
  public Annotation keywordConfidenceThreshold(String keywordConfidenceThreshold) {
    this.keywordConfidenceThreshold = keywordConfidenceThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configured sensitivity threshold that can be increased to lower false positives or decreased to reduce false negatives.")
  @JsonProperty("keywordConfidenceThreshold")
  public String getKeywordConfidenceThreshold() {
    return keywordConfidenceThreshold;
  }
  public void setKeywordConfidenceThreshold(String keywordConfidenceThreshold) {
    this.keywordConfidenceThreshold = keywordConfidenceThreshold;
  }

  
  /**
   * A modifier to the evaluation score when the phrase is spotted in the agent channel.
   **/
  public Annotation agentScoreModifier(String agentScoreModifier) {
    this.agentScoreModifier = agentScoreModifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A modifier to the evaluation score when the phrase is spotted in the agent channel.")
  @JsonProperty("agentScoreModifier")
  public String getAgentScoreModifier() {
    return agentScoreModifier;
  }
  public void setAgentScoreModifier(String agentScoreModifier) {
    this.agentScoreModifier = agentScoreModifier;
  }

  
  /**
   * A modifier to the evaluation score when the phrase is spotted in the customer channel.
   **/
  public Annotation customerScoreModifier(String customerScoreModifier) {
    this.customerScoreModifier = customerScoreModifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A modifier to the evaluation score when the phrase is spotted in the customer channel.")
  @JsonProperty("customerScoreModifier")
  public String getCustomerScoreModifier() {
    return customerScoreModifier;
  }
  public void setCustomerScoreModifier(String customerScoreModifier) {
    this.customerScoreModifier = customerScoreModifier;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annotation annotation = (Annotation) o;
    return Objects.equals(this.id, annotation.id) &&
        Objects.equals(this.name, annotation.name) &&
        Objects.equals(this.type, annotation.type) &&
        Objects.equals(this.location, annotation.location) &&
        Objects.equals(this.durationMs, annotation.durationMs) &&
        Objects.equals(this.user, annotation.user) &&
        Objects.equals(this.description, annotation.description) &&
        Objects.equals(this.keywordName, annotation.keywordName) &&
        Objects.equals(this.confidence, annotation.confidence) &&
        Objects.equals(this.keywordSetId, annotation.keywordSetId) &&
        Objects.equals(this.keywordSetName, annotation.keywordSetName) &&
        Objects.equals(this.utterance, annotation.utterance) &&
        Objects.equals(this.timeBegin, annotation.timeBegin) &&
        Objects.equals(this.timeEnd, annotation.timeEnd) &&
        Objects.equals(this.keywordConfidenceThreshold, annotation.keywordConfidenceThreshold) &&
        Objects.equals(this.agentScoreModifier, annotation.agentScoreModifier) &&
        Objects.equals(this.customerScoreModifier, annotation.customerScoreModifier) &&
        Objects.equals(this.selfUri, annotation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, location, durationMs, user, description, keywordName, confidence, keywordSetId, keywordSetName, utterance, timeBegin, timeEnd, keywordConfidenceThreshold, agentScoreModifier, customerScoreModifier, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annotation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywordName: ").append(toIndentedString(keywordName)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    keywordSetId: ").append(toIndentedString(keywordSetId)).append("\n");
    sb.append("    keywordSetName: ").append(toIndentedString(keywordSetName)).append("\n");
    sb.append("    utterance: ").append(toIndentedString(utterance)).append("\n");
    sb.append("    timeBegin: ").append(toIndentedString(timeBegin)).append("\n");
    sb.append("    timeEnd: ").append(toIndentedString(timeEnd)).append("\n");
    sb.append("    keywordConfidenceThreshold: ").append(toIndentedString(keywordConfidenceThreshold)).append("\n");
    sb.append("    agentScoreModifier: ").append(toIndentedString(agentScoreModifier)).append("\n");
    sb.append("    customerScoreModifier: ").append(toIndentedString(customerScoreModifier)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

