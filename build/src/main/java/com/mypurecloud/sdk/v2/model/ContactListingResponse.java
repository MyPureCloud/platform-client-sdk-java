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
import com.mypurecloud.sdk.v2.PagedResource;
import com.mypurecloud.sdk.v2.model.DialerContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListingResponse
 */

public class ContactListingResponse  implements Serializable, PagedResource<DialerContact> {
  
  private List<DialerContact> entities = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long total = null;
  private Long contactsCount = null;
  private String lastUri = null;
  private String firstUri = null;
  private String selfUri = null;
  private String nextUri = null;
  private String previousUri = null;
  private Integer pageCount = null;

  public ContactListingResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<DialerContact>();
    }
  }

  
  /**
   **/
  public ContactListingResponse entities(List<DialerContact> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<DialerContact> getEntities() {
    return entities;
  }
  public void setEntities(List<DialerContact> entities) {
    this.entities = entities;
  }


  /**
   **/
  public ContactListingResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   **/
  public ContactListingResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   **/
  public ContactListingResponse total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }


  /**
   **/
  public ContactListingResponse contactsCount(Long contactsCount) {
    this.contactsCount = contactsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactsCount")
  public Long getContactsCount() {
    return contactsCount;
  }
  public void setContactsCount(Long contactsCount) {
    this.contactsCount = contactsCount;
  }


  /**
   **/
  public ContactListingResponse lastUri(String lastUri) {
    this.lastUri = lastUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastUri")
  public String getLastUri() {
    return lastUri;
  }
  public void setLastUri(String lastUri) {
    this.lastUri = lastUri;
  }


  /**
   **/
  public ContactListingResponse firstUri(String firstUri) {
    this.firstUri = firstUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstUri")
  public String getFirstUri() {
    return firstUri;
  }
  public void setFirstUri(String firstUri) {
    this.firstUri = firstUri;
  }


  /**
   **/
  public ContactListingResponse selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   **/
  public ContactListingResponse nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   **/
  public ContactListingResponse previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   **/
  public ContactListingResponse pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListingResponse contactListingResponse = (ContactListingResponse) o;

    return Objects.equals(this.entities, contactListingResponse.entities) &&
            Objects.equals(this.pageSize, contactListingResponse.pageSize) &&
            Objects.equals(this.pageNumber, contactListingResponse.pageNumber) &&
            Objects.equals(this.total, contactListingResponse.total) &&
            Objects.equals(this.contactsCount, contactListingResponse.contactsCount) &&
            Objects.equals(this.lastUri, contactListingResponse.lastUri) &&
            Objects.equals(this.firstUri, contactListingResponse.firstUri) &&
            Objects.equals(this.selfUri, contactListingResponse.selfUri) &&
            Objects.equals(this.nextUri, contactListingResponse.nextUri) &&
            Objects.equals(this.previousUri, contactListingResponse.previousUri) &&
            Objects.equals(this.pageCount, contactListingResponse.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, pageSize, pageNumber, total, contactsCount, lastUri, firstUri, selfUri, nextUri, previousUri, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListingResponse {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    contactsCount: ").append(toIndentedString(contactsCount)).append("\n");
    sb.append("    lastUri: ").append(toIndentedString(lastUri)).append("\n");
    sb.append("    firstUri: ").append(toIndentedString(firstUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

