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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TwitterDataIngestionRuleRequest
 */

public class TwitterDataIngestionRuleRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private String searchTerms = null;
  private List<String> countries = null;

  public TwitterDataIngestionRuleRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      countries = new ArrayList<String>();
    }
  }

  
  /**
   * The name of the data ingestion rule.
   **/
  public TwitterDataIngestionRuleRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the data ingestion rule.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * A description of the data ingestion rule.
   **/
  public TwitterDataIngestionRuleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the data ingestion rule.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Search terms for X (formally Twitter).
   **/
  public TwitterDataIngestionRuleRequest searchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Search terms for X (formally Twitter).")
  @JsonProperty("searchTerms")
  public String getSearchTerms() {
    return searchTerms;
  }
  public void setSearchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
  }


  /**
   * ISO 3166-1 alpha-2 country codes. Ingestion of matching tweets will be restricted to tweets posted in the countries specified here. Defaults to worldwide.
   **/
  public TwitterDataIngestionRuleRequest countries(List<String> countries) {
    this.countries = countries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 3166-1 alpha-2 country codes. Ingestion of matching tweets will be restricted to tweets posted in the countries specified here. Defaults to worldwide.")
  @JsonProperty("countries")
  public List<String> getCountries() {
    return countries;
  }
  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwitterDataIngestionRuleRequest twitterDataIngestionRuleRequest = (TwitterDataIngestionRuleRequest) o;

    return Objects.equals(this.name, twitterDataIngestionRuleRequest.name) &&
            Objects.equals(this.description, twitterDataIngestionRuleRequest.description) &&
            Objects.equals(this.searchTerms, twitterDataIngestionRuleRequest.searchTerms) &&
            Objects.equals(this.countries, twitterDataIngestionRuleRequest.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, searchTerms, countries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterDataIngestionRuleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

