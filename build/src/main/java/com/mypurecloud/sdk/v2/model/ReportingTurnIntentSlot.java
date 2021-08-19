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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReportingTurnIntentSlot
 */

public class ReportingTurnIntentSlot  implements Serializable {
  
  private String name = null;
  private String value = null;
  private String type = null;
  private Double confidence = null;

  
  /**
   * The name of the slot.
   **/
  public ReportingTurnIntentSlot name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the slot.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The value of the slot.
   **/
  public ReportingTurnIntentSlot value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the slot.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * The NLU entity type of the slot (either builtin or user defined)
   **/
  public ReportingTurnIntentSlot type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The NLU entity type of the slot (either builtin or user defined)")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * The confidence score this slot received during detection.
   **/
  public ReportingTurnIntentSlot confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence score this slot received during detection.")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnIntentSlot reportingTurnIntentSlot = (ReportingTurnIntentSlot) o;
    return Objects.equals(this.name, reportingTurnIntentSlot.name) &&
        Objects.equals(this.value, reportingTurnIntentSlot.value) &&
        Objects.equals(this.type, reportingTurnIntentSlot.type) &&
        Objects.equals(this.confidence, reportingTurnIntentSlot.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, type, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnIntentSlot {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

