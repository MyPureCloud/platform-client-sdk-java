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

import java.io.Serializable;
/**
 * ArchitectPromptResourceNotificationPromptResourceNotification
 */

public class ArchitectPromptResourceNotificationPromptResourceNotification  implements Serializable {
  
  private String promptId = null;
  private String id = null;
  private String language = null;
  private String mediaUri = null;
  private String uploadStatus = null;
  private BigDecimal durationSeconds = null;

  public ArchitectPromptResourceNotificationPromptResourceNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Id of the prompt that this notification is for.
   **/
  public ArchitectPromptResourceNotificationPromptResourceNotification promptId(String promptId) {
    this.promptId = promptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the prompt that this notification is for.")
  @JsonProperty("promptId")
  public String getPromptId() {
    return promptId;
  }
  public void setPromptId(String promptId) {
    this.promptId = promptId;
  }


  /**
   * Id of the prompt resource that this notification is for.
   **/
  public ArchitectPromptResourceNotificationPromptResourceNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the prompt resource that this notification is for.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Language resource that this notification is for.
   **/
  public ArchitectPromptResourceNotificationPromptResourceNotification language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language resource that this notification is for.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Uri to the file for this prompt resource.
   **/
  public ArchitectPromptResourceNotificationPromptResourceNotification mediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Uri to the file for this prompt resource.")
  @JsonProperty("mediaUri")
  public String getMediaUri() {
    return mediaUri;
  }
  public void setMediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
  }


  /**
   * Current upload status of the prompt resource (created, uploaded, transcoded, transcodeFailed).
   **/
  public ArchitectPromptResourceNotificationPromptResourceNotification uploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current upload status of the prompt resource (created, uploaded, transcoded, transcodeFailed).")
  @JsonProperty("uploadStatus")
  public String getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
  }


  /**
   * Duration (in seconds) for the transcoded audio file.
   **/
  public ArchitectPromptResourceNotificationPromptResourceNotification durationSeconds(BigDecimal durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Duration (in seconds) for the transcoded audio file.")
  @JsonProperty("durationSeconds")
  public BigDecimal getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(BigDecimal durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectPromptResourceNotificationPromptResourceNotification architectPromptResourceNotificationPromptResourceNotification = (ArchitectPromptResourceNotificationPromptResourceNotification) o;

    return Objects.equals(this.promptId, architectPromptResourceNotificationPromptResourceNotification.promptId) &&
            Objects.equals(this.id, architectPromptResourceNotificationPromptResourceNotification.id) &&
            Objects.equals(this.language, architectPromptResourceNotificationPromptResourceNotification.language) &&
            Objects.equals(this.mediaUri, architectPromptResourceNotificationPromptResourceNotification.mediaUri) &&
            Objects.equals(this.uploadStatus, architectPromptResourceNotificationPromptResourceNotification.uploadStatus) &&
            Objects.equals(this.durationSeconds, architectPromptResourceNotificationPromptResourceNotification.durationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promptId, id, language, mediaUri, uploadStatus, durationSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectPromptResourceNotificationPromptResourceNotification {\n");
    
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
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

