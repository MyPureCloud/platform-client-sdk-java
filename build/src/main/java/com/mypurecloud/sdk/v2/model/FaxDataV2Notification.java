package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import com.mypurecloud.sdk.v2.model.FaxDataV2NotificationLockInfo;
import com.mypurecloud.sdk.v2.model.FaxDataV2NotificationUserData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * FaxDataV2Notification
 */

public class FaxDataV2Notification  implements Serializable {
  
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
  private FaxDataV2NotificationUserData uploadedBy = null;
  private FaxDataV2NotificationLockInfo lockInfo = null;
  private String selfUri = null;
  private String callerAddress = null;
  private String receiverAddress = null;
  private Boolean read = null;

  
  /**
   **/
  public FaxDataV2Notification id(String id) {
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
  public FaxDataV2Notification name(String name) {
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
  public FaxDataV2Notification dateCreated(Date dateCreated) {
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
  public FaxDataV2Notification dateModified(Date dateModified) {
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
  public FaxDataV2Notification workspace(DocumentDataV2NotificationWorkspace workspace) {
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
  public FaxDataV2Notification createdBy(DocumentDataV2NotificationCreatedBy createdBy) {
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
  public FaxDataV2Notification contentType(String contentType) {
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
  public FaxDataV2Notification contentLength(Integer contentLength) {
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
  public FaxDataV2Notification filename(String filename) {
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
  public FaxDataV2Notification changeNumber(Integer changeNumber) {
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
  public FaxDataV2Notification dateUploaded(Date dateUploaded) {
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
  public FaxDataV2Notification uploadedBy(FaxDataV2NotificationUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadedBy")
  public FaxDataV2NotificationUserData getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(FaxDataV2NotificationUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  
  /**
   **/
  public FaxDataV2Notification lockInfo(FaxDataV2NotificationLockInfo lockInfo) {
    this.lockInfo = lockInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockInfo")
  public FaxDataV2NotificationLockInfo getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(FaxDataV2NotificationLockInfo lockInfo) {
    this.lockInfo = lockInfo;
  }

  
  /**
   **/
  public FaxDataV2Notification selfUri(String selfUri) {
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
  public FaxDataV2Notification callerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callerAddress")
  public String getCallerAddress() {
    return callerAddress;
  }
  public void setCallerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
  }

  
  /**
   **/
  public FaxDataV2Notification receiverAddress(String receiverAddress) {
    this.receiverAddress = receiverAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiverAddress")
  public String getReceiverAddress() {
    return receiverAddress;
  }
  public void setReceiverAddress(String receiverAddress) {
    this.receiverAddress = receiverAddress;
  }

  
  /**
   **/
  public FaxDataV2Notification read(Boolean read) {
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
    FaxDataV2Notification faxDataV2Notification = (FaxDataV2Notification) o;
    return Objects.equals(this.id, faxDataV2Notification.id) &&
        Objects.equals(this.name, faxDataV2Notification.name) &&
        Objects.equals(this.dateCreated, faxDataV2Notification.dateCreated) &&
        Objects.equals(this.dateModified, faxDataV2Notification.dateModified) &&
        Objects.equals(this.workspace, faxDataV2Notification.workspace) &&
        Objects.equals(this.createdBy, faxDataV2Notification.createdBy) &&
        Objects.equals(this.contentType, faxDataV2Notification.contentType) &&
        Objects.equals(this.contentLength, faxDataV2Notification.contentLength) &&
        Objects.equals(this.filename, faxDataV2Notification.filename) &&
        Objects.equals(this.changeNumber, faxDataV2Notification.changeNumber) &&
        Objects.equals(this.dateUploaded, faxDataV2Notification.dateUploaded) &&
        Objects.equals(this.uploadedBy, faxDataV2Notification.uploadedBy) &&
        Objects.equals(this.lockInfo, faxDataV2Notification.lockInfo) &&
        Objects.equals(this.selfUri, faxDataV2Notification.selfUri) &&
        Objects.equals(this.callerAddress, faxDataV2Notification.callerAddress) &&
        Objects.equals(this.receiverAddress, faxDataV2Notification.receiverAddress) &&
        Objects.equals(this.read, faxDataV2Notification.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, workspace, createdBy, contentType, contentLength, filename, changeNumber, dateUploaded, uploadedBy, lockInfo, selfUri, callerAddress, receiverAddress, read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxDataV2Notification {\n");
    
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
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    receiverAddress: ").append(toIndentedString(receiverAddress)).append("\n");
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

