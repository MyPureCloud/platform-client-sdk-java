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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * JourneyWebEventsNotificationGeoLocation
 */

public class JourneyWebEventsNotificationGeoLocation  implements Serializable {
  
  private String country = null;
  private String countryName = null;
  private BigDecimal latitude = null;
  private BigDecimal longitude = null;
  private String locality = null;
  private String postalCode = null;
  private String region = null;
  private String regionName = null;
  private String timezone = null;
  private String source = null;

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("countryName")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation locality(String locality) {
    this.locality = locality;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("locality")
  public String getLocality() {
    return locality;
  }
  public void setLocality(String locality) {
    this.locality = locality;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("regionName")
  public String getRegionName() {
    return regionName;
  }
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  
  /**
   **/
  public JourneyWebEventsNotificationGeoLocation source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyWebEventsNotificationGeoLocation journeyWebEventsNotificationGeoLocation = (JourneyWebEventsNotificationGeoLocation) o;
    return Objects.equals(this.country, journeyWebEventsNotificationGeoLocation.country) &&
        Objects.equals(this.countryName, journeyWebEventsNotificationGeoLocation.countryName) &&
        Objects.equals(this.latitude, journeyWebEventsNotificationGeoLocation.latitude) &&
        Objects.equals(this.longitude, journeyWebEventsNotificationGeoLocation.longitude) &&
        Objects.equals(this.locality, journeyWebEventsNotificationGeoLocation.locality) &&
        Objects.equals(this.postalCode, journeyWebEventsNotificationGeoLocation.postalCode) &&
        Objects.equals(this.region, journeyWebEventsNotificationGeoLocation.region) &&
        Objects.equals(this.regionName, journeyWebEventsNotificationGeoLocation.regionName) &&
        Objects.equals(this.timezone, journeyWebEventsNotificationGeoLocation.timezone) &&
        Objects.equals(this.source, journeyWebEventsNotificationGeoLocation.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, countryName, latitude, longitude, locality, postalCode, region, regionName, timezone, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebEventsNotificationGeoLocation {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

