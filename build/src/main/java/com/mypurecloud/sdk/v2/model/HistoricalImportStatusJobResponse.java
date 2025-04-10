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
import com.mypurecloud.sdk.v2.model.HistoricalImportStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * HistoricalImportStatusJobResponse
 */

public class HistoricalImportStatusJobResponse  implements Serializable {
  
  private String id = null;
  private HistoricalImportStatus importStatusResult = null;
  private String selfUri = null;

  public HistoricalImportStatusJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The job id for the import request")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The historical import status result of the import job
   **/
  public HistoricalImportStatusJobResponse importStatusResult(HistoricalImportStatus importStatusResult) {
    this.importStatusResult = importStatusResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The historical import status result of the import job")
  @JsonProperty("importStatusResult")
  public HistoricalImportStatus getImportStatusResult() {
    return importStatusResult;
  }
  public void setImportStatusResult(HistoricalImportStatus importStatusResult) {
    this.importStatusResult = importStatusResult;
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
    HistoricalImportStatusJobResponse historicalImportStatusJobResponse = (HistoricalImportStatusJobResponse) o;

    return Objects.equals(this.id, historicalImportStatusJobResponse.id) &&
            Objects.equals(this.importStatusResult, historicalImportStatusJobResponse.importStatusResult) &&
            Objects.equals(this.selfUri, historicalImportStatusJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importStatusResult, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalImportStatusJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importStatusResult: ").append(toIndentedString(importStatusResult)).append("\n");
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

