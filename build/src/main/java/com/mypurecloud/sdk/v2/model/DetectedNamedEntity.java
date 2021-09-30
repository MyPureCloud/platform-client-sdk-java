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
import com.mypurecloud.sdk.v2.model.DetectedNamedEntityValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DetectedNamedEntity
 */

public class DetectedNamedEntity  implements Serializable {
  
  private String name = null;
  private String entityType = null;
  private Double probability = null;
  private DetectedNamedEntityValue value = null;

  
  @ApiModelProperty(example = "null", value = "The name of the detected named entity.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "The type of the detected named entity.")
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }

  
  @ApiModelProperty(example = "null", value = "The probability of the detected named entity.")
  @JsonProperty("probability")
  public Double getProbability() {
    return probability;
  }

  
  @ApiModelProperty(example = "null", value = "The value of the detected named entity.")
  @JsonProperty("value")
  public DetectedNamedEntityValue getValue() {
    return value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedNamedEntity detectedNamedEntity = (DetectedNamedEntity) o;
    return Objects.equals(this.name, detectedNamedEntity.name) &&
        Objects.equals(this.entityType, detectedNamedEntity.entityType) &&
        Objects.equals(this.probability, detectedNamedEntity.probability) &&
        Objects.equals(this.value, detectedNamedEntity.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entityType, probability, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedNamedEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

