package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * EdgeLogsJobFile
 */

public class EdgeLogsJobFile  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Integer version = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String modifiedBy = null;
  private String createdBy = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private String modifiedByApp = null;
  private String createdByApp = null;
  private Date timeCreated = null;
  private Date timeModified = null;
  private Double sizeBytes = null;

  /**
   * The status of the upload of this file from the Edge to the cloud.  Use /upload to start an upload.
   */
  public enum UploadStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UPLOADING("UPLOADING"),
    NOT_UPLOADED("NOT_UPLOADED"),
    UPLOADED("UPLOADED"),
    ERROR_ON_UPLOAD("ERROR_ON_UPLOAD");

    private String value;

    UploadStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UploadStatusEnum fromString(String key) {
      if (key == null) return null;

      for (UploadStatusEnum value : UploadStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UploadStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UploadStatusEnum uploadStatus = null;
  private String edgePath = null;
  private String downloadId = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the entity.
   **/
  public EdgeLogsJobFile name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the entity.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public EdgeLogsJobFile description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public EdgeLogsJobFile version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EdgeLogsJobFile dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EdgeLogsJobFile dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   **/
  public EdgeLogsJobFile modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   **/
  public EdgeLogsJobFile createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  /**
   **/
  public EdgeLogsJobFile state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   **/
  public EdgeLogsJobFile modifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedByApp")
  public String getModifiedByApp() {
    return modifiedByApp;
  }
  public void setModifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
  }


  /**
   **/
  public EdgeLogsJobFile createdByApp(String createdByApp) {
    this.createdByApp = createdByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdByApp")
  public String getCreatedByApp() {
    return createdByApp;
  }
  public void setCreatedByApp(String createdByApp) {
    this.createdByApp = createdByApp;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EdgeLogsJobFile timeCreated(Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("timeCreated")
  public Date getTimeCreated() {
    return timeCreated;
  }
  public void setTimeCreated(Date timeCreated) {
    this.timeCreated = timeCreated;
  }


  /**
   * The time this log file was last modified on the Edge. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EdgeLogsJobFile timeModified(Date timeModified) {
    this.timeModified = timeModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time this log file was last modified on the Edge. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("timeModified")
  public Date getTimeModified() {
    return timeModified;
  }
  public void setTimeModified(Date timeModified) {
    this.timeModified = timeModified;
  }


  /**
   * The size of this file in bytes.
   **/
  public EdgeLogsJobFile sizeBytes(Double sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The size of this file in bytes.")
  @JsonProperty("sizeBytes")
  public Double getSizeBytes() {
    return sizeBytes;
  }
  public void setSizeBytes(Double sizeBytes) {
    this.sizeBytes = sizeBytes;
  }


  /**
   * The status of the upload of this file from the Edge to the cloud.  Use /upload to start an upload.
   **/
  public EdgeLogsJobFile uploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the upload of this file from the Edge to the cloud.  Use /upload to start an upload.")
  @JsonProperty("uploadStatus")
  public UploadStatusEnum getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
  }


  /**
   * The path of this file on the Edge.
   **/
  public EdgeLogsJobFile edgePath(String edgePath) {
    this.edgePath = edgePath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The path of this file on the Edge.")
  @JsonProperty("edgePath")
  public String getEdgePath() {
    return edgePath;
  }
  public void setEdgePath(String edgePath) {
    this.edgePath = edgePath;
  }


  /**
   * The download ID to use with the downloads API.
   **/
  public EdgeLogsJobFile downloadId(String downloadId) {
    this.downloadId = downloadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The download ID to use with the downloads API.")
  @JsonProperty("downloadId")
  public String getDownloadId() {
    return downloadId;
  }
  public void setDownloadId(String downloadId) {
    this.downloadId = downloadId;
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
    EdgeLogsJobFile edgeLogsJobFile = (EdgeLogsJobFile) o;
    return Objects.equals(this.id, edgeLogsJobFile.id) &&
        Objects.equals(this.name, edgeLogsJobFile.name) &&
        Objects.equals(this.description, edgeLogsJobFile.description) &&
        Objects.equals(this.version, edgeLogsJobFile.version) &&
        Objects.equals(this.dateCreated, edgeLogsJobFile.dateCreated) &&
        Objects.equals(this.dateModified, edgeLogsJobFile.dateModified) &&
        Objects.equals(this.modifiedBy, edgeLogsJobFile.modifiedBy) &&
        Objects.equals(this.createdBy, edgeLogsJobFile.createdBy) &&
        Objects.equals(this.state, edgeLogsJobFile.state) &&
        Objects.equals(this.modifiedByApp, edgeLogsJobFile.modifiedByApp) &&
        Objects.equals(this.createdByApp, edgeLogsJobFile.createdByApp) &&
        Objects.equals(this.timeCreated, edgeLogsJobFile.timeCreated) &&
        Objects.equals(this.timeModified, edgeLogsJobFile.timeModified) &&
        Objects.equals(this.sizeBytes, edgeLogsJobFile.sizeBytes) &&
        Objects.equals(this.uploadStatus, edgeLogsJobFile.uploadStatus) &&
        Objects.equals(this.edgePath, edgeLogsJobFile.edgePath) &&
        Objects.equals(this.downloadId, edgeLogsJobFile.downloadId) &&
        Objects.equals(this.selfUri, edgeLogsJobFile.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, timeCreated, timeModified, sizeBytes, uploadStatus, edgePath, downloadId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeLogsJobFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    modifiedByApp: ").append(toIndentedString(modifiedByApp)).append("\n");
    sb.append("    createdByApp: ").append(toIndentedString(createdByApp)).append("\n");
    sb.append("    timeCreated: ").append(toIndentedString(timeCreated)).append("\n");
    sb.append("    timeModified: ").append(toIndentedString(timeModified)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    edgePath: ").append(toIndentedString(edgePath)).append("\n");
    sb.append("    downloadId: ").append(toIndentedString(downloadId)).append("\n");
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

