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
import com.mypurecloud.sdk.v2.model.DetectedNamedEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DetectedIntent
 */

public class DetectedIntent  implements Serializable {
  
  private String name = null;
  private Double probability = null;
  private List<DetectedNamedEntity> entities = new ArrayList<DetectedNamedEntity>();

  
  @ApiModelProperty(example = "null", value = "The name of the detected intent.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "The probability of the detected intent.")
  @JsonProperty("probability")
  public Double getProbability() {
    return probability;
  }

  
  @ApiModelProperty(example = "null", value = "The collection of named entities detected.")
  @JsonProperty("entities")
  public List<DetectedNamedEntity> getEntities() {
    return entities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedIntent detectedIntent = (DetectedIntent) o;
    return Objects.equals(this.name, detectedIntent.name) &&
        Objects.equals(this.probability, detectedIntent.probability) &&
        Objects.equals(this.entities, detectedIntent.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, probability, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedIntent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

