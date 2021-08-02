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
 * ResultCounters
 */

public class ResultCounters  implements Serializable {
  
  private Integer success = null;
  private Integer failure = null;

  
  /**
   **/
  public ResultCounters success(Integer success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("success")
  public Integer getSuccess() {
    return success;
  }
  public void setSuccess(Integer success) {
    this.success = success;
  }

  
  /**
   **/
  public ResultCounters failure(Integer failure) {
    this.failure = failure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("failure")
  public Integer getFailure() {
    return failure;
  }
  public void setFailure(Integer failure) {
    this.failure = failure;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultCounters resultCounters = (ResultCounters) o;
    return Objects.equals(this.success, resultCounters.success) &&
        Objects.equals(this.failure, resultCounters.failure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, failure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultCounters {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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

