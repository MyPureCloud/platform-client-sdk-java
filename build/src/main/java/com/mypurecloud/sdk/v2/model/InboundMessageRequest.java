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
 * InboundMessageRequest
 */

public class InboundMessageRequest  implements Serializable {
  
  private String queueId = null;
  private String flowId = null;
  private String provider = null;
  private List<String> skillIds = new ArrayList<String>();
  private String languageId = null;
  private Integer priority = null;
  private Map<String, String> attributes = null;
  private String toAddress = null;
  private String toName = null;
  private String fromAddress = null;
  private String fromName = null;
  private String subject = null;

  
  /**
   * The ID of the queue to use for routing the email conversation. This field is mutually exclusive with flowId
   **/
  public InboundMessageRequest queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the queue to use for routing the email conversation. This field is mutually exclusive with flowId")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * The ID of the flow to use for routing email conversation. This field is mutually exclusive with queueId
   **/
  public InboundMessageRequest flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the flow to use for routing email conversation. This field is mutually exclusive with queueId")
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  
  /**
   * The name of the provider that is sourcing the email such as Oracle, Salesforce, etc.
   **/
  public InboundMessageRequest provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the provider that is sourcing the email such as Oracle, Salesforce, etc.")
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
  public InboundMessageRequest skillIds(List<String> skillIds) {
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
   * The ID of the language to use for routing.
   **/
  public InboundMessageRequest languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the language to use for routing.")
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
  public InboundMessageRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority to assign to the conversation for routing.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * The list of attributes to associate with the customer participant.
   **/
  public InboundMessageRequest attributes(Map<String, String> attributes) {
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
   * The email address of the recipient of the email.
   **/
  public InboundMessageRequest toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address of the recipient of the email.")
  @JsonProperty("toAddress")
  public String getToAddress() {
    return toAddress;
  }
  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  
  /**
   * The name of the recipient of the email.
   **/
  public InboundMessageRequest toName(String toName) {
    this.toName = toName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the recipient of the email.")
  @JsonProperty("toName")
  public String getToName() {
    return toName;
  }
  public void setToName(String toName) {
    this.toName = toName;
  }

  
  /**
   * The email address of the sender of the email.
   **/
  public InboundMessageRequest fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address of the sender of the email.")
  @JsonProperty("fromAddress")
  public String getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   * The name of the sender of the email.
   **/
  public InboundMessageRequest fromName(String fromName) {
    this.fromName = fromName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the sender of the email.")
  @JsonProperty("fromName")
  public String getFromName() {
    return fromName;
  }
  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  
  /**
   * The subject of the email
   **/
  public InboundMessageRequest subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subject of the email")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessageRequest inboundMessageRequest = (InboundMessageRequest) o;
    return Objects.equals(this.queueId, inboundMessageRequest.queueId) &&
        Objects.equals(this.flowId, inboundMessageRequest.flowId) &&
        Objects.equals(this.provider, inboundMessageRequest.provider) &&
        Objects.equals(this.skillIds, inboundMessageRequest.skillIds) &&
        Objects.equals(this.languageId, inboundMessageRequest.languageId) &&
        Objects.equals(this.priority, inboundMessageRequest.priority) &&
        Objects.equals(this.attributes, inboundMessageRequest.attributes) &&
        Objects.equals(this.toAddress, inboundMessageRequest.toAddress) &&
        Objects.equals(this.toName, inboundMessageRequest.toName) &&
        Objects.equals(this.fromAddress, inboundMessageRequest.fromAddress) &&
        Objects.equals(this.fromName, inboundMessageRequest.fromName) &&
        Objects.equals(this.subject, inboundMessageRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, flowId, provider, skillIds, languageId, priority, attributes, toAddress, toName, fromAddress, fromName, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundMessageRequest {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    toName: ").append(toIndentedString(toName)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

