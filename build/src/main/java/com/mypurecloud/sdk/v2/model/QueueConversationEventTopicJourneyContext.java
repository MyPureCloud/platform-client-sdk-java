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
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationEventTopicJourneyContext
 */

public class QueueConversationEventTopicJourneyContext  implements Serializable {
  
  private QueueConversationEventTopicJourneyCustomer customer = null;
  private QueueConversationEventTopicJourneyCustomerSession customerSession = null;
  private QueueConversationEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public QueueConversationEventTopicJourneyContext customer(QueueConversationEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public QueueConversationEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(QueueConversationEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public QueueConversationEventTopicJourneyContext customerSession(QueueConversationEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public QueueConversationEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(QueueConversationEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public QueueConversationEventTopicJourneyContext triggeringAction(QueueConversationEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public QueueConversationEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(QueueConversationEventTopicJourneyAction triggeringAction) {
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
    QueueConversationEventTopicJourneyContext queueConversationEventTopicJourneyContext = (QueueConversationEventTopicJourneyContext) o;
    return Objects.equals(this.customer, queueConversationEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, queueConversationEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, queueConversationEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicJourneyContext {\n");
    
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

