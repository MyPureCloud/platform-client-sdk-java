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
import com.mypurecloud.sdk.v2.model.Parameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReportMetaData
 */

public class ReportMetaData  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String title = null;
  private String description = null;
  private List<String> keywords = new ArrayList<String>();
  private List<String> availableLocales = new ArrayList<String>();
  private List<Parameter> parameters = new ArrayList<Parameter>();
  private String exampleUrl = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ReportMetaData name(String name) {
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
  public ReportMetaData title(String title) {
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
  public ReportMetaData description(String description) {
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
  public ReportMetaData keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("keywords")
  public List<String> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  
  /**
   **/
  public ReportMetaData availableLocales(List<String> availableLocales) {
    this.availableLocales = availableLocales;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("availableLocales")
  public List<String> getAvailableLocales() {
    return availableLocales;
  }
  public void setAvailableLocales(List<String> availableLocales) {
    this.availableLocales = availableLocales;
  }

  
  /**
   **/
  public ReportMetaData parameters(List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parameters")
  public List<Parameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }

  
  /**
   **/
  public ReportMetaData exampleUrl(String exampleUrl) {
    this.exampleUrl = exampleUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exampleUrl")
  public String getExampleUrl() {
    return exampleUrl;
  }
  public void setExampleUrl(String exampleUrl) {
    this.exampleUrl = exampleUrl;
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
    ReportMetaData reportMetaData = (ReportMetaData) o;
    return Objects.equals(this.id, reportMetaData.id) &&
        Objects.equals(this.name, reportMetaData.name) &&
        Objects.equals(this.title, reportMetaData.title) &&
        Objects.equals(this.description, reportMetaData.description) &&
        Objects.equals(this.keywords, reportMetaData.keywords) &&
        Objects.equals(this.availableLocales, reportMetaData.availableLocales) &&
        Objects.equals(this.parameters, reportMetaData.parameters) &&
        Objects.equals(this.exampleUrl, reportMetaData.exampleUrl) &&
        Objects.equals(this.selfUri, reportMetaData.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, title, description, keywords, availableLocales, parameters, exampleUrl, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportMetaData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    availableLocales: ").append(toIndentedString(availableLocales)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    exampleUrl: ").append(toIndentedString(exampleUrl)).append("\n");
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

