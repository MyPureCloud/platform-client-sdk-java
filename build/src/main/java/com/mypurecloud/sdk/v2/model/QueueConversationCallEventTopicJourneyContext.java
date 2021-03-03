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
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationCallEventTopicJourneyContext
 */

public class QueueConversationCallEventTopicJourneyContext  implements Serializable {
  
  private QueueConversationCallEventTopicJourneyCustomer customer = null;
  private QueueConversationCallEventTopicJourneyCustomerSession customerSession = null;
  private QueueConversationCallEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public QueueConversationCallEventTopicJourneyContext customer(QueueConversationCallEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public QueueConversationCallEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(QueueConversationCallEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicJourneyContext customerSession(QueueConversationCallEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public QueueConversationCallEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(QueueConversationCallEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicJourneyContext triggeringAction(QueueConversationCallEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public QueueConversationCallEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(QueueConversationCallEventTopicJourneyAction triggeringAction) {
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
    QueueConversationCallEventTopicJourneyContext queueConversationCallEventTopicJourneyContext = (QueueConversationCallEventTopicJourneyContext) o;
    return Objects.equals(this.customer, queueConversationCallEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, queueConversationCallEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, queueConversationCallEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicJourneyContext {\n");
    
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

