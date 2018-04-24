package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.LocalizedField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Represents a pricing option for an AppFoundry listing
 */
@ApiModel(description = "Represents a pricing option for an AppFoundry listing")

public class PricingOption  implements Serializable {
  
  private LocalizedField price = null;
  private LocalizedField description = null;

  
  /**
   * The price
   **/
  public PricingOption price(LocalizedField price) {
    this.price = price;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The price")
  @JsonProperty("price")
  public LocalizedField getPrice() {
    return price;
  }
  public void setPrice(LocalizedField price) {
    this.price = price;
  }

  
  /**
   * Description explaining pricing option
   **/
  public PricingOption description(LocalizedField description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description explaining pricing option")
  @JsonProperty("description")
  public LocalizedField getDescription() {
    return description;
  }
  public void setDescription(LocalizedField description) {
    this.description = description;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingOption pricingOption = (PricingOption) o;
    return Objects.equals(this.price, pricingOption.price) &&
        Objects.equals(this.description, pricingOption.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingOption {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

