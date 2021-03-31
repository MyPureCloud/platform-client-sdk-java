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
import com.mypurecloud.sdk.v2.model.DialerContactlistConfigChangeContactPhoneNumberColumn;
import com.mypurecloud.sdk.v2.model.DialerContactlistConfigChangeEmailColumn;
import com.mypurecloud.sdk.v2.model.DialerContactlistConfigChangeImportStatus;
import com.mypurecloud.sdk.v2.model.DialerContactlistConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DialerContactlistConfigChangeContactList
 */

public class DialerContactlistConfigChangeContactList  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<String> columnNames = new ArrayList<String>();
  private List<DialerContactlistConfigChangeContactPhoneNumberColumn> phoneColumns = new ArrayList<DialerContactlistConfigChangeContactPhoneNumberColumn>();
  private List<DialerContactlistConfigChangeEmailColumn> emailColumns = new ArrayList<DialerContactlistConfigChangeEmailColumn>();
  private DialerContactlistConfigChangeImportStatus importStatus = null;
  private String previewModeColumnName = null;
  private List<String> previewModeAcceptedValues = new ArrayList<String>();
  private Integer size = null;
  private DialerContactlistConfigChangeUriReference attemptLimits = null;
  private Boolean automaticTimeZoneMapping = null;
  private String zipCodeColumnName = null;
  private DialerContactlistConfigChangeUriReference division = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerContactlistConfigChangeContactList id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList name(String name) {
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
   **/
  public DialerContactlistConfigChangeContactList dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("columnNames")
  public List<String> getColumnNames() {
    return columnNames;
  }
  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList phoneColumns(List<DialerContactlistConfigChangeContactPhoneNumberColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneColumns")
  public List<DialerContactlistConfigChangeContactPhoneNumberColumn> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<DialerContactlistConfigChangeContactPhoneNumberColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList emailColumns(List<DialerContactlistConfigChangeEmailColumn> emailColumns) {
    this.emailColumns = emailColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
   **/
  public DialerContactlistConfigChangeContactList previewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previewModeColumnName")
  public String getPreviewModeColumnName() {
    return previewModeColumnName;
  }
  public void setPreviewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList previewModeAcceptedValues(List<String> previewModeAcceptedValues) {
    this.previewModeAcceptedValues = previewModeAcceptedValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previewModeAcceptedValues")
  public List<String> getPreviewModeAcceptedValues() {
    return previewModeAcceptedValues;
  }
  public void setPreviewModeAcceptedValues(List<String> previewModeAcceptedValues) {
    this.previewModeAcceptedValues = previewModeAcceptedValues;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
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
   **/
  public DialerContactlistConfigChangeContactList automaticTimeZoneMapping(Boolean automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("automaticTimeZoneMapping")
  public Boolean getAutomaticTimeZoneMapping() {
    return automaticTimeZoneMapping;
  }
  public void setAutomaticTimeZoneMapping(Boolean automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList zipCodeColumnName(String zipCodeColumnName) {
    this.zipCodeColumnName = zipCodeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zipCodeColumnName")
  public String getZipCodeColumnName() {
    return zipCodeColumnName;
  }
  public void setZipCodeColumnName(String zipCodeColumnName) {
    this.zipCodeColumnName = zipCodeColumnName;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList division(DialerContactlistConfigChangeUriReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public DialerContactlistConfigChangeUriReference getDivision() {
    return division;
  }
  public void setDivision(DialerContactlistConfigChangeUriReference division) {
    this.division = division;
  }

  
  /**
   **/
  public DialerContactlistConfigChangeContactList additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
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
    return Objects.equals(this.id, dialerContactlistConfigChangeContactList.id) &&
        Objects.equals(this.name, dialerContactlistConfigChangeContactList.name) &&
        Objects.equals(this.dateCreated, dialerContactlistConfigChangeContactList.dateCreated) &&
        Objects.equals(this.dateModified, dialerContactlistConfigChangeContactList.dateModified) &&
        Objects.equals(this.version, dialerContactlistConfigChangeContactList.version) &&
        Objects.equals(this.columnNames, dialerContactlistConfigChangeContactList.columnNames) &&
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
        Objects.equals(this.additionalProperties, dialerContactlistConfigChangeContactList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, columnNames, phoneColumns, emailColumns, importStatus, previewModeColumnName, previewModeAcceptedValues, size, attemptLimits, automaticTimeZoneMapping, zipCodeColumnName, division, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerContactlistConfigChangeContactList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

