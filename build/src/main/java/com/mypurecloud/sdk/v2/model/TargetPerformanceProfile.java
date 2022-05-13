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

import java.io.Serializable;
/**
 * TargetPerformanceProfile
 */

public class TargetPerformanceProfile  implements Serializable {
  
  private String targetPerformanceProfileId = null;

  
  /**
   * The target destination performanceProfileId for the linked metric.
   **/
  public TargetPerformanceProfile targetPerformanceProfileId(String targetPerformanceProfileId) {
    this.targetPerformanceProfileId = targetPerformanceProfileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The target destination performanceProfileId for the linked metric.")
  @JsonProperty("targetPerformanceProfileId")
  public String getTargetPerformanceProfileId() {
    return targetPerformanceProfileId;
  }
  public void setTargetPerformanceProfileId(String targetPerformanceProfileId) {
    this.targetPerformanceProfileId = targetPerformanceProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetPerformanceProfile targetPerformanceProfile = (TargetPerformanceProfile) o;

    return Objects.equals(this.targetPerformanceProfileId, targetPerformanceProfile.targetPerformanceProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPerformanceProfileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetPerformanceProfile {\n");
    
    sb.append("    targetPerformanceProfileId: ").append(toIndentedString(targetPerformanceProfileId)).append("\n");
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

