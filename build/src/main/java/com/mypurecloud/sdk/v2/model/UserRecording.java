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
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.DocumentThumbnail;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * UserRecording
 */

public class UserRecording  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String contentUri = null;
  private DomainEntityRef workspace = null;
  private DomainEntityRef createdBy = null;
  private Conversation conversation = null;
  private Long contentLength = null;
  private Long durationMilliseconds = null;
  private List<DocumentThumbnail> thumbnails = new ArrayList<DocumentThumbnail>();
  private Boolean read = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UserRecording name(String name) {
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserRecording dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserRecording dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public UserRecording contentUri(String contentUri) {
    this.contentUri = contentUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentUri")
  public String getContentUri() {
    return contentUri;
  }
  public void setContentUri(String contentUri) {
    this.contentUri = contentUri;
  }

  
  /**
   **/
  public UserRecording workspace(DomainEntityRef workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public DomainEntityRef getWorkspace() {
    return workspace;
  }
  public void setWorkspace(DomainEntityRef workspace) {
    this.workspace = workspace;
  }

  
  /**
   **/
  public UserRecording createdBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public UserRecording conversation(Conversation conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversation")
  public Conversation getConversation() {
    return conversation;
  }
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  
  /**
   **/
  public UserRecording contentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentLength")
  public Long getContentLength() {
    return contentLength;
  }
  public void setContentLength(Long contentLength) {
    this.contentLength = contentLength;
  }

  
  /**
   **/
  public UserRecording durationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMilliseconds")
  public Long getDurationMilliseconds() {
    return durationMilliseconds;
  }
  public void setDurationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
  }

  
  /**
   **/
  public UserRecording thumbnails(List<DocumentThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thumbnails")
  public List<DocumentThumbnail> getThumbnails() {
    return thumbnails;
  }
  public void setThumbnails(List<DocumentThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }

  
  /**
   **/
  public UserRecording read(Boolean read) {
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
    UserRecording userRecording = (UserRecording) o;
    return Objects.equals(this.id, userRecording.id) &&
        Objects.equals(this.name, userRecording.name) &&
        Objects.equals(this.dateCreated, userRecording.dateCreated) &&
        Objects.equals(this.dateModified, userRecording.dateModified) &&
        Objects.equals(this.contentUri, userRecording.contentUri) &&
        Objects.equals(this.workspace, userRecording.workspace) &&
        Objects.equals(this.createdBy, userRecording.createdBy) &&
        Objects.equals(this.conversation, userRecording.conversation) &&
        Objects.equals(this.contentLength, userRecording.contentLength) &&
        Objects.equals(this.durationMilliseconds, userRecording.durationMilliseconds) &&
        Objects.equals(this.thumbnails, userRecording.thumbnails) &&
        Objects.equals(this.read, userRecording.read) &&
        Objects.equals(this.selfUri, userRecording.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, contentUri, workspace, createdBy, conversation, contentLength, durationMilliseconds, thumbnails, read, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRecording {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    durationMilliseconds: ").append(toIndentedString(durationMilliseconds)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

