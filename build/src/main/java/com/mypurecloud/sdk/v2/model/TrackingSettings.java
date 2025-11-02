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
import com.mypurecloud.sdk.v2.model.IpFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Settings that control how tracking data is collected and filtered.
 */
@ApiModel(description = "Settings that control how tracking data is collected and filtered.")

public class TrackingSettings  implements Serializable {
  
  private List<String> excludedQueryParameters = null;
  private Boolean shouldKeepUrlFragment = null;
  private List<String> searchQueryParameters = null;
  private List<IpFilter> ipFilters = null;

  public TrackingSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      excludedQueryParameters = new ArrayList<String>();
      searchQueryParameters = new ArrayList<String>();
      ipFilters = new ArrayList<IpFilter>();
    }
  }

  
  /**
   * List of parameters to be excluded from the query string.
   **/
  public TrackingSettings excludedQueryParameters(List<String> excludedQueryParameters) {
    this.excludedQueryParameters = excludedQueryParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of parameters to be excluded from the query string.")
  @JsonProperty("excludedQueryParameters")
  public List<String> getExcludedQueryParameters() {
    return excludedQueryParameters;
  }
  public void setExcludedQueryParameters(List<String> excludedQueryParameters) {
    this.excludedQueryParameters = excludedQueryParameters;
  }


  /**
   * Whether or not to keep the URL fragment.
   **/
  public TrackingSettings shouldKeepUrlFragment(Boolean shouldKeepUrlFragment) {
    this.shouldKeepUrlFragment = shouldKeepUrlFragment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to keep the URL fragment.")
  @JsonProperty("shouldKeepUrlFragment")
  public Boolean getShouldKeepUrlFragment() {
    return shouldKeepUrlFragment;
  }
  public void setShouldKeepUrlFragment(Boolean shouldKeepUrlFragment) {
    this.shouldKeepUrlFragment = shouldKeepUrlFragment;
  }


  /**
   * List of query parameters used for search (e.g. 'query').
   **/
  public TrackingSettings searchQueryParameters(List<String> searchQueryParameters) {
    this.searchQueryParameters = searchQueryParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of query parameters used for search (e.g. 'query').")
  @JsonProperty("searchQueryParameters")
  public List<String> getSearchQueryParameters() {
    return searchQueryParameters;
  }
  public void setSearchQueryParameters(List<String> searchQueryParameters) {
    this.searchQueryParameters = searchQueryParameters;
  }


  /**
   * IP address filtering configuration for tracking restrictions.
   **/
  public TrackingSettings ipFilters(List<IpFilter> ipFilters) {
    this.ipFilters = ipFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IP address filtering configuration for tracking restrictions.")
  @JsonProperty("ipFilters")
  public List<IpFilter> getIpFilters() {
    return ipFilters;
  }
  public void setIpFilters(List<IpFilter> ipFilters) {
    this.ipFilters = ipFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingSettings trackingSettings = (TrackingSettings) o;

    return Objects.equals(this.excludedQueryParameters, trackingSettings.excludedQueryParameters) &&
            Objects.equals(this.shouldKeepUrlFragment, trackingSettings.shouldKeepUrlFragment) &&
            Objects.equals(this.searchQueryParameters, trackingSettings.searchQueryParameters) &&
            Objects.equals(this.ipFilters, trackingSettings.ipFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedQueryParameters, shouldKeepUrlFragment, searchQueryParameters, ipFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingSettings {\n");
    
    sb.append("    excludedQueryParameters: ").append(toIndentedString(excludedQueryParameters)).append("\n");
    sb.append("    shouldKeepUrlFragment: ").append(toIndentedString(shouldKeepUrlFragment)).append("\n");
    sb.append("    searchQueryParameters: ").append(toIndentedString(searchQueryParameters)).append("\n");
    sb.append("    ipFilters: ").append(toIndentedString(ipFilters)).append("\n");
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

