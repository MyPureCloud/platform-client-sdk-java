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
 * CreateDecisionTableImportJobRequest
 */

public class CreateDecisionTableImportJobRequest  implements Serializable {
  

  private static class ImportModeEnumDeserializer extends StdDeserializer<ImportModeEnum> {
    public ImportModeEnumDeserializer() {
      super(ImportModeEnumDeserializer.class);
    }

    @Override
    public ImportModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ImportModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How imported rows are merged with existing rows
   */
 @JsonDeserialize(using = ImportModeEnumDeserializer.class)
  public enum ImportModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPEND("Append"),
    REPLACE("Replace");

    private String value;

    ImportModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ImportModeEnum fromString(String key) {
      if (key == null) return null;

      for (ImportModeEnum value : ImportModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ImportModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ImportModeEnum importMode = null;
  private String fileName = null;

  public CreateDecisionTableImportJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CreateDecisionTableImportJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * How imported rows are merged with existing rows
   **/
  public CreateDecisionTableImportJobRequest importMode(ImportModeEnum importMode) {
    this.importMode = importMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "How imported rows are merged with existing rows")
  @JsonProperty("importMode")
  public ImportModeEnum getImportMode() {
    return importMode;
  }
  public void setImportMode(ImportModeEnum importMode) {
    this.importMode = importMode;
  }


  /**
   * Name of the file to import. Must include the file extension.
   **/
  public CreateDecisionTableImportJobRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the file to import. Must include the file extension.")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDecisionTableImportJobRequest createDecisionTableImportJobRequest = (CreateDecisionTableImportJobRequest) o;

    return Objects.equals(this.importMode, createDecisionTableImportJobRequest.importMode) &&
            Objects.equals(this.fileName, createDecisionTableImportJobRequest.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importMode, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDecisionTableImportJobRequest {\n");
    
    sb.append("    importMode: ").append(toIndentedString(importMode)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

