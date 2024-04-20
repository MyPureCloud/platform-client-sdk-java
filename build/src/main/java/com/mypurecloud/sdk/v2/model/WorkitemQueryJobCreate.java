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
import com.mypurecloud.sdk.v2.model.WorkitemQueryJobFilter;
import com.mypurecloud.sdk.v2.model.WorkitemQueryJobSort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkitemQueryJobCreate
 */

public class WorkitemQueryJobCreate  implements Serializable {
  
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private List<WorkitemQueryJobFilter> filters = new ArrayList<WorkitemQueryJobFilter>();

  private static class ExpandsEnumDeserializer extends StdDeserializer<ExpandsEnum> {
    public ExpandsEnumDeserializer() {
      super(ExpandsEnumDeserializer.class);
    }

    @Override
    public ExpandsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExpandsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets expands
   */
 @JsonDeserialize(using = ExpandsEnumDeserializer.class)
  public enum ExpandsEnum {
    TYPE("type"),
    WORKBIN("workbin"),
    STATUS("status"),
    ASSIGNEE("assignee"),
    REPORTER("reporter"),
    QUEUE("queue");

    private String value;

    ExpandsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExpandsEnum fromString(String key) {
      if (key == null) return null;

      for (ExpandsEnum value : ExpandsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExpandsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ExpandsEnum> expands = new ArrayList<ExpandsEnum>();
  private List<String> attributes = new ArrayList<String>();
  private WorkitemQueryJobSort sort = null;

  
  /**
   * The total page size requested. Default 25
   * minimum: 1
   * maximum: 200
   **/
  public WorkitemQueryJobCreate pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total page size requested. Default 25")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * The page number requested
   * minimum: 1
   **/
  public WorkitemQueryJobCreate pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The page number requested")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * List of filter objects to be used in the search.
   **/
  public WorkitemQueryJobCreate filters(List<WorkitemQueryJobFilter> filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of filter objects to be used in the search.")
  @JsonProperty("filters")
  public List<WorkitemQueryJobFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<WorkitemQueryJobFilter> filters) {
    this.filters = filters;
  }


  /**
   * List of entity attributes to be expanded in the result.
   **/
  public WorkitemQueryJobCreate expands(List<ExpandsEnum> expands) {
    this.expands = expands;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of entity attributes to be expanded in the result.")
  @JsonProperty("expands")
  public List<ExpandsEnum> getExpands() {
    return expands;
  }
  public void setExpands(List<ExpandsEnum> expands) {
    this.expands = expands;
  }


  /**
   * List of entity attributes to be retrieved in the result.
   **/
  public WorkitemQueryJobCreate attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of entity attributes to be retrieved in the result.")
  @JsonProperty("attributes")
  public List<String> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }


  /**
   * Sort
   **/
  public WorkitemQueryJobCreate sort(WorkitemQueryJobSort sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sort")
  @JsonProperty("sort")
  public WorkitemQueryJobSort getSort() {
    return sort;
  }
  public void setSort(WorkitemQueryJobSort sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemQueryJobCreate workitemQueryJobCreate = (WorkitemQueryJobCreate) o;

    return Objects.equals(this.pageSize, workitemQueryJobCreate.pageSize) &&
            Objects.equals(this.pageNumber, workitemQueryJobCreate.pageNumber) &&
            Objects.equals(this.filters, workitemQueryJobCreate.filters) &&
            Objects.equals(this.expands, workitemQueryJobCreate.expands) &&
            Objects.equals(this.attributes, workitemQueryJobCreate.attributes) &&
            Objects.equals(this.sort, workitemQueryJobCreate.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, filters, expands, attributes, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemQueryJobCreate {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    expands: ").append(toIndentedString(expands)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

