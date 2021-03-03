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
import com.mypurecloud.sdk.v2.model.ConversationSocialExpressionEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.ConversationSocialExpressionEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.ConversationSocialExpressionEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationSocialExpressionEventTopicJourneyContext
 */

public class ConversationSocialExpressionEventTopicJourneyContext  implements Serializable {
  
  private ConversationSocialExpressionEventTopicJourneyCustomer customer = null;
  private ConversationSocialExpressionEventTopicJourneyCustomerSession customerSession = null;
  private ConversationSocialExpressionEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public ConversationSocialExpressionEventTopicJourneyContext customer(ConversationSocialExpressionEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public ConversationSocialExpressionEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(ConversationSocialExpressionEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public ConversationSocialExpressionEventTopicJourneyContext customerSession(ConversationSocialExpressionEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public ConversationSocialExpressionEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(ConversationSocialExpressionEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public ConversationSocialExpressionEventTopicJourneyContext triggeringAction(ConversationSocialExpressionEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public ConversationSocialExpressionEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(ConversationSocialExpressionEventTopicJourneyAction triggeringAction) {
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
    ConversationSocialExpressionEventTopicJourneyContext conversationSocialExpressionEventTopicJourneyContext = (ConversationSocialExpressionEventTopicJourneyContext) o;
    return Objects.equals(this.customer, conversationSocialExpressionEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, conversationSocialExpressionEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, conversationSocialExpressionEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSocialExpressionEventTopicJourneyContext {\n");
    
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

