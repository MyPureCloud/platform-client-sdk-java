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
 * TransferToExternalContactRequest
 */

public class TransferToExternalContactRequest  implements Serializable {
  

  private static class TransferTypeEnumDeserializer extends StdDeserializer<TransferTypeEnum> {
    public TransferTypeEnumDeserializer() {
      super(TransferTypeEnumDeserializer.class);
    }

    @Override
    public TransferTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TransferTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended.
   */
 @JsonDeserialize(using = TransferTypeEnumDeserializer.class)
  public enum TransferTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTENDED("Attended"),
    UNATTENDED("Unattended");

    private String value;

    TransferTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TransferTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TransferTypeEnum value : TransferTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TransferTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TransferTypeEnum transferType = null;
  private Boolean keepInternalMessageAlive = null;
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

  public TransferToExternalContactRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended.
   **/
  public TransferToExternalContactRequest transferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended.")
  @JsonProperty("transferType")
  public TransferTypeEnum getTransferType() {
    return transferType;
  }
  public void setTransferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
  }


  /**
   * If true, the digital internal message will NOT be terminated.
   **/
  public TransferToExternalContactRequest keepInternalMessageAlive(Boolean keepInternalMessageAlive) {
    this.keepInternalMessageAlive = keepInternalMessageAlive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the digital internal message will NOT be terminated.")
  @JsonProperty("keepInternalMessageAlive")
  public Boolean getKeepInternalMessageAlive() {
    return keepInternalMessageAlive;
  }
  public void setKeepInternalMessageAlive(Boolean keepInternalMessageAlive) {
    this.keepInternalMessageAlive = keepInternalMessageAlive;
  }


  /**
   * The external contact id.
   **/
  public TransferToExternalContactRequest contactId(String contactId) {
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
  public TransferToExternalContactRequest phoneType(PhoneTypeEnum phoneType) {
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
    TransferToExternalContactRequest transferToExternalContactRequest = (TransferToExternalContactRequest) o;

    return Objects.equals(this.transferType, transferToExternalContactRequest.transferType) &&
            Objects.equals(this.keepInternalMessageAlive, transferToExternalContactRequest.keepInternalMessageAlive) &&
            Objects.equals(this.contactId, transferToExternalContactRequest.contactId) &&
            Objects.equals(this.phoneType, transferToExternalContactRequest.phoneType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferType, keepInternalMessageAlive, contactId, phoneType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferToExternalContactRequest {\n");
    
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    keepInternalMessageAlive: ").append(toIndentedString(keepInternalMessageAlive)).append("\n");
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

