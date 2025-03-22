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
 * TwitterDataHistoricalTweetRequest
 */

public class TwitterDataHistoricalTweetRequest  implements Serializable {
  
  private String searchTerms = null;
  private List<String> countries = new ArrayList<String>();

  
  /**
   * Search terms to use in the query
   **/
  public TwitterDataHistoricalTweetRequest searchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Search terms to use in the query")
  @JsonProperty("searchTerms")
  public String getSearchTerms() {
    return searchTerms;
  }
  public void setSearchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
  }


  /**
   * ISO 3166-1 alpha-2 country codes to use for the search. Defaults to worldwide.
   **/
  public TwitterDataHistoricalTweetRequest countries(List<String> countries) {
    this.countries = countries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 3166-1 alpha-2 country codes to use for the search. Defaults to worldwide.")
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
    TwitterDataHistoricalTweetRequest twitterDataHistoricalTweetRequest = (TwitterDataHistoricalTweetRequest) o;

    return Objects.equals(this.searchTerms, twitterDataHistoricalTweetRequest.searchTerms) &&
            Objects.equals(this.countries, twitterDataHistoricalTweetRequest.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchTerms, countries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterDataHistoricalTweetRequest {\n");
    
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

