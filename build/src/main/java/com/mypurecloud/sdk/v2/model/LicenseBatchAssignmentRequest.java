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
import com.mypurecloud.sdk.v2.model.LicenseAssignmentRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LicenseBatchAssignmentRequest
 */

public class LicenseBatchAssignmentRequest  implements Serializable {
  
  private List<LicenseAssignmentRequest> assignments = null;

  public LicenseBatchAssignmentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      assignments = new ArrayList<LicenseAssignmentRequest>();
    }
  }

  
  /**
   * The list of license assignment updates to make.
   **/
  public LicenseBatchAssignmentRequest assignments(List<LicenseAssignmentRequest> assignments) {
    this.assignments = assignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of license assignment updates to make.")
  @JsonProperty("assignments")
  public List<LicenseAssignmentRequest> getAssignments() {
    return assignments;
  }
  public void setAssignments(List<LicenseAssignmentRequest> assignments) {
    this.assignments = assignments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseBatchAssignmentRequest licenseBatchAssignmentRequest = (LicenseBatchAssignmentRequest) o;

    return Objects.equals(this.assignments, licenseBatchAssignmentRequest.assignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseBatchAssignmentRequest {\n");
    
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
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

