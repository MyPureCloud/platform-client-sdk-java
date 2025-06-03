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
import com.mypurecloud.sdk.v2.model.ConversationContentLineItem;
import com.mypurecloud.sdk.v2.model.ConversationContentReceivedReplyMessage;
import com.mypurecloud.sdk.v2.model.ConversationContentRequiredContactField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Payment Request object used to request payment from a customer.
 */
@ApiModel(description = "Payment Request object used to request payment from a customer.")

public class ConversationContentPaymentRequest  implements Serializable {
  

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
  private List<ConversationContentLineItem> lineItems = null;
  private List<ConversationContentLineItem> shippingOptions = null;
  private List<ConversationContentRequiredContactField> requiredContactFields = null;
  private ConversationContentReceivedReplyMessage receivedMessage = null;
  private ConversationContentReceivedReplyMessage replyMessage = null;

  public ConversationContentPaymentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      lineItems = new ArrayList<ConversationContentLineItem>();
      shippingOptions = new ArrayList<ConversationContentLineItem>();
      requiredContactFields = new ArrayList<ConversationContentRequiredContactField>();
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The payment platform being used (e.g. Apple Pay)")
  @JsonProperty("paymentPlatform")
  public PaymentPlatformEnum getPaymentPlatform() {
    return paymentPlatform;
  }


  /**
   * The merchant's two-letter ISO 3166 country code.
   **/
  public ConversationContentPaymentRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The merchant's two-letter ISO 3166 country code.")
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
  public ConversationContentPaymentRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The three-letter ISO 4217 currency code for the payment.")
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
  public ConversationContentPaymentRequest orderTotal(Double orderTotal) {
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
  public ConversationContentPaymentRequest lineItems(List<ConversationContentLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The items that make up the order.")
  @JsonProperty("lineItems")
  public List<ConversationContentLineItem> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<ConversationContentLineItem> lineItems) {
    this.lineItems = lineItems;
  }


  /**
   * The available shipping options.
   **/
  public ConversationContentPaymentRequest shippingOptions(List<ConversationContentLineItem> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The available shipping options.")
  @JsonProperty("shippingOptions")
  public List<ConversationContentLineItem> getShippingOptions() {
    return shippingOptions;
  }
  public void setShippingOptions(List<ConversationContentLineItem> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }


  /**
   * Contact fields required to complete the order.
   **/
  public ConversationContentPaymentRequest requiredContactFields(List<ConversationContentRequiredContactField> requiredContactFields) {
    this.requiredContactFields = requiredContactFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact fields required to complete the order.")
  @JsonProperty("requiredContactFields")
  public List<ConversationContentRequiredContactField> getRequiredContactFields() {
    return requiredContactFields;
  }
  public void setRequiredContactFields(List<ConversationContentRequiredContactField> requiredContactFields) {
    this.requiredContactFields = requiredContactFields;
  }


  /**
   * The message prompt to complete a payment transaction.
   **/
  public ConversationContentPaymentRequest receivedMessage(ConversationContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message prompt to complete a payment transaction.")
  @JsonProperty("receivedMessage")
  public ConversationContentReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ConversationContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * The reply message after the user has completed the payment transaction.
   **/
  public ConversationContentPaymentRequest replyMessage(ConversationContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reply message after the user has completed the payment transaction.")
  @JsonProperty("replyMessage")
  public ConversationContentReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ConversationContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentPaymentRequest conversationContentPaymentRequest = (ConversationContentPaymentRequest) o;

    return Objects.equals(this.paymentPlatform, conversationContentPaymentRequest.paymentPlatform) &&
            Objects.equals(this.countryCode, conversationContentPaymentRequest.countryCode) &&
            Objects.equals(this.currencyCode, conversationContentPaymentRequest.currencyCode) &&
            Objects.equals(this.orderTotal, conversationContentPaymentRequest.orderTotal) &&
            Objects.equals(this.lineItems, conversationContentPaymentRequest.lineItems) &&
            Objects.equals(this.shippingOptions, conversationContentPaymentRequest.shippingOptions) &&
            Objects.equals(this.requiredContactFields, conversationContentPaymentRequest.requiredContactFields) &&
            Objects.equals(this.receivedMessage, conversationContentPaymentRequest.receivedMessage) &&
            Objects.equals(this.replyMessage, conversationContentPaymentRequest.replyMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentPlatform, countryCode, currencyCode, orderTotal, lineItems, shippingOptions, requiredContactFields, receivedMessage, replyMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentPaymentRequest {\n");
    
    sb.append("    paymentPlatform: ").append(toIndentedString(paymentPlatform)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
    sb.append("    requiredContactFields: ").append(toIndentedString(requiredContactFields)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
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

