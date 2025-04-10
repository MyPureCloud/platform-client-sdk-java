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
import com.mypurecloud.sdk.v2.model.JourneyAction;
import com.mypurecloud.sdk.v2.model.JourneyCustomer;
import com.mypurecloud.sdk.v2.model.JourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebDeploymentsJourneyContext
 */

public class WebDeploymentsJourneyContext  implements Serializable {
  
  private JourneyAction journeyAction = null;
  private JourneyCustomer customer = null;
  private JourneyCustomerSession customerSession = null;

  public WebDeploymentsJourneyContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A subset of the Journey System's action data relevant to a part of a conversation (for external linkage and internal usage/context)
   **/
  public WebDeploymentsJourneyContext journeyAction(JourneyAction journeyAction) {
    this.journeyAction = journeyAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A subset of the Journey System's action data relevant to a part of a conversation (for external linkage and internal usage/context)")
  @JsonProperty("journeyAction")
  public JourneyAction getJourneyAction() {
    return journeyAction;
  }
  public void setJourneyAction(JourneyAction journeyAction) {
    this.journeyAction = journeyAction;
  }


  /**
   * Journey customer information. Used for linking the authenticated customer with the journey. 
   **/
  public WebDeploymentsJourneyContext customer(JourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Journey customer information. Used for linking the authenticated customer with the journey. ")
  @JsonProperty("customer")
  public JourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(JourneyCustomer customer) {
    this.customer = customer;
  }


  /**
   * Contains the Journey System's customer session details.
   **/
  public WebDeploymentsJourneyContext customerSession(JourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains the Journey System's customer session details.")
  @JsonProperty("customerSession")
  public JourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(JourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentsJourneyContext webDeploymentsJourneyContext = (WebDeploymentsJourneyContext) o;

    return Objects.equals(this.journeyAction, webDeploymentsJourneyContext.journeyAction) &&
            Objects.equals(this.customer, webDeploymentsJourneyContext.customer) &&
            Objects.equals(this.customerSession, webDeploymentsJourneyContext.customerSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(journeyAction, customer, customerSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentsJourneyContext {\n");
    
    sb.append("    journeyAction: ").append(toIndentedString(journeyAction)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerSession: ").append(toIndentedString(customerSession)).append("\n");
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

