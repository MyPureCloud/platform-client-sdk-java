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
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReverseWhitepagesLookupResult
 */

public class ReverseWhitepagesLookupResult  implements Serializable {
  
  private List<ExternalContact> contacts = new ArrayList<ExternalContact>();
  private List<ExternalOrganization> externalOrganizations = new ArrayList<ExternalOrganization>();

  
  /**
   **/
  public ReverseWhitepagesLookupResult contacts(List<ExternalContact> contacts) {
    this.contacts = contacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contacts")
  public List<ExternalContact> getContacts() {
    return contacts;
  }
  public void setContacts(List<ExternalContact> contacts) {
    this.contacts = contacts;
  }

  
  /**
   **/
  public ReverseWhitepagesLookupResult externalOrganizations(List<ExternalOrganization> externalOrganizations) {
    this.externalOrganizations = externalOrganizations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganizations")
  public List<ExternalOrganization> getExternalOrganizations() {
    return externalOrganizations;
  }
  public void setExternalOrganizations(List<ExternalOrganization> externalOrganizations) {
    this.externalOrganizations = externalOrganizations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReverseWhitepagesLookupResult reverseWhitepagesLookupResult = (ReverseWhitepagesLookupResult) o;
    return Objects.equals(this.contacts, reverseWhitepagesLookupResult.contacts) &&
        Objects.equals(this.externalOrganizations, reverseWhitepagesLookupResult.externalOrganizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts, externalOrganizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReverseWhitepagesLookupResult {\n");
    
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    externalOrganizations: ").append(toIndentedString(externalOrganizations)).append("\n");
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

