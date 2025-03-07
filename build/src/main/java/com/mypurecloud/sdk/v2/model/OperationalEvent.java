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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OperationalEvent
 */

public class OperationalEvent  implements Serializable {
  
  private AddressableEntityRef eventDefinition = null;
  private String entityId = null;
  private String entityToken = null;
  private String entityName = null;
  private String previousValue = null;
  private String currentValue = null;
  private String errorCode = null;
  private String parentEntityId = null;
  private AddressableEntityRef conversation = null;
  private Date dateCreated = null;
  private String entityVersion = null;

  
  /**
   * The event that occurred.
   **/
  public OperationalEvent eventDefinition(AddressableEntityRef eventDefinition) {
    this.eventDefinition = eventDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The event that occurred.")
  @JsonProperty("eventDefinition")
  public AddressableEntityRef getEventDefinition() {
    return eventDefinition;
  }
  public void setEventDefinition(AddressableEntityRef eventDefinition) {
    this.eventDefinition = eventDefinition;
  }


  /**
   * The unique identifier for the entity
   **/
  public OperationalEvent entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier for the entity")
  @JsonProperty("entityId")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  /**
   * A token representing the entity
   **/
  public OperationalEvent entityToken(String entityToken) {
    this.entityToken = entityToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A token representing the entity")
  @JsonProperty("entityToken")
  public String getEntityToken() {
    return entityToken;
  }
  public void setEntityToken(String entityToken) {
    this.entityToken = entityToken;
  }


  /**
   * The name for the entity
   **/
  public OperationalEvent entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name for the entity")
  @JsonProperty("entityName")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  /**
   * The value prior to the event
   **/
  public OperationalEvent previousValue(String previousValue) {
    this.previousValue = previousValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value prior to the event")
  @JsonProperty("previousValue")
  public String getPreviousValue() {
    return previousValue;
  }
  public void setPreviousValue(String previousValue) {
    this.previousValue = previousValue;
  }


  /**
   * The changed value following the event
   **/
  public OperationalEvent currentValue(String currentValue) {
    this.currentValue = currentValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The changed value following the event")
  @JsonProperty("currentValue")
  public String getCurrentValue() {
    return currentValue;
  }
  public void setCurrentValue(String currentValue) {
    this.currentValue = currentValue;
  }


  /**
   * The error code of the entity in the providing service associated to the event
   **/
  public OperationalEvent errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error code of the entity in the providing service associated to the event")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * The unique identifier for the parent of the entity
   **/
  public OperationalEvent parentEntityId(String parentEntityId) {
    this.parentEntityId = parentEntityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier for the parent of the entity")
  @JsonProperty("parentEntityId")
  public String getParentEntityId() {
    return parentEntityId;
  }
  public void setParentEntityId(String parentEntityId) {
    this.parentEntityId = parentEntityId;
  }


  /**
   * The link to a conversation
   **/
  public OperationalEvent conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The link to a conversation")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }


  /**
   * The date when the event created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OperationalEvent dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the event created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The version of the entity in the providing service
   **/
  public OperationalEvent entityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the entity in the providing service")
  @JsonProperty("entityVersion")
  public String getEntityVersion() {
    return entityVersion;
  }
  public void setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalEvent operationalEvent = (OperationalEvent) o;

    return Objects.equals(this.eventDefinition, operationalEvent.eventDefinition) &&
            Objects.equals(this.entityId, operationalEvent.entityId) &&
            Objects.equals(this.entityToken, operationalEvent.entityToken) &&
            Objects.equals(this.entityName, operationalEvent.entityName) &&
            Objects.equals(this.previousValue, operationalEvent.previousValue) &&
            Objects.equals(this.currentValue, operationalEvent.currentValue) &&
            Objects.equals(this.errorCode, operationalEvent.errorCode) &&
            Objects.equals(this.parentEntityId, operationalEvent.parentEntityId) &&
            Objects.equals(this.conversation, operationalEvent.conversation) &&
            Objects.equals(this.dateCreated, operationalEvent.dateCreated) &&
            Objects.equals(this.entityVersion, operationalEvent.entityVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDefinition, entityId, entityToken, entityName, previousValue, currentValue, errorCode, parentEntityId, conversation, dateCreated, entityVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalEvent {\n");
    
    sb.append("    eventDefinition: ").append(toIndentedString(eventDefinition)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityToken: ").append(toIndentedString(entityToken)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    parentEntityId: ").append(toIndentedString(parentEntityId)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    entityVersion: ").append(toIndentedString(entityVersion)).append("\n");
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

