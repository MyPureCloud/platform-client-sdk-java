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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * RecordingRetention
 */

public class RecordingRetention  implements Serializable {
  
  private String conversationId = null;
  private String recordingId = null;
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
  private Date creationTime = null;

  
  /**
   **/
  public RecordingRetention conversationId(String conversationId) {
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
  public RecordingRetention recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recordingId")
  public String getRecordingId() {
    return recordingId;
  }
  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }


  /**
   * The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingRetention archiveDate(Date archiveDate) {
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
  public RecordingRetention archiveMedium(ArchiveMediumEnum archiveMedium) {
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
  public RecordingRetention deleteDate(Date deleteDate) {
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
  public RecordingRetention exportDate(Date exportDate) {
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
  public RecordingRetention exportedDate(Date exportedDate) {
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
   * The creation time of the recording. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingRetention creationTime(Date creationTime) {
    this.creationTime = creationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The creation time of the recording. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("creationTime")
  public Date getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingRetention recordingRetention = (RecordingRetention) o;

    return Objects.equals(this.conversationId, recordingRetention.conversationId) &&
            Objects.equals(this.recordingId, recordingRetention.recordingId) &&
            Objects.equals(this.archiveDate, recordingRetention.archiveDate) &&
            Objects.equals(this.archiveMedium, recordingRetention.archiveMedium) &&
            Objects.equals(this.deleteDate, recordingRetention.deleteDate) &&
            Objects.equals(this.exportDate, recordingRetention.exportDate) &&
            Objects.equals(this.exportedDate, recordingRetention.exportedDate) &&
            Objects.equals(this.creationTime, recordingRetention.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, recordingId, archiveDate, archiveMedium, deleteDate, exportDate, exportedDate, creationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingRetention {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    archiveDate: ").append(toIndentedString(archiveDate)).append("\n");
    sb.append("    archiveMedium: ").append(toIndentedString(archiveMedium)).append("\n");
    sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
    sb.append("    exportDate: ").append(toIndentedString(exportDate)).append("\n");
    sb.append("    exportedDate: ").append(toIndentedString(exportedDate)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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

