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
import com.mypurecloud.sdk.v2.model.AdditionalLanguagesSynonyms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * NamedEntityTypeItem
 */

public class NamedEntityTypeItem  implements Serializable {
  
  private String value = null;
  private List<String> synonyms = null;
  private Map<String, AdditionalLanguagesSynonyms> additionalLanguages = null;

  public NamedEntityTypeItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      synonyms = new ArrayList<String>();
    }
  }

  
  /**
   * A value for an named entity type definition.
   **/
  public NamedEntityTypeItem value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A value for an named entity type definition.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Synonyms for the given named entity value.
   **/
  public NamedEntityTypeItem synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Synonyms for the given named entity value.")
  @JsonProperty("synonyms")
  public List<String> getSynonyms() {
    return synonyms;
  }
  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }


  /**
   * Additional Language Synonyms for the given named entity value.
   **/
  public NamedEntityTypeItem additionalLanguages(Map<String, AdditionalLanguagesSynonyms> additionalLanguages) {
    this.additionalLanguages = additionalLanguages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional Language Synonyms for the given named entity value.")
  @JsonProperty("additionalLanguages")
  public Map<String, AdditionalLanguagesSynonyms> getAdditionalLanguages() {
    return additionalLanguages;
  }
  public void setAdditionalLanguages(Map<String, AdditionalLanguagesSynonyms> additionalLanguages) {
    this.additionalLanguages = additionalLanguages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedEntityTypeItem namedEntityTypeItem = (NamedEntityTypeItem) o;

    return Objects.equals(this.value, namedEntityTypeItem.value) &&
            Objects.equals(this.synonyms, namedEntityTypeItem.synonyms) &&
            Objects.equals(this.additionalLanguages, namedEntityTypeItem.additionalLanguages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, synonyms, additionalLanguages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedEntityTypeItem {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    additionalLanguages: ").append(toIndentedString(additionalLanguages)).append("\n");
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

