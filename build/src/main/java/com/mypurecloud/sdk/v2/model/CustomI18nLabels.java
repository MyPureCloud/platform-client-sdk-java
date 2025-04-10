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
import com.mypurecloud.sdk.v2.model.LocalizedLabels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * The localization settings for homescreen
 */
@ApiModel(description = "The localization settings for homescreen")

public class CustomI18nLabels  implements Serializable {
  
  private String language = null;
  private List<LocalizedLabels> localizedLabels = null;

  public CustomI18nLabels() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      localizedLabels = new ArrayList<LocalizedLabels>();
    }
  }

  
  /**
   * Language of localized labels in homescreen app (eg. en-us, de-de)
   **/
  public CustomI18nLabels language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language of localized labels in homescreen app (eg. en-us, de-de)")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Contains localized labels used in homescreen app
   **/
  public CustomI18nLabels localizedLabels(List<LocalizedLabels> localizedLabels) {
    this.localizedLabels = localizedLabels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains localized labels used in homescreen app")
  @JsonProperty("localizedLabels")
  public List<LocalizedLabels> getLocalizedLabels() {
    return localizedLabels;
  }
  public void setLocalizedLabels(List<LocalizedLabels> localizedLabels) {
    this.localizedLabels = localizedLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomI18nLabels customI18nLabels = (CustomI18nLabels) o;

    return Objects.equals(this.language, customI18nLabels.language) &&
            Objects.equals(this.localizedLabels, customI18nLabels.localizedLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, localizedLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomI18nLabels {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    localizedLabels: ").append(toIndentedString(localizedLabels)).append("\n");
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

