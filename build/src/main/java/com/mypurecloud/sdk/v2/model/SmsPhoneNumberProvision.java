package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SmsPhoneNumberProvision
 */

public class SmsPhoneNumberProvision  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String phoneNumber = null;

  private static class PhoneNumberTypeEnumDeserializer extends StdDeserializer<PhoneNumberTypeEnum> {
    public PhoneNumberTypeEnumDeserializer() {
      super(PhoneNumberTypeEnumDeserializer.class);
    }

    @Override
    public PhoneNumberTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PhoneNumberTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of the phone number provisioned.
   */
 @JsonDeserialize(using = PhoneNumberTypeEnumDeserializer.class)
  public enum PhoneNumberTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOCAL("local"),
    MOBILE("mobile"),
    TOLLFREE("tollfree"),
    SHORTCODE("shortcode");

    private String value;

    PhoneNumberTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PhoneNumberTypeEnum fromString(String key) {
      if (key == null) return null;

      for (PhoneNumberTypeEnum value : PhoneNumberTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PhoneNumberTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PhoneNumberTypeEnum phoneNumberType = null;
  private String countryCode = null;
  private String addressId = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public SmsPhoneNumberProvision name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A phone number to be used for SMS communications. E.g. +13175555555 or +34234234234
   **/
  public SmsPhoneNumberProvision phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A phone number to be used for SMS communications. E.g. +13175555555 or +34234234234")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   * Type of the phone number provisioned.
   **/
  public SmsPhoneNumberProvision phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of the phone number provisioned.")
  @JsonProperty("phoneNumberType")
  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }
  public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }

  
  /**
   * The ISO 3166-1 alpha-2 country code of the country this phone number is associated with.
   **/
  public SmsPhoneNumberProvision countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ISO 3166-1 alpha-2 country code of the country this phone number is associated with.")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   * The id of an address added on your account. Due to regulatory requirements in some countries, an address may be required when provisioning a sms number. In those cases you should provide the provisioned sms address id here
   **/
  public SmsPhoneNumberProvision addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of an address added on your account. Due to regulatory requirements in some countries, an address may be required when provisioning a sms number. In those cases you should provide the provisioned sms address id here")
  @JsonProperty("addressId")
  public String getAddressId() {
    return addressId;
  }
  public void setAddressId(String addressId) {
    this.addressId = addressId;
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
    SmsPhoneNumberProvision smsPhoneNumberProvision = (SmsPhoneNumberProvision) o;
    return Objects.equals(this.id, smsPhoneNumberProvision.id) &&
        Objects.equals(this.name, smsPhoneNumberProvision.name) &&
        Objects.equals(this.phoneNumber, smsPhoneNumberProvision.phoneNumber) &&
        Objects.equals(this.phoneNumberType, smsPhoneNumberProvision.phoneNumberType) &&
        Objects.equals(this.countryCode, smsPhoneNumberProvision.countryCode) &&
        Objects.equals(this.addressId, smsPhoneNumberProvision.addressId) &&
        Objects.equals(this.selfUri, smsPhoneNumberProvision.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phoneNumber, phoneNumberType, countryCode, addressId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsPhoneNumberProvision {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
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

