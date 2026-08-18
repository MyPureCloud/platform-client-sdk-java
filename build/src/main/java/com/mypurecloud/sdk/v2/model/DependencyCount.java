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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * An estimated count of entities that depend on this entity, including indirect dependencies.
 */
@ApiModel(description = "An estimated count of entities that depend on this entity, including indirect dependencies.")

public class DependencyCount  implements Serializable {
  
  private Integer estimatedCount = null;

  public DependencyCount() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DependencyCount(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Number of dependents.")
  @JsonProperty("estimatedCount")
  public Integer getEstimatedCount() {
    return estimatedCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyCount dependencyCount = (DependencyCount) o;

    return Objects.equals(this.estimatedCount, dependencyCount.estimatedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyCount {\n");
    
    sb.append("    estimatedCount: ").append(toIndentedString(estimatedCount)).append("\n");
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

