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
import com.mypurecloud.sdk.v2.model.UserTrendData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserInsightsTrends
 */

public class UserInsightsTrends  implements Serializable {
  
  private List<UserTrendData> comparativePeriod = null;
  private List<UserTrendData> primaryPeriod = null;

  public UserInsightsTrends() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      comparativePeriod = new ArrayList<UserTrendData>();
      primaryPeriod = new ArrayList<UserTrendData>();
    }
  }

  
  /**
   * List of trend data in the comparative period
   **/
  public UserInsightsTrends comparativePeriod(List<UserTrendData> comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of trend data in the comparative period")
  @JsonProperty("comparativePeriod")
  public List<UserTrendData> getComparativePeriod() {
    return comparativePeriod;
  }
  public void setComparativePeriod(List<UserTrendData> comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
  }


  /**
   * List of trend data in the primary period
   **/
  public UserInsightsTrends primaryPeriod(List<UserTrendData> primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of trend data in the primary period")
  @JsonProperty("primaryPeriod")
  public List<UserTrendData> getPrimaryPeriod() {
    return primaryPeriod;
  }
  public void setPrimaryPeriod(List<UserTrendData> primaryPeriod) {
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
    UserInsightsTrends userInsightsTrends = (UserInsightsTrends) o;

    return Objects.equals(this.comparativePeriod, userInsightsTrends.comparativePeriod) &&
            Objects.equals(this.primaryPeriod, userInsightsTrends.primaryPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparativePeriod, primaryPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInsightsTrends {\n");
    
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

