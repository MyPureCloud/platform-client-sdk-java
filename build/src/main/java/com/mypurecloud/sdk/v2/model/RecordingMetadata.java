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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingMetadata
 */

public class RecordingMetadata  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String conversationId = null;
  private String path = null;
  private String startTime = null;
  private String endTime = null;
  private String media = null;
  private List<Annotation> annotations = new ArrayList<Annotation>();

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
  private Integer maxAllowedRestorationsForOrg = null;
  private Integer remainingRestorationsAllowedForOrg = null;
  private String sessionId = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public RecordingMetadata name(String name) {
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
  public RecordingMetadata conversationId(String conversationId) {
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
  public RecordingMetadata path(String path) {
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
   * The start time of the recording for screen recordings. Null for other types.
   **/
  public RecordingMetadata startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of the recording for screen recordings. Null for other types.")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   **/
  public RecordingMetadata endTime(String endTime) {
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
   * The type of media that the recording is. At the moment that could be audio, chat, email, or message.
   **/
  public RecordingMetadata media(String media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of media that the recording is. At the moment that could be audio, chat, email, or message.")
  @JsonProperty("media")
  public String getMedia() {
    return media;
  }
  public void setMedia(String media) {
    this.media = media;
  }

  
  /**
   * Annotations that belong to the recording. Populated when recording filestate is AVAILABLE.
   **/
  public RecordingMetadata annotations(List<Annotation> annotations) {
    this.annotations = annotations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Annotations that belong to the recording. Populated when recording filestate is AVAILABLE.")
  @JsonProperty("annotations")
  public List<Annotation> getAnnotations() {
    return annotations;
  }
  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }

  
  /**
   * Represents the current file state for a recording. Examples: Uploading, Archived, etc
   **/
  public RecordingMetadata fileState(FileStateEnum fileState) {
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
  public RecordingMetadata restoreExpirationTime(Date restoreExpirationTime) {
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
   * The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingMetadata archiveDate(Date archiveDate) {
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
  public RecordingMetadata archiveMedium(ArchiveMediumEnum archiveMedium) {
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
  public RecordingMetadata deleteDate(Date deleteDate) {
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
  public RecordingMetadata exportDate(Date exportDate) {
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
  public RecordingMetadata exportedDate(Date exportedDate) {
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
   * How many archive restorations the organization is allowed to have.
   **/
  public RecordingMetadata maxAllowedRestorationsForOrg(Integer maxAllowedRestorationsForOrg) {
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
  public RecordingMetadata remainingRestorationsAllowedForOrg(Integer remainingRestorationsAllowedForOrg) {
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
  public RecordingMetadata sessionId(String sessionId) {
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
    RecordingMetadata recordingMetadata = (RecordingMetadata) o;
    return Objects.equals(this.id, recordingMetadata.id) &&
        Objects.equals(this.name, recordingMetadata.name) &&
        Objects.equals(this.conversationId, recordingMetadata.conversationId) &&
        Objects.equals(this.path, recordingMetadata.path) &&
        Objects.equals(this.startTime, recordingMetadata.startTime) &&
        Objects.equals(this.endTime, recordingMetadata.endTime) &&
        Objects.equals(this.media, recordingMetadata.media) &&
        Objects.equals(this.annotations, recordingMetadata.annotations) &&
        Objects.equals(this.fileState, recordingMetadata.fileState) &&
        Objects.equals(this.restoreExpirationTime, recordingMetadata.restoreExpirationTime) &&
        Objects.equals(this.archiveDate, recordingMetadata.archiveDate) &&
        Objects.equals(this.archiveMedium, recordingMetadata.archiveMedium) &&
        Objects.equals(this.deleteDate, recordingMetadata.deleteDate) &&
        Objects.equals(this.exportDate, recordingMetadata.exportDate) &&
        Objects.equals(this.exportedDate, recordingMetadata.exportedDate) &&
        Objects.equals(this.maxAllowedRestorationsForOrg, recordingMetadata.maxAllowedRestorationsForOrg) &&
        Objects.equals(this.remainingRestorationsAllowedForOrg, recordingMetadata.remainingRestorationsAllowedForOrg) &&
        Objects.equals(this.sessionId, recordingMetadata.sessionId) &&
        Objects.equals(this.selfUri, recordingMetadata.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversationId, path, startTime, endTime, media, annotations, fileState, restoreExpirationTime, archiveDate, archiveMedium, deleteDate, exportDate, exportedDate, maxAllowedRestorationsForOrg, remainingRestorationsAllowedForOrg, sessionId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    fileState: ").append(toIndentedString(fileState)).append("\n");
    sb.append("    restoreExpirationTime: ").append(toIndentedString(restoreExpirationTime)).append("\n");
    sb.append("    archiveDate: ").append(toIndentedString(archiveDate)).append("\n");
    sb.append("    archiveMedium: ").append(toIndentedString(archiveMedium)).append("\n");
    sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
    sb.append("    exportDate: ").append(toIndentedString(exportDate)).append("\n");
    sb.append("    exportedDate: ").append(toIndentedString(exportedDate)).append("\n");
    sb.append("    maxAllowedRestorationsForOrg: ").append(toIndentedString(maxAllowedRestorationsForOrg)).append("\n");
    sb.append("    remainingRestorationsAllowedForOrg: ").append(toIndentedString(remainingRestorationsAllowedForOrg)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

