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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ApplePay
 */

public class ApplePay  implements Serializable {
  
  private String storeName = null;
  private String merchantId = null;
  private String domainName = null;

  private static class PaymentCapabilitiesEnumDeserializer extends StdDeserializer<PaymentCapabilitiesEnum> {
    public PaymentCapabilitiesEnumDeserializer() {
      super(PaymentCapabilitiesEnumDeserializer.class);
    }

    @Override
    public PaymentCapabilitiesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PaymentCapabilitiesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets paymentCapabilities
   */
 @JsonDeserialize(using = PaymentCapabilitiesEnumDeserializer.class)
  public enum PaymentCapabilitiesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    _3DS("3DS"),
    CREDITCARD("creditCard"),
    DEBITCARD("debitCard");

    private String value;

    PaymentCapabilitiesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PaymentCapabilitiesEnum fromString(String key) {
      if (key == null) return null;

      for (PaymentCapabilitiesEnum value : PaymentCapabilitiesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PaymentCapabilitiesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<PaymentCapabilitiesEnum> paymentCapabilities = null;

  private static class SupportedPaymentNetworksEnumDeserializer extends StdDeserializer<SupportedPaymentNetworksEnum> {
    public SupportedPaymentNetworksEnumDeserializer() {
      super(SupportedPaymentNetworksEnumDeserializer.class);
    }

    @Override
    public SupportedPaymentNetworksEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SupportedPaymentNetworksEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets supportedPaymentNetworks
   */
 @JsonDeserialize(using = SupportedPaymentNetworksEnumDeserializer.class)
  public enum SupportedPaymentNetworksEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AMEX("amex"),
    DISCOVER("discover"),
    JCB("jcb"),
    MASTERCARD("masterCard"),
    PRIVATELABEL("privateLabel"),
    VISA("visa");

    private String value;

    SupportedPaymentNetworksEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SupportedPaymentNetworksEnum fromString(String key) {
      if (key == null) return null;

      for (SupportedPaymentNetworksEnum value : SupportedPaymentNetworksEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SupportedPaymentNetworksEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SupportedPaymentNetworksEnum> supportedPaymentNetworks = null;
  private String paymentCertificateCredentialId = null;
  private String paymentGatewayUrl = null;
  private String fallbackUrl = null;
  private String shippingMethodUpdateUrl = null;
  private String shippingContactUpdateUrl = null;
  private String paymentMethodUpdateUrl = null;
  private String orderTrackingUrl = null;

  public ApplePay() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      paymentCapabilities = new ArrayList<PaymentCapabilitiesEnum>();
      supportedPaymentNetworks = new ArrayList<SupportedPaymentNetworksEnum>();
    }
  }

  
  /**
   * The name of the store.
   **/
  public ApplePay storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the store.")
  @JsonProperty("storeName")
  public String getStoreName() {
    return storeName;
  }
  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  /**
   * The stores merchant identifier.
   **/
  public ApplePay merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The stores merchant identifier.")
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  /**
   * The domain name associated with the merchant account.
   **/
  public ApplePay domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The domain name associated with the merchant account.")
  @JsonProperty("domainName")
  public String getDomainName() {
    return domainName;
  }
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  /**
   * The payment capabilities supported by the merchant.
   **/
  public ApplePay paymentCapabilities(List<PaymentCapabilitiesEnum> paymentCapabilities) {
    this.paymentCapabilities = paymentCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The payment capabilities supported by the merchant.")
  @JsonProperty("paymentCapabilities")
  public List<PaymentCapabilitiesEnum> getPaymentCapabilities() {
    return paymentCapabilities;
  }
  public void setPaymentCapabilities(List<PaymentCapabilitiesEnum> paymentCapabilities) {
    this.paymentCapabilities = paymentCapabilities;
  }


  /**
   * The payment networks supported by the merchant.
   **/
  public ApplePay supportedPaymentNetworks(List<SupportedPaymentNetworksEnum> supportedPaymentNetworks) {
    this.supportedPaymentNetworks = supportedPaymentNetworks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The payment networks supported by the merchant.")
  @JsonProperty("supportedPaymentNetworks")
  public List<SupportedPaymentNetworksEnum> getSupportedPaymentNetworks() {
    return supportedPaymentNetworks;
  }
  public void setSupportedPaymentNetworks(List<SupportedPaymentNetworksEnum> supportedPaymentNetworks) {
    this.supportedPaymentNetworks = supportedPaymentNetworks;
  }


  /**
   * The Genesys credentialId the payment certificates are stored under.
   **/
  public ApplePay paymentCertificateCredentialId(String paymentCertificateCredentialId) {
    this.paymentCertificateCredentialId = paymentCertificateCredentialId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Genesys credentialId the payment certificates are stored under.")
  @JsonProperty("paymentCertificateCredentialId")
  public String getPaymentCertificateCredentialId() {
    return paymentCertificateCredentialId;
  }
  public void setPaymentCertificateCredentialId(String paymentCertificateCredentialId) {
    this.paymentCertificateCredentialId = paymentCertificateCredentialId;
  }


  /**
   * The url used to process payments.
   **/
  public ApplePay paymentGatewayUrl(String paymentGatewayUrl) {
    this.paymentGatewayUrl = paymentGatewayUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The url used to process payments.")
  @JsonProperty("paymentGatewayUrl")
  public String getPaymentGatewayUrl() {
    return paymentGatewayUrl;
  }
  public void setPaymentGatewayUrl(String paymentGatewayUrl) {
    this.paymentGatewayUrl = paymentGatewayUrl;
  }


  /**
   * The url opened in a web browser if the customers device is unable to make payments using Apple Pay.
   **/
  public ApplePay fallbackUrl(String fallbackUrl) {
    this.fallbackUrl = fallbackUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url opened in a web browser if the customers device is unable to make payments using Apple Pay.")
  @JsonProperty("fallbackUrl")
  public String getFallbackUrl() {
    return fallbackUrl;
  }
  public void setFallbackUrl(String fallbackUrl) {
    this.fallbackUrl = fallbackUrl;
  }


  /**
   * The url called when the customer changes the shipping method.
   **/
  public ApplePay shippingMethodUpdateUrl(String shippingMethodUpdateUrl) {
    this.shippingMethodUpdateUrl = shippingMethodUpdateUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url called when the customer changes the shipping method.")
  @JsonProperty("shippingMethodUpdateUrl")
  public String getShippingMethodUpdateUrl() {
    return shippingMethodUpdateUrl;
  }
  public void setShippingMethodUpdateUrl(String shippingMethodUpdateUrl) {
    this.shippingMethodUpdateUrl = shippingMethodUpdateUrl;
  }


  /**
   * The url called when the customer changes their shipping address information.
   **/
  public ApplePay shippingContactUpdateUrl(String shippingContactUpdateUrl) {
    this.shippingContactUpdateUrl = shippingContactUpdateUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url called when the customer changes their shipping address information.")
  @JsonProperty("shippingContactUpdateUrl")
  public String getShippingContactUpdateUrl() {
    return shippingContactUpdateUrl;
  }
  public void setShippingContactUpdateUrl(String shippingContactUpdateUrl) {
    this.shippingContactUpdateUrl = shippingContactUpdateUrl;
  }


  /**
   * The url called when the customer changes their payment method.
   **/
  public ApplePay paymentMethodUpdateUrl(String paymentMethodUpdateUrl) {
    this.paymentMethodUpdateUrl = paymentMethodUpdateUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url called when the customer changes their payment method.")
  @JsonProperty("paymentMethodUpdateUrl")
  public String getPaymentMethodUpdateUrl() {
    return paymentMethodUpdateUrl;
  }
  public void setPaymentMethodUpdateUrl(String paymentMethodUpdateUrl) {
    this.paymentMethodUpdateUrl = paymentMethodUpdateUrl;
  }


  /**
   * The url called after completing the order to update the order information in your system
   **/
  public ApplePay orderTrackingUrl(String orderTrackingUrl) {
    this.orderTrackingUrl = orderTrackingUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url called after completing the order to update the order information in your system")
  @JsonProperty("orderTrackingUrl")
  public String getOrderTrackingUrl() {
    return orderTrackingUrl;
  }
  public void setOrderTrackingUrl(String orderTrackingUrl) {
    this.orderTrackingUrl = orderTrackingUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePay applePay = (ApplePay) o;

    return Objects.equals(this.storeName, applePay.storeName) &&
            Objects.equals(this.merchantId, applePay.merchantId) &&
            Objects.equals(this.domainName, applePay.domainName) &&
            Objects.equals(this.paymentCapabilities, applePay.paymentCapabilities) &&
            Objects.equals(this.supportedPaymentNetworks, applePay.supportedPaymentNetworks) &&
            Objects.equals(this.paymentCertificateCredentialId, applePay.paymentCertificateCredentialId) &&
            Objects.equals(this.paymentGatewayUrl, applePay.paymentGatewayUrl) &&
            Objects.equals(this.fallbackUrl, applePay.fallbackUrl) &&
            Objects.equals(this.shippingMethodUpdateUrl, applePay.shippingMethodUpdateUrl) &&
            Objects.equals(this.shippingContactUpdateUrl, applePay.shippingContactUpdateUrl) &&
            Objects.equals(this.paymentMethodUpdateUrl, applePay.paymentMethodUpdateUrl) &&
            Objects.equals(this.orderTrackingUrl, applePay.orderTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeName, merchantId, domainName, paymentCapabilities, supportedPaymentNetworks, paymentCertificateCredentialId, paymentGatewayUrl, fallbackUrl, shippingMethodUpdateUrl, shippingContactUpdateUrl, paymentMethodUpdateUrl, orderTrackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePay {\n");
    
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    paymentCapabilities: ").append(toIndentedString(paymentCapabilities)).append("\n");
    sb.append("    supportedPaymentNetworks: ").append(toIndentedString(supportedPaymentNetworks)).append("\n");
    sb.append("    paymentCertificateCredentialId: ").append(toIndentedString(paymentCertificateCredentialId)).append("\n");
    sb.append("    paymentGatewayUrl: ").append(toIndentedString(paymentGatewayUrl)).append("\n");
    sb.append("    fallbackUrl: ").append(toIndentedString(fallbackUrl)).append("\n");
    sb.append("    shippingMethodUpdateUrl: ").append(toIndentedString(shippingMethodUpdateUrl)).append("\n");
    sb.append("    shippingContactUpdateUrl: ").append(toIndentedString(shippingContactUpdateUrl)).append("\n");
    sb.append("    paymentMethodUpdateUrl: ").append(toIndentedString(paymentMethodUpdateUrl)).append("\n");
    sb.append("    orderTrackingUrl: ").append(toIndentedString(orderTrackingUrl)).append("\n");
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

