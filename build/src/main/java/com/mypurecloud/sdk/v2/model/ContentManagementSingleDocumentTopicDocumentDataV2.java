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
import com.mypurecloud.sdk.v2.model.ContentManagementSingleDocumentTopicLockData;
import com.mypurecloud.sdk.v2.model.ContentManagementSingleDocumentTopicUserData;
import com.mypurecloud.sdk.v2.model.ContentManagementSingleDocumentTopicWorkspaceData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ContentManagementSingleDocumentTopicDocumentDataV2
 */

public class ContentManagementSingleDocumentTopicDocumentDataV2  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private ContentManagementSingleDocumentTopicWorkspaceData workspace = null;
  private ContentManagementSingleDocumentTopicUserData createdBy = null;
  private String contentType = null;
  private Integer contentLength = null;
  private String filename = null;
  private Integer changeNumber = null;
  private Date dateUploaded = null;
  private ContentManagementSingleDocumentTopicUserData uploadedBy = null;
  private ContentManagementSingleDocumentTopicLockData lockInfo = null;
  private String selfUri = null;

  
  /**
   **/
  public ContentManagementSingleDocumentTopicDocumentDataV2 id(String id) {
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
  public ContentManagementSingleDocumentTopicDocumentDataV2 name(String name) {
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
  public ContentManagementSingleDocumentTopicDocumentDataV2 dateCreated(Date dateCreated) {
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
  public ContentManagementSingleDocumentTopicDocumentDataV2 dateModified(Date dateModified) {
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
  public ContentManagementSingleDocumentTopicDocumentDataV2 workspace(ContentManagementSingleDocumentTopicWorkspaceData workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public ContentManagementSingleDocumentTopicWorkspaceData getWorkspace() {
    return workspace;
  }
  public void setWorkspace(ContentManagementSingleDocumentTopicWorkspaceData workspace) {
    this.workspace = workspace;
  }

  
  /**
   **/
  public ContentManagementSingleDocumentTopicDocumentDataV2 createdBy(ContentManagementSingleDocumentTopicUserData createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public ContentManagementSingleDocumentTopicUserData getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(ContentManagementSingleDocumentTopicUserData createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public ContentManagementSingleDocumentTopicDocumentDataV2 contentType(String contentType) {
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
  public ContentManagementSingleDocumentTopicDocumentDataV2 contentLength(Integer contentLength) {
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
  public ContentManagementSingleDocumentTopicDocumentDataV2 filename(String filename) {
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
  public ContentManagementSingleDocumentTopicDocumentDataV2 changeNumber(Integer changeNumber) {
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
  public ContentManagementSingleDocumentTopicDocumentDataV2 dateUploaded(Date dateUploaded) {
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
  public ContentManagementSingleDocumentTopicDocumentDataV2 uploadedBy(ContentManagementSingleDocumentTopicUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadedBy")
  public ContentManagementSingleDocumentTopicUserData getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(ContentManagementSingleDocumentTopicUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  
  /**
   **/
  public ContentManagementSingleDocumentTopicDocumentDataV2 lockInfo(ContentManagementSingleDocumentTopicLockData lockInfo) {
    this.lockInfo = lockInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockInfo")
  public ContentManagementSingleDocumentTopicLockData getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(ContentManagementSingleDocumentTopicLockData lockInfo) {
    this.lockInfo = lockInfo;
  }

  
  /**
   **/
  public ContentManagementSingleDocumentTopicDocumentDataV2 selfUri(String selfUri) {
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
    ContentManagementSingleDocumentTopicDocumentDataV2 contentManagementSingleDocumentTopicDocumentDataV2 = (ContentManagementSingleDocumentTopicDocumentDataV2) o;
    return Objects.equals(this.id, contentManagementSingleDocumentTopicDocumentDataV2.id) &&
        Objects.equals(this.name, contentManagementSingleDocumentTopicDocumentDataV2.name) &&
        Objects.equals(this.dateCreated, contentManagementSingleDocumentTopicDocumentDataV2.dateCreated) &&
        Objects.equals(this.dateModified, contentManagementSingleDocumentTopicDocumentDataV2.dateModified) &&
        Objects.equals(this.workspace, contentManagementSingleDocumentTopicDocumentDataV2.workspace) &&
        Objects.equals(this.createdBy, contentManagementSingleDocumentTopicDocumentDataV2.createdBy) &&
        Objects.equals(this.contentType, contentManagementSingleDocumentTopicDocumentDataV2.contentType) &&
        Objects.equals(this.contentLength, contentManagementSingleDocumentTopicDocumentDataV2.contentLength) &&
        Objects.equals(this.filename, contentManagementSingleDocumentTopicDocumentDataV2.filename) &&
        Objects.equals(this.changeNumber, contentManagementSingleDocumentTopicDocumentDataV2.changeNumber) &&
        Objects.equals(this.dateUploaded, contentManagementSingleDocumentTopicDocumentDataV2.dateUploaded) &&
        Objects.equals(this.uploadedBy, contentManagementSingleDocumentTopicDocumentDataV2.uploadedBy) &&
        Objects.equals(this.lockInfo, contentManagementSingleDocumentTopicDocumentDataV2.lockInfo) &&
        Objects.equals(this.selfUri, contentManagementSingleDocumentTopicDocumentDataV2.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, workspace, createdBy, contentType, contentLength, filename, changeNumber, dateUploaded, uploadedBy, lockInfo, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentManagementSingleDocumentTopicDocumentDataV2 {\n");
    
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

