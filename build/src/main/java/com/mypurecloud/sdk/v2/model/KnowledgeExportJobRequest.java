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
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeExportJobRequest
 */

public class KnowledgeExportJobRequest  implements Serializable {
  
  private KnowledgeExportJobFilter exportFilter = null;

  
  /**
   * What to export.
   **/
  public KnowledgeExportJobRequest exportFilter(KnowledgeExportJobFilter exportFilter) {
    this.exportFilter = exportFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "What to export.")
  @JsonProperty("exportFilter")
  public KnowledgeExportJobFilter getExportFilter() {
    return exportFilter;
  }
  public void setExportFilter(KnowledgeExportJobFilter exportFilter) {
    this.exportFilter = exportFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeExportJobRequest knowledgeExportJobRequest = (KnowledgeExportJobRequest) o;

    return Objects.equals(this.exportFilter, knowledgeExportJobRequest.exportFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeExportJobRequest {\n");
    
    sb.append("    exportFilter: ").append(toIndentedString(exportFilter)).append("\n");
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

