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
 * DialerSequenceScheduleConfigChangeScheduleInterval
 */

public class DialerSequenceScheduleConfigChangeScheduleInterval  implements Serializable {
  
  private String start = null;
  private String end = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerSequenceScheduleConfigChangeScheduleInterval start(String start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("start")
  public String getStart() {
    return start;
  }
  public void setStart(String start) {
    this.start = start;
  }

  
  /**
   **/
  public DialerSequenceScheduleConfigChangeScheduleInterval end(String end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }

  
  /**
   **/
  public DialerSequenceScheduleConfigChangeScheduleInterval additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerSequenceScheduleConfigChangeScheduleInterval dialerSequenceScheduleConfigChangeScheduleInterval = (DialerSequenceScheduleConfigChangeScheduleInterval) o;
    return Objects.equals(this.start, dialerSequenceScheduleConfigChangeScheduleInterval.start) &&
        Objects.equals(this.end, dialerSequenceScheduleConfigChangeScheduleInterval.end) &&
        Objects.equals(this.additionalProperties, dialerSequenceScheduleConfigChangeScheduleInterval.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerSequenceScheduleConfigChangeScheduleInterval {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

