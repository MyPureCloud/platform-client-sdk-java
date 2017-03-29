package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationLockInfo;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationUserData;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DocumentDataV2Notification
 */

public class DocumentDataV2Notification  implements Serializable {
  
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
  private DocumentDataV2NotificationUserData uploadedBy = null;
  private DocumentDataV2NotificationLockInfo lockInfo = null;
  private String selfUri = null;

  
  /**
   **/
  public DocumentDataV2Notification id(String id) {
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
  public DocumentDataV2Notification name(String name) {
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
  public DocumentDataV2Notification dateCreated(Date dateCreated) {
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
  public DocumentDataV2Notification dateModified(Date dateModified) {
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
  public DocumentDataV2Notification workspace(DocumentDataV2NotificationWorkspace workspace) {
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
  public DocumentDataV2Notification createdBy(DocumentDataV2NotificationCreatedBy createdBy) {
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
  public DocumentDataV2Notification contentType(String contentType) {
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
  public DocumentDataV2Notification contentLength(Integer contentLength) {
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
  public DocumentDataV2Notification filename(String filename) {
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
  public DocumentDataV2Notification changeNumber(Integer changeNumber) {
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
  public DocumentDataV2Notification dateUploaded(Date dateUploaded) {
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
  public DocumentDataV2Notification uploadedBy(DocumentDataV2NotificationUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadedBy")
  public DocumentDataV2NotificationUserData getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(DocumentDataV2NotificationUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
  }


  /**
   **/
  public DocumentDataV2Notification lockInfo(DocumentDataV2NotificationLockInfo lockInfo) {
    this.lockInfo = lockInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockInfo")
  public DocumentDataV2NotificationLockInfo getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(DocumentDataV2NotificationLockInfo lockInfo) {
    this.lockInfo = lockInfo;
  }


  /**
   **/
  public DocumentDataV2Notification selfUri(String selfUri) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentDataV2Notification documentDataV2Notification = (DocumentDataV2Notification) o;
    return Objects.equals(this.id, documentDataV2Notification.id) &&
        Objects.equals(this.name, documentDataV2Notification.name) &&
        Objects.equals(this.dateCreated, documentDataV2Notification.dateCreated) &&
        Objects.equals(this.dateModified, documentDataV2Notification.dateModified) &&
        Objects.equals(this.workspace, documentDataV2Notification.workspace) &&
        Objects.equals(this.createdBy, documentDataV2Notification.createdBy) &&
        Objects.equals(this.contentType, documentDataV2Notification.contentType) &&
        Objects.equals(this.contentLength, documentDataV2Notification.contentLength) &&
        Objects.equals(this.filename, documentDataV2Notification.filename) &&
        Objects.equals(this.changeNumber, documentDataV2Notification.changeNumber) &&
        Objects.equals(this.dateUploaded, documentDataV2Notification.dateUploaded) &&
        Objects.equals(this.uploadedBy, documentDataV2Notification.uploadedBy) &&
        Objects.equals(this.lockInfo, documentDataV2Notification.lockInfo) &&
        Objects.equals(this.selfUri, documentDataV2Notification.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, workspace, createdBy, contentType, contentLength, filename, changeNumber, dateUploaded, uploadedBy, lockInfo, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDataV2Notification {\n");
    
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

