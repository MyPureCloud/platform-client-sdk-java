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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RecordingSettings
 */

public class RecordingSettings  implements Serializable {
  
  private Integer maxSimultaneousStreams = null;
  private Integer maxConfigurableScreenRecordingStreams = null;
  private Boolean regionalRecordingStorageEnabled = null;
  private Integer recordingPlaybackUrlTtl = null;
  private Integer recordingBatchDownloadUrlTtl = null;

  
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


  /**
   * Store call recordings in the region where they are intended to be recorded, otherwise in the organization's home region
   **/
  public RecordingSettings regionalRecordingStorageEnabled(Boolean regionalRecordingStorageEnabled) {
    this.regionalRecordingStorageEnabled = regionalRecordingStorageEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Store call recordings in the region where they are intended to be recorded, otherwise in the organization's home region")
  @JsonProperty("regionalRecordingStorageEnabled")
  public Boolean getRegionalRecordingStorageEnabled() {
    return regionalRecordingStorageEnabled;
  }
  public void setRegionalRecordingStorageEnabled(Boolean regionalRecordingStorageEnabled) {
    this.regionalRecordingStorageEnabled = regionalRecordingStorageEnabled;
  }


  /**
   * The duration in minutes for which the generated URL for recording playback remains valid.The default duration is set to 60 minutes, with a minimum allowable duration of 2 minutes and a maximum of 60 minutes.
   **/
  public RecordingSettings recordingPlaybackUrlTtl(Integer recordingPlaybackUrlTtl) {
    this.recordingPlaybackUrlTtl = recordingPlaybackUrlTtl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The duration in minutes for which the generated URL for recording playback remains valid.The default duration is set to 60 minutes, with a minimum allowable duration of 2 minutes and a maximum of 60 minutes.")
  @JsonProperty("recordingPlaybackUrlTtl")
  public Integer getRecordingPlaybackUrlTtl() {
    return recordingPlaybackUrlTtl;
  }
  public void setRecordingPlaybackUrlTtl(Integer recordingPlaybackUrlTtl) {
    this.recordingPlaybackUrlTtl = recordingPlaybackUrlTtl;
  }


  /**
   * TThe duration in minutes for which the generated URL for recording batch download remains valid.The default duration is set to 60 minutes, with a minimum allowable duration of 2 minutes and a maximum of 60 minutes.
   **/
  public RecordingSettings recordingBatchDownloadUrlTtl(Integer recordingBatchDownloadUrlTtl) {
    this.recordingBatchDownloadUrlTtl = recordingBatchDownloadUrlTtl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "TThe duration in minutes for which the generated URL for recording batch download remains valid.The default duration is set to 60 minutes, with a minimum allowable duration of 2 minutes and a maximum of 60 minutes.")
  @JsonProperty("recordingBatchDownloadUrlTtl")
  public Integer getRecordingBatchDownloadUrlTtl() {
    return recordingBatchDownloadUrlTtl;
  }
  public void setRecordingBatchDownloadUrlTtl(Integer recordingBatchDownloadUrlTtl) {
    this.recordingBatchDownloadUrlTtl = recordingBatchDownloadUrlTtl;
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
            Objects.equals(this.maxConfigurableScreenRecordingStreams, recordingSettings.maxConfigurableScreenRecordingStreams) &&
            Objects.equals(this.regionalRecordingStorageEnabled, recordingSettings.regionalRecordingStorageEnabled) &&
            Objects.equals(this.recordingPlaybackUrlTtl, recordingSettings.recordingPlaybackUrlTtl) &&
            Objects.equals(this.recordingBatchDownloadUrlTtl, recordingSettings.recordingBatchDownloadUrlTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSimultaneousStreams, maxConfigurableScreenRecordingStreams, regionalRecordingStorageEnabled, recordingPlaybackUrlTtl, recordingBatchDownloadUrlTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingSettings {\n");
    
    sb.append("    maxSimultaneousStreams: ").append(toIndentedString(maxSimultaneousStreams)).append("\n");
    sb.append("    maxConfigurableScreenRecordingStreams: ").append(toIndentedString(maxConfigurableScreenRecordingStreams)).append("\n");
    sb.append("    regionalRecordingStorageEnabled: ").append(toIndentedString(regionalRecordingStorageEnabled)).append("\n");
    sb.append("    recordingPlaybackUrlTtl: ").append(toIndentedString(recordingPlaybackUrlTtl)).append("\n");
    sb.append("    recordingBatchDownloadUrlTtl: ").append(toIndentedString(recordingBatchDownloadUrlTtl)).append("\n");
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

