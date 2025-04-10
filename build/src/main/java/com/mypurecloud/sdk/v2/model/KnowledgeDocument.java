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
import com.mypurecloud.sdk.v2.model.DocumentArticle;
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
 * KnowledgeDocument
 */

public class KnowledgeDocument  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class LanguageCodeEnumDeserializer extends StdDeserializer<LanguageCodeEnum> {
    public LanguageCodeEnumDeserializer() {
      super(LanguageCodeEnumDeserializer.class);
    }

    @Override
    public LanguageCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LanguageCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Language of the document
   */
 @JsonDeserialize(using = LanguageCodeEnumDeserializer.class)
  public enum LanguageCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN_US("en-US"),
    EN_UK("en-UK"),
    EN_AU("en-AU"),
    EN_CA("en-CA"),
    EN_HK("en-HK"),
    EN_IN("en-IN"),
    EN_IE("en-IE"),
    EN_NZ("en-NZ"),
    EN_PH("en-PH"),
    EN_SG("en-SG"),
    EN_ZA("en-ZA"),
    DE_DE("de-DE"),
    DE_AT("de-AT"),
    DE_CH("de-CH"),
    ES_AR("es-AR"),
    ES_CO("es-CO"),
    ES_MX("es-MX"),
    ES_US("es-US"),
    ES_ES("es-ES"),
    FR_FR("fr-FR"),
    FR_BE("fr-BE"),
    FR_CA("fr-CA"),
    FR_CH("fr-CH"),
    PT_BR("pt-BR"),
    PT_PT("pt-PT"),
    NL_NL("nl-NL"),
    NL_BE("nl-BE"),
    IT_IT("it-IT"),
    CA_ES("ca-ES"),
    TR_TR("tr-TR"),
    SV_SE("sv-SE"),
    FI_FI("fi-FI"),
    NB_NO("nb-NO"),
    DA_DK("da-DK"),
    JA_JP("ja-JP"),
    AR_AE("ar-AE"),
    ZH_CN("zh-CN"),
    ZH_TW("zh-TW"),
    ZH_HK("zh-HK"),
    KO_KR("ko-KR"),
    PL_PL("pl-PL"),
    HI_IN("hi-IN"),
    TH_TH("th-TH"),
    HU_HU("hu-HU"),
    VI_VN("vi-VN"),
    UK_UA("uk-UA");

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
   * Document type
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
  private DocumentFaq faq = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private List<KnowledgeCategory> categories = null;
  private KnowledgeBase knowledgeBase = null;
  private String externalUrl = null;
  private DocumentArticle article = null;
  private String selfUri = null;

  public KnowledgeDocument() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      categories = new ArrayList<KnowledgeCategory>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public KnowledgeDocument name(String name) {
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
  public KnowledgeDocument languageCode(LanguageCodeEnum languageCode) {
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
  public KnowledgeDocument type(TypeEnum type) {
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
  public KnowledgeDocument faq(DocumentFaq faq) {
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


  @ApiModelProperty(example = "null", value = "Document creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Document last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  /**
   * Document categories
   **/
  public KnowledgeDocument categories(List<KnowledgeCategory> categories) {
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


  @ApiModelProperty(example = "null", value = "Knowledge base which document does belong to")
  @JsonProperty("knowledgeBase")
  public KnowledgeBase getKnowledgeBase() {
    return knowledgeBase;
  }


  /**
   * External URL to the document
   **/
  public KnowledgeDocument externalUrl(String externalUrl) {
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


  /**
   * Article
   **/
  public KnowledgeDocument article(DocumentArticle article) {
    this.article = article;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Article")
  @JsonProperty("article")
  public DocumentArticle getArticle() {
    return article;
  }
  public void setArticle(DocumentArticle article) {
    this.article = article;
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
    KnowledgeDocument knowledgeDocument = (KnowledgeDocument) o;

    return Objects.equals(this.id, knowledgeDocument.id) &&
            Objects.equals(this.name, knowledgeDocument.name) &&
            Objects.equals(this.languageCode, knowledgeDocument.languageCode) &&
            Objects.equals(this.type, knowledgeDocument.type) &&
            Objects.equals(this.faq, knowledgeDocument.faq) &&
            Objects.equals(this.dateCreated, knowledgeDocument.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeDocument.dateModified) &&
            Objects.equals(this.categories, knowledgeDocument.categories) &&
            Objects.equals(this.knowledgeBase, knowledgeDocument.knowledgeBase) &&
            Objects.equals(this.externalUrl, knowledgeDocument.externalUrl) &&
            Objects.equals(this.article, knowledgeDocument.article) &&
            Objects.equals(this.selfUri, knowledgeDocument.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, languageCode, type, faq, dateCreated, dateModified, categories, knowledgeBase, externalUrl, article, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocument {\n");
    
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
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
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

