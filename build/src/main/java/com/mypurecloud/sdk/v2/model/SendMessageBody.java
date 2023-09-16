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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SendMessageBody
 */

public class SendMessageBody  implements Serializable {
  
  private String message = null;
  private List<String> mentions = new ArrayList<String>();
  private String threadId = null;

  
  /**
   * The body of the message
   **/
  public SendMessageBody message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The body of the message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * user ids to be notified
   **/
  public SendMessageBody mentions(List<String> mentions) {
    this.mentions = mentions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "user ids to be notified")
  @JsonProperty("mentions")
  public List<String> getMentions() {
    return mentions;
  }
  public void setMentions(List<String> mentions) {
    this.mentions = mentions;
  }


  /**
   * The thread id of the message
   **/
  public SendMessageBody threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The thread id of the message")
  @JsonProperty("threadId")
  public String getThreadId() {
    return threadId;
  }
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMessageBody sendMessageBody = (SendMessageBody) o;

    return Objects.equals(this.message, sendMessageBody.message) &&
            Objects.equals(this.mentions, sendMessageBody.mentions) &&
            Objects.equals(this.threadId, sendMessageBody.threadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, mentions, threadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageBody {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
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

