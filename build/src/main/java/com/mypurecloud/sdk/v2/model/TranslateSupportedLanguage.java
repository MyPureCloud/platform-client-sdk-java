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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TranslateSupportedLanguage
 */

public class TranslateSupportedLanguage  implements Serializable {
  
  private String languageName = null;
  private String languageCode = null;

  
  /**
   * Supported translation language name, natively spelled (ex. Español)
   **/
  public TranslateSupportedLanguage languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Supported translation language name, natively spelled (ex. Español)")
  @JsonProperty("languageName")
  public String getLanguageName() {
    return languageName;
  }
  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  /**
   * Supported translation language code. See - https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html#what-is-languages-supported
   **/
  public TranslateSupportedLanguage languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Supported translation language code. See - https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html#what-is-languages-supported")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateSupportedLanguage translateSupportedLanguage = (TranslateSupportedLanguage) o;

    return Objects.equals(this.languageName, translateSupportedLanguage.languageName) &&
            Objects.equals(this.languageCode, translateSupportedLanguage.languageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageName, languageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateSupportedLanguage {\n");
    
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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

