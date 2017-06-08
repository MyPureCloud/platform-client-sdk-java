package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RecordingSettings
 */

public class RecordingSettings  implements Serializable {
  
  private Integer maxSimultaneousStreams = null;

  
  /**
   **/
  public RecordingSettings maxSimultaneousStreams(Integer maxSimultaneousStreams) {
    this.maxSimultaneousStreams = maxSimultaneousStreams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxSimultaneousStreams")
  public Integer getMaxSimultaneousStreams() {
    return maxSimultaneousStreams;
  }
  public void setMaxSimultaneousStreams(Integer maxSimultaneousStreams) {
    this.maxSimultaneousStreams = maxSimultaneousStreams;
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
    return Objects.equals(this.maxSimultaneousStreams, recordingSettings.maxSimultaneousStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSimultaneousStreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingSettings {\n");
    
    sb.append("    maxSimultaneousStreams: ").append(toIndentedString(maxSimultaneousStreams)).append("\n");
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

