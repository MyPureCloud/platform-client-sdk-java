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
import com.mypurecloud.sdk.v2.model.ConversationVideoEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.ConversationVideoEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.ConversationVideoEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationVideoEventTopicJourneyContext
 */

public class ConversationVideoEventTopicJourneyContext  implements Serializable {
  
  private ConversationVideoEventTopicJourneyCustomer customer = null;
  private ConversationVideoEventTopicJourneyCustomerSession customerSession = null;
  private ConversationVideoEventTopicJourneyAction triggeringAction = null;

  public ConversationVideoEventTopicJourneyContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationVideoEventTopicJourneyContext customer(ConversationVideoEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public ConversationVideoEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(ConversationVideoEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }


  /**
   **/
  public ConversationVideoEventTopicJourneyContext customerSession(ConversationVideoEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public ConversationVideoEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(ConversationVideoEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }


  /**
   **/
  public ConversationVideoEventTopicJourneyContext triggeringAction(ConversationVideoEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public ConversationVideoEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(ConversationVideoEventTopicJourneyAction triggeringAction) {
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
    ConversationVideoEventTopicJourneyContext conversationVideoEventTopicJourneyContext = (ConversationVideoEventTopicJourneyContext) o;

    return Objects.equals(this.customer, conversationVideoEventTopicJourneyContext.customer) &&
            Objects.equals(this.customerSession, conversationVideoEventTopicJourneyContext.customerSession) &&
            Objects.equals(this.triggeringAction, conversationVideoEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationVideoEventTopicJourneyContext {\n");
    
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

