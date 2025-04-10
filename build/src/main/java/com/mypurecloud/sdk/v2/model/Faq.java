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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Faq
 */

public class Faq  implements Serializable {
  
  private String question = null;
  private String answer = null;
  private String sourceUri = null;
  private String documentUrl = null;
  private String documentDisplayName = null;
  private Float confidence = null;

  public Faq() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Question from the knowledge base that was matched to user request.")
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }


  @ApiModelProperty(example = "null", value = "Answer from the knowledge base corresponding to the identified question.")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }


  @ApiModelProperty(example = "null", value = "A URI uniquely identifying the document, e.g. projects/acme-inc/knowledgeBases/MTAyNjgxNDU1Nzc3NTM1NzU0MjQ/documents/MTI5ODc3NzQzOTQ5MTc5NzgxMTI.")
  @JsonProperty("sourceUri")
  public String getSourceUri() {
    return sourceUri;
  }


  @ApiModelProperty(example = "null", value = "URL pointing to a web page if document was sourced from a URL.")
  @JsonProperty("documentUrl")
  public String getDocumentUrl() {
    return documentUrl;
  }


  @ApiModelProperty(example = "null", value = "A human-readable description of the document, e.g. 'Sample store FAQ'")
  @JsonProperty("documentDisplayName")
  public String getDocumentDisplayName() {
    return documentDisplayName;
  }


  @ApiModelProperty(example = "null", value = "Value between 0 and 1. 1 corresponds to very confident, 0 to not confident at all")
  @JsonProperty("confidence")
  public Float getConfidence() {
    return confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Faq faq = (Faq) o;

    return Objects.equals(this.question, faq.question) &&
            Objects.equals(this.answer, faq.answer) &&
            Objects.equals(this.sourceUri, faq.sourceUri) &&
            Objects.equals(this.documentUrl, faq.documentUrl) &&
            Objects.equals(this.documentDisplayName, faq.documentDisplayName) &&
            Objects.equals(this.confidence, faq.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, answer, sourceUri, documentUrl, documentDisplayName, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Faq {\n");
    
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    sourceUri: ").append(toIndentedString(sourceUri)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    documentDisplayName: ").append(toIndentedString(documentDisplayName)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

