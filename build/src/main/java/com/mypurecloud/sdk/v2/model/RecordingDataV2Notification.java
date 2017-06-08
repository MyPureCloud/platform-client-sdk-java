package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import com.mypurecloud.sdk.v2.model.RecordingDataV2NotificationLockInfo;
import com.mypurecloud.sdk.v2.model.RecordingDataV2NotificationUserData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * RecordingDataV2Notification
 */

public class RecordingDataV2Notification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private DocumentDataV2NotificationWorkspace workspace = null;
  private DocumentDataV2NotificationCreatedBy createdBy = null;
  private String contentType = null;
  private Integer contentLength = null;
  private String filename = null;
  private Integer changeNumber = null;
  private Date dateUploaded = null;
  private RecordingDataV2NotificationUserData uploadedBy = null;
  private RecordingDataV2NotificationLockInfo lockInfo = null;
  private String selfUri = null;
  private Integer durationMillieconds = null;
  private DocumentDataV2NotificationWorkspace conversation = null;
  private Boolean read = null;

  
  /**
   **/
  public RecordingDataV2Notification id(String id) {
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
  public RecordingDataV2Notification name(String name) {
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
  public RecordingDataV2Notification dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public RecordingDataV2Notification dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public RecordingDataV2Notification workspace(DocumentDataV2NotificationWorkspace workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public DocumentDataV2NotificationWorkspace getWorkspace() {
    return workspace;
  }
  public void setWorkspace(DocumentDataV2NotificationWorkspace workspace) {
    this.workspace = workspace;
  }

  
  /**
   **/
  public RecordingDataV2Notification createdBy(DocumentDataV2NotificationCreatedBy createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public DocumentDataV2NotificationCreatedBy getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(DocumentDataV2NotificationCreatedBy createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public RecordingDataV2Notification contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   **/
  public RecordingDataV2Notification contentLength(Integer contentLength) {
    this.contentLength = contentLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentLength")
  public Integer getContentLength() {
    return contentLength;
  }
  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }

  
  /**
   **/
  public RecordingDataV2Notification filename(String filename) {
    this.filename = filename;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  /**
   **/
  public RecordingDataV2Notification changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("changeNumber")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  
  /**
   **/
  public RecordingDataV2Notification dateUploaded(Date dateUploaded) {
    this.dateUploaded = dateUploaded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateUploaded")
  public Date getDateUploaded() {
    return dateUploaded;
  }
  public void setDateUploaded(Date dateUploaded) {
    this.dateUploaded = dateUploaded;
  }

  
  /**
   **/
  public RecordingDataV2Notification uploadedBy(RecordingDataV2NotificationUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadedBy")
  public RecordingDataV2NotificationUserData getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(RecordingDataV2NotificationUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  
  /**
   **/
  public RecordingDataV2Notification lockInfo(RecordingDataV2NotificationLockInfo lockInfo) {
    this.lockInfo = lockInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockInfo")
  public RecordingDataV2NotificationLockInfo getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(RecordingDataV2NotificationLockInfo lockInfo) {
    this.lockInfo = lockInfo;
  }

  
  /**
   **/
  public RecordingDataV2Notification selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  
  /**
   **/
  public RecordingDataV2Notification durationMillieconds(Integer durationMillieconds) {
    this.durationMillieconds = durationMillieconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMillieconds")
  public Integer getDurationMillieconds() {
    return durationMillieconds;
  }
  public void setDurationMillieconds(Integer durationMillieconds) {
    this.durationMillieconds = durationMillieconds;
  }

  
  /**
   **/
  public RecordingDataV2Notification conversation(DocumentDataV2NotificationWorkspace conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversation")
  public DocumentDataV2NotificationWorkspace getConversation() {
    return conversation;
  }
  public void setConversation(DocumentDataV2NotificationWorkspace conversation) {
    this.conversation = conversation;
  }

  
  /**
   **/
  public RecordingDataV2Notification read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingDataV2Notification recordingDataV2Notification = (RecordingDataV2Notification) o;
    return Objects.equals(this.id, recordingDataV2Notification.id) &&
        Objects.equals(this.name, recordingDataV2Notification.name) &&
        Objects.equals(this.dateCreated, recordingDataV2Notification.dateCreated) &&
        Objects.equals(this.dateModified, recordingDataV2Notification.dateModified) &&
        Objects.equals(this.workspace, recordingDataV2Notification.workspace) &&
        Objects.equals(this.createdBy, recordingDataV2Notification.createdBy) &&
        Objects.equals(this.contentType, recordingDataV2Notification.contentType) &&
        Objects.equals(this.contentLength, recordingDataV2Notification.contentLength) &&
        Objects.equals(this.filename, recordingDataV2Notification.filename) &&
        Objects.equals(this.changeNumber, recordingDataV2Notification.changeNumber) &&
        Objects.equals(this.dateUploaded, recordingDataV2Notification.dateUploaded) &&
        Objects.equals(this.uploadedBy, recordingDataV2Notification.uploadedBy) &&
        Objects.equals(this.lockInfo, recordingDataV2Notification.lockInfo) &&
        Objects.equals(this.selfUri, recordingDataV2Notification.selfUri) &&
        Objects.equals(this.durationMillieconds, recordingDataV2Notification.durationMillieconds) &&
        Objects.equals(this.conversation, recordingDataV2Notification.conversation) &&
        Objects.equals(this.read, recordingDataV2Notification.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, workspace, createdBy, contentType, contentLength, filename, changeNumber, dateUploaded, uploadedBy, lockInfo, selfUri, durationMillieconds, conversation, read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingDataV2Notification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
    sb.append("    dateUploaded: ").append(toIndentedString(dateUploaded)).append("\n");
    sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
    sb.append("    lockInfo: ").append(toIndentedString(lockInfo)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    durationMillieconds: ").append(toIndentedString(durationMillieconds)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

