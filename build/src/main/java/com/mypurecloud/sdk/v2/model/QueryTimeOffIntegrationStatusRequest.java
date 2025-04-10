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
import com.mypurecloud.sdk.v2.model.TimeOffRequestLookup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryTimeOffIntegrationStatusRequest
 */

public class QueryTimeOffIntegrationStatusRequest  implements Serializable {
  
  private List<TimeOffRequestLookup> timeOffRequestLookups = null;

  public QueryTimeOffIntegrationStatusRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      timeOffRequestLookups = new ArrayList<TimeOffRequestLookup>();
    }
  }

  
  /**
   * A list of time off request lookups
   **/
  public QueryTimeOffIntegrationStatusRequest timeOffRequestLookups(List<TimeOffRequestLookup> timeOffRequestLookups) {
    this.timeOffRequestLookups = timeOffRequestLookups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of time off request lookups")
  @JsonProperty("timeOffRequestLookups")
  public List<TimeOffRequestLookup> getTimeOffRequestLookups() {
    return timeOffRequestLookups;
  }
  public void setTimeOffRequestLookups(List<TimeOffRequestLookup> timeOffRequestLookups) {
    this.timeOffRequestLookups = timeOffRequestLookups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTimeOffIntegrationStatusRequest queryTimeOffIntegrationStatusRequest = (QueryTimeOffIntegrationStatusRequest) o;

    return Objects.equals(this.timeOffRequestLookups, queryTimeOffIntegrationStatusRequest.timeOffRequestLookups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequestLookups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTimeOffIntegrationStatusRequest {\n");
    
    sb.append("    timeOffRequestLookups: ").append(toIndentedString(timeOffRequestLookups)).append("\n");
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

