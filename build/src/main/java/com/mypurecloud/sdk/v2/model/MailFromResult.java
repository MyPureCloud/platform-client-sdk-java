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
import com.mypurecloud.sdk.v2.model.Record;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MailFromResult
 */

public class MailFromResult  implements Serializable {
  

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The verification status.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FAILED("FAILED"),
    PENDING("PENDING"),
    VERIFIED("VERIFIED"),
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private List<Record> records = new ArrayList<Record>();
  private String mailFromDomain = null;

  
  /**
   * The verification status.
   **/
  public MailFromResult status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The verification status.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The list of DNS records that pertain that need to exist for verification.
   **/
  public MailFromResult records(List<Record> records) {
    this.records = records;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of DNS records that pertain that need to exist for verification.")
  @JsonProperty("records")
  public List<Record> getRecords() {
    return records;
  }
  public void setRecords(List<Record> records) {
    this.records = records;
  }

  
  /**
   * The custom MAIL FROM domain.
   **/
  public MailFromResult mailFromDomain(String mailFromDomain) {
    this.mailFromDomain = mailFromDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The custom MAIL FROM domain.")
  @JsonProperty("mailFromDomain")
  public String getMailFromDomain() {
    return mailFromDomain;
  }
  public void setMailFromDomain(String mailFromDomain) {
    this.mailFromDomain = mailFromDomain;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailFromResult mailFromResult = (MailFromResult) o;
    return Objects.equals(this.status, mailFromResult.status) &&
        Objects.equals(this.records, mailFromResult.records) &&
        Objects.equals(this.mailFromDomain, mailFromResult.mailFromDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, records, mailFromDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailFromResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    mailFromDomain: ").append(toIndentedString(mailFromDomain)).append("\n");
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

