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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.SplittingInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ImportTemplate
 */

public class ImportTemplate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DomainEntityRef contactListTemplate = null;
  private DomainEntityRef contactListFilter = null;
  private Boolean useSplittingCriteria = null;
  private SplittingInformation splittingInformation = null;

  private static class ListNameFormatEnumDeserializer extends StdDeserializer<ListNameFormatEnum> {
    public ListNameFormatEnumDeserializer() {
      super(ListNameFormatEnumDeserializer.class);
    }

    @Override
    public ListNameFormatEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ListNameFormatEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The list name format for target ContactLists. When Custom is provided, customListNameFormatValue is required.
   */
 @JsonDeserialize(using = ListNameFormatEnumDeserializer.class)
  public enum ListNameFormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LISTNAMEPREFIX("ListNamePrefix"),
    LISTNAMEPREFIXMONTHDAYYEAR("ListNamePrefixMonthDayYear"),
    LISTNAMEPREFIXMONTHDAYYEARHOURMINUTESECOND("ListNamePrefixMonthDayYearHourMinuteSecond"),
    LISTNAMEPREFIXPART("ListNamePrefixPart"),
    LISTNAMEPREFIXMONTHDAYYEARPART("ListNamePrefixMonthDayYearPart"),
    LISTNAMEPREFIXMONTHDAYYEARHOURMINUTESECONDPART("ListNamePrefixMonthDayYearHourMinuteSecondPart"),
    CUSTOM("Custom");

    private String value;

    ListNameFormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ListNameFormatEnum fromString(String key) {
      if (key == null) return null;

      for (ListNameFormatEnum value : ListNameFormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ListNameFormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ListNameFormatEnum listNameFormat = null;
  private String customListNameFormatValue = null;
  private ImportStatus importStatus = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the import template.
   **/
  public ImportTemplate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the import template.")
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
  public ImportTemplate version(Integer version) {
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
   * ContactListTemplate for this ImportTemplate.
   **/
  public ImportTemplate contactListTemplate(DomainEntityRef contactListTemplate) {
    this.contactListTemplate = contactListTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ContactListTemplate for this ImportTemplate.")
  @JsonProperty("contactListTemplate")
  public DomainEntityRef getContactListTemplate() {
    return contactListTemplate;
  }
  public void setContactListTemplate(DomainEntityRef contactListTemplate) {
    this.contactListTemplate = contactListTemplate;
  }


  /**
   * ContactListFilter for this ImportTemplate.
   **/
  public ImportTemplate contactListFilter(DomainEntityRef contactListFilter) {
    this.contactListFilter = contactListFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ContactListFilter for this ImportTemplate.")
  @JsonProperty("contactListFilter")
  public DomainEntityRef getContactListFilter() {
    return contactListFilter;
  }
  public void setContactListFilter(DomainEntityRef contactListFilter) {
    this.contactListFilter = contactListFilter;
  }


  /**
   * Whether or not to use splitting criteria. Default is false.
   **/
  public ImportTemplate useSplittingCriteria(Boolean useSplittingCriteria) {
    this.useSplittingCriteria = useSplittingCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to use splitting criteria. Default is false.")
  @JsonProperty("useSplittingCriteria")
  public Boolean getUseSplittingCriteria() {
    return useSplittingCriteria;
  }
  public void setUseSplittingCriteria(Boolean useSplittingCriteria) {
    this.useSplittingCriteria = useSplittingCriteria;
  }


  /**
   * How to split contact records, required if useSplittingCriteria is true.
   **/
  public ImportTemplate splittingInformation(SplittingInformation splittingInformation) {
    this.splittingInformation = splittingInformation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to split contact records, required if useSplittingCriteria is true.")
  @JsonProperty("splittingInformation")
  public SplittingInformation getSplittingInformation() {
    return splittingInformation;
  }
  public void setSplittingInformation(SplittingInformation splittingInformation) {
    this.splittingInformation = splittingInformation;
  }


  /**
   * The list name format for target ContactLists. When Custom is provided, customListNameFormatValue is required.
   **/
  public ImportTemplate listNameFormat(ListNameFormatEnum listNameFormat) {
    this.listNameFormat = listNameFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list name format for target ContactLists. When Custom is provided, customListNameFormatValue is required.")
  @JsonProperty("listNameFormat")
  public ListNameFormatEnum getListNameFormat() {
    return listNameFormat;
  }
  public void setListNameFormat(ListNameFormatEnum listNameFormat) {
    this.listNameFormat = listNameFormat;
  }


  /**
   * Custom value for the list name format, at least %N is required. Any character other than the specified tokens will be used as is. Available tokens: %N: ListNamePrefix; %P: Part number; %F: Filter name; %C: Column value; YYYY: year; MM: month; DD: day; hh: hour; mm: minute; ss: second.
   **/
  public ImportTemplate customListNameFormatValue(String customListNameFormatValue) {
    this.customListNameFormatValue = customListNameFormatValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom value for the list name format, at least %N is required. Any character other than the specified tokens will be used as is. Available tokens: %N: ListNamePrefix; %P: Part number; %F: Filter name; %C: Column value; YYYY: year; MM: month; DD: day; hh: hour; mm: minute; ss: second.")
  @JsonProperty("customListNameFormatValue")
  public String getCustomListNameFormatValue() {
    return customListNameFormatValue;
  }
  public void setCustomListNameFormatValue(String customListNameFormatValue) {
    this.customListNameFormatValue = customListNameFormatValue;
  }


  @ApiModelProperty(example = "null", value = "The status of the import process.")
  @JsonProperty("importStatus")
  public ImportStatus getImportStatus() {
    return importStatus;
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
    ImportTemplate importTemplate = (ImportTemplate) o;

    return Objects.equals(this.id, importTemplate.id) &&
            Objects.equals(this.name, importTemplate.name) &&
            Objects.equals(this.dateCreated, importTemplate.dateCreated) &&
            Objects.equals(this.dateModified, importTemplate.dateModified) &&
            Objects.equals(this.version, importTemplate.version) &&
            Objects.equals(this.contactListTemplate, importTemplate.contactListTemplate) &&
            Objects.equals(this.contactListFilter, importTemplate.contactListFilter) &&
            Objects.equals(this.useSplittingCriteria, importTemplate.useSplittingCriteria) &&
            Objects.equals(this.splittingInformation, importTemplate.splittingInformation) &&
            Objects.equals(this.listNameFormat, importTemplate.listNameFormat) &&
            Objects.equals(this.customListNameFormatValue, importTemplate.customListNameFormatValue) &&
            Objects.equals(this.importStatus, importTemplate.importStatus) &&
            Objects.equals(this.selfUri, importTemplate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactListTemplate, contactListFilter, useSplittingCriteria, splittingInformation, listNameFormat, customListNameFormatValue, importStatus, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    contactListTemplate: ").append(toIndentedString(contactListTemplate)).append("\n");
    sb.append("    contactListFilter: ").append(toIndentedString(contactListFilter)).append("\n");
    sb.append("    useSplittingCriteria: ").append(toIndentedString(useSplittingCriteria)).append("\n");
    sb.append("    splittingInformation: ").append(toIndentedString(splittingInformation)).append("\n");
    sb.append("    listNameFormat: ").append(toIndentedString(listNameFormat)).append("\n");
    sb.append("    customListNameFormatValue: ").append(toIndentedString(customListNameFormatValue)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
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

