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
import com.mypurecloud.sdk.v2.model.OperationalEventNotificationTopicEventEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OperationalEventNotificationTopicOperationalEventNotification
 */

public class OperationalEventNotificationTopicOperationalEventNotification  implements Serializable {
  
  private OperationalEventNotificationTopicEventEntity eventEntity = null;
  private String entityId = null;
  private String entityName = null;
  private String previousValue = null;
  private String currentValue = null;
  private String errorCode = null;
  private String version = null;
  private String parentEntity = null;
  private String entityType = null;
  private String conversationId = null;
  private Integer timestamp = null;

  
  /**
   **/
  public OperationalEventNotificationTopicOperationalEventNotification eventEntity(OperationalEventNotificationTopicEventEntity eventEntity) {
    this.eventEntity = eventEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventEntity")
  public OperationalEventNotificationTopicEventEntity getEventEntity() {
    return eventEntity;
  }
  public void setEventEntity(OperationalEventNotificationTopicEventEntity eventEntity) {
    this.eventEntity = eventEntity;
  }


  /**
   **/
  public OperationalEventNotificationTopicOperationalEventNotification entityId(String entityId) {
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
  public OperationalEventNotificationTopicOperationalEventNotification entityName(String entityName) {
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
  public OperationalEventNotificationTopicOperationalEventNotification previousValue(String previousValue) {
    this.previousValue = previousValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousValue")
  public String getPreviousValue() {
    return previousValue;
  }
  public void setPreviousValue(String previousValue) {
    this.previousValue = previousValue;
  }


  /**
   **/
  public OperationalEventNotificationTopicOperationalEventNotification currentValue(String currentValue) {
    this.currentValue = currentValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentValue")
  public String getCurrentValue() {
    return currentValue;
  }
  public void setCurrentValue(String currentValue) {
    this.currentValue = currentValue;
  }


  /**
   **/
  public OperationalEventNotificationTopicOperationalEventNotification errorCode(String errorCode) {
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
  public OperationalEventNotificationTopicOperationalEventNotification version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   **/
  public OperationalEventNotificationTopicOperationalEventNotification parentEntity(String parentEntity) {
    this.parentEntity = parentEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parentEntity")
  public String getParentEntity() {
    return parentEntity;
  }
  public void setParentEntity(String parentEntity) {
    this.parentEntity = parentEntity;
  }


  /**
   **/
  public OperationalEventNotificationTopicOperationalEventNotification entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  /**
   **/
  public OperationalEventNotificationTopicOperationalEventNotification conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public OperationalEventNotificationTopicOperationalEventNotification timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalEventNotificationTopicOperationalEventNotification operationalEventNotificationTopicOperationalEventNotification = (OperationalEventNotificationTopicOperationalEventNotification) o;

    return Objects.equals(this.eventEntity, operationalEventNotificationTopicOperationalEventNotification.eventEntity) &&
            Objects.equals(this.entityId, operationalEventNotificationTopicOperationalEventNotification.entityId) &&
            Objects.equals(this.entityName, operationalEventNotificationTopicOperationalEventNotification.entityName) &&
            Objects.equals(this.previousValue, operationalEventNotificationTopicOperationalEventNotification.previousValue) &&
            Objects.equals(this.currentValue, operationalEventNotificationTopicOperationalEventNotification.currentValue) &&
            Objects.equals(this.errorCode, operationalEventNotificationTopicOperationalEventNotification.errorCode) &&
            Objects.equals(this.version, operationalEventNotificationTopicOperationalEventNotification.version) &&
            Objects.equals(this.parentEntity, operationalEventNotificationTopicOperationalEventNotification.parentEntity) &&
            Objects.equals(this.entityType, operationalEventNotificationTopicOperationalEventNotification.entityType) &&
            Objects.equals(this.conversationId, operationalEventNotificationTopicOperationalEventNotification.conversationId) &&
            Objects.equals(this.timestamp, operationalEventNotificationTopicOperationalEventNotification.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventEntity, entityId, entityName, previousValue, currentValue, errorCode, version, parentEntity, entityType, conversationId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalEventNotificationTopicOperationalEventNotification {\n");
    
    sb.append("    eventEntity: ").append(toIndentedString(eventEntity)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    parentEntity: ").append(toIndentedString(parentEntity)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

