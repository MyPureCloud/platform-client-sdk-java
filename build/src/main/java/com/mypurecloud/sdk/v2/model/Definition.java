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
import com.mypurecloud.sdk.v2.model.Items;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Definition
 */

public class Definition  implements Serializable {
  
  private String name = null;
  private String title = null;
  private String description = null;
  private List<String> type = null;
  private String pattern = null;
  private Items items = null;
  private String selfUri = null;

  public Definition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      type = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public Definition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public Definition title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   **/
  public Definition description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public Definition type(List<String> type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public List<String> getType() {
    return type;
  }
  public void setType(List<String> type) {
    this.type = type;
  }


  /**
   **/
  public Definition pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  /**
   **/
  public Definition items(Items items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("items")
  public Items getItems() {
    return items;
  }
  public void setItems(Items items) {
    this.items = items;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Definition definition = (Definition) o;

    return Objects.equals(this.name, definition.name) &&
            Objects.equals(this.title, definition.title) &&
            Objects.equals(this.description, definition.description) &&
            Objects.equals(this.type, definition.type) &&
            Objects.equals(this.pattern, definition.pattern) &&
            Objects.equals(this.items, definition.items) &&
            Objects.equals(this.selfUri, definition.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, description, type, pattern, items, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Definition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

