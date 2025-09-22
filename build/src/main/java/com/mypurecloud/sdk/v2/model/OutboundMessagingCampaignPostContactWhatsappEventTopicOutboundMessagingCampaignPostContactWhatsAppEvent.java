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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent
 */

public class OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent  implements Serializable {
  
  private Long eventTime = null;
  private String conversationId = null;

  private static class OutboundCampaignTypeEnumDeserializer extends StdDeserializer<OutboundCampaignTypeEnum> {
    public OutboundCampaignTypeEnumDeserializer() {
      super(OutboundCampaignTypeEnumDeserializer.class);
    }

    @Override
    public OutboundCampaignTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OutboundCampaignTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets outboundCampaignType
   */
 @JsonDeserialize(using = OutboundCampaignTypeEnumDeserializer.class)
  public enum OutboundCampaignTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    EMAIL("EMAIL"),
    SMS("SMS"),
    WHATSAPP("WHATSAPP");

    private String value;

    OutboundCampaignTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OutboundCampaignTypeEnum fromString(String key) {
      if (key == null) return null;

      for (OutboundCampaignTypeEnum value : OutboundCampaignTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OutboundCampaignTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OutboundCampaignTypeEnum outboundCampaignType = null;
  private OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes whatsAppAttributes = null;

  private static class WrapupCodeEnumDeserializer extends StdDeserializer<WrapupCodeEnum> {
    public WrapupCodeEnumDeserializer() {
      super(WrapupCodeEnumDeserializer.class);
    }

    @Override
    public WrapupCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WrapupCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets wrapupCode
   */
 @JsonDeserialize(using = WrapupCodeEnumDeserializer.class)
  public enum WrapupCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    OUTBOUND_MESSAGE_SENT("OUTBOUND_MESSAGE_SENT"),
    OUTBOUND_MESSAGE_FAILED("OUTBOUND_MESSAGE_FAILED"),
    OUTBOUND_MESSAGE_THROTTLED("OUTBOUND_MESSAGE_THROTTLED"),
    OUTBOUND_MESSAGE_AMBIGUOUS("OUTBOUND_MESSAGE_AMBIGUOUS");

    private String value;

    WrapupCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WrapupCodeEnum fromString(String key) {
      if (key == null) return null;

      for (WrapupCodeEnum value : WrapupCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WrapupCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WrapupCodeEnum wrapupCode = null;
  private String outboundCampaignId = null;
  private String divisionId = null;
  private String contentTemplateId = null;
  private String outboundContactListId = null;
  private String outboundContactId = null;
  private Boolean isCampaignAlwaysRunning = null;

  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Long getEventTime() {
    return eventTime;
  }
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent outboundCampaignType(OutboundCampaignTypeEnum outboundCampaignType) {
    this.outboundCampaignType = outboundCampaignType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundCampaignType")
  public OutboundCampaignTypeEnum getOutboundCampaignType() {
    return outboundCampaignType;
  }
  public void setOutboundCampaignType(OutboundCampaignTypeEnum outboundCampaignType) {
    this.outboundCampaignType = outboundCampaignType;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent whatsAppAttributes(OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes whatsAppAttributes) {
    this.whatsAppAttributes = whatsAppAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("whatsAppAttributes")
  public OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes getWhatsAppAttributes() {
    return whatsAppAttributes;
  }
  public void setWhatsAppAttributes(OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes whatsAppAttributes) {
    this.whatsAppAttributes = whatsAppAttributes;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent wrapupCode(WrapupCodeEnum wrapupCode) {
    this.wrapupCode = wrapupCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupCode")
  public WrapupCodeEnum getWrapupCode() {
    return wrapupCode;
  }
  public void setWrapupCode(WrapupCodeEnum wrapupCode) {
    this.wrapupCode = wrapupCode;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent outboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundCampaignId")
  public String getOutboundCampaignId() {
    return outboundCampaignId;
  }
  public void setOutboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent contentTemplateId(String contentTemplateId) {
    this.contentTemplateId = contentTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentTemplateId")
  public String getContentTemplateId() {
    return contentTemplateId;
  }
  public void setContentTemplateId(String contentTemplateId) {
    this.contentTemplateId = contentTemplateId;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent outboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundContactListId")
  public String getOutboundContactListId() {
    return outboundContactListId;
  }
  public void setOutboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent outboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundContactId")
  public String getOutboundContactId() {
    return outboundContactId;
  }
  public void setOutboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent isCampaignAlwaysRunning(Boolean isCampaignAlwaysRunning) {
    this.isCampaignAlwaysRunning = isCampaignAlwaysRunning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isCampaignAlwaysRunning")
  public Boolean getIsCampaignAlwaysRunning() {
    return isCampaignAlwaysRunning;
  }
  public void setIsCampaignAlwaysRunning(Boolean isCampaignAlwaysRunning) {
    this.isCampaignAlwaysRunning = isCampaignAlwaysRunning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent = (OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent) o;

    return Objects.equals(this.eventTime, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.eventTime) &&
            Objects.equals(this.conversationId, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.conversationId) &&
            Objects.equals(this.outboundCampaignType, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.outboundCampaignType) &&
            Objects.equals(this.whatsAppAttributes, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.whatsAppAttributes) &&
            Objects.equals(this.wrapupCode, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.wrapupCode) &&
            Objects.equals(this.outboundCampaignId, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.outboundCampaignId) &&
            Objects.equals(this.divisionId, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.divisionId) &&
            Objects.equals(this.contentTemplateId, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.contentTemplateId) &&
            Objects.equals(this.outboundContactListId, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.outboundContactListId) &&
            Objects.equals(this.outboundContactId, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.outboundContactId) &&
            Objects.equals(this.isCampaignAlwaysRunning, outboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent.isCampaignAlwaysRunning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, outboundCampaignType, whatsAppAttributes, wrapupCode, outboundCampaignId, divisionId, contentTemplateId, outboundContactListId, outboundContactId, isCampaignAlwaysRunning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingCampaignPostContactWhatsappEventTopicOutboundMessagingCampaignPostContactWhatsAppEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    outboundCampaignType: ").append(toIndentedString(outboundCampaignType)).append("\n");
    sb.append("    whatsAppAttributes: ").append(toIndentedString(whatsAppAttributes)).append("\n");
    sb.append("    wrapupCode: ").append(toIndentedString(wrapupCode)).append("\n");
    sb.append("    outboundCampaignId: ").append(toIndentedString(outboundCampaignId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    contentTemplateId: ").append(toIndentedString(contentTemplateId)).append("\n");
    sb.append("    outboundContactListId: ").append(toIndentedString(outboundContactListId)).append("\n");
    sb.append("    outboundContactId: ").append(toIndentedString(outboundContactId)).append("\n");
    sb.append("    isCampaignAlwaysRunning: ").append(toIndentedString(isCampaignAlwaysRunning)).append("\n");
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

