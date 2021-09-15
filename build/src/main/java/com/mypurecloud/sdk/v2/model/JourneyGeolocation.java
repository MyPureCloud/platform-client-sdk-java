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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyGeolocation
 */

public class JourneyGeolocation  implements Serializable {
  
  private String country = null;
  private String countryName = null;
  private Double latitude = null;
  private Double longitude = null;
  private String locality = null;
  private String postalCode = null;
  private String region = null;
  private String regionName = null;
  private String source = null;
  private String timezone = null;

  
  /**
   * Geolocation's ISO 3166-1 alpha-2 country code.
   **/
  public JourneyGeolocation country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation's ISO 3166-1 alpha-2 country code.")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * Geolocation's country name.
   **/
  public JourneyGeolocation countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation's country name.")
  @JsonProperty("countryName")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  
  /**
   * Geolocation's latitude.
   **/
  public JourneyGeolocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation's latitude.")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Geolocation's longitude.
   **/
  public JourneyGeolocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation's longitude.")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Geolocation's locality or city.
   **/
  public JourneyGeolocation locality(String locality) {
    this.locality = locality;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation's locality or city.")
  @JsonProperty("locality")
  public String getLocality() {
    return locality;
  }
  public void setLocality(String locality) {
    this.locality = locality;
  }

  
  /**
   * Geolocation's postal code or ZIP code.
   **/
  public JourneyGeolocation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation's postal code or ZIP code.")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * Geolocation's ISO-3166-2 region code.
   **/
  public JourneyGeolocation region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation's ISO-3166-2 region code.")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * Geolocation's region name.
   **/
  public JourneyGeolocation regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation's region name.")
  @JsonProperty("regionName")
  public String getRegionName() {
    return regionName;
  }
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  
  /**
   * The source that was used to determine the geolocation information.
   **/
  public JourneyGeolocation source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source that was used to determine the geolocation information.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Geolocation's timezone.
   **/
  public JourneyGeolocation timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation's timezone.")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyGeolocation journeyGeolocation = (JourneyGeolocation) o;
    return Objects.equals(this.country, journeyGeolocation.country) &&
        Objects.equals(this.countryName, journeyGeolocation.countryName) &&
        Objects.equals(this.latitude, journeyGeolocation.latitude) &&
        Objects.equals(this.longitude, journeyGeolocation.longitude) &&
        Objects.equals(this.locality, journeyGeolocation.locality) &&
        Objects.equals(this.postalCode, journeyGeolocation.postalCode) &&
        Objects.equals(this.region, journeyGeolocation.region) &&
        Objects.equals(this.regionName, journeyGeolocation.regionName) &&
        Objects.equals(this.source, journeyGeolocation.source) &&
        Objects.equals(this.timezone, journeyGeolocation.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, countryName, latitude, longitude, locality, postalCode, region, regionName, source, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyGeolocation {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

