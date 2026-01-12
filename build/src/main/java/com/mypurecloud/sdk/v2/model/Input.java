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
 * Input component configuration
 */
@ApiModel(description = "Input component configuration")

public class Input  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String subtitle = null;
  private String placeholderText = null;
  private Boolean isMultipleLine = null;
  private Boolean isRequired = null;

  private static class KeyboardTypeEnumDeserializer extends StdDeserializer<KeyboardTypeEnum> {
    public KeyboardTypeEnumDeserializer() {
      super(KeyboardTypeEnumDeserializer.class);
    }

    @Override
    public KeyboardTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KeyboardTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of keyboard to be shown
   */
 @JsonDeserialize(using = KeyboardTypeEnumDeserializer.class)
  public enum KeyboardTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DEFAULT("Default"),
    NUMBERPUNCTUATION("NumberPunctuation"),
    NUMBER("Number"),
    PHONE("Phone"),
    EMAIL("Email"),
    DECIMAL("Decimal"),
    WEBSEARCH("Websearch"),
    URL("URL");

    private String value;

    KeyboardTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KeyboardTypeEnum fromString(String key) {
      if (key == null) return null;

      for (KeyboardTypeEnum value : KeyboardTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KeyboardTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KeyboardTypeEnum keyboardType = null;

  private static class AutoCompleteTypeEnumDeserializer extends StdDeserializer<AutoCompleteTypeEnum> {
    public AutoCompleteTypeEnumDeserializer() {
      super(AutoCompleteTypeEnumDeserializer.class);
    }

    @Override
    public AutoCompleteTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AutoCompleteTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * A string value representing the keyboard and system information about the expected semantic meaning for the content that users enter
   */
 @JsonDeserialize(using = AutoCompleteTypeEnumDeserializer.class)
  public enum AutoCompleteTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PREFIX("Prefix"),
    NAME("Name"),
    GIVENNAME("GivenName"),
    MIDDLENAME("MiddleName"),
    FAMILYNAME("FamilyName"),
    SUFFIX("Suffix"),
    NICKNAME("Nickname"),
    TITLE("Title"),
    ORGANIZATION("Organization"),
    LOCATION("Location"),
    STREETADDRESS("StreetAddress"),
    ADDRESSLINE1("Addressline1"),
    ADDRESSLINE2("Addressline2"),
    CITY("City"),
    STATE("State"),
    COUNTRY("Country"),
    POSTALCODE("PostalCode"),
    USERNAME("Username"),
    ONETIMECODE("OneTimeCode"),
    EMAIL("Email"),
    PHONE("Phone"),
    PAYMENTCARDNUMBER("PaymentCardNumber"),
    PAYMENTCARDEXPIRATION("PaymentCardExpiration"),
    PAYMENTCARDEXPIRATIONMONTH("PaymentCardExpirationMonth"),
    PAYMENTCARDEXPIRATIONYEAR("PaymentCardExpirationYear"),
    PAYMENTCARDSECURITYCODE("PaymentCardSecurityCode"),
    PAYMENTCARDTYPE("PaymentCardType"),
    PAYMENTCARDNAME("PaymentCardName"),
    PAYMENTCARDGIVENNAME("PaymentCardGivenName"),
    PAYMENTCARDMIDDLENAME("PaymentCardMiddleName"),
    PAYMENTCARDFAMILYNAME("PaymentCardFamilyName"),
    BIRTHDATE("Birthdate"),
    BIRTHDATEDAY("BirthdateDay"),
    BIRTHDATEMONTH("BirthdateMonth"),
    BIRTHDATEYEAR("BirthdateYear"),
    DATETIME("DateTime"),
    FLIGHTNUMBER("FlightNumber"),
    URL("Url");

    private String value;

    AutoCompleteTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AutoCompleteTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AutoCompleteTypeEnum value : AutoCompleteTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AutoCompleteTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AutoCompleteTypeEnum autoCompleteType = null;

  public Input() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique identifier for the input field
   **/
  public Input id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the input field")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Title of the input field
   **/
  public Input title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title of the input field")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Subtitle of the input field
   **/
  public Input subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subtitle of the input field")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * Placeholder text for the input
   **/
  public Input placeholderText(String placeholderText) {
    this.placeholderText = placeholderText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Placeholder text for the input")
  @JsonProperty("placeholderText")
  public String getPlaceholderText() {
    return placeholderText;
  }
  public void setPlaceholderText(String placeholderText) {
    this.placeholderText = placeholderText;
  }


  /**
   * Whether the input supports multiple lines
   **/
  public Input isMultipleLine(Boolean isMultipleLine) {
    this.isMultipleLine = isMultipleLine;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the input supports multiple lines")
  @JsonProperty("isMultipleLine")
  public Boolean getIsMultipleLine() {
    return isMultipleLine;
  }
  public void setIsMultipleLine(Boolean isMultipleLine) {
    this.isMultipleLine = isMultipleLine;
  }


  /**
   * Whether the input is required
   **/
  public Input isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the input is required")
  @JsonProperty("isRequired")
  public Boolean getIsRequired() {
    return isRequired;
  }
  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  /**
   * Type of keyboard to be shown
   **/
  public Input keyboardType(KeyboardTypeEnum keyboardType) {
    this.keyboardType = keyboardType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of keyboard to be shown")
  @JsonProperty("keyboardType")
  public KeyboardTypeEnum getKeyboardType() {
    return keyboardType;
  }
  public void setKeyboardType(KeyboardTypeEnum keyboardType) {
    this.keyboardType = keyboardType;
  }


  /**
   * A string value representing the keyboard and system information about the expected semantic meaning for the content that users enter
   **/
  public Input autoCompleteType(AutoCompleteTypeEnum autoCompleteType) {
    this.autoCompleteType = autoCompleteType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A string value representing the keyboard and system information about the expected semantic meaning for the content that users enter")
  @JsonProperty("autoCompleteType")
  public AutoCompleteTypeEnum getAutoCompleteType() {
    return autoCompleteType;
  }
  public void setAutoCompleteType(AutoCompleteTypeEnum autoCompleteType) {
    this.autoCompleteType = autoCompleteType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;

    return Objects.equals(this.id, input.id) &&
            Objects.equals(this.title, input.title) &&
            Objects.equals(this.subtitle, input.subtitle) &&
            Objects.equals(this.placeholderText, input.placeholderText) &&
            Objects.equals(this.isMultipleLine, input.isMultipleLine) &&
            Objects.equals(this.isRequired, input.isRequired) &&
            Objects.equals(this.keyboardType, input.keyboardType) &&
            Objects.equals(this.autoCompleteType, input.autoCompleteType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, subtitle, placeholderText, isMultipleLine, isRequired, keyboardType, autoCompleteType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    placeholderText: ").append(toIndentedString(placeholderText)).append("\n");
    sb.append("    isMultipleLine: ").append(toIndentedString(isMultipleLine)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    keyboardType: ").append(toIndentedString(keyboardType)).append("\n");
    sb.append("    autoCompleteType: ").append(toIndentedString(autoCompleteType)).append("\n");
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

