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
import com.mypurecloud.sdk.v2.model.DecisionMetricsUploadData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DecisionMetricsUploadSchema
 */

public class DecisionMetricsUploadSchema  implements Serializable {
  
  private List<DecisionMetricsUploadData> userMetrics = null;

  public DecisionMetricsUploadSchema() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userMetrics = new ArrayList<DecisionMetricsUploadData>();
    }
  }

  public DecisionMetricsUploadSchema(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      userMetrics = new ArrayList<DecisionMetricsUploadData>();
    }
  }

  
  /**
   * Decision metrics to be uploaded
   **/
  public DecisionMetricsUploadSchema userMetrics(List<DecisionMetricsUploadData> userMetrics) {
    this.userMetrics = userMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Decision metrics to be uploaded")
  @JsonProperty("userMetrics")
  public List<DecisionMetricsUploadData> getUserMetrics() {
    return userMetrics;
  }
  public void setUserMetrics(List<DecisionMetricsUploadData> userMetrics) {
    this.userMetrics = userMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionMetricsUploadSchema decisionMetricsUploadSchema = (DecisionMetricsUploadSchema) o;

    return Objects.equals(this.userMetrics, decisionMetricsUploadSchema.userMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionMetricsUploadSchema {\n");
    
    sb.append("    userMetrics: ").append(toIndentedString(userMetrics)).append("\n");
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

