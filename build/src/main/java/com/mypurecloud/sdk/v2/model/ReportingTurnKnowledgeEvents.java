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
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledgeFeedbackEvent;
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledgeSearchEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReportingTurnKnowledgeEvents
 */

public class ReportingTurnKnowledgeEvents  implements Serializable {
  
  private List<ReportingTurnKnowledgeSearchEvent> search = null;
  private List<ReportingTurnKnowledgeFeedbackEvent> feedback = null;

  public ReportingTurnKnowledgeEvents() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      search = new ArrayList<ReportingTurnKnowledgeSearchEvent>();
      feedback = new ArrayList<ReportingTurnKnowledgeFeedbackEvent>();
    }
  }

  
  /**
   * The knowledge search data captured during this reporting turn.
   **/
  public ReportingTurnKnowledgeEvents search(List<ReportingTurnKnowledgeSearchEvent> search) {
    this.search = search;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge search data captured during this reporting turn.")
  @JsonProperty("search")
  public List<ReportingTurnKnowledgeSearchEvent> getSearch() {
    return search;
  }
  public void setSearch(List<ReportingTurnKnowledgeSearchEvent> search) {
    this.search = search;
  }


  /**
   * The knowledge feedback data captured during this reporting turn.
   **/
  public ReportingTurnKnowledgeEvents feedback(List<ReportingTurnKnowledgeFeedbackEvent> feedback) {
    this.feedback = feedback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge feedback data captured during this reporting turn.")
  @JsonProperty("feedback")
  public List<ReportingTurnKnowledgeFeedbackEvent> getFeedback() {
    return feedback;
  }
  public void setFeedback(List<ReportingTurnKnowledgeFeedbackEvent> feedback) {
    this.feedback = feedback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnKnowledgeEvents reportingTurnKnowledgeEvents = (ReportingTurnKnowledgeEvents) o;

    return Objects.equals(this.search, reportingTurnKnowledgeEvents.search) &&
            Objects.equals(this.feedback, reportingTurnKnowledgeEvents.feedback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(search, feedback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnKnowledgeEvents {\n");
    
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
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

