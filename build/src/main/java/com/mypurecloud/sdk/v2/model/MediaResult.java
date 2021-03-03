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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MediaResult
 */

public class MediaResult  implements Serializable {
  
  private String mediaUri = null;
  private List<Float> waveformData = new ArrayList<Float>();

  
  /**
   **/
  public MediaResult mediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaUri")
  public String getMediaUri() {
    return mediaUri;
  }
  public void setMediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
  }

  
  /**
   **/
  public MediaResult waveformData(List<Float> waveformData) {
    this.waveformData = waveformData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("waveformData")
  public List<Float> getWaveformData() {
    return waveformData;
  }
  public void setWaveformData(List<Float> waveformData) {
    this.waveformData = waveformData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaResult mediaResult = (MediaResult) o;
    return Objects.equals(this.mediaUri, mediaResult.mediaUri) &&
        Objects.equals(this.waveformData, mediaResult.waveformData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaUri, waveformData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaResult {\n");
    
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
    sb.append("    waveformData: ").append(toIndentedString(waveformData)).append("\n");
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

