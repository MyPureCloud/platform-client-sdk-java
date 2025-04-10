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
import com.mypurecloud.sdk.v2.model.KnowledgeParseRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeParseJobRequestImport
 */

public class KnowledgeParseJobRequestImport  implements Serializable {
  
  private List<KnowledgeParseRecord> edits = null;
  private List<String> excludes = null;

  public KnowledgeParseJobRequestImport() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      edits = new ArrayList<KnowledgeParseRecord>();
      excludes = new ArrayList<String>();
    }
  }

  
  /**
   * Override of the result of the parse.
   **/
  public KnowledgeParseJobRequestImport edits(List<KnowledgeParseRecord> edits) {
    this.edits = edits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Override of the result of the parse.")
  @JsonProperty("edits")
  public List<KnowledgeParseRecord> getEdits() {
    return edits;
  }
  public void setEdits(List<KnowledgeParseRecord> edits) {
    this.edits = edits;
  }


  /**
   * Excluded results.
   **/
  public KnowledgeParseJobRequestImport excludes(List<String> excludes) {
    this.excludes = excludes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Excluded results.")
  @JsonProperty("excludes")
  public List<String> getExcludes() {
    return excludes;
  }
  public void setExcludes(List<String> excludes) {
    this.excludes = excludes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeParseJobRequestImport knowledgeParseJobRequestImport = (KnowledgeParseJobRequestImport) o;

    return Objects.equals(this.edits, knowledgeParseJobRequestImport.edits) &&
            Objects.equals(this.excludes, knowledgeParseJobRequestImport.excludes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edits, excludes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeParseJobRequestImport {\n");
    
    sb.append("    edits: ").append(toIndentedString(edits)).append("\n");
    sb.append("    excludes: ").append(toIndentedString(excludes)).append("\n");
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

