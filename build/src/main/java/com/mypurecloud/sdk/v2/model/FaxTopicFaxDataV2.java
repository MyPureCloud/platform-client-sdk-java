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
import com.mypurecloud.sdk.v2.model.FaxTopicLockData;
import com.mypurecloud.sdk.v2.model.FaxTopicUserData;
import com.mypurecloud.sdk.v2.model.FaxTopicWorkspaceData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * FaxTopicFaxDataV2
 */

public class FaxTopicFaxDataV2  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private FaxTopicWorkspaceData workspace = null;
  private FaxTopicUserData createdBy = null;
  private String contentType = null;
  private Integer contentLength = null;
  private String filename = null;
  private Integer changeNumber = null;
  private Date dateUploaded = null;
  private FaxTopicUserData uploadedBy = null;
  private FaxTopicLockData lockInfo = null;
  private String selfUri = null;
  private String callerAddress = null;
  private String receiverAddress = null;
  private Boolean read = null;

  
  /**
   **/
  public FaxTopicFaxDataV2 id(String id) {
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
  public FaxTopicFaxDataV2 name(String name) {
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
  public FaxTopicFaxDataV2 dateCreated(Date dateCreated) {
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
  public FaxTopicFaxDataV2 dateModified(Date dateModified) {
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
  public FaxTopicFaxDataV2 workspace(FaxTopicWorkspaceData workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public FaxTopicWorkspaceData getWorkspace() {
    return workspace;
  }
  public void setWorkspace(FaxTopicWorkspaceData workspace) {
    this.workspace = workspace;
  }

  
  /**
   **/
  public FaxTopicFaxDataV2 createdBy(FaxTopicUserData createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public FaxTopicUserData getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(FaxTopicUserData createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public FaxTopicFaxDataV2 contentType(String contentType) {
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
  public FaxTopicFaxDataV2 contentLength(Integer contentLength) {
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
  public FaxTopicFaxDataV2 filename(String filename) {
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
  public FaxTopicFaxDataV2 changeNumber(Integer changeNumber) {
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
  public FaxTopicFaxDataV2 dateUploaded(Date dateUploaded) {
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
  public FaxTopicFaxDataV2 uploadedBy(FaxTopicUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadedBy")
  public FaxTopicUserData getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(FaxTopicUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  
  /**
   **/
  public FaxTopicFaxDataV2 lockInfo(FaxTopicLockData lockInfo) {
    this.lockInfo = lockInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockInfo")
  public FaxTopicLockData getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(FaxTopicLockData lockInfo) {
    this.lockInfo = lockInfo;
  }

  
  /**
   **/
  public FaxTopicFaxDataV2 selfUri(String selfUri) {
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
  public FaxTopicFaxDataV2 callerAddress(String callerAddress) {
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
  public FaxTopicFaxDataV2 receiverAddress(String receiverAddress) {
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
  public FaxTopicFaxDataV2 read(Boolean read) {
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
    FaxTopicFaxDataV2 faxTopicFaxDataV2 = (FaxTopicFaxDataV2) o;
    return Objects.equals(this.id, faxTopicFaxDataV2.id) &&
        Objects.equals(this.name, faxTopicFaxDataV2.name) &&
        Objects.equals(this.dateCreated, faxTopicFaxDataV2.dateCreated) &&
        Objects.equals(this.dateModified, faxTopicFaxDataV2.dateModified) &&
        Objects.equals(this.workspace, faxTopicFaxDataV2.workspace) &&
        Objects.equals(this.createdBy, faxTopicFaxDataV2.createdBy) &&
        Objects.equals(this.contentType, faxTopicFaxDataV2.contentType) &&
        Objects.equals(this.contentLength, faxTopicFaxDataV2.contentLength) &&
        Objects.equals(this.filename, faxTopicFaxDataV2.filename) &&
        Objects.equals(this.changeNumber, faxTopicFaxDataV2.changeNumber) &&
        Objects.equals(this.dateUploaded, faxTopicFaxDataV2.dateUploaded) &&
        Objects.equals(this.uploadedBy, faxTopicFaxDataV2.uploadedBy) &&
        Objects.equals(this.lockInfo, faxTopicFaxDataV2.lockInfo) &&
        Objects.equals(this.selfUri, faxTopicFaxDataV2.selfUri) &&
        Objects.equals(this.callerAddress, faxTopicFaxDataV2.callerAddress) &&
        Objects.equals(this.receiverAddress, faxTopicFaxDataV2.receiverAddress) &&
        Objects.equals(this.read, faxTopicFaxDataV2.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, workspace, createdBy, contentType, contentLength, filename, changeNumber, dateUploaded, uploadedBy, lockInfo, selfUri, callerAddress, receiverAddress, read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxTopicFaxDataV2 {\n");
    
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

