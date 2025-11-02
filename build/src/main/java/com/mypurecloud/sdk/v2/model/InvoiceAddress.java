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
import java.time.LocalDate;

import java.io.Serializable;
/**
 * InvoiceAddress
 */

public class InvoiceAddress  implements Serializable {
  
  private LocalDate dateEffective = null;

  private static class AddressTypeEnumDeserializer extends StdDeserializer<AddressTypeEnum> {
    public AddressTypeEnumDeserializer() {
      super(AddressTypeEnumDeserializer.class);
    }

    @Override
    public AddressTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AddressTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of address.
   */
 @JsonDeserialize(using = AddressTypeEnumDeserializer.class)
  public enum AddressTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BILLTO("BillTo"),
    SHIPTO("ShipTo"),
    ENDUSER("EndUser"),
    SOLDTO("SoldTo");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AddressTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AddressTypeEnum value : AddressTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AddressTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AddressTypeEnum addressType = null;
  private String currencyIsoCode = null;
  private String line1 = null;
  private String line2 = null;
  private String line3 = null;
  private String cityName = null;
  private String postalCode = null;
  private String stateCode = null;
  private String countryCode = null;
  private String citySubdivision1 = null;
  private String regionSubdivision1 = null;
  private String regionSubdivision2 = null;
  private String country = null;

  public InvoiceAddress() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The date when the Address became effective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public InvoiceAddress dateEffective(LocalDate dateEffective) {
    this.dateEffective = dateEffective;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the Address became effective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEffective")
  public LocalDate getDateEffective() {
    return dateEffective;
  }
  public void setDateEffective(LocalDate dateEffective) {
    this.dateEffective = dateEffective;
  }


  /**
   * The type of address.
   **/
  public InvoiceAddress addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of address.")
  @JsonProperty("addressType")
  public AddressTypeEnum getAddressType() {
    return addressType;
  }
  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }


  /**
   * Contains the ISO code for any currency allowed by the organization.
   **/
  public InvoiceAddress currencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains the ISO code for any currency allowed by the organization.")
  @JsonProperty("currencyIsoCode")
  public String getCurrencyIsoCode() {
    return currencyIsoCode;
  }
  public void setCurrencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
  }


  /**
   * The first line of the Address.
   **/
  public InvoiceAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first line of the Address.")
  @JsonProperty("line1")
  public String getLine1() {
    return line1;
  }
  public void setLine1(String line1) {
    this.line1 = line1;
  }


  /**
   * The second line of the Address.
   **/
  public InvoiceAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The second line of the Address.")
  @JsonProperty("line2")
  public String getLine2() {
    return line2;
  }
  public void setLine2(String line2) {
    this.line2 = line2;
  }


  /**
   * The third line of the Address.
   **/
  public InvoiceAddress line3(String line3) {
    this.line3 = line3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The third line of the Address.")
  @JsonProperty("line3")
  public String getLine3() {
    return line3;
  }
  public void setLine3(String line3) {
    this.line3 = line3;
  }


  /**
   * The city name.
   **/
  public InvoiceAddress cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The city name.")
  @JsonProperty("cityName")
  public String getCityName() {
    return cityName;
  }
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  /**
   * The Postal or Zip Code.
   **/
  public InvoiceAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Postal or Zip Code.")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * The code that reflects the geographic state for the Address.
   **/
  public InvoiceAddress stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The code that reflects the geographic state for the Address.")
  @JsonProperty("stateCode")
  public String getStateCode() {
    return stateCode;
  }
  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  /**
   * The code representing the country for the Address (ISO_3166).
   **/
  public InvoiceAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The code representing the country for the Address (ISO_3166).")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * The primary subdivision within a city (e.g., district, neighborhood).
   **/
  public InvoiceAddress citySubdivision1(String citySubdivision1) {
    this.citySubdivision1 = citySubdivision1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The primary subdivision within a city (e.g., district, neighborhood).")
  @JsonProperty("citySubdivision1")
  public String getCitySubdivision1() {
    return citySubdivision1;
  }
  public void setCitySubdivision1(String citySubdivision1) {
    this.citySubdivision1 = citySubdivision1;
  }


  /**
   * The primary administrative division within a region (e.g., state, province).
   **/
  public InvoiceAddress regionSubdivision1(String regionSubdivision1) {
    this.regionSubdivision1 = regionSubdivision1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The primary administrative division within a region (e.g., state, province).")
  @JsonProperty("regionSubdivision1")
  public String getRegionSubdivision1() {
    return regionSubdivision1;
  }
  public void setRegionSubdivision1(String regionSubdivision1) {
    this.regionSubdivision1 = regionSubdivision1;
  }


  /**
   * A secondary subdivision within the primary region subdivision (e.g., county, district).
   **/
  public InvoiceAddress regionSubdivision2(String regionSubdivision2) {
    this.regionSubdivision2 = regionSubdivision2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A secondary subdivision within the primary region subdivision (e.g., county, district).")
  @JsonProperty("regionSubdivision2")
  public String getRegionSubdivision2() {
    return regionSubdivision2;
  }
  public void setRegionSubdivision2(String regionSubdivision2) {
    this.regionSubdivision2 = regionSubdivision2;
  }


  /**
   * Stores the name of the country in which the address is situated.
   **/
  public InvoiceAddress country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Stores the name of the country in which the address is situated.")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceAddress invoiceAddress = (InvoiceAddress) o;

    return Objects.equals(this.dateEffective, invoiceAddress.dateEffective) &&
            Objects.equals(this.addressType, invoiceAddress.addressType) &&
            Objects.equals(this.currencyIsoCode, invoiceAddress.currencyIsoCode) &&
            Objects.equals(this.line1, invoiceAddress.line1) &&
            Objects.equals(this.line2, invoiceAddress.line2) &&
            Objects.equals(this.line3, invoiceAddress.line3) &&
            Objects.equals(this.cityName, invoiceAddress.cityName) &&
            Objects.equals(this.postalCode, invoiceAddress.postalCode) &&
            Objects.equals(this.stateCode, invoiceAddress.stateCode) &&
            Objects.equals(this.countryCode, invoiceAddress.countryCode) &&
            Objects.equals(this.citySubdivision1, invoiceAddress.citySubdivision1) &&
            Objects.equals(this.regionSubdivision1, invoiceAddress.regionSubdivision1) &&
            Objects.equals(this.regionSubdivision2, invoiceAddress.regionSubdivision2) &&
            Objects.equals(this.country, invoiceAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateEffective, addressType, currencyIsoCode, line1, line2, line3, cityName, postalCode, stateCode, countryCode, citySubdivision1, regionSubdivision1, regionSubdivision2, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceAddress {\n");
    
    sb.append("    dateEffective: ").append(toIndentedString(dateEffective)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    currencyIsoCode: ").append(toIndentedString(currencyIsoCode)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    citySubdivision1: ").append(toIndentedString(citySubdivision1)).append("\n");
    sb.append("    regionSubdivision1: ").append(toIndentedString(regionSubdivision1)).append("\n");
    sb.append("    regionSubdivision2: ").append(toIndentedString(regionSubdivision2)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

