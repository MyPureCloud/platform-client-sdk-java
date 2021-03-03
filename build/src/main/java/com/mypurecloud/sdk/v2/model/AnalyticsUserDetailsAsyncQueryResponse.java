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
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsUserDetailsAsyncQueryResponse
 */

public class AnalyticsUserDetailsAsyncQueryResponse  implements Serializable {
  
  private List<AnalyticsUserDetail> userDetails = new ArrayList<AnalyticsUserDetail>();
  private String cursor = null;
  private Date dataAvailabilityDate = null;

  
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

  
  /**
   * Data available up to at least this datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsUserDetailsAsyncQueryResponse dataAvailabilityDate(Date dataAvailabilityDate) {
    this.dataAvailabilityDate = dataAvailabilityDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data available up to at least this datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dataAvailabilityDate")
  public Date getDataAvailabilityDate() {
    return dataAvailabilityDate;
  }
  public void setDataAvailabilityDate(Date dataAvailabilityDate) {
    this.dataAvailabilityDate = dataAvailabilityDate;
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
        Objects.equals(this.cursor, analyticsUserDetailsAsyncQueryResponse.cursor) &&
        Objects.equals(this.dataAvailabilityDate, analyticsUserDetailsAsyncQueryResponse.dataAvailabilityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userDetails, cursor, dataAvailabilityDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsUserDetailsAsyncQueryResponse {\n");
    
    sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    dataAvailabilityDate: ").append(toIndentedString(dataAvailabilityDate)).append("\n");
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

