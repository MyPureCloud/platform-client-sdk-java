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
import com.mypurecloud.sdk.v2.model.DialerContactlistConfigChangeContactPhoneNumberColumn;
import com.mypurecloud.sdk.v2.model.DialerContactlistConfigChangeEmailColumn;
import com.mypurecloud.sdk.v2.model.DialerContactlistConfigChangeImportStatus;
import com.mypurecloud.sdk.v2.model.DialerContactlistConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerContactlistConfigChangeContactList
 */

public class DialerContactlistConfigChangeContactList  implements Serializable {
  
  private List<String> columnNames = null;
  private List<DialerContactlistConfigChangeContactPhoneNumberColumn> phoneColumns = null;
  private List<DialerContactlistConfigChangeEmailColumn> emailColumns = null;
  private DialerContactlistConfigChangeImportStatus importStatus = null;
  private String previewModeColumnName = null;
  private List<String> previewModeAcceptedValues = null;
  private Long size = null;
  private DialerContactlistConfigChangeUriReference attemptLimits = null;
  private Boolean automaticTimeZoneMapping = null;
  private String zipCodeColumnName = null;
  private DialerContactlistConfigChangeUriReference division = null;
  private Map<String, Object> additionalProperties = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Long version = null;
  private Map<String, Object> getAdditionalProperties = null;

