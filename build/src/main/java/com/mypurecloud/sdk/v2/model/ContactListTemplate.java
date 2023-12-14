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
import com.mypurecloud.sdk.v2.model.ColumnDataTypeSpecification;
import com.mypurecloud.sdk.v2.model.ContactPhoneNumberColumn;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EmailColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListTemplate
 */

public class ContactListTemplate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<String> columnNames = new ArrayList<String>();
  private List<ContactPhoneNumberColumn> phoneColumns = new ArrayList<ContactPhoneNumberColumn>();
  private List<EmailColumn> emailColumns = new ArrayList<EmailColumn>();
  private String previewModeColumnName = null;
  private List<String> previewModeAcceptedValues = new ArrayList<String>();
  private DomainEntityRef attemptLimits = null;
  private Boolean automaticTimeZoneMapping = null;
  private String zipCodeColumnName = null;
  private List<ColumnDataTypeSpecification> columnDataTypeSpecifications = new ArrayList<ColumnDataTypeSpecification>();
  private Boolean trimWhitespace = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public ContactListTemplate name(String name) {
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
  public ContactListTemplate version(Integer version) {
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
   * The names of the contact data columns.
   **/
  public ContactListTemplate columnNames(List<String> columnNames) {
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
  public ContactListTemplate phoneColumns(List<ContactPhoneNumberColumn> phoneColumns) {
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
  public ContactListTemplate emailColumns(List<EmailColumn> emailColumns) {
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
   * A column to check if a contact should always be dialed in preview mode.
   **/
  public ContactListTemplate previewModeColumnName(String previewModeColumnName) {
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
  public ContactListTemplate previewModeAcceptedValues(List<String> previewModeAcceptedValues) {
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


  /**
   * AttemptLimits for this ContactListTemplate.
   **/
  public ContactListTemplate attemptLimits(DomainEntityRef attemptLimits) {
    this.attemptLimits = attemptLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AttemptLimits for this ContactListTemplate.")
  @JsonProperty("attemptLimits")
  public DomainEntityRef getAttemptLimits() {
    return attemptLimits;
  }
  public void setAttemptLimits(DomainEntityRef attemptLimits) {
    this.attemptLimits = attemptLimits;
  }


  /**
   * Indicates if automatic time zone mapping is to be used for this ContactListTemplate.
   **/
  public ContactListTemplate automaticTimeZoneMapping(Boolean automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if automatic time zone mapping is to be used for this ContactListTemplate.")
  @JsonProperty("automaticTimeZoneMapping")
  public Boolean getAutomaticTimeZoneMapping() {
    return automaticTimeZoneMapping;
  }
  public void setAutomaticTimeZoneMapping(Boolean automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
  }


  /**
   * The name of ContactListTemplate column containing the zip code for use with automatic time zone mapping. Only allowed if 'automaticTimeZoneMapping' is set to true.
   **/
  public ContactListTemplate zipCodeColumnName(String zipCodeColumnName) {
    this.zipCodeColumnName = zipCodeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of ContactListTemplate column containing the zip code for use with automatic time zone mapping. Only allowed if 'automaticTimeZoneMapping' is set to true.")
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
  public ContactListTemplate columnDataTypeSpecifications(List<ColumnDataTypeSpecification> columnDataTypeSpecifications) {
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
   * Whether to trim white space when importing a ContactListTemplate csv file, default value = true
   **/
  public ContactListTemplate trimWhitespace(Boolean trimWhitespace) {
    this.trimWhitespace = trimWhitespace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to trim white space when importing a ContactListTemplate csv file, default value = true")
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
    ContactListTemplate contactListTemplate = (ContactListTemplate) o;

    return Objects.equals(this.id, contactListTemplate.id) &&
            Objects.equals(this.name, contactListTemplate.name) &&
            Objects.equals(this.dateCreated, contactListTemplate.dateCreated) &&
            Objects.equals(this.dateModified, contactListTemplate.dateModified) &&
            Objects.equals(this.version, contactListTemplate.version) &&
            Objects.equals(this.columnNames, contactListTemplate.columnNames) &&
            Objects.equals(this.phoneColumns, contactListTemplate.phoneColumns) &&
            Objects.equals(this.emailColumns, contactListTemplate.emailColumns) &&
            Objects.equals(this.previewModeColumnName, contactListTemplate.previewModeColumnName) &&
            Objects.equals(this.previewModeAcceptedValues, contactListTemplate.previewModeAcceptedValues) &&
            Objects.equals(this.attemptLimits, contactListTemplate.attemptLimits) &&
            Objects.equals(this.automaticTimeZoneMapping, contactListTemplate.automaticTimeZoneMapping) &&
            Objects.equals(this.zipCodeColumnName, contactListTemplate.zipCodeColumnName) &&
            Objects.equals(this.columnDataTypeSpecifications, contactListTemplate.columnDataTypeSpecifications) &&
            Objects.equals(this.trimWhitespace, contactListTemplate.trimWhitespace) &&
            Objects.equals(this.selfUri, contactListTemplate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, columnNames, phoneColumns, emailColumns, previewModeColumnName, previewModeAcceptedValues, attemptLimits, automaticTimeZoneMapping, zipCodeColumnName, columnDataTypeSpecifications, trimWhitespace, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    phoneColumns: ").append(toIndentedString(phoneColumns)).append("\n");
    sb.append("    emailColumns: ").append(toIndentedString(emailColumns)).append("\n");
    sb.append("    previewModeColumnName: ").append(toIndentedString(previewModeColumnName)).append("\n");
    sb.append("    previewModeAcceptedValues: ").append(toIndentedString(previewModeAcceptedValues)).append("\n");
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

