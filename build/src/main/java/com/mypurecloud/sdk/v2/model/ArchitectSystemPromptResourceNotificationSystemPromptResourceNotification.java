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

import java.io.Serializable;
/**
 * ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification
 */

public class ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification  implements Serializable {
  
  private String promptId = null;
  private String id = null;
  private String language = null;
  private String mediaUri = null;
  private String uploadStatus = null;
  private BigDecimal durationSeconds = null;

  
  /**
   **/
  public ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification promptId(String promptId) {
    this.promptId = promptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("promptId")
  public String getPromptId() {
    return promptId;
  }
  public void setPromptId(String promptId) {
    this.promptId = promptId;
  }

  
  /**
   **/
  public ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   **/
  public ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification mediaUri(String mediaUri) {
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
  public ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification uploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadStatus")
  public String getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  
  /**
   **/
  public ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification durationSeconds(BigDecimal durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification architectSystemPromptResourceNotificationSystemPromptResourceNotification = (ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification) o;
    return Objects.equals(this.promptId, architectSystemPromptResourceNotificationSystemPromptResourceNotification.promptId) &&
        Objects.equals(this.id, architectSystemPromptResourceNotificationSystemPromptResourceNotification.id) &&
        Objects.equals(this.language, architectSystemPromptResourceNotificationSystemPromptResourceNotification.language) &&
        Objects.equals(this.mediaUri, architectSystemPromptResourceNotificationSystemPromptResourceNotification.mediaUri) &&
        Objects.equals(this.uploadStatus, architectSystemPromptResourceNotificationSystemPromptResourceNotification.uploadStatus) &&
        Objects.equals(this.durationSeconds, architectSystemPromptResourceNotificationSystemPromptResourceNotification.durationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promptId, id, language, mediaUri, uploadStatus, durationSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectSystemPromptResourceNotificationSystemPromptResourceNotification {\n");
    
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

