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
import com.mypurecloud.sdk.v2.model.AdhocRecordingTopicConversationData;
import com.mypurecloud.sdk.v2.model.AdhocRecordingTopicLockData;
import com.mypurecloud.sdk.v2.model.AdhocRecordingTopicUserData;
import com.mypurecloud.sdk.v2.model.AdhocRecordingTopicWorkspaceData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AdhocRecordingTopicRecordingDataV2
 */

public class AdhocRecordingTopicRecordingDataV2  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private AdhocRecordingTopicWorkspaceData workspace = null;
  private AdhocRecordingTopicUserData createdBy = null;
  private String contentType = null;
  private Integer contentLength = null;
  private String filename = null;
  private Integer changeNumber = null;
  private Date dateUploaded = null;
  private AdhocRecordingTopicUserData uploadedBy = null;
  private AdhocRecordingTopicLockData lockInfo = null;
  private String selfUri = null;
  private Integer durationMillieconds = null;
  private AdhocRecordingTopicConversationData conversation = null;
  private Boolean read = null;

  
  /**
   **/
  public AdhocRecordingTopicRecordingDataV2 id(String id) {
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
  public AdhocRecordingTopicRecordingDataV2 name(String name) {
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
  public AdhocRecordingTopicRecordingDataV2 dateCreated(Date dateCreated) {
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
  public AdhocRecordingTopicRecordingDataV2 dateModified(Date dateModified) {
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
  public AdhocRecordingTopicRecordingDataV2 workspace(AdhocRecordingTopicWorkspaceData workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public AdhocRecordingTopicWorkspaceData getWorkspace() {
    return workspace;
  }
  public void setWorkspace(AdhocRecordingTopicWorkspaceData workspace) {
    this.workspace = workspace;
  }

  
  /**
   **/
  public AdhocRecordingTopicRecordingDataV2 createdBy(AdhocRecordingTopicUserData createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public AdhocRecordingTopicUserData getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(AdhocRecordingTopicUserData createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public AdhocRecordingTopicRecordingDataV2 contentType(String contentType) {
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
  public AdhocRecordingTopicRecordingDataV2 contentLength(Integer contentLength) {
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
  public AdhocRecordingTopicRecordingDataV2 filename(String filename) {
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
  public AdhocRecordingTopicRecordingDataV2 changeNumber(Integer changeNumber) {
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
  public AdhocRecordingTopicRecordingDataV2 dateUploaded(Date dateUploaded) {
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
  public AdhocRecordingTopicRecordingDataV2 uploadedBy(AdhocRecordingTopicUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadedBy")
  public AdhocRecordingTopicUserData getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(AdhocRecordingTopicUserData uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  
  /**
   **/
  public AdhocRecordingTopicRecordingDataV2 lockInfo(AdhocRecordingTopicLockData lockInfo) {
    this.lockInfo = lockInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockInfo")
  public AdhocRecordingTopicLockData getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(AdhocRecordingTopicLockData lockInfo) {
    this.lockInfo = lockInfo;
  }

  
  /**
   **/
  public AdhocRecordingTopicRecordingDataV2 selfUri(String selfUri) {
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
  public AdhocRecordingTopicRecordingDataV2 durationMillieconds(Integer durationMillieconds) {
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
  public AdhocRecordingTopicRecordingDataV2 conversation(AdhocRecordingTopicConversationData conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversation")
  public AdhocRecordingTopicConversationData getConversation() {
    return conversation;
  }
  public void setConversation(AdhocRecordingTopicConversationData conversation) {
    this.conversation = conversation;
  }

  
  /**
   **/
  public AdhocRecordingTopicRecordingDataV2 read(Boolean read) {
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
    AdhocRecordingTopicRecordingDataV2 adhocRecordingTopicRecordingDataV2 = (AdhocRecordingTopicRecordingDataV2) o;
    return Objects.equals(this.id, adhocRecordingTopicRecordingDataV2.id) &&
        Objects.equals(this.name, adhocRecordingTopicRecordingDataV2.name) &&
        Objects.equals(this.dateCreated, adhocRecordingTopicRecordingDataV2.dateCreated) &&
        Objects.equals(this.dateModified, adhocRecordingTopicRecordingDataV2.dateModified) &&
        Objects.equals(this.workspace, adhocRecordingTopicRecordingDataV2.workspace) &&
        Objects.equals(this.createdBy, adhocRecordingTopicRecordingDataV2.createdBy) &&
        Objects.equals(this.contentType, adhocRecordingTopicRecordingDataV2.contentType) &&
        Objects.equals(this.contentLength, adhocRecordingTopicRecordingDataV2.contentLength) &&
        Objects.equals(this.filename, adhocRecordingTopicRecordingDataV2.filename) &&
        Objects.equals(this.changeNumber, adhocRecordingTopicRecordingDataV2.changeNumber) &&
        Objects.equals(this.dateUploaded, adhocRecordingTopicRecordingDataV2.dateUploaded) &&
        Objects.equals(this.uploadedBy, adhocRecordingTopicRecordingDataV2.uploadedBy) &&
        Objects.equals(this.lockInfo, adhocRecordingTopicRecordingDataV2.lockInfo) &&
        Objects.equals(this.selfUri, adhocRecordingTopicRecordingDataV2.selfUri) &&
        Objects.equals(this.durationMillieconds, adhocRecordingTopicRecordingDataV2.durationMillieconds) &&
        Objects.equals(this.conversation, adhocRecordingTopicRecordingDataV2.conversation) &&
        Objects.equals(this.read, adhocRecordingTopicRecordingDataV2.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, workspace, createdBy, contentType, contentLength, filename, changeNumber, dateUploaded, uploadedBy, lockInfo, selfUri, durationMillieconds, conversation, read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdhocRecordingTopicRecordingDataV2 {\n");
    
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

