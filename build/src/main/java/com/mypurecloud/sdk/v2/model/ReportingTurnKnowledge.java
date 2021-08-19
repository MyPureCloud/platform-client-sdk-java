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
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledgeFeedback;
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledgeSearch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReportingTurnKnowledge
 */

public class ReportingTurnKnowledge  implements Serializable {
  
  private String knowledgeBaseId = null;
  private ReportingTurnKnowledgeFeedback feedback = null;
  private ReportingTurnKnowledgeSearch search = null;

  
  /**
   * The Knowledge Base ID that the captured knowledge data relates to.
   **/
  public ReportingTurnKnowledge knowledgeBaseId(String knowledgeBaseId) {
    this.knowledgeBaseId = knowledgeBaseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Knowledge Base ID that the captured knowledge data relates to.")
  @JsonProperty("knowledgeBaseId")
  public String getKnowledgeBaseId() {
    return knowledgeBaseId;
  }
  public void setKnowledgeBaseId(String knowledgeBaseId) {
    this.knowledgeBaseId = knowledgeBaseId;
  }

  
  /**
   * The knowledge feedback data that was captured during this reporting turn.
   **/
  public ReportingTurnKnowledge feedback(ReportingTurnKnowledgeFeedback feedback) {
    this.feedback = feedback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge feedback data that was captured during this reporting turn.")
  @JsonProperty("feedback")
  public ReportingTurnKnowledgeFeedback getFeedback() {
    return feedback;
  }
  public void setFeedback(ReportingTurnKnowledgeFeedback feedback) {
    this.feedback = feedback;
  }

  
  /**
   * The knowledge search data that was captured during this reporting turn.
   **/
  public ReportingTurnKnowledge search(ReportingTurnKnowledgeSearch search) {
    this.search = search;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge search data that was captured during this reporting turn.")
  @JsonProperty("search")
  public ReportingTurnKnowledgeSearch getSearch() {
    return search;
  }
  public void setSearch(ReportingTurnKnowledgeSearch search) {
    this.search = search;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnKnowledge reportingTurnKnowledge = (ReportingTurnKnowledge) o;
    return Objects.equals(this.knowledgeBaseId, reportingTurnKnowledge.knowledgeBaseId) &&
        Objects.equals(this.feedback, reportingTurnKnowledge.feedback) &&
        Objects.equals(this.search, reportingTurnKnowledge.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeBaseId, feedback, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnKnowledge {\n");
    
    sb.append("    knowledgeBaseId: ").append(toIndentedString(knowledgeBaseId)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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

