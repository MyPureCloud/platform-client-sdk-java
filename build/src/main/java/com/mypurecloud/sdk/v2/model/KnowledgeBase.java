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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KnowledgeBase
 */

public class KnowledgeBase  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;

  private static class CoreLanguageEnumDeserializer extends StdDeserializer<CoreLanguageEnum> {
    public CoreLanguageEnumDeserializer() {
      super(CoreLanguageEnumDeserializer.class);
    }

    @Override
    public CoreLanguageEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CoreLanguageEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Core language for knowledge base in which initial content must be created, language codes [en-US, en-UK, en-AU, de-DE] are supported currently. However, the new DX knowledge will support all these language codes, along with 'early preview' language codes [ca-ES, tr-TR, sv-SE, fi-FI, nb-NO, da-DK, ja-JP, ar-AE, zh-CN, zh-TW, zh-HK, ko-KR, pl-PL, hi-IN, th-TH, hu-HU, vi-VN, uk-UA] which might have a lower accuracy.
   */
 @JsonDeserialize(using = CoreLanguageEnumDeserializer.class)
  public enum CoreLanguageEnum {
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

    CoreLanguageEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CoreLanguageEnum fromString(String key) {
      if (key == null) return null;

      for (CoreLanguageEnum value : CoreLanguageEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CoreLanguageEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CoreLanguageEnum coreLanguage = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer faqCount = null;
  private Date dateDocumentLastModified = null;
  private Integer articleCount = null;
  private Boolean published = null;
  private String selfUri = null;

  public KnowledgeBase() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public KnowledgeBase name(String name) {
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
   * Knowledge base description
   **/
  public KnowledgeBase description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Core language for knowledge base in which initial content must be created, language codes [en-US, en-UK, en-AU, de-DE] are supported currently. However, the new DX knowledge will support all these language codes, along with 'early preview' language codes [ca-ES, tr-TR, sv-SE, fi-FI, nb-NO, da-DK, ja-JP, ar-AE, zh-CN, zh-TW, zh-HK, ko-KR, pl-PL, hi-IN, th-TH, hu-HU, vi-VN, uk-UA] which might have a lower accuracy.
   **/
  public KnowledgeBase coreLanguage(CoreLanguageEnum coreLanguage) {
    this.coreLanguage = coreLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "en-US", required = true, value = "Core language for knowledge base in which initial content must be created, language codes [en-US, en-UK, en-AU, de-DE] are supported currently. However, the new DX knowledge will support all these language codes, along with 'early preview' language codes [ca-ES, tr-TR, sv-SE, fi-FI, nb-NO, da-DK, ja-JP, ar-AE, zh-CN, zh-TW, zh-HK, ko-KR, pl-PL, hi-IN, th-TH, hu-HU, vi-VN, uk-UA] which might have a lower accuracy.")
  @JsonProperty("coreLanguage")
  public CoreLanguageEnum getCoreLanguage() {
    return coreLanguage;
  }
  public void setCoreLanguage(CoreLanguageEnum coreLanguage) {
    this.coreLanguage = coreLanguage;
  }


  @ApiModelProperty(example = "null", value = "Knowledge base creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Knowledge base last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The count representing the number of documents of type FAQ in the KnowledgeBase")
  @JsonProperty("faqCount")
  public Integer getFaqCount() {
    return faqCount;
  }


  @ApiModelProperty(example = "null", value = "The date representing when the last document is modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDocumentLastModified")
  public Date getDateDocumentLastModified() {
    return dateDocumentLastModified;
  }


  @ApiModelProperty(example = "null", value = "The count representing the number of documents of type Article in the KnowledgeBase")
  @JsonProperty("articleCount")
  public Integer getArticleCount() {
    return articleCount;
  }


  @ApiModelProperty(example = "null", value = "Flag that indicates the knowledge base is published")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
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
    KnowledgeBase knowledgeBase = (KnowledgeBase) o;

    return Objects.equals(this.id, knowledgeBase.id) &&
            Objects.equals(this.name, knowledgeBase.name) &&
            Objects.equals(this.description, knowledgeBase.description) &&
            Objects.equals(this.coreLanguage, knowledgeBase.coreLanguage) &&
            Objects.equals(this.dateCreated, knowledgeBase.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeBase.dateModified) &&
            Objects.equals(this.faqCount, knowledgeBase.faqCount) &&
            Objects.equals(this.dateDocumentLastModified, knowledgeBase.dateDocumentLastModified) &&
            Objects.equals(this.articleCount, knowledgeBase.articleCount) &&
            Objects.equals(this.published, knowledgeBase.published) &&
            Objects.equals(this.selfUri, knowledgeBase.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, coreLanguage, dateCreated, dateModified, faqCount, dateDocumentLastModified, articleCount, published, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeBase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    coreLanguage: ").append(toIndentedString(coreLanguage)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    faqCount: ").append(toIndentedString(faqCount)).append("\n");
    sb.append("    dateDocumentLastModified: ").append(toIndentedString(dateDocumentLastModified)).append("\n");
    sb.append("    articleCount: ").append(toIndentedString(articleCount)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
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

