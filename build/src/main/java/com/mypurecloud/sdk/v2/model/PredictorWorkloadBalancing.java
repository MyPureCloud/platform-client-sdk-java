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
 * PredictorWorkloadBalancing
 */

public class PredictorWorkloadBalancing  implements Serializable {
  
  private Boolean enabled = null;
  private Integer minimumOccupancy = null;
  private Integer maximumOccupancy = null;

  public PredictorWorkloadBalancing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Flag to activate and deactivate workload balancing.
   **/
  public PredictorWorkloadBalancing enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Flag to activate and deactivate workload balancing.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Desired minimum occupancy threshold of agents. Must be between 0 and 100.
   **/
  public PredictorWorkloadBalancing minimumOccupancy(Integer minimumOccupancy) {
    this.minimumOccupancy = minimumOccupancy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Desired minimum occupancy threshold of agents. Must be between 0 and 100.")
  @JsonProperty("minimumOccupancy")
  public Integer getMinimumOccupancy() {
    return minimumOccupancy;
  }
  public void setMinimumOccupancy(Integer minimumOccupancy) {
    this.minimumOccupancy = minimumOccupancy;
  }


  /**
   * Desired maximum occupancy threshold of agents. Must be between 0 and 100.
   **/
  public PredictorWorkloadBalancing maximumOccupancy(Integer maximumOccupancy) {
    this.maximumOccupancy = maximumOccupancy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Desired maximum occupancy threshold of agents. Must be between 0 and 100.")
  @JsonProperty("maximumOccupancy")
  public Integer getMaximumOccupancy() {
    return maximumOccupancy;
  }
  public void setMaximumOccupancy(Integer maximumOccupancy) {
    this.maximumOccupancy = maximumOccupancy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictorWorkloadBalancing predictorWorkloadBalancing = (PredictorWorkloadBalancing) o;

    return Objects.equals(this.enabled, predictorWorkloadBalancing.enabled) &&
            Objects.equals(this.minimumOccupancy, predictorWorkloadBalancing.minimumOccupancy) &&
            Objects.equals(this.maximumOccupancy, predictorWorkloadBalancing.maximumOccupancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, minimumOccupancy, maximumOccupancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictorWorkloadBalancing {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    minimumOccupancy: ").append(toIndentedString(minimumOccupancy)).append("\n");
    sb.append("    maximumOccupancy: ").append(toIndentedString(maximumOccupancy)).append("\n");
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

