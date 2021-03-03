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
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationScreenShareEventTopicJourneyContext
 */

public class ConversationScreenShareEventTopicJourneyContext  implements Serializable {
  
  private ConversationScreenShareEventTopicJourneyCustomer customer = null;
  private ConversationScreenShareEventTopicJourneyCustomerSession customerSession = null;
  private ConversationScreenShareEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public ConversationScreenShareEventTopicJourneyContext customer(ConversationScreenShareEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public ConversationScreenShareEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(ConversationScreenShareEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public ConversationScreenShareEventTopicJourneyContext customerSession(ConversationScreenShareEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public ConversationScreenShareEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(ConversationScreenShareEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public ConversationScreenShareEventTopicJourneyContext triggeringAction(ConversationScreenShareEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public ConversationScreenShareEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(ConversationScreenShareEventTopicJourneyAction triggeringAction) {
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
    ConversationScreenShareEventTopicJourneyContext conversationScreenShareEventTopicJourneyContext = (ConversationScreenShareEventTopicJourneyContext) o;
    return Objects.equals(this.customer, conversationScreenShareEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, conversationScreenShareEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, conversationScreenShareEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationScreenShareEventTopicJourneyContext {\n");
    
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

