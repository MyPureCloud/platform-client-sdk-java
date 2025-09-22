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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EmailSettingReference;
import com.mypurecloud.sdk.v2.model.MailFromResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InboundDomainCreateRequest
 */

public class InboundDomainCreateRequest  implements Serializable {
  
  private String id = null;
  private Boolean subDomain = null;
  private MailFromResult mailFromSettings = null;
  private DomainEntityRef customSMTPServer = null;
  private EmailSettingReference emailSetting = null;

  public InboundDomainCreateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique Id of the domain such as: example.com
   **/
  public InboundDomainCreateRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Id of the domain such as: example.com")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Indicates if this a PureCloud sub-domain. If true, then the appropriate DNS records are created for sending/receiving email.
   **/
  public InboundDomainCreateRequest subDomain(Boolean subDomain) {
    this.subDomain = subDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if this a PureCloud sub-domain. If true, then the appropriate DNS records are created for sending/receiving email.")
  @JsonProperty("subDomain")
  public Boolean getSubDomain() {
    return subDomain;
  }
  public void setSubDomain(Boolean subDomain) {
    this.subDomain = subDomain;
  }


  /**
   * The DNS settings if the inbound domain is using a custom Mail From. These settings can only be used on InboundDomains where subDomain is false.
   **/
  public InboundDomainCreateRequest mailFromSettings(MailFromResult mailFromSettings) {
    this.mailFromSettings = mailFromSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The DNS settings if the inbound domain is using a custom Mail From. These settings can only be used on InboundDomains where subDomain is false.")
  @JsonProperty("mailFromSettings")
  public MailFromResult getMailFromSettings() {
    return mailFromSettings;
  }
  public void setMailFromSettings(MailFromResult mailFromSettings) {
    this.mailFromSettings = mailFromSettings;
  }


  /**
   * The custom SMTP server integration to use when sending outbound emails from this domain.
   **/
  public InboundDomainCreateRequest customSMTPServer(DomainEntityRef customSMTPServer) {
    this.customSMTPServer = customSMTPServer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The custom SMTP server integration to use when sending outbound emails from this domain.")
  @JsonProperty("customSMTPServer")
  public DomainEntityRef getCustomSMTPServer() {
    return customSMTPServer;
  }
  public void setCustomSMTPServer(DomainEntityRef customSMTPServer) {
    this.customSMTPServer = customSMTPServer;
  }


  /**
   * The email settings to associate with this domain.
   **/
  public InboundDomainCreateRequest emailSetting(EmailSettingReference emailSetting) {
    this.emailSetting = emailSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email settings to associate with this domain.")
  @JsonProperty("emailSetting")
  public EmailSettingReference getEmailSetting() {
    return emailSetting;
  }
  public void setEmailSetting(EmailSettingReference emailSetting) {
    this.emailSetting = emailSetting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundDomainCreateRequest inboundDomainCreateRequest = (InboundDomainCreateRequest) o;

    return Objects.equals(this.id, inboundDomainCreateRequest.id) &&
            Objects.equals(this.subDomain, inboundDomainCreateRequest.subDomain) &&
            Objects.equals(this.mailFromSettings, inboundDomainCreateRequest.mailFromSettings) &&
            Objects.equals(this.customSMTPServer, inboundDomainCreateRequest.customSMTPServer) &&
            Objects.equals(this.emailSetting, inboundDomainCreateRequest.emailSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subDomain, mailFromSettings, customSMTPServer, emailSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundDomainCreateRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subDomain: ").append(toIndentedString(subDomain)).append("\n");
    sb.append("    mailFromSettings: ").append(toIndentedString(mailFromSettings)).append("\n");
    sb.append("    customSMTPServer: ").append(toIndentedString(customSMTPServer)).append("\n");
    sb.append("    emailSetting: ").append(toIndentedString(emailSetting)).append("\n");
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

