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
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicDetail;
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicLimit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationMessageEventTopicErrorBody
 */

public class ConversationMessageEventTopicErrorBody  implements Serializable {
  
  private String message = null;
  private String code = null;
  private Long status = null;
  private String entityId = null;
  private String entityName = null;
  private String messageWithParams = null;
  private Map<String, String> messageParams = null;
  private String contextId = null;
  private List<ConversationMessageEventTopicDetail> details = null;
  private List<ConversationMessageEventTopicErrorBody> errors = null;
  private ConversationMessageEventTopicLimit limit = null;

  public ConversationMessageEventTopicErrorBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      details = new ArrayList<ConversationMessageEventTopicDetail>();
      errors = new ArrayList<ConversationMessageEventTopicErrorBody>();
    }
  }

  
  /**
   **/
  public ConversationMessageEventTopicErrorBody message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityId")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityName")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody messageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageWithParams")
  public String getMessageWithParams() {
    return messageWithParams;
  }
  public void setMessageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody messageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageParams")
  public Map<String, String> getMessageParams() {
    return messageParams;
  }
  public void setMessageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody details(List<ConversationMessageEventTopicDetail> details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("details")
  public List<ConversationMessageEventTopicDetail> getDetails() {
    return details;
  }
  public void setDetails(List<ConversationMessageEventTopicDetail> details) {
    this.details = details;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody errors(List<ConversationMessageEventTopicErrorBody> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<ConversationMessageEventTopicErrorBody> getErrors() {
    return errors;
  }
  public void setErrors(List<ConversationMessageEventTopicErrorBody> errors) {
    this.errors = errors;
  }


  /**
   **/
  public ConversationMessageEventTopicErrorBody limit(ConversationMessageEventTopicLimit limit) {
    this.limit = limit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limit")
  public ConversationMessageEventTopicLimit getLimit() {
    return limit;
  }
  public void setLimit(ConversationMessageEventTopicLimit limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageEventTopicErrorBody conversationMessageEventTopicErrorBody = (ConversationMessageEventTopicErrorBody) o;

    return Objects.equals(this.message, conversationMessageEventTopicErrorBody.message) &&
            Objects.equals(this.code, conversationMessageEventTopicErrorBody.code) &&
            Objects.equals(this.status, conversationMessageEventTopicErrorBody.status) &&
            Objects.equals(this.entityId, conversationMessageEventTopicErrorBody.entityId) &&
            Objects.equals(this.entityName, conversationMessageEventTopicErrorBody.entityName) &&
            Objects.equals(this.messageWithParams, conversationMessageEventTopicErrorBody.messageWithParams) &&
            Objects.equals(this.messageParams, conversationMessageEventTopicErrorBody.messageParams) &&
            Objects.equals(this.contextId, conversationMessageEventTopicErrorBody.contextId) &&
            Objects.equals(this.details, conversationMessageEventTopicErrorBody.details) &&
            Objects.equals(this.errors, conversationMessageEventTopicErrorBody.errors) &&
            Objects.equals(this.limit, conversationMessageEventTopicErrorBody.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, status, entityId, entityName, messageWithParams, messageParams, contextId, details, errors, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageEventTopicErrorBody {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

