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
import com.mypurecloud.sdk.v2.model.KnowledgeGuestSearchClientApplication;
import com.mypurecloud.sdk.v2.model.PresentedKnowledgeDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeGuestDocumentPresentation
 */

public class KnowledgeGuestDocumentPresentation  implements Serializable {
  
  private List<PresentedKnowledgeDocument> documents = null;
  private String searchId = null;

  private static class QueryTypeEnumDeserializer extends StdDeserializer<QueryTypeEnum> {
    public QueryTypeEnumDeserializer() {
      super(QueryTypeEnumDeserializer.class);
    }

    @Override
    public QueryTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return QueryTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the query that surfaced the documents.
   */
 @JsonDeserialize(using = QueryTypeEnumDeserializer.class)
  public enum QueryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ARTICLE("Article"),
    AUTOSEARCH("AutoSearch"),
    CATEGORY("Category"),
    MANUALSEARCH("ManualSearch"),
    RECOMMENDATION("Recommendation"),
    SUGGESTION("Suggestion"),
    EXPANDEDARTICLE("ExpandedArticle");

    private String value;

    QueryTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static QueryTypeEnum fromString(String key) {
      if (key == null) return null;

      for (QueryTypeEnum value : QueryTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return QueryTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private QueryTypeEnum queryType = null;

  private static class SurfacingMethodEnumDeserializer extends StdDeserializer<SurfacingMethodEnum> {
    public SurfacingMethodEnumDeserializer() {
      super(SurfacingMethodEnumDeserializer.class);
    }

    @Override
    public SurfacingMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SurfacingMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown.Generative: A generated answer in a snippet was shown.
   */
 @JsonDeserialize(using = SurfacingMethodEnumDeserializer.class)
  public enum SurfacingMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ARTICLE("Article"),
    SNIPPET("Snippet"),
    HIGHLIGHT("Highlight"),
    GENERATIVE("Generative");

    private String value;

    SurfacingMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SurfacingMethodEnum fromString(String key) {
      if (key == null) return null;

      for (SurfacingMethodEnum value : SurfacingMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SurfacingMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SurfacingMethodEnum surfacingMethod = null;
  private String sessionId = null;
  private KnowledgeGuestSearchClientApplication application = null;

  public KnowledgeGuestDocumentPresentation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      documents = new ArrayList<PresentedKnowledgeDocument>();
    }
  }

  
  /**
   * The presented documents
   **/
  public KnowledgeGuestDocumentPresentation documents(List<PresentedKnowledgeDocument> documents) {
    this.documents = documents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The presented documents")
  @JsonProperty("documents")
  public List<PresentedKnowledgeDocument> getDocuments() {
    return documents;
  }
  public void setDocuments(List<PresentedKnowledgeDocument> documents) {
    this.documents = documents;
  }


  /**
   * The search that surfaced the documents that were presented.
   **/
  public KnowledgeGuestDocumentPresentation searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search that surfaced the documents that were presented.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }


  /**
   * The type of the query that surfaced the documents.
   **/
  public KnowledgeGuestDocumentPresentation queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the query that surfaced the documents.")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }
  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }


  /**
   * The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown.Generative: A generated answer in a snippet was shown.
   **/
  public KnowledgeGuestDocumentPresentation surfacingMethod(SurfacingMethodEnum surfacingMethod) {
    this.surfacingMethod = surfacingMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown.Generative: A generated answer in a snippet was shown.")
  @JsonProperty("surfacingMethod")
  public SurfacingMethodEnum getSurfacingMethod() {
    return surfacingMethod;
  }
  public void setSurfacingMethod(SurfacingMethodEnum surfacingMethod) {
    this.surfacingMethod = surfacingMethod;
  }


  @ApiModelProperty(example = "null", value = "Knowledge session ID.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }


  @ApiModelProperty(example = "null", value = "The client application in which the documents were presented.")
  @JsonProperty("application")
  public KnowledgeGuestSearchClientApplication getApplication() {
    return application;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGuestDocumentPresentation knowledgeGuestDocumentPresentation = (KnowledgeGuestDocumentPresentation) o;

    return Objects.equals(this.documents, knowledgeGuestDocumentPresentation.documents) &&
            Objects.equals(this.searchId, knowledgeGuestDocumentPresentation.searchId) &&
            Objects.equals(this.queryType, knowledgeGuestDocumentPresentation.queryType) &&
            Objects.equals(this.surfacingMethod, knowledgeGuestDocumentPresentation.surfacingMethod) &&
            Objects.equals(this.sessionId, knowledgeGuestDocumentPresentation.sessionId) &&
            Objects.equals(this.application, knowledgeGuestDocumentPresentation.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, searchId, queryType, surfacingMethod, sessionId, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestDocumentPresentation {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    surfacingMethod: ").append(toIndentedString(surfacingMethod)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

