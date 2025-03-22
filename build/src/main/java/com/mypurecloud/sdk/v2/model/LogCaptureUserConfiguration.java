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
import java.util.Date;

import java.io.Serializable;
/**
 * LogCaptureUserConfiguration
 */

public class LogCaptureUserConfiguration  implements Serializable {
  
  private String id = null;
  private Date dateStarted = null;
  private Date dateExpired = null;

  private static class CaptureMethodEnumDeserializer extends StdDeserializer<CaptureMethodEnum> {
    public CaptureMethodEnumDeserializer() {
      super(CaptureMethodEnumDeserializer.class);
    }

    @Override
    public CaptureMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CaptureMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the method by which the logs were captured.
   */
 @JsonDeserialize(using = CaptureMethodEnumDeserializer.class)
  public enum CaptureMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONDEMAND("OnDemand"),
    SCHEDULED("Scheduled");

    private String value;

    CaptureMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CaptureMethodEnum fromString(String key) {
      if (key == null) return null;

      for (CaptureMethodEnum value : CaptureMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CaptureMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CaptureMethodEnum captureMethod = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "Indicates when log capture was enabled for the user. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStarted")
  public Date getDateStarted() {
    return dateStarted;
  }


  /**
   * Indicates when log capture will be turned off for the user. (Must be within 24 hours). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public LogCaptureUserConfiguration dateExpired(Date dateExpired) {
    this.dateExpired = dateExpired;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates when log capture will be turned off for the user. (Must be within 24 hours). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpired")
  public Date getDateExpired() {
    return dateExpired;
  }
  public void setDateExpired(Date dateExpired) {
    this.dateExpired = dateExpired;
  }


  @ApiModelProperty(example = "null", value = "Indicates the method by which the logs were captured.")
  @JsonProperty("captureMethod")
  public CaptureMethodEnum getCaptureMethod() {
    return captureMethod;
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
    LogCaptureUserConfiguration logCaptureUserConfiguration = (LogCaptureUserConfiguration) o;

    return Objects.equals(this.id, logCaptureUserConfiguration.id) &&
            Objects.equals(this.dateStarted, logCaptureUserConfiguration.dateStarted) &&
            Objects.equals(this.dateExpired, logCaptureUserConfiguration.dateExpired) &&
            Objects.equals(this.captureMethod, logCaptureUserConfiguration.captureMethod) &&
            Objects.equals(this.selfUri, logCaptureUserConfiguration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateStarted, dateExpired, captureMethod, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogCaptureUserConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateStarted: ").append(toIndentedString(dateStarted)).append("\n");
    sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
    sb.append("    captureMethod: ").append(toIndentedString(captureMethod)).append("\n");
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

