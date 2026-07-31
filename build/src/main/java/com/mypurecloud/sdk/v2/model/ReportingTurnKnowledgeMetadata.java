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
import com.mypurecloud.sdk.v2.model.KnowledgeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReportingTurnKnowledgeMetadata
 */

public class ReportingTurnKnowledgeMetadata  implements Serializable {
  
  private String knowledgeId = null;
  private String knowledgeName = null;
  private String searchId = null;
  private String query = null;

  private static class RetrievalStatusEnumDeserializer extends StdDeserializer<RetrievalStatusEnum> {
    public RetrievalStatusEnumDeserializer() {
      super(RetrievalStatusEnumDeserializer.class);
    }

    @Override
    public RetrievalStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RetrievalStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The result of the knowledge search
   */
 @JsonDeserialize(using = RetrievalStatusEnumDeserializer.class)
  public enum RetrievalStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUCCESS("Success"),
    FAILURE("Failure"),
    NORESULTS("NoResults"),
    TIMEOUT("Timeout"),
    UNKNOWN("Unknown");

    private String value;

    RetrievalStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RetrievalStatusEnum fromString(String key) {
      if (key == null) return null;

      for (RetrievalStatusEnum value : RetrievalStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RetrievalStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RetrievalStatusEnum retrievalStatus = null;

  private static class AnswerGenerationStatusEnumDeserializer extends StdDeserializer<AnswerGenerationStatusEnum> {
    public AnswerGenerationStatusEnumDeserializer() {
      super(AnswerGenerationStatusEnumDeserializer.class);
    }

    @Override
    public AnswerGenerationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AnswerGenerationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The result of the knowledge generation
   */
 @JsonDeserialize(using = AnswerGenerationStatusEnumDeserializer.class)
  public enum AnswerGenerationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUCCESS("Success"),
    FAILURE("Failure"),
    NOTATTEMPTED("NotAttempted"),
    NOANSWERGENERATED("NoAnswerGenerated"),
    TIMEOUT("Timeout"),
    UNKNOWN("Unknown");

    private String value;

    AnswerGenerationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AnswerGenerationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (AnswerGenerationStatusEnum value : AnswerGenerationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AnswerGenerationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AnswerGenerationStatusEnum answerGenerationStatus = null;
  private String generatedAnswer = null;

  private static class FailureReasonEnumDeserializer extends StdDeserializer<FailureReasonEnum> {
    public FailureReasonEnumDeserializer() {
      super(FailureReasonEnumDeserializer.class);
    }

    @Override
    public FailureReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FailureReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Failure reason if knowledge query failed
   */
 @JsonDeserialize(using = FailureReasonEnumDeserializer.class)
  public enum FailureReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTERNALERROR("InternalError"),
    UNKNOWN("Unknown");

    private String value;

    FailureReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FailureReasonEnum fromString(String key) {
      if (key == null) return null;

      for (FailureReasonEnum value : FailureReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FailureReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FailureReasonEnum failureReason = null;
  private Double topConfidence = null;
  private List<KnowledgeSource> retrievedSources = null;

  public ReportingTurnKnowledgeMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      retrievedSources = new ArrayList<KnowledgeSource>();
    }
  }

  public ReportingTurnKnowledgeMetadata(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      retrievedSources = new ArrayList<KnowledgeSource>();
    }
  }

  
  /**
   * The ID of the knowledge setting or knowledge base
   **/
  public ReportingTurnKnowledgeMetadata knowledgeId(String knowledgeId) {
    this.knowledgeId = knowledgeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the knowledge setting or knowledge base")
  @JsonProperty("knowledgeId")
  public String getKnowledgeId() {
    return knowledgeId;
  }
  public void setKnowledgeId(String knowledgeId) {
    this.knowledgeId = knowledgeId;
  }


  /**
   * The name of the knowledge setting or knowledge base
   **/
  public ReportingTurnKnowledgeMetadata knowledgeName(String knowledgeName) {
    this.knowledgeName = knowledgeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the knowledge setting or knowledge base")
  @JsonProperty("knowledgeName")
  public String getKnowledgeName() {
    return knowledgeName;
  }
  public void setKnowledgeName(String knowledgeName) {
    this.knowledgeName = knowledgeName;
  }


  /**
   * SearchID used in the attempted search
   **/
  public ReportingTurnKnowledgeMetadata searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SearchID used in the attempted search")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }


  /**
   * The query used in the knowledge query
   **/
  public ReportingTurnKnowledgeMetadata query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The query used in the knowledge query")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  /**
   * The result of the knowledge search
   **/
  public ReportingTurnKnowledgeMetadata retrievalStatus(RetrievalStatusEnum retrievalStatus) {
    this.retrievalStatus = retrievalStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the knowledge search")
  @JsonProperty("retrievalStatus")
  public RetrievalStatusEnum getRetrievalStatus() {
    return retrievalStatus;
  }
  public void setRetrievalStatus(RetrievalStatusEnum retrievalStatus) {
    this.retrievalStatus = retrievalStatus;
  }


  /**
   * The result of the knowledge generation
   **/
  public ReportingTurnKnowledgeMetadata answerGenerationStatus(AnswerGenerationStatusEnum answerGenerationStatus) {
    this.answerGenerationStatus = answerGenerationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the knowledge generation")
  @JsonProperty("answerGenerationStatus")
  public AnswerGenerationStatusEnum getAnswerGenerationStatus() {
    return answerGenerationStatus;
  }
  public void setAnswerGenerationStatus(AnswerGenerationStatusEnum answerGenerationStatus) {
    this.answerGenerationStatus = answerGenerationStatus;
  }


  /**
   * The generated answer
   **/
  public ReportingTurnKnowledgeMetadata generatedAnswer(String generatedAnswer) {
    this.generatedAnswer = generatedAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The generated answer")
  @JsonProperty("generatedAnswer")
  public String getGeneratedAnswer() {
    return generatedAnswer;
  }
  public void setGeneratedAnswer(String generatedAnswer) {
    this.generatedAnswer = generatedAnswer;
  }


  /**
   * Failure reason if knowledge query failed
   **/
  public ReportingTurnKnowledgeMetadata failureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Failure reason if knowledge query failed")
  @JsonProperty("failureReason")
  public FailureReasonEnum getFailureReason() {
    return failureReason;
  }
  public void setFailureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
  }


  /**
   * Highest confidence score of returned knowledgeSources
   **/
  public ReportingTurnKnowledgeMetadata topConfidence(Double topConfidence) {
    this.topConfidence = topConfidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Highest confidence score of returned knowledgeSources")
  @JsonProperty("topConfidence")
  public Double getTopConfidence() {
    return topConfidence;
  }
  public void setTopConfidence(Double topConfidence) {
    this.topConfidence = topConfidence;
  }


  /**
   * List of the sources retrieved by the knowledge search
   **/
  public ReportingTurnKnowledgeMetadata retrievedSources(List<KnowledgeSource> retrievedSources) {
    this.retrievedSources = retrievedSources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of the sources retrieved by the knowledge search")
  @JsonProperty("retrievedSources")
  public List<KnowledgeSource> getRetrievedSources() {
    return retrievedSources;
  }
  public void setRetrievedSources(List<KnowledgeSource> retrievedSources) {
    this.retrievedSources = retrievedSources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnKnowledgeMetadata reportingTurnKnowledgeMetadata = (ReportingTurnKnowledgeMetadata) o;

    return Objects.equals(this.knowledgeId, reportingTurnKnowledgeMetadata.knowledgeId) &&
            Objects.equals(this.knowledgeName, reportingTurnKnowledgeMetadata.knowledgeName) &&
            Objects.equals(this.searchId, reportingTurnKnowledgeMetadata.searchId) &&
            Objects.equals(this.query, reportingTurnKnowledgeMetadata.query) &&
            Objects.equals(this.retrievalStatus, reportingTurnKnowledgeMetadata.retrievalStatus) &&
            Objects.equals(this.answerGenerationStatus, reportingTurnKnowledgeMetadata.answerGenerationStatus) &&
            Objects.equals(this.generatedAnswer, reportingTurnKnowledgeMetadata.generatedAnswer) &&
            Objects.equals(this.failureReason, reportingTurnKnowledgeMetadata.failureReason) &&
            Objects.equals(this.topConfidence, reportingTurnKnowledgeMetadata.topConfidence) &&
            Objects.equals(this.retrievedSources, reportingTurnKnowledgeMetadata.retrievedSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeId, knowledgeName, searchId, query, retrievalStatus, answerGenerationStatus, generatedAnswer, failureReason, topConfidence, retrievedSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnKnowledgeMetadata {\n");
    
    sb.append("    knowledgeId: ").append(toIndentedString(knowledgeId)).append("\n");
    sb.append("    knowledgeName: ").append(toIndentedString(knowledgeName)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    retrievalStatus: ").append(toIndentedString(retrievalStatus)).append("\n");
    sb.append("    answerGenerationStatus: ").append(toIndentedString(answerGenerationStatus)).append("\n");
    sb.append("    generatedAnswer: ").append(toIndentedString(generatedAnswer)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    topConfidence: ").append(toIndentedString(topConfidence)).append("\n");
    sb.append("    retrievedSources: ").append(toIndentedString(retrievedSources)).append("\n");
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

