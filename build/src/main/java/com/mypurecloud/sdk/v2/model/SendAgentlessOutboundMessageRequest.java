package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SendAgentlessOutboundMessageRequest
 */

public class SendAgentlessOutboundMessageRequest  implements Serializable {
  
  private String fromAddress = null;
  private String toAddress = null;

  /**
   * The recipient messaging address messenger type. Currently SMS is the only supported type.
   */
  public enum ToAddressMessengerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("sms"),
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    LINE("line"),
    WHATSAPP("whatsapp"),
    WEBMESSAGING("webmessaging");

    private String value;

    ToAddressMessengerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ToAddressMessengerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ToAddressMessengerTypeEnum value : ToAddressMessengerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ToAddressMessengerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ToAddressMessengerTypeEnum toAddressMessengerType = null;
  private String textBody = null;

  
  /**
   * The messaging address of the sender of the message. For an SMS messenger type, this must be a currently provisioned sms phone number.
   **/
  public SendAgentlessOutboundMessageRequest fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging address of the sender of the message. For an SMS messenger type, this must be a currently provisioned sms phone number.")
  @JsonProperty("fromAddress")
  public String getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   * The messaging address of the recipient of the message. For an SMS messenger type, the phone number address must be in E.164 format. E.g. +13175555555 or +34234234234.
   **/
  public SendAgentlessOutboundMessageRequest toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging address of the recipient of the message. For an SMS messenger type, the phone number address must be in E.164 format. E.g. +13175555555 or +34234234234.")
  @JsonProperty("toAddress")
  public String getToAddress() {
    return toAddress;
  }
  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  
  /**
   * The recipient messaging address messenger type. Currently SMS is the only supported type.
   **/
  public SendAgentlessOutboundMessageRequest toAddressMessengerType(ToAddressMessengerTypeEnum toAddressMessengerType) {
    this.toAddressMessengerType = toAddressMessengerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recipient messaging address messenger type. Currently SMS is the only supported type.")
  @JsonProperty("toAddressMessengerType")
  public ToAddressMessengerTypeEnum getToAddressMessengerType() {
    return toAddressMessengerType;
  }
  public void setToAddressMessengerType(ToAddressMessengerTypeEnum toAddressMessengerType) {
    this.toAddressMessengerType = toAddressMessengerType;
  }

  
  /**
   * The text of the message to send
   **/
  public SendAgentlessOutboundMessageRequest textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The text of the message to send")
  @JsonProperty("textBody")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendAgentlessOutboundMessageRequest sendAgentlessOutboundMessageRequest = (SendAgentlessOutboundMessageRequest) o;
    return Objects.equals(this.fromAddress, sendAgentlessOutboundMessageRequest.fromAddress) &&
        Objects.equals(this.toAddress, sendAgentlessOutboundMessageRequest.toAddress) &&
        Objects.equals(this.toAddressMessengerType, sendAgentlessOutboundMessageRequest.toAddressMessengerType) &&
        Objects.equals(this.textBody, sendAgentlessOutboundMessageRequest.textBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddress, toAddress, toAddressMessengerType, textBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendAgentlessOutboundMessageRequest {\n");
    
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    toAddressMessengerType: ").append(toIndentedString(toAddressMessengerType)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
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

