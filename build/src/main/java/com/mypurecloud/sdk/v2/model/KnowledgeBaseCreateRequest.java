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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeBaseCreateRequest
 */

public class KnowledgeBaseCreateRequest  implements Serializable {
  
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
   * Core language for knowledge base in which initial content must be created, language codes [en-US, en-UK, en-AU, de-DE] are supported currently. However, the new DX knowledge will support all these language codes, along with 'early preview' language codes [ca-ES, tr-TR, sv-SE, fi-FI, nb-NO, da-DK, ja-JP, ar-AE, zh-CN, zh-TW, zh-HK, ko-KR, pl-PL] which might have a lower accuracy.
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
    PL_PL("pl-PL");

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

  
  /**
   * Knowledge base name
   **/
  public KnowledgeBaseCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Knowledge base name")
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
  public KnowledgeBaseCreateRequest description(String description) {
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
   * Core language for knowledge base in which initial content must be created, language codes [en-US, en-UK, en-AU, de-DE] are supported currently. However, the new DX knowledge will support all these language codes, along with 'early preview' language codes [ca-ES, tr-TR, sv-SE, fi-FI, nb-NO, da-DK, ja-JP, ar-AE, zh-CN, zh-TW, zh-HK, ko-KR, pl-PL] which might have a lower accuracy.
   **/
  public KnowledgeBaseCreateRequest coreLanguage(CoreLanguageEnum coreLanguage) {
    this.coreLanguage = coreLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "en-US", required = true, value = "Core language for knowledge base in which initial content must be created, language codes [en-US, en-UK, en-AU, de-DE] are supported currently. However, the new DX knowledge will support all these language codes, along with 'early preview' language codes [ca-ES, tr-TR, sv-SE, fi-FI, nb-NO, da-DK, ja-JP, ar-AE, zh-CN, zh-TW, zh-HK, ko-KR, pl-PL] which might have a lower accuracy.")
  @JsonProperty("coreLanguage")
  public CoreLanguageEnum getCoreLanguage() {
    return coreLanguage;
  }
  public void setCoreLanguage(CoreLanguageEnum coreLanguage) {
    this.coreLanguage = coreLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeBaseCreateRequest knowledgeBaseCreateRequest = (KnowledgeBaseCreateRequest) o;

    return Objects.equals(this.name, knowledgeBaseCreateRequest.name) &&
            Objects.equals(this.description, knowledgeBaseCreateRequest.description) &&
            Objects.equals(this.coreLanguage, knowledgeBaseCreateRequest.coreLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, coreLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeBaseCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    coreLanguage: ").append(toIndentedString(coreLanguage)).append("\n");
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

