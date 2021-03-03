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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingArchiveRestoreTopicMediaResult
 */

public class RecordingArchiveRestoreTopicMediaResult  implements Serializable {
  
  private String channelId = null;
  private String waveUri = null;
  private String mediaUri = null;
  private List<BigDecimal> waveformData = new ArrayList<BigDecimal>();

  
  /**
   **/
  public RecordingArchiveRestoreTopicMediaResult channelId(String channelId) {
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
  public RecordingArchiveRestoreTopicMediaResult waveUri(String waveUri) {
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
  public RecordingArchiveRestoreTopicMediaResult mediaUri(String mediaUri) {
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
  public RecordingArchiveRestoreTopicMediaResult waveformData(List<BigDecimal> waveformData) {
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
    RecordingArchiveRestoreTopicMediaResult recordingArchiveRestoreTopicMediaResult = (RecordingArchiveRestoreTopicMediaResult) o;
    return Objects.equals(this.channelId, recordingArchiveRestoreTopicMediaResult.channelId) &&
        Objects.equals(this.waveUri, recordingArchiveRestoreTopicMediaResult.waveUri) &&
        Objects.equals(this.mediaUri, recordingArchiveRestoreTopicMediaResult.mediaUri) &&
        Objects.equals(this.waveformData, recordingArchiveRestoreTopicMediaResult.waveformData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, waveUri, mediaUri, waveformData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingArchiveRestoreTopicMediaResult {\n");
    
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

