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
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResult;
import com.mypurecloud.sdk.v2.model.KnowledgeV3ConversationContextResponse;
import com.mypurecloud.sdk.v2.model.V3KnowledgeSearchClientApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeSourcesSearchResponse
 */

public class KnowledgeSourcesSearchResponse  implements Serializable {
  
  private String query = null;
  private String searchId = null;
  private String sessionId = null;
  private KnowledgeSearchResult result = null;
  private String knowledgeSettingId = null;
  private KnowledgeV3ConversationContextResponse conversationContext = null;
  private V3KnowledgeSearchClientApplication application = null;

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
   * The type of the query that initiates the search.
   */
 @JsonDeserialize(using = QueryTypeEnumDeserializer.class)
  public enum QueryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AUTOSEARCH("AutoSearch"),
    MANUALSEARCH("ManualSearch");

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

  private static class GenerationLanguageEnumDeserializer extends StdDeserializer<GenerationLanguageEnum> {
    public GenerationLanguageEnumDeserializer() {
      super(GenerationLanguageEnumDeserializer.class);
    }

    @Override
    public GenerationLanguageEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GenerationLanguageEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The language used for answer generation.
   */
 @JsonDeserialize(using = GenerationLanguageEnumDeserializer.class)
  public enum GenerationLanguageEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AR_AE("ar-AE"),
    CS_CZ("cs-CZ"),
    DA_DK("da-DK"),
    DE_AT("de-AT"),
    DE_CH("de-CH"),
    DE_DE("de-DE"),
    EN_AU("en-AU"),
    EN_CA("en-CA"),
    EN_GB("en-GB"),
    EN_HK("en-HK"),
    EN_IE("en-IE"),
    EN_IN("en-IN"),
    EN_NZ("en-NZ"),
    EN_PH("en-PH"),
    EN_SG("en-SG"),
    EN_US("en-US"),
    EN_ZA("en-ZA"),
    ES_AR("es-AR"),
    ES_CO("es-CO"),
    ES_ES("es-ES"),
    ES_MX("es-MX"),
    ES_US("es-US"),
    FI_FI("fi-FI"),
    FR_BE("fr-BE"),
    FR_CA("fr-CA"),
    FR_CH("fr-CH"),
    FR_FR("fr-FR"),
    HI_IN("hi-IN"),
    HU_HU("hu-HU"),
    IT_IT("it-IT"),
    JA_JP("ja-JP"),
    KO_KR("ko-KR"),
    NB_NO("nb-NO"),
    NL_BE("nl-BE"),
    NL_NL("nl-NL"),
    PT_BR("pt-BR"),
    PT_PT("pt-PT"),
    SV_SE("sv-SE"),
    TR_TR("tr-TR");

    private String value;

    GenerationLanguageEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GenerationLanguageEnum fromString(String key) {
      if (key == null) return null;

      for (GenerationLanguageEnum value : GenerationLanguageEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GenerationLanguageEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GenerationLanguageEnum generationLanguage = null;
  private Boolean answerGeneration = null;

  public KnowledgeSourcesSearchResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Query to search content in the knowledge base.
   **/
  public KnowledgeSourcesSearchResponse query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query to search content in the knowledge base.")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  @ApiModelProperty(example = "null", value = "The globally unique identifier for the search.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }


  @ApiModelProperty(example = "null", value = "The sessionId for search request.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }


  @ApiModelProperty(example = "null", value = "Content matching the search query.")
  @JsonProperty("result")
  public KnowledgeSearchResult getResult() {
    return result;
  }


  @ApiModelProperty(example = "null", value = "Knowledge Setting Id used for the search request.")
  @JsonProperty("knowledgeSettingId")
  public String getKnowledgeSettingId() {
    return knowledgeSettingId;
  }


  @ApiModelProperty(example = "null", value = "Conversation context information if the search is initiated in the context of a conversation.")
  @JsonProperty("conversationContext")
  public KnowledgeV3ConversationContextResponse getConversationContext() {
    return conversationContext;
  }


  @ApiModelProperty(example = "null", value = "The client application details from which search happened.")
  @JsonProperty("application")
  public V3KnowledgeSearchClientApplication getApplication() {
    return application;
  }


  @ApiModelProperty(example = "null", value = "The type of the query that initiates the search.")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }


  @ApiModelProperty(example = "null", value = "The language used for answer generation.")
  @JsonProperty("generationLanguage")
  public GenerationLanguageEnum getGenerationLanguage() {
    return generationLanguage;
  }


  @ApiModelProperty(example = "null", value = "Indicates if answer generation was enabled for the setting.")
  @JsonProperty("answerGeneration")
  public Boolean getAnswerGeneration() {
    return answerGeneration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSourcesSearchResponse knowledgeSourcesSearchResponse = (KnowledgeSourcesSearchResponse) o;

    return Objects.equals(this.query, knowledgeSourcesSearchResponse.query) &&
            Objects.equals(this.searchId, knowledgeSourcesSearchResponse.searchId) &&
            Objects.equals(this.sessionId, knowledgeSourcesSearchResponse.sessionId) &&
            Objects.equals(this.result, knowledgeSourcesSearchResponse.result) &&
            Objects.equals(this.knowledgeSettingId, knowledgeSourcesSearchResponse.knowledgeSettingId) &&
            Objects.equals(this.conversationContext, knowledgeSourcesSearchResponse.conversationContext) &&
            Objects.equals(this.application, knowledgeSourcesSearchResponse.application) &&
            Objects.equals(this.queryType, knowledgeSourcesSearchResponse.queryType) &&
            Objects.equals(this.generationLanguage, knowledgeSourcesSearchResponse.generationLanguage) &&
            Objects.equals(this.answerGeneration, knowledgeSourcesSearchResponse.answerGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, searchId, sessionId, result, knowledgeSettingId, conversationContext, application, queryType, generationLanguage, answerGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSourcesSearchResponse {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    knowledgeSettingId: ").append(toIndentedString(knowledgeSettingId)).append("\n");
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    generationLanguage: ").append(toIndentedString(generationLanguage)).append("\n");
    sb.append("    answerGeneration: ").append(toIndentedString(answerGeneration)).append("\n");
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

