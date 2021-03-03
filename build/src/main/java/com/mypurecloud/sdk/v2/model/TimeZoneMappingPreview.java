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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * TimeZoneMappingPreview
 */

public class TimeZoneMappingPreview  implements Serializable {
  
  private DomainEntityRef contactList = null;
  private Map<String, Long> contactsPerTimeZone = null;
  private Map<String, Long> contactsMappedUsingZipCode = null;
  private Long contactsMappedToASingleZone = null;
  private Long contactsMappedToASingleZoneUsingZipCode = null;
  private Long contactsMappedToMultipleZones = null;
  private Long contactsMappedToMultipleZonesUsingZipCode = null;
  private Long contactsInDefaultWindow = null;
  private Long contactListSize = null;

  
  /**
   * The associated ContactList
   **/
  public TimeZoneMappingPreview contactList(DomainEntityRef contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The associated ContactList")
  @JsonProperty("contactList")
  public DomainEntityRef getContactList() {
    return contactList;
  }
  public void setContactList(DomainEntityRef contactList) {
    this.contactList = contactList;
  }

  
  /**
   * The number of contacts per time zone that mapped to only that time zone
   **/
  public TimeZoneMappingPreview contactsPerTimeZone(Map<String, Long> contactsPerTimeZone) {
    this.contactsPerTimeZone = contactsPerTimeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of contacts per time zone that mapped to only that time zone")
  @JsonProperty("contactsPerTimeZone")
  public Map<String, Long> getContactsPerTimeZone() {
    return contactsPerTimeZone;
  }
  public void setContactsPerTimeZone(Map<String, Long> contactsPerTimeZone) {
    this.contactsPerTimeZone = contactsPerTimeZone;
  }

  
  /**
   * The number of contacts per time zone that mapped to only that time zone and were mapped using the zip code column
   **/
  public TimeZoneMappingPreview contactsMappedUsingZipCode(Map<String, Long> contactsMappedUsingZipCode) {
    this.contactsMappedUsingZipCode = contactsMappedUsingZipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of contacts per time zone that mapped to only that time zone and were mapped using the zip code column")
  @JsonProperty("contactsMappedUsingZipCode")
  public Map<String, Long> getContactsMappedUsingZipCode() {
    return contactsMappedUsingZipCode;
  }
  public void setContactsMappedUsingZipCode(Map<String, Long> contactsMappedUsingZipCode) {
    this.contactsMappedUsingZipCode = contactsMappedUsingZipCode;
  }

  
  /**
   * The total number of contacts that mapped to a single time zone
   **/
  public TimeZoneMappingPreview contactsMappedToASingleZone(Long contactsMappedToASingleZone) {
    this.contactsMappedToASingleZone = contactsMappedToASingleZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of contacts that mapped to a single time zone")
  @JsonProperty("contactsMappedToASingleZone")
  public Long getContactsMappedToASingleZone() {
    return contactsMappedToASingleZone;
  }
  public void setContactsMappedToASingleZone(Long contactsMappedToASingleZone) {
    this.contactsMappedToASingleZone = contactsMappedToASingleZone;
  }

  
  /**
   * The total number of contacts that mapped to a single time zone and were mapped using the zip code column
   **/
  public TimeZoneMappingPreview contactsMappedToASingleZoneUsingZipCode(Long contactsMappedToASingleZoneUsingZipCode) {
    this.contactsMappedToASingleZoneUsingZipCode = contactsMappedToASingleZoneUsingZipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of contacts that mapped to a single time zone and were mapped using the zip code column")
  @JsonProperty("contactsMappedToASingleZoneUsingZipCode")
  public Long getContactsMappedToASingleZoneUsingZipCode() {
    return contactsMappedToASingleZoneUsingZipCode;
  }
  public void setContactsMappedToASingleZoneUsingZipCode(Long contactsMappedToASingleZoneUsingZipCode) {
    this.contactsMappedToASingleZoneUsingZipCode = contactsMappedToASingleZoneUsingZipCode;
  }

  
  /**
   * The total number of contacts that mapped to multiple time zones
   **/
  public TimeZoneMappingPreview contactsMappedToMultipleZones(Long contactsMappedToMultipleZones) {
    this.contactsMappedToMultipleZones = contactsMappedToMultipleZones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of contacts that mapped to multiple time zones")
  @JsonProperty("contactsMappedToMultipleZones")
  public Long getContactsMappedToMultipleZones() {
    return contactsMappedToMultipleZones;
  }
  public void setContactsMappedToMultipleZones(Long contactsMappedToMultipleZones) {
    this.contactsMappedToMultipleZones = contactsMappedToMultipleZones;
  }

  
  /**
   * The total number of contacts that mapped to multiple time zones and were mapped using the zip code column
   **/
  public TimeZoneMappingPreview contactsMappedToMultipleZonesUsingZipCode(Long contactsMappedToMultipleZonesUsingZipCode) {
    this.contactsMappedToMultipleZonesUsingZipCode = contactsMappedToMultipleZonesUsingZipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of contacts that mapped to multiple time zones and were mapped using the zip code column")
  @JsonProperty("contactsMappedToMultipleZonesUsingZipCode")
  public Long getContactsMappedToMultipleZonesUsingZipCode() {
    return contactsMappedToMultipleZonesUsingZipCode;
  }
  public void setContactsMappedToMultipleZonesUsingZipCode(Long contactsMappedToMultipleZonesUsingZipCode) {
    this.contactsMappedToMultipleZonesUsingZipCode = contactsMappedToMultipleZonesUsingZipCode;
  }

  
  /**
   * The total number of contacts that will be dialed during the default window
   **/
  public TimeZoneMappingPreview contactsInDefaultWindow(Long contactsInDefaultWindow) {
    this.contactsInDefaultWindow = contactsInDefaultWindow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of contacts that will be dialed during the default window")
  @JsonProperty("contactsInDefaultWindow")
  public Long getContactsInDefaultWindow() {
    return contactsInDefaultWindow;
  }
  public void setContactsInDefaultWindow(Long contactsInDefaultWindow) {
    this.contactsInDefaultWindow = contactsInDefaultWindow;
  }

  
  /**
   * The total number of contacts in the contact list
   **/
  public TimeZoneMappingPreview contactListSize(Long contactListSize) {
    this.contactListSize = contactListSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of contacts in the contact list")
  @JsonProperty("contactListSize")
  public Long getContactListSize() {
    return contactListSize;
  }
  public void setContactListSize(Long contactListSize) {
    this.contactListSize = contactListSize;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeZoneMappingPreview timeZoneMappingPreview = (TimeZoneMappingPreview) o;
    return Objects.equals(this.contactList, timeZoneMappingPreview.contactList) &&
        Objects.equals(this.contactsPerTimeZone, timeZoneMappingPreview.contactsPerTimeZone) &&
        Objects.equals(this.contactsMappedUsingZipCode, timeZoneMappingPreview.contactsMappedUsingZipCode) &&
        Objects.equals(this.contactsMappedToASingleZone, timeZoneMappingPreview.contactsMappedToASingleZone) &&
        Objects.equals(this.contactsMappedToASingleZoneUsingZipCode, timeZoneMappingPreview.contactsMappedToASingleZoneUsingZipCode) &&
        Objects.equals(this.contactsMappedToMultipleZones, timeZoneMappingPreview.contactsMappedToMultipleZones) &&
        Objects.equals(this.contactsMappedToMultipleZonesUsingZipCode, timeZoneMappingPreview.contactsMappedToMultipleZonesUsingZipCode) &&
        Objects.equals(this.contactsInDefaultWindow, timeZoneMappingPreview.contactsInDefaultWindow) &&
        Objects.equals(this.contactListSize, timeZoneMappingPreview.contactListSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactList, contactsPerTimeZone, contactsMappedUsingZipCode, contactsMappedToASingleZone, contactsMappedToASingleZoneUsingZipCode, contactsMappedToMultipleZones, contactsMappedToMultipleZonesUsingZipCode, contactsInDefaultWindow, contactListSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZoneMappingPreview {\n");
    
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    contactsPerTimeZone: ").append(toIndentedString(contactsPerTimeZone)).append("\n");
    sb.append("    contactsMappedUsingZipCode: ").append(toIndentedString(contactsMappedUsingZipCode)).append("\n");
    sb.append("    contactsMappedToASingleZone: ").append(toIndentedString(contactsMappedToASingleZone)).append("\n");
    sb.append("    contactsMappedToASingleZoneUsingZipCode: ").append(toIndentedString(contactsMappedToASingleZoneUsingZipCode)).append("\n");
    sb.append("    contactsMappedToMultipleZones: ").append(toIndentedString(contactsMappedToMultipleZones)).append("\n");
    sb.append("    contactsMappedToMultipleZonesUsingZipCode: ").append(toIndentedString(contactsMappedToMultipleZonesUsingZipCode)).append("\n");
    sb.append("    contactsInDefaultWindow: ").append(toIndentedString(contactsInDefaultWindow)).append("\n");
    sb.append("    contactListSize: ").append(toIndentedString(contactListSize)).append("\n");
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

