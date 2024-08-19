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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactBulkSearchParameters
 */

public class ContactBulkSearchParameters  implements Serializable {
  
  private String contactListFilterId = null;
  private ContactBulkSearchCriteria criteria = null;

  
  /**
   * Contact List Filter ID. Either this property or criteria is required.
   **/
  public ContactBulkSearchParameters contactListFilterId(String contactListFilterId) {
    this.contactListFilterId = contactListFilterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact List Filter ID. Either this property or criteria is required.")
  @JsonProperty("contactListFilterId")
  public String getContactListFilterId() {
    return contactListFilterId;
  }
  public void setContactListFilterId(String contactListFilterId) {
    this.contactListFilterId = contactListFilterId;
  }


  /**
   * Criteria to filter the contacts by. Either this property or contactListFilterId is required.
   **/
  public ContactBulkSearchParameters criteria(ContactBulkSearchCriteria criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Criteria to filter the contacts by. Either this property or contactListFilterId is required.")
  @JsonProperty("criteria")
  public ContactBulkSearchCriteria getCriteria() {
    return criteria;
  }
  public void setCriteria(ContactBulkSearchCriteria criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactBulkSearchParameters contactBulkSearchParameters = (ContactBulkSearchParameters) o;

    return Objects.equals(this.contactListFilterId, contactBulkSearchParameters.contactListFilterId) &&
            Objects.equals(this.criteria, contactBulkSearchParameters.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactListFilterId, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactBulkSearchParameters {\n");
    
    sb.append("    contactListFilterId: ").append(toIndentedString(contactListFilterId)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

