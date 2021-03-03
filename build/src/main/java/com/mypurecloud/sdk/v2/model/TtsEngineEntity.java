package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TtsEngineEntity
 */

public class TtsEngineEntity  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<String> languages = new ArrayList<String>();
  private List<String> outputFormats = new ArrayList<String>();
  private List<TtsVoiceEntity> voices = new ArrayList<TtsVoiceEntity>();
  private Boolean isDefault = null;
  private Boolean isSecure = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public TtsEngineEntity name(String name) {
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
   * The set of languages the TTS engine supports
   **/
  public TtsEngineEntity languages(List<String> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of languages the TTS engine supports")
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  
  /**
   * The set of output formats the TTS engine can produce
   **/
  public TtsEngineEntity outputFormats(List<String> outputFormats) {
    this.outputFormats = outputFormats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of output formats the TTS engine can produce")
  @JsonProperty("outputFormats")
  public List<String> getOutputFormats() {
    return outputFormats;
  }
  public void setOutputFormats(List<String> outputFormats) {
    this.outputFormats = outputFormats;
  }

  
  /**
   * The set of voices the TTS engine supports
   **/
  public TtsEngineEntity voices(List<TtsVoiceEntity> voices) {
    this.voices = voices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of voices the TTS engine supports")
  @JsonProperty("voices")
  public List<TtsVoiceEntity> getVoices() {
    return voices;
  }
  public void setVoices(List<TtsVoiceEntity> voices) {
    this.voices = voices;
  }

  
  /**
   * The TTS engine is the global default engine
   **/
  public TtsEngineEntity isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The TTS engine is the global default engine")
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  
  /**
   * The TTS engine can be used in a secure call flow
   **/
  public TtsEngineEntity isSecure(Boolean isSecure) {
    this.isSecure = isSecure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The TTS engine can be used in a secure call flow")
  @JsonProperty("isSecure")
  public Boolean getIsSecure() {
    return isSecure;
  }
  public void setIsSecure(Boolean isSecure) {
    this.isSecure = isSecure;
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
    TtsEngineEntity ttsEngineEntity = (TtsEngineEntity) o;
    return Objects.equals(this.id, ttsEngineEntity.id) &&
        Objects.equals(this.name, ttsEngineEntity.name) &&
        Objects.equals(this.languages, ttsEngineEntity.languages) &&
        Objects.equals(this.outputFormats, ttsEngineEntity.outputFormats) &&
        Objects.equals(this.voices, ttsEngineEntity.voices) &&
        Objects.equals(this.isDefault, ttsEngineEntity.isDefault) &&
        Objects.equals(this.isSecure, ttsEngineEntity.isSecure) &&
        Objects.equals(this.selfUri, ttsEngineEntity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, languages, outputFormats, voices, isDefault, isSecure, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TtsEngineEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    outputFormats: ").append(toIndentedString(outputFormats)).append("\n");
    sb.append("    voices: ").append(toIndentedString(voices)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isSecure: ").append(toIndentedString(isSecure)).append("\n");
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

