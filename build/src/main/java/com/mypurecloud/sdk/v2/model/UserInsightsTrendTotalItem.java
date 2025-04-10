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
import com.mypurecloud.sdk.v2.model.UserInsightsTrends;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserInsightsTrendTotalItem
 */

public class UserInsightsTrendTotalItem  implements Serializable {
  
  private UserInsightsTrends trends = null;

  public UserInsightsTrendTotalItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Trends for the metric
   **/
  public UserInsightsTrendTotalItem trends(UserInsightsTrends trends) {
    this.trends = trends;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Trends for the metric")
  @JsonProperty("trends")
  public UserInsightsTrends getTrends() {
    return trends;
  }
  public void setTrends(UserInsightsTrends trends) {
    this.trends = trends;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInsightsTrendTotalItem userInsightsTrendTotalItem = (UserInsightsTrendTotalItem) o;

    return Objects.equals(this.trends, userInsightsTrendTotalItem.trends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInsightsTrendTotalItem {\n");
    
    sb.append("    trends: ").append(toIndentedString(trends)).append("\n");
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

