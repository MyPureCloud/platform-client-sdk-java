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
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationCobrowseEventTopicJourneyContext
 */

public class ConversationCobrowseEventTopicJourneyContext  implements Serializable {
  
  private ConversationCobrowseEventTopicJourneyCustomer customer = null;
  private ConversationCobrowseEventTopicJourneyCustomerSession customerSession = null;
  private ConversationCobrowseEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public ConversationCobrowseEventTopicJourneyContext customer(ConversationCobrowseEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public ConversationCobrowseEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(ConversationCobrowseEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicJourneyContext customerSession(ConversationCobrowseEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public ConversationCobrowseEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(ConversationCobrowseEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicJourneyContext triggeringAction(ConversationCobrowseEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public ConversationCobrowseEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(ConversationCobrowseEventTopicJourneyAction triggeringAction) {
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
    ConversationCobrowseEventTopicJourneyContext conversationCobrowseEventTopicJourneyContext = (ConversationCobrowseEventTopicJourneyContext) o;
    return Objects.equals(this.customer, conversationCobrowseEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, conversationCobrowseEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, conversationCobrowseEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCobrowseEventTopicJourneyContext {\n");
    
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

