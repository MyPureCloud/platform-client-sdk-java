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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingTranscodeCompleteTopicMediaResult
 */

public class RecordingTranscodeCompleteTopicMediaResult  implements Serializable {
  
  private String channelId = null;
  private String waveUri = null;
  private String mediaUri = null;
  private List<BigDecimal> waveformData = null;

  public RecordingTranscodeCompleteTopicMediaResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      waveformData = new ArrayList<BigDecimal>();
    }
  }

  
  /**
   **/
  public RecordingTranscodeCompleteTopicMediaResult channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("channelId")
  public String getChannelId() {
    return channelId;
  }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  /**
   **/
  public RecordingTranscodeCompleteTopicMediaResult waveUri(String waveUri) {
    this.waveUri = waveUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("waveUri")
  public String getWaveUri() {
    return waveUri;
  }
  public void setWaveUri(String waveUri) {
    this.waveUri = waveUri;
  }


  /**
   **/
  public RecordingTranscodeCompleteTopicMediaResult mediaUri(String mediaUri) {
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
  public RecordingTranscodeCompleteTopicMediaResult waveformData(List<BigDecimal> waveformData) {
    this.waveformData = waveformData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("waveformData")
  public List<BigDecimal> getWaveformData() {
    return waveformData;
  }
  public void setWaveformData(List<BigDecimal> waveformData) {
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
    RecordingTranscodeCompleteTopicMediaResult recordingTranscodeCompleteTopicMediaResult = (RecordingTranscodeCompleteTopicMediaResult) o;

    return Objects.equals(this.channelId, recordingTranscodeCompleteTopicMediaResult.channelId) &&
            Objects.equals(this.waveUri, recordingTranscodeCompleteTopicMediaResult.waveUri) &&
            Objects.equals(this.mediaUri, recordingTranscodeCompleteTopicMediaResult.mediaUri) &&
            Objects.equals(this.waveformData, recordingTranscodeCompleteTopicMediaResult.waveformData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, waveUri, mediaUri, waveformData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingTranscodeCompleteTopicMediaResult {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    waveUri: ").append(toIndentedString(waveUri)).append("\n");
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

