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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AvailableLanguageList
 */

public class AvailableLanguageList  implements Serializable {
  
  private List<String> languages = new ArrayList<String>();

  
  /**
   **/
  public AvailableLanguageList languages(List<String> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableLanguageList availableLanguageList = (AvailableLanguageList) o;
    return Objects.equals(this.languages, availableLanguageList.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableLanguageList {\n");
    
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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

