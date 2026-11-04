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
import com.mypurecloud.sdk.v2.model.KnowledgeRetrievedReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSearchResult
 */

public class KnowledgeSearchResult  implements Serializable {
  
  private String generatedAnswer = null;
  private List<KnowledgeRetrievedReference> retrievedReferences = null;

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
   * Reason the search request did not produce an answer or relevant content.
   */
 @JsonDeserialize(using = FailureReasonEnumDeserializer.class)
  public enum FailureReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EMPTY(""),
    UNKNOWN("unknown"),
    INVALIDQUERY("invalidQuery"),
    RATELIMITEXCEEDED("rateLimitExceeded"),
    MODELTIMEOUT("modelTimeout"),
    PROMPTINJECTION("promptInjection"),
    NOCITATIONS("noCitations"),
    INVALIDANSWERFORMAT("invalidAnswerFormat"),
    UNANSWERABLE("unanswerable"),
    POSTPROCESSINGREJECTED("postProcessingRejected"),
    SIMILARTOCONVERSATION("similarToConversation"),
    IGNORABLEPHRASE("ignorablePhrase"),
    MODELERROR("modelError"),
    NOCHUNKSFOUND("noChunksFound"),
    ANSWERGENERATIONTIMEOUT("answerGenerationTimeout");

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
  private String message = null;

  public KnowledgeSearchResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      retrievedReferences = new ArrayList<KnowledgeRetrievedReference>();
    }
  }

  public KnowledgeSearchResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      retrievedReferences = new ArrayList<KnowledgeRetrievedReference>();
    }
  }

  
  /**
   * The generated answer for search query.
   **/
  public KnowledgeSearchResult generatedAnswer(String generatedAnswer) {
    this.generatedAnswer = generatedAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The generated answer for search query.")
  @JsonProperty("generatedAnswer")
  public String getGeneratedAnswer() {
    return generatedAnswer;
  }
  public void setGeneratedAnswer(String generatedAnswer) {
    this.generatedAnswer = generatedAnswer;
  }


  /**
   * The retrieved references for the search query.
   **/
  public KnowledgeSearchResult retrievedReferences(List<KnowledgeRetrievedReference> retrievedReferences) {
    this.retrievedReferences = retrievedReferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The retrieved references for the search query.")
  @JsonProperty("retrievedReferences")
  public List<KnowledgeRetrievedReference> getRetrievedReferences() {
    return retrievedReferences;
  }
  public void setRetrievedReferences(List<KnowledgeRetrievedReference> retrievedReferences) {
    this.retrievedReferences = retrievedReferences;
  }


  /**
   * Reason the search request did not produce an answer or relevant content.
   **/
  public KnowledgeSearchResult failureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reason the search request did not produce an answer or relevant content.")
  @JsonProperty("failureReason")
  public FailureReasonEnum getFailureReason() {
    return failureReason;
  }
  public void setFailureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
  }


  /**
   * A detailed error message describing the failureReason.
   **/
  public KnowledgeSearchResult message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A detailed error message describing the failureReason.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSearchResult knowledgeSearchResult = (KnowledgeSearchResult) o;

    return Objects.equals(this.generatedAnswer, knowledgeSearchResult.generatedAnswer) &&
            Objects.equals(this.retrievedReferences, knowledgeSearchResult.retrievedReferences) &&
            Objects.equals(this.failureReason, knowledgeSearchResult.failureReason) &&
            Objects.equals(this.message, knowledgeSearchResult.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generatedAnswer, retrievedReferences, failureReason, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSearchResult {\n");
    
    sb.append("    generatedAnswer: ").append(toIndentedString(generatedAnswer)).append("\n");
    sb.append("    retrievedReferences: ").append(toIndentedString(retrievedReferences)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

