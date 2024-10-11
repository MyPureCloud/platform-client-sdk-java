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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UpdateMuAgentWorkPlanFailureResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateMuAgentWorkPlansBatchResponse
 */

public class UpdateMuAgentWorkPlansBatchResponse  implements Serializable {
  
  private List<UpdateMuAgentWorkPlanFailureResponse> failures = new ArrayList<UpdateMuAgentWorkPlanFailureResponse>();

  
  /**
   * The work plan update failures
   **/
  public UpdateMuAgentWorkPlansBatchResponse failures(List<UpdateMuAgentWorkPlanFailureResponse> failures) {
    this.failures = failures;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The work plan update failures")
  @JsonProperty("failures")
  public List<UpdateMuAgentWorkPlanFailureResponse> getFailures() {
    return failures;
  }
  public void setFailures(List<UpdateMuAgentWorkPlanFailureResponse> failures) {
    this.failures = failures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMuAgentWorkPlansBatchResponse updateMuAgentWorkPlansBatchResponse = (UpdateMuAgentWorkPlansBatchResponse) o;

    return Objects.equals(this.failures, updateMuAgentWorkPlansBatchResponse.failures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMuAgentWorkPlansBatchResponse {\n");
    
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
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

