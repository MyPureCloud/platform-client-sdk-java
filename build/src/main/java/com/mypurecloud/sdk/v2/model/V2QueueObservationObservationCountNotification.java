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
import com.mypurecloud.sdk.v2.model.V2QueueObservationMetricCountGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2QueueObservationObservationCountNotification
 */

public class V2QueueObservationObservationCountNotification  implements Serializable {
  
  private List<V2QueueObservationMetricCountGroup> results = null;

  public V2QueueObservationObservationCountNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<V2QueueObservationMetricCountGroup>();
    }
  }

  
  /**
   * List of observations by grouping.
   **/
  public V2QueueObservationObservationCountNotification results(List<V2QueueObservationMetricCountGroup> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of observations by grouping.")
  @JsonProperty("results")
  public List<V2QueueObservationMetricCountGroup> getResults() {
    return results;
  }
  public void setResults(List<V2QueueObservationMetricCountGroup> results) {
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
    V2QueueObservationObservationCountNotification v2QueueObservationObservationCountNotification = (V2QueueObservationObservationCountNotification) o;

    return Objects.equals(this.results, v2QueueObservationObservationCountNotification.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2QueueObservationObservationCountNotification {\n");
    
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

