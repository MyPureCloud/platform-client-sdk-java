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
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationCallbackEventTopicJourneyContext
 */

public class QueueConversationCallbackEventTopicJourneyContext  implements Serializable {
  
  private QueueConversationCallbackEventTopicJourneyCustomer customer = null;
  private QueueConversationCallbackEventTopicJourneyCustomerSession customerSession = null;
  private QueueConversationCallbackEventTopicJourneyAction triggeringAction = null;

  
  /**
   **/
  public QueueConversationCallbackEventTopicJourneyContext customer(QueueConversationCallbackEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public QueueConversationCallbackEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(QueueConversationCallbackEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicJourneyContext customerSession(QueueConversationCallbackEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public QueueConversationCallbackEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(QueueConversationCallbackEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicJourneyContext triggeringAction(QueueConversationCallbackEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public QueueConversationCallbackEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(QueueConversationCallbackEventTopicJourneyAction triggeringAction) {
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
    QueueConversationCallbackEventTopicJourneyContext queueConversationCallbackEventTopicJourneyContext = (QueueConversationCallbackEventTopicJourneyContext) o;
    return Objects.equals(this.customer, queueConversationCallbackEventTopicJourneyContext.customer) &&
        Objects.equals(this.customerSession, queueConversationCallbackEventTopicJourneyContext.customerSession) &&
        Objects.equals(this.triggeringAction, queueConversationCallbackEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallbackEventTopicJourneyContext {\n");
    
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

