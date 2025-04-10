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
import com.mypurecloud.sdk.v2.model.ContactsExportFieldFilter;
import com.mypurecloud.sdk.v2.model.ContactsExportFieldListFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactsExportFilter
 */

public class ContactsExportFilter  implements Serializable {
  
  private ContactsExportFieldFilter eq = null;
  private ContactsExportFieldListFilter in = null;
  private List<ContactsExportFilter> and = null;
  private List<ContactsExportFilter> or = null;
  private ContactsExportFilter not = null;

  public ContactsExportFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      and = new ArrayList<ContactsExportFilter>();
      or = new ArrayList<ContactsExportFilter>();
    }
  }

  
  /**
   * Filtered field should have the same value
   **/
  public ContactsExportFilter eq(ContactsExportFieldFilter eq) {
    this.eq = eq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should have the same value")
  @JsonProperty("eq")
  public ContactsExportFieldFilter getEq() {
    return eq;
  }
  public void setEq(ContactsExportFieldFilter eq) {
    this.eq = eq;
  }


  /**
   * Filtered field should match one of the listed values
   **/
  public ContactsExportFilter in(ContactsExportFieldListFilter in) {
    this.in = in;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should match one of the listed values")
  @JsonProperty("in")
  public ContactsExportFieldListFilter getIn() {
    return in;
  }
  public void setIn(ContactsExportFieldListFilter in) {
    this.in = in;
  }


  /**
   * Boolean AND combination of filters
   **/
  public ContactsExportFilter and(List<ContactsExportFilter> and) {
    this.and = and;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean AND combination of filters")
  @JsonProperty("and")
  public List<ContactsExportFilter> getAnd() {
    return and;
  }
  public void setAnd(List<ContactsExportFilter> and) {
    this.and = and;
  }


  /**
   * Boolean OR combination of filters
   **/
  public ContactsExportFilter or(List<ContactsExportFilter> or) {
    this.or = or;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean OR combination of filters")
  @JsonProperty("or")
  public List<ContactsExportFilter> getOr() {
    return or;
  }
  public void setOr(List<ContactsExportFilter> or) {
    this.or = or;
  }


  /**
   * Boolean negation of filters
   **/
  public ContactsExportFilter not(ContactsExportFilter not) {
    this.not = not;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean negation of filters")
  @JsonProperty("not")
  public ContactsExportFilter getNot() {
    return not;
  }
  public void setNot(ContactsExportFilter not) {
    this.not = not;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactsExportFilter contactsExportFilter = (ContactsExportFilter) o;

    return Objects.equals(this.eq, contactsExportFilter.eq) &&
            Objects.equals(this.in, contactsExportFilter.in) &&
            Objects.equals(this.and, contactsExportFilter.and) &&
            Objects.equals(this.or, contactsExportFilter.or) &&
            Objects.equals(this.not, contactsExportFilter.not);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, in, and, or, not);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactsExportFilter {\n");
    
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
    sb.append("    not: ").append(toIndentedString(not)).append("\n");
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

