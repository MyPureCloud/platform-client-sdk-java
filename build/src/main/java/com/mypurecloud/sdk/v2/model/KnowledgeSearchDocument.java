package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DocumentFaq;
import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import com.mypurecloud.sdk.v2.model.KnowledgeCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSearchDocument
 */

public class KnowledgeSearchDocument  implements Serializable {
  
  private String id = null;
  private String name = null;

  /**
   * Language of the document
   */
  public enum LanguageCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN_US("en-US"),
    DE_DE("de-DE");

    private String value;

    LanguageCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LanguageCodeEnum fromString(String key) {
      if (key == null) return null;

      for (LanguageCodeEnum value : LanguageCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LanguageCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LanguageCodeEnum languageCode = null;

  /**
   * Document type
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FAQ("Faq");

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
  private DocumentFaq faq = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private List<KnowledgeCategory> categories = new ArrayList<KnowledgeCategory>();
  private KnowledgeBase knowledgeBase = null;
  private String externalUrl = null;
  private Double confidence = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public KnowledgeSearchDocument name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Language of the document
   **/
  public KnowledgeSearchDocument languageCode(LanguageCodeEnum languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Language of the document")
  @JsonProperty("languageCode")
  public LanguageCodeEnum getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(LanguageCodeEnum languageCode) {
    this.languageCode = languageCode;
  }

  
  /**
   * Document type
   **/
  public KnowledgeSearchDocument type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Document type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * FAQ document details
   **/
  public KnowledgeSearchDocument faq(DocumentFaq faq) {
    this.faq = faq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "FAQ document details")
  @JsonProperty("faq")
  public DocumentFaq getFaq() {
    return faq;
  }
  public void setFaq(DocumentFaq faq) {
    this.faq = faq;
  }

  
  @ApiModelProperty(example = "null", value = "Document creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Document last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * Document categories
   **/
  public KnowledgeSearchDocument categories(List<KnowledgeCategory> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document categories")
  @JsonProperty("categories")
  public List<KnowledgeCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<KnowledgeCategory> categories) {
    this.categories = categories;
  }

  
  /**
   * Knowledge base which document does belong to
   **/
  public KnowledgeSearchDocument knowledgeBase(KnowledgeBase knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base which document does belong to")
  @JsonProperty("knowledgeBase")
  public KnowledgeBase getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(KnowledgeBase knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }

  
  /**
   * External URL to the document
   **/
  public KnowledgeSearchDocument externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External URL to the document")
  @JsonProperty("externalUrl")
  public String getExternalUrl() {
    return externalUrl;
  }
  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  
  @ApiModelProperty(example = "null", value = "The confidence associated with a document with respect to a search query")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSearchDocument knowledgeSearchDocument = (KnowledgeSearchDocument) o;
    return Objects.equals(this.id, knowledgeSearchDocument.id) &&
        Objects.equals(this.name, knowledgeSearchDocument.name) &&
        Objects.equals(this.languageCode, knowledgeSearchDocument.languageCode) &&
        Objects.equals(this.type, knowledgeSearchDocument.type) &&
        Objects.equals(this.faq, knowledgeSearchDocument.faq) &&
        Objects.equals(this.dateCreated, knowledgeSearchDocument.dateCreated) &&
        Objects.equals(this.dateModified, knowledgeSearchDocument.dateModified) &&
        Objects.equals(this.categories, knowledgeSearchDocument.categories) &&
        Objects.equals(this.knowledgeBase, knowledgeSearchDocument.knowledgeBase) &&
        Objects.equals(this.externalUrl, knowledgeSearchDocument.externalUrl) &&
        Objects.equals(this.confidence, knowledgeSearchDocument.confidence) &&
        Objects.equals(this.selfUri, knowledgeSearchDocument.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, languageCode, type, faq, dateCreated, dateModified, categories, knowledgeBase, externalUrl, confidence, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSearchDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    faq: ").append(toIndentedString(faq)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

