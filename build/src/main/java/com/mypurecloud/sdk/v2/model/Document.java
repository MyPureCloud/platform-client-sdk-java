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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DocumentAttribute;
import com.mypurecloud.sdk.v2.model.DocumentThumbnail;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.LockInfo;
import com.mypurecloud.sdk.v2.model.TagValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Document
 */

public class Document  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer changeNumber = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date dateUploaded = null;
  private String contentUri = null;
  private DomainEntityRef workspace = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef uploadedBy = null;
  private String sharingUri = null;
  private String contentType = null;
  private Long contentLength = null;

  private static class SystemTypeEnumDeserializer extends StdDeserializer<SystemTypeEnum> {
    public SystemTypeEnumDeserializer() {
      super(SystemTypeEnumDeserializer.class);
    }

    @Override
    public SystemTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SystemTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets systemType
   */
 @JsonDeserialize(using = SystemTypeEnumDeserializer.class)
  public enum SystemTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DOCUMENT("DOCUMENT"),
    FAX("FAX"),
    RECORDING("RECORDING");

    private String value;

    SystemTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SystemTypeEnum value : SystemTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemTypeEnum systemType = null;
  private String filename = null;
  private Long pageCount = null;
  private Boolean read = null;
  private String callerAddress = null;
  private String receiverAddress = null;
  private List<String> tags = new ArrayList<String>();
  private List<TagValue> tagValues = new ArrayList<TagValue>();
  private List<DocumentAttribute> attributes = new ArrayList<DocumentAttribute>();
  private List<DocumentThumbnail> thumbnails = new ArrayList<DocumentThumbnail>();
  private DomainEntityRef uploadStatus = null;
  private String uploadDestinationUri = null;

  private static class UploadMethodEnumDeserializer extends StdDeserializer<UploadMethodEnum> {
    public UploadMethodEnumDeserializer() {
      super(UploadMethodEnumDeserializer.class);
    }

    @Override
    public UploadMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UploadMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets uploadMethod
   */
 @JsonDeserialize(using = UploadMethodEnumDeserializer.class)
  public enum UploadMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SINGLE_PUT("SINGLE_PUT"),
    MULTIPART_POST("MULTIPART_POST");

    private String value;

    UploadMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UploadMethodEnum fromString(String key) {
      if (key == null) return null;

      for (UploadMethodEnum value : UploadMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UploadMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UploadMethodEnum uploadMethod = null;
  private LockInfo lockInfo = null;
  private List<String> acl = new ArrayList<String>();

  private static class SharingStatusEnumDeserializer extends StdDeserializer<SharingStatusEnum> {
    public SharingStatusEnumDeserializer() {
      super(SharingStatusEnumDeserializer.class);
    }

    @Override
    public SharingStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SharingStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets sharingStatus
   */
 @JsonDeserialize(using = SharingStatusEnumDeserializer.class)
  public enum SharingStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("NONE"),
    LIMITED("LIMITED"),
    PUBLIC("PUBLIC");

    private String value;

    SharingStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SharingStatusEnum fromString(String key) {
      if (key == null) return null;

      for (SharingStatusEnum value : SharingStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SharingStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SharingStatusEnum sharingStatus = null;
  private String downloadSharingUri = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Document name(String name) {
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
  public Document changeNumber(Integer changeNumber) {
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Document dateCreated(Date dateCreated) {
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
  public Document dateModified(Date dateModified) {
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Document dateUploaded(Date dateUploaded) {
    this.dateUploaded = dateUploaded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateUploaded")
  public Date getDateUploaded() {
    return dateUploaded;
  }
  public void setDateUploaded(Date dateUploaded) {
    this.dateUploaded = dateUploaded;
  }

  
  /**
   **/
  public Document contentUri(String contentUri) {
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
  public Document workspace(DomainEntityRef workspace) {
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
  public Document createdBy(DomainEntityRef createdBy) {
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
  public Document uploadedBy(DomainEntityRef uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadedBy")
  public DomainEntityRef getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(DomainEntityRef uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  
  /**
   **/
  public Document sharingUri(String sharingUri) {
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
  public Document contentType(String contentType) {
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
  public Document contentLength(Long contentLength) {
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
  public Document systemType(SystemTypeEnum systemType) {
    this.systemType = systemType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("systemType")
  public SystemTypeEnum getSystemType() {
    return systemType;
  }
  public void setSystemType(SystemTypeEnum systemType) {
    this.systemType = systemType;
  }

  
  /**
   **/
  public Document filename(String filename) {
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
  public Document pageCount(Long pageCount) {
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
  public Document read(Boolean read) {
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
  public Document callerAddress(String callerAddress) {
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
  public Document receiverAddress(String receiverAddress) {
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
  public Document tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  /**
   **/
  public Document tagValues(List<TagValue> tagValues) {
    this.tagValues = tagValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tagValues")
  public List<TagValue> getTagValues() {
    return tagValues;
  }
  public void setTagValues(List<TagValue> tagValues) {
    this.tagValues = tagValues;
  }

  
  /**
   **/
  public Document attributes(List<DocumentAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributes")
  public List<DocumentAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<DocumentAttribute> attributes) {
    this.attributes = attributes;
  }

  
  /**
   **/
  public Document thumbnails(List<DocumentThumbnail> thumbnails) {
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
  public Document uploadStatus(DomainEntityRef uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadStatus")
  public DomainEntityRef getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(DomainEntityRef uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  
  /**
   **/
  public Document uploadDestinationUri(String uploadDestinationUri) {
    this.uploadDestinationUri = uploadDestinationUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadDestinationUri")
  public String getUploadDestinationUri() {
    return uploadDestinationUri;
  }
  public void setUploadDestinationUri(String uploadDestinationUri) {
    this.uploadDestinationUri = uploadDestinationUri;
  }

  
  /**
   **/
  public Document uploadMethod(UploadMethodEnum uploadMethod) {
    this.uploadMethod = uploadMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadMethod")
  public UploadMethodEnum getUploadMethod() {
    return uploadMethod;
  }
  public void setUploadMethod(UploadMethodEnum uploadMethod) {
    this.uploadMethod = uploadMethod;
  }

  
  /**
   **/
  public Document lockInfo(LockInfo lockInfo) {
    this.lockInfo = lockInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockInfo")
  public LockInfo getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(LockInfo lockInfo) {
    this.lockInfo = lockInfo;
  }

  
  /**
   * A list of permitted action rights for the user making the request
   **/
  public Document acl(List<String> acl) {
    this.acl = acl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of permitted action rights for the user making the request")
  @JsonProperty("acl")
  public List<String> getAcl() {
    return acl;
  }
  public void setAcl(List<String> acl) {
    this.acl = acl;
  }

  
  /**
   **/
  public Document sharingStatus(SharingStatusEnum sharingStatus) {
    this.sharingStatus = sharingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharingStatus")
  public SharingStatusEnum getSharingStatus() {
    return sharingStatus;
  }
  public void setSharingStatus(SharingStatusEnum sharingStatus) {
    this.sharingStatus = sharingStatus;
  }

  
  /**
   **/
  public Document downloadSharingUri(String downloadSharingUri) {
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
    Document document = (Document) o;
    return Objects.equals(this.id, document.id) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.changeNumber, document.changeNumber) &&
        Objects.equals(this.dateCreated, document.dateCreated) &&
        Objects.equals(this.dateModified, document.dateModified) &&
        Objects.equals(this.dateUploaded, document.dateUploaded) &&
        Objects.equals(this.contentUri, document.contentUri) &&
        Objects.equals(this.workspace, document.workspace) &&
        Objects.equals(this.createdBy, document.createdBy) &&
        Objects.equals(this.uploadedBy, document.uploadedBy) &&
        Objects.equals(this.sharingUri, document.sharingUri) &&
        Objects.equals(this.contentType, document.contentType) &&
        Objects.equals(this.contentLength, document.contentLength) &&
        Objects.equals(this.systemType, document.systemType) &&
        Objects.equals(this.filename, document.filename) &&
        Objects.equals(this.pageCount, document.pageCount) &&
        Objects.equals(this.read, document.read) &&
        Objects.equals(this.callerAddress, document.callerAddress) &&
        Objects.equals(this.receiverAddress, document.receiverAddress) &&
        Objects.equals(this.tags, document.tags) &&
        Objects.equals(this.tagValues, document.tagValues) &&
        Objects.equals(this.attributes, document.attributes) &&
        Objects.equals(this.thumbnails, document.thumbnails) &&
        Objects.equals(this.uploadStatus, document.uploadStatus) &&
        Objects.equals(this.uploadDestinationUri, document.uploadDestinationUri) &&
        Objects.equals(this.uploadMethod, document.uploadMethod) &&
        Objects.equals(this.lockInfo, document.lockInfo) &&
        Objects.equals(this.acl, document.acl) &&
        Objects.equals(this.sharingStatus, document.sharingStatus) &&
        Objects.equals(this.downloadSharingUri, document.downloadSharingUri) &&
        Objects.equals(this.selfUri, document.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, changeNumber, dateCreated, dateModified, dateUploaded, contentUri, workspace, createdBy, uploadedBy, sharingUri, contentType, contentLength, systemType, filename, pageCount, read, callerAddress, receiverAddress, tags, tagValues, attributes, thumbnails, uploadStatus, uploadDestinationUri, uploadMethod, lockInfo, acl, sharingStatus, downloadSharingUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateUploaded: ").append(toIndentedString(dateUploaded)).append("\n");
    sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
    sb.append("    sharingUri: ").append(toIndentedString(sharingUri)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    systemType: ").append(toIndentedString(systemType)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    receiverAddress: ").append(toIndentedString(receiverAddress)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    uploadDestinationUri: ").append(toIndentedString(uploadDestinationUri)).append("\n");
    sb.append("    uploadMethod: ").append(toIndentedString(uploadMethod)).append("\n");
    sb.append("    lockInfo: ").append(toIndentedString(lockInfo)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    sharingStatus: ").append(toIndentedString(sharingStatus)).append("\n");
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

