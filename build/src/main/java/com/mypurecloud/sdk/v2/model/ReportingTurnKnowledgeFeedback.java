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
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledgeDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReportingTurnKnowledgeFeedback
 */

public class ReportingTurnKnowledgeFeedback  implements Serializable {
  
  private String searchId = null;
  private Integer rating = null;
  private List<ReportingTurnKnowledgeDocument> documents = new ArrayList<ReportingTurnKnowledgeDocument>();

  
  /**
   * The ID of the original knowledge search that this feedback relates to.
   **/
  public ReportingTurnKnowledgeFeedback searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the original knowledge search that this feedback relates to.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }

  
  /**
   * The feedback rating for the search (1.0 - 5.0). 1 = Negative, 5 = Positive.
   **/
  public ReportingTurnKnowledgeFeedback rating(Integer rating) {
    this.rating = rating;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The feedback rating for the search (1.0 - 5.0). 1 = Negative, 5 = Positive.")
  @JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }
  public void setRating(Integer rating) {
    this.rating = rating;
  }

  
  /**
   * The list of search documents that the feedback applies to.
   **/
  public ReportingTurnKnowledgeFeedback documents(List<ReportingTurnKnowledgeDocument> documents) {
    this.documents = documents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of search documents that the feedback applies to.")
  @JsonProperty("documents")
  public List<ReportingTurnKnowledgeDocument> getDocuments() {
    return documents;
  }
  public void setDocuments(List<ReportingTurnKnowledgeDocument> documents) {
    this.documents = documents;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnKnowledgeFeedback reportingTurnKnowledgeFeedback = (ReportingTurnKnowledgeFeedback) o;
    return Objects.equals(this.searchId, reportingTurnKnowledgeFeedback.searchId) &&
        Objects.equals(this.rating, reportingTurnKnowledgeFeedback.rating) &&
        Objects.equals(this.documents, reportingTurnKnowledgeFeedback.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, rating, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnKnowledgeFeedback {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

