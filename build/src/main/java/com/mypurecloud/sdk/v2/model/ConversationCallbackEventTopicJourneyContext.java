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
import com.mypurecloud.sdk.v2.model.ConversationCallbackEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.ConversationCallbackEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.ConversationCallbackEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationCallbackEventTopicJourneyContext
 */

public class ConversationCallbackEventTopicJourneyContext  implements Serializable {
  
  private ConversationCallbackEventTopicJourneyCustomer customer = null;
  private ConversationCallbackEventTopicJourneyCustomerSession customerSession = null;
  private ConversationCallbackEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public ConversationCallbackEventTopicJourneyContext customer(ConversationCallbackEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public ConversationCallbackEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(ConversationCallbackEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public ConversationCallbackEventTopicJourneyContext customerSession(ConversationCallbackEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public ConversationCallbackEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(ConversationCallbackEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public ConversationCallbackEventTopicJourneyContext triggeringAction(ConversationCallbackEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public ConversationCallbackEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(ConversationCallbackEventTopicJourneyAction triggeringAction) {
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
    ConversationCallbackEventTopicJourneyContext conversationCallbackEventTopicJourneyContext = (ConversationCallbackEventTopicJourneyContext) o;
    return Objects.equals(this.customer, conversationCallbackEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, conversationCallbackEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, conversationCallbackEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCallbackEventTopicJourneyContext {\n");
    
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

