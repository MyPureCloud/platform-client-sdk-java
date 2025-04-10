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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DnclistDownloadReadyExportUri
 */

public class DnclistDownloadReadyExportUri  implements Serializable {
  
  private String uri = null;
  private String exportTimestamp = null;
  private Map<String, Object> additionalProperties = null;

  public DnclistDownloadReadyExportUri() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public DnclistDownloadReadyExportUri uri(String uri) {
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
   **/
  public DnclistDownloadReadyExportUri exportTimestamp(String exportTimestamp) {
    this.exportTimestamp = exportTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exportTimestamp")
  public String getExportTimestamp() {
    return exportTimestamp;
  }
  public void setExportTimestamp(String exportTimestamp) {
    this.exportTimestamp = exportTimestamp;
  }


  /**
   **/
  public DnclistDownloadReadyExportUri additionalProperties(Map<String, Object> additionalProperties) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnclistDownloadReadyExportUri dnclistDownloadReadyExportUri = (DnclistDownloadReadyExportUri) o;

    return Objects.equals(this.uri, dnclistDownloadReadyExportUri.uri) &&
            Objects.equals(this.exportTimestamp, dnclistDownloadReadyExportUri.exportTimestamp) &&
            Objects.equals(this.additionalProperties, dnclistDownloadReadyExportUri.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, exportTimestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnclistDownloadReadyExportUri {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    exportTimestamp: ").append(toIndentedString(exportTimestamp)).append("\n");
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

