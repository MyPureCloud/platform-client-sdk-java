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
import com.mypurecloud.sdk.v2.model.LanguageSupportInfoRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LanguageSupportResponse
 */

public class LanguageSupportResponse  implements Serializable {
  
  private List<LanguageSupportInfoRecord> languages = null;

  public LanguageSupportResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      languages = new ArrayList<LanguageSupportInfoRecord>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "List of feature support information by language.")
  @JsonProperty("languages")
  public List<LanguageSupportInfoRecord> getLanguages() {
    return languages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageSupportResponse languageSupportResponse = (LanguageSupportResponse) o;

    return Objects.equals(this.languages, languageSupportResponse.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageSupportResponse {\n");
    
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

