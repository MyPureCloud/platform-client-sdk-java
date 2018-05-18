package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CallRecord;
import com.mypurecloud.sdk.v2.model.PhoneNumberStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
  private Map<String, Object> data = null;
  private Map<String, CallRecord> callRecords = null;
  private Boolean callable = null;
  private Map<String, PhoneNumberStatus> phoneNumberStatus = null;
  private String selfUri = null;


  public DialerContact id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
  public DialerContact data(Map<String, Object> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ordered map of the contact's columns and corresponding values.")
  @JsonProperty("data")
  public Map<String, Object> getData() {
    return data;
  }
  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  
  /**
   * A map of call records for the contact phone columns.
   **/
  public DialerContact callRecords(Map<String, CallRecord> callRecords) {
    this.callRecords = callRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of call records for the contact phone columns.")
  @JsonProperty("callRecords")
  public Map<String, CallRecord> getCallRecords() {
    return callRecords;
  }
  public void setCallRecords(Map<String, CallRecord> callRecords) {
    this.callRecords = callRecords;
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
        Objects.equals(this.callable, dialerContact.callable) &&
        Objects.equals(this.phoneNumberStatus, dialerContact.phoneNumberStatus) &&
        Objects.equals(this.selfUri, dialerContact.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contactListId, data, callRecords, callable, phoneNumberStatus, selfUri);
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
    sb.append("    callable: ").append(toIndentedString(callable)).append("\n");
    sb.append("    phoneNumberStatus: ").append(toIndentedString(phoneNumberStatus)).append("\n");
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

