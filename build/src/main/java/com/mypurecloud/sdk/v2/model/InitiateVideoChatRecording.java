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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ArchiveRetention;
import com.mypurecloud.sdk.v2.model.DeleteRetention;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InitiateVideoChatRecording
 */

public class InitiateVideoChatRecording  implements Serializable {
  

  private static class VideoChatRecordingCaptureTypeEnumDeserializer extends StdDeserializer<VideoChatRecordingCaptureTypeEnum> {
    public VideoChatRecordingCaptureTypeEnumDeserializer() {
      super(VideoChatRecordingCaptureTypeEnumDeserializer.class);
    }

    @Override
    public VideoChatRecordingCaptureTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VideoChatRecordingCaptureTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of video recording to capture.
   */
 @JsonDeserialize(using = VideoChatRecordingCaptureTypeEnumDeserializer.class)
  public enum VideoChatRecordingCaptureTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AUDIOVIDEO("AudioVideo"),
    AUDIOONLY("AudioOnly");

    private String value;

    VideoChatRecordingCaptureTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VideoChatRecordingCaptureTypeEnum fromString(String key) {
      if (key == null) return null;

      for (VideoChatRecordingCaptureTypeEnum value : VideoChatRecordingCaptureTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VideoChatRecordingCaptureTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VideoChatRecordingCaptureTypeEnum videoChatRecordingCaptureType = null;
  private ArchiveRetention archiveRetention = null;
  private DeleteRetention deleteRetention = null;

  public InitiateVideoChatRecording() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public InitiateVideoChatRecording(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The type of video recording to capture.
   **/
  public InitiateVideoChatRecording videoChatRecordingCaptureType(VideoChatRecordingCaptureTypeEnum videoChatRecordingCaptureType) {
    this.videoChatRecordingCaptureType = videoChatRecordingCaptureType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of video recording to capture.")
  @JsonProperty("videoChatRecordingCaptureType")
  public VideoChatRecordingCaptureTypeEnum getVideoChatRecordingCaptureType() {
    return videoChatRecordingCaptureType;
  }
  public void setVideoChatRecordingCaptureType(VideoChatRecordingCaptureTypeEnum videoChatRecordingCaptureType) {
    this.videoChatRecordingCaptureType = videoChatRecordingCaptureType;
  }


  /**
   * Archive retention settings for the initiated video chat recording.
   **/
  public InitiateVideoChatRecording archiveRetention(ArchiveRetention archiveRetention) {
    this.archiveRetention = archiveRetention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Archive retention settings for the initiated video chat recording.")
  @JsonProperty("archiveRetention")
  public ArchiveRetention getArchiveRetention() {
    return archiveRetention;
  }
  public void setArchiveRetention(ArchiveRetention archiveRetention) {
    this.archiveRetention = archiveRetention;
  }


  /**
   * Delete retention settings for the initiated video chat recording.
   **/
  public InitiateVideoChatRecording deleteRetention(DeleteRetention deleteRetention) {
    this.deleteRetention = deleteRetention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Delete retention settings for the initiated video chat recording.")
  @JsonProperty("deleteRetention")
  public DeleteRetention getDeleteRetention() {
    return deleteRetention;
  }
  public void setDeleteRetention(DeleteRetention deleteRetention) {
    this.deleteRetention = deleteRetention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateVideoChatRecording initiateVideoChatRecording = (InitiateVideoChatRecording) o;

    return Objects.equals(this.videoChatRecordingCaptureType, initiateVideoChatRecording.videoChatRecordingCaptureType) &&
            Objects.equals(this.archiveRetention, initiateVideoChatRecording.archiveRetention) &&
            Objects.equals(this.deleteRetention, initiateVideoChatRecording.deleteRetention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoChatRecordingCaptureType, archiveRetention, deleteRetention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateVideoChatRecording {\n");
    
    sb.append("    videoChatRecordingCaptureType: ").append(toIndentedString(videoChatRecordingCaptureType)).append("\n");
    sb.append("    archiveRetention: ").append(toIndentedString(archiveRetention)).append("\n");
    sb.append("    deleteRetention: ").append(toIndentedString(deleteRetention)).append("\n");
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

