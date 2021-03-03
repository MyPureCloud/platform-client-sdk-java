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
import com.mypurecloud.sdk.v2.model.JourneyAction;
import com.mypurecloud.sdk.v2.model.JourneyCustomer;
import com.mypurecloud.sdk.v2.model.JourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyContext
 */

public class JourneyContext  implements Serializable {
  
  private JourneyCustomer customer = null;
  private JourneyCustomerSession customerSession = null;
  private JourneyAction triggeringAction = null;

  
  /**
   * A subset of the Journey System's customer data at a point-in-time (for external linkage and internal usage/context)
   **/
  public JourneyContext customer(JourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A subset of the Journey System's customer data at a point-in-time (for external linkage and internal usage/context)")
  @JsonProperty("customer")
  public JourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(JourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   * A subset of the Journey System's tracked customer session data at a point-in-time (for external linkage and internal usage/context)
   **/
  public JourneyContext customerSession(JourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A subset of the Journey System's tracked customer session data at a point-in-time (for external linkage and internal usage/context)")
  @JsonProperty("customerSession")
  public JourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(JourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   * A subset of the Journey System's action data relevant to a part of a conversation (for external linkage and internal usage/context)
   **/
  public JourneyContext triggeringAction(JourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A subset of the Journey System's action data relevant to a part of a conversation (for external linkage and internal usage/context)")
  @JsonProperty("triggeringAction")
  public JourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(JourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyContext journeyContext = (JourneyContext) o;
    return Objects.equals(this.customer, journeyContext.customer) &&
        Objects.equals(this.customerSession, journeyContext.customerSession) &&
        Objects.equals(this.triggeringAction, journeyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyContext {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerSession: ").append(toIndentedString(customerSession)).append("\n");
    sb.append("    triggeringAction: ").append(toIndentedString(triggeringAction)).append("\n");
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

