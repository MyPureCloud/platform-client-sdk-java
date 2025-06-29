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
 * ConsultTransferToExternalContact
 */

public class ConsultTransferToExternalContact  implements Serializable {
  

  private static class SpeakToEnumDeserializer extends StdDeserializer<SpeakToEnum> {
    public SpeakToEnumDeserializer() {
      super(SpeakToEnumDeserializer.class);
    }

    @Override
    public SpeakToEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SpeakToEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Determines to whom the initiating participant is requesting to speak. Defaults to DESTINATION
   */
 @JsonDeserialize(using = SpeakToEnumDeserializer.class)
  public enum SpeakToEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DESTINATION("DESTINATION"),
    OBJECT("OBJECT"),
    BOTH("BOTH"),
    CONFERENCE("CONFERENCE");

    private String value;

    SpeakToEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SpeakToEnum fromString(String key) {
      if (key == null) return null;

      for (SpeakToEnum value : SpeakToEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SpeakToEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SpeakToEnum speakTo = null;
  private String consultingUserId = null;
  private String contactId = null;

  private static class PhoneTypeEnumDeserializer extends StdDeserializer<PhoneTypeEnum> {
    public PhoneTypeEnumDeserializer() {
      super(PhoneTypeEnumDeserializer.class);
    }

    @Override
    public PhoneTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PhoneTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The external contact phone type.
   */
 @JsonDeserialize(using = PhoneTypeEnumDeserializer.class)
  public enum PhoneTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WORKPHONE("WorkPhone"),
    CELLPHONE("CellPhone"),
    HOMEPHONE("HomePhone"),
    OTHERPHONE("OtherPhone");

    private String value;

    PhoneTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PhoneTypeEnum fromString(String key) {
      if (key == null) return null;

      for (PhoneTypeEnum value : PhoneTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PhoneTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PhoneTypeEnum phoneType = null;

  public ConsultTransferToExternalContact() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Determines to whom the initiating participant is requesting to speak. Defaults to DESTINATION
   **/
  public ConsultTransferToExternalContact speakTo(SpeakToEnum speakTo) {
    this.speakTo = speakTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Determines to whom the initiating participant is requesting to speak. Defaults to DESTINATION")
  @JsonProperty("speakTo")
  public SpeakToEnum getSpeakTo() {
    return speakTo;
  }
  public void setSpeakTo(SpeakToEnum speakTo) {
    this.speakTo = speakTo;
  }


  /**
   * The user ID of the person who wants to talk before completing the transfer. Could be the same of the context user ID
   **/
  public ConsultTransferToExternalContact consultingUserId(String consultingUserId) {
    this.consultingUserId = consultingUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ID of the person who wants to talk before completing the transfer. Could be the same of the context user ID")
  @JsonProperty("consultingUserId")
  public String getConsultingUserId() {
    return consultingUserId;
  }
  public void setConsultingUserId(String consultingUserId) {
    this.consultingUserId = consultingUserId;
  }


  /**
   * The external contact id.
   **/
  public ConsultTransferToExternalContact contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The external contact id.")
  @JsonProperty("contactId")
  public String getContactId() {
    return contactId;
  }
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  /**
   * The external contact phone type.
   **/
  public ConsultTransferToExternalContact phoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The external contact phone type.")
  @JsonProperty("phoneType")
  public PhoneTypeEnum getPhoneType() {
    return phoneType;
  }
  public void setPhoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultTransferToExternalContact consultTransferToExternalContact = (ConsultTransferToExternalContact) o;

    return Objects.equals(this.speakTo, consultTransferToExternalContact.speakTo) &&
            Objects.equals(this.consultingUserId, consultTransferToExternalContact.consultingUserId) &&
            Objects.equals(this.contactId, consultTransferToExternalContact.contactId) &&
            Objects.equals(this.phoneType, consultTransferToExternalContact.phoneType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speakTo, consultingUserId, contactId, phoneType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultTransferToExternalContact {\n");
    
    sb.append("    speakTo: ").append(toIndentedString(speakTo)).append("\n");
    sb.append("    consultingUserId: ").append(toIndentedString(consultingUserId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
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

