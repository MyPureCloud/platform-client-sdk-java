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
import com.mypurecloud.sdk.v2.model.CustomSmtpServerRequest;
import com.mypurecloud.sdk.v2.model.EmailSettingReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundDomainPatchRequest
 */

public class OutboundDomainPatchRequest  implements Serializable {
  
  private CustomSmtpServerRequest customSMTPServer = null;

  private static class SenderTypeEnumDeserializer extends StdDeserializer<SenderTypeEnum> {
    public SenderTypeEnumDeserializer() {
      super(SenderTypeEnumDeserializer.class);
    }

    @Override
    public SenderTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SenderTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Sender Type
   */
 @JsonDeserialize(using = SenderTypeEnumDeserializer.class)
  public enum SenderTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    EMAILDOMAIN("EmailDomain"),
    MOCKEMAILDOMAIN("MockEmailDomain"),
    EMAILSMTPDOMAIN("EmailSmtpDomain");

    private String value;

    SenderTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SenderTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SenderTypeEnum value : SenderTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SenderTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SenderTypeEnum senderType = null;
  private EmailSettingReference emailSetting = null;

  public OutboundDomainPatchRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OutboundDomainPatchRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The custom SMTP server integration to use when sending outbound emails from this domain.
   **/
  public OutboundDomainPatchRequest customSMTPServer(CustomSmtpServerRequest customSMTPServer) {
    this.customSMTPServer = customSMTPServer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The custom SMTP server integration to use when sending outbound emails from this domain.")
  @JsonProperty("customSMTPServer")
  public CustomSmtpServerRequest getCustomSMTPServer() {
    return customSMTPServer;
  }
  public void setCustomSMTPServer(CustomSmtpServerRequest customSMTPServer) {
    this.customSMTPServer = customSMTPServer;
  }


  /**
   * Sender Type
   **/
  public OutboundDomainPatchRequest senderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sender Type")
  @JsonProperty("senderType")
  public SenderTypeEnum getSenderType() {
    return senderType;
  }
  public void setSenderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
  }


  /**
   * The email settings to associate with this domain.
   **/
  public OutboundDomainPatchRequest emailSetting(EmailSettingReference emailSetting) {
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
    OutboundDomainPatchRequest outboundDomainPatchRequest = (OutboundDomainPatchRequest) o;

    return Objects.equals(this.customSMTPServer, outboundDomainPatchRequest.customSMTPServer) &&
            Objects.equals(this.senderType, outboundDomainPatchRequest.senderType) &&
            Objects.equals(this.emailSetting, outboundDomainPatchRequest.emailSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customSMTPServer, senderType, emailSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundDomainPatchRequest {\n");
    
    sb.append("    customSMTPServer: ").append(toIndentedString(customSMTPServer)).append("\n");
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
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

