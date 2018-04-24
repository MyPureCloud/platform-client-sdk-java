package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Represents a category used to filter listings within the AppFoundry
 */
@ApiModel(description = "Represents a category used to filter listings within the AppFoundry")

public class AppFoundryListingCategory  implements Serializable {
  
  private String name = null;
  private List<String> subCategories = new ArrayList<String>();

  
  /**
   * Name of the category
   **/
  public AppFoundryListingCategory name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the category")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Subcategories under this category
   **/
  public AppFoundryListingCategory subCategories(List<String> subCategories) {
    this.subCategories = subCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subcategories under this category")
  @JsonProperty("subCategories")
  public List<String> getSubCategories() {
    return subCategories;
  }
  public void setSubCategories(List<String> subCategories) {
    this.subCategories = subCategories;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppFoundryListingCategory appFoundryListingCategory = (AppFoundryListingCategory) o;
    return Objects.equals(this.name, appFoundryListingCategory.name) &&
        Objects.equals(this.subCategories, appFoundryListingCategory.subCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppFoundryListingCategory {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
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

