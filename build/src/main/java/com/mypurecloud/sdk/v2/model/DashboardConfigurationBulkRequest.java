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
 * DashboardConfigurationBulkRequest
 */

public class DashboardConfigurationBulkRequest  implements Serializable {
  
  private List<String> dashboardConfigurationIds = null;

  public DashboardConfigurationBulkRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dashboardConfigurationIds = new ArrayList<String>();
    }
  }

  
  /**
   * The user supplied dashboard configuration ids
   **/
  public DashboardConfigurationBulkRequest dashboardConfigurationIds(List<String> dashboardConfigurationIds) {
    this.dashboardConfigurationIds = dashboardConfigurationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user supplied dashboard configuration ids")
  @JsonProperty("dashboardConfigurationIds")
  public List<String> getDashboardConfigurationIds() {
    return dashboardConfigurationIds;
  }
  public void setDashboardConfigurationIds(List<String> dashboardConfigurationIds) {
    this.dashboardConfigurationIds = dashboardConfigurationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardConfigurationBulkRequest dashboardConfigurationBulkRequest = (DashboardConfigurationBulkRequest) o;

    return Objects.equals(this.dashboardConfigurationIds, dashboardConfigurationBulkRequest.dashboardConfigurationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardConfigurationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardConfigurationBulkRequest {\n");
    
    sb.append("    dashboardConfigurationIds: ").append(toIndentedString(dashboardConfigurationIds)).append("\n");
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

