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
  private BillingProduct product = null;
  private List<NamedEntity> organizations = null;
  private Integer getprepaidQuantity = null;
  private Integer getfairuseQuantity = null;
  private Integer getactualQuantity = null;
  private Integer getoverageQuantity = null;
  private BigDecimal overageRate = null;
  private BigDecimal overageCharge = null;
  private String overageCurrency = null;

  public BillingCharge() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      organizations = new ArrayList<NamedEntity>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
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
   * List of plans within the organization.
   **/
  public BillingCharge organizations(List<NamedEntity> organizations) {
    this.organizations = organizations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of plans within the organization.")
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
  public BillingCharge getprepaidQuantity(Integer getprepaidQuantity) {
    this.getprepaidQuantity = getprepaidQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The quantity of usage that is prepaid.")
  @JsonProperty("getprepaidQuantity")
  public Integer getGetprepaidQuantity() {
    return getprepaidQuantity;
  }
  public void setGetprepaidQuantity(Integer getprepaidQuantity) {
    this.getprepaidQuantity = getprepaidQuantity;
  }


  /**
   * The quantity of usage allowed under fair use policies.
   **/
  public BillingCharge getfairuseQuantity(Integer getfairuseQuantity) {
    this.getfairuseQuantity = getfairuseQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The quantity of usage allowed under fair use policies.")
  @JsonProperty("getfairuseQuantity")
  public Integer getGetfairuseQuantity() {
    return getfairuseQuantity;
  }
  public void setGetfairuseQuantity(Integer getfairuseQuantity) {
    this.getfairuseQuantity = getfairuseQuantity;
  }


  /**
   * The actual quantity of usage.
   **/
  public BillingCharge getactualQuantity(Integer getactualQuantity) {
    this.getactualQuantity = getactualQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The actual quantity of usage.")
  @JsonProperty("getactualQuantity")
  public Integer getGetactualQuantity() {
    return getactualQuantity;
  }
  public void setGetactualQuantity(Integer getactualQuantity) {
    this.getactualQuantity = getactualQuantity;
  }


  /**
   * The quantity of usage that exceeds prepaid or fair use limits.
   **/
  public BillingCharge getoverageQuantity(Integer getoverageQuantity) {
    this.getoverageQuantity = getoverageQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The quantity of usage that exceeds prepaid or fair use limits.")
  @JsonProperty("getoverageQuantity")
  public Integer getGetoverageQuantity() {
    return getoverageQuantity;
  }
  public void setGetoverageQuantity(Integer getoverageQuantity) {
    this.getoverageQuantity = getoverageQuantity;
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
            Objects.equals(this.product, billingCharge.product) &&
            Objects.equals(this.organizations, billingCharge.organizations) &&
            Objects.equals(this.getprepaidQuantity, billingCharge.getprepaidQuantity) &&
            Objects.equals(this.getfairuseQuantity, billingCharge.getfairuseQuantity) &&
            Objects.equals(this.getactualQuantity, billingCharge.getactualQuantity) &&
            Objects.equals(this.getoverageQuantity, billingCharge.getoverageQuantity) &&
            Objects.equals(this.overageRate, billingCharge.overageRate) &&
            Objects.equals(this.overageCharge, billingCharge.overageCharge) &&
            Objects.equals(this.overageCurrency, billingCharge.overageCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, product, organizations, getprepaidQuantity, getfairuseQuantity, getactualQuantity, getoverageQuantity, overageRate, overageCharge, overageCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCharge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    getprepaidQuantity: ").append(toIndentedString(getprepaidQuantity)).append("\n");
    sb.append("    getfairuseQuantity: ").append(toIndentedString(getfairuseQuantity)).append("\n");
    sb.append("    getactualQuantity: ").append(toIndentedString(getactualQuantity)).append("\n");
    sb.append("    getoverageQuantity: ").append(toIndentedString(getoverageQuantity)).append("\n");
    sb.append("    overageRate: ").append(toIndentedString(overageRate)).append("\n");
    sb.append("    overageCharge: ").append(toIndentedString(overageCharge)).append("\n");
    sb.append("    overageCurrency: ").append(toIndentedString(overageCurrency)).append("\n");
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

