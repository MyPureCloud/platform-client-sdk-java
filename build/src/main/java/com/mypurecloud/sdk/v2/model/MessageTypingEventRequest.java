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
import com.mypurecloud.sdk.v2.model.ConversationEventTyping;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * MessageTypingEventRequest
 */

public class MessageTypingEventRequest  implements Serializable {
  
  private ConversationEventTyping typing = null;
  private Date dateSent = null;

  public MessageTypingEventRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Typing event
   **/
  public MessageTypingEventRequest typing(ConversationEventTyping typing) {
    this.typing = typing;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Typing event")
  @JsonProperty("typing")
  public ConversationEventTyping getTyping() {
    return typing;
  }
  public void setTyping(ConversationEventTyping typing) {
    this.typing = typing;
  }


  /**
   * The time when the message typing event was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public MessageTypingEventRequest dateSent(Date dateSent) {
    this.dateSent = dateSent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message typing event was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateSent")
  public Date getDateSent() {
    return dateSent;
  }
  public void setDateSent(Date dateSent) {
    this.dateSent = dateSent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTypingEventRequest messageTypingEventRequest = (MessageTypingEventRequest) o;

    return Objects.equals(this.typing, messageTypingEventRequest.typing) &&
            Objects.equals(this.dateSent, messageTypingEventRequest.dateSent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typing, dateSent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTypingEventRequest {\n");
    
    sb.append("    typing: ").append(toIndentedString(typing)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
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

