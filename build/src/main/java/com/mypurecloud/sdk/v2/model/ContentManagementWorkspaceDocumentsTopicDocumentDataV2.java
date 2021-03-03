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
import com.mypurecloud.sdk.v2.model.ContentManagementWorkspaceDocumentsTopicLockData;
import com.mypurecloud.sdk.v2.model.ContentManagementWorkspaceDocumentsTopicUserData;
import com.mypurecloud.sdk.v2.model.ContentManagementWorkspaceDocumentsTopicWorkspaceData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ContentManagementWorkspaceDocumentsTopicDocumentDataV2
 */

public class ContentManagementWorkspaceDocumentsTopicDocumentDataV2  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private ContentManagementWorkspaceDocumentsTopicWorkspaceData workspace = null;
  private ContentManagementWorkspaceDocumentsTopicUserData createdBy = null;
  private String contentType = null;
  private Integer contentLength = null;
  private String filename = null;
  private Integer changeNumber = null;
  private Date dateUploaded = null;
  private ContentManagementWorkspaceDocumentsTopicUserData uploadedBy = null;
  private ContentManagementWorkspaceDocumentsTopicLockData lockInfo = null;
  private String selfUri = null;

  
  /**
   **/
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 id(String id) {
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
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 name(String name) {
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
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 dateCreated(Date dateCreated) {
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
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 dateModified(Date dateModified) {
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
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 workspace(ContentManagementWorkspaceDocumentsTopicWorkspaceData workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public ContentManagementWorkspaceDocumentsTopicWorkspaceData getWorkspace() {
    return workspace;
  }
  public void setWorkspace(ContentManagementWorkspaceDocumentsTopicWorkspaceData workspace) {
    this.workspace = workspace;
  }

  
  /**
   **/
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 createdBy(ContentManagementWorkspaceDocumentsTopicUserData createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public ContentManagementWorkspaceDocumentsTopicUserData getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(ContentManagementWorkspaceDocumentsTopicUserData createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 contentType(String contentType) {
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
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 contentLength(Integer contentLength) {
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
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 filename(String filename) {
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
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 changeNumber(Integer changeNumber) {
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
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 dateUploaded(Date dateUploaded) {
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
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 uploadedBy(ContentManagementWorkspaceDocumentsTopicUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadedBy")
  public ContentManagementWorkspaceDocumentsTopicUserData getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(ContentManagementWorkspaceDocumentsTopicUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  
  /**
   **/
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 lockInfo(ContentManagementWorkspaceDocumentsTopicLockData lockInfo) {
    this.lockInfo = lockInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockInfo")
  public ContentManagementWorkspaceDocumentsTopicLockData getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(ContentManagementWorkspaceDocumentsTopicLockData lockInfo) {
    this.lockInfo = lockInfo;
  }

  
  /**
   **/
  public ContentManagementWorkspaceDocumentsTopicDocumentDataV2 selfUri(String selfUri) {
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
    ContentManagementWorkspaceDocumentsTopicDocumentDataV2 contentManagementWorkspaceDocumentsTopicDocumentDataV2 = (ContentManagementWorkspaceDocumentsTopicDocumentDataV2) o;
    return Objects.equals(this.id, contentManagementWorkspaceDocumentsTopicDocumentDataV2.id) &&
        Objects.equals(this.name, contentManagementWorkspaceDocumentsTopicDocumentDataV2.name) &&
        Objects.equals(this.dateCreated, contentManagementWorkspaceDocumentsTopicDocumentDataV2.dateCreated) &&
        Objects.equals(this.dateModified, contentManagementWorkspaceDocumentsTopicDocumentDataV2.dateModified) &&
        Objects.equals(this.workspace, contentManagementWorkspaceDocumentsTopicDocumentDataV2.workspace) &&
        Objects.equals(this.createdBy, contentManagementWorkspaceDocumentsTopicDocumentDataV2.createdBy) &&
        Objects.equals(this.contentType, contentManagementWorkspaceDocumentsTopicDocumentDataV2.contentType) &&
        Objects.equals(this.contentLength, contentManagementWorkspaceDocumentsTopicDocumentDataV2.contentLength) &&
        Objects.equals(this.filename, contentManagementWorkspaceDocumentsTopicDocumentDataV2.filename) &&
        Objects.equals(this.changeNumber, contentManagementWorkspaceDocumentsTopicDocumentDataV2.changeNumber) &&
        Objects.equals(this.dateUploaded, contentManagementWorkspaceDocumentsTopicDocumentDataV2.dateUploaded) &&
        Objects.equals(this.uploadedBy, contentManagementWorkspaceDocumentsTopicDocumentDataV2.uploadedBy) &&
        Objects.equals(this.lockInfo, contentManagementWorkspaceDocumentsTopicDocumentDataV2.lockInfo) &&
        Objects.equals(this.selfUri, contentManagementWorkspaceDocumentsTopicDocumentDataV2.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, workspace, createdBy, contentType, contentLength, filename, changeNumber, dateUploaded, uploadedBy, lockInfo, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentManagementWorkspaceDocumentsTopicDocumentDataV2 {\n");
    
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

