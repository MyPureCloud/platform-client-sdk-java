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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * PhoneChangeTopicLineStatus
 */

public class PhoneChangeTopicLineStatus  implements Serializable {
  
  private String id = null;
  private Boolean reachable = null;
  private String addressOfRecord = null;
  private List<String> contactAddresses = new ArrayList<String>();
  private Date reachableStateTime = null;

  
  /**
   **/
  public PhoneChangeTopicLineStatus id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public PhoneChangeTopicLineStatus reachable(Boolean reachable) {
    this.reachable = reachable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reachable")
  public Boolean getReachable() {
    return reachable;
  }
  public void setReachable(Boolean reachable) {
    this.reachable = reachable;
  }

  
  /**
   **/
  public PhoneChangeTopicLineStatus addressOfRecord(String addressOfRecord) {
    this.addressOfRecord = addressOfRecord;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressOfRecord")
  public String getAddressOfRecord() {
    return addressOfRecord;
  }
  public void setAddressOfRecord(String addressOfRecord) {
    this.addressOfRecord = addressOfRecord;
  }

  
  /**
   **/
  public PhoneChangeTopicLineStatus contactAddresses(List<String> contactAddresses) {
    this.contactAddresses = contactAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactAddresses")
  public List<String> getContactAddresses() {
    return contactAddresses;
  }
  public void setContactAddresses(List<String> contactAddresses) {
    this.contactAddresses = contactAddresses;
  }

  
  /**
   **/
  public PhoneChangeTopicLineStatus reachableStateTime(Date reachableStateTime) {
    this.reachableStateTime = reachableStateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reachableStateTime")
  public Date getReachableStateTime() {
    return reachableStateTime;
  }
  public void setReachableStateTime(Date reachableStateTime) {
    this.reachableStateTime = reachableStateTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChangeTopicLineStatus phoneChangeTopicLineStatus = (PhoneChangeTopicLineStatus) o;
    return Objects.equals(this.id, phoneChangeTopicLineStatus.id) &&
        Objects.equals(this.reachable, phoneChangeTopicLineStatus.reachable) &&
        Objects.equals(this.addressOfRecord, phoneChangeTopicLineStatus.addressOfRecord) &&
        Objects.equals(this.contactAddresses, phoneChangeTopicLineStatus.contactAddresses) &&
        Objects.equals(this.reachableStateTime, phoneChangeTopicLineStatus.reachableStateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reachable, addressOfRecord, contactAddresses, reachableStateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChangeTopicLineStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reachable: ").append(toIndentedString(reachable)).append("\n");
    sb.append("    addressOfRecord: ").append(toIndentedString(addressOfRecord)).append("\n");
    sb.append("    contactAddresses: ").append(toIndentedString(contactAddresses)).append("\n");
    sb.append("    reachableStateTime: ").append(toIndentedString(reachableStateTime)).append("\n");
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

