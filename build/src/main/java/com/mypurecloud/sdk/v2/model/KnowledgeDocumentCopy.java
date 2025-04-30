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
import com.mypurecloud.sdk.v2.model.KnowledgeConversationContext;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchClientApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeDocumentCopy
 */

public class KnowledgeDocumentCopy  implements Serializable {
  
  private String documentVariationId = null;
  private String documentVersionId = null;
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
   * The type of the query that surfaced the document.
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
  private KnowledgeConversationContext conversationContext = null;
  private KnowledgeSearchClientApplication application = null;

  public KnowledgeDocumentCopy() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The variation of the document whose content was copied.
   **/
  public KnowledgeDocumentCopy documentVariationId(String documentVariationId) {
    this.documentVariationId = documentVariationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variation of the document whose content was copied.")
  @JsonProperty("documentVariationId")
  public String getDocumentVariationId() {
    return documentVariationId;
  }
  public void setDocumentVariationId(String documentVariationId) {
    this.documentVariationId = documentVariationId;
  }


  /**
   * The version of the document whose content was copied.
   **/
  public KnowledgeDocumentCopy documentVersionId(String documentVersionId) {
    this.documentVersionId = documentVersionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version of the document whose content was copied.")
  @JsonProperty("documentVersionId")
  public String getDocumentVersionId() {
    return documentVersionId;
  }
  public void setDocumentVersionId(String documentVersionId) {
    this.documentVersionId = documentVersionId;
  }


  /**
   * The search that surfaced the document whose content was copied.
   **/
  public KnowledgeDocumentCopy searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search that surfaced the document whose content was copied.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }


  /**
   * The type of the query that surfaced the document.
   **/
  public KnowledgeDocumentCopy queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the query that surfaced the document.")
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
  public KnowledgeDocumentCopy surfacingMethod(SurfacingMethodEnum surfacingMethod) {
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


  /**
   * Conversation context information, if the document content is copied in the context of a conversation.
   **/
  public KnowledgeDocumentCopy conversationContext(KnowledgeConversationContext conversationContext) {
    this.conversationContext = conversationContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation context information, if the document content is copied in the context of a conversation.")
  @JsonProperty("conversationContext")
  public KnowledgeConversationContext getConversationContext() {
    return conversationContext;
  }
  public void setConversationContext(KnowledgeConversationContext conversationContext) {
    this.conversationContext = conversationContext;
  }


  /**
   * The client application in which the document content was copied.
   **/
  public KnowledgeDocumentCopy application(KnowledgeSearchClientApplication application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The client application in which the document content was copied.")
  @JsonProperty("application")
  public KnowledgeSearchClientApplication getApplication() {
    return application;
  }
  public void setApplication(KnowledgeSearchClientApplication application) {
    this.application = application;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentCopy knowledgeDocumentCopy = (KnowledgeDocumentCopy) o;

    return Objects.equals(this.documentVariationId, knowledgeDocumentCopy.documentVariationId) &&
            Objects.equals(this.documentVersionId, knowledgeDocumentCopy.documentVersionId) &&
            Objects.equals(this.searchId, knowledgeDocumentCopy.searchId) &&
            Objects.equals(this.queryType, knowledgeDocumentCopy.queryType) &&
            Objects.equals(this.surfacingMethod, knowledgeDocumentCopy.surfacingMethod) &&
            Objects.equals(this.sessionId, knowledgeDocumentCopy.sessionId) &&
            Objects.equals(this.conversationContext, knowledgeDocumentCopy.conversationContext) &&
            Objects.equals(this.application, knowledgeDocumentCopy.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentVariationId, documentVersionId, searchId, queryType, surfacingMethod, sessionId, conversationContext, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentCopy {\n");
    
    sb.append("    documentVariationId: ").append(toIndentedString(documentVariationId)).append("\n");
    sb.append("    documentVersionId: ").append(toIndentedString(documentVersionId)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    surfacingMethod: ").append(toIndentedString(surfacingMethod)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
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

