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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ContactListFilterClause;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListFilter
 */

public class ContactListFilter  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DomainEntityRef contactList = null;
  private List<ContactListFilterClause> clauses = new ArrayList<ContactListFilterClause>();

  private static class FilterTypeEnumDeserializer extends StdDeserializer<FilterTypeEnum> {
    public FilterTypeEnumDeserializer() {
      super(FilterTypeEnumDeserializer.class);
    }

    @Override
    public FilterTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FilterTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to join clauses together.
   */
 @JsonDeserialize(using = FilterTypeEnumDeserializer.class)
  public enum FilterTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("AND"),
    OR("OR");

    private String value;

    FilterTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FilterTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FilterTypeEnum value : FilterTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FilterTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FilterTypeEnum filterType = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the list.
   **/
  public ContactListFilter name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the list.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public ContactListFilter version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The contact list the filter is based on.
   **/
  public ContactListFilter contactList(DomainEntityRef contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The contact list the filter is based on.")
  @JsonProperty("contactList")
  public DomainEntityRef getContactList() {
    return contactList;
  }
  public void setContactList(DomainEntityRef contactList) {
    this.contactList = contactList;
  }

  
  /**
   * Groups of conditions to filter the contacts by.
   **/
  public ContactListFilter clauses(List<ContactListFilterClause> clauses) {
    this.clauses = clauses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Groups of conditions to filter the contacts by.")
  @JsonProperty("clauses")
  public List<ContactListFilterClause> getClauses() {
    return clauses;
  }
  public void setClauses(List<ContactListFilterClause> clauses) {
    this.clauses = clauses;
  }

  
  /**
   * How to join clauses together.
   **/
  public ContactListFilter filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to join clauses together.")
  @JsonProperty("filterType")
  public FilterTypeEnum getFilterType() {
    return filterType;
  }
  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListFilter contactListFilter = (ContactListFilter) o;
    return Objects.equals(this.id, contactListFilter.id) &&
        Objects.equals(this.name, contactListFilter.name) &&
        Objects.equals(this.dateCreated, contactListFilter.dateCreated) &&
        Objects.equals(this.dateModified, contactListFilter.dateModified) &&
        Objects.equals(this.version, contactListFilter.version) &&
        Objects.equals(this.contactList, contactListFilter.contactList) &&
        Objects.equals(this.clauses, contactListFilter.clauses) &&
        Objects.equals(this.filterType, contactListFilter.filterType) &&
        Objects.equals(this.selfUri, contactListFilter.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactList, clauses, filterType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListFilter {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