  public DialerContactlistConfigChangeContactList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      columnNames = new ArrayList<String>();
      phoneColumns = new ArrayList<DialerContactlistConfigChangeContactPhoneNumberColumn>();
      emailColumns = new ArrayList<DialerContactlistConfigChangeEmailColumn>();
      previewModeAcceptedValues = new ArrayList<String>();
    }
  }

  
  /**
   * the contact column names
   **/
  public DialerContactlistConfigChangeContactList columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the contact column names")
  @JsonProperty("columnNames")
  public List<String> getColumnNames() {
    return columnNames;
  }
  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }


  /**
   * the columns containing phone numbers
   **/
  public DialerContactlistConfigChangeContactList phoneColumns(List<DialerContactlistConfigChangeContactPhoneNumberColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the columns containing phone numbers")
  @JsonProperty("phoneColumns")
  public List<DialerContactlistConfigChangeContactPhoneNumberColumn> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<DialerContactlistConfigChangeContactPhoneNumberColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
  }


  /**
   * the columns containing email addresses
   **/
  public DialerContactlistConfigChangeContactList emailColumns(List<DialerContactlistConfigChangeEmailColumn> emailColumns) {
    this.emailColumns = emailColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the columns containing email addresses")
  @JsonProperty("emailColumns")
  public List<DialerContactlistConfigChangeEmailColumn> getEmailColumns() {
    return emailColumns;
  }
  public void setEmailColumns(List<DialerContactlistConfigChangeEmailColumn> emailColumns) {
    this.emailColumns = emailColumns;
  }


  /**
   **/
  public DialerContactlistConfigChangeContactList importStatus(DialerContactlistConfigChangeImportStatus importStatus) {
    this.importStatus = importStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("importStatus")
  public DialerContactlistConfigChangeImportStatus getImportStatus() {
    return importStatus;
  }
  public void setImportStatus(DialerContactlistConfigChangeImportStatus importStatus) {
    this.importStatus = importStatus;
  }


  /**
   * the name of the column that holds the indicators for contacts that are to be dialed in preview mode only
   **/
  public DialerContactlistConfigChangeContactList previewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the name of the column that holds the indicators for contacts that are to be dialed in preview mode only")
  @JsonProperty("previewModeColumnName")
  public String getPreviewModeColumnName() {
    return previewModeColumnName;
  }
  public void setPreviewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
  }


  /**
   * list of user-defined values indicating the contact is to be dialed in preview mode only
   **/
  public DialerContactlistConfigChangeContactList previewModeAcceptedValues(List<String> previewModeAcceptedValues) {
    this.previewModeAcceptedValues = previewModeAcceptedValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "list of user-defined values indicating the contact is to be dialed in preview mode only")
  @JsonProperty("previewModeAcceptedValues")
  public List<String> getPreviewModeAcceptedValues() {
    return previewModeAcceptedValues;
  }
  public void setPreviewModeAcceptedValues(List<String> previewModeAcceptedValues) {
    this.previewModeAcceptedValues = previewModeAcceptedValues;
  }


  /**
   * the number of contacts in the contact list
   **/
  public DialerContactlistConfigChangeContactList size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the number of contacts in the contact list")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   **/
  public DialerContactlistConfigChangeContactList attemptLimits(DialerContactlistConfigChangeUriReference attemptLimits) {
    this.attemptLimits = attemptLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attemptLimits")
  public DialerContactlistConfigChangeUriReference getAttemptLimits() {
    return attemptLimits;
  }
  public void setAttemptLimits(DialerContactlistConfigChangeUriReference attemptLimits) {
    this.attemptLimits = attemptLimits;
  }


  /**
   * whether or not automatic time zone mapping is enabled on the list
   **/
  public DialerContactlistConfigChangeContactList automaticTimeZoneMapping(Boolean automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "whether or not automatic time zone mapping is enabled on the list")
  @JsonProperty("automaticTimeZoneMapping")
  public Boolean getAutomaticTimeZoneMapping() {
    return automaticTimeZoneMapping;
  }
  public void setAutomaticTimeZoneMapping(Boolean automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
  }


  /**
   * zip code column from the contact list to be used optionally with automatic time zone mapping
   **/
  public DialerContactlistConfigChangeContactList zipCodeColumnName(String zipCodeColumnName) {
    this.zipCodeColumnName = zipCodeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "zip code column from the contact list to be used optionally with automatic time zone mapping")
  @JsonProperty("zipCodeColumnName")
  public String getZipCodeColumnName() {
    return zipCodeColumnName;
  }
  public void setZipCodeColumnName(String zipCodeColumnName) {
    this.zipCodeColumnName = zipCodeColumnName;
  }


  /**
   * A UriReference for a resource
   **/
  public DialerContactlistConfigChangeContactList division(DialerContactlistConfigChangeUriReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("division")
  public DialerContactlistConfigChangeUriReference getDivision() {
    return division;
  }
  public void setDivision(DialerContactlistConfigChangeUriReference division) {
    this.division = division;
  }


  /**
   **/
  public DialerContactlistConfigChangeContactList additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public DialerContactlistConfigChangeContactList id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The UI-visible name of the object
   **/
  public DialerContactlistConfigChangeContactList name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UI-visible name of the object")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Creation time of the entity
   **/
  public DialerContactlistConfigChangeContactList dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation time of the entity")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Last modified time of the entity
   **/
  public DialerContactlistConfigChangeContactList dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DialerContactlistConfigChangeContactList version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }


  /**
   **/
  public DialerContactlistConfigChangeContactList getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getAdditionalProperties")
  public Map<String, Object> getGetAdditionalProperties() {
    return getAdditionalProperties;
  }
  public void setGetAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerContactlistConfigChangeContactList dialerContactlistConfigChangeContactList = (DialerContactlistConfigChangeContactList) o;

    return Objects.equals(this.columnNames, dialerContactlistConfigChangeContactList.columnNames) &&
            Objects.equals(this.phoneColumns, dialerContactlistConfigChangeContactList.phoneColumns) &&
            Objects.equals(this.emailColumns, dialerContactlistConfigChangeContactList.emailColumns) &&
            Objects.equals(this.importStatus, dialerContactlistConfigChangeContactList.importStatus) &&
            Objects.equals(this.previewModeColumnName, dialerContactlistConfigChangeContactList.previewModeColumnName) &&
            Objects.equals(this.previewModeAcceptedValues, dialerContactlistConfigChangeContactList.previewModeAcceptedValues) &&
            Objects.equals(this.size, dialerContactlistConfigChangeContactList.size) &&
            Objects.equals(this.attemptLimits, dialerContactlistConfigChangeContactList.attemptLimits) &&
            Objects.equals(this.automaticTimeZoneMapping, dialerContactlistConfigChangeContactList.automaticTimeZoneMapping) &&
            Objects.equals(this.zipCodeColumnName, dialerContactlistConfigChangeContactList.zipCodeColumnName) &&
            Objects.equals(this.division, dialerContactlistConfigChangeContactList.division) &&
            Objects.equals(this.additionalProperties, dialerContactlistConfigChangeContactList.additionalProperties) &&
            Objects.equals(this.id, dialerContactlistConfigChangeContactList.id) &&
            Objects.equals(this.name, dialerContactlistConfigChangeContactList.name) &&
            Objects.equals(this.dateCreated, dialerContactlistConfigChangeContactList.dateCreated) &&
            Objects.equals(this.dateModified, dialerContactlistConfigChangeContactList.dateModified) &&
            Objects.equals(this.version, dialerContactlistConfigChangeContactList.version) &&
            Objects.equals(this.getAdditionalProperties, dialerContactlistConfigChangeContactList.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnNames, phoneColumns, emailColumns, importStatus, previewModeColumnName, previewModeAcceptedValues, size, attemptLimits, automaticTimeZoneMapping, zipCodeColumnName, division, additionalProperties, id, name, dateCreated, dateModified, version, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerContactlistConfigChangeContactList {\n");
    
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    phoneColumns: ").append(toIndentedString(phoneColumns)).append("\n");
    sb.append("    emailColumns: ").append(toIndentedString(emailColumns)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    previewModeColumnName: ").append(toIndentedString(previewModeColumnName)).append("\n");
    sb.append("    previewModeAcceptedValues: ").append(toIndentedString(previewModeAcceptedValues)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    attemptLimits: ").append(toIndentedString(attemptLimits)).append("\n");
    sb.append("    automaticTimeZoneMapping: ").append(toIndentedString(automaticTimeZoneMapping)).append("\n");
    sb.append("    zipCodeColumnName: ").append(toIndentedString(zipCodeColumnName)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    getAdditionalProperties: ").append(toIndentedString(getAdditionalProperties)).append("\n");
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

