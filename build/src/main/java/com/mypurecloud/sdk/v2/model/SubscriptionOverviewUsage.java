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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SubscriptionOverviewUsage
 */

public class SubscriptionOverviewUsage  implements Serializable {
  
  private String name = null;
  private String partNumber = null;
  private String grouping = null;
  private String unitOfMeasureType = null;
  private String usageQuantity = null;
  private String overagePrice = null;
  private String prepayQuantity = null;
  private String prepayPrice = null;
  private String usageNotes = null;
  private Boolean isCancellable = null;
  private String bundleQuantity = null;
  private Boolean isThirdParty = null;

  
  /**
   * Product charge name
   **/
  public SubscriptionOverviewUsage name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Product charge name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Product part number
   **/
  public SubscriptionOverviewUsage partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Product part number")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * UI grouping key
   **/
  public SubscriptionOverviewUsage grouping(String grouping) {
    this.grouping = grouping;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UI grouping key")
  @JsonProperty("grouping")
  public String getGrouping() {
    return grouping;
  }
  public void setGrouping(String grouping) {
    this.grouping = grouping;
  }

  
  /**
   * UI unit of measure
   **/
  public SubscriptionOverviewUsage unitOfMeasureType(String unitOfMeasureType) {
    this.unitOfMeasureType = unitOfMeasureType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UI unit of measure")
  @JsonProperty("unitOfMeasureType")
  public String getUnitOfMeasureType() {
    return unitOfMeasureType;
  }
  public void setUnitOfMeasureType(String unitOfMeasureType) {
    this.unitOfMeasureType = unitOfMeasureType;
  }

  
  /**
   * Usage count for specified period
   **/
  public SubscriptionOverviewUsage usageQuantity(String usageQuantity) {
    this.usageQuantity = usageQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Usage count for specified period")
  @JsonProperty("usageQuantity")
  public String getUsageQuantity() {
    return usageQuantity;
  }
  public void setUsageQuantity(String usageQuantity) {
    this.usageQuantity = usageQuantity;
  }

  
  /**
   * Price for usage / overage charge
   **/
  public SubscriptionOverviewUsage overagePrice(String overagePrice) {
    this.overagePrice = overagePrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Price for usage / overage charge")
  @JsonProperty("overagePrice")
  public String getOveragePrice() {
    return overagePrice;
  }
  public void setOveragePrice(String overagePrice) {
    this.overagePrice = overagePrice;
  }

  
  /**
   * Items prepaid for specified period
   **/
  public SubscriptionOverviewUsage prepayQuantity(String prepayQuantity) {
    this.prepayQuantity = prepayQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Items prepaid for specified period")
  @JsonProperty("prepayQuantity")
  public String getPrepayQuantity() {
    return prepayQuantity;
  }
  public void setPrepayQuantity(String prepayQuantity) {
    this.prepayQuantity = prepayQuantity;
  }

  
  /**
   * Price for prepay charge
   **/
  public SubscriptionOverviewUsage prepayPrice(String prepayPrice) {
    this.prepayPrice = prepayPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Price for prepay charge")
  @JsonProperty("prepayPrice")
  public String getPrepayPrice() {
    return prepayPrice;
  }
  public void setPrepayPrice(String prepayPrice) {
    this.prepayPrice = prepayPrice;
  }

  
  /**
   * Notes about the usage/charge item
   **/
  public SubscriptionOverviewUsage usageNotes(String usageNotes) {
    this.usageNotes = usageNotes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes about the usage/charge item")
  @JsonProperty("usageNotes")
  public String getUsageNotes() {
    return usageNotes;
  }
  public void setUsageNotes(String usageNotes) {
    this.usageNotes = usageNotes;
  }

  
  /**
   * Indicates whether the item is cancellable
   **/
  public SubscriptionOverviewUsage isCancellable(Boolean isCancellable) {
    this.isCancellable = isCancellable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the item is cancellable")
  @JsonProperty("isCancellable")
  public Boolean getIsCancellable() {
    return isCancellable;
  }
  public void setIsCancellable(Boolean isCancellable) {
    this.isCancellable = isCancellable;
  }

  
  /**
   * Quantity multiplier for this charge
   **/
  public SubscriptionOverviewUsage bundleQuantity(String bundleQuantity) {
    this.bundleQuantity = bundleQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantity multiplier for this charge")
  @JsonProperty("bundleQuantity")
  public String getBundleQuantity() {
    return bundleQuantity;
  }
  public void setBundleQuantity(String bundleQuantity) {
    this.bundleQuantity = bundleQuantity;
  }

  
  /**
   * A charge from a third party entity
   **/
  public SubscriptionOverviewUsage isThirdParty(Boolean isThirdParty) {
    this.isThirdParty = isThirdParty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A charge from a third party entity")
  @JsonProperty("isThirdParty")
  public Boolean getIsThirdParty() {
    return isThirdParty;
  }
  public void setIsThirdParty(Boolean isThirdParty) {
    this.isThirdParty = isThirdParty;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionOverviewUsage subscriptionOverviewUsage = (SubscriptionOverviewUsage) o;
    return Objects.equals(this.name, subscriptionOverviewUsage.name) &&
        Objects.equals(this.partNumber, subscriptionOverviewUsage.partNumber) &&
        Objects.equals(this.grouping, subscriptionOverviewUsage.grouping) &&
        Objects.equals(this.unitOfMeasureType, subscriptionOverviewUsage.unitOfMeasureType) &&
        Objects.equals(this.usageQuantity, subscriptionOverviewUsage.usageQuantity) &&
        Objects.equals(this.overagePrice, subscriptionOverviewUsage.overagePrice) &&
        Objects.equals(this.prepayQuantity, subscriptionOverviewUsage.prepayQuantity) &&
        Objects.equals(this.prepayPrice, subscriptionOverviewUsage.prepayPrice) &&
        Objects.equals(this.usageNotes, subscriptionOverviewUsage.usageNotes) &&
        Objects.equals(this.isCancellable, subscriptionOverviewUsage.isCancellable) &&
        Objects.equals(this.bundleQuantity, subscriptionOverviewUsage.bundleQuantity) &&
        Objects.equals(this.isThirdParty, subscriptionOverviewUsage.isThirdParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, partNumber, grouping, unitOfMeasureType, usageQuantity, overagePrice, prepayQuantity, prepayPrice, usageNotes, isCancellable, bundleQuantity, isThirdParty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionOverviewUsage {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
    sb.append("    unitOfMeasureType: ").append(toIndentedString(unitOfMeasureType)).append("\n");
    sb.append("    usageQuantity: ").append(toIndentedString(usageQuantity)).append("\n");
    sb.append("    overagePrice: ").append(toIndentedString(overagePrice)).append("\n");
    sb.append("    prepayQuantity: ").append(toIndentedString(prepayQuantity)).append("\n");
    sb.append("    prepayPrice: ").append(toIndentedString(prepayPrice)).append("\n");
    sb.append("    usageNotes: ").append(toIndentedString(usageNotes)).append("\n");
    sb.append("    isCancellable: ").append(toIndentedString(isCancellable)).append("\n");
    sb.append("    bundleQuantity: ").append(toIndentedString(bundleQuantity)).append("\n");
    sb.append("    isThirdParty: ").append(toIndentedString(isThirdParty)).append("\n");
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

