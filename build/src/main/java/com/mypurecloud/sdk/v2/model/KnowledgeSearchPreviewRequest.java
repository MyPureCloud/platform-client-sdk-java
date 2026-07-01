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
import com.mypurecloud.sdk.v2.model.KnowledgeConversationTurn;
import com.mypurecloud.sdk.v2.model.KnowledgeGenerationSetting;
import com.mypurecloud.sdk.v2.model.KnowledgeV3PreviewConversationContext;
import com.mypurecloud.sdk.v2.model.V3KnowledgeSearchPreviewClientApplication;
import com.mypurecloud.sdk.v2.model.V3SourceRef;
import com.mypurecloud.sdk.v2.model.V3SourceTagFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSearchPreviewRequest
 */

public class KnowledgeSearchPreviewRequest  implements Serializable {
  
  private String query = null;
  private List<V3SourceRef> sources = null;
  private KnowledgeGenerationSetting generationSetting = null;
  private Boolean stateful = null;
  private List<KnowledgeConversationTurn> conversationTurns = null;
  private V3SourceTagFilter filter = null;
  private V3KnowledgeSearchPreviewClientApplication application = null;
  private KnowledgeV3PreviewConversationContext conversationContext = null;

  public KnowledgeSearchPreviewRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sources = new ArrayList<V3SourceRef>();
      conversationTurns = new ArrayList<KnowledgeConversationTurn>();
    }
  }

  public KnowledgeSearchPreviewRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      sources = new ArrayList<V3SourceRef>();
      conversationTurns = new ArrayList<KnowledgeConversationTurn>();
    }
  }

  
  /**
   * Query to search content in the knowledge sources.
   **/
  public KnowledgeSearchPreviewRequest query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Query to search content in the knowledge sources.")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  /**
   * Source information to search upon.
   **/
  public KnowledgeSearchPreviewRequest sources(List<V3SourceRef> sources) {
    this.sources = sources;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Source information to search upon.")
  @JsonProperty("sources")
  public List<V3SourceRef> getSources() {
    return sources;
  }
  public void setSources(List<V3SourceRef> sources) {
    this.sources = sources;
  }


  /**
   * Setting for answer generation.
   **/
  public KnowledgeSearchPreviewRequest generationSetting(KnowledgeGenerationSetting generationSetting) {
    this.generationSetting = generationSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Setting for answer generation.")
  @JsonProperty("generationSetting")
  public KnowledgeGenerationSetting getGenerationSetting() {
    return generationSetting;
  }
  public void setGenerationSetting(KnowledgeGenerationSetting generationSetting) {
    this.generationSetting = generationSetting;
  }


  /**
   * Indicates if stateful search and generation is enabled for the knowledge setting.
   **/
  public KnowledgeSearchPreviewRequest stateful(Boolean stateful) {
    this.stateful = stateful;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if stateful search and generation is enabled for the knowledge setting.")
  @JsonProperty("stateful")
  public Boolean getStateful() {
    return stateful;
  }
  public void setStateful(Boolean stateful) {
    this.stateful = stateful;
  }


  /**
   * List of conversation turns to use for stateful search.
   **/
  public KnowledgeSearchPreviewRequest conversationTurns(List<KnowledgeConversationTurn> conversationTurns) {
    this.conversationTurns = conversationTurns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of conversation turns to use for stateful search.")
  @JsonProperty("conversationTurns")
  public List<KnowledgeConversationTurn> getConversationTurns() {
    return conversationTurns;
  }
  public void setConversationTurns(List<KnowledgeConversationTurn> conversationTurns) {
    this.conversationTurns = conversationTurns;
  }


  /**
   * Composite tag filter applied to the search preview.
   **/
  public KnowledgeSearchPreviewRequest filter(V3SourceTagFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Composite tag filter applied to the search preview.")
  @JsonProperty("filter")
  public V3SourceTagFilter getFilter() {
    return filter;
  }
  public void setFilter(V3SourceTagFilter filter) {
    this.filter = filter;
  }


  /**
   * The touchpoint application to simulate for the preview.
   **/
  public KnowledgeSearchPreviewRequest application(V3KnowledgeSearchPreviewClientApplication application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The touchpoint application to simulate for the preview.")
  @JsonProperty("application")
  public V3KnowledgeSearchPreviewClientApplication getApplication() {
    return application;
  }
  public void setApplication(V3KnowledgeSearchPreviewClientApplication application) {
    this.application = application;
  }


  /**
   * The channel context to simulate for the preview.
   **/
  public KnowledgeSearchPreviewRequest conversationContext(KnowledgeV3PreviewConversationContext conversationContext) {
    this.conversationContext = conversationContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The channel context to simulate for the preview.")
  @JsonProperty("conversationContext")
  public KnowledgeV3PreviewConversationContext getConversationContext() {
    return conversationContext;
  }
  public void setConversationContext(KnowledgeV3PreviewConversationContext conversationContext) {
    this.conversationContext = conversationContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSearchPreviewRequest knowledgeSearchPreviewRequest = (KnowledgeSearchPreviewRequest) o;

    return Objects.equals(this.query, knowledgeSearchPreviewRequest.query) &&
            Objects.equals(this.sources, knowledgeSearchPreviewRequest.sources) &&
            Objects.equals(this.generationSetting, knowledgeSearchPreviewRequest.generationSetting) &&
            Objects.equals(this.stateful, knowledgeSearchPreviewRequest.stateful) &&
            Objects.equals(this.conversationTurns, knowledgeSearchPreviewRequest.conversationTurns) &&
            Objects.equals(this.filter, knowledgeSearchPreviewRequest.filter) &&
            Objects.equals(this.application, knowledgeSearchPreviewRequest.application) &&
            Objects.equals(this.conversationContext, knowledgeSearchPreviewRequest.conversationContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, sources, generationSetting, stateful, conversationTurns, filter, application, conversationContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSearchPreviewRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    generationSetting: ").append(toIndentedString(generationSetting)).append("\n");
    sb.append("    stateful: ").append(toIndentedString(stateful)).append("\n");
    sb.append("    conversationTurns: ").append(toIndentedString(conversationTurns)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
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

