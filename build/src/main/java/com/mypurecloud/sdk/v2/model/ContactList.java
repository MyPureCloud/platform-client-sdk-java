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
import com.mypurecloud.sdk.v2.model.ColumnDataTypeSpecification;
import com.mypurecloud.sdk.v2.model.ContactPhoneNumberColumn;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EmailColumn;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.WhatsAppColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ContactList
 */

public class ContactList  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DomainEntityRef division = null;
  private List<String> columnNames = null;
  private List<ContactPhoneNumberColumn> phoneColumns = null;
  private List<EmailColumn> emailColumns = null;
  private List<WhatsAppColumn> whatsAppColumns = null;
  private ImportStatus importStatus = null;
  private String previewModeColumnName = null;
  private List<String> previewModeAcceptedValues = null;
  private Long size = null;
  private DomainEntityRef attemptLimits = null;
  private Boolean automaticTimeZoneMapping = null;
  private String zipCodeColumnName = null;
  private List<ColumnDataTypeSpecification> columnDataTypeSpecifications = null;
  private Boolean trimWhitespace = null;
  private String selfUri = null;

  public ContactList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      columnNames = new ArrayList<String>();
      phoneColumns = new ArrayList<ContactPhoneNumberColumn>();
      emailColumns = new ArrayList<EmailColumn>();
      whatsAppColumns = new ArrayList<WhatsAppColumn>();
      previewModeAcceptedValues = new ArrayList<String>();
      columnDataTypeSpecifications = new ArrayList<ColumnDataTypeSpecification>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public ContactList name(String name) {
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
  public ContactList version(Integer version) {
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
   * The division this entity belongs to.
   **/
  public ContactList division(DomainEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division this entity belongs to.")
  @JsonProperty("division")
  public DomainEntityRef getDivision() {
    return division;
  }
  public void setDivision(DomainEntityRef division) {
    this.division = division;
  }


  /**
   * The names of the contact data columns.
   **/
  public ContactList columnNames(List<String> columnNames) {
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
  public ContactList phoneColumns(List<ContactPhoneNumberColumn> phoneColumns) {
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


  /**
   * Indicates which columns are email addresses
   **/
  public ContactList emailColumns(List<EmailColumn> emailColumns) {
    this.emailColumns = emailColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates which columns are email addresses")
  @JsonProperty("emailColumns")
  public List<EmailColumn> getEmailColumns() {
    return emailColumns;
  }
  public void setEmailColumns(List<EmailColumn> emailColumns) {
    this.emailColumns = emailColumns;
  }


  /**
   * Indicates which columns are whatsApp contacts
   **/
  public ContactList whatsAppColumns(List<WhatsAppColumn> whatsAppColumns) {
    this.whatsAppColumns = whatsAppColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates which columns are whatsApp contacts")
  @JsonProperty("whatsAppColumns")
  public List<WhatsAppColumn> getWhatsAppColumns() {
    return whatsAppColumns;
  }
  public void setWhatsAppColumns(List<WhatsAppColumn> whatsAppColumns) {
    this.whatsAppColumns = whatsAppColumns;
  }


  @ApiModelProperty(example = "null", value = "The status of the import process.")
  @JsonProperty("importStatus")
  public ImportStatus getImportStatus() {
    return importStatus;
  }


  /**
   * A column to check if a contact should always be dialed in preview mode.
   **/
  public ContactList previewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A column to check if a contact should always be dialed in preview mode.")
  @JsonProperty("previewModeColumnName")
  public String getPreviewModeColumnName() {
    return previewModeColumnName;
  }
  public void setPreviewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
  }


  /**
   * The values in the previewModeColumnName column that indicate a contact should always be dialed in preview mode.
   **/
  public ContactList previewModeAcceptedValues(List<String> previewModeAcceptedValues) {
    this.previewModeAcceptedValues = previewModeAcceptedValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The values in the previewModeColumnName column that indicate a contact should always be dialed in preview mode.")
  @JsonProperty("previewModeAcceptedValues")
  public List<String> getPreviewModeAcceptedValues() {
    return previewModeAcceptedValues;
  }
  public void setPreviewModeAcceptedValues(List<String> previewModeAcceptedValues) {
    this.previewModeAcceptedValues = previewModeAcceptedValues;
  }


  @ApiModelProperty(example = "null", value = "The number of contacts in the ContactList.")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }


  /**
   * AttemptLimits for this ContactList.
   **/
  public ContactList attemptLimits(DomainEntityRef attemptLimits) {
    this.attemptLimits = attemptLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AttemptLimits for this ContactList.")
  @JsonProperty("attemptLimits")
  public DomainEntityRef getAttemptLimits() {
    return attemptLimits;
  }
  public void setAttemptLimits(DomainEntityRef attemptLimits) {
    this.attemptLimits = attemptLimits;
  }


  /**
   * Indicates if automatic time zone mapping is to be used for this ContactList.
   **/
  public ContactList automaticTimeZoneMapping(Boolean automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if automatic time zone mapping is to be used for this ContactList.")
  @JsonProperty("automaticTimeZoneMapping")
  public Boolean getAutomaticTimeZoneMapping() {
    return automaticTimeZoneMapping;
  }
  public void setAutomaticTimeZoneMapping(Boolean automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
  }


  /**
   * The name of contact list column containing the zip code for use with automatic time zone mapping. Only allowed if 'automaticTimeZoneMapping' is set to true.
   **/
  public ContactList zipCodeColumnName(String zipCodeColumnName) {
    this.zipCodeColumnName = zipCodeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of contact list column containing the zip code for use with automatic time zone mapping. Only allowed if 'automaticTimeZoneMapping' is set to true.")
  @JsonProperty("zipCodeColumnName")
  public String getZipCodeColumnName() {
    return zipCodeColumnName;
  }
  public void setZipCodeColumnName(String zipCodeColumnName) {
    this.zipCodeColumnName = zipCodeColumnName;
  }


  /**
   * The settings of the columns selected for dynamic queueing
   **/
  public ContactList columnDataTypeSpecifications(List<ColumnDataTypeSpecification> columnDataTypeSpecifications) {
    this.columnDataTypeSpecifications = columnDataTypeSpecifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings of the columns selected for dynamic queueing")
  @JsonProperty("columnDataTypeSpecifications")
  public List<ColumnDataTypeSpecification> getColumnDataTypeSpecifications() {
    return columnDataTypeSpecifications;
  }
  public void setColumnDataTypeSpecifications(List<ColumnDataTypeSpecification> columnDataTypeSpecifications) {
    this.columnDataTypeSpecifications = columnDataTypeSpecifications;
  }


  /**
   * Whether to trim white space when importing a contactlist csv file, default value = true
   **/
  public ContactList trimWhitespace(Boolean trimWhitespace) {
    this.trimWhitespace = trimWhitespace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to trim white space when importing a contactlist csv file, default value = true")
  @JsonProperty("trimWhitespace")
  public Boolean getTrimWhitespace() {
    return trimWhitespace;
  }
  public void setTrimWhitespace(Boolean trimWhitespace) {
    this.trimWhitespace = trimWhitespace;
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
    ContactList contactList = (ContactList) o;

    return Objects.equals(this.id, contactList.id) &&
            Objects.equals(this.name, contactList.name) &&
            Objects.equals(this.dateCreated, contactList.dateCreated) &&
            Objects.equals(this.dateModified, contactList.dateModified) &&
            Objects.equals(this.version, contactList.version) &&
            Objects.equals(this.division, contactList.division) &&
            Objects.equals(this.columnNames, contactList.columnNames) &&
            Objects.equals(this.phoneColumns, contactList.phoneColumns) &&
            Objects.equals(this.emailColumns, contactList.emailColumns) &&
            Objects.equals(this.whatsAppColumns, contactList.whatsAppColumns) &&
            Objects.equals(this.importStatus, contactList.importStatus) &&
            Objects.equals(this.previewModeColumnName, contactList.previewModeColumnName) &&
            Objects.equals(this.previewModeAcceptedValues, contactList.previewModeAcceptedValues) &&
            Objects.equals(this.size, contactList.size) &&
            Objects.equals(this.attemptLimits, contactList.attemptLimits) &&
            Objects.equals(this.automaticTimeZoneMapping, contactList.automaticTimeZoneMapping) &&
            Objects.equals(this.zipCodeColumnName, contactList.zipCodeColumnName) &&
            Objects.equals(this.columnDataTypeSpecifications, contactList.columnDataTypeSpecifications) &&
            Objects.equals(this.trimWhitespace, contactList.trimWhitespace) &&
            Objects.equals(this.selfUri, contactList.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, division, columnNames, phoneColumns, emailColumns, whatsAppColumns, importStatus, previewModeColumnName, previewModeAcceptedValues, size, attemptLimits, automaticTimeZoneMapping, zipCodeColumnName, columnDataTypeSpecifications, trimWhitespace, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    phoneColumns: ").append(toIndentedString(phoneColumns)).append("\n");
    sb.append("    emailColumns: ").append(toIndentedString(emailColumns)).append("\n");
    sb.append("    whatsAppColumns: ").append(toIndentedString(whatsAppColumns)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    previewModeColumnName: ").append(toIndentedString(previewModeColumnName)).append("\n");
    sb.append("    previewModeAcceptedValues: ").append(toIndentedString(previewModeAcceptedValues)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    attemptLimits: ").append(toIndentedString(attemptLimits)).append("\n");
    sb.append("    automaticTimeZoneMapping: ").append(toIndentedString(automaticTimeZoneMapping)).append("\n");
    sb.append("    zipCodeColumnName: ").append(toIndentedString(zipCodeColumnName)).append("\n");
    sb.append("    columnDataTypeSpecifications: ").append(toIndentedString(columnDataTypeSpecifications)).append("\n");
    sb.append("    trimWhitespace: ").append(toIndentedString(trimWhitespace)).append("\n");
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

