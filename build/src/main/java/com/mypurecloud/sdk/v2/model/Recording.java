package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.ChatMessage;
import com.mypurecloud.sdk.v2.model.MediaResult;
import com.mypurecloud.sdk.v2.model.RecordingEmailMessage;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Recording
 */

public class Recording  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String conversationId = null;
  private String path = null;
  private String startTime = null;
  private String endTime = null;
  private String media = null;
  private List<Annotation> annotations = new ArrayList<Annotation>();
  private List<ChatMessage> transcript = new ArrayList<ChatMessage>();
  private List<RecordingEmailMessage> emailTranscript = new ArrayList<RecordingEmailMessage>();

  /**
   * Represents the current file state for a recording. Examples: Uploading, Archived, etc
   */
  public enum FileStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ARCHIVED("ARCHIVED"),
    AVAILABLE("AVAILABLE"),
    DELETED("DELETED"),
    RESTORED("RESTORED"),
    RESTORING("RESTORING"),
    UPLOADING("UPLOADING");

    private String value;

    FileStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FileStateEnum fromString(String key) {
      if (key == null) return null;

      for (FileStateEnum value : FileStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FileStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FileStateEnum fileState = null;
  private Date restoreExpirationTime = null;
  private Map<String, MediaResult> mediaUris = new HashMap<String, MediaResult>();
  private Long estimatedTranscodeTimeMs = null;
  private Long actualTranscodeTimeMs = null;
  private Date archiveDate = null;

  /**
   * The type of archive medium used. Example: CloudArchive
   */
  public enum ArchiveMediumEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CLOUDARCHIVE("CLOUDARCHIVE");

    private String value;

    ArchiveMediumEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ArchiveMediumEnum fromString(String key) {
      if (key == null) return null;

      for (ArchiveMediumEnum value : ArchiveMediumEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ArchiveMediumEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ArchiveMediumEnum archiveMedium = null;
  private Date deleteDate = null;
  private Integer maxAllowedRestorationsForOrg = null;
  private Integer remainingRestorationsAllowedForOrg = null;
  private String sessionId = null;
  private List<User> users = new ArrayList<User>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Recording name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Recording conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   **/
  public Recording path(String path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  
  /**
   **/
  public Recording startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   **/
  public Recording endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The type of media that the recording is. At the moment that could be audio, chat, or email.
   **/
  public Recording media(String media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of media that the recording is. At the moment that could be audio, chat, or email.")
  @JsonProperty("media")
  public String getMedia() {
    return media;
  }
  public void setMedia(String media) {
    this.media = media;
  }

  
  /**
   * Annotations that belong to the recording.
   **/
  public Recording annotations(List<Annotation> annotations) {
    this.annotations = annotations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Annotations that belong to the recording.")
  @JsonProperty("annotations")
  public List<Annotation> getAnnotations() {
    return annotations;
  }
  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }

  
  /**
   * Represents a chat transcript
   **/
  public Recording transcript(List<ChatMessage> transcript) {
    this.transcript = transcript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents a chat transcript")
  @JsonProperty("transcript")
  public List<ChatMessage> getTranscript() {
    return transcript;
  }
  public void setTranscript(List<ChatMessage> transcript) {
    this.transcript = transcript;
  }

  
  /**
   * Represents an email transcript
   **/
  public Recording emailTranscript(List<RecordingEmailMessage> emailTranscript) {
    this.emailTranscript = emailTranscript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents an email transcript")
  @JsonProperty("emailTranscript")
  public List<RecordingEmailMessage> getEmailTranscript() {
    return emailTranscript;
  }
  public void setEmailTranscript(List<RecordingEmailMessage> emailTranscript) {
    this.emailTranscript = emailTranscript;
  }

  
  /**
   * Represents the current file state for a recording. Examples: Uploading, Archived, etc
   **/
  public Recording fileState(FileStateEnum fileState) {
    this.fileState = fileState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the current file state for a recording. Examples: Uploading, Archived, etc")
  @JsonProperty("fileState")
  public FileStateEnum getFileState() {
    return fileState;
  }
  public void setFileState(FileStateEnum fileState) {
    this.fileState = fileState;
  }

  
  /**
   * The amount of time a restored recording will remain restored before being archived again. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public Recording restoreExpirationTime(Date restoreExpirationTime) {
    this.restoreExpirationTime = restoreExpirationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time a restored recording will remain restored before being archived again. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("restoreExpirationTime")
  public Date getRestoreExpirationTime() {
    return restoreExpirationTime;
  }
  public void setRestoreExpirationTime(Date restoreExpirationTime) {
    this.restoreExpirationTime = restoreExpirationTime;
  }

  
  /**
   * The different mediaUris for the recording.
   **/
  public Recording mediaUris(Map<String, MediaResult> mediaUris) {
    this.mediaUris = mediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The different mediaUris for the recording.")
  @JsonProperty("mediaUris")
  public Map<String, MediaResult> getMediaUris() {
    return mediaUris;
  }
  public void setMediaUris(Map<String, MediaResult> mediaUris) {
    this.mediaUris = mediaUris;
  }

  
  /**
   **/
  public Recording estimatedTranscodeTimeMs(Long estimatedTranscodeTimeMs) {
    this.estimatedTranscodeTimeMs = estimatedTranscodeTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedTranscodeTimeMs")
  public Long getEstimatedTranscodeTimeMs() {
    return estimatedTranscodeTimeMs;
  }
  public void setEstimatedTranscodeTimeMs(Long estimatedTranscodeTimeMs) {
    this.estimatedTranscodeTimeMs = estimatedTranscodeTimeMs;
  }

  
  /**
   **/
  public Recording actualTranscodeTimeMs(Long actualTranscodeTimeMs) {
    this.actualTranscodeTimeMs = actualTranscodeTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actualTranscodeTimeMs")
  public Long getActualTranscodeTimeMs() {
    return actualTranscodeTimeMs;
  }
  public void setActualTranscodeTimeMs(Long actualTranscodeTimeMs) {
    this.actualTranscodeTimeMs = actualTranscodeTimeMs;
  }

  
  /**
   * The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public Recording archiveDate(Date archiveDate) {
    this.archiveDate = archiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("archiveDate")
  public Date getArchiveDate() {
    return archiveDate;
  }
  public void setArchiveDate(Date archiveDate) {
    this.archiveDate = archiveDate;
  }

  
  /**
   * The type of archive medium used. Example: CloudArchive
   **/
  public Recording archiveMedium(ArchiveMediumEnum archiveMedium) {
    this.archiveMedium = archiveMedium;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of archive medium used. Example: CloudArchive")
  @JsonProperty("archiveMedium")
  public ArchiveMediumEnum getArchiveMedium() {
    return archiveMedium;
  }
  public void setArchiveMedium(ArchiveMediumEnum archiveMedium) {
    this.archiveMedium = archiveMedium;
  }

  
  /**
   * The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public Recording deleteDate(Date deleteDate) {
    this.deleteDate = deleteDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("deleteDate")
  public Date getDeleteDate() {
    return deleteDate;
  }
  public void setDeleteDate(Date deleteDate) {
    this.deleteDate = deleteDate;
  }

  
  /**
   * How many archive restorations the organization is allowed to have.
   **/
  public Recording maxAllowedRestorationsForOrg(Integer maxAllowedRestorationsForOrg) {
    this.maxAllowedRestorationsForOrg = maxAllowedRestorationsForOrg;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How many archive restorations the organization is allowed to have.")
  @JsonProperty("maxAllowedRestorationsForOrg")
  public Integer getMaxAllowedRestorationsForOrg() {
    return maxAllowedRestorationsForOrg;
  }
  public void setMaxAllowedRestorationsForOrg(Integer maxAllowedRestorationsForOrg) {
    this.maxAllowedRestorationsForOrg = maxAllowedRestorationsForOrg;
  }

  
  /**
   * The remaining archive restorations the organization has.
   **/
  public Recording remainingRestorationsAllowedForOrg(Integer remainingRestorationsAllowedForOrg) {
    this.remainingRestorationsAllowedForOrg = remainingRestorationsAllowedForOrg;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The remaining archive restorations the organization has.")
  @JsonProperty("remainingRestorationsAllowedForOrg")
  public Integer getRemainingRestorationsAllowedForOrg() {
    return remainingRestorationsAllowedForOrg;
  }
  public void setRemainingRestorationsAllowedForOrg(Integer remainingRestorationsAllowedForOrg) {
    this.remainingRestorationsAllowedForOrg = remainingRestorationsAllowedForOrg;
  }

  
  /**
   * The session id represents an external resource id, such as email, call, chat, etc
   **/
  public Recording sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The session id represents an external resource id, such as email, call, chat, etc")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  
  /**
   * The users participating in the conversation
   **/
  public Recording users(List<User> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The users participating in the conversation")
  @JsonProperty("users")
  public List<User> getUsers() {
    return users;
  }
  public void setUsers(List<User> users) {
    this.users = users;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recording recording = (Recording) o;
    return Objects.equals(this.id, recording.id) &&
        Objects.equals(this.name, recording.name) &&
        Objects.equals(this.conversationId, recording.conversationId) &&
        Objects.equals(this.path, recording.path) &&
        Objects.equals(this.startTime, recording.startTime) &&
        Objects.equals(this.endTime, recording.endTime) &&
        Objects.equals(this.media, recording.media) &&
        Objects.equals(this.annotations, recording.annotations) &&
        Objects.equals(this.transcript, recording.transcript) &&
        Objects.equals(this.emailTranscript, recording.emailTranscript) &&
        Objects.equals(this.fileState, recording.fileState) &&
        Objects.equals(this.restoreExpirationTime, recording.restoreExpirationTime) &&
        Objects.equals(this.mediaUris, recording.mediaUris) &&
        Objects.equals(this.estimatedTranscodeTimeMs, recording.estimatedTranscodeTimeMs) &&
        Objects.equals(this.actualTranscodeTimeMs, recording.actualTranscodeTimeMs) &&
        Objects.equals(this.archiveDate, recording.archiveDate) &&
        Objects.equals(this.archiveMedium, recording.archiveMedium) &&
        Objects.equals(this.deleteDate, recording.deleteDate) &&
        Objects.equals(this.maxAllowedRestorationsForOrg, recording.maxAllowedRestorationsForOrg) &&
        Objects.equals(this.remainingRestorationsAllowedForOrg, recording.remainingRestorationsAllowedForOrg) &&
        Objects.equals(this.sessionId, recording.sessionId) &&
        Objects.equals(this.users, recording.users) &&
        Objects.equals(this.selfUri, recording.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversationId, path, startTime, endTime, media, annotations, transcript, emailTranscript, fileState, restoreExpirationTime, mediaUris, estimatedTranscodeTimeMs, actualTranscodeTimeMs, archiveDate, archiveMedium, deleteDate, maxAllowedRestorationsForOrg, remainingRestorationsAllowedForOrg, sessionId, users, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recording {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    emailTranscript: ").append(toIndentedString(emailTranscript)).append("\n");
    sb.append("    fileState: ").append(toIndentedString(fileState)).append("\n");
    sb.append("    restoreExpirationTime: ").append(toIndentedString(restoreExpirationTime)).append("\n");
    sb.append("    mediaUris: ").append(toIndentedString(mediaUris)).append("\n");
    sb.append("    estimatedTranscodeTimeMs: ").append(toIndentedString(estimatedTranscodeTimeMs)).append("\n");
    sb.append("    actualTranscodeTimeMs: ").append(toIndentedString(actualTranscodeTimeMs)).append("\n");
    sb.append("    archiveDate: ").append(toIndentedString(archiveDate)).append("\n");
    sb.append("    archiveMedium: ").append(toIndentedString(archiveMedium)).append("\n");
    sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
    sb.append("    maxAllowedRestorationsForOrg: ").append(toIndentedString(maxAllowedRestorationsForOrg)).append("\n");
    sb.append("    remainingRestorationsAllowedForOrg: ").append(toIndentedString(remainingRestorationsAllowedForOrg)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

