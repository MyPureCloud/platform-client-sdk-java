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
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsDataRetentionResponse
 */

public class AnalyticsDataRetentionResponse  implements Serializable {
  
  private Integer retentionDays = null;
  private Date dateCreated = null;
  private Date dateModified = null;

  public AnalyticsDataRetentionResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Analytics data retention period in days for the organization.
   **/
  public AnalyticsDataRetentionResponse retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Analytics data retention period in days for the organization.")
  @JsonProperty("retentionDays")
  public Integer getRetentionDays() {
    return retentionDays;
  }
  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }


  /**
   * Date and time when the analytics data retention was set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsDataRetentionResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time when the analytics data retention was set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Date and time when the analytics data retention was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsDataRetentionResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time when the analytics data retention was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsDataRetentionResponse analyticsDataRetentionResponse = (AnalyticsDataRetentionResponse) o;

    return Objects.equals(this.retentionDays, analyticsDataRetentionResponse.retentionDays) &&
            Objects.equals(this.dateCreated, analyticsDataRetentionResponse.dateCreated) &&
            Objects.equals(this.dateModified, analyticsDataRetentionResponse.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retentionDays, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsDataRetentionResponse {\n");
    
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

