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
import java.util.Date;

import java.io.Serializable;
/**
 * ExportUri
 */

public class ExportUri  implements Serializable {
  
  private String uri = null;
  private Date exportTimestamp = null;

  
  /**
   **/
  public ExportUri uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExportUri exportTimestamp(Date exportTimestamp) {
    this.exportTimestamp = exportTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("exportTimestamp")
  public Date getExportTimestamp() {
    return exportTimestamp;
  }
  public void setExportTimestamp(Date exportTimestamp) {
    this.exportTimestamp = exportTimestamp;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportUri exportUri = (ExportUri) o;
    return Objects.equals(this.uri, exportUri.uri) &&
        Objects.equals(this.exportTimestamp, exportUri.exportTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, exportTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportUri {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    exportTimestamp: ").append(toIndentedString(exportTimestamp)).append("\n");
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

