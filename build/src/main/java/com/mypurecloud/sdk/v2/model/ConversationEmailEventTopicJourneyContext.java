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
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationEmailEventTopicJourneyContext
 */

public class ConversationEmailEventTopicJourneyContext  implements Serializable {
  
  private ConversationEmailEventTopicJourneyCustomer customer = null;
  private ConversationEmailEventTopicJourneyCustomerSession customerSession = null;
  private ConversationEmailEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public ConversationEmailEventTopicJourneyContext customer(ConversationEmailEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public ConversationEmailEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(ConversationEmailEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public ConversationEmailEventTopicJourneyContext customerSession(ConversationEmailEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public ConversationEmailEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(ConversationEmailEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public ConversationEmailEventTopicJourneyContext triggeringAction(ConversationEmailEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public ConversationEmailEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(ConversationEmailEventTopicJourneyAction triggeringAction) {
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
    ConversationEmailEventTopicJourneyContext conversationEmailEventTopicJourneyContext = (ConversationEmailEventTopicJourneyContext) o;
    return Objects.equals(this.customer, conversationEmailEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, conversationEmailEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, conversationEmailEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEmailEventTopicJourneyContext {\n");
    
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

