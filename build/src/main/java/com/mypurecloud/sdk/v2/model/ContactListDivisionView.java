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
import com.mypurecloud.sdk.v2.model.ContactPhoneNumberColumn;
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListDivisionView
 */

public class ContactListDivisionView  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private List<String> columnNames = new ArrayList<String>();
  private List<ContactPhoneNumberColumn> phoneColumns = new ArrayList<ContactPhoneNumberColumn>();
  private ImportStatus importStatus = null;
  private Long size = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ContactListDivisionView name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The division to which this entity belongs.
   **/
  public ContactListDivisionView division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }

  
  /**
   * The names of the contact data columns.
   **/
  public ContactListDivisionView columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The names of the contact data columns.")
  @JsonProperty("columnNames")
  public List<String> getColumnNames() {
    return columnNames;
  }
  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  
  /**
   * Indicates which columns are phone numbers.
   **/
  public ContactListDivisionView phoneColumns(List<ContactPhoneNumberColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates which columns are phone numbers.")
  @JsonProperty("phoneColumns")
  public List<ContactPhoneNumberColumn> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<ContactPhoneNumberColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
  }

  
  @ApiModelProperty(example = "null", value = "The status of the import process.")
  @JsonProperty("importStatus")
  public ImportStatus getImportStatus() {
    return importStatus;
  }

  
  @ApiModelProperty(example = "null", value = "The number of contacts in the ContactList.")
  @JsonProperty("size")
  public Long getSize() {
    return size;
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
    ContactListDivisionView contactListDivisionView = (ContactListDivisionView) o;
    return Objects.equals(this.id, contactListDivisionView.id) &&
        Objects.equals(this.name, contactListDivisionView.name) &&
        Objects.equals(this.division, contactListDivisionView.division) &&
        Objects.equals(this.columnNames, contactListDivisionView.columnNames) &&
        Objects.equals(this.phoneColumns, contactListDivisionView.phoneColumns) &&
        Objects.equals(this.importStatus, contactListDivisionView.importStatus) &&
        Objects.equals(this.size, contactListDivisionView.size) &&
        Objects.equals(this.selfUri, contactListDivisionView.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, columnNames, phoneColumns, importStatus, size, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListDivisionView {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    phoneColumns: ").append(toIndentedString(phoneColumns)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

