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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.SourceIntent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CustomerSourceIntent
 */

public class CustomerSourceIntent  implements Serializable {
  
  private SourceIntent sourceIntent = null;
  private DomainEntityRef customerIntent = null;

  public CustomerSourceIntent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Source intent data
   **/
  public CustomerSourceIntent sourceIntent(SourceIntent sourceIntent) {
    this.sourceIntent = sourceIntent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source intent data")
  @JsonProperty("sourceIntent")
  public SourceIntent getSourceIntent() {
    return sourceIntent;
  }
  public void setSourceIntent(SourceIntent sourceIntent) {
    this.sourceIntent = sourceIntent;
  }


  /**
   * Customer intent source intent is assigned to
   **/
  public CustomerSourceIntent customerIntent(DomainEntityRef customerIntent) {
    this.customerIntent = customerIntent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer intent source intent is assigned to")
  @JsonProperty("customerIntent")
  public DomainEntityRef getCustomerIntent() {
    return customerIntent;
  }
  public void setCustomerIntent(DomainEntityRef customerIntent) {
    this.customerIntent = customerIntent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSourceIntent customerSourceIntent = (CustomerSourceIntent) o;

    return Objects.equals(this.sourceIntent, customerSourceIntent.sourceIntent) &&
            Objects.equals(this.customerIntent, customerSourceIntent.customerIntent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceIntent, customerIntent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSourceIntent {\n");
    
    sb.append("    sourceIntent: ").append(toIndentedString(sourceIntent)).append("\n");
    sb.append("    customerIntent: ").append(toIndentedString(customerIntent)).append("\n");
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

