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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentsAnswerFilter
 */

public class KnowledgeDocumentsAnswerFilter  implements Serializable {
  
  private String query = null;

  private static class LanguageEnumDeserializer extends StdDeserializer<LanguageEnum> {
    public LanguageEnumDeserializer() {
      super(LanguageEnumDeserializer.class);
    }

    @Override
    public LanguageEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LanguageEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The language of the documents.
   */
 @JsonDeserialize(using = LanguageEnumDeserializer.class)
  public enum LanguageEnum {
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

    LanguageEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LanguageEnum fromString(String key) {
      if (key == null) return null;

      for (LanguageEnum value : LanguageEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LanguageEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LanguageEnum language = null;

  private static class AppTypeEnumDeserializer extends StdDeserializer<AppTypeEnum> {
    public AppTypeEnumDeserializer() {
      super(AppTypeEnumDeserializer.class);
    }

    @Override
    public AppTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AppTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The appType
   */
 @JsonDeserialize(using = AppTypeEnumDeserializer.class)
  public enum AppTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASSISTANT("Assistant"),
    BOTFLOW("BotFlow"),
    MESSENGERKNOWLEDGEAPP("MessengerKnowledgeApp"),
    SMARTADVISOR("SmartAdvisor"),
    SUPPORTCENTER("SupportCenter");

    private String value;

    AppTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AppTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AppTypeEnum value : AppTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AppTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AppTypeEnum appType = null;

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
   * The query type
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
    SUGGESTION("Suggestion");

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
  private String searchId = null;
  private Boolean insertHighlightIntoVariationContent = null;

  private static class AnswerModeEnumDeserializer extends StdDeserializer<AnswerModeEnum> {
    public AnswerModeEnumDeserializer() {
      super(AnswerModeEnumDeserializer.class);
    }

    @Override
    public AnswerModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AnswerModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets answerMode
   */
 @JsonDeserialize(using = AnswerModeEnumDeserializer.class)
  public enum AnswerModeEnum {
    ANSWERHIGHLIGHT("AnswerHighlight"),
    ANSWERGENERATION("AnswerGeneration");

    private String value;

    AnswerModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AnswerModeEnum fromString(String key) {
      if (key == null) return null;

      for (AnswerModeEnum value : AnswerModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AnswerModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<AnswerModeEnum> answerMode = null;
  private List<String> variationIds = null;

  public KnowledgeDocumentsAnswerFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      answerMode = new ArrayList<AnswerModeEnum>();
      variationIds = new ArrayList<String>();
    }
  }

  
  /**
   * The search query.
   **/
  public KnowledgeDocumentsAnswerFilter query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search query.")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  /**
   * The language of the documents.
   **/
  public KnowledgeDocumentsAnswerFilter language(LanguageEnum language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language of the documents.")
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  /**
   * The appType
   **/
  public KnowledgeDocumentsAnswerFilter appType(AppTypeEnum appType) {
    this.appType = appType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The appType")
  @JsonProperty("appType")
  public AppTypeEnum getAppType() {
    return appType;
  }
  public void setAppType(AppTypeEnum appType) {
    this.appType = appType;
  }


  /**
   * The query type
   **/
  public KnowledgeDocumentsAnswerFilter queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The query type")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }
  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }


  /**
   * The search id.
   **/
  public KnowledgeDocumentsAnswerFilter searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search id.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }


  /**
   * If specified - insert highlight data into the variation content.
   **/
  public KnowledgeDocumentsAnswerFilter insertHighlightIntoVariationContent(Boolean insertHighlightIntoVariationContent) {
    this.insertHighlightIntoVariationContent = insertHighlightIntoVariationContent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If specified - insert highlight data into the variation content.")
  @JsonProperty("insertHighlightIntoVariationContent")
  public Boolean getInsertHighlightIntoVariationContent() {
    return insertHighlightIntoVariationContent;
  }
  public void setInsertHighlightIntoVariationContent(Boolean insertHighlightIntoVariationContent) {
    this.insertHighlightIntoVariationContent = insertHighlightIntoVariationContent;
  }


  /**
   * Allows extracted answers from an article (AnswerHighlight) and/or AI-generated answers (AnswerGeneration). Default mode: AnswerHighlight
   **/
  public KnowledgeDocumentsAnswerFilter answerMode(List<AnswerModeEnum> answerMode) {
    this.answerMode = answerMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allows extracted answers from an article (AnswerHighlight) and/or AI-generated answers (AnswerGeneration). Default mode: AnswerHighlight")
  @JsonProperty("answerMode")
  public List<AnswerModeEnum> getAnswerMode() {
    return answerMode;
  }
  public void setAnswerMode(List<AnswerModeEnum> answerMode) {
    this.answerMode = answerMode;
  }


  /**
   * The variation Ids to answer.
   **/
  public KnowledgeDocumentsAnswerFilter variationIds(List<String> variationIds) {
    this.variationIds = variationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variation Ids to answer.")
  @JsonProperty("variationIds")
  public List<String> getVariationIds() {
    return variationIds;
  }
  public void setVariationIds(List<String> variationIds) {
    this.variationIds = variationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentsAnswerFilter knowledgeDocumentsAnswerFilter = (KnowledgeDocumentsAnswerFilter) o;

    return Objects.equals(this.query, knowledgeDocumentsAnswerFilter.query) &&
            Objects.equals(this.language, knowledgeDocumentsAnswerFilter.language) &&
            Objects.equals(this.appType, knowledgeDocumentsAnswerFilter.appType) &&
            Objects.equals(this.queryType, knowledgeDocumentsAnswerFilter.queryType) &&
            Objects.equals(this.searchId, knowledgeDocumentsAnswerFilter.searchId) &&
            Objects.equals(this.insertHighlightIntoVariationContent, knowledgeDocumentsAnswerFilter.insertHighlightIntoVariationContent) &&
            Objects.equals(this.answerMode, knowledgeDocumentsAnswerFilter.answerMode) &&
            Objects.equals(this.variationIds, knowledgeDocumentsAnswerFilter.variationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, language, appType, queryType, searchId, insertHighlightIntoVariationContent, answerMode, variationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentsAnswerFilter {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    insertHighlightIntoVariationContent: ").append(toIndentedString(insertHighlightIntoVariationContent)).append("\n");
    sb.append("    answerMode: ").append(toIndentedString(answerMode)).append("\n");
    sb.append("    variationIds: ").append(toIndentedString(variationIds)).append("\n");
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

