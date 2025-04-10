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
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicDetail;
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicLimit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationScreenShareEventTopicErrorBody
 */

public class ConversationScreenShareEventTopicErrorBody  implements Serializable {
  
  private String message = null;
  private String code = null;
  private Long status = null;
  private String entityId = null;
  private String entityName = null;
  private String messageWithParams = null;
  private Map<String, String> messageParams = null;
  private String contextId = null;
  private List<ConversationScreenShareEventTopicDetail> details = null;
  private List<ConversationScreenShareEventTopicErrorBody> errors = null;
  private ConversationScreenShareEventTopicLimit limit = null;

  public ConversationScreenShareEventTopicErrorBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      details = new ArrayList<ConversationScreenShareEventTopicDetail>();
      errors = new ArrayList<ConversationScreenShareEventTopicErrorBody>();
    }
  }

  
  /**
   **/
  public ConversationScreenShareEventTopicErrorBody message(String message) {
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
  public ConversationScreenShareEventTopicErrorBody code(String code) {
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
  public ConversationScreenShareEventTopicErrorBody status(Long status) {
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
  public ConversationScreenShareEventTopicErrorBody entityId(String entityId) {
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
  public ConversationScreenShareEventTopicErrorBody entityName(String entityName) {
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
  public ConversationScreenShareEventTopicErrorBody messageWithParams(String messageWithParams) {
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
  public ConversationScreenShareEventTopicErrorBody messageParams(Map<String, String> messageParams) {
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
  public ConversationScreenShareEventTopicErrorBody contextId(String contextId) {
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
  public ConversationScreenShareEventTopicErrorBody details(List<ConversationScreenShareEventTopicDetail> details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("details")
  public List<ConversationScreenShareEventTopicDetail> getDetails() {
    return details;
  }
  public void setDetails(List<ConversationScreenShareEventTopicDetail> details) {
    this.details = details;
  }


  /**
   **/
  public ConversationScreenShareEventTopicErrorBody errors(List<ConversationScreenShareEventTopicErrorBody> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<ConversationScreenShareEventTopicErrorBody> getErrors() {
    return errors;
  }
  public void setErrors(List<ConversationScreenShareEventTopicErrorBody> errors) {
    this.errors = errors;
  }


  /**
   **/
  public ConversationScreenShareEventTopicErrorBody limit(ConversationScreenShareEventTopicLimit limit) {
    this.limit = limit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limit")
  public ConversationScreenShareEventTopicLimit getLimit() {
    return limit;
  }
  public void setLimit(ConversationScreenShareEventTopicLimit limit) {
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
    ConversationScreenShareEventTopicErrorBody conversationScreenShareEventTopicErrorBody = (ConversationScreenShareEventTopicErrorBody) o;

    return Objects.equals(this.message, conversationScreenShareEventTopicErrorBody.message) &&
            Objects.equals(this.code, conversationScreenShareEventTopicErrorBody.code) &&
            Objects.equals(this.status, conversationScreenShareEventTopicErrorBody.status) &&
            Objects.equals(this.entityId, conversationScreenShareEventTopicErrorBody.entityId) &&
            Objects.equals(this.entityName, conversationScreenShareEventTopicErrorBody.entityName) &&
            Objects.equals(this.messageWithParams, conversationScreenShareEventTopicErrorBody.messageWithParams) &&
            Objects.equals(this.messageParams, conversationScreenShareEventTopicErrorBody.messageParams) &&
            Objects.equals(this.contextId, conversationScreenShareEventTopicErrorBody.contextId) &&
            Objects.equals(this.details, conversationScreenShareEventTopicErrorBody.details) &&
            Objects.equals(this.errors, conversationScreenShareEventTopicErrorBody.errors) &&
            Objects.equals(this.limit, conversationScreenShareEventTopicErrorBody.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, status, entityId, entityName, messageWithParams, messageParams, contextId, details, errors, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationScreenShareEventTopicErrorBody {\n");
    
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

