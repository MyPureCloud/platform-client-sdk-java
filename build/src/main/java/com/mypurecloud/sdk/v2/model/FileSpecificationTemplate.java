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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Column;
import com.mypurecloud.sdk.v2.model.PreprocessingRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * FileSpecificationTemplate
 */

public class FileSpecificationTemplate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private String description = null;

  private static class FormatEnumDeserializer extends StdDeserializer<FormatEnum> {
    public FormatEnumDeserializer() {
      super(FormatEnumDeserializer.class);
    }

    @Override
    public FormatEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FormatEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * File format
   */
 @JsonDeserialize(using = FormatEnumDeserializer.class)
  public enum FormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FIXEDLENGTH("FixedLength"),
    DELIMITED("Delimited");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FormatEnum fromString(String key) {
      if (key == null) return null;

      for (FormatEnum value : FormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FormatEnum format = null;
  private Integer numberOfHeadingLinesSkipped = null;
  private Integer numberOfTrailingLinesSkipped = null;
  private Boolean header = null;

  private static class DelimiterEnumDeserializer extends StdDeserializer<DelimiterEnum> {
    public DelimiterEnumDeserializer() {
      super(DelimiterEnumDeserializer.class);
    }

    @Override
    public DelimiterEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DelimiterEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Kind of delimiter
   */
 @JsonDeserialize(using = DelimiterEnumDeserializer.class)
  public enum DelimiterEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMMA("Comma"),
    PIPE("Pipe"),
    COLON("Colon"),
    TAB("Tab"),
    SEMICOLON("Semicolon"),
    CUSTOM("Custom");

    private String value;

    DelimiterEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DelimiterEnum fromString(String key) {
      if (key == null) return null;

      for (DelimiterEnum value : DelimiterEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DelimiterEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DelimiterEnum delimiter = null;
  private String delimiterValue = null;
  private List<Column> columnInformation = null;
  private List<PreprocessingRule> preprocessingRules = null;
  private String selfUri = null;

  public FileSpecificationTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      columnInformation = new ArrayList<Column>();
      preprocessingRules = new ArrayList<PreprocessingRule>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the File Specification template.
   **/
  public FileSpecificationTemplate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the File Specification template.")
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
  public FileSpecificationTemplate version(Integer version) {
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
   * Description of the file specification template
   **/
  public FileSpecificationTemplate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the file specification template")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * File format
   **/
  public FileSpecificationTemplate format(FormatEnum format) {
    this.format = format;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File format")
  @JsonProperty("format")
  public FormatEnum getFormat() {
    return format;
  }
  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  /**
   * Number of heading lines to be skipped
   **/
  public FileSpecificationTemplate numberOfHeadingLinesSkipped(Integer numberOfHeadingLinesSkipped) {
    this.numberOfHeadingLinesSkipped = numberOfHeadingLinesSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of heading lines to be skipped")
  @JsonProperty("numberOfHeadingLinesSkipped")
  public Integer getNumberOfHeadingLinesSkipped() {
    return numberOfHeadingLinesSkipped;
  }
  public void setNumberOfHeadingLinesSkipped(Integer numberOfHeadingLinesSkipped) {
    this.numberOfHeadingLinesSkipped = numberOfHeadingLinesSkipped;
  }


  /**
   * Number of trailing lines to be skipped
   **/
  public FileSpecificationTemplate numberOfTrailingLinesSkipped(Integer numberOfTrailingLinesSkipped) {
    this.numberOfTrailingLinesSkipped = numberOfTrailingLinesSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of trailing lines to be skipped")
  @JsonProperty("numberOfTrailingLinesSkipped")
  public Integer getNumberOfTrailingLinesSkipped() {
    return numberOfTrailingLinesSkipped;
  }
  public void setNumberOfTrailingLinesSkipped(Integer numberOfTrailingLinesSkipped) {
    this.numberOfTrailingLinesSkipped = numberOfTrailingLinesSkipped;
  }


  /**
   * If true indicates that delimited file has a header row, which can provide column names
   **/
  public FileSpecificationTemplate header(Boolean header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true indicates that delimited file has a header row, which can provide column names")
  @JsonProperty("header")
  public Boolean getHeader() {
    return header;
  }
  public void setHeader(Boolean header) {
    this.header = header;
  }


  /**
   * Kind of delimiter
   **/
  public FileSpecificationTemplate delimiter(DelimiterEnum delimiter) {
    this.delimiter = delimiter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Kind of delimiter")
  @JsonProperty("delimiter")
  public DelimiterEnum getDelimiter() {
    return delimiter;
  }
  public void setDelimiter(DelimiterEnum delimiter) {
    this.delimiter = delimiter;
  }


  /**
   * Delimiter character, used only when delimiter=\"Custom\"
   **/
  public FileSpecificationTemplate delimiterValue(String delimiterValue) {
    this.delimiterValue = delimiterValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Delimiter character, used only when delimiter=\"Custom\"")
  @JsonProperty("delimiterValue")
  public String getDelimiterValue() {
    return delimiterValue;
  }
  public void setDelimiterValue(String delimiterValue) {
    this.delimiterValue = delimiterValue;
  }


  /**
   * Columns specification
   **/
  public FileSpecificationTemplate columnInformation(List<Column> columnInformation) {
    this.columnInformation = columnInformation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Columns specification")
  @JsonProperty("columnInformation")
  public List<Column> getColumnInformation() {
    return columnInformation;
  }
  public void setColumnInformation(List<Column> columnInformation) {
    this.columnInformation = columnInformation;
  }


  /**
   * Preprocessing rules
   **/
  public FileSpecificationTemplate preprocessingRules(List<PreprocessingRule> preprocessingRules) {
    this.preprocessingRules = preprocessingRules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Preprocessing rules")
  @JsonProperty("preprocessingRules")
  public List<PreprocessingRule> getPreprocessingRules() {
    return preprocessingRules;
  }
  public void setPreprocessingRules(List<PreprocessingRule> preprocessingRules) {
    this.preprocessingRules = preprocessingRules;
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
    FileSpecificationTemplate fileSpecificationTemplate = (FileSpecificationTemplate) o;

    return Objects.equals(this.id, fileSpecificationTemplate.id) &&
            Objects.equals(this.name, fileSpecificationTemplate.name) &&
            Objects.equals(this.dateCreated, fileSpecificationTemplate.dateCreated) &&
            Objects.equals(this.dateModified, fileSpecificationTemplate.dateModified) &&
            Objects.equals(this.version, fileSpecificationTemplate.version) &&
            Objects.equals(this.description, fileSpecificationTemplate.description) &&
            Objects.equals(this.format, fileSpecificationTemplate.format) &&
            Objects.equals(this.numberOfHeadingLinesSkipped, fileSpecificationTemplate.numberOfHeadingLinesSkipped) &&
            Objects.equals(this.numberOfTrailingLinesSkipped, fileSpecificationTemplate.numberOfTrailingLinesSkipped) &&
            Objects.equals(this.header, fileSpecificationTemplate.header) &&
            Objects.equals(this.delimiter, fileSpecificationTemplate.delimiter) &&
            Objects.equals(this.delimiterValue, fileSpecificationTemplate.delimiterValue) &&
            Objects.equals(this.columnInformation, fileSpecificationTemplate.columnInformation) &&
            Objects.equals(this.preprocessingRules, fileSpecificationTemplate.preprocessingRules) &&
            Objects.equals(this.selfUri, fileSpecificationTemplate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, description, format, numberOfHeadingLinesSkipped, numberOfTrailingLinesSkipped, header, delimiter, delimiterValue, columnInformation, preprocessingRules, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSpecificationTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    numberOfHeadingLinesSkipped: ").append(toIndentedString(numberOfHeadingLinesSkipped)).append("\n");
    sb.append("    numberOfTrailingLinesSkipped: ").append(toIndentedString(numberOfTrailingLinesSkipped)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    delimiterValue: ").append(toIndentedString(delimiterValue)).append("\n");
    sb.append("    columnInformation: ").append(toIndentedString(columnInformation)).append("\n");
    sb.append("    preprocessingRules: ").append(toIndentedString(preprocessingRules)).append("\n");
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

