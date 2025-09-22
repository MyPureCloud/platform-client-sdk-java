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
import com.mypurecloud.sdk.v2.model.EmailSetting;
import com.mypurecloud.sdk.v2.model.VerificationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundDomain
 */

public class OutboundDomain  implements Serializable {
  
  private String id = null;
  private String name = null;
  private VerificationResult cnameVerificationResult = null;
  private VerificationResult dkimVerificationResult = null;

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
  private EmailSetting emailSetting = null;
  private String selfUri = null;

  public OutboundDomain() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique Id of the domain such as: example.com
   **/
  public OutboundDomain id(String id) {
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
   **/
  public OutboundDomain name(String name) {
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
   * CNAME registration Status
   **/
  public OutboundDomain cnameVerificationResult(VerificationResult cnameVerificationResult) {
    this.cnameVerificationResult = cnameVerificationResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CNAME registration Status")
  @JsonProperty("cnameVerificationResult")
  public VerificationResult getCnameVerificationResult() {
    return cnameVerificationResult;
  }
  public void setCnameVerificationResult(VerificationResult cnameVerificationResult) {
    this.cnameVerificationResult = cnameVerificationResult;
  }


  /**
   * DKIM registration Status
   **/
  public OutboundDomain dkimVerificationResult(VerificationResult dkimVerificationResult) {
    this.dkimVerificationResult = dkimVerificationResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DKIM registration Status")
  @JsonProperty("dkimVerificationResult")
  public VerificationResult getDkimVerificationResult() {
    return dkimVerificationResult;
  }
  public void setDkimVerificationResult(VerificationResult dkimVerificationResult) {
    this.dkimVerificationResult = dkimVerificationResult;
  }


  /**
   * Sender Type
   **/
  public OutboundDomain senderType(SenderTypeEnum senderType) {
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
   * The email settings associated with this domain.
   **/
  public OutboundDomain emailSetting(EmailSetting emailSetting) {
    this.emailSetting = emailSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email settings associated with this domain.")
  @JsonProperty("emailSetting")
  public EmailSetting getEmailSetting() {
    return emailSetting;
  }
  public void setEmailSetting(EmailSetting emailSetting) {
    this.emailSetting = emailSetting;
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
    OutboundDomain outboundDomain = (OutboundDomain) o;

    return Objects.equals(this.id, outboundDomain.id) &&
            Objects.equals(this.name, outboundDomain.name) &&
            Objects.equals(this.cnameVerificationResult, outboundDomain.cnameVerificationResult) &&
            Objects.equals(this.dkimVerificationResult, outboundDomain.dkimVerificationResult) &&
            Objects.equals(this.senderType, outboundDomain.senderType) &&
            Objects.equals(this.emailSetting, outboundDomain.emailSetting) &&
            Objects.equals(this.selfUri, outboundDomain.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cnameVerificationResult, dkimVerificationResult, senderType, emailSetting, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundDomain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cnameVerificationResult: ").append(toIndentedString(cnameVerificationResult)).append("\n");
    sb.append("    dkimVerificationResult: ").append(toIndentedString(dkimVerificationResult)).append("\n");
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
    sb.append("    emailSetting: ").append(toIndentedString(emailSetting)).append("\n");
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

