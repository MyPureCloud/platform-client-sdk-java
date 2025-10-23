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
import com.mypurecloud.sdk.v2.model.AppleAuthentication;
import com.mypurecloud.sdk.v2.model.AppleIMessageApp;
import com.mypurecloud.sdk.v2.model.AppleIdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.ApplePay;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.MessagingSettingReference;
import com.mypurecloud.sdk.v2.model.SupportedContentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AppleIntegration
 */

public class AppleIntegration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private SupportedContentReference supportedContent = null;
  private MessagingSettingReference messagingSetting = null;
  private String messagesForBusinessId = null;
  private String businessName = null;
  private String logoUrl = null;
  private String status = null;
  private DomainEntityRef recipient = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef modifiedBy = null;

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
  private AppleIMessageApp appleIMessageApp = null;
  private AppleAuthentication appleAuthentication = null;
  private ApplePay applePay = null;
  private AppleIdentityResolutionConfig identityResolution = null;
  private String selfUri = null;

  public AppleIntegration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "A unique integration Id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Apple messaging integration.
   **/
  public AppleIntegration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Apple messaging integration.")
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
  public AppleIntegration supportedContent(SupportedContentReference supportedContent) {
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
  public AppleIntegration messagingSetting(MessagingSettingReference messagingSetting) {
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
   * The Apple Messages for Business Id for the Apple messaging integration.
   **/
  public AppleIntegration messagesForBusinessId(String messagesForBusinessId) {
    this.messagesForBusinessId = messagesForBusinessId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Apple Messages for Business Id for the Apple messaging integration.")
  @JsonProperty("messagesForBusinessId")
  public String getMessagesForBusinessId() {
    return messagesForBusinessId;
  }
  public void setMessagesForBusinessId(String messagesForBusinessId) {
    this.messagesForBusinessId = messagesForBusinessId;
  }


  /**
   * The name of the business.
   **/
  public AppleIntegration businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the business.")
  @JsonProperty("businessName")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  /**
   * The url of the businesses logo.
   **/
  public AppleIntegration logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url of the businesses logo.")
  @JsonProperty("logoUrl")
  public String getLogoUrl() {
    return logoUrl;
  }
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  /**
   * The status of the Apple Integration
   **/
  public AppleIntegration status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the Apple Integration")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @ApiModelProperty(example = "null", value = "The recipient associated to the Apple messaging Integration. This recipient is used to associate a flow to an integration")
  @JsonProperty("recipient")
  public DomainEntityRef getRecipient() {
    return recipient;
  }


  /**
   * Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AppleIntegration dateCreated(Date dateCreated) {
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
   * Date this Integration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AppleIntegration dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this Integration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
  public AppleIntegration createdBy(DomainEntityRef createdBy) {
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
  public AppleIntegration modifiedBy(DomainEntityRef modifiedBy) {
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


  /**
   * Interactive Application (iMessage App) Settings.
   **/
  public AppleIntegration appleIMessageApp(AppleIMessageApp appleIMessageApp) {
    this.appleIMessageApp = appleIMessageApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Interactive Application (iMessage App) Settings.")
  @JsonProperty("appleIMessageApp")
  public AppleIMessageApp getAppleIMessageApp() {
    return appleIMessageApp;
  }
  public void setAppleIMessageApp(AppleIMessageApp appleIMessageApp) {
    this.appleIMessageApp = appleIMessageApp;
  }


  /**
   * The Apple Messages for Business authentication setting.
   **/
  public AppleIntegration appleAuthentication(AppleAuthentication appleAuthentication) {
    this.appleAuthentication = appleAuthentication;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Apple Messages for Business authentication setting.")
  @JsonProperty("appleAuthentication")
  public AppleAuthentication getAppleAuthentication() {
    return appleAuthentication;
  }
  public void setAppleAuthentication(AppleAuthentication appleAuthentication) {
    this.appleAuthentication = appleAuthentication;
  }


  /**
   * Apple Pay settings.
   **/
  public AppleIntegration applePay(ApplePay applePay) {
    this.applePay = applePay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apple Pay settings.")
  @JsonProperty("applePay")
  public ApplePay getApplePay() {
    return applePay;
  }
  public void setApplePay(ApplePay applePay) {
    this.applePay = applePay;
  }


  @ApiModelProperty(example = "null", value = "The configuration to control identity resolution.")
  @JsonProperty("identityResolution")
  public AppleIdentityResolutionConfig getIdentityResolution() {
    return identityResolution;
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
    AppleIntegration appleIntegration = (AppleIntegration) o;

    return Objects.equals(this.id, appleIntegration.id) &&
            Objects.equals(this.name, appleIntegration.name) &&
            Objects.equals(this.supportedContent, appleIntegration.supportedContent) &&
            Objects.equals(this.messagingSetting, appleIntegration.messagingSetting) &&
            Objects.equals(this.messagesForBusinessId, appleIntegration.messagesForBusinessId) &&
            Objects.equals(this.businessName, appleIntegration.businessName) &&
            Objects.equals(this.logoUrl, appleIntegration.logoUrl) &&
            Objects.equals(this.status, appleIntegration.status) &&
            Objects.equals(this.recipient, appleIntegration.recipient) &&
            Objects.equals(this.dateCreated, appleIntegration.dateCreated) &&
            Objects.equals(this.dateModified, appleIntegration.dateModified) &&
            Objects.equals(this.createdBy, appleIntegration.createdBy) &&
            Objects.equals(this.modifiedBy, appleIntegration.modifiedBy) &&
            Objects.equals(this.createStatus, appleIntegration.createStatus) &&
            Objects.equals(this.createError, appleIntegration.createError) &&
            Objects.equals(this.appleIMessageApp, appleIntegration.appleIMessageApp) &&
            Objects.equals(this.appleAuthentication, appleIntegration.appleAuthentication) &&
            Objects.equals(this.applePay, appleIntegration.applePay) &&
            Objects.equals(this.identityResolution, appleIntegration.identityResolution) &&
            Objects.equals(this.selfUri, appleIntegration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, supportedContent, messagingSetting, messagesForBusinessId, businessName, logoUrl, status, recipient, dateCreated, dateModified, createdBy, modifiedBy, createStatus, createError, appleIMessageApp, appleAuthentication, applePay, identityResolution, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedContent: ").append(toIndentedString(supportedContent)).append("\n");
    sb.append("    messagingSetting: ").append(toIndentedString(messagingSetting)).append("\n");
    sb.append("    messagesForBusinessId: ").append(toIndentedString(messagesForBusinessId)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createStatus: ").append(toIndentedString(createStatus)).append("\n");
    sb.append("    createError: ").append(toIndentedString(createError)).append("\n");
    sb.append("    appleIMessageApp: ").append(toIndentedString(appleIMessageApp)).append("\n");
    sb.append("    appleAuthentication: ").append(toIndentedString(appleAuthentication)).append("\n");
    sb.append("    applePay: ").append(toIndentedString(applePay)).append("\n");
    sb.append("    identityResolution: ").append(toIndentedString(identityResolution)).append("\n");
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

