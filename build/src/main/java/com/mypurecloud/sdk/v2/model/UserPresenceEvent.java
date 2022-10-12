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
import java.util.Date;

import java.io.Serializable;
/**
 * UserPresenceEvent
 */

public class UserPresenceEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String userId = null;
  private String sourceId = null;
  private String presenceDefinitionId = null;
  private String message = null;

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public UserPresenceEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique (V4 UUID) eventId for this event")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserPresenceEvent eventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventDateTime")
  public Date getEventDateTime() {
    return eventDateTime;
  }
  public void setEventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  /**
   * The User ID of the user associated with this UserPresence
   **/
  public UserPresenceEvent userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The User ID of the user associated with this UserPresence")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * The id (V4 UUID) of the presence source being updated
   **/
  public UserPresenceEvent sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) of the presence source being updated")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  /**
   * The id (UUID) of the presence definition that the user presence is associated with
   **/
  public UserPresenceEvent presenceDefinitionId(String presenceDefinitionId) {
    this.presenceDefinitionId = presenceDefinitionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id (UUID) of the presence definition that the user presence is associated with")
  @JsonProperty("presenceDefinitionId")
  public String getPresenceDefinitionId() {
    return presenceDefinitionId;
  }
  public void setPresenceDefinitionId(String presenceDefinitionId) {
    this.presenceDefinitionId = presenceDefinitionId;
  }


  /**
   * The message associated with the presence
   **/
  public UserPresenceEvent message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message associated with the presence")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPresenceEvent userPresenceEvent = (UserPresenceEvent) o;

    return Objects.equals(this.eventId, userPresenceEvent.eventId) &&
            Objects.equals(this.eventDateTime, userPresenceEvent.eventDateTime) &&
            Objects.equals(this.userId, userPresenceEvent.userId) &&
            Objects.equals(this.sourceId, userPresenceEvent.sourceId) &&
            Objects.equals(this.presenceDefinitionId, userPresenceEvent.presenceDefinitionId) &&
            Objects.equals(this.message, userPresenceEvent.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, userId, sourceId, presenceDefinitionId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPresenceEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    presenceDefinitionId: ").append(toIndentedString(presenceDefinitionId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

