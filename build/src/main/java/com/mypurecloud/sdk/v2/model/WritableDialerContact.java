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
import com.mypurecloud.sdk.v2.model.MessageEvaluation;
import com.mypurecloud.sdk.v2.model.PhoneNumberStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WritableDialerContact
 */

public class WritableDialerContact  implements Serializable {
  
  private String id = null;
  private String contactListId = null;
  private Map<String, Object> data = null;
  private Map<String, MessageEvaluation> latestSmsEvaluations = null;
  private Boolean callable = null;
  private Map<String, PhoneNumberStatus> phoneNumberStatus = null;

  
  /**
   * The globally unique identifier for the object.
   **/
  public WritableDialerContact id(String id) {
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
   * The identifier of the contact list containing this contact.
   **/
  public WritableDialerContact contactListId(String contactListId) {
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
  public WritableDialerContact data(Map<String, Object> data) {
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

  
  @ApiModelProperty(example = "null", value = "A map of SMS records for the contact phone columns.")
  @JsonProperty("latestSmsEvaluations")
  public Map<String, MessageEvaluation> getLatestSmsEvaluations() {
    return latestSmsEvaluations;
  }

  
  /**
   * Indicates whether or not the contact can be called.
   **/
  public WritableDialerContact callable(Boolean callable) {
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
  public WritableDialerContact phoneNumberStatus(Map<String, PhoneNumberStatus> phoneNumberStatus) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableDialerContact writableDialerContact = (WritableDialerContact) o;
    return Objects.equals(this.id, writableDialerContact.id) &&
        Objects.equals(this.contactListId, writableDialerContact.contactListId) &&
        Objects.equals(this.data, writableDialerContact.data) &&
        Objects.equals(this.latestSmsEvaluations, writableDialerContact.latestSmsEvaluations) &&
        Objects.equals(this.callable, writableDialerContact.callable) &&
        Objects.equals(this.phoneNumberStatus, writableDialerContact.phoneNumberStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contactListId, data, latestSmsEvaluations, callable, phoneNumberStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableDialerContact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    latestSmsEvaluations: ").append(toIndentedString(latestSmsEvaluations)).append("\n");
    sb.append("    callable: ").append(toIndentedString(callable)).append("\n");
    sb.append("    phoneNumberStatus: ").append(toIndentedString(phoneNumberStatus)).append("\n");
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

