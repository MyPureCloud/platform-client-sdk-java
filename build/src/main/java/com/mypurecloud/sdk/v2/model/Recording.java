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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.ChatMessage;
import com.mypurecloud.sdk.v2.model.MediaResult;
import com.mypurecloud.sdk.v2.model.RecordingEmailMessage;
import com.mypurecloud.sdk.v2.model.RecordingMessagingMessage;
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
  private List<RecordingMessagingMessage> messagingTranscript = new ArrayList<RecordingMessagingMessage>();

  private static class FileStateEnumDeserializer extends StdDeserializer<FileStateEnum> {
    public FileStateEnumDeserializer() {
      super(FileStateEnumDeserializer.class);
    }

    @Override
    public FileStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FileStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Represents the current file state for a recording. Examples: Uploading, Archived, etc
   */
 @JsonDeserialize(using = FileStateEnumDeserializer.class)
  public enum FileStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ARCHIVED("ARCHIVED"),
    AVAILABLE("AVAILABLE"),
    DELETED("DELETED"),
    RESTORED("RESTORED"),
    RESTORING("RESTORING"),
    UPLOADING("UPLOADING"),
    ERROR("ERROR");

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
  private Map<String, MediaResult> mediaUris = null;
  private Long estimatedTranscodeTimeMs = null;
  private Long actualTranscodeTimeMs = null;
  private Date archiveDate = null;

  private static class ArchiveMediumEnumDeserializer extends StdDeserializer<ArchiveMediumEnum> {
    public ArchiveMediumEnumDeserializer() {
      super(ArchiveMediumEnumDeserializer.class);
    }

    @Override
    public ArchiveMediumEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ArchiveMediumEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of archive medium used. Example: CloudArchive
   */
 @JsonDeserialize(using = ArchiveMediumEnumDeserializer.class)
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
  private Date exportDate = null;
  private Date exportedDate = null;
  private Integer outputDurationMs = null;
  private Integer outputSizeInBytes = null;
  private Integer maxAllowedRestorationsForOrg = null;
  private Integer remainingRestorationsAllowedForOrg = null;
  private String sessionId = null;
  private List<User> users = new ArrayList<User>();

  private static class RecordingFileRoleEnumDeserializer extends StdDeserializer<RecordingFileRoleEnum> {
    public RecordingFileRoleEnumDeserializer() {
      super(RecordingFileRoleEnumDeserializer.class);
    }

    @Override
    public RecordingFileRoleEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RecordingFileRoleEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Role of the file recording. It can be either customer_experience or adhoc.
   */
 @JsonDeserialize(using = RecordingFileRoleEnumDeserializer.class)
  public enum RecordingFileRoleEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CUSTOMER_EXPERIENCE("CUSTOMER_EXPERIENCE"),
    ADHOC("ADHOC");

    private String value;

    RecordingFileRoleEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RecordingFileRoleEnum fromString(String key) {
      if (key == null) return null;

      for (RecordingFileRoleEnum value : RecordingFileRoleEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RecordingFileRoleEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RecordingFileRoleEnum recordingFileRole = null;

  private static class RecordingErrorStatusEnumDeserializer extends StdDeserializer<RecordingErrorStatusEnum> {
    public RecordingErrorStatusEnumDeserializer() {
      super(RecordingErrorStatusEnumDeserializer.class);
    }

    @Override
    public RecordingErrorStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RecordingErrorStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of a recording that cannot be returned because of an error
   */
 @JsonDeserialize(using = RecordingErrorStatusEnumDeserializer.class)
  public enum RecordingErrorStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EMAIL_TRANSCRIPT_TOO_LARGE("EMAIL_TRANSCRIPT_TOO_LARGE");

    private String value;

    RecordingErrorStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RecordingErrorStatusEnum fromString(String key) {
      if (key == null) return null;

      for (RecordingErrorStatusEnum value : RecordingErrorStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RecordingErrorStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RecordingErrorStatusEnum recordingErrorStatus = null;
  private Date originalRecordingStartTime = null;
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
   * The start time of the recording. Null when there is no playable media.
   **/
  public Recording startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of the recording. Null when there is no playable media.")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The end time of the recording. Null when there is no playable media.
   **/
  public Recording endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end time of the recording. Null when there is no playable media.")
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
   * Represents a messaging transcript
   **/
  public Recording messagingTranscript(List<RecordingMessagingMessage> messagingTranscript) {
    this.messagingTranscript = messagingTranscript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents a messaging transcript")
  @JsonProperty("messagingTranscript")
  public List<RecordingMessagingMessage> getMessagingTranscript() {
    return messagingTranscript;
  }
  public void setMessagingTranscript(List<RecordingMessagingMessage> messagingTranscript) {
    this.messagingTranscript = messagingTranscript;
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
   * The amount of time a restored recording will remain restored before being archived again. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Recording restoreExpirationTime(Date restoreExpirationTime) {
    this.restoreExpirationTime = restoreExpirationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time a restored recording will remain restored before being archived again. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("restoreExpirationTime")
  public Date getRestoreExpirationTime() {
    return restoreExpirationTime;
  }
  public void setRestoreExpirationTime(Date restoreExpirationTime) {
    this.restoreExpirationTime = restoreExpirationTime;
  }

  
  /**
   * The different mediaUris for the recording. Null when there is no playable media.
   **/
  public Recording mediaUris(Map<String, MediaResult> mediaUris) {
    this.mediaUris = mediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The different mediaUris for the recording. Null when there is no playable media.")
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
   * The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Recording archiveDate(Date archiveDate) {
    this.archiveDate = archiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
   * The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Recording deleteDate(Date deleteDate) {
    this.deleteDate = deleteDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("deleteDate")
  public Date getDeleteDate() {
    return deleteDate;
  }
  public void setDeleteDate(Date deleteDate) {
    this.deleteDate = deleteDate;
  }

  
  /**
   * The date the recording will be exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Recording exportDate(Date exportDate) {
    this.exportDate = exportDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the recording will be exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("exportDate")
  public Date getExportDate() {
    return exportDate;
  }
  public void setExportDate(Date exportDate) {
    this.exportDate = exportDate;
  }

  
  /**
   * The date the recording was exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Recording exportedDate(Date exportedDate) {
    this.exportedDate = exportedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the recording was exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("exportedDate")
  public Date getExportedDate() {
    return exportedDate;
  }
  public void setExportedDate(Date exportedDate) {
    this.exportedDate = exportedDate;
  }

  
  /**
   * Duration of transcoded media in milliseconds
   **/
  public Recording outputDurationMs(Integer outputDurationMs) {
    this.outputDurationMs = outputDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Duration of transcoded media in milliseconds")
  @JsonProperty("outputDurationMs")
  public Integer getOutputDurationMs() {
    return outputDurationMs;
  }
  public void setOutputDurationMs(Integer outputDurationMs) {
    this.outputDurationMs = outputDurationMs;
  }

  
  /**
   * Size of transcoded media in bytes. 0 if there is no transcoded media.
   **/
  public Recording outputSizeInBytes(Integer outputSizeInBytes) {
    this.outputSizeInBytes = outputSizeInBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Size of transcoded media in bytes. 0 if there is no transcoded media.")
  @JsonProperty("outputSizeInBytes")
  public Integer getOutputSizeInBytes() {
    return outputSizeInBytes;
  }
  public void setOutputSizeInBytes(Integer outputSizeInBytes) {
    this.outputSizeInBytes = outputSizeInBytes;
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

  
  /**
   * Role of the file recording. It can be either customer_experience or adhoc.
   **/
  public Recording recordingFileRole(RecordingFileRoleEnum recordingFileRole) {
    this.recordingFileRole = recordingFileRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Role of the file recording. It can be either customer_experience or adhoc.")
  @JsonProperty("recordingFileRole")
  public RecordingFileRoleEnum getRecordingFileRole() {
    return recordingFileRole;
  }
  public void setRecordingFileRole(RecordingFileRoleEnum recordingFileRole) {
    this.recordingFileRole = recordingFileRole;
  }

  
  /**
   * Status of a recording that cannot be returned because of an error
   **/
  public Recording recordingErrorStatus(RecordingErrorStatusEnum recordingErrorStatus) {
    this.recordingErrorStatus = recordingErrorStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of a recording that cannot be returned because of an error")
  @JsonProperty("recordingErrorStatus")
  public RecordingErrorStatusEnum getRecordingErrorStatus() {
    return recordingErrorStatus;
  }
  public void setRecordingErrorStatus(RecordingErrorStatusEnum recordingErrorStatus) {
    this.recordingErrorStatus = recordingErrorStatus;
  }

  
  /**
   * The start time of the full recording, before any segment access restrictions are applied. Null when there is no playable media. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Recording originalRecordingStartTime(Date originalRecordingStartTime) {
    this.originalRecordingStartTime = originalRecordingStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of the full recording, before any segment access restrictions are applied. Null when there is no playable media. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("originalRecordingStartTime")
  public Date getOriginalRecordingStartTime() {
    return originalRecordingStartTime;
  }
  public void setOriginalRecordingStartTime(Date originalRecordingStartTime) {
    this.originalRecordingStartTime = originalRecordingStartTime;
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
        Objects.equals(this.messagingTranscript, recording.messagingTranscript) &&
        Objects.equals(this.fileState, recording.fileState) &&
        Objects.equals(this.restoreExpirationTime, recording.restoreExpirationTime) &&
        Objects.equals(this.mediaUris, recording.mediaUris) &&
        Objects.equals(this.estimatedTranscodeTimeMs, recording.estimatedTranscodeTimeMs) &&
        Objects.equals(this.actualTranscodeTimeMs, recording.actualTranscodeTimeMs) &&
        Objects.equals(this.archiveDate, recording.archiveDate) &&
        Objects.equals(this.archiveMedium, recording.archiveMedium) &&
        Objects.equals(this.deleteDate, recording.deleteDate) &&
        Objects.equals(this.exportDate, recording.exportDate) &&
        Objects.equals(this.exportedDate, recording.exportedDate) &&
        Objects.equals(this.outputDurationMs, recording.outputDurationMs) &&
        Objects.equals(this.outputSizeInBytes, recording.outputSizeInBytes) &&
        Objects.equals(this.maxAllowedRestorationsForOrg, recording.maxAllowedRestorationsForOrg) &&
        Objects.equals(this.remainingRestorationsAllowedForOrg, recording.remainingRestorationsAllowedForOrg) &&
        Objects.equals(this.sessionId, recording.sessionId) &&
        Objects.equals(this.users, recording.users) &&
        Objects.equals(this.recordingFileRole, recording.recordingFileRole) &&
        Objects.equals(this.recordingErrorStatus, recording.recordingErrorStatus) &&
        Objects.equals(this.originalRecordingStartTime, recording.originalRecordingStartTime) &&
        Objects.equals(this.selfUri, recording.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversationId, path, startTime, endTime, media, annotations, transcript, emailTranscript, messagingTranscript, fileState, restoreExpirationTime, mediaUris, estimatedTranscodeTimeMs, actualTranscodeTimeMs, archiveDate, archiveMedium, deleteDate, exportDate, exportedDate, outputDurationMs, outputSizeInBytes, maxAllowedRestorationsForOrg, remainingRestorationsAllowedForOrg, sessionId, users, recordingFileRole, recordingErrorStatus, originalRecordingStartTime, selfUri);
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
    sb.append("    messagingTranscript: ").append(toIndentedString(messagingTranscript)).append("\n");
    sb.append("    fileState: ").append(toIndentedString(fileState)).append("\n");
    sb.append("    restoreExpirationTime: ").append(toIndentedString(restoreExpirationTime)).append("\n");
    sb.append("    mediaUris: ").append(toIndentedString(mediaUris)).append("\n");
    sb.append("    estimatedTranscodeTimeMs: ").append(toIndentedString(estimatedTranscodeTimeMs)).append("\n");
    sb.append("    actualTranscodeTimeMs: ").append(toIndentedString(actualTranscodeTimeMs)).append("\n");
    sb.append("    archiveDate: ").append(toIndentedString(archiveDate)).append("\n");
    sb.append("    archiveMedium: ").append(toIndentedString(archiveMedium)).append("\n");
    sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
    sb.append("    exportDate: ").append(toIndentedString(exportDate)).append("\n");
    sb.append("    exportedDate: ").append(toIndentedString(exportedDate)).append("\n");
    sb.append("    outputDurationMs: ").append(toIndentedString(outputDurationMs)).append("\n");
    sb.append("    outputSizeInBytes: ").append(toIndentedString(outputSizeInBytes)).append("\n");
    sb.append("    maxAllowedRestorationsForOrg: ").append(toIndentedString(maxAllowedRestorationsForOrg)).append("\n");
    sb.append("    remainingRestorationsAllowedForOrg: ").append(toIndentedString(remainingRestorationsAllowedForOrg)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    recordingFileRole: ").append(toIndentedString(recordingFileRole)).append("\n");
    sb.append("    recordingErrorStatus: ").append(toIndentedString(recordingErrorStatus)).append("\n");
    sb.append("    originalRecordingStartTime: ").append(toIndentedString(originalRecordingStartTime)).append("\n");
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

