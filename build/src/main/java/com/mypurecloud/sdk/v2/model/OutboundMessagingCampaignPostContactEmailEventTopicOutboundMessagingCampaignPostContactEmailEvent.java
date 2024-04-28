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
import com.mypurecloud.sdk.v2.model.OutboundMessagingCampaignPostContactEmailEventTopicEmailAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent
 */

public class OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent  implements Serializable {
  
  private Integer eventTime = null;
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
    SMS("SMS");

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
  private OutboundMessagingCampaignPostContactEmailEventTopicEmailAttributes emailAttributes = null;

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
    OUTBOUND_MESSAGE_THROTTLED("OUTBOUND_MESSAGE_THROTTLED");

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

  
  /**
   **/
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent eventTime(Integer eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Integer getEventTime() {
    return eventTime;
  }
  public void setEventTime(Integer eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent conversationId(String conversationId) {
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
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent outboundCampaignType(OutboundCampaignTypeEnum outboundCampaignType) {
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
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent emailAttributes(OutboundMessagingCampaignPostContactEmailEventTopicEmailAttributes emailAttributes) {
    this.emailAttributes = emailAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailAttributes")
  public OutboundMessagingCampaignPostContactEmailEventTopicEmailAttributes getEmailAttributes() {
    return emailAttributes;
  }
  public void setEmailAttributes(OutboundMessagingCampaignPostContactEmailEventTopicEmailAttributes emailAttributes) {
    this.emailAttributes = emailAttributes;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent wrapupCode(WrapupCodeEnum wrapupCode) {
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
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent outboundCampaignId(String outboundCampaignId) {
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
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent divisionId(String divisionId) {
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
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent contentTemplateId(String contentTemplateId) {
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
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent outboundContactListId(String outboundContactListId) {
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
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent outboundContactId(String outboundContactId) {
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
  public OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent isCampaignAlwaysRunning(Boolean isCampaignAlwaysRunning) {
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
    OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent = (OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent) o;

    return Objects.equals(this.eventTime, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.eventTime) &&
            Objects.equals(this.conversationId, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.conversationId) &&
            Objects.equals(this.outboundCampaignType, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.outboundCampaignType) &&
            Objects.equals(this.emailAttributes, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.emailAttributes) &&
            Objects.equals(this.wrapupCode, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.wrapupCode) &&
            Objects.equals(this.outboundCampaignId, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.outboundCampaignId) &&
            Objects.equals(this.divisionId, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.divisionId) &&
            Objects.equals(this.contentTemplateId, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.contentTemplateId) &&
            Objects.equals(this.outboundContactListId, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.outboundContactListId) &&
            Objects.equals(this.outboundContactId, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.outboundContactId) &&
            Objects.equals(this.isCampaignAlwaysRunning, outboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent.isCampaignAlwaysRunning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, outboundCampaignType, emailAttributes, wrapupCode, outboundCampaignId, divisionId, contentTemplateId, outboundContactListId, outboundContactId, isCampaignAlwaysRunning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    outboundCampaignType: ").append(toIndentedString(outboundCampaignType)).append("\n");
    sb.append("    emailAttributes: ").append(toIndentedString(emailAttributes)).append("\n");
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

