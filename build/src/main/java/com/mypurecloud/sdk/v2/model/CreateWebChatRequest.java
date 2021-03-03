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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CreateWebChatRequest
 */

public class CreateWebChatRequest  implements Serializable {
  
  private String queueId = null;
  private String provider = null;
  private List<String> skillIds = new ArrayList<String>();
  private String languageId = null;
  private Long priority = null;
  private Map<String, String> attributes = null;
  private String customerName = null;

  
  /**
   * The ID of the queue to use for routing the chat conversation.
   **/
  public CreateWebChatRequest queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the queue to use for routing the chat conversation.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * The name of the provider that is sourcing the web chat.
   **/
  public CreateWebChatRequest provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the provider that is sourcing the web chat.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * The list of skill ID's to use for routing.
   **/
  public CreateWebChatRequest skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of skill ID's to use for routing.")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  
  /**
   * The ID of the langauge to use for routing.
   **/
  public CreateWebChatRequest languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the langauge to use for routing.")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  
  /**
   * The priority to assign to the conversation for routing.
   **/
  public CreateWebChatRequest priority(Long priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority to assign to the conversation for routing.")
  @JsonProperty("priority")
  public Long getPriority() {
    return priority;
  }
  public void setPriority(Long priority) {
    this.priority = priority;
  }

  
  /**
   * The list of attributes to associate with the customer participant.
   **/
  public CreateWebChatRequest attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of attributes to associate with the customer participant.")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  
  /**
   * The name of the customer participating in the web chat.
   **/
  public CreateWebChatRequest customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the customer participating in the web chat.")
  @JsonProperty("customerName")
  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebChatRequest createWebChatRequest = (CreateWebChatRequest) o;
    return Objects.equals(this.queueId, createWebChatRequest.queueId) &&
        Objects.equals(this.provider, createWebChatRequest.provider) &&
        Objects.equals(this.skillIds, createWebChatRequest.skillIds) &&
        Objects.equals(this.languageId, createWebChatRequest.languageId) &&
        Objects.equals(this.priority, createWebChatRequest.priority) &&
        Objects.equals(this.attributes, createWebChatRequest.attributes) &&
        Objects.equals(this.customerName, createWebChatRequest.customerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, provider, skillIds, languageId, priority, attributes, customerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebChatRequest {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
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

