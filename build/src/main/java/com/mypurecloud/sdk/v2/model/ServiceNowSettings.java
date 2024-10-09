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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ServiceNowSettings
 */

public class ServiceNowSettings  implements Serializable {
  
  private List<String> knowledgeBaseIds = new ArrayList<String>();
  private String language = null;
  private List<String> categories = new ArrayList<String>();

  
  /**
   * Filter source by knowledge base ids.
   **/
  public ServiceNowSettings knowledgeBaseIds(List<String> knowledgeBaseIds) {
    this.knowledgeBaseIds = knowledgeBaseIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter source by knowledge base ids.")
  @JsonProperty("knowledgeBaseIds")
  public List<String> getKnowledgeBaseIds() {
    return knowledgeBaseIds;
  }
  public void setKnowledgeBaseIds(List<String> knowledgeBaseIds) {
    this.knowledgeBaseIds = knowledgeBaseIds;
  }


  /**
   * Filter source by language.
   **/
  public ServiceNowSettings language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter source by language.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Filter source by categories.
   **/
  public ServiceNowSettings categories(List<String> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter source by categories.")
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceNowSettings serviceNowSettings = (ServiceNowSettings) o;

    return Objects.equals(this.knowledgeBaseIds, serviceNowSettings.knowledgeBaseIds) &&
            Objects.equals(this.language, serviceNowSettings.language) &&
            Objects.equals(this.categories, serviceNowSettings.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeBaseIds, language, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNowSettings {\n");
    
    sb.append("    knowledgeBaseIds: ").append(toIndentedString(knowledgeBaseIds)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

