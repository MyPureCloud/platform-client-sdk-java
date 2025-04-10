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
import com.mypurecloud.sdk.v2.model.CategoriesFilter;
import com.mypurecloud.sdk.v2.model.LabelsFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ArticlesFilter
 */

public class ArticlesFilter  implements Serializable {
  
  private LabelsFilter labels = null;
  private CategoriesFilter categories = null;

  public ArticlesFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The labels filter.
   **/
  public ArticlesFilter labels(LabelsFilter labels) {
    this.labels = labels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The labels filter.")
  @JsonProperty("labels")
  public LabelsFilter getLabels() {
    return labels;
  }
  public void setLabels(LabelsFilter labels) {
    this.labels = labels;
  }


  /**
   * The categories filter.
   **/
  public ArticlesFilter categories(CategoriesFilter categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The categories filter.")
  @JsonProperty("categories")
  public CategoriesFilter getCategories() {
    return categories;
  }
  public void setCategories(CategoriesFilter categories) {
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
    ArticlesFilter articlesFilter = (ArticlesFilter) o;

    return Objects.equals(this.labels, articlesFilter.labels) &&
            Objects.equals(this.categories, articlesFilter.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticlesFilter {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

