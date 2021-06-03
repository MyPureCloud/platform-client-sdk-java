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
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsResolution
 */

public class AnalyticsResolution  implements Serializable {
  
  private Date eventTime = null;
  private String queueId = null;
  private String userId = null;
  private Long nNextContactAvoided = null;

  
  /**
   * Specifies when an event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsResolution eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies when an event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  
  /**
   * The ID of the last queue on which the conversation was handled.
   **/
  public AnalyticsResolution queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the last queue on which the conversation was handled.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * The ID of the last user who handled the conversation.
   **/
  public AnalyticsResolution userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the last user who handled the conversation.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public AnalyticsResolution nNextContactAvoided(Long nNextContactAvoided) {
    this.nNextContactAvoided = nNextContactAvoided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nNextContactAvoided")
  public Long getNNextContactAvoided() {
    return nNextContactAvoided;
  }
  public void setNNextContactAvoided(Long nNextContactAvoided) {
    this.nNextContactAvoided = nNextContactAvoided;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsResolution analyticsResolution = (AnalyticsResolution) o;
    return Objects.equals(this.eventTime, analyticsResolution.eventTime) &&
        Objects.equals(this.queueId, analyticsResolution.queueId) &&
        Objects.equals(this.userId, analyticsResolution.userId) &&
        Objects.equals(this.nNextContactAvoided, analyticsResolution.nNextContactAvoided);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, queueId, userId, nNextContactAvoided);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsResolution {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    nNextContactAvoided: ").append(toIndentedString(nNextContactAvoided)).append("\n");
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

