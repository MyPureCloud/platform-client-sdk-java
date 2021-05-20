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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeSearchRequest
 */

public class KnowledgeSearchRequest  implements Serializable {
  
  private String query = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;

  private static class DocumentTypeEnumDeserializer extends StdDeserializer<DocumentTypeEnum> {
    public DocumentTypeEnumDeserializer() {
      super(DocumentTypeEnumDeserializer.class);
    }

    @Override
    public DocumentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DocumentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Document type to be used while searching
   */
 @JsonDeserialize(using = DocumentTypeEnumDeserializer.class)
  public enum DocumentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FAQ("Faq"),
    ARTICLE("Article");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DocumentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DocumentTypeEnum value : DocumentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DocumentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DocumentTypeEnum documentType = null;
  private String languageCode = null;
  private Boolean searchOnDraftDocuments = null;

  
  /**
   * Input query to search content in the knowledge base
   **/
  public KnowledgeSearchRequest query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Input query to search content in the knowledge base")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  
  /**
   * Page size of the returned results
   **/
  public KnowledgeSearchRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page size of the returned results")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   * Page number of the returned results
   **/
  public KnowledgeSearchRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page number of the returned results")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Document type to be used while searching
   **/
  public KnowledgeSearchRequest documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document type to be used while searching")
  @JsonProperty("documentType")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }
  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  
  /**
   * query search for specific languageCode
   **/
  public KnowledgeSearchRequest languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "query search for specific languageCode")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  
  /**
   * If true the search query will be executed on draft documents, else it will be on active documents
   **/
  public KnowledgeSearchRequest searchOnDraftDocuments(Boolean searchOnDraftDocuments) {
    this.searchOnDraftDocuments = searchOnDraftDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true the search query will be executed on draft documents, else it will be on active documents")
  @JsonProperty("searchOnDraftDocuments")
  public Boolean getSearchOnDraftDocuments() {
    return searchOnDraftDocuments;
  }
  public void setSearchOnDraftDocuments(Boolean searchOnDraftDocuments) {
    this.searchOnDraftDocuments = searchOnDraftDocuments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSearchRequest knowledgeSearchRequest = (KnowledgeSearchRequest) o;
    return Objects.equals(this.query, knowledgeSearchRequest.query) &&
        Objects.equals(this.pageSize, knowledgeSearchRequest.pageSize) &&
        Objects.equals(this.pageNumber, knowledgeSearchRequest.pageNumber) &&
        Objects.equals(this.documentType, knowledgeSearchRequest.documentType) &&
        Objects.equals(this.languageCode, knowledgeSearchRequest.languageCode) &&
        Objects.equals(this.searchOnDraftDocuments, knowledgeSearchRequest.searchOnDraftDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, pageNumber, documentType, languageCode, searchOnDraftDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSearchRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    searchOnDraftDocuments: ").append(toIndentedString(searchOnDraftDocuments)).append("\n");
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

