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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecisionTableExportJobRequest
 */

public class DecisionTableExportJobRequest  implements Serializable {
  
  private Integer tableVersion = null;

  private static class ExportTypeEnumDeserializer extends StdDeserializer<ExportTypeEnum> {
    public ExportTypeEnumDeserializer() {
      super(ExportTypeEnumDeserializer.class);
    }

    @Override
    public ExportTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExportTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of export to perform.
   */
 @JsonDeserialize(using = ExportTypeEnumDeserializer.class)
  public enum ExportTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEMPLATE("Template"),
    POPULATED("Populated");

    private String value;

    ExportTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExportTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ExportTypeEnum value : ExportTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExportTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExportTypeEnum exportType = null;

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
   * The format of the exported file.
   */
 @JsonDeserialize(using = FormatEnumDeserializer.class)
  public enum FormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CSV("Csv");

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

  public DecisionTableExportJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DecisionTableExportJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public DecisionTableExportJobRequest tableVersion(Integer tableVersion) {
    this.tableVersion = tableVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tableVersion")
  public Integer getTableVersion() {
    return tableVersion;
  }
  public void setTableVersion(Integer tableVersion) {
    this.tableVersion = tableVersion;
  }


  /**
   * The type of export to perform.
   **/
  public DecisionTableExportJobRequest exportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of export to perform.")
  @JsonProperty("exportType")
  public ExportTypeEnum getExportType() {
    return exportType;
  }
  public void setExportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
  }


  /**
   * The format of the exported file.
   **/
  public DecisionTableExportJobRequest format(FormatEnum format) {
    this.format = format;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The format of the exported file.")
  @JsonProperty("format")
  public FormatEnum getFormat() {
    return format;
  }
  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableExportJobRequest decisionTableExportJobRequest = (DecisionTableExportJobRequest) o;

    return Objects.equals(this.tableVersion, decisionTableExportJobRequest.tableVersion) &&
            Objects.equals(this.exportType, decisionTableExportJobRequest.exportType) &&
            Objects.equals(this.format, decisionTableExportJobRequest.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableVersion, exportType, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableExportJobRequest {\n");
    
    sb.append("    tableVersion: ").append(toIndentedString(tableVersion)).append("\n");
    sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

