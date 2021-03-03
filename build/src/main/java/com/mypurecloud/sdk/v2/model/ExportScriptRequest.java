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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Creating an exported script via Download Service
 */
@ApiModel(description = "Creating an exported script via Download Service")

public class ExportScriptRequest  implements Serializable {
  
  private String fileName = null;
  private String versionId = null;

  
  /**
   * The final file name (no extension) of the script download: <fileName>.script
   **/
  public ExportScriptRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The final file name (no extension) of the script download: <fileName>.script")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   * The UUID version of the script to be exported.  Defaults to the current editable version.
   **/
  public ExportScriptRequest versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UUID version of the script to be exported.  Defaults to the current editable version.")
  @JsonProperty("versionId")
  public String getVersionId() {
    return versionId;
  }
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportScriptRequest exportScriptRequest = (ExportScriptRequest) o;
    return Objects.equals(this.fileName, exportScriptRequest.fileName) &&
        Objects.equals(this.versionId, exportScriptRequest.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportScriptRequest {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

