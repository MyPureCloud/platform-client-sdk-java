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
import com.mypurecloud.sdk.v2.model.TaskManagementObservationPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TaskManagementObservationQueryFilter
 */

public class TaskManagementObservationQueryFilter  implements Serializable {
  
  private List<TaskManagementObservationPredicate> predicates = null;

  public TaskManagementObservationQueryFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      predicates = new ArrayList<TaskManagementObservationPredicate>();
    }
  }

  
  /**
   * List of predicates that define the filter conditions. Each predicate specifies a dimension and value to filter by. A single queueId predicate is always required.
   **/
  public TaskManagementObservationQueryFilter predicates(List<TaskManagementObservationPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of predicates that define the filter conditions. Each predicate specifies a dimension and value to filter by. A single queueId predicate is always required.")
  @JsonProperty("predicates")
  public List<TaskManagementObservationPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<TaskManagementObservationPredicate> predicates) {
    this.predicates = predicates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskManagementObservationQueryFilter taskManagementObservationQueryFilter = (TaskManagementObservationQueryFilter) o;

    return Objects.equals(this.predicates, taskManagementObservationQueryFilter.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskManagementObservationQueryFilter {\n");
    
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

