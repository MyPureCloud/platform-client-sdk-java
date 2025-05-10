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
import com.mypurecloud.sdk.v2.model.Customer;
import com.mypurecloud.sdk.v2.model.InvoiceAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BillingInvoice
 */

public class BillingInvoice  implements Serializable {
  
  private String id = null;
  private Customer billToCustomer = null;
  private Customer shipToCustomer = null;
  private Customer soldToCustomer = null;
  private LocalDate dateInvoiced = null;
  private InvoiceAddress billToAddress = null;
  private InvoiceAddress shipToAddress = null;
  private String currencyIsoCode = null;

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
   * Status of the payment.
   */
 @JsonDeserialize(using = PaymentStatusEnumDeserializer.class)
  public enum PaymentStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PAID("Paid"),
    UNPAID("Unpaid");

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
  private String paymentTerms = null;
  private String paymentLink = null;
  private String customerPoNumber = null;
  private String customerInvoiceType = null;
  private BigDecimal amount = null;

  public BillingInvoice() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The bill to customer.
   **/
  public BillingInvoice billToCustomer(Customer billToCustomer) {
    this.billToCustomer = billToCustomer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bill to customer.")
  @JsonProperty("billToCustomer")
  public Customer getBillToCustomer() {
    return billToCustomer;
  }
  public void setBillToCustomer(Customer billToCustomer) {
    this.billToCustomer = billToCustomer;
  }


  /**
   * The ship to customer.
   **/
  public BillingInvoice shipToCustomer(Customer shipToCustomer) {
    this.shipToCustomer = shipToCustomer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ship to customer.")
  @JsonProperty("shipToCustomer")
  public Customer getShipToCustomer() {
    return shipToCustomer;
  }
  public void setShipToCustomer(Customer shipToCustomer) {
    this.shipToCustomer = shipToCustomer;
  }


  /**
   * The sold to customer.
   **/
  public BillingInvoice soldToCustomer(Customer soldToCustomer) {
    this.soldToCustomer = soldToCustomer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sold to customer.")
  @JsonProperty("soldToCustomer")
  public Customer getSoldToCustomer() {
    return soldToCustomer;
  }
  public void setSoldToCustomer(Customer soldToCustomer) {
    this.soldToCustomer = soldToCustomer;
  }


  /**
   * Date when the invoice was issued. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingInvoice dateInvoiced(LocalDate dateInvoiced) {
    this.dateInvoiced = dateInvoiced;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date when the invoice was issued. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateInvoiced")
  public LocalDate getDateInvoiced() {
    return dateInvoiced;
  }
  public void setDateInvoiced(LocalDate dateInvoiced) {
    this.dateInvoiced = dateInvoiced;
  }


  /**
   * Details of the bill to address.
   **/
  public BillingInvoice billToAddress(InvoiceAddress billToAddress) {
    this.billToAddress = billToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the bill to address.")
  @JsonProperty("billToAddress")
  public InvoiceAddress getBillToAddress() {
    return billToAddress;
  }
  public void setBillToAddress(InvoiceAddress billToAddress) {
    this.billToAddress = billToAddress;
  }


  /**
   * Details of the ship to address.
   **/
  public BillingInvoice shipToAddress(InvoiceAddress shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the ship to address.")
  @JsonProperty("shipToAddress")
  public InvoiceAddress getShipToAddress() {
    return shipToAddress;
  }
  public void setShipToAddress(InvoiceAddress shipToAddress) {
    this.shipToAddress = shipToAddress;
  }


  /**
   * Contains the ISO code for any currency allowed by the organization.
   **/
  public BillingInvoice currencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains the ISO code for any currency allowed by the organization.")
  @JsonProperty("currencyIsoCode")
  public String getCurrencyIsoCode() {
    return currencyIsoCode;
  }
  public void setCurrencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
  }


  /**
   * Status of the payment.
   **/
  public BillingInvoice paymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the payment.")
  @JsonProperty("paymentStatus")
  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }
  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  /**
   * Payment terms.
   **/
  public BillingInvoice paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Payment terms.")
  @JsonProperty("paymentTerms")
  public String getPaymentTerms() {
    return paymentTerms;
  }
  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }


  /**
   * Payment link.
   **/
  public BillingInvoice paymentLink(String paymentLink) {
    this.paymentLink = paymentLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Payment link.")
  @JsonProperty("paymentLink")
  public String getPaymentLink() {
    return paymentLink;
  }
  public void setPaymentLink(String paymentLink) {
    this.paymentLink = paymentLink;
  }


  /**
   * Purchase Order Number.
   **/
  public BillingInvoice customerPoNumber(String customerPoNumber) {
    this.customerPoNumber = customerPoNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Purchase Order Number.")
  @JsonProperty("customerPoNumber")
  public String getCustomerPoNumber() {
    return customerPoNumber;
  }
  public void setCustomerPoNumber(String customerPoNumber) {
    this.customerPoNumber = customerPoNumber;
  }


  /**
   * Type of the invoice.
   **/
  public BillingInvoice customerInvoiceType(String customerInvoiceType) {
    this.customerInvoiceType = customerInvoiceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the invoice.")
  @JsonProperty("customerInvoiceType")
  public String getCustomerInvoiceType() {
    return customerInvoiceType;
  }
  public void setCustomerInvoiceType(String customerInvoiceType) {
    this.customerInvoiceType = customerInvoiceType;
  }


  /**
   * Amount.
   **/
  public BillingInvoice amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Amount.")
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingInvoice billingInvoice = (BillingInvoice) o;

    return Objects.equals(this.id, billingInvoice.id) &&
            Objects.equals(this.billToCustomer, billingInvoice.billToCustomer) &&
            Objects.equals(this.shipToCustomer, billingInvoice.shipToCustomer) &&
            Objects.equals(this.soldToCustomer, billingInvoice.soldToCustomer) &&
            Objects.equals(this.dateInvoiced, billingInvoice.dateInvoiced) &&
            Objects.equals(this.billToAddress, billingInvoice.billToAddress) &&
            Objects.equals(this.shipToAddress, billingInvoice.shipToAddress) &&
            Objects.equals(this.currencyIsoCode, billingInvoice.currencyIsoCode) &&
            Objects.equals(this.paymentStatus, billingInvoice.paymentStatus) &&
            Objects.equals(this.paymentTerms, billingInvoice.paymentTerms) &&
            Objects.equals(this.paymentLink, billingInvoice.paymentLink) &&
            Objects.equals(this.customerPoNumber, billingInvoice.customerPoNumber) &&
            Objects.equals(this.customerInvoiceType, billingInvoice.customerInvoiceType) &&
            Objects.equals(this.amount, billingInvoice.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, billToCustomer, shipToCustomer, soldToCustomer, dateInvoiced, billToAddress, shipToAddress, currencyIsoCode, paymentStatus, paymentTerms, paymentLink, customerPoNumber, customerInvoiceType, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    billToCustomer: ").append(toIndentedString(billToCustomer)).append("\n");
    sb.append("    shipToCustomer: ").append(toIndentedString(shipToCustomer)).append("\n");
    sb.append("    soldToCustomer: ").append(toIndentedString(soldToCustomer)).append("\n");
    sb.append("    dateInvoiced: ").append(toIndentedString(dateInvoiced)).append("\n");
    sb.append("    billToAddress: ").append(toIndentedString(billToAddress)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    currencyIsoCode: ").append(toIndentedString(currencyIsoCode)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    paymentLink: ").append(toIndentedString(paymentLink)).append("\n");
    sb.append("    customerPoNumber: ").append(toIndentedString(customerPoNumber)).append("\n");
    sb.append("    customerInvoiceType: ").append(toIndentedString(customerInvoiceType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

