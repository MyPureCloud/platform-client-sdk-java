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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundVoiceCampaignPreContactVoiceAttributes
 */

public class OutboundVoiceCampaignPreContactVoiceAttributes  implements Serializable {
  
  private String contactPhoneNumber = null;

  private static class ContactPhoneTypeEnumDeserializer extends StdDeserializer<ContactPhoneTypeEnum> {
    public ContactPhoneTypeEnumDeserializer() {
      super(ContactPhoneTypeEnumDeserializer.class);
    }

    @Override
    public ContactPhoneTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContactPhoneTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets contactPhoneType
   */
 @JsonDeserialize(using = ContactPhoneTypeEnumDeserializer.class)
  public enum ContactPhoneTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    CELL("CELL"),
    DAYTIME("DAYTIME"),
    EVENING("EVENING"),
    HOME("HOME"),
    WORK("WORK");

    private String value;

    ContactPhoneTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContactPhoneTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ContactPhoneTypeEnum value : ContactPhoneTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContactPhoneTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContactPhoneTypeEnum contactPhoneType = null;
  private String callerIdPhoneNumber = null;
  private String callerIdName = null;
  private String agentOwnedColumnName = null;
  private String previewModeColumnName = null;
  private Boolean isDeliveredAsPreview = null;

  public OutboundVoiceCampaignPreContactVoiceAttributes() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public OutboundVoiceCampaignPreContactVoiceAttributes contactPhoneNumber(String contactPhoneNumber) {
    this.contactPhoneNumber = contactPhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactPhoneNumber")
  public String getContactPhoneNumber() {
    return contactPhoneNumber;
  }
  public void setContactPhoneNumber(String contactPhoneNumber) {
    this.contactPhoneNumber = contactPhoneNumber;
  }


  /**
   **/
  public OutboundVoiceCampaignPreContactVoiceAttributes contactPhoneType(ContactPhoneTypeEnum contactPhoneType) {
    this.contactPhoneType = contactPhoneType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactPhoneType")
  public ContactPhoneTypeEnum getContactPhoneType() {
    return contactPhoneType;
  }
  public void setContactPhoneType(ContactPhoneTypeEnum contactPhoneType) {
    this.contactPhoneType = contactPhoneType;
  }


  /**
   **/
  public OutboundVoiceCampaignPreContactVoiceAttributes callerIdPhoneNumber(String callerIdPhoneNumber) {
    this.callerIdPhoneNumber = callerIdPhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callerIdPhoneNumber")
  public String getCallerIdPhoneNumber() {
    return callerIdPhoneNumber;
  }
  public void setCallerIdPhoneNumber(String callerIdPhoneNumber) {
    this.callerIdPhoneNumber = callerIdPhoneNumber;
  }


  /**
   **/
  public OutboundVoiceCampaignPreContactVoiceAttributes callerIdName(String callerIdName) {
    this.callerIdName = callerIdName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callerIdName")
  public String getCallerIdName() {
    return callerIdName;
  }
  public void setCallerIdName(String callerIdName) {
    this.callerIdName = callerIdName;
  }


  /**
   **/
  public OutboundVoiceCampaignPreContactVoiceAttributes agentOwnedColumnName(String agentOwnedColumnName) {
    this.agentOwnedColumnName = agentOwnedColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentOwnedColumnName")
  public String getAgentOwnedColumnName() {
    return agentOwnedColumnName;
  }
  public void setAgentOwnedColumnName(String agentOwnedColumnName) {
    this.agentOwnedColumnName = agentOwnedColumnName;
  }


  /**
   **/
  public OutboundVoiceCampaignPreContactVoiceAttributes previewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previewModeColumnName")
  public String getPreviewModeColumnName() {
    return previewModeColumnName;
  }
  public void setPreviewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
  }


  /**
   **/
  public OutboundVoiceCampaignPreContactVoiceAttributes isDeliveredAsPreview(Boolean isDeliveredAsPreview) {
    this.isDeliveredAsPreview = isDeliveredAsPreview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isDeliveredAsPreview")
  public Boolean getIsDeliveredAsPreview() {
    return isDeliveredAsPreview;
  }
  public void setIsDeliveredAsPreview(Boolean isDeliveredAsPreview) {
    this.isDeliveredAsPreview = isDeliveredAsPreview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundVoiceCampaignPreContactVoiceAttributes outboundVoiceCampaignPreContactVoiceAttributes = (OutboundVoiceCampaignPreContactVoiceAttributes) o;

    return Objects.equals(this.contactPhoneNumber, outboundVoiceCampaignPreContactVoiceAttributes.contactPhoneNumber) &&
            Objects.equals(this.contactPhoneType, outboundVoiceCampaignPreContactVoiceAttributes.contactPhoneType) &&
            Objects.equals(this.callerIdPhoneNumber, outboundVoiceCampaignPreContactVoiceAttributes.callerIdPhoneNumber) &&
            Objects.equals(this.callerIdName, outboundVoiceCampaignPreContactVoiceAttributes.callerIdName) &&
            Objects.equals(this.agentOwnedColumnName, outboundVoiceCampaignPreContactVoiceAttributes.agentOwnedColumnName) &&
            Objects.equals(this.previewModeColumnName, outboundVoiceCampaignPreContactVoiceAttributes.previewModeColumnName) &&
            Objects.equals(this.isDeliveredAsPreview, outboundVoiceCampaignPreContactVoiceAttributes.isDeliveredAsPreview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactPhoneNumber, contactPhoneType, callerIdPhoneNumber, callerIdName, agentOwnedColumnName, previewModeColumnName, isDeliveredAsPreview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundVoiceCampaignPreContactVoiceAttributes {\n");
    
    sb.append("    contactPhoneNumber: ").append(toIndentedString(contactPhoneNumber)).append("\n");
    sb.append("    contactPhoneType: ").append(toIndentedString(contactPhoneType)).append("\n");
    sb.append("    callerIdPhoneNumber: ").append(toIndentedString(callerIdPhoneNumber)).append("\n");
    sb.append("    callerIdName: ").append(toIndentedString(callerIdName)).append("\n");
    sb.append("    agentOwnedColumnName: ").append(toIndentedString(agentOwnedColumnName)).append("\n");
    sb.append("    previewModeColumnName: ").append(toIndentedString(previewModeColumnName)).append("\n");
    sb.append("    isDeliveredAsPreview: ").append(toIndentedString(isDeliveredAsPreview)).append("\n");
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

