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
import com.mypurecloud.sdk.v2.model.BillingAiSubItem;
import com.mypurecloud.sdk.v2.model.BillingProduct;
import com.mypurecloud.sdk.v2.model.NamedEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BillingCharge
 */

public class BillingCharge  implements Serializable {
  
  private String id = null;
  private String name = null;
  private BillingProduct product = null;
  private List<NamedEntity> organizations = null;
  private BigDecimal prepaidQuantity = null;
  private BigDecimal fairuseAllocation = null;
  private BigDecimal fairuseAmount = null;
  private BigDecimal actualQuantity = null;
  private BigDecimal overageQuantity = null;
  private BigDecimal overageRate = null;
  private BigDecimal overageCharge = null;
  private String overageCurrency = null;
  private BigDecimal convertedTokenCount = null;
  private BigDecimal tokenConversionRate = null;
  private List<BillingAiSubItem> aiSubItems = null;

  public BillingCharge() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      organizations = new ArrayList<NamedEntity>();
      aiSubItems = new ArrayList<BillingAiSubItem>();
    }
  }

  public BillingCharge(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      organizations = new ArrayList<NamedEntity>();
      aiSubItems = new ArrayList<BillingAiSubItem>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The name of the object.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  /**
   * Represents the details of a product.
   **/
  public BillingCharge product(BillingProduct product) {
    this.product = product;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the details of a product.")
  @JsonProperty("product")
  public BillingProduct getProduct() {
    return product;
  }
  public void setProduct(BillingProduct product) {
    this.product = product;
  }


  /**
   * Organizations associated with this charge.
   **/
  public BillingCharge organizations(List<NamedEntity> organizations) {
    this.organizations = organizations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Organizations associated with this charge.")
  @JsonProperty("organizations")
  public List<NamedEntity> getOrganizations() {
    return organizations;
  }
  public void setOrganizations(List<NamedEntity> organizations) {
    this.organizations = organizations;
  }


  /**
   * The quantity of usage that is prepaid.
   **/
  public BillingCharge prepaidQuantity(BigDecimal prepaidQuantity) {
    this.prepaidQuantity = prepaidQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The quantity of usage that is prepaid.")
  @JsonProperty("prepaidQuantity")
  public BigDecimal getPrepaidQuantity() {
    return prepaidQuantity;
  }
  public void setPrepaidQuantity(BigDecimal prepaidQuantity) {
    this.prepaidQuantity = prepaidQuantity;
  }


  /**
   * Quantity of usage allowed under fair-use policies.
   **/
  public BillingCharge fairuseAllocation(BigDecimal fairuseAllocation) {
    this.fairuseAllocation = fairuseAllocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantity of usage allowed under fair-use policies.")
  @JsonProperty("fairuseAllocation")
  public BigDecimal getFairuseAllocation() {
    return fairuseAllocation;
  }
  public void setFairuseAllocation(BigDecimal fairuseAllocation) {
    this.fairuseAllocation = fairuseAllocation;
  }


  /**
   * Monetary value of the fair-use allocation, in the same currency as overageCurrency.
   **/
  public BillingCharge fairuseAmount(BigDecimal fairuseAmount) {
    this.fairuseAmount = fairuseAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Monetary value of the fair-use allocation, in the same currency as overageCurrency.")
  @JsonProperty("fairuseAmount")
  public BigDecimal getFairuseAmount() {
    return fairuseAmount;
  }
  public void setFairuseAmount(BigDecimal fairuseAmount) {
    this.fairuseAmount = fairuseAmount;
  }


  /**
   * The actual quantity of usage.
   **/
  public BillingCharge actualQuantity(BigDecimal actualQuantity) {
    this.actualQuantity = actualQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The actual quantity of usage.")
  @JsonProperty("actualQuantity")
  public BigDecimal getActualQuantity() {
    return actualQuantity;
  }
  public void setActualQuantity(BigDecimal actualQuantity) {
    this.actualQuantity = actualQuantity;
  }


  /**
   * The quantity of usage that exceeds prepaid or fair use limits.
   **/
  public BillingCharge overageQuantity(BigDecimal overageQuantity) {
    this.overageQuantity = overageQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The quantity of usage that exceeds prepaid or fair use limits.")
  @JsonProperty("overageQuantity")
  public BigDecimal getOverageQuantity() {
    return overageQuantity;
  }
  public void setOverageQuantity(BigDecimal overageQuantity) {
    this.overageQuantity = overageQuantity;
  }


  /**
   * The rate charged per unit of overage.
   **/
  public BillingCharge overageRate(BigDecimal overageRate) {
    this.overageRate = overageRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The rate charged per unit of overage.")
  @JsonProperty("overageRate")
  public BigDecimal getOverageRate() {
    return overageRate;
  }
  public void setOverageRate(BigDecimal overageRate) {
    this.overageRate = overageRate;
  }


  /**
   * The total charge for overage usage.
   **/
  public BillingCharge overageCharge(BigDecimal overageCharge) {
    this.overageCharge = overageCharge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total charge for overage usage.")
  @JsonProperty("overageCharge")
  public BigDecimal getOverageCharge() {
    return overageCharge;
  }
  public void setOverageCharge(BigDecimal overageCharge) {
    this.overageCharge = overageCharge;
  }


  /**
   * The currency in which the overage charge is billed.
   **/
  public BillingCharge overageCurrency(String overageCurrency) {
    this.overageCurrency = overageCurrency;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The currency in which the overage charge is billed.")
  @JsonProperty("overageCurrency")
  public String getOverageCurrency() {
    return overageCurrency;
  }
  public void setOverageCurrency(String overageCurrency) {
    this.overageCurrency = overageCurrency;
  }


  /**
   * AI Token Count after the conversion for AI Products.
   **/
  public BillingCharge convertedTokenCount(BigDecimal convertedTokenCount) {
    this.convertedTokenCount = convertedTokenCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AI Token Count after the conversion for AI Products.")
  @JsonProperty("convertedTokenCount")
  public BigDecimal getConvertedTokenCount() {
    return convertedTokenCount;
  }
  public void setConvertedTokenCount(BigDecimal convertedTokenCount) {
    this.convertedTokenCount = convertedTokenCount;
  }


  /**
   * AI Token Conversion Rate — Units per token conversion ratio.
   **/
  public BillingCharge tokenConversionRate(BigDecimal tokenConversionRate) {
    this.tokenConversionRate = tokenConversionRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AI Token Conversion Rate — Units per token conversion ratio.")
  @JsonProperty("tokenConversionRate")
  public BigDecimal getTokenConversionRate() {
    return tokenConversionRate;
  }
  public void setTokenConversionRate(BigDecimal tokenConversionRate) {
    this.tokenConversionRate = tokenConversionRate;
  }


  /**
   * Usage that makes up this AI parent bundle, including the bundle's own token usage and each child product's usage converted to tokens; the converted total is the parent's actual quantity.
   **/
  public BillingCharge aiSubItems(List<BillingAiSubItem> aiSubItems) {
    this.aiSubItems = aiSubItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Usage that makes up this AI parent bundle, including the bundle's own token usage and each child product's usage converted to tokens; the converted total is the parent's actual quantity.")
  @JsonProperty("aiSubItems")
  public List<BillingAiSubItem> getAiSubItems() {
    return aiSubItems;
  }
  public void setAiSubItems(List<BillingAiSubItem> aiSubItems) {
    this.aiSubItems = aiSubItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCharge billingCharge = (BillingCharge) o;

    return Objects.equals(this.id, billingCharge.id) &&
            Objects.equals(this.name, billingCharge.name) &&
            Objects.equals(this.product, billingCharge.product) &&
            Objects.equals(this.organizations, billingCharge.organizations) &&
            Objects.equals(this.prepaidQuantity, billingCharge.prepaidQuantity) &&
            Objects.equals(this.fairuseAllocation, billingCharge.fairuseAllocation) &&
            Objects.equals(this.fairuseAmount, billingCharge.fairuseAmount) &&
            Objects.equals(this.actualQuantity, billingCharge.actualQuantity) &&
            Objects.equals(this.overageQuantity, billingCharge.overageQuantity) &&
            Objects.equals(this.overageRate, billingCharge.overageRate) &&
            Objects.equals(this.overageCharge, billingCharge.overageCharge) &&
            Objects.equals(this.overageCurrency, billingCharge.overageCurrency) &&
            Objects.equals(this.convertedTokenCount, billingCharge.convertedTokenCount) &&
            Objects.equals(this.tokenConversionRate, billingCharge.tokenConversionRate) &&
            Objects.equals(this.aiSubItems, billingCharge.aiSubItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, product, organizations, prepaidQuantity, fairuseAllocation, fairuseAmount, actualQuantity, overageQuantity, overageRate, overageCharge, overageCurrency, convertedTokenCount, tokenConversionRate, aiSubItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCharge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    prepaidQuantity: ").append(toIndentedString(prepaidQuantity)).append("\n");
    sb.append("    fairuseAllocation: ").append(toIndentedString(fairuseAllocation)).append("\n");
    sb.append("    fairuseAmount: ").append(toIndentedString(fairuseAmount)).append("\n");
    sb.append("    actualQuantity: ").append(toIndentedString(actualQuantity)).append("\n");
    sb.append("    overageQuantity: ").append(toIndentedString(overageQuantity)).append("\n");
    sb.append("    overageRate: ").append(toIndentedString(overageRate)).append("\n");
    sb.append("    overageCharge: ").append(toIndentedString(overageCharge)).append("\n");
    sb.append("    overageCurrency: ").append(toIndentedString(overageCurrency)).append("\n");
    sb.append("    convertedTokenCount: ").append(toIndentedString(convertedTokenCount)).append("\n");
    sb.append("    tokenConversionRate: ").append(toIndentedString(tokenConversionRate)).append("\n");
    sb.append("    aiSubItems: ").append(toIndentedString(aiSubItems)).append("\n");
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

