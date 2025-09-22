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

import java.io.Serializable;
/**
 * IgnoreTopicsResponse
 */

public class IgnoreTopicsResponse  implements Serializable {
  
  private Integer totalTopics = null;
  private Integer addedTopics = null;
  private Integer updatedTopics = null;

  public IgnoreTopicsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Total number of topics in current org
   **/
  public IgnoreTopicsResponse totalTopics(Integer totalTopics) {
    this.totalTopics = totalTopics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of topics in current org")
  @JsonProperty("totalTopics")
  public Integer getTotalTopics() {
    return totalTopics;
  }
  public void setTotalTopics(Integer totalTopics) {
    this.totalTopics = totalTopics;
  }


  /**
   * Number of topics added in current request
   **/
  public IgnoreTopicsResponse addedTopics(Integer addedTopics) {
    this.addedTopics = addedTopics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of topics added in current request")
  @JsonProperty("addedTopics")
  public Integer getAddedTopics() {
    return addedTopics;
  }
  public void setAddedTopics(Integer addedTopics) {
    this.addedTopics = addedTopics;
  }


  /**
   * Number of topics updated in current request
   **/
  public IgnoreTopicsResponse updatedTopics(Integer updatedTopics) {
    this.updatedTopics = updatedTopics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of topics updated in current request")
  @JsonProperty("updatedTopics")
  public Integer getUpdatedTopics() {
    return updatedTopics;
  }
  public void setUpdatedTopics(Integer updatedTopics) {
    this.updatedTopics = updatedTopics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IgnoreTopicsResponse ignoreTopicsResponse = (IgnoreTopicsResponse) o;

    return Objects.equals(this.totalTopics, ignoreTopicsResponse.totalTopics) &&
            Objects.equals(this.addedTopics, ignoreTopicsResponse.addedTopics) &&
            Objects.equals(this.updatedTopics, ignoreTopicsResponse.updatedTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTopics, addedTopics, updatedTopics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IgnoreTopicsResponse {\n");
    
    sb.append("    totalTopics: ").append(toIndentedString(totalTopics)).append("\n");
    sb.append("    addedTopics: ").append(toIndentedString(addedTopics)).append("\n");
    sb.append("    updatedTopics: ").append(toIndentedString(updatedTopics)).append("\n");
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

