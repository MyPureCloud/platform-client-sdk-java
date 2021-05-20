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
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateQueryResponseGroupedData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LearningAssignmentAggregateResponse
 */

public class LearningAssignmentAggregateResponse  implements Serializable {
  
  private List<LearningAssignmentAggregateQueryResponseGroupedData> results = new ArrayList<LearningAssignmentAggregateQueryResponseGroupedData>();

  
  /**
   * The results of the query
   **/
  public LearningAssignmentAggregateResponse results(List<LearningAssignmentAggregateQueryResponseGroupedData> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The results of the query")
  @JsonProperty("results")
  public List<LearningAssignmentAggregateQueryResponseGroupedData> getResults() {
    return results;
  }
  public void setResults(List<LearningAssignmentAggregateQueryResponseGroupedData> results) {
    this.results = results;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentAggregateResponse learningAssignmentAggregateResponse = (LearningAssignmentAggregateResponse) o;
    return Objects.equals(this.results, learningAssignmentAggregateResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentAggregateResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

