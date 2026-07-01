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
 * KnowledgeGenerationSetting
 */

public class KnowledgeGenerationSetting  implements Serializable {
  
  private Boolean answerGeneration = null;

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
   * Answer generation language.
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

  public KnowledgeGenerationSetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public KnowledgeGenerationSetting(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Indicates if answer generation is enabled for the setting.
   **/
  public KnowledgeGenerationSetting answerGeneration(Boolean answerGeneration) {
    this.answerGeneration = answerGeneration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if answer generation is enabled for the setting.")
  @JsonProperty("answerGeneration")
  public Boolean getAnswerGeneration() {
    return answerGeneration;
  }
  public void setAnswerGeneration(Boolean answerGeneration) {
    this.answerGeneration = answerGeneration;
  }


  /**
   * Answer generation language.
   **/
  public KnowledgeGenerationSetting generationLanguage(GenerationLanguageEnum generationLanguage) {
    this.generationLanguage = generationLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Answer generation language.")
  @JsonProperty("generationLanguage")
  public GenerationLanguageEnum getGenerationLanguage() {
    return generationLanguage;
  }
  public void setGenerationLanguage(GenerationLanguageEnum generationLanguage) {
    this.generationLanguage = generationLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGenerationSetting knowledgeGenerationSetting = (KnowledgeGenerationSetting) o;

    return Objects.equals(this.answerGeneration, knowledgeGenerationSetting.answerGeneration) &&
            Objects.equals(this.generationLanguage, knowledgeGenerationSetting.generationLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerGeneration, generationLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGenerationSetting {\n");
    
    sb.append("    answerGeneration: ").append(toIndentedString(answerGeneration)).append("\n");
    sb.append("    generationLanguage: ").append(toIndentedString(generationLanguage)).append("\n");
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

