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
import com.mypurecloud.sdk.v2.model.DocumentArticle;
import com.mypurecloud.sdk.v2.model.DocumentCategoryInput;
import com.mypurecloud.sdk.v2.model.DocumentFaq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentRequest
 */

public class KnowledgeDocumentRequest  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Document type according to assigned template
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FAQ("Faq"),
    ARTICLE("Article");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String externalUrl = null;
  private DocumentFaq faq = null;
  private List<DocumentCategoryInput> categories = new ArrayList<DocumentCategoryInput>();
  private DocumentArticle article = null;

  
  /**
   * Document type according to assigned template
   **/
  public KnowledgeDocumentRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Document type according to assigned template")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * External Url to the document
   **/
  public KnowledgeDocumentRequest externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External Url to the document")
  @JsonProperty("externalUrl")
  public String getExternalUrl() {
    return externalUrl;
  }
  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  
  /**
   * Faq document details
   **/
  public KnowledgeDocumentRequest faq(DocumentFaq faq) {
    this.faq = faq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Faq document details")
  @JsonProperty("faq")
  public DocumentFaq getFaq() {
    return faq;
  }
  public void setFaq(DocumentFaq faq) {
    this.faq = faq;
  }

  
  /**
   * Document categories
   **/
  public KnowledgeDocumentRequest categories(List<DocumentCategoryInput> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document categories")
  @JsonProperty("categories")
  public List<DocumentCategoryInput> getCategories() {
    return categories;
  }
  public void setCategories(List<DocumentCategoryInput> categories) {
    this.categories = categories;
  }

  
  /**
   * Article details
   **/
  public KnowledgeDocumentRequest article(DocumentArticle article) {
    this.article = article;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Article details")
  @JsonProperty("article")
  public DocumentArticle getArticle() {
    return article;
  }
  public void setArticle(DocumentArticle article) {
    this.article = article;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentRequest knowledgeDocumentRequest = (KnowledgeDocumentRequest) o;
    return Objects.equals(this.type, knowledgeDocumentRequest.type) &&
        Objects.equals(this.externalUrl, knowledgeDocumentRequest.externalUrl) &&
        Objects.equals(this.faq, knowledgeDocumentRequest.faq) &&
        Objects.equals(this.categories, knowledgeDocumentRequest.categories) &&
        Objects.equals(this.article, knowledgeDocumentRequest.article);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, externalUrl, faq, categories, article);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    faq: ").append(toIndentedString(faq)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
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

