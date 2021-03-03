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
 * DetectedNamedEntityValue
 */

public class DetectedNamedEntityValue  implements Serializable {
  
  private String raw = null;
  private String resolved = null;

  
  @ApiModelProperty(example = "null", value = "The raw value of the detected named entity.")
  @JsonProperty("raw")
  public String getRaw() {
    return raw;
  }

  
  @ApiModelProperty(example = "null", value = "The resolved value of the detected named entity.")
  @JsonProperty("resolved")
  public String getResolved() {
    return resolved;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedNamedEntityValue detectedNamedEntityValue = (DetectedNamedEntityValue) o;
    return Objects.equals(this.raw, detectedNamedEntityValue.raw) &&
        Objects.equals(this.resolved, detectedNamedEntityValue.resolved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw, resolved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedNamedEntityValue {\n");
    
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
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

