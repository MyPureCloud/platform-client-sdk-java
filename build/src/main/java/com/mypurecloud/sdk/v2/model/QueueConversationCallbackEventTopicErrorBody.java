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
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicDetail;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicLimit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueConversationCallbackEventTopicErrorBody
 */

public class QueueConversationCallbackEventTopicErrorBody  implements Serializable {
  
  private String message = null;
  private String code = null;
  private Long status = null;
  private String entityId = null;
  private String entityName = null;
  private String messageWithParams = null;
  private Map<String, String> messageParams = null;
  private String contextId = null;
  private List<QueueConversationCallbackEventTopicDetail> details = null;
  private List<QueueConversationCallbackEventTopicErrorBody> errors = null;
  private QueueConversationCallbackEventTopicLimit limit = null;

  public QueueConversationCallbackEventTopicErrorBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      details = new ArrayList<QueueConversationCallbackEventTopicDetail>();
      errors = new ArrayList<QueueConversationCallbackEventTopicErrorBody>();
    }
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicErrorBody message(String message) {
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
  public QueueConversationCallbackEventTopicErrorBody code(String code) {
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
  public QueueConversationCallbackEventTopicErrorBody status(Long status) {
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
  public QueueConversationCallbackEventTopicErrorBody entityId(String entityId) {
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
  public QueueConversationCallbackEventTopicErrorBody entityName(String entityName) {
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
  public QueueConversationCallbackEventTopicErrorBody messageWithParams(String messageWithParams) {
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
  public QueueConversationCallbackEventTopicErrorBody messageParams(Map<String, String> messageParams) {
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
  public QueueConversationCallbackEventTopicErrorBody contextId(String contextId) {
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
  public QueueConversationCallbackEventTopicErrorBody details(List<QueueConversationCallbackEventTopicDetail> details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("details")
  public List<QueueConversationCallbackEventTopicDetail> getDetails() {
    return details;
  }
  public void setDetails(List<QueueConversationCallbackEventTopicDetail> details) {
    this.details = details;
  }


  /**
   **/
  public QueueConversationCallbackEventTopicErrorBody errors(List<QueueConversationCallbackEventTopicErrorBody> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<QueueConversationCallbackEventTopicErrorBody> getErrors() {
    return errors;
  }
  public void setErrors(List<QueueConversationCallbackEventTopicErrorBody> errors) {
    this.errors = errors;
  }


  /**
   **/
  public QueueConversationCallbackEventTopicErrorBody limit(QueueConversationCallbackEventTopicLimit limit) {
    this.limit = limit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limit")
  public QueueConversationCallbackEventTopicLimit getLimit() {
    return limit;
  }
  public void setLimit(QueueConversationCallbackEventTopicLimit limit) {
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
    QueueConversationCallbackEventTopicErrorBody queueConversationCallbackEventTopicErrorBody = (QueueConversationCallbackEventTopicErrorBody) o;

    return Objects.equals(this.message, queueConversationCallbackEventTopicErrorBody.message) &&
            Objects.equals(this.code, queueConversationCallbackEventTopicErrorBody.code) &&
            Objects.equals(this.status, queueConversationCallbackEventTopicErrorBody.status) &&
            Objects.equals(this.entityId, queueConversationCallbackEventTopicErrorBody.entityId) &&
            Objects.equals(this.entityName, queueConversationCallbackEventTopicErrorBody.entityName) &&
            Objects.equals(this.messageWithParams, queueConversationCallbackEventTopicErrorBody.messageWithParams) &&
            Objects.equals(this.messageParams, queueConversationCallbackEventTopicErrorBody.messageParams) &&
            Objects.equals(this.contextId, queueConversationCallbackEventTopicErrorBody.contextId) &&
            Objects.equals(this.details, queueConversationCallbackEventTopicErrorBody.details) &&
            Objects.equals(this.errors, queueConversationCallbackEventTopicErrorBody.errors) &&
            Objects.equals(this.limit, queueConversationCallbackEventTopicErrorBody.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, status, entityId, entityName, messageWithParams, messageParams, contextId, details, errors, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallbackEventTopicErrorBody {\n");
    
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

