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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CurrentUserTimeOffIntegrationStatusRequest
 */

public class CurrentUserTimeOffIntegrationStatusRequest  implements Serializable {
  
  private List<String> timeOffRequestIds = null;

  public CurrentUserTimeOffIntegrationStatusRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      timeOffRequestIds = new ArrayList<String>();
    }
  }

  
  /**
   * A list of time off request IDs
   **/
  public CurrentUserTimeOffIntegrationStatusRequest timeOffRequestIds(List<String> timeOffRequestIds) {
    this.timeOffRequestIds = timeOffRequestIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of time off request IDs")
  @JsonProperty("timeOffRequestIds")
  public List<String> getTimeOffRequestIds() {
    return timeOffRequestIds;
  }
  public void setTimeOffRequestIds(List<String> timeOffRequestIds) {
    this.timeOffRequestIds = timeOffRequestIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserTimeOffIntegrationStatusRequest currentUserTimeOffIntegrationStatusRequest = (CurrentUserTimeOffIntegrationStatusRequest) o;

    return Objects.equals(this.timeOffRequestIds, currentUserTimeOffIntegrationStatusRequest.timeOffRequestIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequestIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserTimeOffIntegrationStatusRequest {\n");
    
    sb.append("    timeOffRequestIds: ").append(toIndentedString(timeOffRequestIds)).append("\n");
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

