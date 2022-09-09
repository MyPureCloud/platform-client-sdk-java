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
import com.mypurecloud.sdk.v2.model.ExternalMetricDataProcessedItem;
import com.mypurecloud.sdk.v2.model.ExternalMetricDataUnprocessedItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * External metric data write response
 */
@ApiModel(description = "External metric data write response")

public class ExternalMetricDataWriteResponse  implements Serializable {
  
  private List<ExternalMetricDataProcessedItem> processedEntities = new ArrayList<ExternalMetricDataProcessedItem>();
  private List<ExternalMetricDataUnprocessedItem> unprocessedEntities = new ArrayList<ExternalMetricDataUnprocessedItem>();

  
  /**
   * The list of processed entities
   **/
  public ExternalMetricDataWriteResponse processedEntities(List<ExternalMetricDataProcessedItem> processedEntities) {
    this.processedEntities = processedEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of processed entities")
  @JsonProperty("processedEntities")
  public List<ExternalMetricDataProcessedItem> getProcessedEntities() {
    return processedEntities;
  }
  public void setProcessedEntities(List<ExternalMetricDataProcessedItem> processedEntities) {
    this.processedEntities = processedEntities;
  }


  /**
   * The list of unprocessed entities
   **/
  public ExternalMetricDataWriteResponse unprocessedEntities(List<ExternalMetricDataUnprocessedItem> unprocessedEntities) {
    this.unprocessedEntities = unprocessedEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of unprocessed entities")
  @JsonProperty("unprocessedEntities")
  public List<ExternalMetricDataUnprocessedItem> getUnprocessedEntities() {
    return unprocessedEntities;
  }
  public void setUnprocessedEntities(List<ExternalMetricDataUnprocessedItem> unprocessedEntities) {
    this.unprocessedEntities = unprocessedEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalMetricDataWriteResponse externalMetricDataWriteResponse = (ExternalMetricDataWriteResponse) o;

    return Objects.equals(this.processedEntities, externalMetricDataWriteResponse.processedEntities) &&
            Objects.equals(this.unprocessedEntities, externalMetricDataWriteResponse.unprocessedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processedEntities, unprocessedEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalMetricDataWriteResponse {\n");
    
    sb.append("    processedEntities: ").append(toIndentedString(processedEntities)).append("\n");
    sb.append("    unprocessedEntities: ").append(toIndentedString(unprocessedEntities)).append("\n");
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

