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
import com.mypurecloud.sdk.v2.model.BillingUsageResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BillingUsage
 */

public class BillingUsage  implements Serializable {
  
  private String name = null;
  private String totalUsage = null;
  private List<BillingUsageResource> resources = new ArrayList<BillingUsageResource>();

  
  /**
   * Identifies the billable usage.
   **/
  public BillingUsage name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifies the billable usage.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The total amount of usage, expressed as a decimal number in string format.
   **/
  public BillingUsage totalUsage(String totalUsage) {
    this.totalUsage = totalUsage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total amount of usage, expressed as a decimal number in string format.")
  @JsonProperty("totalUsage")
  public String getTotalUsage() {
    return totalUsage;
  }
  public void setTotalUsage(String totalUsage) {
    this.totalUsage = totalUsage;
  }

  
  /**
   * The resources for which usage was observed (e.g. license users, devices).
   **/
  public BillingUsage resources(List<BillingUsageResource> resources) {
    this.resources = resources;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The resources for which usage was observed (e.g. license users, devices).")
  @JsonProperty("resources")
  public List<BillingUsageResource> getResources() {
    return resources;
  }
  public void setResources(List<BillingUsageResource> resources) {
    this.resources = resources;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingUsage billingUsage = (BillingUsage) o;
    return Objects.equals(this.name, billingUsage.name) &&
        Objects.equals(this.totalUsage, billingUsage.totalUsage) &&
        Objects.equals(this.resources, billingUsage.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, totalUsage, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingUsage {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalUsage: ").append(toIndentedString(totalUsage)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

