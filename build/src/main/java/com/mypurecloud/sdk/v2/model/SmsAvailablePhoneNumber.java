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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SmsAvailablePhoneNumber
 */

public class SmsAvailablePhoneNumber  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String phoneNumber = null;
  private String countryCode = null;
  private String region = null;
  private String city = null;

  private static class CapabilitiesEnumDeserializer extends StdDeserializer<CapabilitiesEnum> {
    public CapabilitiesEnumDeserializer() {
      super(CapabilitiesEnumDeserializer.class);
    }

    @Override
    public CapabilitiesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CapabilitiesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets capabilities
   */
 @JsonDeserialize(using = CapabilitiesEnumDeserializer.class)
  public enum CapabilitiesEnum {
    SMS("sms"),
    MMS("mms"),
    VOICE("voice");

    private String value;

    CapabilitiesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CapabilitiesEnum fromString(String key) {
      if (key == null) return null;

      for (CapabilitiesEnum value : CapabilitiesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CapabilitiesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<CapabilitiesEnum> capabilities = new ArrayList<CapabilitiesEnum>();

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
   * The type of phone number available for provisioning.
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

  private static class AddressRequirementEnumDeserializer extends StdDeserializer<AddressRequirementEnum> {
    public AddressRequirementEnumDeserializer() {
      super(AddressRequirementEnumDeserializer.class);
    }

    @Override
    public AddressRequirementEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AddressRequirementEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The address requirement needed for provisioning this number. If there is a requirement, the address must be the residence or place of business of the individual or entity using the phone number.
   */
 @JsonDeserialize(using = AddressRequirementEnumDeserializer.class)
  public enum AddressRequirementEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("none"),
    ANY("any"),
    LOCAL("local"),
    FOREIGN("foreign");

    private String value;

    AddressRequirementEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AddressRequirementEnum fromString(String key) {
      if (key == null) return null;

      for (AddressRequirementEnum value : AddressRequirementEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AddressRequirementEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AddressRequirementEnum addressRequirement = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public SmsAvailablePhoneNumber name(String name) {
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
   * A phone number available for provisioning in E.164 format. E.g. +13175555555 or +34234234234
   **/
  public SmsAvailablePhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A phone number available for provisioning in E.164 format. E.g. +13175555555 or +34234234234")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   * The ISO 3166-1 alpha-2 country code of the country this phone number is associated with.
   **/
  public SmsAvailablePhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ISO 3166-1 alpha-2 country code of the country this phone number is associated with.")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   * The region/province/state the phone number is associated with.
   **/
  public SmsAvailablePhoneNumber region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The region/province/state the phone number is associated with.")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * The city the phone number is associated with.
   **/
  public SmsAvailablePhoneNumber city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The city the phone number is associated with.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * The capabilities of the phone number available for provisioning.
   **/
  public SmsAvailablePhoneNumber capabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The capabilities of the phone number available for provisioning.")
  @JsonProperty("capabilities")
  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }
  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }

  
  /**
   * The type of phone number available for provisioning.
   **/
  public SmsAvailablePhoneNumber phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of phone number available for provisioning.")
  @JsonProperty("phoneNumberType")
  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }
  public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }

  
  /**
   * The address requirement needed for provisioning this number. If there is a requirement, the address must be the residence or place of business of the individual or entity using the phone number.
   **/
  public SmsAvailablePhoneNumber addressRequirement(AddressRequirementEnum addressRequirement) {
    this.addressRequirement = addressRequirement;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address requirement needed for provisioning this number. If there is a requirement, the address must be the residence or place of business of the individual or entity using the phone number.")
  @JsonProperty("addressRequirement")
  public AddressRequirementEnum getAddressRequirement() {
    return addressRequirement;
  }
  public void setAddressRequirement(AddressRequirementEnum addressRequirement) {
    this.addressRequirement = addressRequirement;
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
    SmsAvailablePhoneNumber smsAvailablePhoneNumber = (SmsAvailablePhoneNumber) o;
    return Objects.equals(this.id, smsAvailablePhoneNumber.id) &&
        Objects.equals(this.name, smsAvailablePhoneNumber.name) &&
        Objects.equals(this.phoneNumber, smsAvailablePhoneNumber.phoneNumber) &&
        Objects.equals(this.countryCode, smsAvailablePhoneNumber.countryCode) &&
        Objects.equals(this.region, smsAvailablePhoneNumber.region) &&
        Objects.equals(this.city, smsAvailablePhoneNumber.city) &&
        Objects.equals(this.capabilities, smsAvailablePhoneNumber.capabilities) &&
        Objects.equals(this.phoneNumberType, smsAvailablePhoneNumber.phoneNumberType) &&
        Objects.equals(this.addressRequirement, smsAvailablePhoneNumber.addressRequirement) &&
        Objects.equals(this.selfUri, smsAvailablePhoneNumber.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phoneNumber, countryCode, region, city, capabilities, phoneNumberType, addressRequirement, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsAvailablePhoneNumber {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    addressRequirement: ").append(toIndentedString(addressRequirement)).append("\n");
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

