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

import java.io.Serializable;
/**
 * QueueConversationChatEventTopicDetail
 */

public class QueueConversationChatEventTopicDetail  implements Serializable {
  
  private String errorCode = null;
  private String fieldName = null;
  private String entityId = null;
  private String entityName = null;

  
  /**
   **/
  public QueueConversationChatEventTopicDetail errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  
  /**
   **/
  public QueueConversationChatEventTopicDetail fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fieldName")
  public String getFieldName() {
    return fieldName;
  }
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  
  /**
   **/
  public QueueConversationChatEventTopicDetail entityId(String entityId) {
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
  public QueueConversationChatEventTopicDetail entityName(String entityName) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationChatEventTopicDetail queueConversationChatEventTopicDetail = (QueueConversationChatEventTopicDetail) o;
    return Objects.equals(this.errorCode, queueConversationChatEventTopicDetail.errorCode) &&
        Objects.equals(this.fieldName, queueConversationChatEventTopicDetail.fieldName) &&
        Objects.equals(this.entityId, queueConversationChatEventTopicDetail.entityId) &&
        Objects.equals(this.entityName, queueConversationChatEventTopicDetail.entityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, fieldName, entityId, entityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationChatEventTopicDetail {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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

