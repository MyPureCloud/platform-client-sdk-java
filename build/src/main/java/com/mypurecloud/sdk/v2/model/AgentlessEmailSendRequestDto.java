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
import com.mypurecloud.sdk.v2.model.EmailAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentlessEmailSendRequestDto
 */

public class AgentlessEmailSendRequestDto  implements Serializable {
  

  private static class SenderTypeEnumDeserializer extends StdDeserializer<SenderTypeEnum> {
    public SenderTypeEnumDeserializer() {
      super(SenderTypeEnumDeserializer.class);
    }

    @Override
    public SenderTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SenderTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The direction of the message.
   */
 @JsonDeserialize(using = SenderTypeEnumDeserializer.class)
  public enum SenderTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OUTBOUND("Outbound"),
    INBOUND("Inbound"),
    INTEGRATION("Integration");

    private String value;

    SenderTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SenderTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SenderTypeEnum value : SenderTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SenderTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SenderTypeEnum senderType = null;
  private String conversationId = null;
  private EmailAddress fromAddress = null;
  private List<EmailAddress> toAddresses = new ArrayList<EmailAddress>();
  private EmailAddress replyToAddress = null;
  private String subject = null;
  private String textBody = null;
  private String htmlBody = null;

  
  /**
   * The direction of the message.
   **/
  public AgentlessEmailSendRequestDto senderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The direction of the message.")
  @JsonProperty("senderType")
  public SenderTypeEnum getSenderType() {
    return senderType;
  }
  public void setSenderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
  }


  /**
   * The identifier of the conversation.
   **/
  public AgentlessEmailSendRequestDto conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the conversation.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The sender of the message.
   **/
  public AgentlessEmailSendRequestDto fromAddress(EmailAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sender of the message.")
  @JsonProperty("fromAddress")
  public EmailAddress getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(EmailAddress fromAddress) {
    this.fromAddress = fromAddress;
  }


  /**
   * The recipient(s) of the message.
   **/
  public AgentlessEmailSendRequestDto toAddresses(List<EmailAddress> toAddresses) {
    this.toAddresses = toAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recipient(s) of the message.")
  @JsonProperty("toAddresses")
  public List<EmailAddress> getToAddresses() {
    return toAddresses;
  }
  public void setToAddresses(List<EmailAddress> toAddresses) {
    this.toAddresses = toAddresses;
  }


  /**
   * The address to use for reply.
   **/
  public AgentlessEmailSendRequestDto replyToAddress(EmailAddress replyToAddress) {
    this.replyToAddress = replyToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address to use for reply.")
  @JsonProperty("replyToAddress")
  public EmailAddress getReplyToAddress() {
    return replyToAddress;
  }
  public void setReplyToAddress(EmailAddress replyToAddress) {
    this.replyToAddress = replyToAddress;
  }


  /**
   * The subject of the message.
   **/
  public AgentlessEmailSendRequestDto subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subject of the message.")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * The Content of the message, in plain text.
   **/
  public AgentlessEmailSendRequestDto textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Content of the message, in plain text.")
  @JsonProperty("textBody")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }


  /**
   * The Content of the message, in HTML. Links, images and styles are allowed
   **/
  public AgentlessEmailSendRequestDto htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Content of the message, in HTML. Links, images and styles are allowed")
  @JsonProperty("htmlBody")
  public String getHtmlBody() {
    return htmlBody;
  }
  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentlessEmailSendRequestDto agentlessEmailSendRequestDto = (AgentlessEmailSendRequestDto) o;

    return Objects.equals(this.senderType, agentlessEmailSendRequestDto.senderType) &&
            Objects.equals(this.conversationId, agentlessEmailSendRequestDto.conversationId) &&
            Objects.equals(this.fromAddress, agentlessEmailSendRequestDto.fromAddress) &&
            Objects.equals(this.toAddresses, agentlessEmailSendRequestDto.toAddresses) &&
            Objects.equals(this.replyToAddress, agentlessEmailSendRequestDto.replyToAddress) &&
            Objects.equals(this.subject, agentlessEmailSendRequestDto.subject) &&
            Objects.equals(this.textBody, agentlessEmailSendRequestDto.textBody) &&
            Objects.equals(this.htmlBody, agentlessEmailSendRequestDto.htmlBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderType, conversationId, fromAddress, toAddresses, replyToAddress, subject, textBody, htmlBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentlessEmailSendRequestDto {\n");
    
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddresses: ").append(toIndentedString(toAddresses)).append("\n");
    sb.append("    replyToAddress: ").append(toIndentedString(replyToAddress)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
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

