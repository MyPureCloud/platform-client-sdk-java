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
import com.mypurecloud.sdk.v2.model.ReportingTurnIntentSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReportingTurnIntent
 */

public class ReportingTurnIntent  implements Serializable {
  
  private String name = null;
  private Double confidence = null;
  private List<ReportingTurnIntentSlot> slots = new ArrayList<ReportingTurnIntentSlot>();

  
  /**
   * The name of the intent detected during this reporting turn.
   **/
  public ReportingTurnIntent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the intent detected during this reporting turn.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The confidence score of the intent detected during this reporting turn.
   **/
  public ReportingTurnIntent confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence score of the intent detected during this reporting turn.")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  
  /**
   * The slots detected during this reporting turn.
   **/
  public ReportingTurnIntent slots(List<ReportingTurnIntentSlot> slots) {
    this.slots = slots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The slots detected during this reporting turn.")
  @JsonProperty("slots")
  public List<ReportingTurnIntentSlot> getSlots() {
    return slots;
  }
  public void setSlots(List<ReportingTurnIntentSlot> slots) {
    this.slots = slots;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnIntent reportingTurnIntent = (ReportingTurnIntent) o;
    return Objects.equals(this.name, reportingTurnIntent.name) &&
        Objects.equals(this.confidence, reportingTurnIntent.confidence) &&
        Objects.equals(this.slots, reportingTurnIntent.slots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, confidence, slots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnIntent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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

