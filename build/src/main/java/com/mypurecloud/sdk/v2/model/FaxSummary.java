package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FaxSummary
 */

public class FaxSummary  implements Serializable {
  
  private Integer readCount = null;
  private Integer unreadCount = null;
  private Integer totalCount = null;

  
  /**
   **/
  public FaxSummary readCount(Integer readCount) {
    this.readCount = readCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("readCount")
  public Integer getReadCount() {
    return readCount;
  }
  public void setReadCount(Integer readCount) {
    this.readCount = readCount;
  }

  
  /**
   **/
  public FaxSummary unreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unreadCount")
  public Integer getUnreadCount() {
    return unreadCount;
  }
  public void setUnreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
  }

  
  /**
   **/
  public FaxSummary totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    FaxSummary faxSummary = (FaxSummary) o;
    return Objects.equals(this.readCount, faxSummary.readCount) &&
        Objects.equals(this.unreadCount, faxSummary.unreadCount) &&
        Objects.equals(this.totalCount, faxSummary.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readCount, unreadCount, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxSummary {\n");
    
    sb.append("    readCount: ").append(toIndentedString(readCount)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
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

