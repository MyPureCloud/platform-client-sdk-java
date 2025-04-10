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
import com.mypurecloud.sdk.v2.model.ContactSort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListingRequest
 */

public class ContactListingRequest  implements Serializable {
  
  private String contactListFilterId = null;
  private ContactBulkSearchCriteria criteria = null;
  private Integer pageNumber = null;
  private Integer pageSize = null;
  private List<ContactSort> contactSorts = null;

  public ContactListingRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contactSorts = new ArrayList<ContactSort>();
    }
  }

  
  /**
   * Contact List Filter ID.
   **/
  public ContactListingRequest contactListFilterId(String contactListFilterId) {
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
  public ContactListingRequest criteria(ContactBulkSearchCriteria criteria) {
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
   * Page number.
   **/
  public ContactListingRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Page number.")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * Page size. The max that will be returned is 100.
   **/
  public ContactListingRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Page size. The max that will be returned is 100.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * The order in which to sort contacts.
   **/
  public ContactListingRequest contactSorts(List<ContactSort> contactSorts) {
    this.contactSorts = contactSorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which to sort contacts.")
  @JsonProperty("contactSorts")
  public List<ContactSort> getContactSorts() {
    return contactSorts;
  }
  public void setContactSorts(List<ContactSort> contactSorts) {
    this.contactSorts = contactSorts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListingRequest contactListingRequest = (ContactListingRequest) o;

    return Objects.equals(this.contactListFilterId, contactListingRequest.contactListFilterId) &&
            Objects.equals(this.criteria, contactListingRequest.criteria) &&
            Objects.equals(this.pageNumber, contactListingRequest.pageNumber) &&
            Objects.equals(this.pageSize, contactListingRequest.pageSize) &&
            Objects.equals(this.contactSorts, contactListingRequest.contactSorts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactListFilterId, criteria, pageNumber, pageSize, contactSorts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListingRequest {\n");
    
    sb.append("    contactListFilterId: ").append(toIndentedString(contactListFilterId)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    contactSorts: ").append(toIndentedString(contactSorts)).append("\n");
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

