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
            Objects.equals(this.entityName, operationalEventNotificationTopicOperationalEventNotification.entityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventEntity, entityId, entityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalEventNotificationTopicOperationalEventNotification {\n");
    
    sb.append("    eventEntity: ").append(toIndentedString(eventEntity)).append("\n");
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

