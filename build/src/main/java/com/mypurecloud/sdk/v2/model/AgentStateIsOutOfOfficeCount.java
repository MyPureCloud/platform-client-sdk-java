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
 * AgentStateIsOutOfOfficeCount
 */

public class AgentStateIsOutOfOfficeCount  implements Serializable {
  
  private Boolean isOutOfOffice = null;
  private Integer count = null;

  public AgentStateIsOutOfOfficeCount() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The out of office state
   **/
  public AgentStateIsOutOfOfficeCount isOutOfOffice(Boolean isOutOfOffice) {
    this.isOutOfOffice = isOutOfOffice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The out of office state")
  @JsonProperty("isOutOfOffice")
  public Boolean getIsOutOfOffice() {
    return isOutOfOffice;
  }
  public void setIsOutOfOffice(Boolean isOutOfOffice) {
    this.isOutOfOffice = isOutOfOffice;
  }


  /**
   * Count of users with this out of office state
   **/
  public AgentStateIsOutOfOfficeCount count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of users with this out of office state")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStateIsOutOfOfficeCount agentStateIsOutOfOfficeCount = (AgentStateIsOutOfOfficeCount) o;

    return Objects.equals(this.isOutOfOffice, agentStateIsOutOfOfficeCount.isOutOfOffice) &&
            Objects.equals(this.count, agentStateIsOutOfOfficeCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOutOfOffice, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStateIsOutOfOfficeCount {\n");
    
    sb.append("    isOutOfOffice: ").append(toIndentedString(isOutOfOffice)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

