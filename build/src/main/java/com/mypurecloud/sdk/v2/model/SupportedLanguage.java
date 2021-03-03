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
 * SupportedLanguage
 */

public class SupportedLanguage  implements Serializable {
  
  private String language = null;
  private Boolean isDefault = null;

  
  @ApiModelProperty(example = "null", value = "Architect supported language tag, e.g. en-us, es-us")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  
  @ApiModelProperty(example = "null", value = "Whether or not this language is the default language")
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedLanguage supportedLanguage = (SupportedLanguage) o;
    return Objects.equals(this.language, supportedLanguage.language) &&
        Objects.equals(this.isDefault, supportedLanguage.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedLanguage {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

