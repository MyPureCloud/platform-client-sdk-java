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
import com.mypurecloud.sdk.v2.model.FlowLogLevel;
import com.mypurecloud.sdk.v2.model.FlowLogLevelCharacteristicsDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A set of available characteristic definitions
 */
@ApiModel(description = "A set of available characteristic definitions")

public class FlowLogLevelCharacteristicsDefinitions  implements Serializable {
  
  private List<FlowLogLevel> logLevels = new ArrayList<FlowLogLevel>();
  private List<FlowLogLevelCharacteristicsDefinition> characteristics = new ArrayList<FlowLogLevelCharacteristicsDefinition>();

  
  @ApiModelProperty(example = "null", value = "A list of flow log levels available to the organization.")
  @JsonProperty("logLevels")
  public List<FlowLogLevel> getLogLevels() {
    return logLevels;
  }


  @ApiModelProperty(example = "null", value = "A list of characteristics that the loglevels will have that are available to the organization..")
  @JsonProperty("characteristics")
  public List<FlowLogLevelCharacteristicsDefinition> getCharacteristics() {
    return characteristics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowLogLevelCharacteristicsDefinitions flowLogLevelCharacteristicsDefinitions = (FlowLogLevelCharacteristicsDefinitions) o;

    return Objects.equals(this.logLevels, flowLogLevelCharacteristicsDefinitions.logLevels) &&
            Objects.equals(this.characteristics, flowLogLevelCharacteristicsDefinitions.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logLevels, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowLogLevelCharacteristicsDefinitions {\n");
    
    sb.append("    logLevels: ").append(toIndentedString(logLevels)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
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

