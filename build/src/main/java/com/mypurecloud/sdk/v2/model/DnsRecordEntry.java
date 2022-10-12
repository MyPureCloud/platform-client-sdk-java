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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DnsRecordEntry
 */

public class DnsRecordEntry  implements Serializable {
  
  private String host = null;
  private String recordContents = null;

  private static class VerificationStatusEnumDeserializer extends StdDeserializer<VerificationStatusEnum> {
    public VerificationStatusEnumDeserializer() {
      super(VerificationStatusEnumDeserializer.class);
    }

    @Override
    public VerificationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VerificationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * the current status of the related verification process
   */
 @JsonDeserialize(using = VerificationStatusEnumDeserializer.class)
  public enum VerificationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    VERIFIED("Verified"),
    FAILED("Failed"),
    UNKNOWN("Unknown");

    private String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VerificationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (VerificationStatusEnum value : VerificationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VerificationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VerificationStatusEnum verificationStatus = null;

  
  /**
   * the hostname of the DNS entry
   **/
  public DnsRecordEntry host(String host) {
    this.host = host;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the hostname of the DNS entry")
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }


  /**
   * the payload of the DNS entry
   **/
  public DnsRecordEntry recordContents(String recordContents) {
    this.recordContents = recordContents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the payload of the DNS entry")
  @JsonProperty("recordContents")
  public String getRecordContents() {
    return recordContents;
  }
  public void setRecordContents(String recordContents) {
    this.recordContents = recordContents;
  }


  /**
   * the current status of the related verification process
   **/
  public DnsRecordEntry verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the current status of the related verification process")
  @JsonProperty("verificationStatus")
  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }
  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRecordEntry dnsRecordEntry = (DnsRecordEntry) o;

    return Objects.equals(this.host, dnsRecordEntry.host) &&
            Objects.equals(this.recordContents, dnsRecordEntry.recordContents) &&
            Objects.equals(this.verificationStatus, dnsRecordEntry.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, recordContents, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRecordEntry {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    recordContents: ").append(toIndentedString(recordContents)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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

