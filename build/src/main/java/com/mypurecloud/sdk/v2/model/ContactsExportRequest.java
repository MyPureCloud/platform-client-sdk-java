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
import com.mypurecloud.sdk.v2.model.ContactBulkSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactsExportRequest
 */

public class ContactsExportRequest  implements Serializable {
  
  private String contactListFilterId = null;
  private ContactBulkSearchCriteria criteria = null;
  private List<String> contactIds = null;

  public ContactsExportRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contactIds = new ArrayList<String>();
    }
  }

  
  /**
   * Contact List Filter ID.
   **/
  public ContactsExportRequest contactListFilterId(String contactListFilterId) {
    this.contactListFilterId = contactListFilterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact List Filter ID.")
  @JsonProperty("contactListFilterId")
  public String getContactListFilterId() {
    return contactListFilterId;
  }
  public void setContactListFilterId(String contactListFilterId) {
    this.contactListFilterId = contactListFilterId;
  }


  /**
   * Criteria to filter the contacts by.
   **/
  public ContactsExportRequest criteria(ContactBulkSearchCriteria criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Criteria to filter the contacts by.")
  @JsonProperty("criteria")
  public ContactBulkSearchCriteria getCriteria() {
    return criteria;
  }
  public void setCriteria(ContactBulkSearchCriteria criteria) {
    this.criteria = criteria;
  }


  /**
   * Contact IDs to be exported.
   **/
  public ContactsExportRequest contactIds(List<String> contactIds) {
    this.contactIds = contactIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact IDs to be exported.")
  @JsonProperty("contactIds")
  public List<String> getContactIds() {
    return contactIds;
  }
  public void setContactIds(List<String> contactIds) {
    this.contactIds = contactIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactsExportRequest contactsExportRequest = (ContactsExportRequest) o;

    return Objects.equals(this.contactListFilterId, contactsExportRequest.contactListFilterId) &&
            Objects.equals(this.criteria, contactsExportRequest.criteria) &&
            Objects.equals(this.contactIds, contactsExportRequest.contactIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactListFilterId, criteria, contactIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactsExportRequest {\n");
    
    sb.append("    contactListFilterId: ").append(toIndentedString(contactListFilterId)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
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

