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
import com.mypurecloud.sdk.v2.model.PaymentLineItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PaymentRequest
 */

public class PaymentRequest  implements Serializable {
  

  private static class PaymentPlatformEnumDeserializer extends StdDeserializer<PaymentPlatformEnum> {
    public PaymentPlatformEnumDeserializer() {
      super(PaymentPlatformEnumDeserializer.class);
    }

    @Override
    public PaymentPlatformEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PaymentPlatformEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The payment platform being used (e.g. Apple Pay)
   */
 @JsonDeserialize(using = PaymentPlatformEnumDeserializer.class)
  public enum PaymentPlatformEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPLEPAY("ApplePay");

    private String value;

    PaymentPlatformEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PaymentPlatformEnum fromString(String key) {
      if (key == null) return null;

      for (PaymentPlatformEnum value : PaymentPlatformEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PaymentPlatformEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PaymentPlatformEnum paymentPlatform = null;
  private String countryCode = null;
  private String currencyCode = null;
  private Double orderTotal = null;
  private List<PaymentLineItem> lineItems = null;
  private List<PaymentLineItem> shippingOptions = null;

  public PaymentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      lineItems = new ArrayList<PaymentLineItem>();
      shippingOptions = new ArrayList<PaymentLineItem>();
    }
  }

  
  /**
   * The payment platform being used (e.g. Apple Pay)
   **/
  public PaymentRequest paymentPlatform(PaymentPlatformEnum paymentPlatform) {
    this.paymentPlatform = paymentPlatform;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The payment platform being used (e.g. Apple Pay)")
  @JsonProperty("paymentPlatform")
  public PaymentPlatformEnum getPaymentPlatform() {
    return paymentPlatform;
  }
  public void setPaymentPlatform(PaymentPlatformEnum paymentPlatform) {
    this.paymentPlatform = paymentPlatform;
  }


  /**
   * The merchant's two-letter ISO 3166 country code.
   **/
  public PaymentRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The merchant's two-letter ISO 3166 country code.")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * The three-letter ISO 4217 currency code for the payment.
   **/
  public PaymentRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The three-letter ISO 4217 currency code for the payment.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  /**
   * The total price of the order.
   **/
  public PaymentRequest orderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total price of the order.")
  @JsonProperty("orderTotal")
  public Double getOrderTotal() {
    return orderTotal;
  }
  public void setOrderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
  }


  /**
   * The items that make up the order.
   **/
  public PaymentRequest lineItems(List<PaymentLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The items that make up the order.")
  @JsonProperty("lineItems")
  public List<PaymentLineItem> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<PaymentLineItem> lineItems) {
    this.lineItems = lineItems;
  }


  /**
   * The available shipping options.
   **/
  public PaymentRequest shippingOptions(List<PaymentLineItem> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The available shipping options.")
  @JsonProperty("shippingOptions")
  public List<PaymentLineItem> getShippingOptions() {
    return shippingOptions;
  }
  public void setShippingOptions(List<PaymentLineItem> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest paymentRequest = (PaymentRequest) o;

    return Objects.equals(this.paymentPlatform, paymentRequest.paymentPlatform) &&
            Objects.equals(this.countryCode, paymentRequest.countryCode) &&
            Objects.equals(this.currencyCode, paymentRequest.currencyCode) &&
            Objects.equals(this.orderTotal, paymentRequest.orderTotal) &&
            Objects.equals(this.lineItems, paymentRequest.lineItems) &&
            Objects.equals(this.shippingOptions, paymentRequest.shippingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentPlatform, countryCode, currencyCode, orderTotal, lineItems, shippingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest {\n");
    
    sb.append("    paymentPlatform: ").append(toIndentedString(paymentPlatform)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
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

