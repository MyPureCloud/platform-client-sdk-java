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
import com.mypurecloud.sdk.v2.model.BillingPlanItem;
import com.mypurecloud.sdk.v2.model.BillingProduct;
import com.mypurecloud.sdk.v2.model.NamedEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BillingPlan
 */

public class BillingPlan  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<NamedEntity> organizations = null;
  private BillingProduct product = null;
  private List<BillingPlanItem> items = null;

  public BillingPlan() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      organizations = new ArrayList<NamedEntity>();
      items = new ArrayList<BillingPlanItem>();
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
   * List of organizations for the plan.
   **/
  public BillingPlan organizations(List<NamedEntity> organizations) {
    this.organizations = organizations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of organizations for the plan.")
  @JsonProperty("organizations")
  public List<NamedEntity> getOrganizations() {
    return organizations;
  }
  public void setOrganizations(List<NamedEntity> organizations) {
    this.organizations = organizations;
  }


  /**
   * Represents the details of a product.
   **/
  public BillingPlan product(BillingProduct product) {
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
   * List of items for the plan.
   **/
  public BillingPlan items(List<BillingPlanItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of items for the plan.")
  @JsonProperty("items")
  public List<BillingPlanItem> getItems() {
    return items;
  }
  public void setItems(List<BillingPlanItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlan billingPlan = (BillingPlan) o;

    return Objects.equals(this.id, billingPlan.id) &&
            Objects.equals(this.name, billingPlan.name) &&
            Objects.equals(this.organizations, billingPlan.organizations) &&
            Objects.equals(this.product, billingPlan.product) &&
            Objects.equals(this.items, billingPlan.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, organizations, product, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

