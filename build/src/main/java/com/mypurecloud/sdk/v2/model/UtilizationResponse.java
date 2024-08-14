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
import com.mypurecloud.sdk.v2.model.LabelUtilizationResponse;
import com.mypurecloud.sdk.v2.model.MediaUtilization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UtilizationResponse
 */

public class UtilizationResponse  implements Serializable {
  
  private Map<String, MediaUtilization> utilization = null;
  private Map<String, LabelUtilizationResponse> labelUtilizations = null;

  
  /**
   * Map of media type to utilization settings.
   **/
  public UtilizationResponse utilization(Map<String, MediaUtilization> utilization) {
    this.utilization = utilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of media type to utilization settings.")
  @JsonProperty("utilization")
  public Map<String, MediaUtilization> getUtilization() {
    return utilization;
  }
  public void setUtilization(Map<String, MediaUtilization> utilization) {
    this.utilization = utilization;
  }


  /**
   * Map of label ids to utilization settings.
   **/
  public UtilizationResponse labelUtilizations(Map<String, LabelUtilizationResponse> labelUtilizations) {
    this.labelUtilizations = labelUtilizations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of label ids to utilization settings.")
  @JsonProperty("labelUtilizations")
  public Map<String, LabelUtilizationResponse> getLabelUtilizations() {
    return labelUtilizations;
  }
  public void setLabelUtilizations(Map<String, LabelUtilizationResponse> labelUtilizations) {
    this.labelUtilizations = labelUtilizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilizationResponse utilizationResponse = (UtilizationResponse) o;

    return Objects.equals(this.utilization, utilizationResponse.utilization) &&
            Objects.equals(this.labelUtilizations, utilizationResponse.labelUtilizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utilization, labelUtilizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilizationResponse {\n");
    
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
    sb.append("    labelUtilizations: ").append(toIndentedString(labelUtilizations)).append("\n");
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

