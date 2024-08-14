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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ContactBulkSearchCriteria;
import com.mypurecloud.sdk.v2.model.DialerContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactBulkEditRequest
 */

public class ContactBulkEditRequest  implements Serializable {
  
  private String contactListFilterId = null;
  private ContactBulkSearchCriteria criteria = null;
  private List<String> contactIds = new ArrayList<String>();
  private DialerContact contact = null;
  private Boolean generateDownloadUri = null;

  
  /**
   * Contact List Filter ID.
   **/
  public ContactBulkEditRequest contactListFilterId(String contactListFilterId) {
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
  public ContactBulkEditRequest criteria(ContactBulkSearchCriteria criteria) {
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
   * Contact IDs to be bulk edited.
   **/
  public ContactBulkEditRequest contactIds(List<String> contactIds) {
    this.contactIds = contactIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact IDs to be bulk edited.")
  @JsonProperty("contactIds")
  public List<String> getContactIds() {
    return contactIds;
  }
  public void setContactIds(List<String> contactIds) {
    this.contactIds = contactIds;
  }


  /**
   * Contact object with details of fields used for patching.
   **/
  public ContactBulkEditRequest contact(DialerContact contact) {
    this.contact = contact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact object with details of fields used for patching.")
  @JsonProperty("contact")
  public DialerContact getContact() {
    return contact;
  }
  public void setContact(DialerContact contact) {
    this.contact = contact;
  }


  /**
   **/
  public ContactBulkEditRequest generateDownloadUri(Boolean generateDownloadUri) {
    this.generateDownloadUri = generateDownloadUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("generateDownloadUri")
  public Boolean getGenerateDownloadUri() {
    return generateDownloadUri;
  }
  public void setGenerateDownloadUri(Boolean generateDownloadUri) {
    this.generateDownloadUri = generateDownloadUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactBulkEditRequest contactBulkEditRequest = (ContactBulkEditRequest) o;

    return Objects.equals(this.contactListFilterId, contactBulkEditRequest.contactListFilterId) &&
            Objects.equals(this.criteria, contactBulkEditRequest.criteria) &&
            Objects.equals(this.contactIds, contactBulkEditRequest.contactIds) &&
            Objects.equals(this.contact, contactBulkEditRequest.contact) &&
            Objects.equals(this.generateDownloadUri, contactBulkEditRequest.generateDownloadUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactListFilterId, criteria, contactIds, contact, generateDownloadUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactBulkEditRequest {\n");
    
    sb.append("    contactListFilterId: ").append(toIndentedString(contactListFilterId)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    generateDownloadUri: ").append(toIndentedString(generateDownloadUri)).append("\n");
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

