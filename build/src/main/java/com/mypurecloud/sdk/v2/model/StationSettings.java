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
import com.mypurecloud.sdk.v2.model.FreeSeatingConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Organization settings for stations
 */
@ApiModel(description = "Organization settings for stations")

public class StationSettings  implements Serializable {
  
  private FreeSeatingConfiguration freeSeatingConfiguration = null;

  
  /**
   * Configuration options for free-seating
   **/
  public StationSettings freeSeatingConfiguration(FreeSeatingConfiguration freeSeatingConfiguration) {
    this.freeSeatingConfiguration = freeSeatingConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration options for free-seating")
  @JsonProperty("freeSeatingConfiguration")
  public FreeSeatingConfiguration getFreeSeatingConfiguration() {
    return freeSeatingConfiguration;
  }
  public void setFreeSeatingConfiguration(FreeSeatingConfiguration freeSeatingConfiguration) {
    this.freeSeatingConfiguration = freeSeatingConfiguration;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StationSettings stationSettings = (StationSettings) o;
    return Objects.equals(this.freeSeatingConfiguration, stationSettings.freeSeatingConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeSeatingConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StationSettings {\n");
    
    sb.append("    freeSeatingConfiguration: ").append(toIndentedString(freeSeatingConfiguration)).append("\n");
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

