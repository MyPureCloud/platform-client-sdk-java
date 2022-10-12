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
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AgentlessEmailSendResponseDto
 */

public class AgentlessEmailSendResponseDto  implements Serializable {
  
  private String id = null;
  private String conversationId = null;

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
   * The identifier of the external participant of the given conversation.
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
  private EmailAddress fromAddress = null;
  private List<EmailAddress> toAddresses = new ArrayList<EmailAddress>();
  private EmailAddress replyToAddress = null;
  private String subject = null;
  private Date dateCreated = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The identifier of the conversation.
   **/
  public AgentlessEmailSendResponseDto conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the conversation.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The identifier of the external participant of the given conversation.
   **/
  public AgentlessEmailSendResponseDto senderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the external participant of the given conversation.")
  @JsonProperty("senderType")
  public SenderTypeEnum getSenderType() {
    return senderType;
  }
  public void setSenderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
  }


  /**
   * The sender of the message.
   **/
  public AgentlessEmailSendResponseDto fromAddress(EmailAddress fromAddress) {
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
  public AgentlessEmailSendResponseDto toAddresses(List<EmailAddress> toAddresses) {
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
  public AgentlessEmailSendResponseDto replyToAddress(EmailAddress replyToAddress) {
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
  public AgentlessEmailSendResponseDto subject(String subject) {
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
   * The message creation timestamp. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AgentlessEmailSendResponseDto dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The message creation timestamp. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentlessEmailSendResponseDto agentlessEmailSendResponseDto = (AgentlessEmailSendResponseDto) o;

    return Objects.equals(this.id, agentlessEmailSendResponseDto.id) &&
            Objects.equals(this.conversationId, agentlessEmailSendResponseDto.conversationId) &&
            Objects.equals(this.senderType, agentlessEmailSendResponseDto.senderType) &&
            Objects.equals(this.fromAddress, agentlessEmailSendResponseDto.fromAddress) &&
            Objects.equals(this.toAddresses, agentlessEmailSendResponseDto.toAddresses) &&
            Objects.equals(this.replyToAddress, agentlessEmailSendResponseDto.replyToAddress) &&
            Objects.equals(this.subject, agentlessEmailSendResponseDto.subject) &&
            Objects.equals(this.dateCreated, agentlessEmailSendResponseDto.dateCreated) &&
            Objects.equals(this.selfUri, agentlessEmailSendResponseDto.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversationId, senderType, fromAddress, toAddresses, replyToAddress, subject, dateCreated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentlessEmailSendResponseDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddresses: ").append(toIndentedString(toAddresses)).append("\n");
    sb.append("    replyToAddress: ").append(toIndentedString(replyToAddress)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

