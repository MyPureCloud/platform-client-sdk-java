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
import com.mypurecloud.sdk.v2.model.BillingContractPeriod;
import com.mypurecloud.sdk.v2.model.BillingPlan;
import com.mypurecloud.sdk.v2.model.Customer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BillingContract
 */

public class BillingContract  implements Serializable {
  
  private String id = null;
  private String externalNumber = null;

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
   * The status of the contract.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    INACTIVE("Inactive");

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
  private String commercialModel = null;
  private List<String> purchaseOrderNumbers = null;
  private Customer billToCustomer = null;
  private Customer soldToCustomer = null;
  private Customer endCustomer = null;
  private LocalDate dateStart = null;
  private LocalDate dateEnd = null;
  private LocalDate dateRampStart = null;
  private LocalDate dateRampEnd = null;
  private List<BillingContractPeriod> billingPeriods = null;
  private List<BillingPlan> plans = null;

  public BillingContract() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      purchaseOrderNumbers = new ArrayList<String>();
      billingPeriods = new ArrayList<BillingContractPeriod>();
      plans = new ArrayList<BillingPlan>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Unique external number.
   **/
  public BillingContract externalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique external number.")
  @JsonProperty("externalNumber")
  public String getExternalNumber() {
    return externalNumber;
  }
  public void setExternalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
  }


  /**
   * The status of the contract.
   **/
  public BillingContract status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the contract.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The type of commercial model.
   **/
  public BillingContract commercialModel(String commercialModel) {
    this.commercialModel = commercialModel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of commercial model.")
  @JsonProperty("commercialModel")
  public String getCommercialModel() {
    return commercialModel;
  }
  public void setCommercialModel(String commercialModel) {
    this.commercialModel = commercialModel;
  }


  /**
   * List of po numbers periods for this contract.
   **/
  public BillingContract purchaseOrderNumbers(List<String> purchaseOrderNumbers) {
    this.purchaseOrderNumbers = purchaseOrderNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of po numbers periods for this contract.")
  @JsonProperty("purchaseOrderNumbers")
  public List<String> getPurchaseOrderNumbers() {
    return purchaseOrderNumbers;
  }
  public void setPurchaseOrderNumbers(List<String> purchaseOrderNumbers) {
    this.purchaseOrderNumbers = purchaseOrderNumbers;
  }


  /**
   * The bill to customer.
   **/
  public BillingContract billToCustomer(Customer billToCustomer) {
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
   * The sold to customer.
   **/
  public BillingContract soldToCustomer(Customer soldToCustomer) {
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
   * The end customer.
   **/
  public BillingContract endCustomer(Customer endCustomer) {
    this.endCustomer = endCustomer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end customer.")
  @JsonProperty("endCustomer")
  public Customer getEndCustomer() {
    return endCustomer;
  }
  public void setEndCustomer(Customer endCustomer) {
    this.endCustomer = endCustomer;
  }


  /**
   * The start date of the contract. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingContract dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date of the contract. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStart")
  public LocalDate getDateStart() {
    return dateStart;
  }
  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The end date of the contract. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingContract dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date of the contract. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEnd")
  public LocalDate getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * the date when the first revenue or quantity in a ramped deal begins. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingContract dateRampStart(LocalDate dateRampStart) {
    this.dateRampStart = dateRampStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the date when the first revenue or quantity in a ramped deal begins. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateRampStart")
  public LocalDate getDateRampStart() {
    return dateRampStart;
  }
  public void setDateRampStart(LocalDate dateRampStart) {
    this.dateRampStart = dateRampStart;
  }


  /**
   * the date when the first revenue or quantity in a ramped deal ends. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingContract dateRampEnd(LocalDate dateRampEnd) {
    this.dateRampEnd = dateRampEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the date when the first revenue or quantity in a ramped deal ends. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateRampEnd")
  public LocalDate getDateRampEnd() {
    return dateRampEnd;
  }
  public void setDateRampEnd(LocalDate dateRampEnd) {
    this.dateRampEnd = dateRampEnd;
  }


  /**
   * List of billing periods for the contract.
   **/
  public BillingContract billingPeriods(List<BillingContractPeriod> billingPeriods) {
    this.billingPeriods = billingPeriods;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of billing periods for the contract.")
  @JsonProperty("billingPeriods")
  public List<BillingContractPeriod> getBillingPeriods() {
    return billingPeriods;
  }
  public void setBillingPeriods(List<BillingContractPeriod> billingPeriods) {
    this.billingPeriods = billingPeriods;
  }


  /**
   * The collection of prices for the related organizations.
   **/
  public BillingContract plans(List<BillingPlan> plans) {
    this.plans = plans;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The collection of prices for the related organizations.")
  @JsonProperty("plans")
  public List<BillingPlan> getPlans() {
    return plans;
  }
  public void setPlans(List<BillingPlan> plans) {
    this.plans = plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingContract billingContract = (BillingContract) o;

    return Objects.equals(this.id, billingContract.id) &&
            Objects.equals(this.externalNumber, billingContract.externalNumber) &&
            Objects.equals(this.status, billingContract.status) &&
            Objects.equals(this.commercialModel, billingContract.commercialModel) &&
            Objects.equals(this.purchaseOrderNumbers, billingContract.purchaseOrderNumbers) &&
            Objects.equals(this.billToCustomer, billingContract.billToCustomer) &&
            Objects.equals(this.soldToCustomer, billingContract.soldToCustomer) &&
            Objects.equals(this.endCustomer, billingContract.endCustomer) &&
            Objects.equals(this.dateStart, billingContract.dateStart) &&
            Objects.equals(this.dateEnd, billingContract.dateEnd) &&
            Objects.equals(this.dateRampStart, billingContract.dateRampStart) &&
            Objects.equals(this.dateRampEnd, billingContract.dateRampEnd) &&
            Objects.equals(this.billingPeriods, billingContract.billingPeriods) &&
            Objects.equals(this.plans, billingContract.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalNumber, status, commercialModel, purchaseOrderNumbers, billToCustomer, soldToCustomer, endCustomer, dateStart, dateEnd, dateRampStart, dateRampEnd, billingPeriods, plans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingContract {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalNumber: ").append(toIndentedString(externalNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    commercialModel: ").append(toIndentedString(commercialModel)).append("\n");
    sb.append("    purchaseOrderNumbers: ").append(toIndentedString(purchaseOrderNumbers)).append("\n");
    sb.append("    billToCustomer: ").append(toIndentedString(billToCustomer)).append("\n");
    sb.append("    soldToCustomer: ").append(toIndentedString(soldToCustomer)).append("\n");
    sb.append("    endCustomer: ").append(toIndentedString(endCustomer)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    dateRampStart: ").append(toIndentedString(dateRampStart)).append("\n");
    sb.append("    dateRampEnd: ").append(toIndentedString(dateRampEnd)).append("\n");
    sb.append("    billingPeriods: ").append(toIndentedString(billingPeriods)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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

