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
import com.mypurecloud.sdk.v2.model.NamedEntity;
import com.mypurecloud.sdk.v2.model.SubscriptionOverviewUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TrusteeBillingOverview
 */

public class TrusteeBillingOverview  implements Serializable {
  
  private String id = null;
  private String name = null;
  private NamedEntity organization = null;
  private String currency = null;
  private List<String> enabledProducts = new ArrayList<String>();

  private static class SubscriptionTypeEnumDeserializer extends StdDeserializer<SubscriptionTypeEnum> {
    public SubscriptionTypeEnumDeserializer() {
      super(SubscriptionTypeEnumDeserializer.class);
    }

    @Override
    public SubscriptionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SubscriptionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The subscription type.
   */
 @JsonDeserialize(using = SubscriptionTypeEnumDeserializer.class)
  public enum SubscriptionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ININ("ININ"),
    MONTH_TO_MONTH("MONTH_TO_MONTH"),
    FREE_TRIAL_MONTH_TO_MONTH("FREE_TRIAL_MONTH_TO_MONTH"),
    PREPAY_MONTHLY_COMMITMENT("PREPAY_MONTHLY_COMMITMENT"),
    PREPAY("PREPAY"),
    DEV_ORG_MONTH_TO_MONTH("DEV_ORG_MONTH_TO_MONTH"),
    DEV_ORG_PREPAY_MONTHLY_COMMITMENT("DEV_ORG_PREPAY_MONTHLY_COMMITMENT"),
    DEV_ORG_PREPAY("DEV_ORG_PREPAY");

    private String value;

    SubscriptionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SubscriptionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SubscriptionTypeEnum value : SubscriptionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SubscriptionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SubscriptionTypeEnum subscriptionType = null;
  private Date rampPeriodStartDate = null;
  private Date rampPeriodEndDate = null;
  private Date billingPeriodStartDate = null;
  private Date billingPeriodEndDate = null;
  private List<SubscriptionOverviewUsage> usages = new ArrayList<SubscriptionOverviewUsage>();
  private Date contractAmendmentDate = null;
  private Date contractEffectiveDate = null;
  private Date contractEndDate = null;
  private String minimumMonthlyAmount = null;
  private Boolean inRampPeriod = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public TrusteeBillingOverview name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Organization
   **/
  public TrusteeBillingOverview organization(NamedEntity organization) {
    this.organization = organization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Organization")
  @JsonProperty("organization")
  public NamedEntity getOrganization() {
    return organization;
  }
  public void setOrganization(NamedEntity organization) {
    this.organization = organization;
  }

  
  /**
   * The currency type.
   **/
  public TrusteeBillingOverview currency(String currency) {
    this.currency = currency;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The currency type.")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * The charge short names for products enabled during the specified period.
   **/
  public TrusteeBillingOverview enabledProducts(List<String> enabledProducts) {
    this.enabledProducts = enabledProducts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The charge short names for products enabled during the specified period.")
  @JsonProperty("enabledProducts")
  public List<String> getEnabledProducts() {
    return enabledProducts;
  }
  public void setEnabledProducts(List<String> enabledProducts) {
    this.enabledProducts = enabledProducts;
  }

  
  /**
   * The subscription type.
   **/
  public TrusteeBillingOverview subscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The subscription type.")
  @JsonProperty("subscriptionType")
  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }
  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  
  /**
   * Date-time the ramp period starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TrusteeBillingOverview rampPeriodStartDate(Date rampPeriodStartDate) {
    this.rampPeriodStartDate = rampPeriodStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date-time the ramp period starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("rampPeriodStartDate")
  public Date getRampPeriodStartDate() {
    return rampPeriodStartDate;
  }
  public void setRampPeriodStartDate(Date rampPeriodStartDate) {
    this.rampPeriodStartDate = rampPeriodStartDate;
  }

  
  /**
   * Date-time the ramp period ends. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TrusteeBillingOverview rampPeriodEndDate(Date rampPeriodEndDate) {
    this.rampPeriodEndDate = rampPeriodEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date-time the ramp period ends. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("rampPeriodEndDate")
  public Date getRampPeriodEndDate() {
    return rampPeriodEndDate;
  }
  public void setRampPeriodEndDate(Date rampPeriodEndDate) {
    this.rampPeriodEndDate = rampPeriodEndDate;
  }

  
  /**
   * Date-time the billing period started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TrusteeBillingOverview billingPeriodStartDate(Date billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date-time the billing period started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("billingPeriodStartDate")
  public Date getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }
  public void setBillingPeriodStartDate(Date billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  
  /**
   * Date-time the billing period ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TrusteeBillingOverview billingPeriodEndDate(Date billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date-time the billing period ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("billingPeriodEndDate")
  public Date getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }
  public void setBillingPeriodEndDate(Date billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  
  /**
   * Usages for the specified period.
   **/
  public TrusteeBillingOverview usages(List<SubscriptionOverviewUsage> usages) {
    this.usages = usages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Usages for the specified period.")
  @JsonProperty("usages")
  public List<SubscriptionOverviewUsage> getUsages() {
    return usages;
  }
  public void setUsages(List<SubscriptionOverviewUsage> usages) {
    this.usages = usages;
  }

  
  /**
   * Date-time the contract was last amended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TrusteeBillingOverview contractAmendmentDate(Date contractAmendmentDate) {
    this.contractAmendmentDate = contractAmendmentDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date-time the contract was last amended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("contractAmendmentDate")
  public Date getContractAmendmentDate() {
    return contractAmendmentDate;
  }
  public void setContractAmendmentDate(Date contractAmendmentDate) {
    this.contractAmendmentDate = contractAmendmentDate;
  }

  
  /**
   * Date-time the contract became effective. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TrusteeBillingOverview contractEffectiveDate(Date contractEffectiveDate) {
    this.contractEffectiveDate = contractEffectiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date-time the contract became effective. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("contractEffectiveDate")
  public Date getContractEffectiveDate() {
    return contractEffectiveDate;
  }
  public void setContractEffectiveDate(Date contractEffectiveDate) {
    this.contractEffectiveDate = contractEffectiveDate;
  }

  
  /**
   * Date-time the contract ends. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TrusteeBillingOverview contractEndDate(Date contractEndDate) {
    this.contractEndDate = contractEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date-time the contract ends. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("contractEndDate")
  public Date getContractEndDate() {
    return contractEndDate;
  }
  public void setContractEndDate(Date contractEndDate) {
    this.contractEndDate = contractEndDate;
  }

  
  /**
   * Minimum amount that will be charged for the month
   **/
  public TrusteeBillingOverview minimumMonthlyAmount(String minimumMonthlyAmount) {
    this.minimumMonthlyAmount = minimumMonthlyAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum amount that will be charged for the month")
  @JsonProperty("minimumMonthlyAmount")
  public String getMinimumMonthlyAmount() {
    return minimumMonthlyAmount;
  }
  public void setMinimumMonthlyAmount(String minimumMonthlyAmount) {
    this.minimumMonthlyAmount = minimumMonthlyAmount;
  }

  
  /**
   **/
  public TrusteeBillingOverview inRampPeriod(Boolean inRampPeriod) {
    this.inRampPeriod = inRampPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inRampPeriod")
  public Boolean getInRampPeriod() {
    return inRampPeriod;
  }
  public void setInRampPeriod(Boolean inRampPeriod) {
    this.inRampPeriod = inRampPeriod;
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
    TrusteeBillingOverview trusteeBillingOverview = (TrusteeBillingOverview) o;
    return Objects.equals(this.id, trusteeBillingOverview.id) &&
        Objects.equals(this.name, trusteeBillingOverview.name) &&
        Objects.equals(this.organization, trusteeBillingOverview.organization) &&
        Objects.equals(this.currency, trusteeBillingOverview.currency) &&
        Objects.equals(this.enabledProducts, trusteeBillingOverview.enabledProducts) &&
        Objects.equals(this.subscriptionType, trusteeBillingOverview.subscriptionType) &&
        Objects.equals(this.rampPeriodStartDate, trusteeBillingOverview.rampPeriodStartDate) &&
        Objects.equals(this.rampPeriodEndDate, trusteeBillingOverview.rampPeriodEndDate) &&
        Objects.equals(this.billingPeriodStartDate, trusteeBillingOverview.billingPeriodStartDate) &&
        Objects.equals(this.billingPeriodEndDate, trusteeBillingOverview.billingPeriodEndDate) &&
        Objects.equals(this.usages, trusteeBillingOverview.usages) &&
        Objects.equals(this.contractAmendmentDate, trusteeBillingOverview.contractAmendmentDate) &&
        Objects.equals(this.contractEffectiveDate, trusteeBillingOverview.contractEffectiveDate) &&
        Objects.equals(this.contractEndDate, trusteeBillingOverview.contractEndDate) &&
        Objects.equals(this.minimumMonthlyAmount, trusteeBillingOverview.minimumMonthlyAmount) &&
        Objects.equals(this.inRampPeriod, trusteeBillingOverview.inRampPeriod) &&
        Objects.equals(this.selfUri, trusteeBillingOverview.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, organization, currency, enabledProducts, subscriptionType, rampPeriodStartDate, rampPeriodEndDate, billingPeriodStartDate, billingPeriodEndDate, usages, contractAmendmentDate, contractEffectiveDate, contractEndDate, minimumMonthlyAmount, inRampPeriod, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrusteeBillingOverview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    enabledProducts: ").append(toIndentedString(enabledProducts)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    rampPeriodStartDate: ").append(toIndentedString(rampPeriodStartDate)).append("\n");
    sb.append("    rampPeriodEndDate: ").append(toIndentedString(rampPeriodEndDate)).append("\n");
    sb.append("    billingPeriodStartDate: ").append(toIndentedString(billingPeriodStartDate)).append("\n");
    sb.append("    billingPeriodEndDate: ").append(toIndentedString(billingPeriodEndDate)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    contractAmendmentDate: ").append(toIndentedString(contractAmendmentDate)).append("\n");
    sb.append("    contractEffectiveDate: ").append(toIndentedString(contractEffectiveDate)).append("\n");
    sb.append("    contractEndDate: ").append(toIndentedString(contractEndDate)).append("\n");
    sb.append("    minimumMonthlyAmount: ").append(toIndentedString(minimumMonthlyAmount)).append("\n");
    sb.append("    inRampPeriod: ").append(toIndentedString(inRampPeriod)).append("\n");
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

