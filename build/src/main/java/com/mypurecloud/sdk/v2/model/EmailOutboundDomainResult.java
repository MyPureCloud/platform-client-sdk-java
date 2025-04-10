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
import com.mypurecloud.sdk.v2.model.DnsRecordEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EmailOutboundDomainResult
 */

public class EmailOutboundDomainResult  implements Serializable {
  
  private DnsRecordEntry dnsCnameBounceRecord = null;
  private DnsRecordEntry dnsTxtSendingRecord = null;
  private String domainName = null;

  private static class SenderStatusEnumDeserializer extends StdDeserializer<SenderStatusEnum> {
    public SenderStatusEnumDeserializer() {
      super(SenderStatusEnumDeserializer.class);
    }

    @Override
    public SenderStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SenderStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets senderStatus
   */
 @JsonDeserialize(using = SenderStatusEnumDeserializer.class)
  public enum SenderStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REQUESTRECEIVED("RequestReceived"),
    PROVISIONREQUESTSENTVENDOR("ProvisionRequestSentVendor"),
    PROVISIONED("Provisioned"),
    ERROR("Error"),
    DEPROVISIONED("Deprovisioned");

    private String value;

    SenderStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SenderStatusEnum fromString(String key) {
      if (key == null) return null;

      for (SenderStatusEnum value : SenderStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SenderStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SenderStatusEnum senderStatus = null;

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
   * Gets or Sets senderType
   */
 @JsonDeserialize(using = SenderTypeEnumDeserializer.class)
  public enum SenderTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    EMAILDOMAIN("EmailDomain"),
    MOCKEMAILDOMAIN("MockEmailDomain");

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

  public EmailOutboundDomainResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public EmailOutboundDomainResult dnsCnameBounceRecord(DnsRecordEntry dnsCnameBounceRecord) {
    this.dnsCnameBounceRecord = dnsCnameBounceRecord;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dnsCnameBounceRecord")
  public DnsRecordEntry getDnsCnameBounceRecord() {
    return dnsCnameBounceRecord;
  }
  public void setDnsCnameBounceRecord(DnsRecordEntry dnsCnameBounceRecord) {
    this.dnsCnameBounceRecord = dnsCnameBounceRecord;
  }


  /**
   **/
  public EmailOutboundDomainResult dnsTxtSendingRecord(DnsRecordEntry dnsTxtSendingRecord) {
    this.dnsTxtSendingRecord = dnsTxtSendingRecord;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dnsTxtSendingRecord")
  public DnsRecordEntry getDnsTxtSendingRecord() {
    return dnsTxtSendingRecord;
  }
  public void setDnsTxtSendingRecord(DnsRecordEntry dnsTxtSendingRecord) {
    this.dnsTxtSendingRecord = dnsTxtSendingRecord;
  }


  /**
   **/
  public EmailOutboundDomainResult domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domainName")
  public String getDomainName() {
    return domainName;
  }
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  /**
   **/
  public EmailOutboundDomainResult senderStatus(SenderStatusEnum senderStatus) {
    this.senderStatus = senderStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("senderStatus")
  public SenderStatusEnum getSenderStatus() {
    return senderStatus;
  }
  public void setSenderStatus(SenderStatusEnum senderStatus) {
    this.senderStatus = senderStatus;
  }


  /**
   **/
  public EmailOutboundDomainResult senderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("senderType")
  public SenderTypeEnum getSenderType() {
    return senderType;
  }
  public void setSenderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailOutboundDomainResult emailOutboundDomainResult = (EmailOutboundDomainResult) o;

    return Objects.equals(this.dnsCnameBounceRecord, emailOutboundDomainResult.dnsCnameBounceRecord) &&
            Objects.equals(this.dnsTxtSendingRecord, emailOutboundDomainResult.dnsTxtSendingRecord) &&
            Objects.equals(this.domainName, emailOutboundDomainResult.domainName) &&
            Objects.equals(this.senderStatus, emailOutboundDomainResult.senderStatus) &&
            Objects.equals(this.senderType, emailOutboundDomainResult.senderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsCnameBounceRecord, dnsTxtSendingRecord, domainName, senderStatus, senderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailOutboundDomainResult {\n");
    
    sb.append("    dnsCnameBounceRecord: ").append(toIndentedString(dnsCnameBounceRecord)).append("\n");
    sb.append("    dnsTxtSendingRecord: ").append(toIndentedString(dnsTxtSendingRecord)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    senderStatus: ").append(toIndentedString(senderStatus)).append("\n");
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
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

