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

import java.io.Serializable;
/**
 * UpdateAnalyticsDataRetentionRequest
 */

public class UpdateAnalyticsDataRetentionRequest  implements Serializable {
  
  private Integer retentionDays = null;

  
  /**
   * Analytics data retention period in days to set for the organization.
   **/
  public UpdateAnalyticsDataRetentionRequest retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Analytics data retention period in days to set for the organization.")
  @JsonProperty("retentionDays")
  public Integer getRetentionDays() {
    return retentionDays;
  }
  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAnalyticsDataRetentionRequest updateAnalyticsDataRetentionRequest = (UpdateAnalyticsDataRetentionRequest) o;

    return Objects.equals(this.retentionDays, updateAnalyticsDataRetentionRequest.retentionDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retentionDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnalyticsDataRetentionRequest {\n");
    
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
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

