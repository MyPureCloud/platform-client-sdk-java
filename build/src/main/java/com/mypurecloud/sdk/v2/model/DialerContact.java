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
import com.mypurecloud.sdk.v2.model.CallRecord;
import com.mypurecloud.sdk.v2.model.ConfigurationOverrides;
import com.mypurecloud.sdk.v2.model.ContactColumnTimeZone;
import com.mypurecloud.sdk.v2.model.ContactableStatus;
import com.mypurecloud.sdk.v2.model.MessageEvaluation;
import com.mypurecloud.sdk.v2.model.PhoneNumberStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerContact
 */

public class DialerContact  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String contactListId = null;
  private Map<String, String> data = null;
  private Map<String, CallRecord> callRecords = null;
  private Map<String, MessageEvaluation> latestSmsEvaluations = null;
  private Map<String, MessageEvaluation> latestEmailEvaluations = null;
  private Map<String, MessageEvaluation> latestWhatsAppEvaluations = null;
  private Boolean callable = null;
  private Map<String, PhoneNumberStatus> phoneNumberStatus = null;
  private Map<String, ContactableStatus> contactableStatus = null;
  private Map<String, ContactColumnTimeZone> contactColumnTimeZones = null;
  private ConfigurationOverrides configurationOverrides = null;
  private Date dateCreated = null;
  private String selfUri = null;

  public DialerContact() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public DialerContact name(String name) {
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
   * The identifier of the contact list containing this contact.
   **/
  public DialerContact contactListId(String contactListId) {
    this.contactListId = contactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the contact list containing this contact.")
  @JsonProperty("contactListId")
  public String getContactListId() {
    return contactListId;
  }
  public void setContactListId(String contactListId) {
    this.contactListId = contactListId;
  }


  /**
   * An ordered map of the contact's columns and corresponding values.
   **/
  public DialerContact data(Map<String, String> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "&quot;{ &#39;firstname&#39;: &#39;name&#39;, &#39;surname&#39;: &#39;name2&#39;, &#39;phone&#39;: &#39;123456789&#39;}&quot;", required = true, value = "An ordered map of the contact's columns and corresponding values.")
  @JsonProperty("data")
  public Map<String, String> getData() {
    return data;
  }
  public void setData(Map<String, String> data) {
    this.data = data;
  }


  @ApiModelProperty(example = "null", value = "A map of call records for the contact phone columns.")
  @JsonProperty("callRecords")
  public Map<String, CallRecord> getCallRecords() {
    return callRecords;
  }


  @ApiModelProperty(example = "null", value = "A map of SMS records for the contact phone columns.")
  @JsonProperty("latestSmsEvaluations")
  public Map<String, MessageEvaluation> getLatestSmsEvaluations() {
    return latestSmsEvaluations;
  }


  @ApiModelProperty(example = "null", value = "A map of email records for the contact email columns.")
  @JsonProperty("latestEmailEvaluations")
  public Map<String, MessageEvaluation> getLatestEmailEvaluations() {
    return latestEmailEvaluations;
  }


  /**
   * A map of whatsapp records for the contact whatsapp columns.
   **/
  public DialerContact latestWhatsAppEvaluations(Map<String, MessageEvaluation> latestWhatsAppEvaluations) {
    this.latestWhatsAppEvaluations = latestWhatsAppEvaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of whatsapp records for the contact whatsapp columns.")
  @JsonProperty("latestWhatsAppEvaluations")
  public Map<String, MessageEvaluation> getLatestWhatsAppEvaluations() {
    return latestWhatsAppEvaluations;
  }
  public void setLatestWhatsAppEvaluations(Map<String, MessageEvaluation> latestWhatsAppEvaluations) {
    this.latestWhatsAppEvaluations = latestWhatsAppEvaluations;
  }


  /**
   * Indicates whether or not the contact can be called.
   **/
  public DialerContact callable(Boolean callable) {
    this.callable = callable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not the contact can be called.")
  @JsonProperty("callable")
  public Boolean getCallable() {
    return callable;
  }
  public void setCallable(Boolean callable) {
    this.callable = callable;
  }


  /**
   * A map of phone number columns to PhoneNumberStatuses, which indicate if the phone number is callable or not.
   **/
  public DialerContact phoneNumberStatus(Map<String, PhoneNumberStatus> phoneNumberStatus) {
    this.phoneNumberStatus = phoneNumberStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of phone number columns to PhoneNumberStatuses, which indicate if the phone number is callable or not.")
  @JsonProperty("phoneNumberStatus")
  public Map<String, PhoneNumberStatus> getPhoneNumberStatus() {
    return phoneNumberStatus;
  }
  public void setPhoneNumberStatus(Map<String, PhoneNumberStatus> phoneNumberStatus) {
    this.phoneNumberStatus = phoneNumberStatus;
  }


  /**
   * A map of media types (Voice, SMS and Email) to ContactableStatus, which indicates if the contact can be contacted using the specified media type.
   **/
  public DialerContact contactableStatus(Map<String, ContactableStatus> contactableStatus) {
    this.contactableStatus = contactableStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of media types (Voice, SMS and Email) to ContactableStatus, which indicates if the contact can be contacted using the specified media type.")
  @JsonProperty("contactableStatus")
  public Map<String, ContactableStatus> getContactableStatus() {
    return contactableStatus;
  }
  public void setContactableStatus(Map<String, ContactableStatus> contactableStatus) {
    this.contactableStatus = contactableStatus;
  }


  @ApiModelProperty(example = "null", value = "Map containing data about the timezone the contact is mapped to. This will only be populated if the contact list has automatic timezone mapping turned on. The key is the column name. The value is the timezone it mapped to and the type of column: Phone or Zip")
  @JsonProperty("contactColumnTimeZones")
  public Map<String, ContactColumnTimeZone> getContactColumnTimeZones() {
    return contactColumnTimeZones;
  }


  @ApiModelProperty(example = "null", value = "the priority property within ConfigurationOverides indicates whether or not the contact to be placed in front of the queue or at the end of the queue")
  @JsonProperty("configurationOverrides")
  public ConfigurationOverrides getConfigurationOverrides() {
    return configurationOverrides;
  }


  @ApiModelProperty(example = "null", value = "Timestamp for when the contact was added. Contacts added prior to 2023 September 1 may be missing this value. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
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
    DialerContact dialerContact = (DialerContact) o;

    return Objects.equals(this.id, dialerContact.id) &&
            Objects.equals(this.name, dialerContact.name) &&
            Objects.equals(this.contactListId, dialerContact.contactListId) &&
            Objects.equals(this.data, dialerContact.data) &&
            Objects.equals(this.callRecords, dialerContact.callRecords) &&
            Objects.equals(this.latestSmsEvaluations, dialerContact.latestSmsEvaluations) &&
            Objects.equals(this.latestEmailEvaluations, dialerContact.latestEmailEvaluations) &&
            Objects.equals(this.latestWhatsAppEvaluations, dialerContact.latestWhatsAppEvaluations) &&
            Objects.equals(this.callable, dialerContact.callable) &&
            Objects.equals(this.phoneNumberStatus, dialerContact.phoneNumberStatus) &&
            Objects.equals(this.contactableStatus, dialerContact.contactableStatus) &&
            Objects.equals(this.contactColumnTimeZones, dialerContact.contactColumnTimeZones) &&
            Objects.equals(this.configurationOverrides, dialerContact.configurationOverrides) &&
            Objects.equals(this.dateCreated, dialerContact.dateCreated) &&
            Objects.equals(this.selfUri, dialerContact.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contactListId, data, callRecords, latestSmsEvaluations, latestEmailEvaluations, latestWhatsAppEvaluations, callable, phoneNumberStatus, contactableStatus, contactColumnTimeZones, configurationOverrides, dateCreated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerContact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    callRecords: ").append(toIndentedString(callRecords)).append("\n");
    sb.append("    latestSmsEvaluations: ").append(toIndentedString(latestSmsEvaluations)).append("\n");
    sb.append("    latestEmailEvaluations: ").append(toIndentedString(latestEmailEvaluations)).append("\n");
    sb.append("    latestWhatsAppEvaluations: ").append(toIndentedString(latestWhatsAppEvaluations)).append("\n");
    sb.append("    callable: ").append(toIndentedString(callable)).append("\n");
    sb.append("    phoneNumberStatus: ").append(toIndentedString(phoneNumberStatus)).append("\n");
    sb.append("    contactableStatus: ").append(toIndentedString(contactableStatus)).append("\n");
    sb.append("    contactColumnTimeZones: ").append(toIndentedString(contactColumnTimeZones)).append("\n");
    sb.append("    configurationOverrides: ").append(toIndentedString(configurationOverrides)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

