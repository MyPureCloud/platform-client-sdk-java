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

import java.io.Serializable;
/**
 * PaymentResponse
 */

public class PaymentResponse  implements Serializable {
  
  private String originatingMessageId = null;

  private static class PaymentStatusEnumDeserializer extends StdDeserializer<PaymentStatusEnum> {
    public PaymentStatusEnumDeserializer() {
      super(PaymentStatusEnumDeserializer.class);
    }

    @Override
    public PaymentStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PaymentStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the payment transaction.
   */
 @JsonDeserialize(using = PaymentStatusEnumDeserializer.class)
  public enum PaymentStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETED("Completed"),
    FAILED("Failed");

    private String value;

    PaymentStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PaymentStatusEnum fromString(String key) {
      if (key == null) return null;

      for (PaymentStatusEnum value : PaymentStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PaymentStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PaymentStatusEnum paymentStatus = null;
  private String failureReason = null;

  public PaymentResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Reference to the ID of the original payment request message this response is for.
   **/
  public PaymentResponse originatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference to the ID of the original payment request message this response is for.")
  @JsonProperty("originatingMessageId")
  public String getOriginatingMessageId() {
    return originatingMessageId;
  }
  public void setOriginatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
  }


  /**
   * The status of the payment transaction.
   **/
  public PaymentResponse paymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the payment transaction.")
  @JsonProperty("paymentStatus")
  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }
  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  /**
   * The reason the payment request failed.
   **/
  public PaymentResponse failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason the payment request failed.")
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }
  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResponse paymentResponse = (PaymentResponse) o;

    return Objects.equals(this.originatingMessageId, paymentResponse.originatingMessageId) &&
            Objects.equals(this.paymentStatus, paymentResponse.paymentStatus) &&
            Objects.equals(this.failureReason, paymentResponse.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originatingMessageId, paymentStatus, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponse {\n");
    
    sb.append("    originatingMessageId: ").append(toIndentedString(originatingMessageId)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

