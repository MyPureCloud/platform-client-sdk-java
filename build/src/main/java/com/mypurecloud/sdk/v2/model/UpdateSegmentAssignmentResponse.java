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
import com.mypurecloud.sdk.v2.model.UnprocessedSegmentAssignments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateSegmentAssignmentResponse
 */

public class UpdateSegmentAssignmentResponse  implements Serializable {
  
  private UnprocessedSegmentAssignments unprocessedItems = null;

  public UpdateSegmentAssignmentResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The segment assignments and unassignments which could not be processed.
   **/
  public UpdateSegmentAssignmentResponse unprocessedItems(UnprocessedSegmentAssignments unprocessedItems) {
    this.unprocessedItems = unprocessedItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The segment assignments and unassignments which could not be processed.")
  @JsonProperty("unprocessedItems")
  public UnprocessedSegmentAssignments getUnprocessedItems() {
    return unprocessedItems;
  }
  public void setUnprocessedItems(UnprocessedSegmentAssignments unprocessedItems) {
    this.unprocessedItems = unprocessedItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSegmentAssignmentResponse updateSegmentAssignmentResponse = (UpdateSegmentAssignmentResponse) o;

    return Objects.equals(this.unprocessedItems, updateSegmentAssignmentResponse.unprocessedItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unprocessedItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSegmentAssignmentResponse {\n");
    
    sb.append("    unprocessedItems: ").append(toIndentedString(unprocessedItems)).append("\n");
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

