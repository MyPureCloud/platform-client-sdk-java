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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * LocationAddressVerificationDetails
 */

public class LocationAddressVerificationDetails  implements Serializable {
  

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
   * Status of address verification process
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    INPROGRESS("InProgress"),
    RETRY("Retry"),
    COMPLETE("Complete"),
    FAILED("Failed");

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
  private Date dateFinished = null;
  private Date dateStarted = null;
  private String service = null;

  
  /**
   * Status of address verification process
   **/
  public LocationAddressVerificationDetails status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of address verification process")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Finished time of address verification process. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public LocationAddressVerificationDetails dateFinished(Date dateFinished) {
    this.dateFinished = dateFinished;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Finished time of address verification process. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateFinished")
  public Date getDateFinished() {
    return dateFinished;
  }
  public void setDateFinished(Date dateFinished) {
    this.dateFinished = dateFinished;
  }

  
  /**
   * Time started of address verification process. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public LocationAddressVerificationDetails dateStarted(Date dateStarted) {
    this.dateStarted = dateStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time started of address verification process. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStarted")
  public Date getDateStarted() {
    return dateStarted;
  }
  public void setDateStarted(Date dateStarted) {
    this.dateStarted = dateStarted;
  }

  
  /**
   * Third party service used for address verification
   **/
  public LocationAddressVerificationDetails service(String service) {
    this.service = service;
    return this;
  }
  
  @ApiModelProperty(example = "smartystreets-us", value = "Third party service used for address verification")
  @JsonProperty("service")
  public String getService() {
    return service;
  }
  public void setService(String service) {
    this.service = service;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAddressVerificationDetails locationAddressVerificationDetails = (LocationAddressVerificationDetails) o;
    return Objects.equals(this.status, locationAddressVerificationDetails.status) &&
        Objects.equals(this.dateFinished, locationAddressVerificationDetails.dateFinished) &&
        Objects.equals(this.dateStarted, locationAddressVerificationDetails.dateStarted) &&
        Objects.equals(this.service, locationAddressVerificationDetails.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, dateFinished, dateStarted, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAddressVerificationDetails {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateFinished: ").append(toIndentedString(dateFinished)).append("\n");
    sb.append("    dateStarted: ").append(toIndentedString(dateStarted)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

