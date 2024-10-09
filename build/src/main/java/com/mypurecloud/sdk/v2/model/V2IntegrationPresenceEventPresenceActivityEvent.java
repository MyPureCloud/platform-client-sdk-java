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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.V2IntegrationPresenceEventOrganizationPresence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * V2IntegrationPresenceEventPresenceActivityEvent
 */

public class V2IntegrationPresenceEventPresenceActivityEvent  implements Serializable {
  
  private String userId = null;

  private static class EventTypeEnumDeserializer extends StdDeserializer<EventTypeEnum> {
    public EventTypeEnumDeserializer() {
      super(EventTypeEnumDeserializer.class);
    }

    @Override
    public EventTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EventTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets eventType
   */
 @JsonDeserialize(using = EventTypeEnumDeserializer.class)
  public enum EventTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USERPRESENCESTATUSCHANGED("UserPresenceStatusChanged"),
    USERPRIMARYPRESENCESOURCECHANGED("UserPrimaryPresenceSourceChanged");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EventTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EventTypeEnum value : EventTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EventTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EventTypeEnum eventType = null;
  private String source = null;
  private Date modifiedDate = null;
  private V2IntegrationPresenceEventOrganizationPresence presenceDefinition = null;
  private String message = null;
  private String currentDisplaySourceId = null;
  private String previousDisplaySourceId = null;

  
  /**
   **/
  public V2IntegrationPresenceEventPresenceActivityEvent userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public V2IntegrationPresenceEventPresenceActivityEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventType")
  public EventTypeEnum getEventType() {
    return eventType;
  }
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  /**
   **/
  public V2IntegrationPresenceEventPresenceActivityEvent source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   **/
  public V2IntegrationPresenceEventPresenceActivityEvent modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  /**
   **/
  public V2IntegrationPresenceEventPresenceActivityEvent presenceDefinition(V2IntegrationPresenceEventOrganizationPresence presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presenceDefinition")
  public V2IntegrationPresenceEventOrganizationPresence getPresenceDefinition() {
    return presenceDefinition;
  }
  public void setPresenceDefinition(V2IntegrationPresenceEventOrganizationPresence presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
  }


  /**
   **/
  public V2IntegrationPresenceEventPresenceActivityEvent message(String message) {
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
  public V2IntegrationPresenceEventPresenceActivityEvent currentDisplaySourceId(String currentDisplaySourceId) {
    this.currentDisplaySourceId = currentDisplaySourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentDisplaySourceId")
  public String getCurrentDisplaySourceId() {
    return currentDisplaySourceId;
  }
  public void setCurrentDisplaySourceId(String currentDisplaySourceId) {
    this.currentDisplaySourceId = currentDisplaySourceId;
  }


  /**
   **/
  public V2IntegrationPresenceEventPresenceActivityEvent previousDisplaySourceId(String previousDisplaySourceId) {
    this.previousDisplaySourceId = previousDisplaySourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousDisplaySourceId")
  public String getPreviousDisplaySourceId() {
    return previousDisplaySourceId;
  }
  public void setPreviousDisplaySourceId(String previousDisplaySourceId) {
    this.previousDisplaySourceId = previousDisplaySourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2IntegrationPresenceEventPresenceActivityEvent v2IntegrationPresenceEventPresenceActivityEvent = (V2IntegrationPresenceEventPresenceActivityEvent) o;

    return Objects.equals(this.userId, v2IntegrationPresenceEventPresenceActivityEvent.userId) &&
            Objects.equals(this.eventType, v2IntegrationPresenceEventPresenceActivityEvent.eventType) &&
            Objects.equals(this.source, v2IntegrationPresenceEventPresenceActivityEvent.source) &&
            Objects.equals(this.modifiedDate, v2IntegrationPresenceEventPresenceActivityEvent.modifiedDate) &&
            Objects.equals(this.presenceDefinition, v2IntegrationPresenceEventPresenceActivityEvent.presenceDefinition) &&
            Objects.equals(this.message, v2IntegrationPresenceEventPresenceActivityEvent.message) &&
            Objects.equals(this.currentDisplaySourceId, v2IntegrationPresenceEventPresenceActivityEvent.currentDisplaySourceId) &&
            Objects.equals(this.previousDisplaySourceId, v2IntegrationPresenceEventPresenceActivityEvent.previousDisplaySourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, eventType, source, modifiedDate, presenceDefinition, message, currentDisplaySourceId, previousDisplaySourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2IntegrationPresenceEventPresenceActivityEvent {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    presenceDefinition: ").append(toIndentedString(presenceDefinition)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    currentDisplaySourceId: ").append(toIndentedString(currentDisplaySourceId)).append("\n");
    sb.append("    previousDisplaySourceId: ").append(toIndentedString(previousDisplaySourceId)).append("\n");
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

