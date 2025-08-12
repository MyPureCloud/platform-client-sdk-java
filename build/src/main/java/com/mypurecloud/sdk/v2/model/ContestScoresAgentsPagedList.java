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
import com.mypurecloud.sdk.v2.model.ContestScoresAgents;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestScoresAgentsPagedList
 */

public class ContestScoresAgentsPagedList  implements Serializable {
  
  private List<ContestScoresAgents> entities = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long total = null;
  private LocalDate dateWorkday = null;
  private Integer pageCount = null;

  public ContestScoresAgentsPagedList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<ContestScoresAgents>();
    }
  }

  
  /**
   **/
  public ContestScoresAgentsPagedList entities(List<ContestScoresAgents> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ContestScoresAgents> getEntities() {
    return entities;
  }
  public void setEntities(List<ContestScoresAgents> entities) {
    this.entities = entities;
  }


  /**
   **/
  public ContestScoresAgentsPagedList pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   **/
  public ContestScoresAgentsPagedList pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   **/
  public ContestScoresAgentsPagedList total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }


  /**
   * Workday of the contest scores leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ContestScoresAgentsPagedList dateWorkday(LocalDate dateWorkday) {
    this.dateWorkday = dateWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "Fri Jan 12 01:00:00 CET 2024", value = "Workday of the contest scores leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateWorkday")
  public LocalDate getDateWorkday() {
    return dateWorkday;
  }
  public void setDateWorkday(LocalDate dateWorkday) {
    this.dateWorkday = dateWorkday;
  }


  /**
   **/
  public ContestScoresAgentsPagedList pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestScoresAgentsPagedList contestScoresAgentsPagedList = (ContestScoresAgentsPagedList) o;

    return Objects.equals(this.entities, contestScoresAgentsPagedList.entities) &&
            Objects.equals(this.pageSize, contestScoresAgentsPagedList.pageSize) &&
            Objects.equals(this.pageNumber, contestScoresAgentsPagedList.pageNumber) &&
            Objects.equals(this.total, contestScoresAgentsPagedList.total) &&
            Objects.equals(this.dateWorkday, contestScoresAgentsPagedList.dateWorkday) &&
            Objects.equals(this.pageCount, contestScoresAgentsPagedList.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, pageSize, pageNumber, total, dateWorkday, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestScoresAgentsPagedList {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    dateWorkday: ").append(toIndentedString(dateWorkday)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

