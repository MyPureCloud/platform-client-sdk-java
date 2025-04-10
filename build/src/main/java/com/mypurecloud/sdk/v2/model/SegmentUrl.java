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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SegmentUrl
 */

public class SegmentUrl  implements Serializable {
  
  private AddressableEntityRef recording = null;
  private String url = null;

  public SegmentUrl() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Recording Reference
   **/
  public SegmentUrl recording(AddressableEntityRef recording) {
    this.recording = recording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Recording Reference")
  @JsonProperty("recording")
  public AddressableEntityRef getRecording() {
    return recording;
  }
  public void setRecording(AddressableEntityRef recording) {
    this.recording = recording;
  }


  /**
   * The pre-signed S3 URL of the transcript
   **/
  public SegmentUrl url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pre-signed S3 URL of the transcript")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentUrl segmentUrl = (SegmentUrl) o;

    return Objects.equals(this.recording, segmentUrl.recording) &&
            Objects.equals(this.url, segmentUrl.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recording, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentUrl {\n");
    
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

