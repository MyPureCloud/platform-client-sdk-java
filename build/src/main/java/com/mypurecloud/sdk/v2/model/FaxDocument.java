package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentThumbnail;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * FaxDocument
 */

public class FaxDocument  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String contentUri = null;
  private UriReference workspace = null;
  private UriReference createdBy = null;
  private String contentType = null;
  private Long contentLength = null;
  private String filename = null;
  private Boolean read = null;
  private Long pageCount = null;
  private String callerAddress = null;
  private String receiverAddress = null;
  private List<DocumentThumbnail> thumbnails = new ArrayList<DocumentThumbnail>();
  private String sharingUri = null;
  private String downloadSharingUri = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public FaxDocument name(String name) {
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public FaxDocument dateCreated(Date dateCreated) {
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
  public FaxDocument dateModified(Date dateModified) {
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
  public FaxDocument contentUri(String contentUri) {
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
  public FaxDocument workspace(UriReference workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public UriReference getWorkspace() {
    return workspace;
  }
  public void setWorkspace(UriReference workspace) {
    this.workspace = workspace;
  }

  
  /**
   **/
  public FaxDocument createdBy(UriReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public UriReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UriReference createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public FaxDocument contentType(String contentType) {
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
  public FaxDocument contentLength(Long contentLength) {
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
  public FaxDocument filename(String filename) {
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
  public FaxDocument read(Boolean read) {
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

  
  /**
   **/
  public FaxDocument pageCount(Long pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageCount")
  public Long getPageCount() {
    return pageCount;
  }
  public void setPageCount(Long pageCount) {
    this.pageCount = pageCount;
  }

  
  /**
   **/
  public FaxDocument callerAddress(String callerAddress) {
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
  public FaxDocument receiverAddress(String receiverAddress) {
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
  public FaxDocument thumbnails(List<DocumentThumbnail> thumbnails) {
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
  public FaxDocument sharingUri(String sharingUri) {
    this.sharingUri = sharingUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharingUri")
  public String getSharingUri() {
    return sharingUri;
  }
  public void setSharingUri(String sharingUri) {
    this.sharingUri = sharingUri;
  }

  
  /**
   **/
  public FaxDocument downloadSharingUri(String downloadSharingUri) {
    this.downloadSharingUri = downloadSharingUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadSharingUri")
  public String getDownloadSharingUri() {
    return downloadSharingUri;
  }
  public void setDownloadSharingUri(String downloadSharingUri) {
    this.downloadSharingUri = downloadSharingUri;
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
    FaxDocument faxDocument = (FaxDocument) o;
    return Objects.equals(this.id, faxDocument.id) &&
        Objects.equals(this.name, faxDocument.name) &&
        Objects.equals(this.dateCreated, faxDocument.dateCreated) &&
        Objects.equals(this.dateModified, faxDocument.dateModified) &&
        Objects.equals(this.contentUri, faxDocument.contentUri) &&
        Objects.equals(this.workspace, faxDocument.workspace) &&
        Objects.equals(this.createdBy, faxDocument.createdBy) &&
        Objects.equals(this.contentType, faxDocument.contentType) &&
        Objects.equals(this.contentLength, faxDocument.contentLength) &&
        Objects.equals(this.filename, faxDocument.filename) &&
        Objects.equals(this.read, faxDocument.read) &&
        Objects.equals(this.pageCount, faxDocument.pageCount) &&
        Objects.equals(this.callerAddress, faxDocument.callerAddress) &&
        Objects.equals(this.receiverAddress, faxDocument.receiverAddress) &&
        Objects.equals(this.thumbnails, faxDocument.thumbnails) &&
        Objects.equals(this.sharingUri, faxDocument.sharingUri) &&
        Objects.equals(this.downloadSharingUri, faxDocument.downloadSharingUri) &&
        Objects.equals(this.selfUri, faxDocument.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, contentUri, workspace, createdBy, contentType, contentLength, filename, read, pageCount, callerAddress, receiverAddress, thumbnails, sharingUri, downloadSharingUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    receiverAddress: ").append(toIndentedString(receiverAddress)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    sharingUri: ").append(toIndentedString(sharingUri)).append("\n");
    sb.append("    downloadSharingUri: ").append(toIndentedString(downloadSharingUri)).append("\n");
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

