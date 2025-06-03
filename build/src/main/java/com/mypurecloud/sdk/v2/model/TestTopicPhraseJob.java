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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * TestTopicPhraseJob
 */

public class TestTopicPhraseJob  implements Serializable {
  
  private String id = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RUNNING("Running"),
    COMPLETED("Completed"),
    FAILED("Failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private AddressableEntityRef createdBy = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer processedTranscriptsCount = null;
  private Integer matchedTranscriptsCount = null;
  private String selfUri = null;

  public TestTopicPhraseJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public TestTopicPhraseJob state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   **/
  public TestTopicPhraseJob createdBy(AddressableEntityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public AddressableEntityRef getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(AddressableEntityRef createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TestTopicPhraseJob dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TestTopicPhraseJob dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   **/
  public TestTopicPhraseJob processedTranscriptsCount(Integer processedTranscriptsCount) {
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
  public TestTopicPhraseJob matchedTranscriptsCount(Integer matchedTranscriptsCount) {
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
    TestTopicPhraseJob testTopicPhraseJob = (TestTopicPhraseJob) o;

    return Objects.equals(this.id, testTopicPhraseJob.id) &&
            Objects.equals(this.state, testTopicPhraseJob.state) &&
            Objects.equals(this.createdBy, testTopicPhraseJob.createdBy) &&
            Objects.equals(this.dateCreated, testTopicPhraseJob.dateCreated) &&
            Objects.equals(this.dateModified, testTopicPhraseJob.dateModified) &&
            Objects.equals(this.processedTranscriptsCount, testTopicPhraseJob.processedTranscriptsCount) &&
            Objects.equals(this.matchedTranscriptsCount, testTopicPhraseJob.matchedTranscriptsCount) &&
            Objects.equals(this.selfUri, testTopicPhraseJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, createdBy, dateCreated, dateModified, processedTranscriptsCount, matchedTranscriptsCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestTopicPhraseJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    processedTranscriptsCount: ").append(toIndentedString(processedTranscriptsCount)).append("\n");
    sb.append("    matchedTranscriptsCount: ").append(toIndentedString(matchedTranscriptsCount)).append("\n");
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

