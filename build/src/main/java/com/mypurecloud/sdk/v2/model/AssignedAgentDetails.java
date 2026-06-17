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
import java.time.LocalDate;

import java.io.Serializable;
/**
 * AssignedAgentDetails
 */

public class AssignedAgentDetails  implements Serializable {
  
  private String id = null;
  private LocalDate endDate = null;

  public AssignedAgentDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AssignedAgentDetails(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the agent
   **/
  public AssignedAgentDetails id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the agent")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The end date of this schedule set for the agent, relative to the business unit time zone in yyyy-MM-dd format. Null denotes an ongoing schedule set. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AssignedAgentDetails endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date of this schedule set for the agent, relative to the business unit time zone in yyyy-MM-dd format. Null denotes an ongoing schedule set. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignedAgentDetails assignedAgentDetails = (AssignedAgentDetails) o;

    return Objects.equals(this.id, assignedAgentDetails.id) &&
            Objects.equals(this.endDate, assignedAgentDetails.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignedAgentDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

