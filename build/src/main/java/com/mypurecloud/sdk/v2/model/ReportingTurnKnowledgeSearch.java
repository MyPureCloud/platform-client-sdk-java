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
 * ReportingTurnKnowledgeSearch
 */

public class ReportingTurnKnowledgeSearch  implements Serializable {
  
  private String searchId = null;
  private List<ReportingTurnKnowledgeDocument> documents = new ArrayList<ReportingTurnKnowledgeDocument>();
  private String query = null;

  
  /**
   * The ID of this knowledge search.
   **/
  public ReportingTurnKnowledgeSearch searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of this knowledge search.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }

  
  /**
   * The list of search documents captured during this reporting turn.
   **/
  public ReportingTurnKnowledgeSearch documents(List<ReportingTurnKnowledgeDocument> documents) {
    this.documents = documents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of search documents captured during this reporting turn.")
  @JsonProperty("documents")
  public List<ReportingTurnKnowledgeDocument> getDocuments() {
    return documents;
  }
  public void setDocuments(List<ReportingTurnKnowledgeDocument> documents) {
    this.documents = documents;
  }

  
  /**
   * The search query that was used to search the Knowledge Base documents for a matching question.
   **/
  public ReportingTurnKnowledgeSearch query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search query that was used to search the Knowledge Base documents for a matching question.")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnKnowledgeSearch reportingTurnKnowledgeSearch = (ReportingTurnKnowledgeSearch) o;
    return Objects.equals(this.searchId, reportingTurnKnowledgeSearch.searchId) &&
        Objects.equals(this.documents, reportingTurnKnowledgeSearch.documents) &&
        Objects.equals(this.query, reportingTurnKnowledgeSearch.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, documents, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnKnowledgeSearch {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

