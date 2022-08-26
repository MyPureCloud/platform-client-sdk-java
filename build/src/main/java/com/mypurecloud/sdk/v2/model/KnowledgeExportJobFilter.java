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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobDocumentsFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeExportJobFilter
 */

public class KnowledgeExportJobFilter  implements Serializable {
  
  private KnowledgeExportJobDocumentsFilter documentsFilter = null;

  private static class VersionFilterEnumDeserializer extends StdDeserializer<VersionFilterEnum> {
    public VersionFilterEnumDeserializer() {
      super(VersionFilterEnumDeserializer.class);
    }

    @Override
    public VersionFilterEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VersionFilterEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specifies what version should be exported.
   */
 @JsonDeserialize(using = VersionFilterEnumDeserializer.class)
  public enum VersionFilterEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL("All"),
    LATEST("Latest");

    private String value;

    VersionFilterEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VersionFilterEnum fromString(String key) {
      if (key == null) return null;

      for (VersionFilterEnum value : VersionFilterEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VersionFilterEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VersionFilterEnum versionFilter = null;

  
  /**
   * Filters for narrowing down which documents to export.
   **/
  public KnowledgeExportJobFilter documentsFilter(KnowledgeExportJobDocumentsFilter documentsFilter) {
    this.documentsFilter = documentsFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters for narrowing down which documents to export.")
  @JsonProperty("documentsFilter")
  public KnowledgeExportJobDocumentsFilter getDocumentsFilter() {
    return documentsFilter;
  }
  public void setDocumentsFilter(KnowledgeExportJobDocumentsFilter documentsFilter) {
    this.documentsFilter = documentsFilter;
  }


  /**
   * Specifies what version should be exported.
   **/
  public KnowledgeExportJobFilter versionFilter(VersionFilterEnum versionFilter) {
    this.versionFilter = versionFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies what version should be exported.")
  @JsonProperty("versionFilter")
  public VersionFilterEnum getVersionFilter() {
    return versionFilter;
  }
  public void setVersionFilter(VersionFilterEnum versionFilter) {
    this.versionFilter = versionFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeExportJobFilter knowledgeExportJobFilter = (KnowledgeExportJobFilter) o;

    return Objects.equals(this.documentsFilter, knowledgeExportJobFilter.documentsFilter) &&
            Objects.equals(this.versionFilter, knowledgeExportJobFilter.versionFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentsFilter, versionFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeExportJobFilter {\n");
    
    sb.append("    documentsFilter: ").append(toIndentedString(documentsFilter)).append("\n");
    sb.append("    versionFilter: ").append(toIndentedString(versionFilter)).append("\n");
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

