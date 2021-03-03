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
import com.mypurecloud.sdk.v2.model.LocationDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Geolocation
 */

public class Geolocation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String type = null;
  private Boolean primary = null;
  private Double latitude = null;
  private Double longitude = null;
  private String country = null;
  private String region = null;
  private String city = null;
  private List<LocationDefinition> locations = new ArrayList<LocationDefinition>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Geolocation name(String name) {
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
   * A string used to describe the type of client the geolocation is being updated from e.g. ios, android, web, etc.
   **/
  public Geolocation type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A string used to describe the type of client the geolocation is being updated from e.g. ios, android, web, etc.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * A boolean used to tell whether or not to set this geolocation client as the primary on a PATCH
   **/
  public Geolocation primary(Boolean primary) {
    this.primary = primary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A boolean used to tell whether or not to set this geolocation client as the primary on a PATCH")
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  
  /**
   **/
  public Geolocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  public Geolocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  
  /**
   **/
  public Geolocation country(String country) {
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
  public Geolocation region(String region) {
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
  public Geolocation city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  public Geolocation locations(List<LocationDefinition> locations) {
    this.locations = locations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("locations")
  public List<LocationDefinition> getLocations() {
    return locations;
  }
  public void setLocations(List<LocationDefinition> locations) {
    this.locations = locations;
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
    Geolocation geolocation = (Geolocation) o;
    return Objects.equals(this.id, geolocation.id) &&
        Objects.equals(this.name, geolocation.name) &&
        Objects.equals(this.type, geolocation.type) &&
        Objects.equals(this.primary, geolocation.primary) &&
        Objects.equals(this.latitude, geolocation.latitude) &&
        Objects.equals(this.longitude, geolocation.longitude) &&
        Objects.equals(this.country, geolocation.country) &&
        Objects.equals(this.region, geolocation.region) &&
        Objects.equals(this.city, geolocation.city) &&
        Objects.equals(this.locations, geolocation.locations) &&
        Objects.equals(this.selfUri, geolocation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, primary, latitude, longitude, country, region, city, locations, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geolocation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

