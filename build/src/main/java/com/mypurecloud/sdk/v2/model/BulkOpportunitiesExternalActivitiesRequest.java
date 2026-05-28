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
 * BulkOpportunitiesExternalActivitiesRequest
 */

public class BulkOpportunitiesExternalActivitiesRequest  implements Serializable {
  
  private List<String> ids = null;

  public BulkOpportunitiesExternalActivitiesRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      ids = new ArrayList<String>();
    }
  }

  public BulkOpportunitiesExternalActivitiesRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      ids = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of the external activities
   **/
  public BulkOpportunitiesExternalActivitiesRequest ids(List<String> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the external activities")
  @JsonProperty("ids")
  public List<String> getIds() {
    return ids;
  }
  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOpportunitiesExternalActivitiesRequest bulkOpportunitiesExternalActivitiesRequest = (BulkOpportunitiesExternalActivitiesRequest) o;

    return Objects.equals(this.ids, bulkOpportunitiesExternalActivitiesRequest.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOpportunitiesExternalActivitiesRequest {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

