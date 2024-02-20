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
import com.mypurecloud.sdk.v2.model.OutboundMessagingCampaignPreContactSmsEventTopicSMSAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent
 */

public class OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent  implements Serializable {
  
  private Date eventTime = null;

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
  private OutboundMessagingCampaignPreContactSmsEventTopicSMSAttributes smsAttributes = null;

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
    ININ_OUTBOUND_NUMBERS_INVALID("ININ_OUTBOUND_NUMBERS_INVALID"),
    ININ_OUTBOUND_CONTACT_ATTEMPT_LIMIT_SKIPPED("ININ_OUTBOUND_CONTACT_ATTEMPT_LIMIT_SKIPPED"),
    ININ_OUTBOUND_INTERNAL_ERROR_SKIPPED("ININ_OUTBOUND_INTERNAL_ERROR_SKIPPED"),
    ININ_OUTBOUND_DNC_SKIPPED("ININ_OUTBOUND_DNC_SKIPPED"),
    ININ_OUTBOUND_ZONE_BLOCKED_SKIPPED("ININ_OUTBOUND_ZONE_BLOCKED_SKIPPED"),
    OUTBOUND_MESSAGE_BLANK("OUTBOUND_MESSAGE_BLANK"),
    OUTBOUND_RULE_ERROR_SKIPPED("OUTBOUND_RULE_ERROR_SKIPPED"),
    OUTBOUND_RULE_SKIPPED("OUTBOUND_RULE_SKIPPED"),
    OUTBOUND_CONTACT_UNCONTACTABLE_SKIPPED("OUTBOUND_CONTACT_UNCONTACTABLE_SKIPPED"),
    OUTBOUND_NUMBER_UNCONTACTABLE_SKIPPED("OUTBOUND_NUMBER_UNCONTACTABLE_SKIPPED"),
    OUTBOUND_CONTACT_ADDRESS_UNCONTACTABLE_SKIPPED("OUTBOUND_CONTACT_ADDRESS_UNCONTACTABLE_SKIPPED"),
    OUTBOUND_INVALID_PHONE_NUMBER("OUTBOUND_INVALID_PHONE_NUMBER"),
    ININ_OUTBOUND_DNC_AUTHENTICATION_FAILED("ININ_OUTBOUND_DNC_AUTHENTICATION_FAILED"),
    ININ_OUTBOUND_DNC_INVALID_PHONE_NUMBER("ININ_OUTBOUND_DNC_INVALID_PHONE_NUMBER"),
    ININ_OUTBOUND_AUTOMATIC_TIMEZONE_BLOCKED("ININ_OUTBOUND_AUTOMATIC_TIMEZONE_BLOCKED"),
    ININ_OUTBOUND_NUMBER_ATTEMPT_LIMIT_SKIPPED("ININ_OUTBOUND_NUMBER_ATTEMPT_LIMIT_SKIPPED"),
    ININ_OUTBOUND_ON_DO_NOT_CALL_LIST("ININ_OUTBOUND_ON_DO_NOT_CALL_LIST"),
    ININ_OUTBOUND_NOT_CALLABLE_TIME("ININ_OUTBOUND_NOT_CALLABLE_TIME");

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
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent outboundCampaignType(OutboundCampaignTypeEnum outboundCampaignType) {
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
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent smsAttributes(OutboundMessagingCampaignPreContactSmsEventTopicSMSAttributes smsAttributes) {
    this.smsAttributes = smsAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("smsAttributes")
  public OutboundMessagingCampaignPreContactSmsEventTopicSMSAttributes getSmsAttributes() {
    return smsAttributes;
  }
  public void setSmsAttributes(OutboundMessagingCampaignPreContactSmsEventTopicSMSAttributes smsAttributes) {
    this.smsAttributes = smsAttributes;
  }


  /**
   **/
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent wrapupCode(WrapupCodeEnum wrapupCode) {
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
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent outboundCampaignId(String outboundCampaignId) {
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
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent divisionId(String divisionId) {
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
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent contentTemplateId(String contentTemplateId) {
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
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent outboundContactListId(String outboundContactListId) {
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
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent outboundContactId(String outboundContactId) {
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
  public OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent isCampaignAlwaysRunning(Boolean isCampaignAlwaysRunning) {
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
    OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent = (OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent) o;

    return Objects.equals(this.eventTime, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.eventTime) &&
            Objects.equals(this.outboundCampaignType, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.outboundCampaignType) &&
            Objects.equals(this.smsAttributes, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.smsAttributes) &&
            Objects.equals(this.wrapupCode, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.wrapupCode) &&
            Objects.equals(this.outboundCampaignId, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.outboundCampaignId) &&
            Objects.equals(this.divisionId, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.divisionId) &&
            Objects.equals(this.contentTemplateId, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.contentTemplateId) &&
            Objects.equals(this.outboundContactListId, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.outboundContactListId) &&
            Objects.equals(this.outboundContactId, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.outboundContactId) &&
            Objects.equals(this.isCampaignAlwaysRunning, outboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent.isCampaignAlwaysRunning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, outboundCampaignType, smsAttributes, wrapupCode, outboundCampaignId, divisionId, contentTemplateId, outboundContactListId, outboundContactId, isCampaignAlwaysRunning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingCampaignPreContactSmsEventTopicOutboundMessagingCampaignPreContactSMSEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    outboundCampaignType: ").append(toIndentedString(outboundCampaignType)).append("\n");
    sb.append("    smsAttributes: ").append(toIndentedString(smsAttributes)).append("\n");
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

