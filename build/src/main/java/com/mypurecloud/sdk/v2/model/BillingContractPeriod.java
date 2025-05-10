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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BillingContractPeriod
 */

public class BillingContractPeriod  implements Serializable {
  
  private String id = null;
  private LocalDate dateStart = null;
  private LocalDate dateEnd = null;

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
   * The type of address.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPEN("Open"),
    CLOSED("Closed");

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

  public BillingContractPeriod() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The date when the Billing Period starts. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingContractPeriod dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the Billing Period starts. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStart")
  public LocalDate getDateStart() {
    return dateStart;
  }
  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The date when the Billing Period starts. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingContractPeriod dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the Billing Period starts. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEnd")
  public LocalDate getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * The type of address.
   **/
  public BillingContractPeriod status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of address.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingContractPeriod billingContractPeriod = (BillingContractPeriod) o;

    return Objects.equals(this.id, billingContractPeriod.id) &&
            Objects.equals(this.dateStart, billingContractPeriod.dateStart) &&
            Objects.equals(this.dateEnd, billingContractPeriod.dateEnd) &&
            Objects.equals(this.status, billingContractPeriod.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateStart, dateEnd, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingContractPeriod {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

