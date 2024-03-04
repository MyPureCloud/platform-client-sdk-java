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
  
  private List<FlowLogLevelCharacteristicsDefinition> characteristics = new ArrayList<FlowLogLevelCharacteristicsDefinition>();

  
  /**
   **/
  public FlowLogLevelCharacteristicsDefinitions characteristics(List<FlowLogLevelCharacteristicsDefinition> characteristics) {
    this.characteristics = characteristics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("characteristics")
  public List<FlowLogLevelCharacteristicsDefinition> getCharacteristics() {
    return characteristics;
  }
  public void setCharacteristics(List<FlowLogLevelCharacteristicsDefinition> characteristics) {
    this.characteristics = characteristics;
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

    return Objects.equals(this.characteristics, flowLogLevelCharacteristicsDefinitions.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowLogLevelCharacteristicsDefinitions {\n");
    
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

