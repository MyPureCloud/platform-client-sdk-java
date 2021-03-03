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
import com.mypurecloud.sdk.v2.model.NluQualityReportSummaryMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NluQualityReportSummary
 */

public class NluQualityReportSummary  implements Serializable {
  
  private List<NluQualityReportSummaryMetric> metrics = new ArrayList<NluQualityReportSummaryMetric>();

  
  /**
   * The list of metrics in the summary
   **/
  public NluQualityReportSummary metrics(List<NluQualityReportSummaryMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of metrics in the summary")
  @JsonProperty("metrics")
  public List<NluQualityReportSummaryMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<NluQualityReportSummaryMetric> metrics) {
    this.metrics = metrics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluQualityReportSummary nluQualityReportSummary = (NluQualityReportSummary) o;
    return Objects.equals(this.metrics, nluQualityReportSummary.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluQualityReportSummary {\n");
    
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

