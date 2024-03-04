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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Used to set the log level of a particular flow
 */
@ApiModel(description = "Used to set the log level of a particular flow")

public class FlowLogLevelRequest  implements Serializable {
  
  private FlowLogLevel logLevelCharacteristics = null;

  
  /**
   * The log level characteristics currently set for this flow
   **/
  public FlowLogLevelRequest logLevelCharacteristics(FlowLogLevel logLevelCharacteristics) {
    this.logLevelCharacteristics = logLevelCharacteristics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The log level characteristics currently set for this flow")
  @JsonProperty("logLevelCharacteristics")
  public FlowLogLevel getLogLevelCharacteristics() {
    return logLevelCharacteristics;
  }
  public void setLogLevelCharacteristics(FlowLogLevel logLevelCharacteristics) {
    this.logLevelCharacteristics = logLevelCharacteristics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowLogLevelRequest flowLogLevelRequest = (FlowLogLevelRequest) o;

    return Objects.equals(this.logLevelCharacteristics, flowLogLevelRequest.logLevelCharacteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logLevelCharacteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowLogLevelRequest {\n");
    
    sb.append("    logLevelCharacteristics: ").append(toIndentedString(logLevelCharacteristics)).append("\n");
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

