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
 * WorkspaceSummary
 */

public class WorkspaceSummary  implements Serializable {
  
  private Long totalDocumentCount = null;
  private Long totalDocumentByteCount = null;

  
  /**
   **/
  public WorkspaceSummary totalDocumentCount(Long totalDocumentCount) {
    this.totalDocumentCount = totalDocumentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalDocumentCount")
  public Long getTotalDocumentCount() {
    return totalDocumentCount;
  }
  public void setTotalDocumentCount(Long totalDocumentCount) {
    this.totalDocumentCount = totalDocumentCount;
  }

  
  /**
   **/
  public WorkspaceSummary totalDocumentByteCount(Long totalDocumentByteCount) {
    this.totalDocumentByteCount = totalDocumentByteCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalDocumentByteCount")
  public Long getTotalDocumentByteCount() {
    return totalDocumentByteCount;
  }
  public void setTotalDocumentByteCount(Long totalDocumentByteCount) {
    this.totalDocumentByteCount = totalDocumentByteCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSummary workspaceSummary = (WorkspaceSummary) o;
    return Objects.equals(this.totalDocumentCount, workspaceSummary.totalDocumentCount) &&
        Objects.equals(this.totalDocumentByteCount, workspaceSummary.totalDocumentByteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalDocumentCount, totalDocumentByteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSummary {\n");
    
    sb.append("    totalDocumentCount: ").append(toIndentedString(totalDocumentCount)).append("\n");
    sb.append("    totalDocumentByteCount: ").append(toIndentedString(totalDocumentByteCount)).append("\n");
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

