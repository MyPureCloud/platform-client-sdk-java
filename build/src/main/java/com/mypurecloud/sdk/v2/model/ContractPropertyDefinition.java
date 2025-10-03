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
import com.mypurecloud.sdk.v2.model.ContractItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ContractPropertyDefinition
 */

public class ContractPropertyDefinition  implements Serializable {
  
  private String title = null;
  private String description = null;
  private List<String> type = null;
  private String pattern = null;
  private String format = null;
  private ContractItems items = null;
  private Map<String, ContractPropertyDefinition> properties = null;

  public ContractPropertyDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      type = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public ContractPropertyDefinition title(String title) {
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
  public ContractPropertyDefinition description(String description) {
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
  public ContractPropertyDefinition type(List<String> type) {
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
  public ContractPropertyDefinition pattern(String pattern) {
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
  public ContractPropertyDefinition format(String format) {
    this.format = format;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }


  /**
   **/
  public ContractPropertyDefinition items(ContractItems items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("items")
  public ContractItems getItems() {
    return items;
  }
  public void setItems(ContractItems items) {
    this.items = items;
  }


  /**
   **/
  public ContractPropertyDefinition properties(Map<String, ContractPropertyDefinition> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("properties")
  public Map<String, ContractPropertyDefinition> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, ContractPropertyDefinition> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractPropertyDefinition contractPropertyDefinition = (ContractPropertyDefinition) o;

    return Objects.equals(this.title, contractPropertyDefinition.title) &&
            Objects.equals(this.description, contractPropertyDefinition.description) &&
            Objects.equals(this.type, contractPropertyDefinition.type) &&
            Objects.equals(this.pattern, contractPropertyDefinition.pattern) &&
            Objects.equals(this.format, contractPropertyDefinition.format) &&
            Objects.equals(this.items, contractPropertyDefinition.items) &&
            Objects.equals(this.properties, contractPropertyDefinition.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, type, pattern, format, items, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractPropertyDefinition {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

