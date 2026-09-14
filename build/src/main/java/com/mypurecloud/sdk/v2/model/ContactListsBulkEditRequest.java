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
import com.mypurecloud.sdk.v2.model.ContactList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListsBulkEditRequest
 */

public class ContactListsBulkEditRequest  implements Serializable {
  
  private List<String> contactListIds = null;
  private ContactList contactList = null;

  public ContactListsBulkEditRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contactListIds = new ArrayList<String>();
    }
  }

  public ContactListsBulkEditRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      contactListIds = new ArrayList<String>();
    }
  }

  
  /**
   * Contact List IDs to be bulk edited.
   **/
  public ContactListsBulkEditRequest contactListIds(List<String> contactListIds) {
    this.contactListIds = contactListIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact List IDs to be bulk edited.")
  @JsonProperty("contactListIds")
  public List<String> getContactListIds() {
    return contactListIds;
  }
  public void setContactListIds(List<String> contactListIds) {
    this.contactListIds = contactListIds;
  }


  /**
   * Contact list object with details of fields used for patching. Accepted fields: retentionType, retentionDays, timeZone
   **/
  public ContactListsBulkEditRequest contactList(ContactList contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact list object with details of fields used for patching. Accepted fields: retentionType, retentionDays, timeZone")
  @JsonProperty("contactList")
  public ContactList getContactList() {
    return contactList;
  }
  public void setContactList(ContactList contactList) {
    this.contactList = contactList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListsBulkEditRequest contactListsBulkEditRequest = (ContactListsBulkEditRequest) o;

    return Objects.equals(this.contactListIds, contactListsBulkEditRequest.contactListIds) &&
            Objects.equals(this.contactList, contactListsBulkEditRequest.contactList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactListIds, contactList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListsBulkEditRequest {\n");
    
    sb.append("    contactListIds: ").append(toIndentedString(contactListIds)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
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

