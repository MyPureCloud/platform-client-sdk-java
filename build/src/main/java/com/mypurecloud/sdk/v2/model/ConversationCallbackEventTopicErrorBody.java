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
import com.mypurecloud.sdk.v2.model.ConversationCallbackEventTopicDetail;
import com.mypurecloud.sdk.v2.model.ConversationCallbackEventTopicErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationCallbackEventTopicErrorBody
 */

public class ConversationCallbackEventTopicErrorBody  implements Serializable {
  
  private String message = null;
  private String code = null;
  private Integer status = null;
  private String entityId = null;
  private String entityName = null;
  private String messageWithParams = null;
  private Map<String, String> messageParams = null;
  private String contextId = null;
  private List<ConversationCallbackEventTopicDetail> details = new ArrayList<ConversationCallbackEventTopicDetail>();
  private List<ConversationCallbackEventTopicErrorBody> errors = new ArrayList<ConversationCallbackEventTopicErrorBody>();

  
  /**
   **/
  public ConversationCallbackEventTopicErrorBody message(String message) {
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
  public ConversationCallbackEventTopicErrorBody code(String code) {
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
  public ConversationCallbackEventTopicErrorBody status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  public ConversationCallbackEventTopicErrorBody entityId(String entityId) {
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
  public ConversationCallbackEventTopicErrorBody entityName(String entityName) {
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
  public ConversationCallbackEventTopicErrorBody messageWithParams(String messageWithParams) {
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
  public ConversationCallbackEventTopicErrorBody messageParams(Map<String, String> messageParams) {
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
  public ConversationCallbackEventTopicErrorBody contextId(String contextId) {
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
  public ConversationCallbackEventTopicErrorBody details(List<ConversationCallbackEventTopicDetail> details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("details")
  public List<ConversationCallbackEventTopicDetail> getDetails() {
    return details;
  }
  public void setDetails(List<ConversationCallbackEventTopicDetail> details) {
    this.details = details;
  }

  
  /**
   **/
  public ConversationCallbackEventTopicErrorBody errors(List<ConversationCallbackEventTopicErrorBody> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<ConversationCallbackEventTopicErrorBody> getErrors() {
    return errors;
  }
  public void setErrors(List<ConversationCallbackEventTopicErrorBody> errors) {
    this.errors = errors;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCallbackEventTopicErrorBody conversationCallbackEventTopicErrorBody = (ConversationCallbackEventTopicErrorBody) o;
    return Objects.equals(this.message, conversationCallbackEventTopicErrorBody.message) &&
        Objects.equals(this.code, conversationCallbackEventTopicErrorBody.code) &&
        Objects.equals(this.status, conversationCallbackEventTopicErrorBody.status) &&
        Objects.equals(this.entityId, conversationCallbackEventTopicErrorBody.entityId) &&
        Objects.equals(this.entityName, conversationCallbackEventTopicErrorBody.entityName) &&
        Objects.equals(this.messageWithParams, conversationCallbackEventTopicErrorBody.messageWithParams) &&
        Objects.equals(this.messageParams, conversationCallbackEventTopicErrorBody.messageParams) &&
        Objects.equals(this.contextId, conversationCallbackEventTopicErrorBody.contextId) &&
        Objects.equals(this.details, conversationCallbackEventTopicErrorBody.details) &&
        Objects.equals(this.errors, conversationCallbackEventTopicErrorBody.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, status, entityId, entityName, messageWithParams, messageParams, contextId, details, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCallbackEventTopicErrorBody {\n");
    
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

