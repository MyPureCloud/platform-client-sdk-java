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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DashboardConfigurationQueryRequest
 */

public class DashboardConfigurationQueryRequest  implements Serializable {
  
  private List<String> dashboardConfigurationIds = new ArrayList<String>();
  private Integer pageNumber = null;
  private Integer pageSize = null;

  private static class SortByEnumDeserializer extends StdDeserializer<SortByEnum> {
    public SortByEnumDeserializer() {
      super(SortByEnumDeserializer.class);
    }

    @Override
    public SortByEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortByEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The order in which response will be sorted
   */
 @JsonDeserialize(using = SortByEnumDeserializer.class)
  public enum SortByEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("Asc"),
    DESC("Desc");

    private String value;

    SortByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortByEnum fromString(String key) {
      if (key == null) return null;

      for (SortByEnum value : SortByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortByEnum sortBy = null;

  
  /**
   * The user supplied dashboard configuration ids
   **/
  public DashboardConfigurationQueryRequest dashboardConfigurationIds(List<String> dashboardConfigurationIds) {
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


  /**
   * The page number of the queried response
   **/
  public DashboardConfigurationQueryRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The page number of the queried response")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * The number of entities to return of the queried response. The max is 25
   **/
  public DashboardConfigurationQueryRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of entities to return of the queried response. The max is 25")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * The order in which response will be sorted
   **/
  public DashboardConfigurationQueryRequest sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which response will be sorted")
  @JsonProperty("sortBy")
  public SortByEnum getSortBy() {
    return sortBy;
  }
  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardConfigurationQueryRequest dashboardConfigurationQueryRequest = (DashboardConfigurationQueryRequest) o;

    return Objects.equals(this.dashboardConfigurationIds, dashboardConfigurationQueryRequest.dashboardConfigurationIds) &&
            Objects.equals(this.pageNumber, dashboardConfigurationQueryRequest.pageNumber) &&
            Objects.equals(this.pageSize, dashboardConfigurationQueryRequest.pageSize) &&
            Objects.equals(this.sortBy, dashboardConfigurationQueryRequest.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardConfigurationIds, pageNumber, pageSize, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardConfigurationQueryRequest {\n");
    
    sb.append("    dashboardConfigurationIds: ").append(toIndentedString(dashboardConfigurationIds)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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

