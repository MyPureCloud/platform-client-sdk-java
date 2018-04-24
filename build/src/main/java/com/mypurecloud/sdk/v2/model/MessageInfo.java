package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * MessageInfo
 */

public class MessageInfo  implements Serializable {
  
  private String localizableMessageCode = null;
  private String message = null;
  private String messageWithParams = null;
  private Map<String, String> messageParams = null;

  
  /**
   **/
  public MessageInfo localizableMessageCode(String localizableMessageCode) {
    this.localizableMessageCode = localizableMessageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("localizableMessageCode")
  public String getLocalizableMessageCode() {
    return localizableMessageCode;
  }
  public void setLocalizableMessageCode(String localizableMessageCode) {
    this.localizableMessageCode = localizableMessageCode;
  }

  
  /**
   **/
  public MessageInfo message(String message) {
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
  public MessageInfo messageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageWithParams")
  public String getMessageWithParams() {
    return messageWithParams;
  }
  public void setMessageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
  }

  
  /**
   **/
  public MessageInfo messageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageParams")
  public Map<String, String> getMessageParams() {
    return messageParams;
  }
  public void setMessageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageInfo messageInfo = (MessageInfo) o;
    return Objects.equals(this.localizableMessageCode, messageInfo.localizableMessageCode) &&
        Objects.equals(this.message, messageInfo.message) &&
        Objects.equals(this.messageWithParams, messageInfo.messageWithParams) &&
        Objects.equals(this.messageParams, messageInfo.messageParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localizableMessageCode, message, messageWithParams, messageParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageInfo {\n");
    
    sb.append("    localizableMessageCode: ").append(toIndentedString(localizableMessageCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
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

