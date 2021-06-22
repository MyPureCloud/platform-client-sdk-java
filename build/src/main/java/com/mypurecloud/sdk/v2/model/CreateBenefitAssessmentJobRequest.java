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
 * CreateBenefitAssessmentJobRequest
 */

public class CreateBenefitAssessmentJobRequest  implements Serializable {
  
  private List<String> divisionIds = new ArrayList<String>();

  
  /**
   * The list of division ids for routing queues that are to be assessed for Predictive Routing benefit.
   **/
  public CreateBenefitAssessmentJobRequest divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of division ids for routing queues that are to be assessed for Predictive Routing benefit.")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBenefitAssessmentJobRequest createBenefitAssessmentJobRequest = (CreateBenefitAssessmentJobRequest) o;
    return Objects.equals(this.divisionIds, createBenefitAssessmentJobRequest.divisionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(divisionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBenefitAssessmentJobRequest {\n");
    
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
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

