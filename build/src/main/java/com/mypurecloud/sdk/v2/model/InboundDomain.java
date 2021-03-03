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
import com.mypurecloud.sdk.v2.model.MailFromResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InboundDomain
 */

public class InboundDomain  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class MxRecordStatusEnumDeserializer extends StdDeserializer<MxRecordStatusEnum> {
    public MxRecordStatusEnumDeserializer() {
      super(MxRecordStatusEnumDeserializer.class);
    }

    @Override
    public MxRecordStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MxRecordStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Mx Record Status
   */
 @JsonDeserialize(using = MxRecordStatusEnumDeserializer.class)
  public enum MxRecordStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VALID("VALID"),
    INVALID("INVALID"),
    NOT_AVAILABLE("NOT_AVAILABLE");

    private String value;

    MxRecordStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MxRecordStatusEnum fromString(String key) {
      if (key == null) return null;

      for (MxRecordStatusEnum value : MxRecordStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MxRecordStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MxRecordStatusEnum mxRecordStatus = null;
  private Boolean subDomain = null;
  private MailFromResult mailFromSettings = null;
  private DomainEntityRef customSMTPServer = null;
  private String selfUri = null;

  
  /**
   * Unique Id of the domain such as: example.com
   **/
  public InboundDomain id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique Id of the domain such as: example.com")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public InboundDomain name(String name) {
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
   * Mx Record Status
   **/
  public InboundDomain mxRecordStatus(MxRecordStatusEnum mxRecordStatus) {
    this.mxRecordStatus = mxRecordStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Mx Record Status")
  @JsonProperty("mxRecordStatus")
  public MxRecordStatusEnum getMxRecordStatus() {
    return mxRecordStatus;
  }
  public void setMxRecordStatus(MxRecordStatusEnum mxRecordStatus) {
    this.mxRecordStatus = mxRecordStatus;
  }

  
  /**
   * Indicates if this a PureCloud sub-domain.  If true, then the appropriate DNS records are created for sending/receiving email.
   **/
  public InboundDomain subDomain(Boolean subDomain) {
    this.subDomain = subDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if this a PureCloud sub-domain.  If true, then the appropriate DNS records are created for sending/receiving email.")
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
  public InboundDomain mailFromSettings(MailFromResult mailFromSettings) {
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
  public InboundDomain customSMTPServer(DomainEntityRef customSMTPServer) {
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
    InboundDomain inboundDomain = (InboundDomain) o;
    return Objects.equals(this.id, inboundDomain.id) &&
        Objects.equals(this.name, inboundDomain.name) &&
        Objects.equals(this.mxRecordStatus, inboundDomain.mxRecordStatus) &&
        Objects.equals(this.subDomain, inboundDomain.subDomain) &&
        Objects.equals(this.mailFromSettings, inboundDomain.mailFromSettings) &&
        Objects.equals(this.customSMTPServer, inboundDomain.customSMTPServer) &&
        Objects.equals(this.selfUri, inboundDomain.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mxRecordStatus, subDomain, mailFromSettings, customSMTPServer, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundDomain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mxRecordStatus: ").append(toIndentedString(mxRecordStatus)).append("\n");
    sb.append("    subDomain: ").append(toIndentedString(subDomain)).append("\n");
    sb.append("    mailFromSettings: ").append(toIndentedString(mailFromSettings)).append("\n");
    sb.append("    customSMTPServer: ").append(toIndentedString(customSMTPServer)).append("\n");
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

