package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.MessagingSettingReference;
import com.mypurecloud.sdk.v2.model.SupportedContentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * InstagramIntegration
 */

public class InstagramIntegration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private SupportedContentReference supportedContent = null;
  private MessagingSettingReference messagingSetting = null;
  private String appId = null;
  private String pageId = null;
  private String instagramId = null;
  private String instagramUsername = null;
  private String instagramName = null;
  private String instagramProfileImageUrl = null;
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

  public InstagramIntegration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "A unique Integration ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Instagram Integration
   **/
  public InstagramIntegration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Instagram Integration")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Defines the SupportedContent profile configured for an integration
   **/
  public InstagramIntegration supportedContent(SupportedContentReference supportedContent) {
    this.supportedContent = supportedContent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the SupportedContent profile configured for an integration")
  @JsonProperty("supportedContent")
  public SupportedContentReference getSupportedContent() {
    return supportedContent;
  }
  public void setSupportedContent(SupportedContentReference supportedContent) {
    this.supportedContent = supportedContent;
  }


  /**
   **/
  public InstagramIntegration messagingSetting(MessagingSettingReference messagingSetting) {
    this.messagingSetting = messagingSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messagingSetting")
  public MessagingSettingReference getMessagingSetting() {
    return messagingSetting;
  }
  public void setMessagingSetting(MessagingSettingReference messagingSetting) {
    this.messagingSetting = messagingSetting;
  }


  /**
   * The App ID from Facebook
   **/
  public InstagramIntegration appId(String appId) {
    this.appId = appId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The App ID from Facebook")
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }


  /**
   * The Page ID from Instagram messenger
   **/
  public InstagramIntegration pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Page ID from Instagram messenger")
  @JsonProperty("pageId")
  public String getPageId() {
    return pageId;
  }
  public void setPageId(String pageId) {
    this.pageId = pageId;
  }


  /**
   * The ID from Instagram messenger
   **/
  public InstagramIntegration instagramId(String instagramId) {
    this.instagramId = instagramId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID from Instagram messenger")
  @JsonProperty("instagramId")
  public String getInstagramId() {
    return instagramId;
  }
  public void setInstagramId(String instagramId) {
    this.instagramId = instagramId;
  }


  /**
   * The Username from Instagram messenger
   **/
  public InstagramIntegration instagramUsername(String instagramUsername) {
    this.instagramUsername = instagramUsername;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Username from Instagram messenger")
  @JsonProperty("instagramUsername")
  public String getInstagramUsername() {
    return instagramUsername;
  }
  public void setInstagramUsername(String instagramUsername) {
    this.instagramUsername = instagramUsername;
  }


  /**
   * The name from Instagram messenger
   **/
  public InstagramIntegration instagramName(String instagramName) {
    this.instagramName = instagramName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name from Instagram messenger")
  @JsonProperty("instagramName")
  public String getInstagramName() {
    return instagramName;
  }
  public void setInstagramName(String instagramName) {
    this.instagramName = instagramName;
  }


  /**
   * The url of the profile image from Instagram messenger
   **/
  public InstagramIntegration instagramProfileImageUrl(String instagramProfileImageUrl) {
    this.instagramProfileImageUrl = instagramProfileImageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url of the profile image from Instagram messenger")
  @JsonProperty("instagramProfileImageUrl")
  public String getInstagramProfileImageUrl() {
    return instagramProfileImageUrl;
  }
  public void setInstagramProfileImageUrl(String instagramProfileImageUrl) {
    this.instagramProfileImageUrl = instagramProfileImageUrl;
  }


  /**
   * The status of the Instagram Integration
   **/
  public InstagramIntegration status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the Instagram Integration")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @ApiModelProperty(example = "null", value = "The recipient reference associated to the Instagram Integration. This recipient is used to associate a flow to an integration")
  @JsonProperty("recipient")
  public DomainEntityRef getRecipient() {
    return recipient;
  }


  /**
   * Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InstagramIntegration dateCreated(Date dateCreated) {
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
  public InstagramIntegration dateModified(Date dateModified) {
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
  public InstagramIntegration createdBy(DomainEntityRef createdBy) {
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
  public InstagramIntegration modifiedBy(DomainEntityRef modifiedBy) {
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
  public InstagramIntegration version(Integer version) {
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
    InstagramIntegration instagramIntegration = (InstagramIntegration) o;

    return Objects.equals(this.id, instagramIntegration.id) &&
            Objects.equals(this.name, instagramIntegration.name) &&
            Objects.equals(this.supportedContent, instagramIntegration.supportedContent) &&
            Objects.equals(this.messagingSetting, instagramIntegration.messagingSetting) &&
            Objects.equals(this.appId, instagramIntegration.appId) &&
            Objects.equals(this.pageId, instagramIntegration.pageId) &&
            Objects.equals(this.instagramId, instagramIntegration.instagramId) &&
            Objects.equals(this.instagramUsername, instagramIntegration.instagramUsername) &&
            Objects.equals(this.instagramName, instagramIntegration.instagramName) &&
            Objects.equals(this.instagramProfileImageUrl, instagramIntegration.instagramProfileImageUrl) &&
            Objects.equals(this.status, instagramIntegration.status) &&
            Objects.equals(this.recipient, instagramIntegration.recipient) &&
            Objects.equals(this.dateCreated, instagramIntegration.dateCreated) &&
            Objects.equals(this.dateModified, instagramIntegration.dateModified) &&
            Objects.equals(this.createdBy, instagramIntegration.createdBy) &&
            Objects.equals(this.modifiedBy, instagramIntegration.modifiedBy) &&
            Objects.equals(this.version, instagramIntegration.version) &&
            Objects.equals(this.createStatus, instagramIntegration.createStatus) &&
            Objects.equals(this.createError, instagramIntegration.createError) &&
            Objects.equals(this.selfUri, instagramIntegration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, supportedContent, messagingSetting, appId, pageId, instagramId, instagramUsername, instagramName, instagramProfileImageUrl, status, recipient, dateCreated, dateModified, createdBy, modifiedBy, version, createStatus, createError, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstagramIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedContent: ").append(toIndentedString(supportedContent)).append("\n");
    sb.append("    messagingSetting: ").append(toIndentedString(messagingSetting)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    instagramId: ").append(toIndentedString(instagramId)).append("\n");
    sb.append("    instagramUsername: ").append(toIndentedString(instagramUsername)).append("\n");
    sb.append("    instagramName: ").append(toIndentedString(instagramName)).append("\n");
    sb.append("    instagramProfileImageUrl: ").append(toIndentedString(instagramProfileImageUrl)).append("\n");
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

