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

import java.io.Serializable;
/**
 * KnowledgeBaseWithDialectReference
 */

public class KnowledgeBaseWithDialectReference  implements Serializable {
  
  private String id = null;

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
   * The dialect for the knowledge base.
   */
 @JsonDeserialize(using = LanguageCodeEnumDeserializer.class)
  public enum LanguageCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN_ZA("en-ZA"),
    EN_AU("en-AU"),
    EN_GB("en-GB"),
    EN_IE("en-IE"),
    EN_IN("en-IN"),
    EN_US("en-US"),
    ES_US("es-US"),
    ES_ES("es-ES"),
    NL_NL("nl-NL"),
    FR_CA("fr-CA"),
    FR_FR("fr-FR"),
    DE_DE("de-DE"),
    IT_IT("it-IT"),
    PT_PT("pt-PT"),
    PT_BR("pt-BR"),
    AR_AE("ar-AE"),
    JA_JP("ja-JP"),
    SV_SE("sv-SE"),
    DE_AT("de-AT"),
    DE_CH("de-CH"),
    DA_DK("da-DK"),
    FR_BE("fr-BE"),
    FR_CH("fr-CH"),
    ES_MX("es-MX"),
    ES_CO("es-CO"),
    KO_KR("ko-KR"),
    HI_IN("hi-IN"),
    TR_TR("tr-TR"),
    ES_AR("es-AR"),
    FI_FI("fi-FI"),
    NB_NO("nb-NO");

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
  private String selfUri = null;

  public KnowledgeBaseWithDialectReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the knowledge base.
   **/
  public KnowledgeBaseWithDialectReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the knowledge base.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The dialect for the knowledge base.
   **/
  public KnowledgeBaseWithDialectReference languageCode(LanguageCodeEnum languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The dialect for the knowledge base.")
  @JsonProperty("languageCode")
  public LanguageCodeEnum getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(LanguageCodeEnum languageCode) {
    this.languageCode = languageCode;
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
    KnowledgeBaseWithDialectReference knowledgeBaseWithDialectReference = (KnowledgeBaseWithDialectReference) o;

    return Objects.equals(this.id, knowledgeBaseWithDialectReference.id) &&
            Objects.equals(this.languageCode, knowledgeBaseWithDialectReference.languageCode) &&
            Objects.equals(this.selfUri, knowledgeBaseWithDialectReference.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, languageCode, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeBaseWithDialectReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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

