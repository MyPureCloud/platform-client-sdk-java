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
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobDocumentsFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

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

  private static class ExcludeEnumDeserializer extends StdDeserializer<ExcludeEnum> {
    public ExcludeEnumDeserializer() {
      super(ExcludeEnumDeserializer.class);
    }

    @Override
    public ExcludeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExcludeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets exclude
   */
 @JsonDeserialize(using = ExcludeEnumDeserializer.class)
  public enum ExcludeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CATEGORIES("Categories"),
    LABELS("Labels"),
    VARIATIONS("Variations");

    private String value;

    ExcludeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExcludeEnum fromString(String key) {
      if (key == null) return null;

      for (ExcludeEnum value : ExcludeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExcludeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ExcludeEnum> exclude = null;

  public KnowledgeExportJobFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      exclude = new ArrayList<ExcludeEnum>();
    }
  }

  
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


  /**
   * Reduce the size of the export file by excluding certain items.
   **/
  public KnowledgeExportJobFilter exclude(List<ExcludeEnum> exclude) {
    this.exclude = exclude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reduce the size of the export file by excluding certain items.")
  @JsonProperty("exclude")
  public List<ExcludeEnum> getExclude() {
    return exclude;
  }
  public void setExclude(List<ExcludeEnum> exclude) {
    this.exclude = exclude;
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
            Objects.equals(this.versionFilter, knowledgeExportJobFilter.versionFilter) &&
            Objects.equals(this.exclude, knowledgeExportJobFilter.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentsFilter, versionFilter, exclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeExportJobFilter {\n");
    
    sb.append("    documentsFilter: ").append(toIndentedString(documentsFilter)).append("\n");
    sb.append("    versionFilter: ").append(toIndentedString(versionFilter)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

