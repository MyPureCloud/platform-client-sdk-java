package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * MessageDetails
 */

public class MessageDetails  implements Serializable {
  
  private String messageId = null;
  private String messageURI = null;
  private Date messageTime = null;

  
  /**
   * UUID identifying the message media.
   **/
  public MessageDetails messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UUID identifying the message media.")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  
  /**
   * A URI for this message entity.
   **/
  public MessageDetails messageURI(String messageURI) {
    this.messageURI = messageURI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A URI for this message entity.")
  @JsonProperty("messageURI")
  public String getMessageURI() {
    return messageURI;
  }
  public void setMessageURI(String messageURI) {
    this.messageURI = messageURI;
  }

  
  /**
   * The time when the message was sent or received. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public MessageDetails messageTime(Date messageTime) {
    this.messageTime = messageTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message was sent or received. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("messageTime")
  public Date getMessageTime() {
    return messageTime;
  }
  public void setMessageTime(Date messageTime) {
    this.messageTime = messageTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDetails messageDetails = (MessageDetails) o;
    return Objects.equals(this.messageId, messageDetails.messageId) &&
        Objects.equals(this.messageURI, messageDetails.messageURI) &&
        Objects.equals(this.messageTime, messageDetails.messageTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, messageURI, messageTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDetails {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageURI: ").append(toIndentedString(messageURI)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
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

