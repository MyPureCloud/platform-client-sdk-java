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
import com.mypurecloud.sdk.v2.model.TrendData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * InsightsTrends
 */

public class InsightsTrends  implements Serializable {
  
  private List<TrendData> comparativePeriod = null;
  private List<TrendData> primaryPeriod = null;

  public InsightsTrends() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      comparativePeriod = new ArrayList<TrendData>();
      primaryPeriod = new ArrayList<TrendData>();
    }
  }

  
  /**
   * List of trend data in the comparative period
   **/
  public InsightsTrends comparativePeriod(List<TrendData> comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of trend data in the comparative period")
  @JsonProperty("comparativePeriod")
  public List<TrendData> getComparativePeriod() {
    return comparativePeriod;
  }
  public void setComparativePeriod(List<TrendData> comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
  }


  /**
   * List of trend data in the primary period
   **/
  public InsightsTrends primaryPeriod(List<TrendData> primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of trend data in the primary period")
  @JsonProperty("primaryPeriod")
  public List<TrendData> getPrimaryPeriod() {
    return primaryPeriod;
  }
  public void setPrimaryPeriod(List<TrendData> primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsTrends insightsTrends = (InsightsTrends) o;

    return Objects.equals(this.comparativePeriod, insightsTrends.comparativePeriod) &&
            Objects.equals(this.primaryPeriod, insightsTrends.primaryPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparativePeriod, primaryPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsTrends {\n");
    
    sb.append("    comparativePeriod: ").append(toIndentedString(comparativePeriod)).append("\n");
    sb.append("    primaryPeriod: ").append(toIndentedString(primaryPeriod)).append("\n");
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

