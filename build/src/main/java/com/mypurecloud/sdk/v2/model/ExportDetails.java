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
import com.mypurecloud.sdk.v2.model.ArchitectFlowReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ExportDetails
 */

public class ExportDetails  implements Serializable {
  
  private ArchitectFlowReference flow = null;
  private String fileName = null;

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
   * The export type for the flow. Default: 'Yaml'.
   */
 @JsonDeserialize(using = ExportTypeEnumDeserializer.class)
  public enum ExportTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ARCHITECT("Architect"),
    YAML("Yaml");

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

  public ExportDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The flow to export. If you do not provide the flow ID, you must provide both the name and type.
   **/
  public ExportDetails flow(ArchitectFlowReference flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flow to export. If you do not provide the flow ID, you must provide both the name and type.")
  @JsonProperty("flow")
  public ArchitectFlowReference getFlow() {
    return flow;
  }
  public void setFlow(ArchitectFlowReference flow) {
    this.flow = flow;
  }


  /**
   * Name to assign to the file after download. The extension will be automatically appended based on desired export type. Must contain only alphanumeric characters, underscores, or hyphens.
   **/
  public ExportDetails fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name to assign to the file after download. The extension will be automatically appended based on desired export type. Must contain only alphanumeric characters, underscores, or hyphens.")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * The export type for the flow. Default: 'Yaml'.
   **/
  public ExportDetails exportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The export type for the flow. Default: 'Yaml'.")
  @JsonProperty("exportType")
  public ExportTypeEnum getExportType() {
    return exportType;
  }
  public void setExportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportDetails exportDetails = (ExportDetails) o;

    return Objects.equals(this.flow, exportDetails.flow) &&
            Objects.equals(this.fileName, exportDetails.fileName) &&
            Objects.equals(this.exportType, exportDetails.exportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, fileName, exportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportDetails {\n");
    
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
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

