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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateBenefitAssessmentRequest
 */

public class CreateBenefitAssessmentRequest  implements Serializable {
  
  private List<String> queueIds = new ArrayList<String>();

  
  /**
   * The list of queue ids that are to be assessed for Predictive Routing benefit.
   **/
  public CreateBenefitAssessmentRequest queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of queue ids that are to be assessed for Predictive Routing benefit.")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBenefitAssessmentRequest createBenefitAssessmentRequest = (CreateBenefitAssessmentRequest) o;
    return Objects.equals(this.queueIds, createBenefitAssessmentRequest.queueIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBenefitAssessmentRequest {\n");
    
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
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

