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
import com.mypurecloud.sdk.v2.model.TtsEngineEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TtsVoiceEntity
 */

public class TtsVoiceEntity  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String displayName = null;
  private String gender = null;

  private static class VoiceTypeEnumDeserializer extends StdDeserializer<VoiceTypeEnum> {
    public VoiceTypeEnumDeserializer() {
      super(VoiceTypeEnumDeserializer.class);
    }

    @Override
    public VoiceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VoiceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the TTS voice
   */
 @JsonDeserialize(using = VoiceTypeEnumDeserializer.class)
  public enum VoiceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STANDARD("Standard"),
    NEURAL("Neural"),
    WAVENET("Wavenet"),
    GENERATIVE("Generative"),
    CHIRP3("Chirp3"),
    GEMINI("Gemini");

    private String value;

    VoiceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VoiceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (VoiceTypeEnum value : VoiceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VoiceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VoiceTypeEnum voiceType = null;
  private String language = null;
  private TtsEngineEntity engine = null;
  private Boolean isDefault = null;
  private List<String> supportedModels = null;
  private String provider = null;
  private String selfUri = null;

  public TtsVoiceEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      supportedModels = new ArrayList<String>();
    }
  }

  public TtsVoiceEntity(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      supportedModels = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public TtsVoiceEntity name(String name) {
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
   * The display name of the TTS voice
   **/
  public TtsVoiceEntity displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display name of the TTS voice")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * The gender of the TTS voice
   **/
  public TtsVoiceEntity gender(String gender) {
    this.gender = gender;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The gender of the TTS voice")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }


  /**
   * The type of the TTS voice
   **/
  public TtsVoiceEntity voiceType(VoiceTypeEnum voiceType) {
    this.voiceType = voiceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the TTS voice")
  @JsonProperty("voiceType")
  public VoiceTypeEnum getVoiceType() {
    return voiceType;
  }
  public void setVoiceType(VoiceTypeEnum voiceType) {
    this.voiceType = voiceType;
  }


  /**
   * The language supported by the TTS voice
   **/
  public TtsVoiceEntity language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The language supported by the TTS voice")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Ths TTS engine this voice belongs to
   **/
  public TtsVoiceEntity engine(TtsEngineEntity engine) {
    this.engine = engine;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Ths TTS engine this voice belongs to")
  @JsonProperty("engine")
  public TtsEngineEntity getEngine() {
    return engine;
  }
  public void setEngine(TtsEngineEntity engine) {
    this.engine = engine;
  }


  /**
   * The voice is the default voice for its language
   **/
  public TtsVoiceEntity isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The voice is the default voice for its language")
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  /**
   * The models supported by the TTS voice
   **/
  public TtsVoiceEntity supportedModels(List<String> supportedModels) {
    this.supportedModels = supportedModels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The models supported by the TTS voice")
  @JsonProperty("supportedModels")
  public List<String> getSupportedModels() {
    return supportedModels;
  }
  public void setSupportedModels(List<String> supportedModels) {
    this.supportedModels = supportedModels;
  }


  /**
   * The provider of the TTS voice
   **/
  public TtsVoiceEntity provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The provider of the TTS voice")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
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
    TtsVoiceEntity ttsVoiceEntity = (TtsVoiceEntity) o;

    return Objects.equals(this.id, ttsVoiceEntity.id) &&
            Objects.equals(this.name, ttsVoiceEntity.name) &&
            Objects.equals(this.displayName, ttsVoiceEntity.displayName) &&
            Objects.equals(this.gender, ttsVoiceEntity.gender) &&
            Objects.equals(this.voiceType, ttsVoiceEntity.voiceType) &&
            Objects.equals(this.language, ttsVoiceEntity.language) &&
            Objects.equals(this.engine, ttsVoiceEntity.engine) &&
            Objects.equals(this.isDefault, ttsVoiceEntity.isDefault) &&
            Objects.equals(this.supportedModels, ttsVoiceEntity.supportedModels) &&
            Objects.equals(this.provider, ttsVoiceEntity.provider) &&
            Objects.equals(this.selfUri, ttsVoiceEntity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, gender, voiceType, language, engine, isDefault, supportedModels, provider, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TtsVoiceEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    voiceType: ").append(toIndentedString(voiceType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    supportedModels: ").append(toIndentedString(supportedModels)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

