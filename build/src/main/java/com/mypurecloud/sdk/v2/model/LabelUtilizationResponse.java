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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * LabelUtilizationResponse
 */

public class LabelUtilizationResponse  implements Serializable {
  
  private Integer maximumCapacity = null;
  private List<String> interruptingLabelIds = new ArrayList<String>();
  private String labelName = null;

  
  /**
   * Defines the maximum number of interactions with this label that an agent can handle at one time.
   **/
  public LabelUtilizationResponse maximumCapacity(Integer maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the maximum number of interactions with this label that an agent can handle at one time.")
  @JsonProperty("maximumCapacity")
  public Integer getMaximumCapacity() {
    return maximumCapacity;
  }
  public void setMaximumCapacity(Integer maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
  }


  /**
   * Defines other labels that can interrupt an interaction with this label.
   **/
  public LabelUtilizationResponse interruptingLabelIds(List<String> interruptingLabelIds) {
    this.interruptingLabelIds = interruptingLabelIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines other labels that can interrupt an interaction with this label.")
  @JsonProperty("interruptingLabelIds")
  public List<String> getInterruptingLabelIds() {
    return interruptingLabelIds;
  }
  public void setInterruptingLabelIds(List<String> interruptingLabelIds) {
    this.interruptingLabelIds = interruptingLabelIds;
  }


  /**
   * Name of the label this utilization relates to.
   **/
  public LabelUtilizationResponse labelName(String labelName) {
    this.labelName = labelName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the label this utilization relates to.")
  @JsonProperty("labelName")
  public String getLabelName() {
    return labelName;
  }
  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelUtilizationResponse labelUtilizationResponse = (LabelUtilizationResponse) o;

    return Objects.equals(this.maximumCapacity, labelUtilizationResponse.maximumCapacity) &&
            Objects.equals(this.interruptingLabelIds, labelUtilizationResponse.interruptingLabelIds) &&
            Objects.equals(this.labelName, labelUtilizationResponse.labelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumCapacity, interruptingLabelIds, labelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelUtilizationResponse {\n");
    
    sb.append("    maximumCapacity: ").append(toIndentedString(maximumCapacity)).append("\n");
    sb.append("    interruptingLabelIds: ").append(toIndentedString(interruptingLabelIds)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
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

