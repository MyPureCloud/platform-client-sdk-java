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
import com.mypurecloud.sdk.v2.model.QueueConversationScreenShareEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.QueueConversationScreenShareEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.QueueConversationScreenShareEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationScreenShareEventTopicJourneyContext
 */

public class QueueConversationScreenShareEventTopicJourneyContext  implements Serializable {
  
  private QueueConversationScreenShareEventTopicJourneyCustomer customer = null;
  private QueueConversationScreenShareEventTopicJourneyCustomerSession customerSession = null;
  private QueueConversationScreenShareEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public QueueConversationScreenShareEventTopicJourneyContext customer(QueueConversationScreenShareEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public QueueConversationScreenShareEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(QueueConversationScreenShareEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public QueueConversationScreenShareEventTopicJourneyContext customerSession(QueueConversationScreenShareEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public QueueConversationScreenShareEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(QueueConversationScreenShareEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public QueueConversationScreenShareEventTopicJourneyContext triggeringAction(QueueConversationScreenShareEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public QueueConversationScreenShareEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(QueueConversationScreenShareEventTopicJourneyAction triggeringAction) {
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
    QueueConversationScreenShareEventTopicJourneyContext queueConversationScreenShareEventTopicJourneyContext = (QueueConversationScreenShareEventTopicJourneyContext) o;
    return Objects.equals(this.customer, queueConversationScreenShareEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, queueConversationScreenShareEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, queueConversationScreenShareEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationScreenShareEventTopicJourneyContext {\n");
    
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

