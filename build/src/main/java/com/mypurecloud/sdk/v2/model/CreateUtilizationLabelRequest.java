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
import com.mypurecloud.sdk.v2.model.LabelUtilizationRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateUtilizationLabelRequest
 */

public class CreateUtilizationLabelRequest  implements Serializable {
  
  private String name = null;
  private LabelUtilizationRequest utilization = null;

  
  /**
   * The utilization label name.
   **/
  public CreateUtilizationLabelRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The utilization label name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Org level utilization settings for the new label. If not specified, default utilization settings will be applied.
   **/
  public CreateUtilizationLabelRequest utilization(LabelUtilizationRequest utilization) {
    this.utilization = utilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Org level utilization settings for the new label. If not specified, default utilization settings will be applied.")
  @JsonProperty("utilization")
  public LabelUtilizationRequest getUtilization() {
    return utilization;
  }
  public void setUtilization(LabelUtilizationRequest utilization) {
    this.utilization = utilization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUtilizationLabelRequest createUtilizationLabelRequest = (CreateUtilizationLabelRequest) o;

    return Objects.equals(this.name, createUtilizationLabelRequest.name) &&
            Objects.equals(this.utilization, createUtilizationLabelRequest.utilization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, utilization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUtilizationLabelRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
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

