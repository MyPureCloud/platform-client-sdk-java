package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsUserDetailsAsyncQueryResponse
 */

public class AnalyticsUserDetailsAsyncQueryResponse  implements Serializable {
  
  private List<AnalyticsUserDetail> userDetails = new ArrayList<AnalyticsUserDetail>();
  private String cursor = null;

  
  /**
   **/
  public AnalyticsUserDetailsAsyncQueryResponse userDetails(List<AnalyticsUserDetail> userDetails) {
    this.userDetails = userDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userDetails")
  public List<AnalyticsUserDetail> getUserDetails() {
    return userDetails;
  }
  public void setUserDetails(List<AnalyticsUserDetail> userDetails) {
    this.userDetails = userDetails;
  }

  
  /**
   * Optional cursor to indicate where to resume the results
   **/
  public AnalyticsUserDetailsAsyncQueryResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional cursor to indicate where to resume the results")
  @JsonProperty("cursor")
  public String getCursor() {
    return cursor;
  }
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsUserDetailsAsyncQueryResponse analyticsUserDetailsAsyncQueryResponse = (AnalyticsUserDetailsAsyncQueryResponse) o;
    return Objects.equals(this.userDetails, analyticsUserDetailsAsyncQueryResponse.userDetails) &&
        Objects.equals(this.cursor, analyticsUserDetailsAsyncQueryResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userDetails, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsUserDetailsAsyncQueryResponse {\n");
    
    sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

