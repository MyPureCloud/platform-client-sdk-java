package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.RouteGroupList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Request body for importing a short term forecast
 */
@ApiModel(description = "Request body for importing a short term forecast")

public class ImportShortTermForecastRequest  implements Serializable {
  
  private String fileName = null;
  private String description = null;
  private RouteGroupList routeGroupList = null;
  private List<String> partialUploadIds = new ArrayList<String>();

  
  /**
   * The file name, if applicable, this data was extracted from (display purposes only)
   **/
  public ImportShortTermForecastRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The file name, if applicable, this data was extracted from (display purposes only)")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   * Description for the imported forecast.  Pass an empty string for no description
   **/
  public ImportShortTermForecastRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description for the imported forecast.  Pass an empty string for no description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The raw data to import
   **/
  public ImportShortTermForecastRequest routeGroupList(RouteGroupList routeGroupList) {
    this.routeGroupList = routeGroupList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The raw data to import")
  @JsonProperty("routeGroupList")
  public RouteGroupList getRouteGroupList() {
    return routeGroupList;
  }
  public void setRouteGroupList(RouteGroupList routeGroupList) {
    this.routeGroupList = routeGroupList;
  }

  
  /**
   * IDs of partial uploads to include in this imported forecast.  Only relevant for large forecasts
   **/
  public ImportShortTermForecastRequest partialUploadIds(List<String> partialUploadIds) {
    this.partialUploadIds = partialUploadIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of partial uploads to include in this imported forecast.  Only relevant for large forecasts")
  @JsonProperty("partialUploadIds")
  public List<String> getPartialUploadIds() {
    return partialUploadIds;
  }
  public void setPartialUploadIds(List<String> partialUploadIds) {
    this.partialUploadIds = partialUploadIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportShortTermForecastRequest importShortTermForecastRequest = (ImportShortTermForecastRequest) o;
    return Objects.equals(this.fileName, importShortTermForecastRequest.fileName) &&
        Objects.equals(this.description, importShortTermForecastRequest.description) &&
        Objects.equals(this.routeGroupList, importShortTermForecastRequest.routeGroupList) &&
        Objects.equals(this.partialUploadIds, importShortTermForecastRequest.partialUploadIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, description, routeGroupList, partialUploadIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportShortTermForecastRequest {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    routeGroupList: ").append(toIndentedString(routeGroupList)).append("\n");
    sb.append("    partialUploadIds: ").append(toIndentedString(partialUploadIds)).append("\n");
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

