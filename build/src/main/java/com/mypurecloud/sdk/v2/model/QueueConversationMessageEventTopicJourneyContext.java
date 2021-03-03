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
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationMessageEventTopicJourneyContext
 */

public class QueueConversationMessageEventTopicJourneyContext  implements Serializable {
  
  private QueueConversationMessageEventTopicJourneyCustomer customer = null;
  private QueueConversationMessageEventTopicJourneyCustomerSession customerSession = null;
  private QueueConversationMessageEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public QueueConversationMessageEventTopicJourneyContext customer(QueueConversationMessageEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public QueueConversationMessageEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(QueueConversationMessageEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicJourneyContext customerSession(QueueConversationMessageEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public QueueConversationMessageEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(QueueConversationMessageEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicJourneyContext triggeringAction(QueueConversationMessageEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public QueueConversationMessageEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(QueueConversationMessageEventTopicJourneyAction triggeringAction) {
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
    QueueConversationMessageEventTopicJourneyContext queueConversationMessageEventTopicJourneyContext = (QueueConversationMessageEventTopicJourneyContext) o;
    return Objects.equals(this.customer, queueConversationMessageEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, queueConversationMessageEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, queueConversationMessageEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationMessageEventTopicJourneyContext {\n");
    
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

