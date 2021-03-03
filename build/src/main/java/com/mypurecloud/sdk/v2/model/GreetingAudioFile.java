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
 * GreetingAudioFile
 */

public class GreetingAudioFile  implements Serializable {
  
  private Long durationMilliseconds = null;
  private Long sizeBytes = null;
  private String selfUri = null;

  
  /**
   **/
  public GreetingAudioFile durationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMilliseconds")
  public Long getDurationMilliseconds() {
    return durationMilliseconds;
  }
  public void setDurationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
  }

  
  /**
   **/
  public GreetingAudioFile sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sizeBytes")
  public Long getSizeBytes() {
    return sizeBytes;
  }
  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  
  /**
   **/
  public GreetingAudioFile selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GreetingAudioFile greetingAudioFile = (GreetingAudioFile) o;
    return Objects.equals(this.durationMilliseconds, greetingAudioFile.durationMilliseconds) &&
        Objects.equals(this.sizeBytes, greetingAudioFile.sizeBytes) &&
        Objects.equals(this.selfUri, greetingAudioFile.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMilliseconds, sizeBytes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GreetingAudioFile {\n");
    
    sb.append("    durationMilliseconds: ").append(toIndentedString(durationMilliseconds)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

