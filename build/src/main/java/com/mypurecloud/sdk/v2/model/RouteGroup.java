package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.RouteGroupAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Route group for calculated forecasts
 */
@ApiModel(description = "Route group for calculated forecasts")

public class RouteGroup  implements Serializable {
  
  private RouteGroupAttributes attributes = null;
  private List<Double> offeredPerInterval = new ArrayList<Double>();
  private List<Double> averageTalkTimeSecondsPerInterval = new ArrayList<Double>();
  private List<Double> averageAfterCallWorkSecondsPerInterval = new ArrayList<Double>();
  private List<Double> completedPerInterval = new ArrayList<Double>();
  private List<Double> abandonedPerInterval = new ArrayList<Double>();

  
  /**
   * The attributes that describe this route group
   **/
  public RouteGroup attributes(RouteGroupAttributes attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The attributes that describe this route group")
  @JsonProperty("attributes")
  public RouteGroupAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(RouteGroupAttributes attributes) {
    this.attributes = attributes;
  }

  
  /**
   * Interactions offered per 15 minute interval
   **/
  public RouteGroup offeredPerInterval(List<Double> offeredPerInterval) {
    this.offeredPerInterval = offeredPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Interactions offered per 15 minute interval")
  @JsonProperty("offeredPerInterval")
  public List<Double> getOfferedPerInterval() {
    return offeredPerInterval;
  }
  public void setOfferedPerInterval(List<Double> offeredPerInterval) {
    this.offeredPerInterval = offeredPerInterval;
  }

  
  /**
   * Average talk time in seconds per 15 minute interval
   **/
  public RouteGroup averageTalkTimeSecondsPerInterval(List<Double> averageTalkTimeSecondsPerInterval) {
    this.averageTalkTimeSecondsPerInterval = averageTalkTimeSecondsPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Average talk time in seconds per 15 minute interval")
  @JsonProperty("averageTalkTimeSecondsPerInterval")
  public List<Double> getAverageTalkTimeSecondsPerInterval() {
    return averageTalkTimeSecondsPerInterval;
  }
  public void setAverageTalkTimeSecondsPerInterval(List<Double> averageTalkTimeSecondsPerInterval) {
    this.averageTalkTimeSecondsPerInterval = averageTalkTimeSecondsPerInterval;
  }

  
  /**
   * Average after call work in seconds per 15 minute interval
   **/
  public RouteGroup averageAfterCallWorkSecondsPerInterval(List<Double> averageAfterCallWorkSecondsPerInterval) {
    this.averageAfterCallWorkSecondsPerInterval = averageAfterCallWorkSecondsPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Average after call work in seconds per 15 minute interval")
  @JsonProperty("averageAfterCallWorkSecondsPerInterval")
  public List<Double> getAverageAfterCallWorkSecondsPerInterval() {
    return averageAfterCallWorkSecondsPerInterval;
  }
  public void setAverageAfterCallWorkSecondsPerInterval(List<Double> averageAfterCallWorkSecondsPerInterval) {
    this.averageAfterCallWorkSecondsPerInterval = averageAfterCallWorkSecondsPerInterval;
  }

  
  /**
   * Interactions completed per 15 minute interval
   **/
  public RouteGroup completedPerInterval(List<Double> completedPerInterval) {
    this.completedPerInterval = completedPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Interactions completed per 15 minute interval")
  @JsonProperty("completedPerInterval")
  public List<Double> getCompletedPerInterval() {
    return completedPerInterval;
  }
  public void setCompletedPerInterval(List<Double> completedPerInterval) {
    this.completedPerInterval = completedPerInterval;
  }

  
  /**
   * Interactions abandoned per 15 minute interval
   **/
  public RouteGroup abandonedPerInterval(List<Double> abandonedPerInterval) {
    this.abandonedPerInterval = abandonedPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Interactions abandoned per 15 minute interval")
  @JsonProperty("abandonedPerInterval")
  public List<Double> getAbandonedPerInterval() {
    return abandonedPerInterval;
  }
  public void setAbandonedPerInterval(List<Double> abandonedPerInterval) {
    this.abandonedPerInterval = abandonedPerInterval;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteGroup routeGroup = (RouteGroup) o;
    return Objects.equals(this.attributes, routeGroup.attributes) &&
        Objects.equals(this.offeredPerInterval, routeGroup.offeredPerInterval) &&
        Objects.equals(this.averageTalkTimeSecondsPerInterval, routeGroup.averageTalkTimeSecondsPerInterval) &&
        Objects.equals(this.averageAfterCallWorkSecondsPerInterval, routeGroup.averageAfterCallWorkSecondsPerInterval) &&
        Objects.equals(this.completedPerInterval, routeGroup.completedPerInterval) &&
        Objects.equals(this.abandonedPerInterval, routeGroup.abandonedPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, offeredPerInterval, averageTalkTimeSecondsPerInterval, averageAfterCallWorkSecondsPerInterval, completedPerInterval, abandonedPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteGroup {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    offeredPerInterval: ").append(toIndentedString(offeredPerInterval)).append("\n");
    sb.append("    averageTalkTimeSecondsPerInterval: ").append(toIndentedString(averageTalkTimeSecondsPerInterval)).append("\n");
    sb.append("    averageAfterCallWorkSecondsPerInterval: ").append(toIndentedString(averageAfterCallWorkSecondsPerInterval)).append("\n");
    sb.append("    completedPerInterval: ").append(toIndentedString(completedPerInterval)).append("\n");
    sb.append("    abandonedPerInterval: ").append(toIndentedString(abandonedPerInterval)).append("\n");
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

