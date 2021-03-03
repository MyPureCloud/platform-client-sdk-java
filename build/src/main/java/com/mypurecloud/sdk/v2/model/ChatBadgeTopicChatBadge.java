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
import com.mypurecloud.sdk.v2.model.ChatBadgeTopicBadgeEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ChatBadgeTopicChatBadge
 */

public class ChatBadgeTopicChatBadge  implements Serializable {
  
  private ChatBadgeTopicBadgeEntity entity = null;
  private Integer unreadCount = null;
  private Date lastUnreadNotificationDate = null;

  
  /**
   **/
  public ChatBadgeTopicChatBadge entity(ChatBadgeTopicBadgeEntity entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public ChatBadgeTopicBadgeEntity getEntity() {
    return entity;
  }
  public void setEntity(ChatBadgeTopicBadgeEntity entity) {
    this.entity = entity;
  }

  
  /**
   **/
  public ChatBadgeTopicChatBadge unreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unreadCount")
  public Integer getUnreadCount() {
    return unreadCount;
  }
  public void setUnreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
  }

  
  /**
   **/
  public ChatBadgeTopicChatBadge lastUnreadNotificationDate(Date lastUnreadNotificationDate) {
    this.lastUnreadNotificationDate = lastUnreadNotificationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastUnreadNotificationDate")
  public Date getLastUnreadNotificationDate() {
    return lastUnreadNotificationDate;
  }
  public void setLastUnreadNotificationDate(Date lastUnreadNotificationDate) {
    this.lastUnreadNotificationDate = lastUnreadNotificationDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatBadgeTopicChatBadge chatBadgeTopicChatBadge = (ChatBadgeTopicChatBadge) o;
    return Objects.equals(this.entity, chatBadgeTopicChatBadge.entity) &&
        Objects.equals(this.unreadCount, chatBadgeTopicChatBadge.unreadCount) &&
        Objects.equals(this.lastUnreadNotificationDate, chatBadgeTopicChatBadge.lastUnreadNotificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, unreadCount, lastUnreadNotificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatBadgeTopicChatBadge {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
    sb.append("    lastUnreadNotificationDate: ").append(toIndentedString(lastUnreadNotificationDate)).append("\n");
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

