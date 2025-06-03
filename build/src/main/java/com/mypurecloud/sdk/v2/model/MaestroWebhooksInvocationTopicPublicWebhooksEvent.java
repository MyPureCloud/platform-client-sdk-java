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
import com.mypurecloud.sdk.v2.model.MaestroWebhooksInvocationTopicWebhooksInvocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MaestroWebhooksInvocationTopicPublicWebhooksEvent
 */

public class MaestroWebhooksInvocationTopicPublicWebhooksEvent  implements Serializable {
  
  private String webhookId = null;
  private String invocationTime = null;
  private MaestroWebhooksInvocationTopicWebhooksInvocation webhooksInvocation = null;

  public MaestroWebhooksInvocationTopicPublicWebhooksEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public MaestroWebhooksInvocationTopicPublicWebhooksEvent webhookId(String webhookId) {
    this.webhookId = webhookId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("webhookId")
  public String getWebhookId() {
    return webhookId;
  }
  public void setWebhookId(String webhookId) {
    this.webhookId = webhookId;
  }


  /**
   **/
  public MaestroWebhooksInvocationTopicPublicWebhooksEvent invocationTime(String invocationTime) {
    this.invocationTime = invocationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invocationTime")
  public String getInvocationTime() {
    return invocationTime;
  }
  public void setInvocationTime(String invocationTime) {
    this.invocationTime = invocationTime;
  }


  /**
   **/
  public MaestroWebhooksInvocationTopicPublicWebhooksEvent webhooksInvocation(MaestroWebhooksInvocationTopicWebhooksInvocation webhooksInvocation) {
    this.webhooksInvocation = webhooksInvocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("webhooksInvocation")
  public MaestroWebhooksInvocationTopicWebhooksInvocation getWebhooksInvocation() {
    return webhooksInvocation;
  }
  public void setWebhooksInvocation(MaestroWebhooksInvocationTopicWebhooksInvocation webhooksInvocation) {
    this.webhooksInvocation = webhooksInvocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaestroWebhooksInvocationTopicPublicWebhooksEvent maestroWebhooksInvocationTopicPublicWebhooksEvent = (MaestroWebhooksInvocationTopicPublicWebhooksEvent) o;

    return Objects.equals(this.webhookId, maestroWebhooksInvocationTopicPublicWebhooksEvent.webhookId) &&
            Objects.equals(this.invocationTime, maestroWebhooksInvocationTopicPublicWebhooksEvent.invocationTime) &&
            Objects.equals(this.webhooksInvocation, maestroWebhooksInvocationTopicPublicWebhooksEvent.webhooksInvocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookId, invocationTime, webhooksInvocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaestroWebhooksInvocationTopicPublicWebhooksEvent {\n");
    
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    invocationTime: ").append(toIndentedString(invocationTime)).append("\n");
    sb.append("    webhooksInvocation: ").append(toIndentedString(webhooksInvocation)).append("\n");
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

