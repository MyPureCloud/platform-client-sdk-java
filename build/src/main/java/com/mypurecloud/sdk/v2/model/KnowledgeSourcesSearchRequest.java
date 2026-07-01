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
import com.mypurecloud.sdk.v2.model.KnowledgeConversationTurn;
import com.mypurecloud.sdk.v2.model.KnowledgeV3ConversationContext;
import com.mypurecloud.sdk.v2.model.V3KnowledgeSearchClientApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSourcesSearchRequest
 */

public class KnowledgeSourcesSearchRequest  implements Serializable {
  
  private String query = null;
  private String knowledgeSettingId = null;
  private V3KnowledgeSearchClientApplication application = null;
  private KnowledgeV3ConversationContext conversationContext = null;
  private String sessionId = null;

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
   * The language to use for answer generation.
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
    TR_TR("tr-TR"),
    EL_GR("el-GR"),
    FIL_PH("fil-PH"),
    HE_IL("he-IL"),
    MS_MY("ms-MY"),
    PL_PL("pl-PL"),
    TH_TH("th-TH");

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
  private List<KnowledgeConversationTurn> conversationTurns = null;

  public KnowledgeSourcesSearchRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conversationTurns = new ArrayList<KnowledgeConversationTurn>();
    }
  }

  public KnowledgeSourcesSearchRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      conversationTurns = new ArrayList<KnowledgeConversationTurn>();
    }
  }

  
  /**
   * Input query to search content on the knowledge setting.
   **/
  public KnowledgeSourcesSearchRequest query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Input query to search content on the knowledge setting.")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  /**
   * Knowledge Setting Id to use for search request.
   **/
  public KnowledgeSourcesSearchRequest knowledgeSettingId(String knowledgeSettingId) {
    this.knowledgeSettingId = knowledgeSettingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Knowledge Setting Id to use for search request.")
  @JsonProperty("knowledgeSettingId")
  public String getKnowledgeSettingId() {
    return knowledgeSettingId;
  }
  public void setKnowledgeSettingId(String knowledgeSettingId) {
    this.knowledgeSettingId = knowledgeSettingId;
  }


  /**
   * The client application details from which search requested.
   **/
  public KnowledgeSourcesSearchRequest application(V3KnowledgeSearchClientApplication application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The client application details from which search requested.")
  @JsonProperty("application")
  public V3KnowledgeSearchClientApplication getApplication() {
    return application;
  }
  public void setApplication(V3KnowledgeSearchClientApplication application) {
    this.application = application;
  }


  /**
   * Conversation context information if the search is initiated in the context of a conversation.
   **/
  public KnowledgeSourcesSearchRequest conversationContext(KnowledgeV3ConversationContext conversationContext) {
    this.conversationContext = conversationContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation context information if the search is initiated in the context of a conversation.")
  @JsonProperty("conversationContext")
  public KnowledgeV3ConversationContext getConversationContext() {
    return conversationContext;
  }
  public void setConversationContext(KnowledgeV3ConversationContext conversationContext) {
    this.conversationContext = conversationContext;
  }


  /**
   * The session id for search request.
   **/
  public KnowledgeSourcesSearchRequest sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The session id for search request.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * The type of the query that initiates the search.
   **/
  public KnowledgeSourcesSearchRequest queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the query that initiates the search.")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }
  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }


  /**
   * The language to use for answer generation.
   **/
  public KnowledgeSourcesSearchRequest generationLanguage(GenerationLanguageEnum generationLanguage) {
    this.generationLanguage = generationLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language to use for answer generation.")
  @JsonProperty("generationLanguage")
  public GenerationLanguageEnum getGenerationLanguage() {
    return generationLanguage;
  }
  public void setGenerationLanguage(GenerationLanguageEnum generationLanguage) {
    this.generationLanguage = generationLanguage;
  }


  /**
   * List of conversation turns to use for stateful search.
   **/
  public KnowledgeSourcesSearchRequest conversationTurns(List<KnowledgeConversationTurn> conversationTurns) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSourcesSearchRequest knowledgeSourcesSearchRequest = (KnowledgeSourcesSearchRequest) o;

    return Objects.equals(this.query, knowledgeSourcesSearchRequest.query) &&
            Objects.equals(this.knowledgeSettingId, knowledgeSourcesSearchRequest.knowledgeSettingId) &&
            Objects.equals(this.application, knowledgeSourcesSearchRequest.application) &&
            Objects.equals(this.conversationContext, knowledgeSourcesSearchRequest.conversationContext) &&
            Objects.equals(this.sessionId, knowledgeSourcesSearchRequest.sessionId) &&
            Objects.equals(this.queryType, knowledgeSourcesSearchRequest.queryType) &&
            Objects.equals(this.generationLanguage, knowledgeSourcesSearchRequest.generationLanguage) &&
            Objects.equals(this.conversationTurns, knowledgeSourcesSearchRequest.conversationTurns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, knowledgeSettingId, application, conversationContext, sessionId, queryType, generationLanguage, conversationTurns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSourcesSearchRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    knowledgeSettingId: ").append(toIndentedString(knowledgeSettingId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    generationLanguage: ").append(toIndentedString(generationLanguage)).append("\n");
    sb.append("    conversationTurns: ").append(toIndentedString(conversationTurns)).append("\n");
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

