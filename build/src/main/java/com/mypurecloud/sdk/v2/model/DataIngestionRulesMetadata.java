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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DataIngestionRulesMetadata
 */

public class DataIngestionRulesMetadata  implements Serializable {
  
  private Map<String, Integer> countByStatus = null;
  private String platform = null;
  private Integer totalCount = null;

  public DataIngestionRulesMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Count of data ingestion rules by status
   **/
  public DataIngestionRulesMetadata countByStatus(Map<String, Integer> countByStatus) {
    this.countByStatus = countByStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of data ingestion rules by status")
  @JsonProperty("countByStatus")
  public Map<String, Integer> getCountByStatus() {
    return countByStatus;
  }
  public void setCountByStatus(Map<String, Integer> countByStatus) {
    this.countByStatus = countByStatus;
  }


  /**
   * The platform for which the data ingestion rules are available
   **/
  public DataIngestionRulesMetadata platform(String platform) {
    this.platform = platform;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The platform for which the data ingestion rules are available")
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  /**
   * The total count of data ingestion rule
   **/
  public DataIngestionRulesMetadata totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total count of data ingestion rule")
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataIngestionRulesMetadata dataIngestionRulesMetadata = (DataIngestionRulesMetadata) o;

    return Objects.equals(this.countByStatus, dataIngestionRulesMetadata.countByStatus) &&
            Objects.equals(this.platform, dataIngestionRulesMetadata.platform) &&
            Objects.equals(this.totalCount, dataIngestionRulesMetadata.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countByStatus, platform, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataIngestionRulesMetadata {\n");
    
    sb.append("    countByStatus: ").append(toIndentedString(countByStatus)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

