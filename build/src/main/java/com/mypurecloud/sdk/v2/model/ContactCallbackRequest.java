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
 * ContactCallbackRequest
 */

public class ContactCallbackRequest  implements Serializable {
  
  private String campaignId = null;
  private String contactListId = null;
  private String contactId = null;
  private String phoneColumn = null;
  private String schedule = null;

  
  /**
   * Campaign identifier
   **/
  public ContactCallbackRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Campaign identifier")
  @JsonProperty("campaignId")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  
  /**
   * Contact list identifier
   **/
  public ContactCallbackRequest contactListId(String contactListId) {
    this.contactListId = contactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contact list identifier")
  @JsonProperty("contactListId")
  public String getContactListId() {
    return contactListId;
  }
  public void setContactListId(String contactListId) {
    this.contactListId = contactListId;
  }

  
  /**
   * Contact identifier
   **/
  public ContactCallbackRequest contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contact identifier")
  @JsonProperty("contactId")
  public String getContactId() {
    return contactId;
  }
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  
  /**
   * Name of the phone column containing the number to be called
   **/
  public ContactCallbackRequest phoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the phone column containing the number to be called")
  @JsonProperty("phoneColumn")
  public String getPhoneColumn() {
    return phoneColumn;
  }
  public void setPhoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
  }

  
  /**
   * The scheduled time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ\", example = \"2016-01-02T16:59:59\"
   **/
  public ContactCallbackRequest schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The scheduled time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ\", example = \"2016-01-02T16:59:59\"")
  @JsonProperty("schedule")
  public String getSchedule() {
    return schedule;
  }
  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactCallbackRequest contactCallbackRequest = (ContactCallbackRequest) o;
    return Objects.equals(this.campaignId, contactCallbackRequest.campaignId) &&
        Objects.equals(this.contactListId, contactCallbackRequest.contactListId) &&
        Objects.equals(this.contactId, contactCallbackRequest.contactId) &&
        Objects.equals(this.phoneColumn, contactCallbackRequest.phoneColumn) &&
        Objects.equals(this.schedule, contactCallbackRequest.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, contactListId, contactId, phoneColumn, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactCallbackRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    phoneColumn: ").append(toIndentedString(phoneColumn)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

