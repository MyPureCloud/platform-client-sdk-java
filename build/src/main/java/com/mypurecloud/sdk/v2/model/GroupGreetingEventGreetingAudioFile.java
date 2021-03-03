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
 * GroupGreetingEventGreetingAudioFile
 */

public class GroupGreetingEventGreetingAudioFile  implements Serializable {
  
  private Integer durationMilliseconds = null;
  private Integer sizeBytes = null;

  
  /**
   **/
  public GroupGreetingEventGreetingAudioFile durationMilliseconds(Integer durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMilliseconds")
  public Integer getDurationMilliseconds() {
    return durationMilliseconds;
  }
  public void setDurationMilliseconds(Integer durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
  }

  
  /**
   **/
  public GroupGreetingEventGreetingAudioFile sizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sizeBytes")
  public Integer getSizeBytes() {
    return sizeBytes;
  }
  public void setSizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupGreetingEventGreetingAudioFile groupGreetingEventGreetingAudioFile = (GroupGreetingEventGreetingAudioFile) o;
    return Objects.equals(this.durationMilliseconds, groupGreetingEventGreetingAudioFile.durationMilliseconds) &&
        Objects.equals(this.sizeBytes, groupGreetingEventGreetingAudioFile.sizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMilliseconds, sizeBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupGreetingEventGreetingAudioFile {\n");
    
    sb.append("    durationMilliseconds: ").append(toIndentedString(durationMilliseconds)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
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

