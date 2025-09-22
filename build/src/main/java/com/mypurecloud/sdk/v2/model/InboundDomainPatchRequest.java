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
import com.mypurecloud.sdk.v2.model.ImapSettings;
import com.mypurecloud.sdk.v2.model.MailFromResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InboundDomainPatchRequest
 */

public class InboundDomainPatchRequest  implements Serializable {
  
  private MailFromResult mailFromSettings = null;
  private DomainEntityRef customSMTPServer = null;
  private ImapSettings imapSettings = null;
  private EmailSettingReference emailSetting = null;

  public InboundDomainPatchRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The DNS settings if the inbound domain is using a custom Mail From. These settings can only be used on InboundDomains where subDomain is false.
   **/
  public InboundDomainPatchRequest mailFromSettings(MailFromResult mailFromSettings) {
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
  public InboundDomainPatchRequest customSMTPServer(DomainEntityRef customSMTPServer) {
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
   * The IMAP server integration and settings to use for processing inbound emails.
   **/
  public InboundDomainPatchRequest imapSettings(ImapSettings imapSettings) {
    this.imapSettings = imapSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IMAP server integration and settings to use for processing inbound emails.")
  @JsonProperty("imapSettings")
  public ImapSettings getImapSettings() {
    return imapSettings;
  }
  public void setImapSettings(ImapSettings imapSettings) {
    this.imapSettings = imapSettings;
  }


  /**
   * The email settings to associate with this domain.
   **/
  public InboundDomainPatchRequest emailSetting(EmailSettingReference emailSetting) {
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
    InboundDomainPatchRequest inboundDomainPatchRequest = (InboundDomainPatchRequest) o;

    return Objects.equals(this.mailFromSettings, inboundDomainPatchRequest.mailFromSettings) &&
            Objects.equals(this.customSMTPServer, inboundDomainPatchRequest.customSMTPServer) &&
            Objects.equals(this.imapSettings, inboundDomainPatchRequest.imapSettings) &&
            Objects.equals(this.emailSetting, inboundDomainPatchRequest.emailSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailFromSettings, customSMTPServer, imapSettings, emailSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundDomainPatchRequest {\n");
    
    sb.append("    mailFromSettings: ").append(toIndentedString(mailFromSettings)).append("\n");
    sb.append("    customSMTPServer: ").append(toIndentedString(customSMTPServer)).append("\n");
    sb.append("    imapSettings: ").append(toIndentedString(imapSettings)).append("\n");
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

