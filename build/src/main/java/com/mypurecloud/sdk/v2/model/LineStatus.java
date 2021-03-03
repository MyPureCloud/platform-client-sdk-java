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
 * LineStatus
 */

public class LineStatus  implements Serializable {
  
  private String id = null;
  private Boolean reachable = null;
  private String addressOfRecord = null;
  private List<String> contactAddresses = new ArrayList<String>();
  private Date reachableStateTime = null;

  
  /**
   * The id of this line
   **/
  public LineStatus id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of this line")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Indicates whether the edge can reach the line.
   **/
  public LineStatus reachable(Boolean reachable) {
    this.reachable = reachable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the edge can reach the line.")
  @JsonProperty("reachable")
  public Boolean getReachable() {
    return reachable;
  }
  public void setReachable(Boolean reachable) {
    this.reachable = reachable;
  }

  
  /**
   * The line's address of record.
   **/
  public LineStatus addressOfRecord(String addressOfRecord) {
    this.addressOfRecord = addressOfRecord;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The line's address of record.")
  @JsonProperty("addressOfRecord")
  public String getAddressOfRecord() {
    return addressOfRecord;
  }
  public void setAddressOfRecord(String addressOfRecord) {
    this.addressOfRecord = addressOfRecord;
  }

  
  /**
   * The addresses used to contact the line.
   **/
  public LineStatus contactAddresses(List<String> contactAddresses) {
    this.contactAddresses = contactAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The addresses used to contact the line.")
  @JsonProperty("contactAddresses")
  public List<String> getContactAddresses() {
    return contactAddresses;
  }
  public void setContactAddresses(List<String> contactAddresses) {
    this.contactAddresses = contactAddresses;
  }

  
  /**
   * The time the line entered its current reachable state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public LineStatus reachableStateTime(Date reachableStateTime) {
    this.reachableStateTime = reachableStateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the line entered its current reachable state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    LineStatus lineStatus = (LineStatus) o;
    return Objects.equals(this.id, lineStatus.id) &&
        Objects.equals(this.reachable, lineStatus.reachable) &&
        Objects.equals(this.addressOfRecord, lineStatus.addressOfRecord) &&
        Objects.equals(this.contactAddresses, lineStatus.contactAddresses) &&
        Objects.equals(this.reachableStateTime, lineStatus.reachableStateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reachable, addressOfRecord, contactAddresses, reachableStateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineStatus {\n");
    
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

