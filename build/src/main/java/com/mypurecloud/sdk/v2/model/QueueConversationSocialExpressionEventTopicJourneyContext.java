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
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicJourneyAction;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicJourneyCustomer;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicJourneyCustomerSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A subset of the Journey System&#39;s data relevant to a part of a conversation (for external linkage and internal usage/context).
 */
@ApiModel(description = "A subset of the Journey System's data relevant to a part of a conversation (for external linkage and internal usage/context).")

public class QueueConversationSocialExpressionEventTopicJourneyContext  implements Serializable {
  
  private QueueConversationSocialExpressionEventTopicJourneyCustomer customer = null;
  private QueueConversationSocialExpressionEventTopicJourneyCustomerSession customerSession = null;
  private QueueConversationSocialExpressionEventTopicJourneyAction triggeringAction = null;

  public QueueConversationSocialExpressionEventTopicJourneyContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicJourneyContext customer(QueueConversationSocialExpressionEventTopicJourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customer")
  public QueueConversationSocialExpressionEventTopicJourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(QueueConversationSocialExpressionEventTopicJourneyCustomer customer) {
    this.customer = customer;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicJourneyContext customerSession(QueueConversationSocialExpressionEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerSession")
  public QueueConversationSocialExpressionEventTopicJourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(QueueConversationSocialExpressionEventTopicJourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicJourneyContext triggeringAction(QueueConversationSocialExpressionEventTopicJourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public QueueConversationSocialExpressionEventTopicJourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(QueueConversationSocialExpressionEventTopicJourneyAction triggeringAction) {
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
    QueueConversationSocialExpressionEventTopicJourneyContext queueConversationSocialExpressionEventTopicJourneyContext = (QueueConversationSocialExpressionEventTopicJourneyContext) o;

    return Objects.equals(this.customer, queueConversationSocialExpressionEventTopicJourneyContext.customer) &&
            Objects.equals(this.customerSession, queueConversationSocialExpressionEventTopicJourneyContext.customerSession) &&
            Objects.equals(this.triggeringAction, queueConversationSocialExpressionEventTopicJourneyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicJourneyContext {\n");
    
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

