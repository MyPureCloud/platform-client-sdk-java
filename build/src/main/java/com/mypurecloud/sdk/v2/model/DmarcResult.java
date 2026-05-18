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
import com.mypurecloud.sdk.v2.model.Record;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Represents the DMARC verification result for an email domain
 */
@ApiModel(description = "Represents the DMARC verification result for an email domain")

public class DmarcResult  implements Serializable {
  

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
   * The DMARC status of this domain
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOTPRESENT("NotPresent"),
    INVALID("Invalid"),
    VALID("Valid");

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

  private static class DetectedPolicyEnumDeserializer extends StdDeserializer<DetectedPolicyEnum> {
    public DetectedPolicyEnumDeserializer() {
      super(DetectedPolicyEnumDeserializer.class);
    }

    @Override
    public DetectedPolicyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DetectedPolicyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The DMARC policy that was detected in the associated DNS record, if one is present
   */
 @JsonDeserialize(using = DetectedPolicyEnumDeserializer.class)
  public enum DetectedPolicyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("unknown"),
    NONE("none"),
    QUARANTINE("quarantine"),
    REJECT("reject");

    private String value;

    DetectedPolicyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DetectedPolicyEnum fromString(String key) {
      if (key == null) return null;

      for (DetectedPolicyEnum value : DetectedPolicyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DetectedPolicyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DetectedPolicyEnum detectedPolicy = null;
  private Date dateChecked = null;
  private List<Record> records = null;

  public DmarcResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      records = new ArrayList<Record>();
    }
  }

  public DmarcResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      records = new ArrayList<Record>();
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The DMARC status of this domain")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "The DMARC policy that was detected in the associated DNS record, if one is present")
  @JsonProperty("detectedPolicy")
  public DetectedPolicyEnum getDetectedPolicy() {
    return detectedPolicy;
  }


  @ApiModelProperty(example = "null", required = true, value = "The date of the most recent check of the domain's DMARC DNS record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateChecked")
  public Date getDateChecked() {
    return dateChecked;
  }


  @ApiModelProperty(example = "null", required = true, value = "The minimum DMARC DNS record that Genesys Cloud recommends")
  @JsonProperty("records")
  public List<Record> getRecords() {
    return records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmarcResult dmarcResult = (DmarcResult) o;

    return Objects.equals(this.status, dmarcResult.status) &&
            Objects.equals(this.detectedPolicy, dmarcResult.detectedPolicy) &&
            Objects.equals(this.dateChecked, dmarcResult.dateChecked) &&
            Objects.equals(this.records, dmarcResult.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, detectedPolicy, dateChecked, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmarcResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detectedPolicy: ").append(toIndentedString(detectedPolicy)).append("\n");
    sb.append("    dateChecked: ").append(toIndentedString(dateChecked)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

