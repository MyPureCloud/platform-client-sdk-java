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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueConversationMessageEventTopicErrorDetails
 */

public class QueueConversationMessageEventTopicErrorDetails  implements Serializable {
  
  private Integer status = null;
  private String code = null;
  private String message = null;
  private String messageWithParams = null;
  private Map<String, String> messageParams = null;
  private String contextId = null;
  private String uri = null;
  private Map<String, Object> additionalProperties = null;

  
  /**
   * The HTTP status code for this message (400, 401, 403, 404, 500, etc.
   **/
  public QueueConversationMessageEventTopicErrorDetails status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The HTTP status code for this message (400, 401, 403, 404, 500, etc.")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }


  /**
   * A code unique to this error.
   **/
  public QueueConversationMessageEventTopicErrorDetails code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A code unique to this error.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Friendly description of this error.
   **/
  public QueueConversationMessageEventTopicErrorDetails message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Friendly description of this error.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * This is the same as message except it uses template fields for variable replacement. For instance: 'User {username} was not found'
   **/
  public QueueConversationMessageEventTopicErrorDetails messageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the same as message except it uses template fields for variable replacement. For instance: 'User {username} was not found'")
  @JsonProperty("messageWithParams")
  public String getMessageWithParams() {
    return messageWithParams;
  }
  public void setMessageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
  }


  /**
   * Used in conjunction with messageWithParams. These are the template parameters. For instance: UserParam.key = 'username', UserParam.value = 'john.doe'
   **/
  public QueueConversationMessageEventTopicErrorDetails messageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Used in conjunction with messageWithParams. These are the template parameters. For instance: UserParam.key = 'username', UserParam.value = 'john.doe'")
  @JsonProperty("messageParams")
  public Map<String, String> getMessageParams() {
    return messageParams;
  }
  public void setMessageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
  }


  /**
   * The correlation Id or context Id for this message. If left blank the Public API will look at the HTTP response header 'ININ-Correlation-Id' instead.
   **/
  public QueueConversationMessageEventTopicErrorDetails contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The correlation Id or context Id for this message. If left blank the Public API will look at the HTTP response header 'ININ-Correlation-Id' instead.")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  /**
   **/
  public QueueConversationMessageEventTopicErrorDetails uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   **/
  public QueueConversationMessageEventTopicErrorDetails additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationMessageEventTopicErrorDetails queueConversationMessageEventTopicErrorDetails = (QueueConversationMessageEventTopicErrorDetails) o;

    return Objects.equals(this.status, queueConversationMessageEventTopicErrorDetails.status) &&
            Objects.equals(this.code, queueConversationMessageEventTopicErrorDetails.code) &&
            Objects.equals(this.message, queueConversationMessageEventTopicErrorDetails.message) &&
            Objects.equals(this.messageWithParams, queueConversationMessageEventTopicErrorDetails.messageWithParams) &&
            Objects.equals(this.messageParams, queueConversationMessageEventTopicErrorDetails.messageParams) &&
            Objects.equals(this.contextId, queueConversationMessageEventTopicErrorDetails.contextId) &&
            Objects.equals(this.uri, queueConversationMessageEventTopicErrorDetails.uri) &&
            Objects.equals(this.additionalProperties, queueConversationMessageEventTopicErrorDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, message, messageWithParams, messageParams, contextId, uri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationMessageEventTopicErrorDetails {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

