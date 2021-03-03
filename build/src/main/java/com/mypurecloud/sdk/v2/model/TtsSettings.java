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
import com.mypurecloud.sdk.v2.model.LanguageOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TtsSettings
 */

public class TtsSettings  implements Serializable {
  
  private String defaultEngine = null;
  private List<LanguageOverride> languageOverrides = new ArrayList<LanguageOverride>();

  
  /**
   * ID of the global default TTS engine
   **/
  public TtsSettings defaultEngine(String defaultEngine) {
    this.defaultEngine = defaultEngine;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the global default TTS engine")
  @JsonProperty("defaultEngine")
  public String getDefaultEngine() {
    return defaultEngine;
  }
  public void setDefaultEngine(String defaultEngine) {
    this.defaultEngine = defaultEngine;
  }

  
  /**
   * The list of default overrides for specific languages
   **/
  public TtsSettings languageOverrides(List<LanguageOverride> languageOverrides) {
    this.languageOverrides = languageOverrides;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of default overrides for specific languages")
  @JsonProperty("languageOverrides")
  public List<LanguageOverride> getLanguageOverrides() {
    return languageOverrides;
  }
  public void setLanguageOverrides(List<LanguageOverride> languageOverrides) {
    this.languageOverrides = languageOverrides;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TtsSettings ttsSettings = (TtsSettings) o;
    return Objects.equals(this.defaultEngine, ttsSettings.defaultEngine) &&
        Objects.equals(this.languageOverrides, ttsSettings.languageOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultEngine, languageOverrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TtsSettings {\n");
    
    sb.append("    defaultEngine: ").append(toIndentedString(defaultEngine)).append("\n");
    sb.append("    languageOverrides: ").append(toIndentedString(languageOverrides)).append("\n");
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

