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
import com.mypurecloud.sdk.v2.model.DocumentQuery;
import com.mypurecloud.sdk.v2.model.DocumentQueryInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeDocumentQuery
 */

public class KnowledgeDocumentQuery  implements Serializable {
  
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Boolean includeDraftDocuments = null;
  private DocumentQueryInterval interval = null;
  private DocumentQuery filter = null;

  private static class IncludeVariationsEnumDeserializer extends StdDeserializer<IncludeVariationsEnum> {
    public IncludeVariationsEnumDeserializer() {
      super(IncludeVariationsEnumDeserializer.class);
    }

    @Override
    public IncludeVariationsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return IncludeVariationsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates which document variations to include in returned documents. All: all variations regardless of the filter expression; AllMatching: all variations that match the filter expression; SingleMostRelevant: single variation that matches the filter expression and has the highest priority. The default is All.
   */
 @JsonDeserialize(using = IncludeVariationsEnumDeserializer.class)
  public enum IncludeVariationsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL("All"),
    ALLMATCHING("AllMatching"),
    SINGLEMOSTRELEVANT("SingleMostRelevant");

    private String value;

    IncludeVariationsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IncludeVariationsEnum fromString(String key) {
      if (key == null) return null;

      for (IncludeVariationsEnum value : IncludeVariationsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IncludeVariationsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IncludeVariationsEnum includeVariations = null;

  private static class SortOrderEnumDeserializer extends StdDeserializer<SortOrderEnum> {
    public SortOrderEnumDeserializer() {
      super(SortOrderEnumDeserializer.class);
    }

    @Override
    public SortOrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortOrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The sort order for results.
   */
 @JsonDeserialize(using = SortOrderEnumDeserializer.class)
  public enum SortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("Asc"),
    DESC("Desc");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (SortOrderEnum value : SortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortOrderEnum sortOrder = null;

  private static class SortByEnumDeserializer extends StdDeserializer<SortByEnum> {
    public SortByEnumDeserializer() {
      super(SortByEnumDeserializer.class);
    }

    @Override
    public SortByEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortByEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The field in the documents that you want to sort the results by.
   */
 @JsonDeserialize(using = SortByEnumDeserializer.class)
  public enum SortByEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DATECREATED("DateCreated"),
    DATEMODIFIED("DateModified"),
    CATEGORYNAME("CategoryName"),
    LABELNAME("LabelName"),
    VIEWCOUNT("ViewCount");

    private String value;

    SortByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortByEnum fromString(String key) {
      if (key == null) return null;

      for (SortByEnum value : SortByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortByEnum sortBy = null;

  
  /**
   * Page size of the returned results.
   **/
  public KnowledgeDocumentQuery pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page size of the returned results.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * Page number of the returned results.
   **/
  public KnowledgeDocumentQuery pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page number of the returned results.")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * Indicates whether the results would also include draft documents.
   **/
  public KnowledgeDocumentQuery includeDraftDocuments(Boolean includeDraftDocuments) {
    this.includeDraftDocuments = includeDraftDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the results would also include draft documents.")
  @JsonProperty("includeDraftDocuments")
  public Boolean getIncludeDraftDocuments() {
    return includeDraftDocuments;
  }
  public void setIncludeDraftDocuments(Boolean includeDraftDocuments) {
    this.includeDraftDocuments = includeDraftDocuments;
  }


  /**
   * Retrieves the documents created/modified/published in specified date and time range.
   **/
  public KnowledgeDocumentQuery interval(DocumentQueryInterval interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retrieves the documents created/modified/published in specified date and time range.")
  @JsonProperty("interval")
  public DocumentQueryInterval getInterval() {
    return interval;
  }
  public void setInterval(DocumentQueryInterval interval) {
    this.interval = interval;
  }


  /**
   * Filter for the document query.
   **/
  public KnowledgeDocumentQuery filter(DocumentQuery filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Filter for the document query.")
  @JsonProperty("filter")
  public DocumentQuery getFilter() {
    return filter;
  }
  public void setFilter(DocumentQuery filter) {
    this.filter = filter;
  }


  /**
   * Indicates which document variations to include in returned documents. All: all variations regardless of the filter expression; AllMatching: all variations that match the filter expression; SingleMostRelevant: single variation that matches the filter expression and has the highest priority. The default is All.
   **/
  public KnowledgeDocumentQuery includeVariations(IncludeVariationsEnum includeVariations) {
    this.includeVariations = includeVariations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates which document variations to include in returned documents. All: all variations regardless of the filter expression; AllMatching: all variations that match the filter expression; SingleMostRelevant: single variation that matches the filter expression and has the highest priority. The default is All.")
  @JsonProperty("includeVariations")
  public IncludeVariationsEnum getIncludeVariations() {
    return includeVariations;
  }
  public void setIncludeVariations(IncludeVariationsEnum includeVariations) {
    this.includeVariations = includeVariations;
  }


  /**
   * The sort order for results.
   **/
  public KnowledgeDocumentQuery sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sort order for results.")
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  /**
   * The field in the documents that you want to sort the results by.
   **/
  public KnowledgeDocumentQuery sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field in the documents that you want to sort the results by.")
  @JsonProperty("sortBy")
  public SortByEnum getSortBy() {
    return sortBy;
  }
  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentQuery knowledgeDocumentQuery = (KnowledgeDocumentQuery) o;

    return Objects.equals(this.pageSize, knowledgeDocumentQuery.pageSize) &&
            Objects.equals(this.pageNumber, knowledgeDocumentQuery.pageNumber) &&
            Objects.equals(this.includeDraftDocuments, knowledgeDocumentQuery.includeDraftDocuments) &&
            Objects.equals(this.interval, knowledgeDocumentQuery.interval) &&
            Objects.equals(this.filter, knowledgeDocumentQuery.filter) &&
            Objects.equals(this.includeVariations, knowledgeDocumentQuery.includeVariations) &&
            Objects.equals(this.sortOrder, knowledgeDocumentQuery.sortOrder) &&
            Objects.equals(this.sortBy, knowledgeDocumentQuery.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, includeDraftDocuments, interval, filter, includeVariations, sortOrder, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentQuery {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    includeDraftDocuments: ").append(toIndentedString(includeDraftDocuments)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeVariations: ").append(toIndentedString(includeVariations)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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

