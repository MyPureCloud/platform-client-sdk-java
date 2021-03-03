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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LanguageOverride
 */

public class LanguageOverride  implements Serializable {
  
  private String language = null;
  private String engine = null;
  private String voice = null;

  
  /**
   * The language code of the language being overridden
   **/
  public LanguageOverride language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The language code of the language being overridden")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   * The ID of the TTS engine to use for this language override
   **/
  public LanguageOverride engine(String engine) {
    this.engine = engine;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the TTS engine to use for this language override")
  @JsonProperty("engine")
  public String getEngine() {
    return engine;
  }
  public void setEngine(String engine) {
    this.engine = engine;
  }

  
  /**
   * The ID of the voice to use for this language override. The voice must be supported by the chosen engine.
   **/
  public LanguageOverride voice(String voice) {
    this.voice = voice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the voice to use for this language override. The voice must be supported by the chosen engine.")
  @JsonProperty("voice")
  public String getVoice() {
    return voice;
  }
  public void setVoice(String voice) {
    this.voice = voice;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageOverride languageOverride = (LanguageOverride) o;
    return Objects.equals(this.language, languageOverride.language) &&
        Objects.equals(this.engine, languageOverride.engine) &&
        Objects.equals(this.voice, languageOverride.voice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, engine, voice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageOverride {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
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

