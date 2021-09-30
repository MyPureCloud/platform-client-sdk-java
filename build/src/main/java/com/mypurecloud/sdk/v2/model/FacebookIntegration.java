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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * FacebookIntegration
 */

public class FacebookIntegration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String appId = null;
  private String pageId = null;
  private String pageName = null;
  private String pageProfileImageUrl = null;
  private String status = null;
  private DomainEntityRef recipient = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef modifiedBy = null;
  private Integer version = null;

  private static class CreateStatusEnumDeserializer extends StdDeserializer<CreateStatusEnum> {
    public CreateStatusEnumDeserializer() {
      super(CreateStatusEnumDeserializer.class);
    }

    @Override
    public CreateStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CreateStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of asynchronous create operation
   */
 @JsonDeserialize(using = CreateStatusEnumDeserializer.class)
  public enum CreateStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INITIATED("Initiated"),
    COMPLETED("Completed"),
    ERROR("Error");

    private String value;

    CreateStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CreateStatusEnum fromString(String key) {
      if (key == null) return null;

      for (CreateStatusEnum value : CreateStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CreateStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CreateStatusEnum createStatus = null;
  private ErrorBody createError = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", required = true, value = "A unique Integration Id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the Facebook Integration
   **/
  public FacebookIntegration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Facebook Integration")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The App Id from Facebook messenger
   **/
  public FacebookIntegration appId(String appId) {
    this.appId = appId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The App Id from Facebook messenger")
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  /**
   * The Page Id from Facebook messenger
   **/
  public FacebookIntegration pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Page Id from Facebook messenger")
  @JsonProperty("pageId")
  public String getPageId() {
    return pageId;
  }
  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  
  @ApiModelProperty(example = "null", value = "The name of the Facebook page")
  @JsonProperty("pageName")
  public String getPageName() {
    return pageName;
  }

  
  @ApiModelProperty(example = "null", value = "The url of the profile image of the Facebook page")
  @JsonProperty("pageProfileImageUrl")
  public String getPageProfileImageUrl() {
    return pageProfileImageUrl;
  }

  
  /**
   * The status of the Facebook Integration
   **/
  public FacebookIntegration status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the Facebook Integration")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  @ApiModelProperty(example = "null", value = "The recipient reference associated to the Facebook Integration. This recipient is used to associate a flow to an integration")
  @JsonProperty("recipient")
  public DomainEntityRef getRecipient() {
    return recipient;
  }

  
  /**
   * Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FacebookIntegration dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date this Integration was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FacebookIntegration dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this Integration was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * User reference that created this Integration
   **/
  public FacebookIntegration createdBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User reference that created this Integration")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * User reference that last modified this Integration
   **/
  public FacebookIntegration modifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User reference that last modified this Integration")
  @JsonProperty("modifiedBy")
  public DomainEntityRef getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * Version number required for updates.
   **/
  public FacebookIntegration version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version number required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  @ApiModelProperty(example = "null", value = "Status of asynchronous create operation")
  @JsonProperty("createStatus")
  public CreateStatusEnum getCreateStatus() {
    return createStatus;
  }

  
  @ApiModelProperty(example = "null", value = "Error information returned, if createStatus is set to Error")
  @JsonProperty("createError")
  public ErrorBody getCreateError() {
    return createError;
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
    FacebookIntegration facebookIntegration = (FacebookIntegration) o;
    return Objects.equals(this.id, facebookIntegration.id) &&
        Objects.equals(this.name, facebookIntegration.name) &&
        Objects.equals(this.appId, facebookIntegration.appId) &&
        Objects.equals(this.pageId, facebookIntegration.pageId) &&
        Objects.equals(this.pageName, facebookIntegration.pageName) &&
        Objects.equals(this.pageProfileImageUrl, facebookIntegration.pageProfileImageUrl) &&
        Objects.equals(this.status, facebookIntegration.status) &&
        Objects.equals(this.recipient, facebookIntegration.recipient) &&
        Objects.equals(this.dateCreated, facebookIntegration.dateCreated) &&
        Objects.equals(this.dateModified, facebookIntegration.dateModified) &&
        Objects.equals(this.createdBy, facebookIntegration.createdBy) &&
        Objects.equals(this.modifiedBy, facebookIntegration.modifiedBy) &&
        Objects.equals(this.version, facebookIntegration.version) &&
        Objects.equals(this.createStatus, facebookIntegration.createStatus) &&
        Objects.equals(this.createError, facebookIntegration.createError) &&
        Objects.equals(this.selfUri, facebookIntegration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, appId, pageId, pageName, pageProfileImageUrl, status, recipient, dateCreated, dateModified, createdBy, modifiedBy, version, createStatus, createError, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    pageProfileImageUrl: ").append(toIndentedString(pageProfileImageUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createStatus: ").append(toIndentedString(createStatus)).append("\n");
    sb.append("    createError: ").append(toIndentedString(createError)).append("\n");
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

