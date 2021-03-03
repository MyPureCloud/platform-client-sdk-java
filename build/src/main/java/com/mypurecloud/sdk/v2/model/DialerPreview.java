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
import com.mypurecloud.sdk.v2.model.PhoneNumberColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialerPreview
 */

public class DialerPreview  implements Serializable {
  
  private String id = null;
  private String contactId = null;
  private String contactListId = null;
  private String campaignId = null;
  private List<PhoneNumberColumn> phoneNumberColumns = new ArrayList<PhoneNumberColumn>();

  
  /**
   **/
  public DialerPreview id(String id) {
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
   * The contact associated with this preview data pop
   **/
  public DialerPreview contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contact associated with this preview data pop")
  @JsonProperty("contactId")
  public String getContactId() {
    return contactId;
  }
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  
  /**
   * The contactList associated with this preview data pop.
   **/
  public DialerPreview contactListId(String contactListId) {
    this.contactListId = contactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contactList associated with this preview data pop.")
  @JsonProperty("contactListId")
  public String getContactListId() {
    return contactListId;
  }
  public void setContactListId(String contactListId) {
    this.contactListId = contactListId;
  }

  
  /**
   * The campaignId associated with this preview data pop.
   **/
  public DialerPreview campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The campaignId associated with this preview data pop.")
  @JsonProperty("campaignId")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  
  /**
   * The phone number columns associated with this campaign
   **/
  public DialerPreview phoneNumberColumns(List<PhoneNumberColumn> phoneNumberColumns) {
    this.phoneNumberColumns = phoneNumberColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number columns associated with this campaign")
  @JsonProperty("phoneNumberColumns")
  public List<PhoneNumberColumn> getPhoneNumberColumns() {
    return phoneNumberColumns;
  }
  public void setPhoneNumberColumns(List<PhoneNumberColumn> phoneNumberColumns) {
    this.phoneNumberColumns = phoneNumberColumns;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerPreview dialerPreview = (DialerPreview) o;
    return Objects.equals(this.id, dialerPreview.id) &&
        Objects.equals(this.contactId, dialerPreview.contactId) &&
        Objects.equals(this.contactListId, dialerPreview.contactListId) &&
        Objects.equals(this.campaignId, dialerPreview.campaignId) &&
        Objects.equals(this.phoneNumberColumns, dialerPreview.phoneNumberColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contactId, contactListId, campaignId, phoneNumberColumns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerPreview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    phoneNumberColumns: ").append(toIndentedString(phoneNumberColumns)).append("\n");
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

