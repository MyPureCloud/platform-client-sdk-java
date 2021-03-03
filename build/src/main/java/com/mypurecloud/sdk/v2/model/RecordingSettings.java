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
 * RecordingSettings
 */

public class RecordingSettings  implements Serializable {
  
  private Integer maxSimultaneousStreams = null;
  private Integer maxConfigurableScreenRecordingStreams = null;

  
  /**
   * Maximum number of simultaneous screen recording streams
   **/
  public RecordingSettings maxSimultaneousStreams(Integer maxSimultaneousStreams) {
    this.maxSimultaneousStreams = maxSimultaneousStreams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum number of simultaneous screen recording streams")
  @JsonProperty("maxSimultaneousStreams")
  public Integer getMaxSimultaneousStreams() {
    return maxSimultaneousStreams;
  }
  public void setMaxSimultaneousStreams(Integer maxSimultaneousStreams) {
    this.maxSimultaneousStreams = maxSimultaneousStreams;
  }

  
  /**
   * Upper limit that maxSimultaneousStreams can be configured
   **/
  public RecordingSettings maxConfigurableScreenRecordingStreams(Integer maxConfigurableScreenRecordingStreams) {
    this.maxConfigurableScreenRecordingStreams = maxConfigurableScreenRecordingStreams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Upper limit that maxSimultaneousStreams can be configured")
  @JsonProperty("maxConfigurableScreenRecordingStreams")
  public Integer getMaxConfigurableScreenRecordingStreams() {
    return maxConfigurableScreenRecordingStreams;
  }
  public void setMaxConfigurableScreenRecordingStreams(Integer maxConfigurableScreenRecordingStreams) {
    this.maxConfigurableScreenRecordingStreams = maxConfigurableScreenRecordingStreams;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingSettings recordingSettings = (RecordingSettings) o;
    return Objects.equals(this.maxSimultaneousStreams, recordingSettings.maxSimultaneousStreams) &&
        Objects.equals(this.maxConfigurableScreenRecordingStreams, recordingSettings.maxConfigurableScreenRecordingStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSimultaneousStreams, maxConfigurableScreenRecordingStreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingSettings {\n");
    
    sb.append("    maxSimultaneousStreams: ").append(toIndentedString(maxSimultaneousStreams)).append("\n");
    sb.append("    maxConfigurableScreenRecordingStreams: ").append(toIndentedString(maxConfigurableScreenRecordingStreams)).append("\n");
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

