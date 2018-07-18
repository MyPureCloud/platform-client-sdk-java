package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.RouteGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RouteGroupList
 */

public class RouteGroupList  implements Serializable {
  
  private Date startDate = null;
  private List<RouteGroup> routeGroups = new ArrayList<RouteGroup>();

  
  @ApiModelProperty(example = "null", value = "The reference start date for the route group arrays. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  
  /**
   * The route group data for this forecast
   **/
  public RouteGroupList routeGroups(List<RouteGroup> routeGroups) {
    this.routeGroups = routeGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The route group data for this forecast")
  @JsonProperty("routeGroups")
  public List<RouteGroup> getRouteGroups() {
    return routeGroups;
  }
  public void setRouteGroups(List<RouteGroup> routeGroups) {
    this.routeGroups = routeGroups;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteGroupList routeGroupList = (RouteGroupList) o;
    return Objects.equals(this.startDate, routeGroupList.startDate) &&
        Objects.equals(this.routeGroups, routeGroupList.routeGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, routeGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteGroupList {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    routeGroups: ").append(toIndentedString(routeGroups)).append("\n");
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

