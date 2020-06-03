package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Items;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Schema
 */

public class Schema  implements Serializable {
  
  private String title = null;
  private String description = null;
  private List<String> type = new ArrayList<String>();
  private Items items = null;
  private String pattern = null;

  
  @ApiModelProperty(example = "null", value = "A core type's title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  
  @ApiModelProperty(example = "null", value = "A core type's description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  /**
   * An array of fundamental JSON Schema primitive types on which the core type is based
   **/
  public Schema type(List<String> type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of fundamental JSON Schema primitive types on which the core type is based")
  @JsonProperty("type")
  public List<String> getType() {
    return type;
  }
  public void setType(List<String> type) {
    this.type = type;
  }

  
  /**
   * Denotes the type and pattern of the items in an enum core type
   **/
  public Schema items(Items items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Denotes the type and pattern of the items in an enum core type")
  @JsonProperty("items")
  public Items getItems() {
    return items;
  }
  public void setItems(Items items) {
    this.items = items;
  }

  
  @ApiModelProperty(example = "null", value = "For the \"date\" and \"datetime\" core types, denotes the regex prescribing the allowable date/datetime format")
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schema schema = (Schema) o;
    return Objects.equals(this.title, schema.title) &&
        Objects.equals(this.description, schema.description) &&
        Objects.equals(this.type, schema.type) &&
        Objects.equals(this.items, schema.items) &&
        Objects.equals(this.pattern, schema.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, type, items, pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schema {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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

